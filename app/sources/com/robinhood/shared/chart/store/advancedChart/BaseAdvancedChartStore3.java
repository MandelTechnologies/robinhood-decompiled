package com.robinhood.shared.chart.store.advancedChart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [TRequest, TApiResponse] */
/* compiled from: BaseAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\n\b\u0001\u0010\u0003 \u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, m3636d2 = {"<anonymous>", "TApiResponse", "", "TRequest", "request"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$getAdvancedChartEndpoint$1", m3645f = "BaseAdvancedChartStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$getAdvancedChartEndpoint$1, reason: use source file name */
/* loaded from: classes26.dex */
final class BaseAdvancedChartStore3<TApiResponse, TRequest> extends ContinuationImpl7 implements Function2<TRequest, Continuation<? super TApiResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseAdvancedChartStore3(BaseAdvancedChartStore<? super TRequest, TApiResponse, TDbModel> baseAdvancedChartStore, Continuation<? super BaseAdvancedChartStore3> continuation) {
        super(2, continuation);
        this.this$0 = baseAdvancedChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseAdvancedChartStore3 baseAdvancedChartStore3 = new BaseAdvancedChartStore3(this.this$0, continuation);
        baseAdvancedChartStore3.L$0 = obj;
        return baseAdvancedChartStore3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((BaseAdvancedChartStore3<TApiResponse, TRequest>) obj, (Continuation) obj2);
    }

    public final Object invoke(TRequest trequest, Continuation<? super TApiResponse> continuation) {
        return ((BaseAdvancedChartStore3) create(trequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.L$0;
        BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> baseAdvancedChartStore = this.this$0;
        this.label = 1;
        Object objFetchChart = baseAdvancedChartStore.fetchChart(obj2, this);
        return objFetchChart == coroutine_suspended ? coroutine_suspended : objFetchChart;
    }
}
