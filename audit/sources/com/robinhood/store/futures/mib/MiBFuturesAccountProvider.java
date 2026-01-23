package com.robinhood.store.futures.mib;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MiBFuturesAccountProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u000e\u0010\n\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/futures/mib/MiBFuturesAccountProvider;", "", "streamRhsAccountWithFuturesAccount", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Account;", "streamRhsAccountWithFuturesAccountAllowed", "streamRhsAccountNumberWithFuturesAccountAllowed", "", "streamUserMiBFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "forceGetMibFuturesState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface MiBFuturesAccountProvider {
    Object forceGetMibFuturesState(Continuation<? super MiBFuturesState> continuation);

    Flow<String> streamRhsAccountNumberWithFuturesAccountAllowed();

    Flow<Account> streamRhsAccountWithFuturesAccount();

    Flow<Account> streamRhsAccountWithFuturesAccountAllowed();

    Flow<MiBFuturesState> streamUserMiBFuturesState();
}
