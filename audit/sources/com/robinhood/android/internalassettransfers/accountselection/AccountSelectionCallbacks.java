package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&R&\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", "", "accountSelectionFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "", "getAccountSelectionFlow", "()Lkotlinx/coroutines/flow/Flow;", "onRowClicked", "", "selectionType", "options", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "onAccountsSelected", "source", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "sink", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface AccountSelectionCallbacks {
    Flow<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> getAccountSelectionFlow();

    void onAccountsSelected(UiIatAccount source, UiIatAccount sink, EligibleAssets sourceEligibleAssets);

    void onRowClicked(AccountSelectionListFragment.AccountSelectionType selectionType, List<AccountSelectionListFragment.Args.AccountSelectionOption> options);
}
