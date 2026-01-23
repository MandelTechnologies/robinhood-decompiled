package kotlin.jvm.internal;

import kotlin.SinceKotlin;

/* loaded from: classes14.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    @SinceKotlin
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty8
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
