package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypeCapabilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeCapabilities3 {
    public static final boolean isCustomTypeParameter(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        TypeCapabilities typeCapabilities = objUnwrap instanceof TypeCapabilities ? (TypeCapabilities) objUnwrap : null;
        if (typeCapabilities != null) {
            return typeCapabilities.isTypeParameter();
        }
        return false;
    }

    public static final TypeCapabilities getCustomTypeParameter(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        TypeCapabilities typeCapabilities = objUnwrap instanceof TypeCapabilities ? (TypeCapabilities) objUnwrap : null;
        if (typeCapabilities == null || !typeCapabilities.isTypeParameter()) {
            return null;
        }
        return typeCapabilities;
    }
}
