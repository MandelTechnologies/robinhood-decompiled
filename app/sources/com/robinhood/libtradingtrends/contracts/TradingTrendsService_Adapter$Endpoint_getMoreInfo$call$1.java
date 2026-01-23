package com.robinhood.libtradingtrends.contracts;

import com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TradingTrendsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getMoreInfo$Emission;", "it", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super TradingTrendsService_Adapter.Endpoint_getMoreInfo.Emission>, Object> {
    int label;
    final /* synthetic */ TradingTrendsService_Adapter.Endpoint_getMoreInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1(TradingTrendsService_Adapter.Endpoint_getMoreInfo endpoint_getMoreInfo, Continuation<? super TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getMoreInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super TradingTrendsService_Adapter.Endpoint_getMoreInfo.Emission> continuation) {
        return ((TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TradingTrendsService tradingTrendsService = this.this$0.service;
            this.label = 1;
            obj = tradingTrendsService.getMoreInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TradingTrendsService_Adapter.Endpoint_getMoreInfo.Emission.m22825boximpl(TradingTrendsService_Adapter.Endpoint_getMoreInfo.Emission.m22826constructorimpl((String) obj));
    }
}
