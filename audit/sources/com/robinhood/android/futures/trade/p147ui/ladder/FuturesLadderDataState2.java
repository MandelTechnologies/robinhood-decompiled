package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FuturesLadderDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "PNL", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderDisplayMode, reason: use source file name */
/* loaded from: classes10.dex */
public final class FuturesLadderDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesLadderDataState2[] $VALUES;
    public static final FuturesLadderDataState2 PRICE = new FuturesLadderDataState2("PRICE", 0);
    public static final FuturesLadderDataState2 PNL = new FuturesLadderDataState2("PNL", 1);

    private static final /* synthetic */ FuturesLadderDataState2[] $values() {
        return new FuturesLadderDataState2[]{PRICE, PNL};
    }

    public static EnumEntries<FuturesLadderDataState2> getEntries() {
        return $ENTRIES;
    }

    private FuturesLadderDataState2(String str, int i) {
    }

    static {
        FuturesLadderDataState2[] futuresLadderDataState2Arr$values = $values();
        $VALUES = futuresLadderDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresLadderDataState2Arr$values);
    }

    public static FuturesLadderDataState2 valueOf(String str) {
        return (FuturesLadderDataState2) Enum.valueOf(FuturesLadderDataState2.class, str);
    }

    public static FuturesLadderDataState2[] values() {
        return (FuturesLadderDataState2[]) $VALUES.clone();
    }
}
