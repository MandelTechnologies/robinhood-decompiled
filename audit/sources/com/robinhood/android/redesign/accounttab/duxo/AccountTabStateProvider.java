package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCache;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCoordinator;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import timber.log.Timber;

/* compiled from: AccountTabStateProvider.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002JG\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0000¢\u0006\u0002\b\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountSelectorViewState;", "deeplinkCoordinator", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "<init>", "(Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;)V", "getDeeplinkCoordinator", "()Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "reduce", "dataState", "handlePossibleLackOfPrimaryIndividualAccount", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "noBrokerageAccount", "", "tabInfoList", "", "partitionAndSortForDisplay", "Lkotlin/Pair;", "sortedIds", "", "", "", "partitionAndSortForDisplay$lib_account_tab_externalDebug", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountTabStateProvider implements StateProvider<AccountTabDataState, AccountSelectorViewState> {
    public static final int $stable = 8;
    private final AccountTabDeeplinkCoordinator deeplinkCoordinator;

    /* compiled from: AccountTabStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountTabType.values().length];
            try {
                iArr[AccountTabType.RETIREMENT_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountTabType.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountTabType.JOINT_SIGN_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountTabType.ADVISORY_SIGN_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AccountTabStateProvider(AccountTabDeeplinkCoordinator deeplinkCoordinator) {
        Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
        this.deeplinkCoordinator = deeplinkCoordinator;
    }

    public final AccountTabDeeplinkCoordinator getDeeplinkCoordinator() {
        return this.deeplinkCoordinator;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AccountSelectorViewState reduce(AccountTabDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ArrayList arrayList = new ArrayList();
        if (dataState.getUserHasNoBrokerageAccounts() && dataState.getSpendingTabInfo() == null) {
            return new AccountSelectorViewState(null, null, null, extensions2.persistentMapOf(), false, false, null, AccountTabInfo.Nux.INSTANCE, NewUserExperienceStage.PENDING, false, 71, null);
        }
        AccountTabInfo jointTabInfo = dataState.getJointTabInfo();
        arrayList.add(dataState.getIndividualTabInfo());
        List listListOf = CollectionsKt.listOf((Object[]) new AccountTabInfo.Account[]{dataState.getRetirementIraTabInfo(), dataState.getRetirementRothTabInfo()});
        List<AccountTabInfo.Account> otherIndividualTabInfoList = dataState.getOtherIndividualTabInfoList();
        if (otherIndividualTabInfoList == null) {
            otherIndividualTabInfoList = CollectionsKt.emptyList();
        }
        CollectionsKt.addAll(arrayList, CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listListOf, (Iterable) otherIndividualTabInfoList), new Comparator() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider$reduce$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                AccountTabInfo.Account account = (AccountTabInfo.Account) t2;
                AccountTabInfo.Account account2 = (AccountTabInfo.Account) t;
                return ComparisonsKt.compareValues(account != null ? account.getBalance() : null, account2 != null ? account2.getBalance() : null);
            }
        }));
        List<AccountTabInfo.Account> managedTabInfoList = dataState.getManagedTabInfoList();
        if (managedTabInfoList == null) {
            managedTabInfoList = CollectionsKt.emptyList();
        }
        CollectionsKt.addAll(arrayList, CollectionsKt.sortedWith(managedTabInfoList, new Comparator() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider$reduce$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AccountTabInfo.Account) t2).getBalance(), ((AccountTabInfo.Account) t).getBalance());
            }
        }));
        arrayList.add(dataState.getSpendingTabInfo());
        boolean z = jointTabInfo instanceof AccountTabInfo.Account;
        AccountTabTarget accountTabTarget = null;
        AccountTabInfo.Account account = z ? (AccountTabInfo.Account) jointTabInfo : null;
        boolean z2 = true;
        if (account != null && account.getAccountExists()) {
            arrayList.add(jointTabInfo);
        }
        List<AccountTabInfo.Account> managedTabInfoList2 = dataState.getManagedTabInfoList();
        if (managedTabInfoList2 == null) {
            managedTabInfoList2 = CollectionsKt.emptyList();
        }
        int size = managedTabInfoList2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z2 = false;
                break;
            }
            if (managedTabInfoList2.get(i).getBrokerageAccountType().isRetirement()) {
                break;
            }
            i++;
        }
        if (dataState.getRetirementIraTabInfo() == null && dataState.getRetirementRothTabInfo() == null && !z2) {
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new AccountTabInfo.Account(AccountTabType.RETIREMENT_SIGN_UP, BrokerageAccountType.UNKNOWN, companion.invoke(C26320R.string.account_retirement_sign_up, new Object[0]), companion.invoke(C26320R.string.subtitle_retirement, new Object[0]), null, "does-not-exist", null, null, null, false, true, null, false, 6608, null));
        }
        AccountTabInfo.Account account2 = z ? (AccountTabInfo.Account) jointTabInfo : null;
        if (account2 != null && !account2.getAccountExists()) {
            arrayList.add(jointTabInfo);
        }
        List<AccountTabInfo.Account> managedTabInfoList3 = dataState.getManagedTabInfoList();
        if (managedTabInfoList3 == null) {
            managedTabInfoList3 = CollectionsKt.emptyList();
        }
        if (managedTabInfoList3.isEmpty()) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            arrayList.add(new AccountTabInfo.Account(AccountTabType.ADVISORY_SIGN_UP, BrokerageAccountType.UNKNOWN, companion2.invoke(C26320R.string.account_advisory_sign_up, new Object[0]), companion2.invoke(C26320R.string.subtitle_advisory, new Object[0]), null, "does-not-exist", null, null, null, false, true, null, false, 6608, null));
        }
        Tuples2<List<AccountTabInfo.Account>, List<AccountTabInfo.Account>> tuples2PartitionAndSortForDisplay$lib_account_tab_externalDebug = partitionAndSortForDisplay$lib_account_tab_externalDebug(dataState.getPreferredAccountOrder(), CollectionsKt.toMutableList((Collection) CollectionsKt.filterNotNull(arrayList)));
        List<AccountTabInfo.Account> listComponent1 = tuples2PartitionAndSortForDisplay$lib_account_tab_externalDebug.component1();
        List<AccountTabInfo.Account> listComponent2 = tuples2PartitionAndSortForDisplay$lib_account_tab_externalDebug.component2();
        ImmutableList3<AccountTabInfo.Account> immutableList3HandlePossibleLackOfPrimaryIndividualAccount = handlePossibleLackOfPrimaryIndividualAccount(dataState.getUserHasNoBrokerageAccounts(), listComponent1);
        List<AccountTabInfo.Account> list = listComponent2;
        List<AccountTabInfo.Account> listPlus = CollectionsKt.plus((Collection) immutableList3HandlePossibleLackOfPrimaryIndividualAccount, (Iterable) list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AccountTabInfo.Account> list2 = listPlus;
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            linkedHashMap.put(((AccountTabInfo.Account) obj).getId(), Integer.valueOf(i2));
            i2 = i3;
        }
        if (!dataState.getLoading() && dataState.getPendingDeeplinkRequest() != null) {
            Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("Check matching tab for " + dataState.getPendingDeeplinkRequest(), new Object[0]);
            TabLinkIntentKey pendingDeeplinkRequest = dataState.getPendingDeeplinkRequest();
            AccountTabInfo.Account accountFindMatchingTab = this.deeplinkCoordinator.findMatchingTab(pendingDeeplinkRequest, listPlus);
            if (accountFindMatchingTab != null) {
                AccountTabDeeplinkCache.INSTANCE.updatePendingIntentKey(pendingDeeplinkRequest);
                accountTabTarget = new AccountTabTarget(accountFindMatchingTab);
            } else {
                AccountTabDeeplinkCache.INSTANCE.clear();
            }
        }
        return new AccountSelectorViewState(extensions2.toPersistentList(list2), extensions2.toPersistentList(immutableList3HandlePossibleLackOfPrimaryIndividualAccount), extensions2.toPersistentList(list), extensions2.toImmutableMap(linkedHashMap), dataState.getHasPrivacy(), dataState.getLoading(), accountTabTarget, null, dataState.getNewUserExperienceStage(), dataState.getShowSubtitles(), 128, null);
    }

    private final ImmutableList3<AccountTabInfo.Account> handlePossibleLackOfPrimaryIndividualAccount(boolean noBrokerageAccount, List<AccountTabInfo.Account> tabInfoList) {
        List<AccountTabInfo.Account> list = tabInfoList;
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (noBrokerageAccount) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (tabInfoList.get(i).getAccountType() == AccountTabType.SPENDING) {
                    mutableList.add(0, new AccountTabInfo.Account(AccountTabType.INDIVIDUAL_SIGN_UP, BrokerageAccountType.UNKNOWN, StringResource.INSTANCE.invoke(C26320R.string.account_individual, new Object[0]), null, null, "does-not-exist", null, null, null, false, true, null, false, 6616, null));
                    break;
                }
                i++;
            }
        }
        return extensions2.toPersistentList(mutableList);
    }

    public final Tuples2<List<AccountTabInfo.Account>, List<AccountTabInfo.Account>> partitionAndSortForDisplay$lib_account_tab_externalDebug(final Map<String, Long> sortedIds, List<AccountTabInfo.Account> tabInfoList) {
        Intrinsics.checkNotNullParameter(sortedIds, "sortedIds");
        Intrinsics.checkNotNullParameter(tabInfoList, "tabInfoList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : tabInfoList) {
            if (((AccountTabInfo.Account) obj).isUpsell()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Tuples2 tuples2 = new Tuples2(arrayList, arrayList2);
        List list = (List) tuples2.component1();
        List list2 = (List) tuples2.component2();
        if (sortedIds.isEmpty()) {
            return Tuples4.m3642to(list2, list);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (sortedIds.containsKey(((AccountTabInfo.Account) obj2).getSortId())) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        Tuples2 tuples22 = new Tuples2(arrayList3, arrayList4);
        List list3 = (List) tuples22.component1();
        List list4 = (List) tuples22.component2();
        List listSortedWith = CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider$partitionAndSortForDisplay$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l = (Long) sortedIds.get(((AccountTabInfo.Account) t).getSortId());
                Integer numValueOf = Integer.valueOf(l != null ? (int) l.longValue() : Integer.MAX_VALUE);
                Long l2 = (Long) sortedIds.get(((AccountTabInfo.Account) t2).getSortId());
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(l2 != null ? (int) l2.longValue() : Integer.MAX_VALUE));
            }
        });
        return Tuples4.m3642to(CollectionsKt.plus((Collection) listSortedWith, (Iterable) CollectionsKt.sortedWith(list4, new Comparator() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider$partitionAndSortForDisplay$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AccountTabInfo.Account) t).getAccountId(), ((AccountTabInfo.Account) t2).getAccountId());
            }
        })), CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabStateProvider$partitionAndSortForDisplay$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                AccountTabType accountType = ((AccountTabInfo.Account) t).getAccountType();
                int[] iArr = AccountTabStateProvider.WhenMappings.$EnumSwitchMapping$0;
                int i = iArr[accountType.ordinal()];
                int i2 = -1;
                Integer numValueOf = Integer.valueOf(i != 1 ? i != 2 ? i != 3 ? i != 4 ? -1 : 4 : 3 : 2 : 1);
                int i3 = iArr[((AccountTabInfo.Account) t2).getAccountType().ordinal()];
                if (i3 == 1) {
                    i2 = 1;
                } else if (i3 == 2) {
                    i2 = 2;
                } else if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 4) {
                    i2 = 4;
                }
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i2));
            }
        }));
    }
}
