package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty8;

/* loaded from: classes21.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty8 {
    public PropertyReference2() {
    }

    @SinceKotlin
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.property2(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty8.Getter getGetter() {
        return ((KProperty8) getReflected()).getGetter();
    }
}
