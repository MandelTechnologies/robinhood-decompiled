package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker3;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType, reason: use source file name */
/* loaded from: classes23.dex */
public final class SpecialTypes2 extends SpecialTypes3 implements TypeCapabilities, DefinitelyNotNullTypeMarker {
    public static final Companion Companion = new Companion(null);
    private final KotlinType4 original;
    private final boolean useCorrectedNullabilityForTypeParameters;

    public /* synthetic */ SpecialTypes2(KotlinType4 kotlinType4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType4, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    public final KotlinType4 getOriginal() {
        return this.original;
    }

    private SpecialTypes2(KotlinType4 kotlinType4, boolean z) {
        this.original = kotlinType4;
        this.useCorrectedNullabilityForTypeParameters = z;
    }

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType$Companion */
    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SpecialTypes2 makeDefinitelyNotNull$default(Companion companion, KotlinType5 kotlinType5, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.makeDefinitelyNotNull(kotlinType5, z, z2);
        }

        @JvmOverloads
        public final SpecialTypes2 makeDefinitelyNotNull(KotlinType5 type2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            if (type2 instanceof SpecialTypes2) {
                return (SpecialTypes2) type2;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2 && !makesSenseToBeDefinitelyNotNull(type2, z)) {
                return null;
            }
            if (type2 instanceof KotlinType2) {
                KotlinType2 kotlinType2 = (KotlinType2) type2;
                Intrinsics.areEqual(kotlinType2.getLowerBound().getConstructor(), kotlinType2.getUpperBound().getConstructor());
            }
            return new SpecialTypes2(flexibleTypes2.lowerIfFlexible(type2).makeNullableAsSpecified(false), z, defaultConstructorMarker);
        }

        private final boolean makesSenseToBeDefinitelyNotNull(KotlinType5 kotlinType5, boolean z) {
            if (!canHaveUndefinedNullability(kotlinType5)) {
                return false;
            }
            if (kotlinType5 instanceof StubTypes2) {
                return TypeUtils.isNullableType(kotlinType5);
            }
            ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = kotlinType5.getConstructor().mo28704getDeclarationDescriptor();
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorMo28704getDeclarationDescriptor : null;
            if (typeParameterDescriptorImpl != null && !typeParameterDescriptorImpl.isInitialized()) {
                return true;
            }
            if (z && (kotlinType5.getConstructor().mo28704getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                return TypeUtils.isNullableType(kotlinType5);
            }
            return !NewKotlinTypeChecker3.INSTANCE.isSubtypeOfAny(kotlinType5);
        }

        private final boolean canHaveUndefinedNullability(KotlinType5 kotlinType5) {
            return (kotlinType5.getConstructor() instanceof NewTypeVariableConstructor) || (kotlinType5.getConstructor().mo28704getDeclarationDescriptor() instanceof TypeParameterDescriptor) || (kotlinType5 instanceof NewCapturedType) || (kotlinType5 instanceof StubTypes2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    protected KotlinType4 getDelegate() {
        return this.original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public boolean isTypeParameter() {
        return (getDelegate().getConstructor() instanceof NewTypeVariableConstructor) || (getDelegate().getConstructor().mo28704getDeclarationDescriptor() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public KotlinType substitutionResult(KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return SpecialTypes5.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new SpecialTypes2(getDelegate().replaceAttributes(newAttributes), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType4
    public String toString() {
        return getDelegate() + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public SpecialTypes2 replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new SpecialTypes2(delegate, this.useCorrectedNullabilityForTypeParameters);
    }
}
