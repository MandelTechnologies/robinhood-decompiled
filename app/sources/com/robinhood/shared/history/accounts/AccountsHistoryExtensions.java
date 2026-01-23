package com.robinhood.shared.history.accounts;

import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountsHistoryExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"loadFirstSelectedAccountTypeFilter", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "", "key", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "feature-accounts-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryExtensionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AccountsHistoryExtensions {
    public static final AccountsHistoryStore.HistoryAccountFilterViewInfo loadFirstSelectedAccountTypeFilter(List<? extends AccountsHistoryStore.HistoryAccountFilterViewInfo> list, AccountsHistoryContract.Key key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = null;
        if (key.getAccountNumber() == null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount((AccountsHistoryStore.HistoryAccountFilterViewInfo) next) == key.getAccountTypeFilter()) {
                    obj = next;
                    break;
                }
            }
            return (AccountsHistoryStore.HistoryAccountFilterViewInfo) obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) next2).getAccountNumber(), key.getAccountNumber())) {
                obj = next2;
                break;
            }
        }
        return (AccountsHistoryStore.HistoryAccountFilterViewInfo) obj;
    }
}
