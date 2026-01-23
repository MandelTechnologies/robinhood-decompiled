package com.robinhood.idl.serialization;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.BigDecimalExtensions;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Duration;

/* compiled from: WireDurationSerializer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "toWireDuration", "(Ljava/lang/String;)Lj$/time/Duration;", "toProtoString", "(Lj$/time/Duration;)Ljava/lang/String;", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.serialization.WireDurationSerializerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class WireDurationSerializer2 {
    public static final Duration toWireDuration(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.indexOf$default((CharSequence) str, 's', 0, false, 6, (Object) null) != StringsKt.getLastIndex(str)) {
            throw new NumberFormatException("Malformed duration string: " + str);
        }
        BigDecimal bigDecimal$default = BigDecimalExtensions.toBigDecimal$default(StringsKt.dropLast(str, 1), (Long) null, (DecimalMode) null, 3, (Object) null);
        long jLongValue = bigDecimal$default.longValue(false);
        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, ((BigDecimal) bigDecimal$default.minus(jLongValue)).moveDecimalPoint(9).longValue(false));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }

    public static final String toProtoString(Duration duration) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(duration, "<this>");
        String stringExpanded = BigDecimalExtensions.toBigDecimal$default(duration.getSeconds(), (Long) null, (DecimalMode) null, 3, (Object) null).plus(BigDecimalExtensions.toBigDecimal$default(duration.getNano(), (Long) (-9L), (DecimalMode) null, 2, (Object) null)).scale(9L).toStringExpanded();
        StringBuilder sb = new StringBuilder();
        sb.append(stringExpanded);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) stringExpanded, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default != -1 && (lastIndex = StringsKt.getLastIndex(stringExpanded) - iIndexOf$default) != 3 && lastIndex != 6 && lastIndex != 9) {
            int i = 3 - (lastIndex % 3);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('0');
            }
        }
        sb.append('s');
        return sb.toString();
    }
}
