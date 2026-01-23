package com.robinhood.android.retirement.dashboard.header;

import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSwitcherExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "activeAccountNumber", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.header.AccountSwitcherExtensionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSwitcherExtensions2 {
    public static final AccountSwitcherData toAccountSwitcherData(RetirementAccountSwitcher retirementAccountSwitcher, String str) {
        Object obj;
        String str2;
        String loggingIdentifier;
        Intrinsics.checkNotNullParameter(retirementAccountSwitcher, "<this>");
        List<RetirementAccountSwitcher.Account> accounts2 = retirementAccountSwitcher.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        for (RetirementAccountSwitcher.Account account : accounts2) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String expandedTitle = account.getExpandedTitle();
            if (expandedTitle.length() == 0) {
                expandedTitle = account.getTitle();
            }
            arrayList.add(new AccountSwitcherRowData.Account(account.getAccountNumber(), account.getBrokerageAccountType(), account.getManagementType(), account.getCreatedAt(), account.getLoggingIdentifier(), companion.invoke(expandedTitle), companion.invoke(account.getDisplayAmount()), null, null, account.getIcon(), false, 1408, null));
        }
        RetirementAccountSwitcher.Cta cta = (RetirementAccountSwitcher.Cta) CollectionsKt.firstOrNull((List) retirementAccountSwitcher.getCtas());
        AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta = cta != null ? new AccountSwitcherDeeplinkCta(cta.getDeeplink(), cta.getTitle(), cta.getLoggingIdentifier()) : null;
        String title = retirementAccountSwitcher.getTitle();
        String positiveButtonText = retirementAccountSwitcher.getPositiveButtonText();
        if (str == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Constructing an account switcher with no active account"), true, null, 4, null);
            obj = null;
            str2 = "";
        } else {
            obj = null;
            str2 = str;
        }
        Screen.Name name = Screen.Name.RETIREMENT_DASHBOARD;
        Iterator<T> it = retirementAccountSwitcher.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((RetirementAccountSwitcher.Account) next).getAccountNumber(), str)) {
                obj = next;
                break;
            }
        }
        RetirementAccountSwitcher.Account account2 = (RetirementAccountSwitcher.Account) obj;
        return new AccountSwitcherData(arrayList, str2, false, new Screen(name, null, (account2 == null || (loggingIdentifier = account2.getLoggingIdentifier()) == null) ? "" : loggingIdentifier, null, 10, null), positiveButtonText, accountSwitcherDeeplinkCta, title, 4, null);
    }
}
