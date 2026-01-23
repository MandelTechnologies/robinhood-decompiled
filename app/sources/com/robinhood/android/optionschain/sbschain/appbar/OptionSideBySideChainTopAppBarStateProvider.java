package com.robinhood.android.optionschain.sbschain.appbar;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.options.contracts.OptionChainSettingsFragmentKey;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTopAppBarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTopAppBarStateProvider implements StateProvider<OptionSideBySideChainTopAppBarDataState, OptionSideBySideChainTopAppBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OptionSideBySideChainTopAppBarViewState reduce(OptionSideBySideChainTopAppBarDataState dataState) {
        String accountNumber;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String optionChainSymbolsDisplay = UiOptionChains.getOptionChainSymbolsDisplay(dataState.getUiOptionChains());
        Account account = dataState.getAccount();
        OptionChainSettingsFragmentKey optionChainSettingsFragmentKey = null;
        StringResource title = (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null) ? null : withAccount.getTitle();
        boolean z = !dataState.getHasSeenOptionChainSettings() || (dataState.getInOptionChainBidAskPriceLabelExp() && !dataState.getHasSeenOptionChainBidAskPriceLabelSettings());
        Account account2 = dataState.getAccount();
        if (account2 != null && (accountNumber = account2.getAccountNumber()) != null) {
            optionChainSettingsFragmentKey = new OptionChainSettingsFragmentKey(accountNumber, true, null, false, dataState.getLaunchMode(), 12, null);
        }
        return new OptionSideBySideChainTopAppBarViewState(optionChainSymbolsDisplay, title, z, optionChainSettingsFragmentKey);
    }
}
