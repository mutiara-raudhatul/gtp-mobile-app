
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

public class listat implements IRemote{
	public static listat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public listat() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("listat"), "b4a.DesaWisataSumpu.listat");
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
		pcBA = new PCBA(this, listat.class);
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
public static RemoteObject _idat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _nameat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _priceat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ivat = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
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
		return new Object[] {"Activity",listat.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSumpu.b4xcollections.class),"BtnBack",listat.mostCurrent._btnback,"btnRefresh",listat.mostCurrent._btnrefresh,"CLV",listat.mostCurrent._clv,"Core",Debug.moduleToString(b4a.DesaWisataSumpu.core.class),"DateUtils",listat.mostCurrent._dateutils,"DetailAT",Debug.moduleToString(b4a.DesaWisataSumpu.detailat.class),"DetailHM",Debug.moduleToString(b4a.DesaWisataSumpu.detailhm.class),"DetailPK",Debug.moduleToString(b4a.DesaWisataSumpu.detailpk.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSumpu.detailrg.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSumpu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSumpu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSumpu.httputils2service.class),"idAT",listat.mostCurrent._idat,"imgMap",listat.mostCurrent._imgmap,"isDownloadReady",listat._isdownloadready,"ivAT",listat.mostCurrent._ivat,"ListHM",Debug.moduleToString(b4a.DesaWisataSumpu.listhm.class),"ListPK",Debug.moduleToString(b4a.DesaWisataSumpu.listpk.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSumpu.listrg.class),"loadRefresh",listat.mostCurrent._loadrefresh,"Main",Debug.moduleToString(b4a.DesaWisataSumpu.main.class),"MainScroll",listat.mostCurrent._mainscroll,"MapsAT",Debug.moduleToString(b4a.DesaWisataSumpu.mapsat.class),"MapsHM",Debug.moduleToString(b4a.DesaWisataSumpu.mapshm.class),"MediaManager",listat.mostCurrent._mediamanager,"nameAT",listat.mostCurrent._nameat,"Navbar",listat.mostCurrent._navbar,"PanelList",listat.mostCurrent._panellist,"PanelListItem",listat.mostCurrent._panellistitem,"priceAT",listat.mostCurrent._priceat,"Starter",Debug.moduleToString(b4a.DesaWisataSumpu.starter.class),"TitleNavbar",listat.mostCurrent._titlenavbar,"xui",listat._xui,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSumpu.xuiviewsutils.class)};
}
}