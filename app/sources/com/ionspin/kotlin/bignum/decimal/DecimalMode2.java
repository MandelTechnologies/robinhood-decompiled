package com.ionspin.kotlin.bignum.decimal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DecimalMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "", "(Ljava/lang/String;I)V", "FLOOR", "CEILING", "AWAY_FROM_ZERO", "TOWARDS_ZERO", "NONE", "ROUND_HALF_AWAY_FROM_ZERO", "ROUND_HALF_TOWARDS_ZERO", "ROUND_HALF_CEILING", "ROUND_HALF_FLOOR", "ROUND_HALF_TO_EVEN", "ROUND_HALF_TO_ODD", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.decimal.RoundingMode, reason: use source file name */
/* loaded from: classes27.dex */
public final class DecimalMode2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DecimalMode2[] $VALUES;
    public static final DecimalMode2 FLOOR = new DecimalMode2("FLOOR", 0);
    public static final DecimalMode2 CEILING = new DecimalMode2("CEILING", 1);
    public static final DecimalMode2 AWAY_FROM_ZERO = new DecimalMode2("AWAY_FROM_ZERO", 2);
    public static final DecimalMode2 TOWARDS_ZERO = new DecimalMode2("TOWARDS_ZERO", 3);
    public static final DecimalMode2 NONE = new DecimalMode2("NONE", 4);
    public static final DecimalMode2 ROUND_HALF_AWAY_FROM_ZERO = new DecimalMode2("ROUND_HALF_AWAY_FROM_ZERO", 5);
    public static final DecimalMode2 ROUND_HALF_TOWARDS_ZERO = new DecimalMode2("ROUND_HALF_TOWARDS_ZERO", 6);
    public static final DecimalMode2 ROUND_HALF_CEILING = new DecimalMode2("ROUND_HALF_CEILING", 7);
    public static final DecimalMode2 ROUND_HALF_FLOOR = new DecimalMode2("ROUND_HALF_FLOOR", 8);
    public static final DecimalMode2 ROUND_HALF_TO_EVEN = new DecimalMode2("ROUND_HALF_TO_EVEN", 9);
    public static final DecimalMode2 ROUND_HALF_TO_ODD = new DecimalMode2("ROUND_HALF_TO_ODD", 10);

    private static final /* synthetic */ DecimalMode2[] $values() {
        return new DecimalMode2[]{FLOOR, CEILING, AWAY_FROM_ZERO, TOWARDS_ZERO, NONE, ROUND_HALF_AWAY_FROM_ZERO, ROUND_HALF_TOWARDS_ZERO, ROUND_HALF_CEILING, ROUND_HALF_FLOOR, ROUND_HALF_TO_EVEN, ROUND_HALF_TO_ODD};
    }

    public static EnumEntries<DecimalMode2> getEntries() {
        return $ENTRIES;
    }

    public static DecimalMode2 valueOf(String str) {
        return (DecimalMode2) Enum.valueOf(DecimalMode2.class, str);
    }

    public static DecimalMode2[] values() {
        return (DecimalMode2[]) $VALUES.clone();
    }

    private DecimalMode2(String str, int i) {
    }

    static {
        DecimalMode2[] decimalMode2Arr$values = $values();
        $VALUES = decimalMode2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(decimalMode2Arr$values);
    }
}
