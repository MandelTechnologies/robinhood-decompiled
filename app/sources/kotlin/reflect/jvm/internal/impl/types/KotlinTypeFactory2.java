package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class KotlinTypeFactory2 extends SpecialTypes3 {
    private final KotlinType4 delegate;

    public KotlinTypeFactory2(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    protected KotlinType4 getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != getAttributes() ? new KotlinTypeFactory7(this, newAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public KotlinType4 makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z).replaceAttributes(getAttributes());
    }
}
