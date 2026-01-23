package com.robinhood.android.futures.trade.p147ui.ordertype;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDataState;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class FuturesOrderTypeDuxo3 implements StateProvider<FuturesOrderTypeDataState, FuturesOrderTypeViewState> {
    public static final int $stable = 0;
    public static final FuturesOrderTypeDuxo3 INSTANCE = new FuturesOrderTypeDuxo3();

    private FuturesOrderTypeDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesOrderTypeViewState reduce(FuturesOrderTypeDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new FuturesOrderTypeViewState(dataState.getMarketOrderConfig(), dataState.getLimitOrderConfig(), dataState.getStopOrderConfig());
    }
}
