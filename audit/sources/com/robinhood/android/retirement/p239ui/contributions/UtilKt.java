package com.robinhood.android.retirement.p239ui.contributions;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"convertRetirementAccountsToRhsHistoryContexts", "", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "accounts", "", "Lcom/robinhood/models/db/Account;", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class UtilKt {
    public static final Set<HistoryStaticFilter.RhsAccountContext> convertRetirementAccountsToRhsHistoryContexts(List<Account> accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        ArrayList<Account> arrayList = new ArrayList();
        for (Object obj : accounts2) {
            if (((Account) obj).getBrokerageAccountType().isRetirement()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Account account : arrayList) {
            arrayList2.add(new HistoryStaticFilter.RhsAccountContext(account.getAccountNumber(), account.getBrokerageAccountType()));
        }
        return CollectionsKt.toSet(arrayList2);
    }
}
