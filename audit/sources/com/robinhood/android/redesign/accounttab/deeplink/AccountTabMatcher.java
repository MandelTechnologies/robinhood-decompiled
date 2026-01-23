package com.robinhood.android.redesign.accounttab.deeplink;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountTabMatcher.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0016\u0010\n\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabMatcher;", "", "<init>", "()V", "findRetirementTab", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "retirementIntent", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey$Retirement;", "availableTabs", "", "findSpendingTab", "findIndividualAccountTab", "homeIntent", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey$Home$Dashboard;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountTabMatcher {
    public static final int $stable = 0;

    /* compiled from: AccountTabMatcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountTabType.values().length];
            try {
                iArr[AccountTabType.RETIREMENT_IRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountTabType.RETIREMENT_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountTabType.RETIREMENT_SIGN_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountTabType.SPENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountTabType.CREDIT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final AccountTabInfo.Account findRetirementTab(TabLinkIntentKey.Retirement retirementIntent, List<AccountTabInfo.Account> availableTabs) {
        Object next;
        Intrinsics.checkNotNullParameter(retirementIntent, "retirementIntent");
        Intrinsics.checkNotNullParameter(availableTabs, "availableTabs");
        String accountNumber = retirementIntent.getAccountNumber();
        ArrayList arrayList = new ArrayList();
        for (Object obj : availableTabs) {
            int i = WhenMappings.$EnumSwitchMapping$0[((AccountTabInfo.Account) obj).getAccountType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                arrayList.add(obj);
            }
        }
        if (accountNumber != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AccountTabInfo.Account) next).getAccountId(), accountNumber)) {
                    break;
                }
            }
            AccountTabInfo.Account account = (AccountTabInfo.Account) next;
            if (account != null) {
                return account;
            }
        }
        return (AccountTabInfo.Account) CollectionsKt.firstOrNull((List) arrayList);
    }

    public final AccountTabInfo.Account findSpendingTab(List<AccountTabInfo.Account> availableTabs) {
        Intrinsics.checkNotNullParameter(availableTabs, "availableTabs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : availableTabs) {
            int i = WhenMappings.$EnumSwitchMapping$0[((AccountTabInfo.Account) obj).getAccountType().ordinal()];
            if (i == 4 || i == 5) {
                arrayList.add(obj);
            }
        }
        return (AccountTabInfo.Account) CollectionsKt.firstOrNull((List) arrayList);
    }

    public final AccountTabInfo.Account findIndividualAccountTab(TabLinkIntentKey.Home.Dashboard homeIntent, List<AccountTabInfo.Account> availableTabs) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(homeIntent, "homeIntent");
        Intrinsics.checkNotNullParameter(availableTabs, "availableTabs");
        HomeDashboardType dashboardType = homeIntent.getDashboardType();
        List<AccountTabInfo.Account> list = availableTabs;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((AccountTabInfo.Account) next).getAccountId(), dashboardType.getAccountNumber())) {
                break;
            }
        }
        AccountTabInfo.Account account = (AccountTabInfo.Account) next;
        if (account != null) {
            return account;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AccountTabInfo.Account) next2).getAccountType() == AccountTabType.INDIVIDUAL) {
                obj = next2;
                break;
            }
        }
        return (AccountTabInfo.Account) obj;
    }
}
