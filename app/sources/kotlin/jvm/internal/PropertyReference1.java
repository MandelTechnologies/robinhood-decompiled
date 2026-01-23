package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty7;

/* loaded from: classes21.dex */
public abstract class PropertyReference1 extends PropertyReference implements KProperty7 {
    public PropertyReference1() {
    }

    @SinceKotlin
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.property1(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty7.Getter getGetter() {
        return ((KProperty7) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty7
    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KProperty7) getReflected()).getDelegate(obj);
    }
}
