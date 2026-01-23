package com.robinhood.android.indexes.detail.components.tradebar;

import android.content.res.Resources;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccount;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherHelper;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.indexes.detail.IndexDetailPageStates2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: IndexDetailPageTradeBarStateProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getAccountSwitcherLoadedState", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState$LoadedState;", "ds", "getIndexAccountSwitcherState", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexAccountSwitcherState;", "getTradeOptionsAction", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "getTradeOptionsIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexDetailPageTradeBarStateProvider implements StateProvider<IndexDetailPageTradeBarDataState, IndexDetailPageTradeBarViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public IndexDetailPageTradeBarStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    private final TradeAccountSwitcherState.LoadedState getAccountSwitcherLoadedState(IndexDetailPageTradeBarDataState ds) {
        String accountNumber;
        AccountSwitcher accountSwitcher;
        Object next;
        Account currentAccount = ds.getCurrentAccount();
        if (currentAccount == null || (accountNumber = currentAccount.getAccountNumber()) == null || (accountSwitcher = ds.getAccountSwitcher()) == null) {
            return null;
        }
        Iterator<T> it = accountSwitcher.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((AccountSwitcherAccount) next).getAccountNumber(), accountNumber)) {
                break;
            }
        }
        AccountSwitcherAccount accountSwitcherAccount = (AccountSwitcherAccount) next;
        if (accountSwitcherAccount == null) {
            return null;
        }
        return new TradeAccountSwitcherState.LoadedState(accountSwitcherAccount.getEntryTitle(), accountSwitcherAccount.getIcon(), AccountSwitcherHelper.toAccountSwitcherData(accountSwitcher, accountNumber, IndexDetailPageStates2.getIndexDetailPageAnalyticsScreen()), AccountSwitcherHelper.toAccountSwitcherSurface(accountSwitcher, accountNumber));
    }

    private final IndexAccountSwitcherState getIndexAccountSwitcherState(IndexDetailPageTradeBarDataState ds) {
        String accountNumber;
        Screen.Name name = IndexDetailPageStates2.getIndexDetailPageAnalyticsScreen().getName();
        Account currentAccount = ds.getCurrentAccount();
        if (currentAccount == null || (accountNumber = currentAccount.getAccountNumber()) == null) {
            return null;
        }
        return new IndexAccountSwitcherState(name, accountNumber, ds.getAllAccounts(), false, ds.getAllAccounts().size() > 1, getAccountSwitcherLoadedState(ds), ds.getUseSduiAccountSwitcher());
    }

    private final AbstractTradeBarOverlayView.ExpandAction getTradeOptionsAction(IndexDetailPageTradeBarDataState ds) throws Resources.NotFoundException {
        Boolean hasAccessToOptions = ds.getHasAccessToOptions();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.areEqual(hasAccessToOptions, bool) && Intrinsics.areEqual(ds.getShouldShowOptionsUpgrade(), bool)) {
            return null;
        }
        String string2 = this.resources.getString(C11117R.string.gated_options_detail_page_trade_bar_trade_options);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction(1, string2, true);
    }

    private final IntentKey getTradeOptionsIntentKey(IndexDetailPageTradeBarDataState ds) {
        String accountNumber;
        Index index;
        List<UUID> tradableChainIds;
        Account currentAccount = ds.getCurrentAccount();
        if (currentAccount != null && (accountNumber = currentAccount.getAccountNumber()) != null && (index = ds.getIndex()) != null && (tradableChainIds = index.getTradableChainIds()) != null) {
            Boolean hasAccessToOptions = ds.getHasAccessToOptions();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(hasAccessToOptions, bool)) {
                return new OptionChainIntentKey((UUID) null, new OptionChainIdLaunchMode.MultipleChainIds(tradableChainIds), (ImmutableList) null, (OptionOrderFilter) null, accountNumber, (String) null, 44, (DefaultConstructorMarker) null);
            }
            if (Intrinsics.areEqual(ds.getHasAccessToOptions(), Boolean.FALSE) && Intrinsics.areEqual(ds.getShouldShowOptionsUpgrade(), bool)) {
                return new OptionOnboarding(new OptionOnboarding2.AccountNumber(accountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy("trade_bar_index_detail"), null, 4, null);
            }
        }
        return null;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public IndexDetailPageTradeBarViewState reduce(IndexDetailPageTradeBarDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new IndexDetailPageTradeBarViewState(getTradeOptionsAction(dataState), getTradeOptionsIntentKey(dataState), getIndexAccountSwitcherState(dataState));
    }
}
