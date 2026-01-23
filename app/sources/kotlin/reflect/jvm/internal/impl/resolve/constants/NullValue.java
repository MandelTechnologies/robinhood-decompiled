package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;

/* compiled from: constantValues.kt */
/* loaded from: classes14.dex */
public final class NullValue extends ConstantValue<Void> {
    public NullValue() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType4 getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        KotlinType4 nullableNothingType = module.getBuiltIns().getNullableNothingType();
        Intrinsics.checkNotNullExpressionValue(nullableNothingType, "getNullableNothingType(...)");
        return nullableNothingType;
    }
}
