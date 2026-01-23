package com.robinhood.android.tradingtrends.p264ui.details.table;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsTableComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1", m3645f = "TradingTrendsTableComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradingTrendsTableDuxo $duxo;
    final /* synthetic */ String $tradingTrendsType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1(TradingTrendsTableDuxo tradingTrendsTableDuxo, String str, Continuation<? super TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1> continuation) {
        super(2, continuation);
        this.$duxo = tradingTrendsTableDuxo;
        this.$tradingTrendsType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1(this.$duxo, this.$tradingTrendsType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradingTrendsTableComposableKt$TradingTrendsTableComposable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.setTradingTrendsType(this.$tradingTrendsType);
        return Unit.INSTANCE;
    }
}
