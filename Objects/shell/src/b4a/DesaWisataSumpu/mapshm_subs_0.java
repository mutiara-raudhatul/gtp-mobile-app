package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapshm_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 33;BA.debugLine="Starter.mapStatus = \"HM\"";
Debug.ShouldStop(1);
mapshm.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("HM");
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2);
mapshm.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapshm.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsHM\")";
Debug.ShouldStop(4);
mapshm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsHM")),mapshm.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(8);
mapshm.mostCurrent._navbar.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",mapshm.mostCurrent._navbar.runMethod(true,"getVisible"),mapshm.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(32);
mapshm.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapshm.mostCurrent._mainscroll.runMethod(true,"getTop"),mapshm.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 39;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(64);
mapshm.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapshm.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapshm.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 41;BA.debugLine="WebViewHM.Height = MainScroll.Height";
Debug.ShouldStop(256);
mapshm.mostCurrent._webviewhm.runMethod(true,"setHeight",mapshm.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 42;BA.debugLine="PanelHM.Height = MainScroll.Height";
Debug.ShouldStop(512);
mapshm.mostCurrent._panelhm.runMethod(true,"setHeight",mapshm.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(1024);
mapshm.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapshm.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewHM, \"We";
Debug.ShouldStop(4096);
mapshm.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapshm.mostCurrent.activityBA,(Object)((mapshm.mostCurrent._webviewhm.getObject())),(Object)(RemoteObject.createImmutable("WebViewHM")));
 BA.debugLineNum = 46;BA.debugLine="WebViewHM.JavaScriptEnabled = True";
Debug.ShouldStop(8192);
mapshm.mostCurrent._webviewhm.runMethod(true,"setJavaScriptEnabled",mapshm.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="WebViewHM.LoadUrl(Main.server&\"api/homestay/maps\"";
Debug.ShouldStop(16384);
mapshm.mostCurrent._webviewhm.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapshm.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("api/homestay/maps"))));
 BA.debugLineNum = 49;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(65536);
mapshm.mostCurrent._btnobj.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(131072);
mapshm.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(262144);
mapshm.mostCurrent._btnlist.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Pause (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,71);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(128);
mapshm.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapshm.processBA,(Object)((mapshm.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,54);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","activity_resume"); return;}
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
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapshm parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapshm parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 55;BA.debugLine="Log(\"MapsHM Loaded\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","01966081",RemoteObject.createImmutable("MapsHM Loaded"),0);
 BA.debugLineNum = 56;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 57;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 58;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapshm.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapshm.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 61;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapshm.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapshm", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 62;BA.debugLine="If Result Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 63;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapshm.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this application")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 66;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("BtnBack_Click (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,75);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","btnback_click");}
 BA.debugLineNum = 75;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(2048);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02097153",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 77;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(4096);
mapshm.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
mapshm.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnList_Click (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,125);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","btnlist_click");}
 BA.debugLineNum = 125;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Log(\"Redirect to ListHM activity\")";
Debug.ShouldStop(536870912);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02490369",RemoteObject.createImmutable("Redirect to ListHM activity"),0);
 BA.debugLineNum = 127;BA.debugLine="StartActivity(ListHM)";
Debug.ShouldStop(1073741824);
mapshm.mostCurrent.__c.runVoidMethod ("StartActivity",mapshm.processBA,(Object)((mapshm.mostCurrent._listhm.getObject())));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnObj_Click (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,109);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 109;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Pan to Homestay\")";
Debug.ShouldStop(8192);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02359297",RemoteObject.createImmutable("Pan to Homestay"),0);
 BA.debugLineNum = 111;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(16384);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 112;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(32768);
if (mapshm._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="boundToObject = \"findHM('')\"";
Debug.ShouldStop(65536);
_boundtoobject = BA.ObjectToString("findHM('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 114;BA.debugLine="isFiltered = False";
Debug.ShouldStop(131072);
mapshm._isfiltered = mapshm.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 116;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(524288);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 118;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewHM, boun";
Debug.ShouldStop(2097152);
mapshm.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapshm.mostCurrent._webviewhm.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnUserLoc_Click (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,102);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 102;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(64);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02293761",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 104;BA.debugLine="UpdateLocation";
Debug.ShouldStop(128);
_updatelocation();
 BA.debugLineNum = 105;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(256);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 106;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewHM, panT";
Debug.ShouldStop(512);
mapshm.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapshm.mostCurrent._webviewhm.getObject())),(Object)(_pantouser));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapshm.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapshm.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelHM As Panel";
mapshm.mostCurrent._panelhm = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private WebViewHM As WebView";
mapshm.mostCurrent._webviewhm = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BtnBack As Button";
mapshm.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Navbar As Panel";
mapshm.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private MainScroll As ScrollView";
mapshm.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnUserLoc As Button";
mapshm.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnObj As Button";
mapshm.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnList As Button";
mapshm.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameHM As String";
mapshm._namehm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim isFiltered As Boolean = False";
mapshm._isfiltered = mapshm.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,81);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 81;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Log(\"Update user position on Maps Rumah Gadang\")";
Debug.ShouldStop(131072);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02162689",RemoteObject.createImmutable("Update user position on Maps Rumah Gadang"),0);
 BA.debugLineNum = 83;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(262144);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02162690",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapshm.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapshm.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 84;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(524288);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 85;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(1048576);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapshm.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapshm.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 86;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewHM, user";
Debug.ShouldStop(2097152);
mapshm.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapshm.mostCurrent._webviewhm.getObject())),(Object)(_userposition));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewhm_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewHM_PageFinished (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,121);
if (RapidSub.canDelegate("webviewhm_pagefinished")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","webviewhm_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 121;BA.debugLine="Private Sub WebViewHM_PageFinished (Url As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewhm_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewHM_ProgressChanged (mapshm) ","mapshm",3,mapshm.mostCurrent.activityBA,mapshm.mostCurrent,89);
if (RapidSub.canDelegate("webviewhm_progresschanged")) { return b4a.DesaWisataSumpu.mapshm.remoteMe.runUserSub(false, "mapshm","webviewhm_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 89;BA.debugLine="Sub WebViewHM_ProgressChanged(loading As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 91;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(67108864);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02228226",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 92;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(134217728);
mapshm.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 93;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(268435456);
mapshm.mostCurrent._btnobj.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(536870912);
mapshm.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(1073741824);
mapshm.mostCurrent._btnlist.runMethod(true,"setVisible",mapshm.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="UpdateLocation";
Debug.ShouldStop(-2147483648);
_updatelocation();
 }else {
 BA.debugLineNum = 98;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(2);
mapshm.mostCurrent.__c.runVoidMethod ("LogImpl","02228233",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}