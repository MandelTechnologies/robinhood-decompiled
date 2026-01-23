package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimitType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LIMIT_FINITE", "LIMIT_POSITIVE_INFINITY", "LIMIT_NEGATIVE_INFINITY", "LIMIT_UNAVAILABLE", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ProfitAndLossLimitType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitAndLossLimitType[] $VALUES;
    private final String value;
    public static final ProfitAndLossLimitType LIMIT_FINITE = new ProfitAndLossLimitType("LIMIT_FINITE", 0, "finite");
    public static final ProfitAndLossLimitType LIMIT_POSITIVE_INFINITY = new ProfitAndLossLimitType("LIMIT_POSITIVE_INFINITY", 1, "positive_infinity");
    public static final ProfitAndLossLimitType LIMIT_NEGATIVE_INFINITY = new ProfitAndLossLimitType("LIMIT_NEGATIVE_INFINITY", 2, "negative_infinity");
    public static final ProfitAndLossLimitType LIMIT_UNAVAILABLE = new ProfitAndLossLimitType("LIMIT_UNAVAILABLE", 3, OptionChainCustomizationLogging.UNAVAILABLE_TOAST_IDENTIFIER);

    private static final /* synthetic */ ProfitAndLossLimitType[] $values() {
        return new ProfitAndLossLimitType[]{LIMIT_FINITE, LIMIT_POSITIVE_INFINITY, LIMIT_NEGATIVE_INFINITY, LIMIT_UNAVAILABLE};
    }

    public static EnumEntries<ProfitAndLossLimitType> getEntries() {
        return $ENTRIES;
    }

    private ProfitAndLossLimitType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        ProfitAndLossLimitType[] profitAndLossLimitTypeArr$values = $values();
        $VALUES = profitAndLossLimitTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitAndLossLimitTypeArr$values);
    }

    public static ProfitAndLossLimitType valueOf(String str) {
        return (ProfitAndLossLimitType) Enum.valueOf(ProfitAndLossLimitType.class, str);
    }

    public static ProfitAndLossLimitType[] values() {
        return (ProfitAndLossLimitType[]) $VALUES.clone();
    }
}
