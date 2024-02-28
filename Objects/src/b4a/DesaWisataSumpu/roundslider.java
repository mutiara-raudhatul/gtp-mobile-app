package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.roundslider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public int _mthumbbordercolor = 0;
public int _mthumbinnercolor = 0;
public int _mcirclefillcolor = 0;
public int _mcirclenonvaluecolor = 0;
public boolean _mrollover = false;
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
public String  _base_resize(b4a.DesaWisataSumpu.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(b4a.DesaWisataSumpu.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=32702469;
 //BA.debugLineNum = 32702469;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=32702471;
 //BA.debugLineNum = 32702471;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=32702472;
 //BA.debugLineNum = 32702472;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=32702473;
 //BA.debugLineNum = 32702473;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=32702475;
 //BA.debugLineNum = 32702475;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,__ref._mthumbbordercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=32702476;
 //BA.debugLineNum = 32702476;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbinnercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=32702477;
 //BA.debugLineNum = 32702477;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbbordercolor /*int*/ ,__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=32702478;
 //BA.debugLineNum = 32702478;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=32702479;
 //BA.debugLineNum = 32702479;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=32702480;
 //BA.debugLineNum = 32702480;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32702481;
 //BA.debugLineNum = 32702481;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.DesaWisataSumpu.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._mcirclenonvaluecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=32833542;
 //BA.debugLineNum = 32833542;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=32833544;
 //BA.debugLineNum = 32833544;BA.debugLine="If mValue = mMax Then";
if (__ref._mvalue /*int*/ ==__ref._mmax /*int*/ ) { 
RDebugUtils.currentLine=32833545;
 //BA.debugLineNum = 32833545;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Ce";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 }else {
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.C";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=32833548;
 //BA.debugLineNum = 32833548;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 };
RDebugUtils.currentLine=32833550;
 //BA.debugLineNum = 32833550;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._mcirclefillcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=32833552;
 //BA.debugLineNum = 32833552;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=32833553;
 //BA.debugLineNum = 32833553;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=32833554;
 //BA.debugLineNum = 32833554;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=32833555;
 //BA.debugLineNum = 32833555;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=32833556;
 //BA.debugLineNum = 32833556;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((android.graphics.Bitmap)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=32833557;
 //BA.debugLineNum = 32833557;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=32833558;
 //BA.debugLineNum = 32833558;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=32833559;
 //BA.debugLineNum = 32833559;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSumpu.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=32374791;
 //BA.debugLineNum = 32374791;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=32374792;
 //BA.debugLineNum = 32374792;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=32374793;
 //BA.debugLineNum = 32374793;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32374794;
 //BA.debugLineNum = 32374794;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32374795;
 //BA.debugLineNum = 32374795;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=32374796;
 //BA.debugLineNum = 32374796;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=32374797;
 //BA.debugLineNum = 32374797;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=32374798;
 //BA.debugLineNum = 32374798;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=32374799;
 //BA.debugLineNum = 32374799;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=32374800;
 //BA.debugLineNum = 32374800;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_mthumbbordercolor = ((int)0xff5b5b5b);
RDebugUtils.currentLine=32374801;
 //BA.debugLineNum = 32374801;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_mthumbinnercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32374802;
 //BA.debugLineNum = 32374802;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_mcirclefillcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32374803;
 //BA.debugLineNum = 32374803;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_mcirclenonvaluecolor = ((int)0xffb6b6b6);
RDebugUtils.currentLine=32374804;
 //BA.debugLineNum = 32374804;BA.debugLine="Private mRollOver As Boolean";
_mrollover = false;
RDebugUtils.currentLine=32374805;
 //BA.debugLineNum = 32374805;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.DesaWisataSumpu.roundslider __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
RDebugUtils.currentLine=32505863;
 //BA.debugLineNum = 32505863;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=32505865;
 //BA.debugLineNum = 32505865;BA.debugLine="xlbl.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=32505867;
 //BA.debugLineNum = 32505867;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=32505868;
 //BA.debugLineNum = 32505868;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=32505869;
 //BA.debugLineNum = 32505869;BA.debugLine="mRollOver = Props.GetDefault(\"RollOver\", False)";
__ref._mrollover /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RollOver"),(Object)(__c.False)));
RDebugUtils.currentLine=32505870;
 //BA.debugLineNum = 32505870;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=32505871;
 //BA.debugLineNum = 32505871;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=32505872;
 //BA.debugLineNum = 32505872;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=32505873;
 //BA.debugLineNum = 32505873;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=32505875;
 //BA.debugLineNum = 32505875;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32505876;
 //BA.debugLineNum = 32505876;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.DesaWisataSumpu.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.DesaWisataSumpu.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(b4a.DesaWisataSumpu.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=32899080;
 //BA.debugLineNum = 32899080;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=32899081;
 //BA.debugLineNum = 32899081;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=32899082;
 //BA.debugLineNum = 32899082;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=32899083;
 //BA.debugLineNum = 32899083;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=32899084;
 //BA.debugLineNum = 32899084;BA.debugLine="If mRollOver = False Then";
if (__ref._mrollover /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=32899085;
 //BA.debugLineNum = 32899085;BA.debugLine="If Abs(NewValue - mValue) > (mMax - mMin) / 2";
if (__c.Abs(_newvalue-__ref._mvalue /*int*/ )>(__ref._mmax /*int*/ -__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=32899086;
 //BA.debugLineNum = 32899086;BA.debugLine="If mValue >= (mMax + mMin) / 2 Then";
if (__ref._mvalue /*int*/ >=(__ref._mmax /*int*/ +__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=32899087;
 //BA.debugLineNum = 32899087;BA.debugLine="mValue = mMax";
__ref._mvalue /*int*/  = __ref._mmax /*int*/ ;
 }else {
RDebugUtils.currentLine=32899089;
 //BA.debugLineNum = 32899089;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
 };
 }else {
RDebugUtils.currentLine=32899092;
 //BA.debugLineNum = 32899092;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
 }else {
RDebugUtils.currentLine=32899095;
 //BA.debugLineNum = 32899095;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
RDebugUtils.currentLine=32899097;
 //BA.debugLineNum = 32899097;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=32899098;
 //BA.debugLineNum = 32899098;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=32899101;
 //BA.debugLineNum = 32899101;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=32899103;
 //BA.debugLineNum = 32899103;BA.debugLine="End Sub";
return "";
}
public String  _setcirclecolor(b4a.DesaWisataSumpu.roundslider __ref,int _nonvaluecolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setcirclecolor", true))
	 {return ((String) Debug.delegate(ba, "setcirclecolor", new Object[] {_nonvaluecolor,_innercolor}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="mCircleNonValueColor = NonValueColor";
__ref._mcirclenonvaluecolor /*int*/  = _nonvaluecolor;
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="mCircleFillColor = InnerColor";
__ref._mcirclefillcolor /*int*/  = _innercolor;
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="End Sub";
return "";
}
public String  _setrange(b4a.DesaWisataSumpu.roundslider __ref,int _newmin,int _newmax) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setrange", true))
	 {return ((String) Debug.delegate(ba, "setrange", new Object[] {_newmin,_newmax}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub SetRange(NewMin As Int, NewMax As Int)";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="mMin = NewMin";
__ref._mmin /*int*/  = _newmin;
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="mMax = NewMax";
__ref._mmax /*int*/  = _newmax;
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="setValue(mValue)";
__ref._setvalue /*String*/ (null,__ref._mvalue /*int*/ );
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.DesaWisataSumpu.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="End Sub";
return "";
}
public String  _setthumbcolor(b4a.DesaWisataSumpu.roundslider __ref,int _bordercolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setthumbcolor", true))
	 {return ((String) Debug.delegate(ba, "setthumbcolor", new Object[] {_bordercolor,_innercolor}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="mThumbBorderColor = BorderColor";
__ref._mthumbbordercolor /*int*/  = _bordercolor;
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="mThumbInnerColor = InnerColor";
__ref._mthumbinnercolor /*int*/  = _innercolor;
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="CreateThumb";
__ref._createthumb /*String*/ (null);
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="End Sub";
return "";
}
}