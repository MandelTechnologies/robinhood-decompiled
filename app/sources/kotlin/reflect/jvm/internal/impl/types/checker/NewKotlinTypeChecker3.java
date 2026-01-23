package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker2;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker3;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.flexibleTypes2;
import kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util;

/* compiled from: NewKotlinTypeChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker, reason: use source file name */
/* loaded from: classes14.dex */
public final class NewKotlinTypeChecker3 {
    public static final NewKotlinTypeChecker3 INSTANCE = new NewKotlinTypeChecker3();

    private NewKotlinTypeChecker3() {
    }

    public final boolean isSubtypeOfAny(KotlinType5 type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return AbstractTypeChecker2.INSTANCE.hasNotNullSupertype(TypeCheckerProviderContext$$Util.newTypeCheckerState$default(NewKotlinTypeChecker4.INSTANCE, false, true, false, 4, null), flexibleTypes2.lowerIfFlexible(type2), AbstractTypeChecker3.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
