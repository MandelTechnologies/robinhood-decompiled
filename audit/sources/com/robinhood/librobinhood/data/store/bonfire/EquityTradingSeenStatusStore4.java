package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityTradingSeenStatusStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$patchEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EquityTradingSeenStatusStore4 extends FunctionReferenceImpl implements Function2<ApiEquityTradingSeenStatusRequest, Continuation<? super ApiEquityTradingSeenStatusRequest2>, Object>, ContinuationImpl6 {
    EquityTradingSeenStatusStore4(Object obj) {
        super(2, obj, TradeEquityBonfireApi.class, "setSeenStatus", "setSeenStatus(Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEquityTradingSeenStatusRequest apiEquityTradingSeenStatusRequest, Continuation<? super ApiEquityTradingSeenStatusRequest2> continuation) {
        return ((TradeEquityBonfireApi) this.receiver).setSeenStatus(apiEquityTradingSeenStatusRequest, continuation);
    }
}
