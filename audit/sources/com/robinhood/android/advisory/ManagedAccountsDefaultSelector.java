package com.robinhood.android.advisory;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ManagedAccountsDefaultSelector.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"getDefaultManagedAccount", "Lcom/robinhood/models/db/Account;", "", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.ManagedAccountsDefaultSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedAccountsDefaultSelector {
    public static final Account getDefaultManagedAccount(List<Account> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listListOf = CollectionsKt.listOf((Object[]) new BrokerageAccountType[]{BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.JOINT_TENANCY_WITH_ROS});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Account account = (Account) obj2;
            if (account.isManaged() && listListOf.contains(account.getBrokerageAccountType())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIndexOf = listListOf.indexOf(((Account) next).getBrokerageAccountType());
                do {
                    Object next2 = it.next();
                    int iIndexOf2 = listListOf.indexOf(((Account) next2).getBrokerageAccountType());
                    if (iIndexOf > iIndexOf2) {
                        next = next2;
                        iIndexOf = iIndexOf2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Account) obj;
    }
}
