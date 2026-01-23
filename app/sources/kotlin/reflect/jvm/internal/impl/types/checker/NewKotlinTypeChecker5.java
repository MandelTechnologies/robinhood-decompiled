package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;

/* compiled from: NewKotlinTypeChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker, reason: use source file name */
/* loaded from: classes23.dex */
public final class NewKotlinTypeChecker5 {
    public static final NewKotlinTypeChecker5 INSTANCE = new NewKotlinTypeChecker5();

    private NewKotlinTypeChecker5() {
    }

    public final boolean strictEqualTypes(KotlinType5 a, KotlinType5 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(NewKotlinTypeChecker4.INSTANCE, a, b);
    }
}
