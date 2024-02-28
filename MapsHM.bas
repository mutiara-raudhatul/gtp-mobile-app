B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim nameHM As String
	Dim isFiltered As Boolean = False
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelHM As Panel
	Private WebViewHM As WebView
	Private BtnBack As Button
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnUserLoc As Button
	Private btnObj As Button
	Private btnList As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not foHMet to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Starter.mapStatus = "HM"
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsHM")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewHM.Height = MainScroll.Height
	PanelHM.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	MyWebViewExtras.addWebChromeClient(WebViewHM, "WebViewHM")
	WebViewHM.JavaScriptEnabled = True
	WebViewHM.LoadUrl(Main.server&"api/homestay/maps")
	
	btnObj.Visible = False
	btnUserLoc.Visible = False
	btnList.Visible = False
End Sub

Sub Activity_Resume
	Log("MapsHM Loaded")
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent)
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			CallSubDelayed(Starter, "StartGPS")
		Else
			ToastMessageShow("Please allow GPS to run this application", True)
			Activity.Finish
		End If
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub

Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Starter.mapStatus = ""
	Activity.Finish
End Sub

Public Sub UpdateLocation
	Log("Update user position on Maps Rumah Gadang")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim userPosition As String
	userPosition = "userPositionAPI("&Starter.lat&", "&Starter.lng&")"
	MyWebViewExtras.executeJavascript(WebViewHM, userPosition)
End Sub

Sub WebViewHM_ProgressChanged(loading As Int)
	If loading == 100 Then
		Log("Webview loaded")
		Starter.webviewLoading = loading
		btnObj.Visible = True
		btnUserLoc.Visible = True
		btnList.Visible = True
		UpdateLocation
	Else
		Log("Webview loading at "&loading&"% ....")
	End If
End Sub

Private Sub btnUserLoc_Click
	Log("Panning to user location")
	UpdateLocation
	Dim panToUser As String = "panToUser()"
	MyWebViewExtras.executeJavascript(WebViewHM, panToUser)
End Sub

Private Sub btnObj_Click
	Log("Pan to Homestay")
	Dim boundToObject As String
	If isFiltered Then
		boundToObject = "findHM('')"
		isFiltered = False
	Else
		boundToObject = "boundToObject(false)"
	End If
	MyWebViewExtras.executeJavascript(WebViewHM, boundToObject)
End Sub

Private Sub WebViewHM_PageFinished (Url As String)
	
End Sub

Private Sub btnList_Click
	Log("Redirect to ListHM activity")
	StartActivity(ListHM)
End Sub
