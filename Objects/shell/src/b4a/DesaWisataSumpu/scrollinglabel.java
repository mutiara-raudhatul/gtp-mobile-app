
package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class scrollinglabel {
    public static RemoteObject myClass;
	public scrollinglabel() {
	}
    public static PCBA staticBA = new PCBA(null, scrollinglabel.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mtext = RemoteObject.createImmutable("");
public static RemoteObject _taskindex = RemoteObject.createImmutable(0);
public static RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _widthpersecond = RemoteObject.createImmutable(0);
public static RemoteObject _startpositiondelay = RemoteObject.createImmutable(0);
public static RemoteObject _mtextcolor = RemoteObject.createImmutable(0);
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
public static b4a.DesaWisataSumpu.listhm _listhm = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.homeuser _homeuser = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"fnt",_ref.getField(false, "_fnt"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mText",_ref.getField(false, "_mtext"),"mTextColor",_ref.getField(false, "_mtextcolor"),"StartPositionDelay",_ref.getField(false, "_startpositiondelay"),"Tag",_ref.getField(false, "_tag"),"taskIndex",_ref.getField(false, "_taskindex"),"WidthPerSecond",_ref.getField(false, "_widthpersecond"),"xui",_ref.getField(false, "_xui")};
}
}