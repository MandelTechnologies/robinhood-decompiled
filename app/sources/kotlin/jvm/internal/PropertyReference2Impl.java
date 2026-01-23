package kotlin.jvm.internal;

import kotlin.SinceKotlin;

/* loaded from: classes21.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    @SinceKotlin
    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty8
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
