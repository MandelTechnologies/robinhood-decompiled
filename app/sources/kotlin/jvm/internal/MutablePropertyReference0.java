package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty3;
import kotlin.reflect.KProperty6;

/* loaded from: classes21.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KProperty3 {
    public MutablePropertyReference0() {
    }

    @SinceKotlin
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public KProperty6.Getter getGetter() {
        return ((KProperty3) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty2
    public KProperty3.Setter getSetter() {
        return ((KProperty3) getReflected()).getSetter();
    }

    @Override // kotlin.reflect.KProperty6
    @SinceKotlin
    public Object getDelegate() {
        return ((KProperty3) getReflected()).getDelegate();
    }
}
