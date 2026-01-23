package com.robinhood.android.trade.options.profitloss.local;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfitAndLossChartError.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartError;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NO_MARKET_DATA", "NO_OPTION_LEG", "UNDERLYING_INSTRUMENT", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ProfitAndLossChartError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitAndLossChartError[] $VALUES;
    public static final ProfitAndLossChartError NO_MARKET_DATA = new ProfitAndLossChartError("NO_MARKET_DATA", 0, "Market data unavailable.");
    public static final ProfitAndLossChartError NO_OPTION_LEG = new ProfitAndLossChartError("NO_OPTION_LEG", 1, "Require at lease one option leg.");
    public static final ProfitAndLossChartError UNDERLYING_INSTRUMENT = new ProfitAndLossChartError("UNDERLYING_INSTRUMENT", 2, "Does not support zero or multiple underlying instruments.");
    private final String message;

    private static final /* synthetic */ ProfitAndLossChartError[] $values() {
        return new ProfitAndLossChartError[]{NO_MARKET_DATA, NO_OPTION_LEG, UNDERLYING_INSTRUMENT};
    }

    public static EnumEntries<ProfitAndLossChartError> getEntries() {
        return $ENTRIES;
    }

    private ProfitAndLossChartError(String str, int i, String str2) {
        this.message = str2;
    }

    public final String getMessage() {
        return this.message;
    }

    static {
        ProfitAndLossChartError[] profitAndLossChartErrorArr$values = $values();
        $VALUES = profitAndLossChartErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitAndLossChartErrorArr$values);
    }

    public static ProfitAndLossChartError valueOf(String str) {
        return (ProfitAndLossChartError) Enum.valueOf(ProfitAndLossChartError.class, str);
    }

    public static ProfitAndLossChartError[] values() {
        return (ProfitAndLossChartError[]) $VALUES.clone();
    }
}
