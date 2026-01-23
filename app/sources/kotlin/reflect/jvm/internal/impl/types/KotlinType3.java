package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class KotlinType3 {
    public static final boolean isNullable(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return TypeUtils.isNullableType(kotlinType);
    }

    public static final boolean isError(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        if (kotlinType5Unwrap instanceof ErrorType) {
            return true;
        }
        return (kotlinType5Unwrap instanceof KotlinType2) && (((KotlinType2) kotlinType5Unwrap).getDelegate() instanceof ErrorType);
    }
}
