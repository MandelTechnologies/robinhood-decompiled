package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: flexibleTypes.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class flexibleTypes2 {
    public static final boolean isFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof KotlinType2;
    }

    public static final KotlinType2 asFlexibleType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        Intrinsics.checkNotNull(kotlinType5Unwrap, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (KotlinType2) kotlinType5Unwrap;
    }

    public static final KotlinType4 lowerIfFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        if (kotlinType5Unwrap instanceof KotlinType2) {
            return ((KotlinType2) kotlinType5Unwrap).getLowerBound();
        }
        if (kotlinType5Unwrap instanceof KotlinType4) {
            return (KotlinType4) kotlinType5Unwrap;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final KotlinType4 upperIfFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        if (kotlinType5Unwrap instanceof KotlinType2) {
            return ((KotlinType2) kotlinType5Unwrap).getUpperBound();
        }
        if (kotlinType5Unwrap instanceof KotlinType4) {
            return (KotlinType4) kotlinType5Unwrap;
        }
        throw new NoWhenBranchMatchedException();
    }
}
