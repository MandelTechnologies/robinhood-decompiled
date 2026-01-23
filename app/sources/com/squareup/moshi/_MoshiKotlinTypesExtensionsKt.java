package com.squareup.moshi;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -MoshiKotlinTypesExtensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final Class<?> getRawType(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(this)");
        return rawType;
    }
}
