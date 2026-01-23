package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerAction;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE_TRADE_ON_EXPIRATION", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TopErrorBannerAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopErrorBannerAction[] $VALUES;
    public static final TopErrorBannerAction ENABLE_TRADE_ON_EXPIRATION = new TopErrorBannerAction("ENABLE_TRADE_ON_EXPIRATION", 0);

    private static final /* synthetic */ TopErrorBannerAction[] $values() {
        return new TopErrorBannerAction[]{ENABLE_TRADE_ON_EXPIRATION};
    }

    public static EnumEntries<TopErrorBannerAction> getEntries() {
        return $ENTRIES;
    }

    private TopErrorBannerAction(String str, int i) {
    }

    static {
        TopErrorBannerAction[] topErrorBannerActionArr$values = $values();
        $VALUES = topErrorBannerActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(topErrorBannerActionArr$values);
    }

    public static TopErrorBannerAction valueOf(String str) {
        return (TopErrorBannerAction) Enum.valueOf(TopErrorBannerAction.class, str);
    }

    public static TopErrorBannerAction[] values() {
        return (TopErrorBannerAction[]) $VALUES.clone();
    }
}
