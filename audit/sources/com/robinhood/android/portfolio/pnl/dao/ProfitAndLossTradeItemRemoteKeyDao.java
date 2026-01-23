package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItemRemoteKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ProfitAndLossTradeItemRemoteKeyDao.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemRemoteKeyDao;", "", "insert", "", "remoteKey", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItemRemoteKey;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItemRemoteKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextCursor", "", "request", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ProfitAndLossTradeItemRemoteKeyDao {
    Object clearAll(Continuation<? super Unit> continuation);

    Object getNextCursor(String str, Continuation<? super String> continuation);

    Object insert(ProfitAndLossTradeItemRemoteKey profitAndLossTradeItemRemoteKey, Continuation<? super Unit> continuation);
}
