package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homevisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(256);
homevisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homevisitor.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeVisitor\")";
Debug.ShouldStop(512);
homevisitor.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeVisitor")),homevisitor.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="PanelHome.Height = MainScroll.Height";
Debug.ShouldStop(1024);
homevisitor.mostCurrent._panelhome.runMethod(true,"setHeight",homevisitor.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(2048);
homevisitor.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",homevisitor.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="TitleNavbar.Text=\"Home Visitor\"";
Debug.ShouldStop(4096);
homevisitor.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Home Visitor"));
 BA.debugLineNum = 46;BA.debugLine="BtnBack.Visible = False";
Debug.ShouldStop(8192);
homevisitor.mostCurrent._btnback.runMethod(true,"setVisible",homevisitor.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,57);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Log(\"HomeVisitor loaded\")";
Debug.ShouldStop(262144);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","01376257",RemoteObject.createImmutable("HomeVisitor loaded"),0);
 BA.debugLineNum = 52;BA.debugLine="LabelName.Text = \"Hello, Visitor\"";
Debug.ShouldStop(524288);
homevisitor.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence("Hello, Visitor"));
 BA.debugLineNum = 53;BA.debugLine="LabelUsername.Text = \"\"";
Debug.ShouldStop(1048576);
homevisitor.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnev_click() throws Exception{
try {
		Debug.PushSubsStack("BtnEV_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,83);
if (RapidSub.canDelegate("btnev_click")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnev_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub BtnEV_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Log(\"Redirect to MapsAT Activity\")";
Debug.ShouldStop(524288);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","01703937",RemoteObject.createImmutable("Redirect to MapsAT Activity"),0);
 BA.debugLineNum = 85;BA.debugLine="StartActivity(MapsAT)";
Debug.ShouldStop(1048576);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._mapsat.getObject())));
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
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,73);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnlogin_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Redirect to Main Activity\")";
Debug.ShouldStop(512);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","01638401",RemoteObject.createImmutable("Redirect to Main Activity"),0);
 BA.debugLineNum = 76;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(2048);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 77;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(4096);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 78;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(8192);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
homevisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 80;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(32768);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._main.getObject())));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpk_click() throws Exception{
try {
		Debug.PushSubsStack("BtnPK_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,68);
if (RapidSub.canDelegate("btnpk_click")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnpk_click");}
 BA.debugLineNum = 68;BA.debugLine="Private Sub BtnPK_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Log(\"Redirect to ListPK Activity\")";
Debug.ShouldStop(16);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","01572865",RemoteObject.createImmutable("Redirect to ListPK Activity"),0);
 BA.debugLineNum = 70;BA.debugLine="StartActivity(ListPK)";
Debug.ShouldStop(32);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._listpk.getObject())));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRG_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,62);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.DesaWisataSumpu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnrg_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
Debug.ShouldStop(1073741824);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","01507329",RemoteObject.createImmutable("Redirect to MapsRG Activity"),0);
 BA.debugLineNum = 64;BA.debugLine="StartActivity(MapsHM)";
Debug.ShouldStop(-2147483648);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._mapshm.getObject())));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 16;BA.debugLine="Private LabelHeader As Label";
homevisitor.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LabelName As Label";
homevisitor.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelUsername As Label";
homevisitor.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelBanner As Panel";
homevisitor.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelHome As Panel";
homevisitor.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelMenu As Panel";
homevisitor.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelProfile As Panel";
homevisitor.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ProfileAvatar As ImageView";
homevisitor.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnBack As Button";
homevisitor.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
homevisitor.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Navbar As Panel";
homevisitor.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TitleNavbar As Label";
homevisitor.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BtnEV As Button";
homevisitor.mostCurrent._btnev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnLogin As Button";
homevisitor.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnRG As Button";
homevisitor.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnPK As Button";
homevisitor.mostCurrent._btnpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LabelEV As Label";
homevisitor.mostCurrent._labelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelLogin As Label";
homevisitor.mostCurrent._labellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LabelRG As Label";
homevisitor.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelPK As Label";
homevisitor.mostCurrent._labelpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}