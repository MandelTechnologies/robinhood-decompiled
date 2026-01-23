package com.robinhood.android.trade.options.bidaskbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOrderBidAskBarViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarSnapType;", "", "<init>", "(Ljava/lang/String;I)V", "BID", "MARK", "ASK", "NONE", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarSnapType, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderBidAskBarViewState4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderBidAskBarViewState4[] $VALUES;
    public static final OptionOrderBidAskBarViewState4 BID = new OptionOrderBidAskBarViewState4("BID", 0);
    public static final OptionOrderBidAskBarViewState4 MARK = new OptionOrderBidAskBarViewState4("MARK", 1);
    public static final OptionOrderBidAskBarViewState4 ASK = new OptionOrderBidAskBarViewState4("ASK", 2);
    public static final OptionOrderBidAskBarViewState4 NONE = new OptionOrderBidAskBarViewState4("NONE", 3);

    private static final /* synthetic */ OptionOrderBidAskBarViewState4[] $values() {
        return new OptionOrderBidAskBarViewState4[]{BID, MARK, ASK, NONE};
    }

    public static EnumEntries<OptionOrderBidAskBarViewState4> getEntries() {
        return $ENTRIES;
    }

    private OptionOrderBidAskBarViewState4(String str, int i) {
    }

    static {
        OptionOrderBidAskBarViewState4[] optionOrderBidAskBarViewState4Arr$values = $values();
        $VALUES = optionOrderBidAskBarViewState4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderBidAskBarViewState4Arr$values);
    }

    public static OptionOrderBidAskBarViewState4 valueOf(String str) {
        return (OptionOrderBidAskBarViewState4) Enum.valueOf(OptionOrderBidAskBarViewState4.class, str);
    }

    public static OptionOrderBidAskBarViewState4[] values() {
        return (OptionOrderBidAskBarViewState4[]) $VALUES.clone();
    }
}
