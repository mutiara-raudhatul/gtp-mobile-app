package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class smmviews extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.smmviews");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.smmviews.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _smmview{
public boolean IsInitialized;
public Object CustomView;
public anywheresoftware.b4a.objects.B4XViewWrapper mBase;
public int ViewType;
public String Key;
public void Initialize() {
IsInitialized = true;
CustomView = new Object();
mBase = new anywheresoftware.b4a.objects.B4XViewWrapper();
ViewType = 0;
Key = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _targettosmmviews = null;
public int _view_type_b4ximageview = 0;
public int _view_type_gifview = 0;
public int _view_type_videoplayer = 0;
public int _view_type_none = 0;
public int _view_type_webview = 0;
public int _view_type_zoomimageview = 0;
public int _media_type_image = 0;
public int _media_type_gif = 0;
public int _media_type_video = 0;
public int _media_type_none = 0;
public int _media_type_webp = 0;
public int _media_type_html = 0;
public b4a.DesaWisataSumpu.b4xset _unusedviews = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
public boolean _gif_supported = false;
public boolean _video_supported = false;
public boolean _webp_supported = false;
public b4a.DesaWisataSumpu.simplemediamanager _mmanager = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.mapshm _mapshm = null;
public b4a.DesaWisataSumpu.mapsat _mapsat = null;
public b4a.DesaWisataSumpu.detailat _detailat = null;
public b4a.DesaWisataSumpu.detailhm _detailhm = null;
public b4a.DesaWisataSumpu.listat _listat = null;
public b4a.DesaWisataSumpu.listpk _listpk = null;
public b4a.DesaWisataSumpu.detailpk _detailpk = null;
public b4a.DesaWisataSumpu.listhm _listhm = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public String  _cancelrequest(b4a.DesaWisataSumpu.smmviews __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "cancelrequest", true))
	 {return ((String) Debug.delegate(ba, "cancelrequest", new Object[] {_target}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub CancelRequest (Target As B4XView)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="ReturnViewToCache(TargetToSMMViews.Get(Target))";
__ref._returnviewtocache /*String*/ (null,(b4a.DesaWisataSumpu.smmviews._smmview)(__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject()))));
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="TargetToSMMViews.Remove(Target)";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_target.getObject()));
 };
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public int  _mimetomediatype(b4a.DesaWisataSumpu.smmviews __ref,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mimetomediatype", true))
	 {return ((Integer) Debug.delegate(ba, "mimetomediatype", new Object[] {_mime}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub MimeToMediaType (Mime As String) As Int";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If Mime.StartsWith(\"image/gif\") Then";
if (_mime.startsWith("image/gif")) { 
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="If GIF_SUPPORTED = False Then Log(\"*** Add a ref";
if (__ref._gif_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("98323074","*** Add a reference to B4XGIfView and add SMM_GIF to the build configuration ***",0);};
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Return IIf(GIF_SUPPORTED, MEDIA_TYPE_GIF, MEDIA_";
if (true) return (int)(BA.ObjectToNumber(((__ref._gif_supported /*boolean*/ ) ? ((Object)(__ref._media_type_gif /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Else If Mime.StartsWith(\"image/webp\") Then";
if (_mime.startsWith("image/webp")) { 
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="If WEBP_SUPPORTED = False Then Log(\"*** Add a re";
if (__ref._webp_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("98323077","*** Add a reference to WebP library and add SMM_WEBP to the build configuration ***",0);};
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Return IIf(WEBP_SUPPORTED, MEDIA_TYPE_WEBP, MEDI";
if (true) return (int)(BA.ObjectToNumber(((__ref._webp_supported /*boolean*/ ) ? ((Object)(__ref._media_type_webp /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Else If Mime.StartsWith(\"image/\") Then";
if (_mime.startsWith("image/")) { 
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Return MEDIA_TYPE_IMAGE";
if (true) return __ref._media_type_image /*int*/ ;
 }else 
{RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Else if Mime.StartsWith(\"video/\") Then";
if (_mime.startsWith("video/")) { 
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="If VIDEO_SUPPORTED = False Then Log(\"*** Add a r";
if (__ref._video_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("98323082","*** Add a reference to the video library and add SMM_VIDEO to the build configuration ***",0);};
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Return IIf(VIDEO_SUPPORTED, MEDIA_TYPE_VIDEO, ME";
if (true) return (int)(BA.ObjectToNumber(((__ref._video_supported /*boolean*/ ) ? ((Object)(__ref._media_type_video /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Else If Mime.StartsWith(\"text/\") Then";
if (_mime.startsWith("text/")) { 
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="Return MEDIA_TYPE_HTML";
if (true) return __ref._media_type_html /*int*/ ;
 }else {
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="Return MEDIA_TYPE_NONE";
if (true) return __ref._media_type_none /*int*/ ;
 }}}}}
;
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.DesaWisataSumpu.smmviews __ref,anywheresoftware.b4a.BA _ba,b4a.DesaWisataSumpu.simplemediamanager _manager) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_manager}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub Initialize (Manager As SimpleMediaManag";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="mManager = Manager";
__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/  = _manager;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="TargetToSMMViews.Initialize";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="UnusedViews.Initialize";
__ref._unusedviews /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="Panel = xui.CreatePanel(\"\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="Panel.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="End Sub";
return "";
}
public void  _addmedia(b4a.DesaWisataSumpu.smmviews __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "addmedia", true))
	 {Debug.delegate(ba, "addmedia", new Object[] {_requestset,_media,_request}); return;}
ResumableSub_AddMedia rsub = new ResumableSub_AddMedia(this,__ref,_requestset,_media,_request);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMedia extends BA.ResumableSub {
public ResumableSub_AddMedia(b4a.DesaWisataSumpu.smmviews parent,b4a.DesaWisataSumpu.smmviews __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
this._media = _media;
this._request = _request;
this.__ref = parent;
}
b4a.DesaWisataSumpu.smmviews __ref;
b4a.DesaWisataSumpu.smmviews parent;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request;
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
int _viewtype = 0;
b4a.DesaWisataSumpu.smmviews._smmview _sm = null;
int _fadeanimation = 0;
b4a.DesaWisataSumpu.b4ximageview _x = null;
anywheresoftware.b4j.object.JavaObject _decoder = null;
anywheresoftware.b4j.object.JavaObject _drawable = null;
Object[] _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="smmviews";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Dim Target As B4XView = RequestSet.Target";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = _requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="CancelRequest(Target)";
__ref._cancelrequest /*String*/ (null,_target);
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="Dim ViewType As Int = MediaTypeToViewType(MEDIA.M";
_viewtype = __ref._mediatypetoviewtype /*int*/ (null,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,_request);
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="Dim sm As SMMView = GetView(ViewType, MEDIA.Meta.";
_sm = __ref._getview /*b4a.DesaWisataSumpu.smmviews._smmview*/ (null,_viewtype,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ );
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="Target.Color = Request.Extra.GetDefault(mManager.";
_target.setColor((int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._request_background /*String*/ ),(Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._defaultbackgroundcolor /*int*/ )))));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="TargetToSMMViews.Put(Target, sm)";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_target.getObject()),(Object)(_sm));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="Target.AddView(sm.mBase, 0, 0, Target.Width, Targ";
_target.AddView((android.view.View)(_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="Dim FadeAnimation As Int = Request.Extra.GetDefau";
_fadeanimation = (int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._request_fade_animation_duration /*String*/ ),(Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._defaultfadeanimationduration /*int*/ ))));
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_fadeanimation>0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="sm.mBase.Visible = False";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="sm.mBase.SetVisibleAnimated(FadeAnimation, True)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(_fadeanimation,parent.__c.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8192016;
 //BA.debugLineNum = 8192016;BA.debugLine="sm.mBase.Visible = True";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;
;
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="Select ViewType";

case 6:
//select
this.state = 25;
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_zoomimageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ )) {
case 0: {
this.state = 8;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ );
RDebugUtils.currentLine=8192021;
 //BA.debugLineNum = 8192021;BA.debugLine="x.RoundedImage = Request.Extra.GetDefault(mMana";
_x._setroundedimage /*boolean*/ (null,BA.ObjectToBoolean(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._request_roundimage /*String*/ ),(Object)(parent.__c.False))));
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="x.ResizeMode = Request.Extra.GetDefault(mManage";
_x._setresizemode /*String*/ (null,BA.ObjectToString(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._request_resize_mode /*String*/ ),(Object)(__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._defaultresizemode /*String*/ ))));
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="x.Bitmap = MediaToBitmap(MEDIA)";
_x._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._mediatobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_media));
RDebugUtils.currentLine=8192025;
 //BA.debugLineNum = 8192025;BA.debugLine="If mManager.IsWebPAnimated (MEDIA) Then";
if (true) break;

case 9:
//if
this.state = 16;
if (__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._iswebpanimated /*boolean*/ (null,_media)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=8192026;
 //BA.debugLineNum = 8192026;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8192027;
 //BA.debugLineNum = 8192027;BA.debugLine="Dim Drawable As JavaObject = decoder.Initializ";
_drawable = new anywheresoftware.b4j.object.JavaObject();
_drawable = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeDrawable",new Object[]{_media.Media /*Object*/ })));
RDebugUtils.currentLine=8192028;
 //BA.debugLineNum = 8192028;BA.debugLine="x.mBase.GetView(0).As(View).Background = Drawa";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getObject()))).setBackground((android.graphics.drawable.Drawable)(_drawable.getObject()));
RDebugUtils.currentLine=8192029;
 //BA.debugLineNum = 8192029;BA.debugLine="If GetType(Drawable) = \"android.graphics.drawa";
if (true) break;

case 12:
//if
this.state = 15;
if ((parent.__c.GetType((Object)(_drawable.getObject()))).equals("android.graphics.drawable.AnimatedImageDrawable")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=8192030;
 //BA.debugLineNum = 8192030;BA.debugLine="Drawable.RunMethod(\"start\", Null)";
_drawable.RunMethod("start",(Object[])(parent.__c.Null));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 25;
 if (true) break;

case 20:
//C
this.state = 25;
 if (true) break;

case 22:
//C
this.state = 25;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=8192068;
 //BA.debugLineNum = 8192068;BA.debugLine="ParentResized(Target)";
__ref._parentresized /*String*/ (null,_target);
RDebugUtils.currentLine=8192069;
 //BA.debugLineNum = 8192069;BA.debugLine="sm.CustomView.As(WebView).LoadUrl(MEDIA.Media)";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadUrl(BA.ObjectToString(_media.Media /*Object*/ ));
 if (true) break;
;
RDebugUtils.currentLine=8192071;
 //BA.debugLineNum = 8192071;BA.debugLine="If RequestSet.Callback <> Null And RequestSet.Req";

case 25:
//if
this.state = 32;
if (_requestset.Callback /*Object*/ != null && _requestset.RequestState /*int*/ !=__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._state_loading /*int*/ ) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=8192072;
 //BA.debugLineNum = 8192072;BA.debugLine="Dim params() As Object = Array(RequestSet.Reques";
_params = new Object[]{(Object)(_requestset.RequestState /*int*/ ==__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._state_ready /*int*/ ),(Object)(_media)};
RDebugUtils.currentLine=8192073;
 //BA.debugLineNum = 8192073;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_fadeanimation>0) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=8192074;
 //BA.debugLineNum = 8192074;BA.debugLine="Sleep(FadeAnimation + 10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "smmviews", "addmedia"),(int) (_fadeanimation+10));
this.state = 33;
return;
case 33:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=8192080;
 //BA.debugLineNum = 8192080;BA.debugLine="RequestSet.Callback.As(JavaObject).RunMethodJO(\"";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_requestset.Callback /*Object*/ ))).RunMethodJO("getBA",(Object[])(parent.__c.Null)).RunMethod("raiseEventFromUI",new Object[]{(Object)(_target.getObject()),(Object)("smm_mediaready"),(Object)(_params)});
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=8192084;
 //BA.debugLineNum = 8192084;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _parentresized(b4a.DesaWisataSumpu.smmviews __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "parentresized", true))
	 {return ((String) Debug.delegate(ba, "parentresized", new Object[] {_target}));}
b4a.DesaWisataSumpu.smmviews._smmview _sm = null;
b4a.DesaWisataSumpu.b4ximageview _x = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub ParentResized (Target As B4XView)";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim sm As SMMView = TargetToSMMViews.Get(Target)";
_sm = (b4a.DesaWisataSumpu.smmviews._smmview)(__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject())));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="sm.mBase.SetLayoutAnimated(0, 0, 0, Target.Width";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ );
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="x.Update";
_x._update /*String*/ (null);
 break; }
case 1: {
 break; }
case 2: {
RDebugUtils.currentLine=8650775;
 //BA.debugLineNum = 8650775;BA.debugLine="sm.CustomView.As(B4XView).SetLayoutAnimated(0,";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
 break; }
case 3: {
 break; }
}
;
 };
RDebugUtils.currentLine=8650784;
 //BA.debugLineNum = 8650784;BA.debugLine="End Sub";
return "";
}
public int  _mediatypetoviewtype(b4a.DesaWisataSumpu.smmviews __ref,int _mediatype,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mediatypetoviewtype", true))
	 {return ((Integer) Debug.delegate(ba, "mediatypetoviewtype", new Object[] {_mediatype,_request}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub MediaTypeToViewType(MediaType As Int,";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,__ref._media_type_image /*int*/ ,__ref._media_type_webp /*int*/ ,__ref._media_type_gif /*int*/ ,__ref._media_type_video /*int*/ ,__ref._media_type_none /*int*/ ,__ref._media_type_html /*int*/ )) {
case 0: 
case 1: {
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="Return VIEW_TYPE_B4XIMAGEVIEW";
if (true) return __ref._view_type_b4ximageview /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Return VIEW_TYPE_GIFVIEW";
if (true) return __ref._view_type_gifview /*int*/ ;
 break; }
case 3: {
RDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="Return VIEW_TYPE_VIDEOPLAYER";
if (true) return __ref._view_type_videoplayer /*int*/ ;
 break; }
case 4: {
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return __ref._view_type_none /*int*/ ;
 break; }
case 5: {
RDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="Return VIEW_TYPE_WEBVIEW";
if (true) return __ref._view_type_webview /*int*/ ;
 break; }
default: {
RDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="Log(\"Unexpected media type: \" & MediaType)";
__c.LogImpl("98388626","Unexpected media type: "+BA.NumberToString(_mediatype),0);
RDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return __ref._view_type_none /*int*/ ;
 break; }
}
;
RDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSumpu.smmviews._smmview  _getview(b4a.DesaWisataSumpu.smmviews __ref,int _viewtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((b4a.DesaWisataSumpu.smmviews._smmview) Debug.delegate(ba, "getview", new Object[] {_viewtype,_key}));}
b4a.DesaWisataSumpu.smmviews._smmview _sview = null;
anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
Object _customview = null;
b4a.DesaWisataSumpu.b4ximageview _x = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.WebViewWrapper _wv = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub GetView (ViewType As Int, Key As Strin";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="For Each sview As SMMView In UnusedViews.AsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._unusedviews /*b4a.DesaWisataSumpu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sview = (b4a.DesaWisataSumpu.smmviews._smmview)(group1.Get(index1));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If sview.ViewType = ViewType Then";
if (_sview.ViewType /*int*/ ==_viewtype) { 
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="UnusedViews.Remove(sview)";
__ref._unusedviews /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ (null,(Object)(_sview));
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Return CreateSMMView(sview.CustomView, sview.mB";
if (true) return __ref._createsmmview /*b4a.DesaWisataSumpu.smmviews._smmview*/ (null,_sview.CustomView /*Object*/ ,_sview.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_sview.ViewType /*int*/ ,_key);
 };
 }
};
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="Dim mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Dim CustomView As Object";
_customview = new Object();
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_none /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_zoomimageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Dim x As B4XImageView = XUIViewsUtils.CreateB4X";
_x = _xuiviewsutils._createb4ximageview /*b4a.DesaWisataSumpu.b4ximageview*/ (ba);
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="x.mBackgroundColor = xui.Color_Transparent";
_x._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="CustomView = x";
_customview = (Object)(_x);
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="mBase = x.mBase";
_mbase = _x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="CustomView = p";
_customview = (Object)(_p.getObject());
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
case 2: {
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="Panel.LoadLayout(\"SMMGifView\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SMMGifView",ba);
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getTag();
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 3: {
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="Panel.LoadLayout(\"SMMZoomImageView\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SMMZoomImageView",ba);
RDebugUtils.currentLine=8519712;
 //BA.debugLineNum = 8519712;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getTag();
RDebugUtils.currentLine=8519713;
 //BA.debugLineNum = 8519713;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 4: {
 break; }
case 5: {
RDebugUtils.currentLine=8519737;
 //BA.debugLineNum = 8519737;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8519738;
 //BA.debugLineNum = 8519738;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=8519739;
 //BA.debugLineNum = 8519739;BA.debugLine="Dim wv As WebView";
_wv = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=8519740;
 //BA.debugLineNum = 8519740;BA.debugLine="wv.Initialize(\"\")";
_wv.Initialize(ba,"");
RDebugUtils.currentLine=8519741;
 //BA.debugLineNum = 8519741;BA.debugLine="p.AddView(wv, 0, 0, p.Width,p.Height)";
_p.AddView((android.view.View)(_wv.getObject()),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=8519742;
 //BA.debugLineNum = 8519742;BA.debugLine="CustomView = wv";
_customview = (Object)(_wv.getObject());
RDebugUtils.currentLine=8519743;
 //BA.debugLineNum = 8519743;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
}
;
RDebugUtils.currentLine=8519745;
 //BA.debugLineNum = 8519745;BA.debugLine="Return CreateSMMView(CustomView, mBase, ViewType,";
if (true) return __ref._createsmmview /*b4a.DesaWisataSumpu.smmviews._smmview*/ (null,_customview,_mbase,_viewtype,_key);
RDebugUtils.currentLine=8519746;
 //BA.debugLineNum = 8519746;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _mediatobitmap(b4a.DesaWisataSumpu.smmviews __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mediatobitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "mediatobitmap", new Object[] {_media}));}
anywheresoftware.b4j.object.JavaObject _decoder = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub MediaToBitmap(MEDIA As SMMedia) As B4X";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="If mManager.IsWebPAnimated(MEDIA) Then";
if (__ref._mmanager /*b4a.DesaWisataSumpu.simplemediamanager*/ ._iswebpanimated /*boolean*/ (null,_media)) { 
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Return decoder.InitializeStatic(\"android.graphic";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeBitmap",new Object[]{_media.Media /*Object*/ })));
 };
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Return MEDIA.Media";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ ));
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="End Sub";
return null;
}
public String  _returnviewtocache(b4a.DesaWisataSumpu.smmviews __ref,b4a.DesaWisataSumpu.smmviews._smmview _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "returnviewtocache", true))
	 {return ((String) Debug.delegate(ba, "returnviewtocache", new Object[] {_sm}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub ReturnViewToCache (sm As SMMView)";
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="sm.mBase.RemoveViewFromParent";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="sm.CustomView.As(B4XImageView).Clear";
((b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ ))._clear /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="sm.mBase.GetView(0).SetBitmap(Null)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetBitmap((android.graphics.Bitmap)(__c.Null));
 break; }
case 2: {
 break; }
case 3: {
RDebugUtils.currentLine=8454173;
 //BA.debugLineNum = 8454173;BA.debugLine="sm.CustomView.As(JavaObject).RunMethod(\"stopLoa";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).RunMethod("stopLoading",(Object[])(__c.Null));
RDebugUtils.currentLine=8454175;
 //BA.debugLineNum = 8454175;BA.debugLine="sm.CustomView.As(WebView).LoadHtml(\"\")";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadHtml("");
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=8454181;
 //BA.debugLineNum = 8454181;BA.debugLine="UnusedViews.Add(sm)";
__ref._unusedviews /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_sm));
RDebugUtils.currentLine=8454182;
 //BA.debugLineNum = 8454182;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSumpu.smmviews __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Type SMMView (CustomView As Object, mBase As B4XV";
;
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Private TargetToSMMViews As Map";
_targettosmmviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Private Const VIEW_TYPE_B4XIMAGEVIEW = 1, VIEW_TY";
_view_type_b4ximageview = (int) (1);
_view_type_gifview = (int) (2);
_view_type_videoplayer = (int) (3);
_view_type_none = (int) (4);
_view_type_webview = (int) (5);
_view_type_zoomimageview = (int) (6);
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Public Const MEDIA_TYPE_IMAGE = 1, MEDIA_TYPE_GIF";
_media_type_image = (int) (1);
_media_type_gif = (int) (2);
_media_type_video = (int) (3);
_media_type_none = (int) (4);
_media_type_webp = (int) (5);
_media_type_html = (int) (6);
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Private UnusedViews As B4XSet";
_unusedviews = new b4a.DesaWisataSumpu.b4xset();
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Private Panel As B4XView";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="Private Const GIF_SUPPORTED As Boolean = False";
_gif_supported = __c.False;
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="Private Const VIDEO_SUPPORTED As Boolean = False";
_video_supported = __c.False;
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="Private Const WEBP_SUPPORTED As Boolean = False";
_webp_supported = __c.False;
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="Private mManager As SimpleMediaManager";
_mmanager = new b4a.DesaWisataSumpu.simplemediamanager();
RDebugUtils.currentLine=7995421;
 //BA.debugLineNum = 7995421;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.smmviews._smmview  _createsmmview(b4a.DesaWisataSumpu.smmviews __ref,Object _customview,anywheresoftware.b4a.objects.B4XViewWrapper _mbase,int _viewtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "createsmmview", true))
	 {return ((b4a.DesaWisataSumpu.smmviews._smmview) Debug.delegate(ba, "createsmmview", new Object[] {_customview,_mbase,_viewtype,_key}));}
b4a.DesaWisataSumpu.smmviews._smmview _t1 = null;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub CreateSMMView (CustomView As Object, m";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim t1 As SMMView";
_t1 = new b4a.DesaWisataSumpu.smmviews._smmview();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="t1.CustomView = CustomView";
_t1.CustomView /*Object*/  = _customview;
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="t1.mBase = mBase";
_t1.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _mbase;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="t1.ViewType = ViewType";
_t1.ViewType /*int*/  = _viewtype;
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="End Sub";
return null;
}
public String  _typetostring(b4a.DesaWisataSumpu.smmviews __ref,int _viewtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "typetostring", true))
	 {return ((String) Debug.delegate(ba, "typetostring", new Object[] {_viewtype}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub TypeToString (ViewType As Int) As Stri";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_none /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Return \"B4XImageView\"";
if (true) return "B4XImageView";
 break; }
case 1: {
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Return \"B4XGifView\"";
if (true) return "B4XGifView";
 break; }
case 2: {
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="Return \"Panel\"";
if (true) return "Panel";
 break; }
case 3: {
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="Return \"video player\"";
if (true) return "video player";
 break; }
case 4: {
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="Return \"WebView\"";
if (true) return "WebView";
 break; }
case 5: {
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="Return \"ZoomImageView\"";
if (true) return "ZoomImageView";
 break; }
}
;
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="End Sub";
return "";
}
}