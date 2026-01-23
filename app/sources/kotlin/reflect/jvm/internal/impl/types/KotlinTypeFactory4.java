package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.NotNullSimpleType, reason: use source file name */
/* loaded from: classes14.dex */
final class KotlinTypeFactory4 extends KotlinTypeFactory2 {
    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory4(KotlinType4 delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SpecialTypes3
    public KotlinTypeFactory4 replaceDelegate(KotlinType4 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new KotlinTypeFactory4(delegate);
    }
}
