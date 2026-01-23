package com.ionspin.kotlin.bignum.integer;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BigIntegerArithmetic.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0004\u001a\u00020\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/Sign;", "", "(Ljava/lang/String;I)V", "not", "toInt", "", "POSITIVE", "NEGATIVE", "ZERO", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.Sign, reason: use source file name */
/* loaded from: classes27.dex */
public final class BigIntegerArithmetic2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BigIntegerArithmetic2[] $VALUES;
    public static final BigIntegerArithmetic2 POSITIVE = new BigIntegerArithmetic2("POSITIVE", 0);
    public static final BigIntegerArithmetic2 NEGATIVE = new BigIntegerArithmetic2("NEGATIVE", 1);
    public static final BigIntegerArithmetic2 ZERO = new BigIntegerArithmetic2("ZERO", 2);

    /* compiled from: BigIntegerArithmetic.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.ionspin.kotlin.bignum.integer.Sign$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BigIntegerArithmetic2.values().length];
            try {
                iArr[BigIntegerArithmetic2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BigIntegerArithmetic2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BigIntegerArithmetic2.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ BigIntegerArithmetic2[] $values() {
        return new BigIntegerArithmetic2[]{POSITIVE, NEGATIVE, ZERO};
    }

    public static EnumEntries<BigIntegerArithmetic2> getEntries() {
        return $ENTRIES;
    }

    public static BigIntegerArithmetic2 valueOf(String str) {
        return (BigIntegerArithmetic2) Enum.valueOf(BigIntegerArithmetic2.class, str);
    }

    public static BigIntegerArithmetic2[] values() {
        return (BigIntegerArithmetic2[]) $VALUES.clone();
    }

    private BigIntegerArithmetic2(String str, int i) {
    }

    static {
        BigIntegerArithmetic2[] bigIntegerArithmetic2Arr$values = $values();
        $VALUES = bigIntegerArithmetic2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bigIntegerArithmetic2Arr$values);
    }

    public final BigIntegerArithmetic2 not() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return NEGATIVE;
        }
        if (i == 2) {
            return POSITIVE;
        }
        if (i == 3) {
            return ZERO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int toInt() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
