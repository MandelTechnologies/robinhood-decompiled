package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderDataState;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesLadderStateProvider implements StateProvider<FuturesLadderDataState, FuturesLadderViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesLadderViewState reduce(FuturesLadderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<FuturesLadderDataState.PendingOrder> allOrdersPendingExecution$feature_futures_trade_externalDebug = dataState.getAllOrdersPendingExecution$feature_futures_trade_externalDebug();
        FuturesLadderViewState.QuantityPanelData quantityPanelData = dataState.getQuantityPanelData();
        FuturesAccount account = dataState.getAccount();
        return new FuturesLadderViewState(account != null ? account.getRhsAccountNumber() : null, dataState.getContractId(), dataState.getTopBarData(), dataState.getLadderData(quantityPanelData, allOrdersPendingExecution$feature_futures_trade_externalDebug), dataState.getBottomPanelData(quantityPanelData, allOrdersPendingExecution$feature_futures_trade_externalDebug), dataState.getSettingsBottomSheetData(), dataState.getLadderFtuxProgressState(), dataState.getLoggingContext());
    }
}
