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
	Dim nameAT As String
	Dim categoryMap As Map
	Dim isFiltered As Boolean = False
	Private XUI As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelAT As Panel
	Private WebViewAT As WebView
	Private BtnBack As Button
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnUserLoc As Button
	Private btnObj As Button
	Private btnList As Button
	Private Dialog As B4XDialog
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not foATet to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Starter.mapStatus = "AT"
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsAT")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewAT.Height = MainScroll.Height
	PanelAT.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	MyWebViewExtras.addWebChromeClient(WebViewAT, "WebViewAT")
	WebViewAT.JavaScriptEnabled = True
	WebViewAT.LoadUrl(Main.server&"api/attraction/maps")
	
	btnObj.Visible = False
	btnUserLoc.Visible = False
	btnList.Visible = False

	Core.ExecuteUrlGet(Main.API&"ATent/category", "LoadCategory", Me)
	Dialog.Initialize (Activity)
	Dialog.Title = "Select Date..."
End Sub

Sub Activity_Resume
	Log("MapsAT Loaded")
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent)
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)'
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)'
		If Result Then'
			'CallSubDelayed(Starter, "StartGPS")'
		Else
			ToastMessageShow("Please allow GPS to run this appliation", True)'
			Activity.Finish'
		End If'
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
	Log("Update user position on Maps Event")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim userPosition As String
	userPosition = "userPositionAPI("&Starter.lat&", "&Starter.lng&")"
	MyWebViewExtras.executeJavascript(WebViewAT, userPosition)
End Sub

Sub WebViewAT_ProgressChanged(loading As Int)
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
	MyWebViewExtras.executeJavascript(WebViewAT, panToUser)
End Sub

Private Sub btnObj_Click
	Log("Pan to ATent")
	Dim boundToObject As String
	If isFiltered Then
		boundToObject = "findAT('')"
		isFiltered = False
	Else
		boundToObject = "boundToObject(false)"
	End If
	MyWebViewExtras.executeJavascript(WebViewAT, boundToObject)
End Sub



Private Sub WebViewAT_PageFinished (Url As String)
	
End Sub

Private Sub btnList_Click
	Log("Redirect to ListAT activity")
	StartActivity(ListAT)
End Sub
