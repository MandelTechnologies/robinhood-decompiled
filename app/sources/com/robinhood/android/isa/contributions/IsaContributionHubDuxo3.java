package com.robinhood.android.isa.contributions;

import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions2;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions4;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTabBannerConfig;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IsaContributionHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/contributions/IsaContributionHubDataState;", "Lcom/robinhood/android/isa/contributions/IsaContributionHubViewState;", "<init>", "()V", "reduce", "dataState", "Companion", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionHubDuxo3 implements StateProvider<IsaContributionHubDataState, IsaContributionHubViewState> {
    public static final int $stable = 0;
    public static final int MAX_HISTORY_SECTION_ROWS = 3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IsaContributionHubViewState reduce(IsaContributionHubDataState dataState) {
        IsaContribution isaContribution;
        StringResource stringResource;
        HistorySectionState historySectionState;
        IsaTabBannerConfig upsellConfig;
        List<IsaContribution> items;
        StringResource stringResourceInvoke;
        List<IsaContribution> items2;
        Object next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IsaContributions contributions = dataState.getContributions();
        ImmutableList3 persistentList = null;
        Integer numValueOf = contributions != null ? Integer.valueOf(contributions.getCurrentTaxYear()) : null;
        Integer selectedTaxYear = dataState.getSelectedTaxYear();
        if (selectedTaxYear == null) {
            selectedTaxYear = numValueOf;
        }
        IsaContributions contributions2 = dataState.getContributions();
        if (contributions2 == null || (items2 = contributions2.getItems()) == null) {
            isaContribution = null;
        } else {
            Iterator<T> it = items2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int taxYear = ((IsaContribution) next).getTaxYear();
                if (selectedTaxYear != null && taxYear == selectedTaxYear.intValue()) {
                    break;
                }
            }
            isaContribution = (IsaContribution) next;
        }
        Money contributed = isaContribution != null ? isaContribution.getContributed() : null;
        Money allowance = isaContribution != null ? isaContribution.getAllowance() : null;
        String str = (contributed == null || allowance == null) ? null : Money.format$default(allowance.minus(contributed), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str2 = contributed != null ? Money.format$default(contributed, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
        if (str != null) {
            if (Intrinsics.areEqual(selectedTaxYear, numValueOf)) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19913R.string.contribution_hub_remaining, str);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19913R.string.contribution_hub_unused, str);
            }
            stringResource = stringResourceInvoke;
        } else {
            stringResource = null;
        }
        IsaContributions contributions3 = dataState.getContributions();
        IsaContributions2 contributionState = IsaContributions4.getContributionState(contributions3 != null ? IsaContributions4.findCurrentTaxYear(contributions3) : null);
        Account account = dataState.getAccount();
        if (account != null) {
            historySectionState = new HistorySectionState(null, extensions2.persistentSetOf(HistoryTransactionType.UK_OPEN_BANKING_TRANSFER, HistoryTransactionType.INTERNAL_TRANSFER), null, 0 == true ? 1 : 0, new HistoryStaticFilter(null, new HistoryStaticFilter.RhsAccountContext(account.getAccountNumber(), account.getBrokerageAccountType()), null, null, null, null, null, null, null, null, 1021, null), 3, true, 13, 0 == true ? 1 : 0);
        } else {
            historySectionState = null;
        }
        Account account2 = dataState.getAccount();
        AccountsHistoryContract.Key key = account2 != null ? new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, account2.getAccountNumber(), false, FragmentTab.ISA, 20, null) : null;
        IsaPromotion promotion = dataState.getPromotion();
        if (promotion == null) {
            upsellConfig = null;
        } else {
            if (!promotion.isActive()) {
                promotion = null;
            }
            if (promotion != null) {
                upsellConfig = promotion.getUpsellConfig();
            }
        }
        IsaContributions contributions4 = dataState.getContributions();
        if (contributions4 != null && (items = contributions4.getItems()) != null) {
            persistentList = extensions2.toPersistentList(items);
        }
        return new IsaContributionHubViewState(persistentList, contributionState, isaContribution, str2, stringResource, historySectionState, key, upsellConfig);
    }
}
