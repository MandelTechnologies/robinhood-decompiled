package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes3;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeCapabilities2;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement4;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeEnhancement4 extends SpecialTypes3 implements TypeCapabilities2 {
    private final KotlinType4 delegate;

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public boolean isTypeParameter() {
        return true;
    }

    public typeEnhancement4(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    protected KotlinType4 getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCapabilities
    public KotlinType substitutionResult(KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        KotlinType5 kotlinType5Unwrap = replacement.unwrap();
        if (!TypeUtils2.isTypeParameter(kotlinType5Unwrap) && !TypeUtils.isNullableType(kotlinType5Unwrap)) {
            return kotlinType5Unwrap;
        }
        if (kotlinType5Unwrap instanceof KotlinType4) {
            return prepareReplacement((KotlinType4) kotlinType5Unwrap);
        }
        if (!(kotlinType5Unwrap instanceof KotlinType2)) {
            throw new NoWhenBranchMatchedException();
        }
        KotlinType2 kotlinType2 = (KotlinType2) kotlinType5Unwrap;
        return TypeWithEnhancement4.wrapEnhancement(KotlinTypeFactory.flexibleType(prepareReplacement(kotlinType2.getLowerBound()), prepareReplacement(kotlinType2.getUpperBound())), TypeWithEnhancement4.getEnhancement(kotlinType5Unwrap));
    }

    private final KotlinType4 prepareReplacement(KotlinType4 kotlinType4) {
        KotlinType4 kotlinType4MakeNullableAsSpecified = kotlinType4.makeNullableAsSpecified(false);
        return !TypeUtils2.isTypeParameter(kotlinType4) ? kotlinType4MakeNullableAsSpecified : new typeEnhancement4(kotlinType4MakeNullableAsSpecified);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public typeEnhancement4 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new typeEnhancement4(getDelegate().replaceAttributes(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public typeEnhancement4 replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new typeEnhancement4(delegate);
    }
}
