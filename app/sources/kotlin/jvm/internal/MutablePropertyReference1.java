package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty4;
import kotlin.reflect.KProperty7;

/* loaded from: classes21.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KProperty4 {
    public MutablePropertyReference1() {
    }

    @SinceKotlin
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty7.Getter getGetter() {
        return ((KProperty4) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty2
    public KProperty4.Setter getSetter() {
        return ((KProperty4) getReflected()).getSetter();
    }

    @Override // kotlin.reflect.KProperty7
    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KProperty4) getReflected()).getDelegate(obj);
    }
}
