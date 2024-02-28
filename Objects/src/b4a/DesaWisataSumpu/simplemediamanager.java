package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class simplemediamanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.simplemediamanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.simplemediamanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _smmediameta{
public boolean IsInitialized;
public String Mime;
public int MediaType;
public String Key;
public int MetaState;
public b4a.DesaWisataSumpu.httpjob Job;
public boolean Permanent;
public b4a.DesaWisataSumpu.b4xset WaitingRequestsSets;
public String FirstUrl;
public String Dir;
public String FileName;
public void Initialize() {
IsInitialized = true;
Mime = "";
MediaType = 0;
Key = "";
MetaState = 0;
Job = new b4a.DesaWisataSumpu.httpjob();
Permanent = false;
WaitingRequestsSets = new b4a.DesaWisataSumpu.b4xset();
FirstUrl = "";
Dir = "";
FileName = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmedia{
public boolean IsInitialized;
public Object Media;
public b4a.DesaWisataSumpu.simplemediamanager._smmediameta Meta;
public b4a.DesaWisataSumpu.b4xset UsedBy;
public int MediaState;
public b4a.DesaWisataSumpu.b4xset WaitingRequestsSets;
public b4a.DesaWisataSumpu.httpjob Job;
public void Initialize() {
IsInitialized = true;
Media = new Object();
Meta = new b4a.DesaWisataSumpu.simplemediamanager._smmediameta();
UsedBy = new b4a.DesaWisataSumpu.b4xset();
MediaState = 0;
WaitingRequestsSets = new b4a.DesaWisataSumpu.b4xset();
Job = new b4a.DesaWisataSumpu.httpjob();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequest{
public boolean IsInitialized;
public String Key;
public String Url;
public String Mime;
public anywheresoftware.b4a.objects.collections.Map Extra;
public void Initialize() {
IsInitialized = true;
Key = "";
Url = "";
Mime = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequestset{
public boolean IsInitialized;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest Loading;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest MainMedia;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest Error;
public anywheresoftware.b4a.objects.B4XViewWrapper Target;
public int NumberOfAncestors;
public int RequestState;
public Object Callback;
public void Initialize() {
IsInitialized = true;
Loading = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
MainMedia = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
Error = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
Target = new anywheresoftware.b4a.objects.B4XViewWrapper();
NumberOfAncestors = 0;
RequestState = 0;
Callback = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _state_loading = 0;
public int _state_error = 0;
public int _state_ready = 0;
public anywheresoftware.b4a.objects.collections.Map _metacache = null;
public b4a.DesaWisataSumpu.b4xorderedmap _mediacache = null;
public int _maxmediacachesize = 0;
public anywheresoftware.b4a.objects.collections.Map _viewsrequestset = null;
public b4a.DesaWisataSumpu.bitmapsasync _imagesloader = null;
public b4a.DesaWisataSumpu.httpjob _jobempty = null;
public String _key_default_loading = "";
public String _key_default_error = "";
public String _mime_unknown = "";
public int _maximagesize = 0;
public int _defaultfadeanimationduration = 0;
public String _defaultresizemode = "";
public int _defaultbackgroundcolor = 0;
public int _defaultforegroundcolor = 0;
public b4a.DesaWisataSumpu.smmviews _viewsmanager = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _defaultloadingrequest = null;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _defaulterrorrequest = null;
public String _request_roundimage = "";
public String _request_background = "";
public String _request_resize_mode = "";
public String _request_fade_animation_duration = "";
public String _request_foreground = "";
public String _request_callback = "";
public String _request_zoomimageview = "";
public String _request_file = "";
public String _request_dir = "";
public long _lasttrimcache = 0L;
public long _mintimebetweentrims = 0L;
public long _sleepdurationbeforedownload = 0L;
public b4a.DesaWisataSumpu.requestsmanager _httprequestsmanager = null;
public int _b4asdkversion = 0;
public int _defaultrequesttimeout = 0;
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
public String  _initialize(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _build = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="ImagesLoader.Initialize";
__ref._imagesloader /*b4a.DesaWisataSumpu.bitmapsasync*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="ImagesLoader.MaxFileSize = 8 * 1024 * 1024";
__ref._imagesloader /*b4a.DesaWisataSumpu.bitmapsasync*/ ._maxfilesize /*long*/  = (long) (8*1024*1024);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="MetaCache.Initialize";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="MediaCache.Initialize";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="ViewsRequestSet.Initialize";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="ViewsManager.Initialize (Me)";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._initialize /*String*/ (null,ba,(b4a.DesaWisataSumpu.simplemediamanager)(this));
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Dim build As JavaObject";
_build = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="B4ASdkVersion =  build.InitializeStatic(\"android.";
__ref._b4asdkversion /*int*/  = (int)(BA.ObjectToNumber(_build.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="AddLocalMedia(KEY_DEFAULT_ERROR, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSumpu.simplemediamanager._smmedia*/ (null,__ref._key_default_error /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="DefaultLoadingRequest = CreateSMMRequest(KEY_DEFA";
__ref._defaultloadingrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_loading /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="DefaultLoadingRequest.Extra.Put(REQUEST_BACKGROUN";
__ref._defaultloadingrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="DefaultErrorRequest = CreateSMMRequest(KEY_DEFAUL";
__ref._defaulterrorrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_error /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="DefaultErrorRequest.Extra.Put(REQUEST_BACKGROUND,";
__ref._defaulterrorrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(((int)0xff6a6a6a)));
RDebugUtils.currentLine=5832720;
 //BA.debugLineNum = 5832720;BA.debugLine="AddLocalMedia(KEY_DEFAULT_LOADING, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSumpu.simplemediamanager._smmedia*/ (null,__ref._key_default_loading /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=5832721;
 //BA.debugLineNum = 5832721;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=5832722;
 //BA.debugLineNum = 5832722;BA.debugLine="HttpRequestsManager.Initialize";
__ref._httprequestsmanager /*b4a.DesaWisataSumpu.requestsmanager*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5832726;
 //BA.debugLineNum = 5832726;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithextra(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithextra", true))
	 {return ((String) Debug.delegate(ba, "setmediawithextra", new Object[] {_target,_url,_mime,_extra}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request = null;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _rs = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub SetMediaWithExtra (Target As B4XView, U";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If Mime = \"\" Then Mime = MIME_UNKNOWN";
if ((_mime).equals("")) { 
_mime = __ref._mime_unknown /*String*/ ;};
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Dim Request As SMMediaRequest = CreateSMMRequest2";
_request = __ref._createsmmrequest2 /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,_url,_url,_mime,_extra);
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Dim rs As SMMediaRequestSet = CreateSMMediaReques";
_rs = __ref._createsmmediarequestset /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset*/ (null,__ref._clonerequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,__ref._defaultloadingrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ),_request,__ref._clonerequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,__ref._defaulterrorrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ),_target);
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="If Extra.ContainsKey(REQUEST_CALLBACK) Then rs.Ca";
if (_extra.ContainsKey((Object)(__ref._request_callback /*String*/ ))) { 
_rs.Callback /*Object*/  = _extra.Get((Object)(__ref._request_callback /*String*/ ));};
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="SetMediaWithRequestSet(rs)";
__ref._setmediawithrequestset /*String*/ (null,_rs);
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.simplemediamanager._smmedia  _addlocalmedia(b4a.DesaWisataSumpu.simplemediamanager __ref,String _key,Object _media,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "addlocalmedia", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmedia) Debug.delegate(ba, "addlocalmedia", new Object[] {_key,_media,_mime}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _smedia = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub AddLocalMedia (Key As String, Media As";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim meta As SMMediaMeta = CreateSMMediaMeta(Mime,";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ (null,_mime,_key,__ref._state_ready /*int*/ ,__c.True);
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim smedia As SMMedia = CreateSMMedia(Media, meta";
_smedia = __ref._createsmmedia /*b4a.DesaWisataSumpu.simplemediamanager._smmedia*/ (null,_media,_meta,__ref._state_ready /*int*/ );
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="MediaCache.Put(meta.Key, smedia)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_smedia));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Return smedia";
if (true) return _smedia;
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediameta  _createsmmediameta(b4a.DesaWisataSumpu.simplemediamanager __ref,String _mime,String _key,int _metastate,boolean _permanent) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediameta", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediameta) Debug.delegate(ba, "createsmmediameta", new Object[] {_mime,_key,_metastate,_permanent}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _t1 = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub CreateSMMediaMeta (Mime As String, Key";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim t1 As SMMediaMeta";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediameta();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="t1.MediaType = ViewsManager.MimeToMediaType(Mime)";
_t1.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime);
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="t1.MetaState = MetaState";
_t1.MetaState /*int*/  = _metastate;
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="t1.Permanent = Permanent";
_t1.Permanent /*boolean*/  = _permanent;
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmedia  _createsmmedia(b4a.DesaWisataSumpu.simplemediamanager __ref,Object _media,b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta,int _mediastate) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmedia", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmedia) Debug.delegate(ba, "createsmmedia", new Object[] {_media,_meta,_mediastate}));}
b4a.DesaWisataSumpu.simplemediamanager._smmedia _t1 = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub CreateSMMedia (Media As Object, Meta As";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim t1 As SMMedia";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmedia();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="t1.Media = Media";
_t1.Media /*Object*/  = _media;
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="t1.Meta = Meta";
_t1.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/  = _meta;
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="t1.MediaState = MediaState";
_t1.MediaState /*int*/  = _mediastate;
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="t1.UsedBy.Initialize";
_t1.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="End Sub";
return null;
}
public String  _canceldisconnectedtargets(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "canceldisconnectedtargets", true))
	 {return ((String) Debug.delegate(ba, "canceldisconnectedtargets", new Object[] {_media}));}
b4a.DesaWisataSumpu.b4xset _set = null;
int _i = 0;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub CancelDisconnectedTargets (Media As SM";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="For Each set As B4XSet In Array(Media.UsedBy, Med";
{
final Object[] group1 = new Object[]{(Object)(_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ),(Object)(_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ )};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_set = (b4a.DesaWisataSumpu.b4xset)(group1[index1]);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="For i = set.Size - 1 To 0 Step - 1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_set._getsize /*int*/ (null)-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Dim RequestSet As SMMediaRequestSet = set.AsLis";
_requestset = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(_set._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="If RequestSet.NumberOfAncestors > CountAncestor";
if (_requestset.NumberOfAncestors /*int*/ >__ref._countancestors /*int*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="set.Remove(RequestSet)";
_set._remove /*String*/ (null,(Object)(_requestset));
 };
 }
};
 }
};
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="End Sub";
return "";
}
public int  _countancestors(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "countancestors", true))
	 {return ((Integer) Debug.delegate(ba, "countancestors", new Object[] {_target}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _count = 0;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub CountAncestors(Target As B4XView) As I";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim p As B4XView = Target";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _target;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Do While p.Parent Is View";
while (_p.getParent().getObjectOrNull() instanceof android.view.View) {
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="p = p.Parent";
_p = _p.getParent();
 }
;
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="End Sub";
return 0;
}
public String  _cancelrequest(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "cancelrequest", true))
	 {return ((String) Debug.delegate(ba, "cancelrequest", new Object[] {_requestset}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub CancelRequest (RequestSet As SMMediaRe";
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="ViewsRequestSet.Remove(RequestSet.Target)";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(RequestSe";
_meta = (b4a.DesaWisataSumpu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="If meta <> Null Then";
if (_meta!= null) { 
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="meta.WaitingRequestsSets.Remove(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="If media <> Null Then";
if (_media!= null) { 
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="media.WaitingRequestsSets.Remove(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="media.UsedBy.Remove(RequestSet)";
_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="CancelDisconnectedTargets(media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
 };
 };
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSumpu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Type SMMediaMeta (Mime As String, MediaType As In";
;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Type SMMedia (Media As Object, Meta As SMMediaMet";
;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Type SMMediaRequest (Key As String, Url As String";
;
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Type SMMediaRequestSet (Loading As SMMediaRequest";
;
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="Public Const STATE_LOADING = 1, STATE_ERROR = 2,";
_state_loading = (int) (1);
_state_error = (int) (2);
_state_ready = (int) (3);
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="Private MetaCache As Map";
_metacache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="Private MediaCache As B4XOrderedMap";
_mediacache = new b4a.DesaWisataSumpu.b4xorderedmap();
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="Public MaxMediaCacheSize As Int = 40";
_maxmediacachesize = (int) (40);
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="Private ViewsRequestSet As Map";
_viewsrequestset = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="Private ImagesLoader As BitmapsAsync";
_imagesloader = new b4a.DesaWisataSumpu.bitmapsasync();
RDebugUtils.currentLine=5767180;
 //BA.debugLineNum = 5767180;BA.debugLine="Private JobEmpty As HttpJob";
_jobempty = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=5767181;
 //BA.debugLineNum = 5767181;BA.debugLine="Public const KEY_DEFAULT_LOADING = \"~loading\", KE";
_key_default_loading = "~loading";
_key_default_error = "~error";
RDebugUtils.currentLine=5767182;
 //BA.debugLineNum = 5767182;BA.debugLine="Public const MIME_UNKNOWN As String = \"~unknown\"";
_mime_unknown = "~unknown";
RDebugUtils.currentLine=5767183;
 //BA.debugLineNum = 5767183;BA.debugLine="Public MaxImageSize = 1000 As Int";
_maximagesize = (int) (1000);
RDebugUtils.currentLine=5767184;
 //BA.debugLineNum = 5767184;BA.debugLine="Public DefaultFadeAnimationDuration As Int = 300";
_defaultfadeanimationduration = (int) (300);
RDebugUtils.currentLine=5767185;
 //BA.debugLineNum = 5767185;BA.debugLine="Public DefaultResizeMode As String = \"FIT\"";
_defaultresizemode = "FIT";
RDebugUtils.currentLine=5767186;
 //BA.debugLineNum = 5767186;BA.debugLine="Public DefaultBackgroundColor As Int = xui.Color_";
_defaultbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=5767187;
 //BA.debugLineNum = 5767187;BA.debugLine="Public DefaultForegroundColor As Int = xui.Color_";
_defaultforegroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=5767188;
 //BA.debugLineNum = 5767188;BA.debugLine="Public ViewsManager As SMMViews";
_viewsmanager = new b4a.DesaWisataSumpu.smmviews();
RDebugUtils.currentLine=5767189;
 //BA.debugLineNum = 5767189;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5767190;
 //BA.debugLineNum = 5767190;BA.debugLine="Public DefaultLoadingRequest, DefaultErrorRequest";
_defaultloadingrequest = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
_defaulterrorrequest = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=5767191;
 //BA.debugLineNum = 5767191;BA.debugLine="Public Const REQUEST_ROUNDIMAGE = \"round_image\",";
_request_roundimage = "round_image";
_request_background = "background";
_request_resize_mode = "resize_mode";
_request_fade_animation_duration = "fade_animation";
RDebugUtils.currentLine=5767192;
 //BA.debugLineNum = 5767192;BA.debugLine="Public Const REQUEST_FOREGROUND = \"foreground\" As";
_request_foreground = "foreground";
RDebugUtils.currentLine=5767193;
 //BA.debugLineNum = 5767193;BA.debugLine="Public Const REQUEST_CALLBACK = \"callback\" As Str";
_request_callback = "callback";
RDebugUtils.currentLine=5767194;
 //BA.debugLineNum = 5767194;BA.debugLine="Public Const REQUEST_ZOOMIMAGEVIEW = \"zoomimagevi";
_request_zoomimageview = "zoomimageview";
RDebugUtils.currentLine=5767195;
 //BA.debugLineNum = 5767195;BA.debugLine="Private Const REQUEST_FILE = \"file\", REQUEST_DIR";
_request_file = "file";
_request_dir = "dir";
RDebugUtils.currentLine=5767196;
 //BA.debugLineNum = 5767196;BA.debugLine="Private LastTrimCache As Long";
_lasttrimcache = 0L;
RDebugUtils.currentLine=5767197;
 //BA.debugLineNum = 5767197;BA.debugLine="Public MinTimeBetweenTrims As Long = 2000";
_mintimebetweentrims = (long) (2000);
RDebugUtils.currentLine=5767198;
 //BA.debugLineNum = 5767198;BA.debugLine="Public SleepDurationBeforeDownload As Long = 50";
_sleepdurationbeforedownload = (long) (50);
RDebugUtils.currentLine=5767199;
 //BA.debugLineNum = 5767199;BA.debugLine="Private HttpRequestsManager As RequestsManager";
_httprequestsmanager = new b4a.DesaWisataSumpu.requestsmanager();
RDebugUtils.currentLine=5767200;
 //BA.debugLineNum = 5767200;BA.debugLine="Public B4ASdkVersion As Int";
_b4asdkversion = 0;
RDebugUtils.currentLine=5767201;
 //BA.debugLineNum = 5767201;BA.debugLine="Public DefaultRequestTimeout As Int = 30000";
_defaultrequesttimeout = (int) (30000);
RDebugUtils.currentLine=5767205;
 //BA.debugLineNum = 5767205;BA.debugLine="End Sub";
return "";
}
public String  _clearmedia(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clearmedia", true))
	 {return ((String) Debug.delegate(ba, "clearmedia", new Object[] {_target}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub ClearMedia(Target As B4XView)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="If ViewsRequestSet.ContainsKey(Target) Then";
if (__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="CancelRequest(ViewsRequestSet.Get(Target))";
__ref._cancelrequest /*String*/ (null,(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject()))));
 };
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _clonerequest(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clonerequest", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequest) Debug.delegate(ba, "clonerequest", new Object[] {_request}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _req = null;
String _k = "";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub CloneRequest(Request As SMMediaRequest)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim req As SMMediaRequest = CreateSMMRequest(Requ";
_req = __ref._createsmmrequest /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,_request.Key /*String*/ ,_request.Url /*String*/ ,_request.Mime /*String*/ );
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="For Each k As String In Request.Extra.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="req.Extra.Put(k, Request.Extra.Get(k))";
_req.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createsmmrequest(b4a.DesaWisataSumpu.simplemediamanager __ref,String _key,String _url,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest", new Object[] {_key,_url,_mime}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub CreateSMMRequest (Key As String, Url A";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="t1.Extra.Initialize";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createrequest(b4a.DesaWisataSumpu.simplemediamanager __ref,String _url,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createrequest", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createrequest", new Object[] {_url,_extra}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub CreateRequest (Url As String, Extra As";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Return CreateSMMRequest2(Url, Url, MIME_UNKNOWN,";
if (true) return __ref._createsmmrequest2 /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,_url,_url,__ref._mime_unknown /*String*/ ,_extra);
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createsmmrequest2(b4a.DesaWisataSumpu.simplemediamanager __ref,String _key,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest2", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest2", new Object[] {_key,_url,_mime,_extra}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub CreateSMMRequest2 (Key As String, Url";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset  _createsmmediarequestset(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _loading,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _mainmedia,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _error,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediarequestset", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset) Debug.delegate(ba, "createsmmediarequestset", new Object[] {_loading,_mainmedia,_error,_target}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _t1 = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub CreateSMMediaRequestSet (Loading As SMM";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Dim t1 As SMMediaRequestSet";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="t1.Loading = Loading";
_t1.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _loading;
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="t1.MainMedia = MainMedia";
_t1.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _mainmedia;
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="t1.Error = Error";
_t1.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _error;
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="t1.Target = Target";
_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _target;
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="t1.NumberOfAncestors = CountAncestors(t1.Target)";
_t1.NumberOfAncestors /*int*/  = __ref._countancestors /*int*/ (null,_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="t1.Callback = Null";
_t1.Callback /*Object*/  = __c.Null;
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="If t1.NumberOfAncestors = 0 Then";
if (_t1.NumberOfAncestors /*int*/ ==0) { 
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="Log(\"Target is not in the views tree!\")";
__c.LogImpl("97733258","Target is not in the views tree!",0);
 };
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="End Sub";
return null;
}
public String  _deletemedia(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "deletemedia", true))
	 {return ((String) Debug.delegate(ba, "deletemedia", new Object[] {_media}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub DeleteMedia (Media As SMMedia)";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Select Media.Meta.MediaType";
switch (BA.switchObjectToInt(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_html /*int*/ )) {
case 0: {
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Dim jo As JavaObject = Media.Media 'B4XBitmap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_media.Media /*Object*/ ));
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="jo.RunMethod(\"recycle\", Null)";
_jo.RunMethod("recycle",(Object[])(__c.Null));
 break; }
case 1: {
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="MetaCache.Remove(Media.Meta.Key)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 break; }
}
;
 }else 
{RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="Else if Media.MediaState = STATE_LOADING Then";
if (_media.MediaState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="If Media.Job.IsInitialized Then";
if (_media.Job /*b4a.DesaWisataSumpu.httpjob*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="HttpRequestsManager.CancelRequest(Media.Meta.Fi";
__ref._httprequestsmanager /*b4a.DesaWisataSumpu.requestsmanager*/ ._cancelrequest /*String*/ (null,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ ,_media.Job /*b4a.DesaWisataSumpu.httpjob*/ );
 };
 }}
;
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="End Sub";
return "";
}
public String  _designersetmedia(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.keywords.DesignerArgs _designerargs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "designersetmedia", true))
	 {return ((String) Debug.delegate(ba, "designersetmedia", new Object[] {_designerargs}));}
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
String _url = "";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub DesignerSetMedia(DesignerArgs As Desig";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim Target As B4XView = DesignerArgs.GetViewFromA";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_designerargs.GetViewFromArgs((int) (0))));
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim url As String = DesignerArgs.Arguments.Get(1)";
_url = BA.ObjectToString(_designerargs.getArguments().Get((int) (1)));
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="If DesignerArgs.FirstRun Then";
if (_designerargs.getFirstRun()) { 
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="SetMedia(Target, url)";
__ref._setmedia /*String*/ (null,_target,_url);
 }else {
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="PanelResized(Target)";
__ref._panelresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return "";
}
public String  _setmedia(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmedia", true))
	 {return ((String) Debug.delegate(ba, "setmedia", new Object[] {_target,_url}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub SetMedia(Target As B4XView, Url As Stri";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="SetMediaWithExtra(Target, Url, MIME_UNKNOWN, Crea";
__ref._setmediawithextra /*String*/ (null,_target,_url,__ref._mime_unknown /*String*/ ,__c.createMap(new Object[] {}));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _panelresized(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "panelresized", true))
	 {return ((String) Debug.delegate(ba, "panelresized", new Object[] {_target}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _set = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub PanelResized (Target As B4XView)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim set As SMMediaRequestSet = ViewsRequestSet.Ge";
_set = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject())));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="If set <> Null Then";
if (_set!= null) { 
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="ViewsManager.ParentResized(Target)";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._parentresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="End Sub";
return "";
}
public void  _downloadimagemedia(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "downloadimagemedia", true))
	 {Debug.delegate(ba, "downloadimagemedia", new Object[] {_media}); return;}
ResumableSub_DownloadImageMedia rsub = new ResumableSub_DownloadImageMedia(this,__ref,_media);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImageMedia extends BA.ResumableSub {
public ResumableSub_DownloadImageMedia(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
this.__ref = parent;
}
b4a.DesaWisataSumpu.simplemediamanager __ref;
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.httpjob _job = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If Media.Meta.MetaState = STATE_READY Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MetaState /*int*/ ==__ref._state_ready /*int*/ ) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If SleepDurationBeforeDownload > 0 Then";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._sleepdurationbeforedownload /*long*/ >0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Sleep(SleepDurationBeforeDownload)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"),(int) (__ref._sleepdurationbeforedownload /*long*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="If IsMediaStillRelevant(Media) = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._ismediastillrelevant /*boolean*/ (null,_media)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="DeleteMedia(Media) 'media is loading state. Re";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="If Media.Meta.Dir = \"\" Then";

case 11:
//if
this.state = 22;
if ((_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Dir /*String*/ ).equals("")) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=6422545;
 //BA.debugLineNum = 6422545;BA.debugLine="job.Download(Media.Meta.FirstUrl)";
_job._download /*String*/ (null,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ );
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=6422550;
 //BA.debugLineNum = 6422550;BA.debugLine="Media.Job = job";
_media.Job /*b4a.DesaWisataSumpu.httpjob*/  = _job;
RDebugUtils.currentLine=6422551;
 //BA.debugLineNum = 6422551;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), (Object)(_job));
this.state = 27;
return;
case 27:
//C
this.state = 14;
_job = (b4a.DesaWisataSumpu.httpjob) result[1];
;
RDebugUtils.currentLine=6422552;
 //BA.debugLineNum = 6422552;BA.debugLine="Media.Job = JobEmpty";
_media.Job /*b4a.DesaWisataSumpu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSumpu.httpjob*/ ;
RDebugUtils.currentLine=6422557;
 //BA.debugLineNum = 6422557;BA.debugLine="If job.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_job._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=6422558;
 //BA.debugLineNum = 6422558;BA.debugLine="Wait For (PrepareMedia(Media, job, \"\", \"\", Fal";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,_job,"","",parent.__c.False));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=6422559;
 //BA.debugLineNum = 6422559;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, ST";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(__ref._state_ready /*int*/ )) : ((Object)(__ref._state_error /*int*/ )))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=6422561;
 //BA.debugLineNum = 6422561;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=6422563;
 //BA.debugLineNum = 6422563;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=6422568;
 //BA.debugLineNum = 6422568;BA.debugLine="Wait For (PrepareMedia(Media, Null, Media.Meta.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,(b4a.DesaWisataSumpu.httpjob)(parent.__c.Null),_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Dir /*String*/ ,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FileName /*String*/ ,parent.__c.True));
this.state = 29;
return;
case 29:
//C
this.state = 22;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=6422569;
 //BA.debugLineNum = 6422569;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, STA";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(__ref._state_ready /*int*/ )) : ((Object)(__ref._state_error /*int*/ )))));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=6422573;
 //BA.debugLineNum = 6422573;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=6422575;
 //BA.debugLineNum = 6422575;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
RDebugUtils.currentLine=6422576;
 //BA.debugLineNum = 6422576;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _ismediastillrelevant(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "ismediastillrelevant", true))
	 {return ((Boolean) Debug.delegate(ba, "ismediastillrelevant", new Object[] {_media}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub IsMediaStillRelevant (Media As SMMedia";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return Media.Meta.Permanent Or (Media.MediaState";
if (true) return _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Permanent /*boolean*/  || (_media.MediaState /*int*/ ==__ref._state_loading /*int*/  && _media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._getsize /*int*/ (null)>0) || (_media.MediaState /*int*/ !=__ref._state_loading /*int*/  && _media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._getsize /*int*/ (null)>0);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparemedia(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.httpjob _job,String _dir,String _filename,boolean _fromfile) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "preparemedia", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparemedia", new Object[] {_media,_job,_dir,_filename,_fromfile}));}
ResumableSub_PrepareMedia rsub = new ResumableSub_PrepareMedia(this,__ref,_media,_job,_dir,_filename,_fromfile);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareMedia extends BA.ResumableSub {
public ResumableSub_PrepareMedia(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.httpjob _job,String _dir,String _filename,boolean _fromfile) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
this._job = _job;
this._dir = _dir;
this._filename = _filename;
this._fromfile = _fromfile;
this.__ref = parent;
}
b4a.DesaWisataSumpu.simplemediamanager __ref;
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.httpjob _job;
String _dir;
String _filename;
boolean _fromfile;
int _mediatype = 0;
boolean _skipregularimageloading = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="If MediaType = ViewsManager.MEDIA_TYPE_IMAGE Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_mediatype==__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_image /*int*/ ) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim SkipRegularImageLoading As Boolean 'ignore";
_skipregularimageloading = false;
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="If SkipRegularImageLoading = False Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_skipregularimageloading==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="If FromFile Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_fromfile) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="Wait For (ImagesLoader.LoadFromFile(Dir, FileN";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "preparemedia"), __ref._imagesloader /*b4a.DesaWisataSumpu.bitmapsasync*/ ._loadfromfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_dir,_filename,__ref._maximagesize /*int*/ ,__ref._maximagesize /*int*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Wait For (ImagesLoader.LoadFromHttpJob(job, Ma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "preparemedia"), __ref._imagesloader /*b4a.DesaWisataSumpu.bitmapsasync*/ ._loadfromhttpjob /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_job,__ref._maximagesize /*int*/ ,__ref._maximagesize /*int*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=6488080;
 //BA.debugLineNum = 6488080;BA.debugLine="Media.Media = IIf(bmp.IsInitialized, bmp, Null)";
_media.Media /*Object*/  = ((_bmp.IsInitialized()) ? ((Object)(_bmp.getObject())) : (parent.__c.Null));
 if (true) break;
;
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="If (xui.IsB4A Or xui.IsB4J) And Media.Meta.Mime";

case 13:
//if
this.state = 16;
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) && (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") && _media.Media /*Object*/ != null) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="PreprocessExif(Media, IIf(FromFile, File.OpenIn";
__ref._preprocessexif /*String*/ (null,_media,(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()))))));
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="Dim in As InputStream = IIf(FromFile, File.OpenI";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject())))));
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="Select MediaType";
if (true) break;

case 19:
//select
this.state = 24;
switch (BA.switchObjectToInt(_mediatype,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_gif /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_webp /*int*/ )) {
case 0: {
this.state = 21;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="Media.Media = Bit.InputStreamToBytes(in)";
_media.Media /*Object*/  = (Object)(parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_in.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=6488108;
 //BA.debugLineNum = 6488108;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=6488109;
 //BA.debugLineNum = 6488109;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mediaisready(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "mediaisready", true))
	 {return ((String) Debug.delegate(ba, "mediaisready", new Object[] {_media}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _req = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub MediaIsReady (Media As SMMedia)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="For Each req As SMMediaRequestSet In Media.Waitin";
{
final anywheresoftware.b4a.BA.IterableList group2 = _media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_req = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(group2.Get(index2));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="req.RequestState = Media.MediaState";
_req.RequestState /*int*/  = _media.MediaState /*int*/ ;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Media.UsedBy.Add(req)";
_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_req));
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="ViewsManager.AddMedia(req, Media, GetRequestFro";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._addmedia /*void*/ (null,_req,_media,__ref._getrequestfromrequestset /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,_req));
 }else 
{RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Else if Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="ViewsManager.AddMedia(req, MediaCache.Get(req.E";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._addmedia /*void*/ (null,_req,(b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_req.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),__ref._getrequestfromrequestset /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ (null,_req));
 }else {
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Log(\"MediaIsReady Unexpected state!\")";
__c.LogImpl("96619146","MediaIsReady Unexpected state!",0);
 }}
;
 }
};
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Media.WaitingRequestsSets.Clear";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 };
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="End Sub";
return "";
}
public int  _getmediacachesize(b4a.DesaWisataSumpu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getmediacachesize", true))
	 {return ((Integer) Debug.delegate(ba, "getmediacachesize", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub getMediaCacheSize As Int";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Return MediaCache.Size";
if (true) return __ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _getrequestfromrequestset(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getrequestfromrequestset", true))
	 {return ((b4a.DesaWisataSumpu.simplemediamanager._smmediarequest) Debug.delegate(ba, "getrequestfromrequestset", new Object[] {_rs}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub GetRequestFromRequestSet(rs As SMMedia";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If rs.RequestState = STATE_LOADING Then";
if (_rs.RequestState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Return rs.Loading";
if (true) return _rs.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 }else 
{RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Else If rs.RequestState = STATE_ERROR Then";
if (_rs.RequestState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Return rs.Error";
if (true) return _rs.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 }else {
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Return rs.MainMedia";
if (true) return _rs.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 }}
;
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="End Sub";
return null;
}
public boolean  _iswebpanimated(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "iswebpanimated", true))
	 {return ((Boolean) Debug.delegate(ba, "iswebpanimated", new Object[] {_media}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub IsWebPAnimated(Media As SMMedia) As Boo";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Return B4ASdkVersion >= 28 And Media.Meta.MediaTy";
if (true) return __ref._b4asdkversion /*int*/ >=28 && _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ==__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_webp /*int*/ ;
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="End Sub";
return false;
}
public String  _metaisready(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "metaisready", true))
	 {return ((String) Debug.delegate(ba, "metaisready", new Object[] {_meta}));}
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
int _mediatype = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub MetaIsReady (Meta As SMMediaMeta)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="For Each RequestSet As SMMediaRequestSet In Meta.";
{
final anywheresoftware.b4a.BA.IterableList group1 = _meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_requestset = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(group1.Get(index1));
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="If MediaCache.ContainsKey(Meta.Key) Then";
if (__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_meta.Key /*String*/ ))) { 
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(Meta.Key)";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_meta.Key /*String*/ )));
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="MediaCache.Remove(Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_meta.Key /*String*/ ));
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="MediaCache.Put(Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="If Media.MediaState <> STATE_LOADING Then";
if (_media.MediaState /*int*/ !=__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 };
 }else {
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="Media = CreateSMMedia(Null, Meta, IIf(Meta.Meta";
_media = __ref._createsmmedia /*b4a.DesaWisataSumpu.simplemediamanager._smmedia*/ (null,__c.Null,_meta,(int)(BA.ObjectToNumber(((_meta.MetaState /*int*/ ==__ref._state_ready /*int*/ ) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_error /*int*/ ))))));
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="MediaCache.Put(Media.Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 }else {
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_gif /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_webp /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_video /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_html /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_none /*int*/ )) {
case 0: 
case 1: 
case 2: {
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="DownloadImageMedia(Media)";
__ref._downloadimagemedia /*void*/ (null,_media);
 break; }
case 3: 
case 4: {
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="Media.MediaState = STATE_READY";
_media.MediaState /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=6357020;
 //BA.debugLineNum = 6357020;BA.debugLine="Media.Media = Meta.FirstUrl";
_media.Media /*Object*/  = (Object)(_meta.FirstUrl /*String*/ );
RDebugUtils.currentLine=6357021;
 //BA.debugLineNum = 6357021;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
case 5: {
RDebugUtils.currentLine=6357023;
 //BA.debugLineNum = 6357023;BA.debugLine="Log(\"Unexpected mime: \" & Media.Meta.Mime)";
__c.LogImpl("96357023","Unexpected mime: "+_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ,0);
RDebugUtils.currentLine=6357024;
 //BA.debugLineNum = 6357024;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
RDebugUtils.currentLine=6357025;
 //BA.debugLineNum = 6357025;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
}
;
 };
 };
 }
};
RDebugUtils.currentLine=6357030;
 //BA.debugLineNum = 6357030;BA.debugLine="Meta.WaitingRequestsSets.Clear";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=6357031;
 //BA.debugLineNum = 6357031;BA.debugLine="If Meta.MetaState = STATE_ERROR Then";
if (_meta.MetaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=6357035;
 //BA.debugLineNum = 6357035;BA.debugLine="MetaCache.Remove(Meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_meta));
 };
RDebugUtils.currentLine=6357037;
 //BA.debugLineNum = 6357037;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacacheimpl(b4a.DesaWisataSumpu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "trimmediacacheimpl", true))
	 {return ((String) Debug.delegate(ba, "trimmediacacheimpl", null));}
boolean _onlylookfordisconnectedtargets = false;
int _i = 0;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub TrimMediaCacheImpl";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="If DateTime.Now > LastTrimCache + MinTimeBetweenT";
if (__c.DateTime.getNow()>__ref._lasttrimcache /*long*/ +__ref._mintimebetweentrims /*long*/ ) { 
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim OnlyLookForDisconnectedTargets As Boolean =";
_onlylookfordisconnectedtargets = __ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._getsize /*int*/ (null)<__ref._maxmediacachesize /*int*/ ;
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="Do While i < MediaCache.Size";
while (_i<__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._getsize /*int*/ (null)) {
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(MediaCach";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i)));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="If OnlyLookForDisconnectedTargets = False And M";
if (_onlylookfordisconnectedtargets==__c.False && __ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._getsize /*int*/ (null)>__ref._maxmediacachesize /*int*/ /(double)2 && __ref._ismediastillrelevant /*boolean*/ (null,_media)==__c.False) { 
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="DeleteMedia(Media)";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 };
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 };
RDebugUtils.currentLine=6946834;
 //BA.debugLineNum = 6946834;BA.debugLine="End Sub";
return "";
}
public String  _preprocessexif(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "preprocessexif", true))
	 {return ((String) Debug.delegate(ba, "preprocessexif", new Object[] {_media,_in}));}
anywheresoftware.b4j.object.JavaObject _exifinterface = null;
int _orientation = 0;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub PreprocessExif (Media As SMMedia, In As";
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If Media.Meta.Mime <> \"image/jpeg\" Then";
if ((_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") == false) { 
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Log(\"image/jpeg mime expected!\")";
__c.LogImpl("97864325","image/jpeg mime expected!",0);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="If B4ASdkVersion >= 24 Then";
if (__ref._b4asdkversion /*int*/ >=24) { 
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Dim ExifInterface As JavaObject";
_exifinterface = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
_exifinterface.InitializeNewInstance("android.media.ExifInterface",new Object[]{(Object)(_in.getObject())});
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
_orientation = (int)(BA.ObjectToNumber(_exifinterface.RunMethod("getAttribute",new Object[]{(Object)("Orientation")})));
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="Media.Media = RotateBitmapBasedOnOrientation(Med";
_media.Media /*Object*/  = (Object)(__ref._rotatebitmapbasedonorientation /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ )),_orientation).getObject());
 };
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=7864356;
 //BA.debugLineNum = 7864356;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _rotatebitmapbasedonorientation(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "rotatebitmapbasedonorientation", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "rotatebitmapbasedonorientation", new Object[] {_bmp,_orientation}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub RotateBitmapBasedOnOrientation (bmp As";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Select orientation";
switch (_orientation) {
case 3: {
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 break; }
case 6: {
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 break; }
case 8: {
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 break; }
}
;
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="End Sub";
return null;
}
public void  _registerformeta(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "registerformeta", true))
	 {Debug.delegate(ba, "registerformeta", new Object[] {_requestset}); return;}
ResumableSub_RegisterForMeta rsub = new ResumableSub_RegisterForMeta(this,__ref,_requestset);
rsub.resume(ba, null);
}
public static class ResumableSub_RegisterForMeta extends BA.ResumableSub {
public ResumableSub_RegisterForMeta(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
this.__ref = parent;
}
b4a.DesaWisataSumpu.simplemediamanager __ref;
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.httpjob _job = null;
Object _o = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="ClearMedia(RequestSet.Target)";
__ref._clearmedia /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="ViewsRequestSet.Put(RequestSet.Target, RequestSet";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_requestset));
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet.";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="If media <> Null And media.MediaState = STATE_REA";
if (true) break;

case 1:
//if
this.state = 30;
if (_media!= null && _media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 30;
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="MediaIsReady(media)";
__ref._mediaisready /*String*/ (null,_media);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="If media <> Null And media.MediaState = STATE_ER";
if (true) break;

case 6:
//if
this.state = 9;
if (_media!= null && _media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="Log(\"Unexpected state:  media.MediaState = STAT";
parent.__c.LogImpl("96291470","Unexpected state:  media.MediaState = STATE_ERROR",0);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="RequestSet.RequestState = STATE_LOADING";
_requestset.RequestState /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="ViewsManager.AddMedia(RequestSet, MediaCache.Get";
__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._addmedia /*void*/ (null,_requestset,(b4a.DesaWisataSumpu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSumpu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),_requestset.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ );
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="If MetaCache.ContainsKey(RequestSet.MainMedia.Ke";
if (true) break;

case 10:
//if
this.state = 29;
if (__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=6291475;
 //BA.debugLineNum = 6291475;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(Request";
_meta = (b4a.DesaWisataSumpu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=6291476;
 //BA.debugLineNum = 6291476;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6291477;
 //BA.debugLineNum = 6291477;BA.debugLine="If meta.MetaState <> STATE_LOADING Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_meta.MetaState /*int*/ !=__ref._state_loading /*int*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=6291478;
 //BA.debugLineNum = 6291478;BA.debugLine="MetaIsReady(meta)";
__ref._metaisready /*String*/ (null,_meta);
 if (true) break;

case 16:
//C
this.state = 29;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=6291481;
 //BA.debugLineNum = 6291481;BA.debugLine="meta = CreateSMMediaMeta(RequestSet.MainMedia.M";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ (null,_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ,_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ,(int)(BA.ObjectToNumber((((_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ).equals(__ref._mime_unknown /*String*/ )) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_ready /*int*/ ))))),parent.__c.False);
RDebugUtils.currentLine=6291482;
 //BA.debugLineNum = 6291482;BA.debugLine="meta.FirstUrl = RequestSet.MainMedia.Url";
_meta.FirstUrl /*String*/  = _requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Url /*String*/ ;
RDebugUtils.currentLine=6291483;
 //BA.debugLineNum = 6291483;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=6291484;
 //BA.debugLineNum = 6291484;BA.debugLine="meta.Dir = RequestSet.MainMedia.Extra.GetDefaul";
_meta.Dir /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_dir /*String*/ ),(Object)("")));
RDebugUtils.currentLine=6291485;
 //BA.debugLineNum = 6291485;BA.debugLine="meta.FileName = RequestSet.MainMedia.Extra.GetD";
_meta.FileName /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_file /*String*/ ),(Object)("")));
RDebugUtils.currentLine=6291486;
 //BA.debugLineNum = 6291486;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=6291487;
 //BA.debugLineNum = 6291487;BA.debugLine="If meta.MetaState = STATE_LOADING Then";
if (true) break;

case 19:
//if
this.state = 28;
if (_meta.MetaState /*int*/ ==__ref._state_loading /*int*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=6291488;
 //BA.debugLineNum = 6291488;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=6291489;
 //BA.debugLineNum = 6291489;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=6291490;
 //BA.debugLineNum = 6291490;BA.debugLine="job.Head(RequestSet.MainMedia.Url)";
_job._head /*String*/ (null,_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Url /*String*/ );
RDebugUtils.currentLine=6291491;
 //BA.debugLineNum = 6291491;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=6291492;
 //BA.debugLineNum = 6291492;BA.debugLine="meta.Job = job";
_meta.Job /*b4a.DesaWisataSumpu.httpjob*/  = _job;
RDebugUtils.currentLine=6291493;
 //BA.debugLineNum = 6291493;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "registerformeta"), (Object)(_job));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_job = (b4a.DesaWisataSumpu.httpjob) result[1];
;
RDebugUtils.currentLine=6291494;
 //BA.debugLineNum = 6291494;BA.debugLine="meta.Job = JobEmpty";
_meta.Job /*b4a.DesaWisataSumpu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSumpu.httpjob*/ ;
RDebugUtils.currentLine=6291495;
 //BA.debugLineNum = 6291495;BA.debugLine="If job.Success Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_job._success /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=6291496;
 //BA.debugLineNum = 6291496;BA.debugLine="Dim o As Object = job.Response.ContentType";
_o = (Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentType());
RDebugUtils.currentLine=6291497;
 //BA.debugLineNum = 6291497;BA.debugLine="meta.Mime = IIf(o = Null, \"\", o).As(String)";
_meta.Mime /*String*/  = (((_o== null) ? ("") : (BA.ObjectToString(_o))));
RDebugUtils.currentLine=6291498;
 //BA.debugLineNum = 6291498;BA.debugLine="meta.MediaType = ViewsManager.MimeToMediaType";
_meta.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._mimetomediatype /*int*/ (null,_meta.Mime /*String*/ );
RDebugUtils.currentLine=6291499;
 //BA.debugLineNum = 6291499;BA.debugLine="meta.MetaState = STATE_READY";
_meta.MetaState /*int*/  = __ref._state_ready /*int*/ ;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=6291504;
 //BA.debugLineNum = 6291504;BA.debugLine="meta.MetaState = STATE_ERROR";
_meta.MetaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=6291506;
 //BA.debugLineNum = 6291506;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=6291509;
 //BA.debugLineNum = 6291509;BA.debugLine="MetaIsReady(meta)";
__ref._metaisready /*String*/ (null,_meta);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=6291514;
 //BA.debugLineNum = 6291514;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setmediafromfile(b4a.DesaWisataSumpu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _dir,String _filename,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediafromfile", true))
	 {return ((String) Debug.delegate(ba, "setmediafromfile", new Object[] {_target,_dir,_filename,_mime,_extra}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub SetMediaFromFile(Target As B4XView, Dir";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Extra.Put(REQUEST_DIR, IIf(Dir = \"\", FileName, Di";
_extra.Put((Object)(__ref._request_dir /*String*/ ),(((_dir).equals("")) ? ((Object)(_filename)) : ((Object)(_dir))));
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Extra.Put(REQUEST_FILE, IIf(Dir = \"\", \"\", FileNam";
_extra.Put((Object)(__ref._request_file /*String*/ ),(((_dir).equals("")) ? ((Object)("")) : ((Object)(_filename))));
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="If ViewsManager.MimeToMediaType(Mime) = ViewsMana";
if (__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime)==__ref._viewsmanager /*b4a.DesaWisataSumpu.smmviews*/ ._media_type_none /*int*/ ) { 
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Log(\"Invalid mime!\")";
__c.LogImpl("96160392","Invalid mime!",0);
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="SetMediaWithExtra(Target, xui.FileUri(Dir, FileNa";
__ref._setmediawithextra /*String*/ (null,_target,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .FileUri(_dir,_filename),_mime,_extra);
RDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithrequestset(b4a.DesaWisataSumpu.simplemediamanager __ref,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithrequestset", true))
	 {return ((String) Debug.delegate(ba, "setmediawithrequestset", new Object[] {_requestset}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub SetMediaWithRequestSet (RequestSet As S";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="RegisterForMeta(RequestSet)";
__ref._registerformeta /*void*/ (null,_requestset);
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacache(b4a.DesaWisataSumpu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "trimmediacache", true))
	 {return ((String) Debug.delegate(ba, "trimmediacache", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub TrimMediaCache";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="LastTrimCache = 0";
__ref._lasttrimcache /*long*/  = (long) (0);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return "";
}
}