package com.robinhood.shared.trading.tradeflow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToTrade.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradeflow/ReviewingState;", "", "<init>", "(Ljava/lang/String;I)V", "EDITING", "REVIEWING", "lib-trade-flow-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trading.tradeflow.ReviewingState, reason: use source file name */
/* loaded from: classes12.dex */
public final class SwipeToTrade2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwipeToTrade2[] $VALUES;
    public static final SwipeToTrade2 EDITING = new SwipeToTrade2("EDITING", 0);
    public static final SwipeToTrade2 REVIEWING = new SwipeToTrade2("REVIEWING", 1);

    private static final /* synthetic */ SwipeToTrade2[] $values() {
        return new SwipeToTrade2[]{EDITING, REVIEWING};
    }

    public static EnumEntries<SwipeToTrade2> getEntries() {
        return $ENTRIES;
    }

    private SwipeToTrade2(String str, int i) {
    }

    static {
        SwipeToTrade2[] swipeToTrade2Arr$values = $values();
        $VALUES = swipeToTrade2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(swipeToTrade2Arr$values);
    }

    public static SwipeToTrade2 valueOf(String str) {
        return (SwipeToTrade2) Enum.valueOf(SwipeToTrade2.class, str);
    }

    public static SwipeToTrade2[] values() {
        return (SwipeToTrade2[]) $VALUES.clone();
    }
}
