package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* compiled from: typeSignatureMapping.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter, reason: use source file name */
/* loaded from: classes14.dex */
public class typeSignatureMapping<T> {
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;
    private final typeSignatureMapping2<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(T objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    protected final void writeJvmTypeAsIs(T type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                type2 = this.jvmTypeFactory.createFromString(StringsKt.repeat("[", this.jvmCurrentTypeArrayLevel) + this.jvmTypeFactory.toString(type2));
            }
            this.jvmCurrentType = type2;
        }
    }

    public void writeTypeVariable(Name name, T type2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        writeJvmTypeAsIs(type2);
    }
}
