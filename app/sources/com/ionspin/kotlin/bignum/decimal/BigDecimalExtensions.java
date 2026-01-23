package com.ionspin.kotlin.bignum.decimal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimalExtensions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\b\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\t2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\n\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, m3636d2 = {"", "exponentModifier", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "decimalMode", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "toBigDecimal", "(JLjava/lang/Long;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "(ILjava/lang/Long;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "(Ljava/lang/String;Ljava/lang/Long;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "(DLjava/lang/Long;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.decimal.BigDecimalExtensionsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class BigDecimalExtensions {
    public static /* synthetic */ BigDecimal toBigDecimal$default(long j, Long l, DecimalMode decimalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            decimalMode = null;
        }
        return toBigDecimal(j, l, decimalMode);
    }

    public static final BigDecimal toBigDecimal(long j, Long l, DecimalMode decimalMode) {
        return BigDecimal.Companion.fromLong(j, decimalMode).moveDecimalPoint(l != null ? l.longValue() : 0L);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(int i, Long l, DecimalMode decimalMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            decimalMode = null;
        }
        return toBigDecimal(i, l, decimalMode);
    }

    public static final BigDecimal toBigDecimal(int i, Long l, DecimalMode decimalMode) {
        return BigDecimal.Companion.fromInt(i, decimalMode).moveDecimalPoint(l != null ? l.longValue() : 0L);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(String str, Long l, DecimalMode decimalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            decimalMode = null;
        }
        return toBigDecimal(str, l, decimalMode);
    }

    public static final BigDecimal toBigDecimal(String str, Long l, DecimalMode decimalMode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return BigDecimal.Companion.parseStringWithMode(str, decimalMode).moveDecimalPoint(l != null ? l.longValue() : 0L);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(double d, Long l, DecimalMode decimalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            decimalMode = null;
        }
        return toBigDecimal(d, l, decimalMode);
    }

    public static final BigDecimal toBigDecimal(double d, Long l, DecimalMode decimalMode) {
        return BigDecimal.Companion.fromDouble(d, decimalMode).moveDecimalPoint(l != null ? l.longValue() : 0L);
    }
}
