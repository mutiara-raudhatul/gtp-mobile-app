package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.b4xfloattextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public b4a.DesaWisataSumpu.b4xfloattextfield _mnexttextfield = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
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
public String  _base_resize(b4a.DesaWisataSumpu.b4xfloattextfield __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _firstdistance = 0;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref._multiline /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="If lblV.IsInitialized Then";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__c.DipToCurrent((int) (2)));
 };
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
 };
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(b4a.DesaWisataSumpu.b4xfloattextfield __ref,String _txt,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "updatelabel", true))
	 {return ((String) Debug.delegate(ba, "updatelabel", new Object[] {_txt,_force}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ };
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(__ref._focused /*boolean*/  && _txt.length()>0);};
 }
};
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref._largelabel /*boolean*/  && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="If Focused Then";
if (__ref._focused /*boolean*/ ) { 
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 }else {
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 };
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="HintImageView.SetBitmap(b)";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
RDebugUtils.currentLine=21430288;
 //BA.debugLineNum = 21430288;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabellargeoffsetx /*int*/ ,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=21430289;
 //BA.debugLineNum = 21430289;BA.debugLine="LargeLabel = True";
__ref._largelabel /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=21430291;
 //BA.debugLineNum = 21430291;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabelsmalloffsetx /*int*/ ,__ref._hintlabelsmalloffsety /*int*/ ,(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=21430292;
 //BA.debugLineNum = 21430292;BA.debugLine="LargeLabel = False";
__ref._largelabel /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=21430294;
 //BA.debugLineNum = 21430294;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
RDebugUtils.currentLine=20774921;
 //BA.debugLineNum = 20774921;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=20774922;
 //BA.debugLineNum = 20774922;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
RDebugUtils.currentLine=20774923;
 //BA.debugLineNum = 20774923;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
RDebugUtils.currentLine=20774924;
 //BA.debugLineNum = 20774924;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="Public HintText As String";
_hinttext = "";
RDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=20774927;
 //BA.debugLineNum = 20774927;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=20774928;
 //BA.debugLineNum = 20774928;BA.debugLine="Public Focused As Boolean";
_focused = false;
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774930;
 //BA.debugLineNum = 20774930;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774931;
 //BA.debugLineNum = 20774931;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=20774932;
 //BA.debugLineNum = 20774932;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=20774933;
 //BA.debugLineNum = 20774933;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
RDebugUtils.currentLine=20774934;
 //BA.debugLineNum = 20774934;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
RDebugUtils.currentLine=20774935;
 //BA.debugLineNum = 20774935;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new b4a.DesaWisataSumpu.b4xfloattextfield();
RDebugUtils.currentLine=20774937;
 //BA.debugLineNum = 20774937;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=20774942;
 //BA.debugLineNum = 20774942;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=20774943;
 //BA.debugLineNum = 20774943;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
RDebugUtils.currentLine=20774944;
 //BA.debugLineNum = 20774944;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createacceptbutton", true))
	 {return ((String) Debug.delegate(ba, "createacceptbutton", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub CreateAcceptButton";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe5ca))));
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="lblV.Tag = \"v\"";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("v"));
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(b4a.DesaWisataSumpu.b4xfloattextfield __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createbutton", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (20)));
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4a.DesaWisataSumpu.b4xfloattextfield __ref,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_r,_color,_fnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,__ref._hinttext /*String*/ ,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createclearbutton", true))
	 {return ((String) Debug.delegate(ba, "createclearbutton", null));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Private Sub CreateClearButton";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe14c))));
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="lblClear.Tag = \"clear\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("clear"));
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createrevealbutton", true))
	 {return ((String) Debug.delegate(ba, "createrevealbutton", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub CreateRevealButton";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(b4a.DesaWisataSumpu.b4xfloattextfield __ref,boolean _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextfield", new Object[] {_password}));}
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
RDebugUtils.currentLine=22216720;
 //BA.debugLineNum = 22216720;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=22216721;
 //BA.debugLineNum = 22216721;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
RDebugUtils.currentLine=22216722;
 //BA.debugLineNum = 22216722;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(__ref._multiline /*boolean*/ ));
RDebugUtils.currentLine=22216723;
 //BA.debugLineNum = 22216723;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
RDebugUtils.currentLine=22216724;
 //BA.debugLineNum = 22216724;BA.debugLine="If Password Then";
if (_password) { 
RDebugUtils.currentLine=22216725;
 //BA.debugLineNum = 22216725;BA.debugLine="If KeyboardType <> \"Text\" Then";
if ((__ref._keyboardtype /*String*/ ).equals("Text") == false) { 
RDebugUtils.currentLine=22216726;
 //BA.debugLineNum = 22216726;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
RDebugUtils.currentLine=22216728;
 //BA.debugLineNum = 22216728;BA.debugLine="tf.InputType = Bit.Or(0x00000080, 0x00080000) '";
_tf.setInputType(__c.Bit.Or(((int)0x00000080),((int)0x00080000)));
 };
 }else {
RDebugUtils.currentLine=22216731;
 //BA.debugLineNum = 22216731;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(__ref._keyboardtype /*String*/ ,"Numbers","Decimal")) {
case 0: {
RDebugUtils.currentLine=22216733;
 //BA.debugLineNum = 22216733;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
RDebugUtils.currentLine=22216735;
 //BA.debugLineNum = 22216735;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
RDebugUtils.currentLine=22216738;
 //BA.debugLineNum = 22216738;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=22216762;
 //BA.debugLineNum = 22216762;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(b4a.DesaWisataSumpu.b4xfloattextfield __ref,boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfieldall", true))
	 {return ((String) Debug.delegate(ba, "createtextfieldall", new Object[] {_passwordmode,_font1,_textcolor}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_passwordmode);
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="mTextField.Font = Font1";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_font1);
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="mTextField.TextColor = TextColor";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="setNextField(mNextTextField)";
__ref._setnextfield /*String*/ (null,__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ );
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(b4a.DesaWisataSumpu.b4xfloattextfield __ref,b4a.DesaWisataSumpu.b4xfloattextfield _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "setnextfield", true))
	 {return ((String) Debug.delegate(ba, "setnextfield", new Object[] {_field}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="If Multiline = False Then";
if (__ref._multiline /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="If Field <> Me Then";
if ((_field).equals((b4a.DesaWisataSumpu.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .AddHandleActionEvent((android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),ba);
 };
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="mNextTextField = o";
__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/  = (b4a.DesaWisataSumpu.b4xfloattextfield)(_o);
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.DesaWisataSumpu.b4xfloattextfield __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="mProps = Props";
__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="HintImageView = iv";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=20905993;
 //BA.debugLineNum = 20905993;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref._keyboardtype /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref._hintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HintColor")));
RDebugUtils.currentLine=20906000;
 //BA.debugLineNum = 20906000;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref._nonfocusedhintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref._hinttext /*String*/  = BA.ObjectToString(_props.Get((Object)("Hint")));
RDebugUtils.currentLine=20906003;
 //BA.debugLineNum = 20906003;BA.debugLine="HintFont = PassedLabel.Font";
__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _passedlabel.getFont();
RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
RDebugUtils.currentLine=20906005;
 //BA.debugLineNum = 20906005;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref._multiline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
RDebugUtils.currentLine=20906006;
 //BA.debugLineNum = 20906006;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref._multiline /*boolean*/ ) { 
RDebugUtils.currentLine=20906007;
 //BA.debugLineNum = 20906007;BA.debugLine="Multiline = False";
__ref._multiline /*boolean*/  = __c.False;
RDebugUtils.currentLine=20906008;
 //BA.debugLineNum = 20906008;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("920906008","Multiline not supported with password mode.",0);
 };
RDebugUtils.currentLine=20906010;
 //BA.debugLineNum = 20906010;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
__ref._createtextfieldall /*String*/ (null,_passwordmode,_passedlabel.getFont(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor())));
RDebugUtils.currentLine=20906012;
 //BA.debugLineNum = 20906012;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20906013;
 //BA.debugLineNum = 20906013;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20906014;
 //BA.debugLineNum = 20906014;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=20906015;
 //BA.debugLineNum = 20906015;BA.debugLine="MeasuringCanvas.Initialize(p)";
__ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=20906016;
 //BA.debugLineNum = 20906016;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=20906017;
 //BA.debugLineNum = 20906017;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=20906018;
 //BA.debugLineNum = 20906018;BA.debugLine="CreateRevealButton";
__ref._createrevealbutton /*String*/ (null);
 }else {
RDebugUtils.currentLine=20906020;
 //BA.debugLineNum = 20906020;BA.debugLine="CreateClearButton";
__ref._createclearbutton /*String*/ (null);
 };
RDebugUtils.currentLine=20906022;
 //BA.debugLineNum = 20906022;BA.debugLine="CreateAcceptButton";
__ref._createacceptbutton /*String*/ (null);
RDebugUtils.currentLine=20906023;
 //BA.debugLineNum = 20906023;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20906024;
 //BA.debugLineNum = 20906024;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._largelabeltextsize /*float*/ );
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._smalllabeltextsize /*float*/ );
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.b4xfloattextfield  _getnextfield(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "getnextfield", true))
	 {return ((b4a.DesaWisataSumpu.b4xfloattextfield) Debug.delegate(ba, "getnextfield", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Return mNextTextField";
if (true) return __ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ ;
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Return mTextField.Text";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettextfield", null));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub getTextField As B4XView";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return mTextField";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "ime_handleaction", true))
	 {return ((Boolean) Debug.delegate(ba, "ime_handleaction", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub ime_HandleAction As Boolean";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="End Sub";
return false;
}
public String  _tf_enterpressed(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tf_enterpressed", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub tf_EnterPressed";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="tf_Action";
__ref._tf_action /*String*/ (null);
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.DesaWisataSumpu.b4xfloattextfield __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="HintLabelLargeOffsetX = 6dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (6));
 }else {
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="HintLabelLargeOffsetX = 12dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (12));
 };
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="IME.Initialize(\"ime\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("ime");
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="End Sub";
return "";
}
public String  _lc_click(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_click", true))
	 {return ((String) Debug.delegate(ba, "lc_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub lc_Click";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="setText(\"\")";
__ref._settext /*String*/ (null,"");
 break; }
case 1: {
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="SwitchFromPasswordToRegular (True)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="SwitchFromPasswordToRegular(False)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()==__c.False || (__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ ).equals((b4a.DesaWisataSumpu.b4xfloattextfield)(this))) { 
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 };
 break; }
}
;
RDebugUtils.currentLine=22413331;
 //BA.debugLineNum = 22413331;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.DesaWisataSumpu.b4xfloattextfield __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_s}));}
String _old = "";
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub setText(s As String)";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="mTextField.Text = s";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_s));
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
__ref._tf_textchanged /*String*/ (null,_old,_s);};
RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="End Sub";
return "";
}
public void  _switchfrompasswordtoregular(b4a.DesaWisataSumpu.b4xfloattextfield __ref,boolean _toregular) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "switchfrompasswordtoregular", true))
	 {Debug.delegate(ba, "switchfrompasswordtoregular", new Object[] {_toregular}); return;}
ResumableSub_SwitchFromPasswordToRegular rsub = new ResumableSub_SwitchFromPasswordToRegular(this,__ref,_toregular);
rsub.resume(ba, null);
}
public static class ResumableSub_SwitchFromPasswordToRegular extends BA.ResumableSub {
public ResumableSub_SwitchFromPasswordToRegular(b4a.DesaWisataSumpu.b4xfloattextfield parent,b4a.DesaWisataSumpu.b4xfloattextfield __ref,boolean _toregular) {
this.parent = parent;
this.__ref = __ref;
this._toregular = _toregular;
this.__ref = parent;
}
b4a.DesaWisataSumpu.b4xfloattextfield __ref;
b4a.DesaWisataSumpu.b4xfloattextfield parent;
boolean _toregular;
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Dim text As String = mTextField.Text";
_text = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
__ref._createtextfieldall /*String*/ (null,parent.__c.Not(_toregular),_font1,_textcolor);
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="mTextField.Text = text";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="If lblClear.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="If ToRegular = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_toregular==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=21233675;
 //BA.debugLineNum = 21233675;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21233677;
 //BA.debugLineNum = 21233677;BA.debugLine="lblClear.Tag = \"hide\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("hide"));
RDebugUtils.currentLine=21233678;
 //BA.debugLineNum = 21233678;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f5))));
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=21233680;
 //BA.debugLineNum = 21233680;BA.debugLine="lblClear.BringToFront";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
 if (true) break;
;
RDebugUtils.currentLine=21233682;
 //BA.debugLineNum = 21233682;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";

case 10:
//if
this.state = 15;
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=21233683;
 //BA.debugLineNum = 21233683;BA.debugLine="HintImageView.BringToFront";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21233689;
 //BA.debugLineNum = 21233689;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=21233690;
 //BA.debugLineNum = 21233690;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=21233692;
 //BA.debugLineNum = 21233692;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
__ref._lastswitchtextfieldtime /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=21233693;
 //BA.debugLineNum = 21233693;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=21233694;
 //BA.debugLineNum = 21233694;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
RDebugUtils.currentLine=21233696;
 //BA.debugLineNum = 21233696;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now + 200";
__ref._lastswitchtextfieldtime /*long*/  = (long) (parent.__c.DateTime.getNow()+200);
RDebugUtils.currentLine=21233697;
 //BA.debugLineNum = 21233697;BA.debugLine="et.Enabled = False";
_et.setEnabled(parent.__c.False);
RDebugUtils.currentLine=21233698;
 //BA.debugLineNum = 21233698;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
RDebugUtils.currentLine=21233699;
 //BA.debugLineNum = 21233699;BA.debugLine="et.Enabled = True";
_et.setEnabled(parent.__c.True);
RDebugUtils.currentLine=21233700;
 //BA.debugLineNum = 21233700;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=21233701;
 //BA.debugLineNum = 21233701;BA.debugLine="et.RequestFocus";
_et.RequestFocus();
RDebugUtils.currentLine=21233702;
 //BA.debugLineNum = 21233702;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=21233704;
 //BA.debugLineNum = 21233704;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=21233705;
 //BA.debugLineNum = 21233705;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(Object)(_toregular));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=21233707;
 //BA.debugLineNum = 21233707;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _requestfocusandshowkeyboard(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "requestfocusandshowkeyboard", true))
	 {return ((String) Debug.delegate(ba, "requestfocusandshowkeyboard", null));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(b4a.DesaWisataSumpu.b4xfloattextfield __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_textchanged", true))
	 {return ((String) Debug.delegate(ba, "tf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="UpdateLabel(New, False)";
__ref._updatelabel /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2)) && __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));
 };
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="End Sub";
return "";
}
public String  _tf_action(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_action", true))
	 {return ((String) Debug.delegate(ba, "tf_action", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub tf_Action";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ .IsInitialized /*boolean*/ () && (__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ ).equals((b4a.DesaWisataSumpu.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="mNextTextField.TextField.RequestFocus";
__ref._mnexttextfield /*b4a.DesaWisataSumpu.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
 };
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");
 };
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_beginedit", true))
	 {return ((String) Debug.delegate(ba, "tf_beginedit", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub tf_BeginEdit";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="tf_FocusChanged(True)";
__ref._tf_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(b4a.DesaWisataSumpu.b4xfloattextfield __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "tf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Focused = HasFocus";
__ref._focused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (__ref._lastswitchtextfieldtime /*long*/ +100<__c.DateTime.getNow()) { 
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__ref._focused /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit(b4a.DesaWisataSumpu.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_endedit", true))
	 {return ((String) Debug.delegate(ba, "tf_endedit", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub tf_EndEdit";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="tf_FocusChanged(False)";
__ref._tf_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}