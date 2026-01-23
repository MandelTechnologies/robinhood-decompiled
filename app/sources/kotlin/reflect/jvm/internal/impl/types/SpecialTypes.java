package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.AbbreviatedType, reason: use source file name */
/* loaded from: classes14.dex */
public final class SpecialTypes extends SpecialTypes3 {
    private final KotlinType4 abbreviation;
    private final KotlinType4 delegate;

    public SpecialTypes(KotlinType4 delegate, KotlinType4 abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.delegate = delegate;
        this.abbreviation = abbreviation;
    }

    public final KotlinType4 getAbbreviation() {
        return this.abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    protected KotlinType4 getDelegate() {
        return this.delegate;
    }

    public final KotlinType4 getExpandedType() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new SpecialTypes(getDelegate().replaceAttributes(newAttributes), this.abbreviation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public SpecialTypes makeNullableAsSpecified(boolean z) {
        return new SpecialTypes(getDelegate().makeNullableAsSpecified(z), this.abbreviation.makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public SpecialTypes replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new SpecialTypes(delegate, this.abbreviation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType5, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public SpecialTypes refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.abbreviation);
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new SpecialTypes((KotlinType4) kotlinTypeRefineType, (KotlinType4) kotlinTypeRefineType2);
    }
}
