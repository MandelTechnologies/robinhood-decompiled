package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.models.api.BrokerageAccountType;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0082\b\u001a\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¨\u0006\n"}, m3636d2 = {"mapToAccountSelectionOptions", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "isEligible", "Lkotlin/Function1;", "", "ineligibilityReason", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "sortAccountSelectionOptions", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDataStateKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountSelectionDataState2 {
    private static final List<AccountSelectionListFragment.Args.AccountSelectionOption> mapToAccountSelectionOptions(List<UiIatAccount> list, Function1<? super UiIatAccount, Boolean> function1, Function1<? super UiIatAccount, ? extends IATIneligibilityReason> function12) {
        List<UiIatAccount> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (UiIatAccount uiIatAccount : list2) {
            arrayList.add(new AccountSelectionListFragment.Args.AccountSelectionOption(uiIatAccount, function1.invoke(uiIatAccount).booleanValue(), function12.invoke(uiIatAccount)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AccountSelectionListFragment.Args.AccountSelectionOption> sortAccountSelectionOptions(List<AccountSelectionListFragment.Args.AccountSelectionOption> list) {
        final Comparator comparator = new Comparator() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDataStateKt$sortAccountSelectionOptions$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(((AccountSelectionListFragment.Args.AccountSelectionOption) t2).isEligible()), Boolean.valueOf(((AccountSelectionListFragment.Args.AccountSelectionOption) t).isEligible()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDataStateKt$sortAccountSelectionOptions$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Boolean.valueOf(!((AccountSelectionListFragment.Args.AccountSelectionOption) t2).getAccount().getBrokerageAccountType().isRetirement()), Boolean.valueOf(!((AccountSelectionListFragment.Args.AccountSelectionOption) t).getAccount().getBrokerageAccountType().isRetirement()));
            }
        };
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDataStateKt$sortAccountSelectionOptions$$inlined$thenByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                BrokerageAccountType brokerageAccountType = ((AccountSelectionListFragment.Args.AccountSelectionOption) t2).getAccount().getBrokerageAccountType();
                BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.INDIVIDUAL;
                return ComparisonsKt.compareValues(Boolean.valueOf(brokerageAccountType == brokerageAccountType2), Boolean.valueOf(((AccountSelectionListFragment.Args.AccountSelectionOption) t).getAccount().getBrokerageAccountType() == brokerageAccountType2));
            }
        });
    }
}
