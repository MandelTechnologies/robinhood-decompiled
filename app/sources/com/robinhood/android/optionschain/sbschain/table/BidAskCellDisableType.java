package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "", "<init>", "(Ljava/lang/String;I)V", "PCO_NO_WATCHLIST", "CONTRACT_PCO", "OTHER", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class BidAskCellDisableType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BidAskCellDisableType[] $VALUES;
    public static final BidAskCellDisableType PCO_NO_WATCHLIST = new BidAskCellDisableType("PCO_NO_WATCHLIST", 0);
    public static final BidAskCellDisableType CONTRACT_PCO = new BidAskCellDisableType("CONTRACT_PCO", 1);
    public static final BidAskCellDisableType OTHER = new BidAskCellDisableType("OTHER", 2);

    private static final /* synthetic */ BidAskCellDisableType[] $values() {
        return new BidAskCellDisableType[]{PCO_NO_WATCHLIST, CONTRACT_PCO, OTHER};
    }

    public static EnumEntries<BidAskCellDisableType> getEntries() {
        return $ENTRIES;
    }

    private BidAskCellDisableType(String str, int i) {
    }

    static {
        BidAskCellDisableType[] bidAskCellDisableTypeArr$values = $values();
        $VALUES = bidAskCellDisableTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bidAskCellDisableTypeArr$values);
    }

    public static BidAskCellDisableType valueOf(String str) {
        return (BidAskCellDisableType) Enum.valueOf(BidAskCellDisableType.class, str);
    }

    public static BidAskCellDisableType[] values() {
        return (BidAskCellDisableType[]) $VALUES.clone();
    }
}
