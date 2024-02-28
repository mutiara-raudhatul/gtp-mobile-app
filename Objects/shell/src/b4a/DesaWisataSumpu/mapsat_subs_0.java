package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 36;BA.debugLine="Starter.mapStatus = \"AT\"";
Debug.ShouldStop(8);
mapsat.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("AT");
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16);
mapsat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsat.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsAT\")";
Debug.ShouldStop(32);
mapsat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsAT")),mapsat.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(64);
mapsat.mostCurrent._navbar.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",mapsat.mostCurrent._navbar.runMethod(true,"getVisible"),mapsat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(256);
mapsat.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsat.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsat.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(512);
mapsat.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsat.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 44;BA.debugLine="WebViewAT.Height = MainScroll.Height";
Debug.ShouldStop(2048);
mapsat.mostCurrent._webviewat.runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="PanelAT.Height = MainScroll.Height";
Debug.ShouldStop(4096);
mapsat.mostCurrent._panelat.runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 46;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(8192);
mapsat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 48;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewAT, \"We";
Debug.ShouldStop(32768);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsat.mostCurrent.activityBA,(Object)((mapsat.mostCurrent._webviewat.getObject())),(Object)(RemoteObject.createImmutable("WebViewAT")));
 BA.debugLineNum = 49;BA.debugLine="WebViewAT.JavaScriptEnabled = True";
Debug.ShouldStop(65536);
mapsat.mostCurrent._webviewat.runMethod(true,"setJavaScriptEnabled",mapsat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="WebViewAT.LoadUrl(Main.server&\"api/attraction/map";
Debug.ShouldStop(131072);
mapsat.mostCurrent._webviewat.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsat.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("api/attraction/maps"))));
 BA.debugLineNum = 52;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(524288);
mapsat.mostCurrent._btnobj.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(1048576);
mapsat.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 54;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(2097152);
mapsat.mostCurrent._btnlist.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"ATent/category\", \"Lo";
Debug.ShouldStop(8388608);
mapsat.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,mapsat.mostCurrent.activityBA,(Object)(RemoteObject.concat(mapsat.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("ATent/category"))),(Object)(BA.ObjectToString("LoadCategory")),(Object)(mapsat.getObject()));
 BA.debugLineNum = 57;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(16777216);
mapsat.mostCurrent._dialog.runClassMethod (b4a.DesaWisataSumpu.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mapsat.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mapsat.mostCurrent._activity.getObject()));
 BA.debugLineNum = 58;BA.debugLine="Dialog.Title = \"Select Date...\"";
Debug.ShouldStop(33554432);
mapsat.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Select Date...")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,78);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(16384);
mapsat.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsat.processBA,(Object)((mapsat.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsat parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsat parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 62;BA.debugLine="Log(\"MapsAT Loaded\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","02752513",RemoteObject.createImmutable("MapsAT Loaded"),0);
 BA.debugLineNum = 63;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 64;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 65;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsat.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 67;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(4);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsat.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 68;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsat.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsat", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 69;BA.debugLine="If Result Then'";
Debug.ShouldStop(16);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 72;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 73;BA.debugLine="Activity.Finish'";
Debug.ShouldStop(256);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,82);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","btnback_click");}
 BA.debugLineNum = 82;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(262144);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","02883585",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 84;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(524288);
mapsat.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 85;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
mapsat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,134);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","btnlist_click");}
 BA.debugLineNum = 134;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Log(\"Redirect to ListAT activity\")";
Debug.ShouldStop(64);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","03276801",RemoteObject.createImmutable("Redirect to ListAT activity"),0);
 BA.debugLineNum = 136;BA.debugLine="StartActivity(ListAT)";
Debug.ShouldStop(128);
mapsat.mostCurrent.__c.runVoidMethod ("StartActivity",mapsat.processBA,(Object)((mapsat.mostCurrent._listat.getObject())));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnobj_click() throws Exception{
try {
		Debug.PushSubsStack("btnObj_Click (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,116);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 116;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Log(\"Pan to ATent\")";
Debug.ShouldStop(1048576);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","03145729",RemoteObject.createImmutable("Pan to ATent"),0);
 BA.debugLineNum = 118;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(2097152);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 119;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(4194304);
if (mapsat._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="boundToObject = \"findAT('')\"";
Debug.ShouldStop(8388608);
_boundtoobject = BA.ObjectToString("findAT('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 121;BA.debugLine="isFiltered = False";
Debug.ShouldStop(16777216);
mapsat._isfiltered = mapsat.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 123;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(67108864);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 125;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewAT, boun";
Debug.ShouldStop(268435456);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewat.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuserloc_click() throws Exception{
try {
		Debug.PushSubsStack("btnUserLoc_Click (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,109);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 109;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(8192);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","03080193",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 111;BA.debugLine="UpdateLocation";
Debug.ShouldStop(16384);
_updatelocation();
 BA.debugLineNum = 112;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(32768);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 113;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewAT, panT";
Debug.ShouldStop(65536);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewat.getObject())),(Object)(_pantouser));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsat.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 20;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapsat.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelAT As Panel";
mapsat.mostCurrent._panelat = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private WebViewAT As WebView";
mapsat.mostCurrent._webviewat = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnBack As Button";
mapsat.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Navbar As Panel";
mapsat.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
mapsat.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnUserLoc As Button";
mapsat.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnObj As Button";
mapsat.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnList As Button";
mapsat.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Dialog As B4XDialog";
mapsat.mostCurrent._dialog = RemoteObject.createNew ("b4a.DesaWisataSumpu.b4xdialog");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameAT As String";
mapsat._nameat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim categoryMap As Map";
mapsat._categorymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
mapsat._isfiltered = mapsat.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 12;BA.debugLine="Private XUI As XUI";
mapsat._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,88);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 88;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Update user position on Maps Event\")";
Debug.ShouldStop(16777216);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","02949121",RemoteObject.createImmutable("Update user position on Maps Event"),0);
 BA.debugLineNum = 90;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(33554432);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","02949122",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsat.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsat.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 91;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(67108864);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 92;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(134217728);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapsat.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapsat.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 93;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewAT, user";
Debug.ShouldStop(268435456);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewat.getObject())),(Object)(_userposition));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewat_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewAT_PageFinished (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,130);
if (RapidSub.canDelegate("webviewat_pagefinished")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","webviewat_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 130;BA.debugLine="Private Sub WebViewAT_PageFinished (Url As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewat_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewAT_ProgressChanged (mapsat) ","mapsat",4,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,96);
if (RapidSub.canDelegate("webviewat_progresschanged")) { return b4a.DesaWisataSumpu.mapsat.remoteMe.runUserSub(false, "mapsat","webviewat_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 96;BA.debugLine="Sub WebViewAT_ProgressChanged(loading As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 98;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(2);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","03014658",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 99;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(4);
mapsat.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 100;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(8);
mapsat.mostCurrent._btnobj.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(16);
mapsat.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(32);
mapsat.mostCurrent._btnlist.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="UpdateLocation";
Debug.ShouldStop(64);
_updatelocation();
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(256);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","03014665",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}