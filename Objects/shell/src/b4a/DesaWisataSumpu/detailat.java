
package b4a.DesaWisataSumpu;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class detailat implements IRemote{
	public static detailat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public detailat() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("detailat"), "b4a.DesaWisataSumpu.detailat");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, detailat.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mywebviewextras = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
public static RemoteObject _mywebviewsettings = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _wvdetail = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSumpu.main _main = null;
public static b4a.DesaWisataSumpu.starter _starter = null;
public static b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSumpu.mapshm _mapshm = null;
public static b4a.DesaWisataSumpu.mapsat _mapsat = null;
public static b4a.DesaWisataSumpu.detailhm _detailhm = null;
public static b4a.DesaWisataSumpu.listat _listat = null;
public static b4a.DesaWisataSumpu.listpk _listpk = null;
public static b4a.DesaWisataSumpu.detailpk _detailpk = null;
public static b4a.DesaWisataSumpu.listhm _listhm = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.homeuser _homeuser = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",detailat.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSumpu.b4xcollections.class),"BtnBack",detailat.mostCurrent._btnback,"Core",Debug.moduleToString(b4a.DesaWisataSumpu.core.class),"DateUtils",detailat.mostCurrent._dateutils,"DetailHM",Debug.moduleToString(b4a.DesaWisataSumpu.detailhm.class),"DetailPK",Debug.moduleToString(b4a.DesaWisataSumpu.detailpk.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSumpu.detailrg.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSumpu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSumpu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSumpu.httputils2service.class),"ListAT",Debug.moduleToString(b4a.DesaWisataSumpu.listat.class),"ListHM",Debug.moduleToString(b4a.DesaWisataSumpu.listhm.class),"ListPK",Debug.moduleToString(b4a.DesaWisataSumpu.listpk.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSumpu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSumpu.main.class),"MainScroll",detailat.mostCurrent._mainscroll,"MapsAT",Debug.moduleToString(b4a.DesaWisataSumpu.mapsat.class),"MapsHM",Debug.moduleToString(b4a.DesaWisataSumpu.mapshm.class),"MyWebViewExtras",detailat.mostCurrent._mywebviewextras,"MyWebViewSettings",detailat.mostCurrent._mywebviewsettings,"Navbar",detailat.mostCurrent._navbar,"Starter",Debug.moduleToString(b4a.DesaWisataSumpu.starter.class),"TitleNavbar",detailat.mostCurrent._titlenavbar,"wvDetail",detailat.mostCurrent._wvdetail,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSumpu.xuiviewsutils.class)};
}
}