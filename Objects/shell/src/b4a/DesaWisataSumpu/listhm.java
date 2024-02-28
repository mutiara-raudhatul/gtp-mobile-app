
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

public class listhm implements IRemote{
	public static listhm mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public listhm() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("listhm"), "b4a.DesaWisataSumpu.listhm");
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
		pcBA = new PCBA(this, listhm.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _isdownloadready = RemoteObject.createImmutable(false);
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnrefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _loadrefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panellist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panellistitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _idhm = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _namehm = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _addresshm = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ivhm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _imgmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mediamanager = RemoteObject.declareNull("b4a.DesaWisataSumpu.simplemediamanager");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSumpu.main _main = null;
public static b4a.DesaWisataSumpu.starter _starter = null;
public static b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSumpu.mapshm _mapshm = null;
public static b4a.DesaWisataSumpu.mapsat _mapsat = null;
public static b4a.DesaWisataSumpu.detailat _detailat = null;
public static b4a.DesaWisataSumpu.detailhm _detailhm = null;
public static b4a.DesaWisataSumpu.listat _listat = null;
public static b4a.DesaWisataSumpu.listpk _listpk = null;
public static b4a.DesaWisataSumpu.detailpk _detailpk = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.homeuser _homeuser = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",listhm.mostCurrent._activity,"addressHM",listhm.mostCurrent._addresshm,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSumpu.b4xcollections.class),"BtnBack",listhm.mostCurrent._btnback,"btnRefresh",listhm.mostCurrent._btnrefresh,"CLV",listhm.mostCurrent._clv,"Core",Debug.moduleToString(b4a.DesaWisataSumpu.core.class),"DateUtils",listhm.mostCurrent._dateutils,"DetailAT",Debug.moduleToString(b4a.DesaWisataSumpu.detailat.class),"DetailHM",Debug.moduleToString(b4a.DesaWisataSumpu.detailhm.class),"DetailPK",Debug.moduleToString(b4a.DesaWisataSumpu.detailpk.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSumpu.detailrg.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSumpu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSumpu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSumpu.httputils2service.class),"idHM",listhm.mostCurrent._idhm,"imgMap",listhm.mostCurrent._imgmap,"isDownloadReady",listhm._isdownloadready,"ivHM",listhm.mostCurrent._ivhm,"ListAT",Debug.moduleToString(b4a.DesaWisataSumpu.listat.class),"ListPK",Debug.moduleToString(b4a.DesaWisataSumpu.listpk.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSumpu.listrg.class),"loadRefresh",listhm.mostCurrent._loadrefresh,"Main",Debug.moduleToString(b4a.DesaWisataSumpu.main.class),"MainScroll",listhm.mostCurrent._mainscroll,"MapsAT",Debug.moduleToString(b4a.DesaWisataSumpu.mapsat.class),"MapsHM",Debug.moduleToString(b4a.DesaWisataSumpu.mapshm.class),"MediaManager",listhm.mostCurrent._mediamanager,"nameHM",listhm.mostCurrent._namehm,"Navbar",listhm.mostCurrent._navbar,"PanelList",listhm.mostCurrent._panellist,"PanelListItem",listhm.mostCurrent._panellistitem,"Starter",Debug.moduleToString(b4a.DesaWisataSumpu.starter.class),"TitleNavbar",listhm.mostCurrent._titlenavbar,"xui",listhm._xui,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSumpu.xuiviewsutils.class)};
}
}