package com.robinhood.shared.trading.tradeflow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToTrade.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradeflow/SwipeState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "lib-trade-flow-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trading.tradeflow.SwipeState, reason: use source file name */
/* loaded from: classes12.dex */
final class SwipeToTrade3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwipeToTrade3[] $VALUES;
    public static final SwipeToTrade3 START = new SwipeToTrade3("START", 0);
    public static final SwipeToTrade3 END = new SwipeToTrade3("END", 1);

    private static final /* synthetic */ SwipeToTrade3[] $values() {
        return new SwipeToTrade3[]{START, END};
    }

    public static EnumEntries<SwipeToTrade3> getEntries() {
        return $ENTRIES;
    }

    private SwipeToTrade3(String str, int i) {
    }

    static {
        SwipeToTrade3[] swipeToTrade3Arr$values = $values();
        $VALUES = swipeToTrade3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(swipeToTrade3Arr$values);
    }

    public static SwipeToTrade3 valueOf(String str) {
        return (SwipeToTrade3) Enum.valueOf(SwipeToTrade3.class, str);
    }

    public static SwipeToTrade3[] values() {
        return (SwipeToTrade3[]) $VALUES.clone();
    }
}
