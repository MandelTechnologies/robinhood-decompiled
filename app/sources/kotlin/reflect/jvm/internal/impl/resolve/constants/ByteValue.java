package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;

/* compiled from: constantValues.kt */
/* loaded from: classes14.dex */
public final class ByteValue extends IntegerValueConstant<Byte> {
    public ByteValue(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType4 getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        KotlinType4 byteType = module.getBuiltIns().getByteType();
        Intrinsics.checkNotNullExpressionValue(byteType, "getByteType(...)");
        return byteType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().intValue() + ".toByte()";
    }
}
