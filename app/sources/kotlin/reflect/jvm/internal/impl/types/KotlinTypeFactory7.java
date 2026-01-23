package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes, reason: use source file name */
/* loaded from: classes14.dex */
final class KotlinTypeFactory7 extends KotlinTypeFactory2 {
    private final TypeAttributes attributes;

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory7(KotlinType4 delegate, TypeAttributes attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.attributes = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public KotlinTypeFactory7 replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new KotlinTypeFactory7(delegate, getAttributes());
    }
}
