package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listrg_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(64);
listrg.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),listrg.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(128);
listrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),listrg.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="PanelList.Height = MainScroll.Height";
Debug.ShouldStop(256);
listrg.mostCurrent._panellist.runMethod(true,"setHeight",listrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(512);
listrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",listrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 43;BA.debugLine="TitleNavbar.Text = \"List Homestay\"";
Debug.ShouldStop(1024);
listrg.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("List Homestay"));
 BA.debugLineNum = 44;BA.debugLine="btnRefresh.Visible = False";
Debug.ShouldStop(2048);
listrg.mostCurrent._btnrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="loadRefresh.Visible = True";
Debug.ShouldStop(4096);
listrg.mostCurrent._loadrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="imgMap.Initialize";
Debug.ShouldStop(16384);
listrg.mostCurrent._imgmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="MediaManager.Initialize";
Debug.ShouldStop(32768);
listrg.mostCurrent._mediamanager.runClassMethod (b4a.DesaWisataSumpu.simplemediamanager.class, "_initialize" /*RemoteObject*/ ,listrg.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="CLV.Clear";
Debug.ShouldStop(65536);
listrg.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 50;BA.debugLine="imgMap.Clear";
Debug.ShouldStop(131072);
listrg.mostCurrent._imgmap.runVoidMethod ("Clear");
 BA.debugLineNum = 51;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"homestay\", \"LoadRG\",";
Debug.ShouldStop(262144);
listrg.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,listrg.mostCurrent.activityBA,(Object)(RemoteObject.concat(listrg.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("homestay"))),(Object)(BA.ObjectToString("LoadRG")),(Object)(listrg.getObject()));
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
		Debug.PushSubsStack("Activity_Pause (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,54);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","activity_resume");}
RemoteObject _extra = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"ListRG loaded\")";
Debug.ShouldStop(4194304);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040370177",RemoteObject.createImmutable("ListRG loaded"),0);
 BA.debugLineNum = 56;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.REQUEST";
Debug.ShouldStop(8388608);
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extra = listrg.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(listrg.mostCurrent._mediamanager.getField(true,"_request_resize_mode" /*RemoteObject*/ )),(RemoteObject.createImmutable("FILL_NO_DISTORTIONS"))}));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 57;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
Debug.ShouldStop(16777216);
_downloadimg(listrg.mostCurrent._imgmap,listrg._isdownloadready,_extra);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BtnBack_Click (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,64);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","btnback_click");}
 BA.debugLineNum = 64;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(1);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040501249",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 66;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
listrg.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnRefresh_Click (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,128);
if (RapidSub.canDelegate("btnrefresh_click")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","btnrefresh_click");}
 BA.debugLineNum = 128;BA.debugLine="Private Sub btnRefresh_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Log(\"Refreshing ListRG...\")";
Debug.ShouldStop(1);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040763393",RemoteObject.createImmutable("Refreshing ListRG..."),0);
 BA.debugLineNum = 130;BA.debugLine="btnRefresh.Visible = False";
Debug.ShouldStop(2);
listrg.mostCurrent._btnrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="loadRefresh.Visible = True";
Debug.ShouldStop(4);
listrg.mostCurrent._loadrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"homestay\", \"LoadRG\",";
Debug.ShouldStop(8);
listrg.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,listrg.mostCurrent.activityBA,(Object)(RemoteObject.concat(listrg.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("homestay"))),(Object)(BA.ObjectToString("LoadRG")),(Object)(listrg.getObject()));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,69);
if (RapidSub.canDelegate("clv_itemclick")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","clv_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 69;BA.debugLine="Private Sub CLV_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16);
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
public static RemoteObject  _createitem(RemoteObject _id,RemoteObject _name,RemoteObject _address,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,73);
if (RapidSub.canDelegate("createitem")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","createitem", _id, _name, _address, _img);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imgpath = RemoteObject.createImmutable("");
Debug.locals.put("id", _id);
Debug.locals.put("name", _name);
Debug.locals.put("address", _address);
Debug.locals.put("img", _img);
 BA.debugLineNum = 73;BA.debugLine="Private Sub CreateItem (id As String, name As Stri";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = listrg._xui.runMethod(false,"CreatePanel",listrg.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 75;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x, 160dip)";
Debug.ShouldStop(1024);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listrg.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),listrg.mostCurrent.activityBA)),(Object)(listrg.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))));
 BA.debugLineNum = 76;BA.debugLine="p.LoadLayout(\"ItemRG\")";
Debug.ShouldStop(2048);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ItemRG")),listrg.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="idRG.Text = id";
Debug.ShouldStop(8192);
listrg.mostCurrent._idrg.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 79;BA.debugLine="nameRG.Text = name";
Debug.ShouldStop(16384);
listrg.mostCurrent._namerg.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 80;BA.debugLine="addressRG.Text = address";
Debug.ShouldStop(32768);
listrg.mostCurrent._addressrg.runMethod(true,"setText",BA.ObjectToCharSequence(_address));
 BA.debugLineNum = 82;BA.debugLine="Dim imgPath As String = Main.server & \"media/phot";
Debug.ShouldStop(131072);
_imgpath = RemoteObject.concat(listrg.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("media/photos/homestay"),_img);Debug.locals.put("imgPath", _imgpath);Debug.locals.put("imgPath", _imgpath);
 BA.debugLineNum = 83;BA.debugLine="imgMap.Put(ivRG, imgPath)";
Debug.ShouldStop(262144);
listrg.mostCurrent._imgmap.runVoidMethod ("Put",(Object)((listrg.mostCurrent._ivrg.getObject())),(Object)((_imgpath)));
 BA.debugLineNum = 84;BA.debugLine="Return p";
Debug.ShouldStop(524288);
if (true) return _p;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimg(RemoteObject _imagemap,RemoteObject _readytodownload,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("DownloadImg (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,135);
if (RapidSub.canDelegate("downloadimg")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","downloadimg", _imagemap, _readytodownload, _extra);}
int _i = 0;
Debug.locals.put("ImageMap", _imagemap);
Debug.locals.put("readyToDownload", _readytodownload);
Debug.locals.put("extra", _extra);
 BA.debugLineNum = 135;BA.debugLine="Sub DownloadImg (ImageMap As Map, readyToDownload";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="If readyToDownload Then";
Debug.ShouldStop(128);
if (_readytodownload.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 137;BA.debugLine="If extra.Size > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_extra.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 138;BA.debugLine="For i = 0 To ImageMap.Size - 1";
Debug.ShouldStop(512);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_imagemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Log(\"Getting \"&ImageMap.GetValueAt(i)&\"@\"&Imag";
Debug.ShouldStop(1024);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040828932",RemoteObject.concat(RemoteObject.createImmutable("Getting "),_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("@"),_imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 140;BA.debugLine="MediaManager.SetMediaWithExtra(ImageMap.GetKey";
Debug.ShouldStop(2048);
listrg.mostCurrent._mediamanager.runClassMethod (b4a.DesaWisataSumpu.simplemediamanager.class, "_setmediawithextra" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(BA.ObjectToString(_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.ObjectToString("")),(Object)(_extra));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
listrg.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
listrg.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private TitleNavbar As Label";
listrg.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Navbar As Panel";
listrg.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnRefresh As Button";
listrg.mostCurrent._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private loadRefresh As ProgressBar";
listrg.mostCurrent._loadrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private CLV As CustomListView";
listrg.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelList As Panel";
listrg.mostCurrent._panellist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As Panel";
listrg.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private idRG As Label";
listrg.mostCurrent._idrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private nameRG As Label";
listrg.mostCurrent._namerg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private addressRG As Label";
listrg.mostCurrent._addressrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ivRG As B4XView";
listrg.mostCurrent._ivrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private imgMap As Map";
listrg.mostCurrent._imgmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 33;BA.debugLine="Private MediaManager As SimpleMediaManager";
listrg.mostCurrent._mediamanager = RemoteObject.createNew ("b4a.DesaWisataSumpu.simplemediamanager");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,87);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _rg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extra = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 87;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(8388608);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040697857",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 89;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16777216);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="Dim res As String";
Debug.ShouldStop(33554432);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 91;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(67108864);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 92;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 93;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 96;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadRG"))) {
case 0: {
 BA.debugLineNum = 98;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 99;BA.debugLine="Dim map As Map";
Debug.ShouldStop(4);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 100;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(8);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 101;BA.debugLine="Dim data As List";
Debug.ShouldStop(16);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 102;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(32);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 103;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="CLV.Clear";
Debug.ShouldStop(128);
listrg.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 105;BA.debugLine="imgMap.Clear";
Debug.ShouldStop(256);
listrg.mostCurrent._imgmap.runVoidMethod ("Clear");
 BA.debugLineNum = 106;BA.debugLine="For i = 0 To data.Size-1";
Debug.ShouldStop(512);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 107;BA.debugLine="Dim rg As Map";
Debug.ShouldStop(1024);
_rg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rg", _rg);
 BA.debugLineNum = 108;BA.debugLine="rg = data.Get(i)";
Debug.ShouldStop(2048);
_rg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("rg", _rg);
 BA.debugLineNum = 109;BA.debugLine="CLV.Add(CreateItem(rg.Get(\"id\"), rg.Get(\"na";
Debug.ShouldStop(4096);
listrg.mostCurrent._clv.runVoidMethod ("_add",(Object)(_createitem(BA.ObjectToString(_rg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_rg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),BA.ObjectToString(_rg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))),BA.ObjectToString(_rg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery"))))))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 110;BA.debugLine="CLV.AsView.Height = PanelListItem.Height *";
Debug.ShouldStop(8192);
listrg.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {listrg.mostCurrent._panellistitem.runMethod(true,"getHeight"),listrg.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 112;BA.debugLine="isDownloadReady = True";
Debug.ShouldStop(32768);
listrg._isdownloadready = listrg.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 113;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.RE";
Debug.ShouldStop(65536);
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extra = listrg.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(listrg.mostCurrent._mediamanager.getField(true,"_request_resize_mode" /*RemoteObject*/ )),(RemoteObject.createImmutable("FILL_NO_DISTORTIONS"))}));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 114;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
Debug.ShouldStop(131072);
_downloadimg(listrg.mostCurrent._imgmap,listrg._isdownloadready,_extra);
 BA.debugLineNum = 115;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(262144);
listrg.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",listrg.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 116;BA.debugLine="PanelList.Height = CLV.AsView.Height";
Debug.ShouldStop(524288);
listrg.mostCurrent._panellist.runMethod(true,"setHeight",listrg.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 117;BA.debugLine="MainScroll.Panel.Height = CLV.AsView.Height";
Debug.ShouldStop(1048576);
listrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",listrg.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 119;BA.debugLine="btnRefresh.Visible = True";
Debug.ShouldStop(4194304);
listrg.mostCurrent._btnrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="loadRefresh.Visible = False";
Debug.ShouldStop(8388608);
listrg.mostCurrent._loadrefresh.runMethod(true,"setVisible",listrg.mostCurrent.__c.getField(true,"False"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",listrg.processBA, e33.toString()); BA.debugLineNum = 122;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040697891",BA.ObjectToString(listrg.mostCurrent.__c.runMethod(false,"LastException",listrg.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (listrg) ","listrg",14,listrg.mostCurrent.activityBA,listrg.mostCurrent,146);
if (RapidSub.canDelegate("panellistitem_click")) { return b4a.DesaWisataSumpu.listrg.remoteMe.runUserSub(false, "listrg","panellistitem_click");}
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 146;BA.debugLine="Private Sub PanelListItem_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(262144);
_item = listrg.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), listrg.mostCurrent.__c.runMethod(false,"Sender",listrg.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 148;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 149;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(1048576);
_p = listrg.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 151;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 152;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(8388608);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 153;BA.debugLine="Starter.selectedObj.Initialize";
Debug.ShouldStop(16777216);
listrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="Starter.selectedObj.Put(\"id\", a.GetView(0).GetVie";
Debug.ShouldStop(33554432);
listrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"))));
 BA.debugLineNum = 155;BA.debugLine="Starter.selectedObj.Put(\"name\", a.GetView(0).GetV";
Debug.ShouldStop(67108864);
listrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"))));
 BA.debugLineNum = 157;BA.debugLine="Log(\"Redirect to DetailRG Activity\")";
Debug.ShouldStop(268435456);
listrg.mostCurrent.__c.runVoidMethod ("LogImpl","040894475",RemoteObject.createImmutable("Redirect to DetailRG Activity"),0);
 BA.debugLineNum = 158;BA.debugLine="StartActivity(DetailRG)";
Debug.ShouldStop(536870912);
listrg.mostCurrent.__c.runVoidMethod ("StartActivity",listrg.processBA,(Object)((listrg.mostCurrent._detailrg.getObject())));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
listrg._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private isDownloadReady As Boolean = False";
listrg._isdownloadready = listrg.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}