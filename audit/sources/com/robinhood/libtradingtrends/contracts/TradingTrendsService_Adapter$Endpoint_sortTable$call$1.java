package com.robinhood.libtradingtrends.contracts;

import com.plaid.internal.EnumC7081g;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_sortTable$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_sortTable$call$1", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TradingTrendsService_Adapter$Endpoint_sortTable$call$1 extends ContinuationImpl7 implements Function2<TradingTrendsService_Adapter.Endpoint_sortTable.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradingTrendsService_Adapter.Endpoint_sortTable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TradingTrendsService_Adapter$Endpoint_sortTable$call$1(TradingTrendsService_Adapter.Endpoint_sortTable endpoint_sortTable, Continuation<? super TradingTrendsService_Adapter$Endpoint_sortTable$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_sortTable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradingTrendsService_Adapter$Endpoint_sortTable$call$1 tradingTrendsService_Adapter$Endpoint_sortTable$call$1 = new TradingTrendsService_Adapter$Endpoint_sortTable$call$1(this.this$0, continuation);
        tradingTrendsService_Adapter$Endpoint_sortTable$call$1.L$0 = obj;
        return tradingTrendsService_Adapter$Endpoint_sortTable$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TradingTrendsService_Adapter.Endpoint_sortTable.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((TradingTrendsService_Adapter$Endpoint_sortTable$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TradingTrendsService_Adapter.Endpoint_sortTable.Arguments arguments = (TradingTrendsService_Adapter.Endpoint_sortTable.Arguments) this.L$0;
            TradingTrendsService tradingTrendsService = this.this$0.service;
            String sortKey = arguments.getSortKey();
            String sortDirection = arguments.getSortDirection();
            this.label = 1;
            if (tradingTrendsService.sortTable(sortKey, sortDirection, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
