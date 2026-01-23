package com.robinhood.android.futures.lib.rhd.accountoverview.p144ui;

import com.robinhood.android.futures.lib.rhd.accountoverview.C17291R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountOverviewContents.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/AccountOverviewRhdSectionCtaType;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "TRADE_FUTURES", "TRADE_EVENT_CONTRACTS", "APPLY_TO_TRADE_FUTURES", "APPLY_TO_TRADE_EVENT_CONTRACTS", "REACTIVATE_ACCOUNT", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.ui.AccountOverviewRhdSectionCtaType, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountOverviewContents2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountOverviewContents2[] $VALUES;
    private final int stringRes;
    public static final AccountOverviewContents2 TRADE_FUTURES = new AccountOverviewContents2("TRADE_FUTURES", 0, C17291R.string.account_overview_rhd_card_trade_futures_cta);
    public static final AccountOverviewContents2 TRADE_EVENT_CONTRACTS = new AccountOverviewContents2("TRADE_EVENT_CONTRACTS", 1, C17291R.string.account_overview_rhd_card_trade_event_contract_cta);
    public static final AccountOverviewContents2 APPLY_TO_TRADE_FUTURES = new AccountOverviewContents2("APPLY_TO_TRADE_FUTURES", 2, C17291R.string.account_overview_rhd_card_apply_futures_trading_cta);
    public static final AccountOverviewContents2 APPLY_TO_TRADE_EVENT_CONTRACTS = new AccountOverviewContents2("APPLY_TO_TRADE_EVENT_CONTRACTS", 3, C17291R.string.account_overview_rhd_card_apply_event_contract_trading_cta);
    public static final AccountOverviewContents2 REACTIVATE_ACCOUNT = new AccountOverviewContents2("REACTIVATE_ACCOUNT", 4, C17291R.string.account_overview_rhd_card_reactivate_account_cta);

    private static final /* synthetic */ AccountOverviewContents2[] $values() {
        return new AccountOverviewContents2[]{TRADE_FUTURES, TRADE_EVENT_CONTRACTS, APPLY_TO_TRADE_FUTURES, APPLY_TO_TRADE_EVENT_CONTRACTS, REACTIVATE_ACCOUNT};
    }

    public static EnumEntries<AccountOverviewContents2> getEntries() {
        return $ENTRIES;
    }

    private AccountOverviewContents2(String str, int i, int i2) {
        this.stringRes = i2;
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    static {
        AccountOverviewContents2[] accountOverviewContents2Arr$values = $values();
        $VALUES = accountOverviewContents2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountOverviewContents2Arr$values);
    }

    public static AccountOverviewContents2 valueOf(String str) {
        return (AccountOverviewContents2) Enum.valueOf(AccountOverviewContents2.class, str);
    }

    public static AccountOverviewContents2[] values() {
        return (AccountOverviewContents2[]) $VALUES.clone();
    }
}
