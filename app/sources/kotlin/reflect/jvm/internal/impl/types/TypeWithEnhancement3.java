package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeWithEnhancement3 extends SpecialTypes3 implements TypeWithEnhancement {
    private final KotlinType4 delegate;
    private final KotlinType enhancement;

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    protected KotlinType4 getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    public TypeWithEnhancement3(KotlinType4 delegate, KotlinType enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.delegate = delegate;
        this.enhancement = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType4 getOrigin() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        KotlinType5 kotlinType5WrapEnhancement = TypeWithEnhancement4.wrapEnhancement(getOrigin().replaceAttributes(newAttributes), getEnhancement());
        Intrinsics.checkNotNull(kotlinType5WrapEnhancement, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (KotlinType4) kotlinType5WrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 makeNullableAsSpecified(boolean z) {
        KotlinType5 kotlinType5WrapEnhancement = TypeWithEnhancement4.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
        Intrinsics.checkNotNull(kotlinType5WrapEnhancement, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (KotlinType4) kotlinType5WrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public TypeWithEnhancement3 replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new TypeWithEnhancement3(delegate, getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType5, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeWithEnhancement3 refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new TypeWithEnhancement3((KotlinType4) kotlinTypeRefineType, kotlinTypeRefiner.refineType((KotlinTypeMarker) getEnhancement()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType4
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }
}
