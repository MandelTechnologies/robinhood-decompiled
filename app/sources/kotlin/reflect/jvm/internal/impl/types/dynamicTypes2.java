package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: dynamicTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class dynamicTypes2 {
    public static final boolean isDynamic(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof dynamicTypes;
    }
}
