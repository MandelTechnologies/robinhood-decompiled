package com.robinhood.android.trade.options.bidaskbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOrderBidAskBarViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarInputType;", "", "<init>", "(Ljava/lang/String;I)V", "TAP", "DRAG", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarInputType, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderBidAskBarViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderBidAskBarViewState2[] $VALUES;
    public static final OptionOrderBidAskBarViewState2 TAP = new OptionOrderBidAskBarViewState2("TAP", 0);
    public static final OptionOrderBidAskBarViewState2 DRAG = new OptionOrderBidAskBarViewState2("DRAG", 1);

    private static final /* synthetic */ OptionOrderBidAskBarViewState2[] $values() {
        return new OptionOrderBidAskBarViewState2[]{TAP, DRAG};
    }

    public static EnumEntries<OptionOrderBidAskBarViewState2> getEntries() {
        return $ENTRIES;
    }

    private OptionOrderBidAskBarViewState2(String str, int i) {
    }

    static {
        OptionOrderBidAskBarViewState2[] optionOrderBidAskBarViewState2Arr$values = $values();
        $VALUES = optionOrderBidAskBarViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderBidAskBarViewState2Arr$values);
    }

    public static OptionOrderBidAskBarViewState2 valueOf(String str) {
        return (OptionOrderBidAskBarViewState2) Enum.valueOf(OptionOrderBidAskBarViewState2.class, str);
    }

    public static OptionOrderBidAskBarViewState2[] values() {
        return (OptionOrderBidAskBarViewState2[]) $VALUES.clone();
    }
}
