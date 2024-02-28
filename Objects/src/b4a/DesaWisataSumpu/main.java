package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (homevisitor.mostCurrent != null);
vis = vis | (mapshm.mostCurrent != null);
vis = vis | (mapsat.mostCurrent != null);
vis = vis | (detailat.mostCurrent != null);
vis = vis | (detailhm.mostCurrent != null);
vis = vis | (listat.mostCurrent != null);
vis = vis | (listpk.mostCurrent != null);
vis = vis | (detailpk.mostCurrent != null);
vis = vis | (listhm.mostCurrent != null);
vis = vis | (detailrg.mostCurrent != null);
vis = vis | (homeuser.mostCurrent != null);
vis = vis | (listrg.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (homevisitor.previousOne != null) {
				__a = homevisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homevisitor.mostCurrent == null ? null : homevisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapshm.previousOne != null) {
				__a = mapshm.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapshm.mostCurrent == null ? null : mapshm.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsat.previousOne != null) {
				__a = mapsat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsat.mostCurrent == null ? null : mapsat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailat.previousOne != null) {
				__a = detailat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailat.mostCurrent == null ? null : detailat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailhm.previousOne != null) {
				__a = detailhm.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailhm.mostCurrent == null ? null : detailhm.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listat.previousOne != null) {
				__a = listat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listat.mostCurrent == null ? null : listat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listpk.previousOne != null) {
				__a = listpk.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listpk.mostCurrent == null ? null : listpk.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailpk.previousOne != null) {
				__a = detailpk.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailpk.mostCurrent == null ? null : detailpk.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listhm.previousOne != null) {
				__a = listhm.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listhm.mostCurrent == null ? null : listhm.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailrg.previousOne != null) {
				__a = detailrg.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailrg.mostCurrent == null ? null : detailrg.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homeuser.previousOne != null) {
				__a = homeuser.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homeuser.mostCurrent == null ? null : homeuser.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listrg.previousOne != null) {
				__a = listrg.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listrg.mostCurrent == null ? null : listrg.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _server = "";
public static String _api = "";
public static anywheresoftware.b4a.objects.collections.Map _data = null;
public static anywheresoftware.b4a.objects.collections.Map _user = null;
public static String _id = "";
public static String _username = "";
public static String _email = "";
public static String _first_name = "";
public static String _last_name = "";
public static String _avatar = "";
public static String _address = "";
public static String _phone = "";
public static boolean _in_group = false;
public static anywheresoftware.b4a.objects.preferenceactivity.PreferenceManager _manager = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvisitor = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagelogin = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogin = null;
public b4a.example.dateutils _dateutils = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If manager.GetBoolean(\"is_login\") Then";
if (_manager.GetBoolean("is_login")) { 
 }else {
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="manager.SetBoolean(\"user\", False)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="StartActivity(HomeVisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
 };
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="CheckLogin";
_checklogin();
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="MainScroll.Panel.LoadLayout(\"Login\")";
mostCurrent._mainscroll.getPanel().LoadLayout("Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="PanelLogin.Height = MainScroll.Height";
mostCurrent._panellogin.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="End Sub";
return "";
}
public static String  _checklogin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checklogin", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checklogin", null));}
boolean _islogin = false;
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Sub CheckLogin";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Log(\"Checking login status...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("035323905","Checking login status...",0);
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
_islogin = _manager.GetBoolean("is_login");
RDebugUtils.currentLine=35323908;
 //BA.debugLineNum = 35323908;BA.debugLine="If isLogin Then";
if (_islogin) { 
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="If manager.GetBoolean(\"user\") Then";
if (_manager.GetBoolean("user")) { 
RDebugUtils.currentLine=35323910;
 //BA.debugLineNum = 35323910;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("035323910","Redirecting to HomeUser activity",0);
RDebugUtils.currentLine=35323911;
 //BA.debugLineNum = 35323911;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=35323912;
 //BA.debugLineNum = 35323912;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 };
 };
RDebugUtils.currentLine=35323915;
 //BA.debugLineNum = 35323915;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(\"Login loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("0196609","Login loaded",0);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"Hanafi\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("0196610","Resume: "+BA.ObjectToString(_manager.GetBoolean("Hanafi")),0);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Private Sub BtnLogin_Click";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Core.ExecuteUrl(API&\"login\", \"login=\"&EditLogin.T";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,_api+"login","login="+mostCurrent._editlogin.getText()+"&password="+mostCurrent._editpassword.getText(),"Login",main.getObject());
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="End Sub";
return "";
}
public static String  _btnvisitor_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvisitor_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvisitor_click", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Private Sub BtnVisitor_Click";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("035192833","Redirecting to HomeVisitor Activity",0);
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="manager.SetBoolean(\"user\", False)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35192837;
 //BA.debugLineNum = 35192837;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="StartActivity(HomeVisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _error = "";
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("035389441","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="Try";
try {RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=35389446;
 //BA.debugLineNum = 35389446;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("035389448","Response from server :"+_res,0);
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35389451;
 //BA.debugLineNum = 35389451;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=35389452;
 //BA.debugLineNum = 35389452;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=35389453;
 //BA.debugLineNum = 35389453;BA.debugLine="in_group = data.Get(\"in_group\")";
_in_group = BA.ObjectToBoolean(_data.Get((Object)("in_group")));
RDebugUtils.currentLine=35389454;
 //BA.debugLineNum = 35389454;BA.debugLine="If in_group Then";
if (_in_group) { 
RDebugUtils.currentLine=35389455;
 //BA.debugLineNum = 35389455;BA.debugLine="user = data.Get(\"user\")";
_user = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get((Object)("user"))));
RDebugUtils.currentLine=35389456;
 //BA.debugLineNum = 35389456;BA.debugLine="id = user.Get(\"id\")";
_id = BA.ObjectToString(_user.Get((Object)("id")));
RDebugUtils.currentLine=35389457;
 //BA.debugLineNum = 35389457;BA.debugLine="email = user.Get(\"email\")";
_email = BA.ObjectToString(_user.Get((Object)("email")));
RDebugUtils.currentLine=35389458;
 //BA.debugLineNum = 35389458;BA.debugLine="username = user.Get(\"username\")";
_username = BA.ObjectToString(_user.Get((Object)("username")));
RDebugUtils.currentLine=35389459;
 //BA.debugLineNum = 35389459;BA.debugLine="first_name = user.Get(\"first_name\")";
_first_name = BA.ObjectToString(_user.Get((Object)("first_name")));
RDebugUtils.currentLine=35389460;
 //BA.debugLineNum = 35389460;BA.debugLine="last_name = user.Get(\"last_name\")";
_last_name = BA.ObjectToString(_user.Get((Object)("last_name")));
RDebugUtils.currentLine=35389461;
 //BA.debugLineNum = 35389461;BA.debugLine="avatar = user.Get(\"avatar\")";
_avatar = BA.ObjectToString(_user.Get((Object)("avatar")));
RDebugUtils.currentLine=35389462;
 //BA.debugLineNum = 35389462;BA.debugLine="address = user.Get(\"address\")";
_address = BA.ObjectToString(_user.Get((Object)("address")));
RDebugUtils.currentLine=35389463;
 //BA.debugLineNum = 35389463;BA.debugLine="phone = user.Get(\"phone\")";
_phone = BA.ObjectToString(_user.Get((Object)("phone")));
RDebugUtils.currentLine=35389465;
 //BA.debugLineNum = 35389465;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login as User"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35389466;
 //BA.debugLineNum = 35389466;BA.debugLine="Msgbox(\"Hi, \"&first_name&\" \"&last_name, \"Logge";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Hi, "+_first_name+" "+_last_name),BA.ObjectToCharSequence("Logged In"),mostCurrent.activityBA);
RDebugUtils.currentLine=35389467;
 //BA.debugLineNum = 35389467;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("035389467","Redirect to HomeUser Activity",0);
RDebugUtils.currentLine=35389469;
 //BA.debugLineNum = 35389469;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35389470;
 //BA.debugLineNum = 35389470;BA.debugLine="manager.SetBoolean(\"user\", True)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35389471;
 //BA.debugLineNum = 35389471;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35389472;
 //BA.debugLineNum = 35389472;BA.debugLine="manager.SetString(\"user_id\", id)";
_manager.SetString("user_id",_id);
RDebugUtils.currentLine=35389473;
 //BA.debugLineNum = 35389473;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=35389474;
 //BA.debugLineNum = 35389474;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 }else {
RDebugUtils.currentLine=35389476;
 //BA.debugLineNum = 35389476;BA.debugLine="Msgbox(\"Please input correct credentials\", \"Lo";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please input correct credentials"),BA.ObjectToCharSequence("Login Failed"),mostCurrent.activityBA);
 };
 } 
       catch (Exception e36) {
			processBA.setLastException(e36);RDebugUtils.currentLine=35389479;
 //BA.debugLineNum = 35389479;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("035389479",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=35389482;
 //BA.debugLineNum = 35389482;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=35389483;
 //BA.debugLineNum = 35389483;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=35389485;
 //BA.debugLineNum = 35389485;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35389486;
 //BA.debugLineNum = 35389486;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=35389487;
 //BA.debugLineNum = 35389487;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("035389487","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=35389489;
 //BA.debugLineNum = 35389489;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=35389490;
 //BA.debugLineNum = 35389490;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=35389491;
 //BA.debugLineNum = 35389491;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=35389493;
 //BA.debugLineNum = 35389493;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=35389494;
 //BA.debugLineNum = 35389494;BA.debugLine="End Sub";
return "";
}
}