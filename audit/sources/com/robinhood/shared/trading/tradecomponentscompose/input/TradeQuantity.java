package com.robinhood.shared.trading.tradecomponentscompose.input;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradeQuantity.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "", "<init>", "(Ljava/lang/String;I)V", "REPLACE", "APPEND", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityInputMode, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeQuantity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradeQuantity[] $VALUES;
    public static final TradeQuantity REPLACE = new TradeQuantity("REPLACE", 0);
    public static final TradeQuantity APPEND = new TradeQuantity("APPEND", 1);

    private static final /* synthetic */ TradeQuantity[] $values() {
        return new TradeQuantity[]{REPLACE, APPEND};
    }

    public static EnumEntries<TradeQuantity> getEntries() {
        return $ENTRIES;
    }

    private TradeQuantity(String str, int i) {
    }

    static {
        TradeQuantity[] tradeQuantityArr$values = $values();
        $VALUES = tradeQuantityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradeQuantityArr$values);
    }

    public static TradeQuantity valueOf(String str) {
        return (TradeQuantity) Enum.valueOf(TradeQuantity.class, str);
    }

    public static TradeQuantity[] values() {
        return (TradeQuantity[]) $VALUES.clone();
    }
}
