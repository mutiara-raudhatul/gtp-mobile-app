package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static b4a.DesaWisataSumpu.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.DesaWisataSumpu.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.DesaWisataSumpu.b4xbitset _s = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.DesaWisataSumpu.b4xbitset();
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSumpu.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.DesaWisataSumpu.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSumpu.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.DesaWisataSumpu.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.DesaWisataSumpu.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.DesaWisataSumpu.b4xorderedmap();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSumpu.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.DesaWisataSumpu.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSumpu.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.DesaWisataSumpu.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.DesaWisataSumpu.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim s As B4XSet";
_s = new b4a.DesaWisataSumpu.b4xset();
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="End Sub";
return null;
}
}