package com.robinhood.shared.account.contracts.switcher;

import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSwitcherUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"filterDeactivatedForSwitcher", "", "Lcom/robinhood/models/db/Account;", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AccountSwitcherUtils4 {
    public static final List<Account> filterDeactivatedForSwitcher(List<Account> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Account account = (Account) obj;
            if (!account.getDeactivated() || account.isOriginal()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
