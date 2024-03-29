﻿B4A=true
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

	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelMaps As Panel
	Private WebViewMaps As WebView
	Private MainScroll As ScrollView
	Private TitleNavbar As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Log("MapsVisitor loaded")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsVisitor")
	
	WebViewMaps.Height = MainScroll.Height
	PanelMaps.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text="Maps Visitor"
	
	WebViewMaps.JavaScriptEnabled = True
	WebViewMaps.LoadUrl(Main.server&"web")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
