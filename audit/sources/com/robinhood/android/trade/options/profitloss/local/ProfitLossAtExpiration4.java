package com.robinhood.android.trade.options.profitloss.local;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfitLossAtExpiration.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_EXPIRATION", "LAST_EXPIRATION", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossChartExpirationType, reason: use source file name */
/* loaded from: classes9.dex */
public final class ProfitLossAtExpiration4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitLossAtExpiration4[] $VALUES;
    public static final ProfitLossAtExpiration4 FIRST_EXPIRATION = new ProfitLossAtExpiration4("FIRST_EXPIRATION", 0);
    public static final ProfitLossAtExpiration4 LAST_EXPIRATION = new ProfitLossAtExpiration4("LAST_EXPIRATION", 1);

    private static final /* synthetic */ ProfitLossAtExpiration4[] $values() {
        return new ProfitLossAtExpiration4[]{FIRST_EXPIRATION, LAST_EXPIRATION};
    }

    public static EnumEntries<ProfitLossAtExpiration4> getEntries() {
        return $ENTRIES;
    }

    private ProfitLossAtExpiration4(String str, int i) {
    }

    static {
        ProfitLossAtExpiration4[] profitLossAtExpiration4Arr$values = $values();
        $VALUES = profitLossAtExpiration4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitLossAtExpiration4Arr$values);
    }

    public static ProfitLossAtExpiration4 valueOf(String str) {
        return (ProfitLossAtExpiration4) Enum.valueOf(ProfitLossAtExpiration4.class, str);
    }

    public static ProfitLossAtExpiration4[] values() {
        return (ProfitLossAtExpiration4[]) $VALUES.clone();
    }
}
