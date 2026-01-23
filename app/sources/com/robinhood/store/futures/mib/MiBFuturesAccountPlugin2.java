package com.robinhood.store.futures.mib;

import com.robinhood.models.p320db.Account;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MiBFuturesAccountPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0002¨\u0006\t"}, m3636d2 = {"futuresAllowedAccount", "Lcom/robinhood/models/db/Account;", "", "buildMiBFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "isInExperiment", "", "accounts", "", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPluginKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MiBFuturesAccountPlugin2 {
    public static final Account futuresAllowedAccount(Collection<Account> collection) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<Account> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Account) next).getHasFuturesAccount()) {
                break;
            }
        }
        Account account = (Account) next;
        if (account != null) {
            return account;
        }
        Iterator<T> it2 = collection2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((Account) next2).isOriginal()) {
                obj = next2;
                break;
            }
        }
        return (Account) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiBFuturesState buildMiBFuturesState(boolean z, List<Account> list) {
        return new MiBFuturesState(z, list.size() > 1, futuresAllowedAccount(list));
    }
}
