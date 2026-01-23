package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer4;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: flexibleTypes.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl, reason: use source file name */
/* loaded from: classes14.dex */
public final class flexibleTypes extends KotlinType2 implements TypeCapabilities {
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    /* compiled from: flexibleTypes.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flexibleTypes(KotlinType4 lowerBound, KotlinType4 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    private final void runAssertions() {
        if (!RUN_SLOW_ASSERTIONS || this.assertionsDone) {
            return;
        }
        this.assertionsDone = true;
        flexibleTypes2.isFlexible(getLowerBound());
        flexibleTypes2.isFlexible(getUpperBound());
        Intrinsics.areEqual(getLowerBound(), getUpperBound());
        KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType2
    public KotlinType4 getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public boolean isTypeParameter() {
        return (getLowerBound().getConstructor().mo28704getDeclarationDescriptor() instanceof TypeParameterDescriptor) && Intrinsics.areEqual(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public KotlinType substitutionResult(KotlinType replacement) {
        KotlinType5 kotlinType5FlexibleType;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        KotlinType5 kotlinType5Unwrap = replacement.unwrap();
        if (kotlinType5Unwrap instanceof KotlinType2) {
            kotlinType5FlexibleType = kotlinType5Unwrap;
        } else {
            if (!(kotlinType5Unwrap instanceof KotlinType4)) {
                throw new NoWhenBranchMatchedException();
            }
            KotlinType4 kotlinType4 = (KotlinType4) kotlinType5Unwrap;
            kotlinType5FlexibleType = KotlinTypeFactory.flexibleType(kotlinType4, kotlinType4.makeNullableAsSpecified(true));
        }
        return TypeWithEnhancement4.inheritEnhancement(kotlinType5FlexibleType, kotlinType5Unwrap);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType5 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return KotlinTypeFactory.flexibleType(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType2
    public String render(DescriptorRenderer renderer, DescriptorRenderer4 options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        if (options.getDebugMode()) {
            return '(' + renderer.renderType(getLowerBound()) + ".." + renderer.renderType(getUpperBound()) + ')';
        }
        return renderer.renderFlexibleType(renderer.renderType(getLowerBound()), renderer.renderType(getUpperBound()), TypeUtils2.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType2
    public String toString() {
        return '(' + getLowerBound() + ".." + getUpperBound() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType5 makeNullableAsSpecified(boolean z) {
        return KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType2 refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new flexibleTypes((KotlinType4) kotlinTypeRefineType, (KotlinType4) kotlinTypeRefineType2);
    }
}
