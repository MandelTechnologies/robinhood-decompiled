package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty2;

/* loaded from: classes21.dex */
public abstract class MutablePropertyReference extends PropertyReference implements KProperty2 {
    public MutablePropertyReference() {
    }

    @SinceKotlin
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
