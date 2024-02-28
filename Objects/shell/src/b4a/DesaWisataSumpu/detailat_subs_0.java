package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (detailat) ","detailat",5,detailat.mostCurrent.activityBA,detailat.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.detailat.remoteMe.runUserSub(false, "detailat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(67108864);
detailat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),detailat.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="MainScroll.Panel.LoadLayout(\"Detail\")";
Debug.ShouldStop(134217728);
detailat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Detail")),detailat.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="wvDetail.Height = MainScroll.Height";
Debug.ShouldStop(268435456);
detailat.mostCurrent._wvdetail.runMethod(true,"setHeight",detailat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(536870912);
detailat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",detailat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 31;BA.debugLine="TitleNavbar.Text = Starter.selectedObj.Get(\"name\"";
Debug.ShouldStop(1073741824);
detailat.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(detailat.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 33;BA.debugLine="MyWebViewExtras.addWebChromeClient(wvDetail, \"wvD";
Debug.ShouldStop(1);
detailat.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",detailat.mostCurrent.activityBA,(Object)((detailat.mostCurrent._wvdetail.getObject())),(Object)(RemoteObject.createImmutable("wvDetail")));
 BA.debugLineNum = 34;BA.debugLine="wvDetail.JavaScriptEnabled = True";
Debug.ShouldStop(2);
detailat.mostCurrent._wvdetail.runMethod(true,"setJavaScriptEnabled",detailat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="wvDetail.LoadUrl(Main.server&\"api/attraction/deta";
Debug.ShouldStop(4);
detailat.mostCurrent._wvdetail.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(detailat.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("api/attraction/detail/"),detailat.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (detailat) ","detailat",5,detailat.mostCurrent.activityBA,detailat.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.detailat.remoteMe.runUserSub(false, "detailat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (detailat) ","detailat",5,detailat.mostCurrent.activityBA,detailat.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.detailat.remoteMe.runUserSub(false, "detailat","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"DetailAT loaded\")";
Debug.ShouldStop(64);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","035651585",RemoteObject.createImmutable("DetailAT loaded"),0);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (detailat) ","detailat",5,detailat.mostCurrent.activityBA,detailat.mostCurrent,47);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.detailat.remoteMe.runUserSub(false, "detailat","btnback_click");}
 BA.debugLineNum = 47;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(32768);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","035782657",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 49;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
detailat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailat.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
detailat.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
detailat.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
detailat.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Navbar As Panel";
detailat.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleNavbar As Label";
detailat.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private wvDetail As WebView";
detailat.mostCurrent._wvdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}