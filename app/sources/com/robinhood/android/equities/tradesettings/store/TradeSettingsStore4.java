package com.robinhood.android.equities.tradesettings.store;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradeSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "", "<init>", "(Ljava/lang/String;I)V", "TRADE_FLOW", "MAC", "LADDER", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.store.LocationType, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradeSettingsStore4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradeSettingsStore4[] $VALUES;
    public static final TradeSettingsStore4 TRADE_FLOW = new TradeSettingsStore4("TRADE_FLOW", 0);
    public static final TradeSettingsStore4 MAC = new TradeSettingsStore4("MAC", 1);
    public static final TradeSettingsStore4 LADDER = new TradeSettingsStore4("LADDER", 2);

    private static final /* synthetic */ TradeSettingsStore4[] $values() {
        return new TradeSettingsStore4[]{TRADE_FLOW, MAC, LADDER};
    }

    public static EnumEntries<TradeSettingsStore4> getEntries() {
        return $ENTRIES;
    }

    private TradeSettingsStore4(String str, int i) {
    }

    static {
        TradeSettingsStore4[] tradeSettingsStore4Arr$values = $values();
        $VALUES = tradeSettingsStore4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradeSettingsStore4Arr$values);
    }

    public static TradeSettingsStore4 valueOf(String str) {
        return (TradeSettingsStore4) Enum.valueOf(TradeSettingsStore4.class, str);
    }

    public static TradeSettingsStore4[] values() {
        return (TradeSettingsStore4[]) $VALUES.clone();
    }
}
