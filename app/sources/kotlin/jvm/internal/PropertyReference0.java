package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty6;

/* loaded from: classes21.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty6 {
    public PropertyReference0() {
    }

    @SinceKotlin
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.property0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public KProperty6.Getter getGetter() {
        return ((KProperty6) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty6
    @SinceKotlin
    public Object getDelegate() {
        return ((KProperty6) getReflected()).getDelegate();
    }
}
