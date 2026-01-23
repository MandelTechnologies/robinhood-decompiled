package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "PCO_BEFORE_SELLOUT", "PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE", "PCO_AFTER_MARKET_CLOSE", "MULTIPLE_CHAINS_SELECTED", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TopBannerErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopBannerErrorType[] $VALUES;
    public static final TopBannerErrorType PCO_BEFORE_SELLOUT = new TopBannerErrorType("PCO_BEFORE_SELLOUT", 0);
    public static final TopBannerErrorType PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE = new TopBannerErrorType("PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE", 1);
    public static final TopBannerErrorType PCO_AFTER_MARKET_CLOSE = new TopBannerErrorType("PCO_AFTER_MARKET_CLOSE", 2);
    public static final TopBannerErrorType MULTIPLE_CHAINS_SELECTED = new TopBannerErrorType("MULTIPLE_CHAINS_SELECTED", 3);

    private static final /* synthetic */ TopBannerErrorType[] $values() {
        return new TopBannerErrorType[]{PCO_BEFORE_SELLOUT, PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE, PCO_AFTER_MARKET_CLOSE, MULTIPLE_CHAINS_SELECTED};
    }

    public static EnumEntries<TopBannerErrorType> getEntries() {
        return $ENTRIES;
    }

    private TopBannerErrorType(String str, int i) {
    }

    static {
        TopBannerErrorType[] topBannerErrorTypeArr$values = $values();
        $VALUES = topBannerErrorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(topBannerErrorTypeArr$values);
    }

    public static TopBannerErrorType valueOf(String str) {
        return (TopBannerErrorType) Enum.valueOf(TopBannerErrorType.class, str);
    }

    public static TopBannerErrorType[] values() {
        return (TopBannerErrorType[]) $VALUES.clone();
    }
}
