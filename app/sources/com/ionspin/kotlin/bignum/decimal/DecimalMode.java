package com.ionspin.kotlin.bignum.decimal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecimalMode.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001e¨\u0006\""}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "", "", "decimalPrecision", "Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "roundingMode", "scale", "<init>", "(JLcom/ionspin/kotlin/bignum/decimal/RoundingMode;J)V", "copy", "(JLcom/ionspin/kotlin/bignum/decimal/RoundingMode;J)Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDecimalPrecision", "()J", "Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "getRoundingMode", "()Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "getScale", "isPrecisionUnlimited", "Z", "()Z", "usingScale", "getUsingScale", "Companion", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DecimalMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DecimalMode DEFAULT = new DecimalMode(0, null, 0, 7, null);
    private static final DecimalMode US_CURRENCY = new DecimalMode(30, DecimalMode2.ROUND_HALF_AWAY_FROM_ZERO, 2);
    private final long decimalPrecision;
    private final boolean isPrecisionUnlimited;
    private final DecimalMode2 roundingMode;
    private final long scale;
    private final boolean usingScale;

    public DecimalMode() {
        this(0L, null, 0L, 7, null);
    }

    public static /* synthetic */ DecimalMode copy$default(DecimalMode decimalMode, long j, DecimalMode2 decimalMode2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = decimalMode.decimalPrecision;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            decimalMode2 = decimalMode.roundingMode;
        }
        DecimalMode2 decimalMode22 = decimalMode2;
        if ((i & 4) != 0) {
            j2 = decimalMode.scale;
        }
        return decimalMode.copy(j3, decimalMode22, j2);
    }

    public final DecimalMode copy(long decimalPrecision, DecimalMode2 roundingMode, long scale) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return new DecimalMode(decimalPrecision, roundingMode, scale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecimalMode)) {
            return false;
        }
        DecimalMode decimalMode = (DecimalMode) other;
        return this.decimalPrecision == decimalMode.decimalPrecision && this.roundingMode == decimalMode.roundingMode && this.scale == decimalMode.scale;
    }

    public int hashCode() {
        return (((Long.hashCode(this.decimalPrecision) * 31) + this.roundingMode.hashCode()) * 31) + Long.hashCode(this.scale);
    }

    public String toString() {
        return "DecimalMode(decimalPrecision=" + this.decimalPrecision + ", roundingMode=" + this.roundingMode + ", scale=" + this.scale + ')';
    }

    public DecimalMode(long j, DecimalMode2 roundingMode, long j2) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        this.decimalPrecision = j;
        this.roundingMode = roundingMode;
        this.scale = j2;
        if (j < 0) {
            throw new ArithmeticException("Negative decimal precision is not allowed.");
        }
        this.isPrecisionUnlimited = j == 0;
        boolean z = j2 >= 0;
        this.usingScale = z;
        if (!z && j == 0 && roundingMode != DecimalMode2.NONE) {
            throw new ArithmeticException("Rounding mode with 0 digits precision.");
        }
        if (j2 < -1) {
            throw new ArithmeticException("Negative Scale is unsupported.");
        }
        if (z && roundingMode == DecimalMode2.NONE) {
            throw new ArithmeticException("Scale of " + j2 + " digits to the right of the decimal requires a RoundingMode that is not NONE.");
        }
    }

    public final long getDecimalPrecision() {
        return this.decimalPrecision;
    }

    public /* synthetic */ DecimalMode(long j, DecimalMode2 decimalMode2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? DecimalMode2.NONE : decimalMode2, (i & 4) != 0 ? -1L : j2);
    }

    public final DecimalMode2 getRoundingMode() {
        return this.roundingMode;
    }

    public final long getScale() {
        return this.scale;
    }

    /* renamed from: isPrecisionUnlimited, reason: from getter */
    public final boolean getIsPrecisionUnlimited() {
        return this.isPrecisionUnlimited;
    }

    public final boolean getUsingScale() {
        return this.usingScale;
    }

    /* compiled from: DecimalMode.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/DecimalMode$Companion;", "", "<init>", "()V", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "DEFAULT", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "getDEFAULT", "()Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DecimalMode getDEFAULT() {
            return DecimalMode.DEFAULT;
        }
    }
}
