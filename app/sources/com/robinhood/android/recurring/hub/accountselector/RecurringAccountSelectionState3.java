package com.robinhood.android.recurring.hub.accountselector;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.recurring.hub.C26221R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: RecurringAccountSelectionState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDataState;", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionStateProvider, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecurringAccountSelectionState3 implements StateProvider<RecurringAccountSelectionDataState, RecurringAccountSelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RecurringAccountSelectionViewState reduce(RecurringAccountSelectionDataState dataState) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<RecurringAccount> listSortedWith = CollectionsKt.sortedWith(dataState.getRecurringAccounts(), new Comparator() { // from class: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionStateProvider$reduce$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                RecurringAccount recurringAccount = (RecurringAccount) t;
                RecurringAccount recurringAccount2 = (RecurringAccount) t2;
                return ComparisonsKt.compareValues(Integer.valueOf(!recurringAccount.isRecurringEnabled() ? Integer.MAX_VALUE : BrokerageAccountTypes2.getSortValue(recurringAccount.getAccount().getBrokerageAccountType())), Integer.valueOf(recurringAccount2.isRecurringEnabled() ? BrokerageAccountTypes2.getSortValue(recurringAccount2.getAccount().getBrokerageAccountType()) : Integer.MAX_VALUE));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (RecurringAccount recurringAccount : listSortedWith) {
            UnifiedAccountV2 account = recurringAccount.getAccount();
            BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
            ManagementType managementType = account.getManagementType();
            Instant createdAt = account.getCreatedAt();
            String accountNumber = account.getAccountNumber();
            StringResource title = AccountDisplayNames.getDisplayName(account).getWithInvesting().getTitle();
            if (recurringAccount.isRecurringEnabled()) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C26221R.string.recurring_account_selection_buying_power, Money.format$default(account.getAccountBuyingPower(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C26221R.string.recurring_account_type_joint_description, new Object[0]);
            }
            arrayList.add(new AccountSelectorRowData(brokerageAccountType, managementType, createdAt, null, accountNumber, title, stringResourceInvoke, AccountDisplayIcons.getDisplayIcon24(account.getBrokerageAccountType(), account.getManagementType()), null, null, recurringAccount.isRecurringEnabled(), 776, null));
        }
        return new RecurringAccountSelectionViewState(StringResource.INSTANCE.invoke(C26221R.string.recurring_account_selection_title, new Object[0]), new AccountSelectorData(extensions2.toImmutableList(arrayList)));
    }
}
