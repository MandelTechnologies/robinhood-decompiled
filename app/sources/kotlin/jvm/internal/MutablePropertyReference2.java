package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty5;
import kotlin.reflect.KProperty8;

/* loaded from: classes14.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KProperty5 {
    public MutablePropertyReference2() {
    }

    @SinceKotlin
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.mutableProperty2(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty8.Getter getGetter() {
        return ((KProperty5) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty2
    public KProperty5.Setter getSetter() {
        return ((KProperty5) getReflected()).getSetter();
    }
}
