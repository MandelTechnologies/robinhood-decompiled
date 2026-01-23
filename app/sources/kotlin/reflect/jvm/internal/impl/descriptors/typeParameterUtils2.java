package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeParameterUtils2 {
    private final List<TypeProjection> arguments;
    private final ClassifierDescriptorWithTypeParameters classifierDescriptor;
    private final typeParameterUtils2 outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public typeParameterUtils2(ClassifierDescriptorWithTypeParameters classifierDescriptor, List<? extends TypeProjection> arguments, typeParameterUtils2 typeparameterutils2) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifierDescriptor = classifierDescriptor;
        this.arguments = arguments;
        this.outerType = typeparameterutils2;
    }

    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public final typeParameterUtils2 getOuterType() {
        return this.outerType;
    }
}
