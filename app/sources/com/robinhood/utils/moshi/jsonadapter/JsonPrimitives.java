package com.robinhood.utils.moshi.jsonadapter;

import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonPrimitives.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\b*\u00020\t¨\u0006\n"}, m3636d2 = {"toJsonPrimitive", "Lcom/robinhood/utils/moshi/jsonadapter/StringPrimitive;", "", "Ljava/util/UUID;", "Lcom/robinhood/utils/moshi/jsonadapter/BooleanPrimitive;", "", "Lcom/robinhood/utils/moshi/jsonadapter/IntegerPrimitive;", "", "Lcom/robinhood/utils/moshi/jsonadapter/DecimalPrimitive;", "Ljava/math/BigDecimal;", "lib-serialization-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.moshi.jsonadapter.JsonPrimitivesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class JsonPrimitives {
    public static final StringPrimitive toJsonPrimitive(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StringPrimitive(str);
    }

    public static final StringPrimitive toJsonPrimitive(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return toJsonPrimitive(string2);
    }

    public static final BooleanPrimitive toJsonPrimitive(boolean z) {
        return new BooleanPrimitive(z);
    }

    public static final IntegerPrimitive toJsonPrimitive(long j) {
        return new IntegerPrimitive(j);
    }

    public static final DecimalPrimitive toJsonPrimitive(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return new DecimalPrimitive(bigDecimal);
    }
}
