package com.robinhood.android.portfolio.pnl.dao;

import androidx.paging.PagingSource;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ProfitAndLossTradeItemDao.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH'J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH'J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005H'J\u000e\u0010\u0011\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao;", "", "insertAll", "", "users", "", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTradeItemsPagingSource", "Landroidx/paging/PagingSource;", "", "getTradeItemsPagingSourceWithSymbol", "requestSymbol", "", "getTradeItemsPagingSourceWithSymbolAndAssetClasses", "assetClasses", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ProfitAndLossTradeItemDao {
    Object clearAll(Continuation<? super Unit> continuation);

    PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSource();

    PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSourceWithSymbol(String requestSymbol);

    PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSourceWithSymbolAndAssetClasses(String requestSymbol, List<? extends AssetClass> assetClasses);

    Object insertAll(List<ProfitAndLossTradeItem> list, Continuation<? super Unit> continuation);
}
