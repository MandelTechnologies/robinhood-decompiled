package com.robinhood.shared.chart.store.advancedChart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [TRequest, TApiResponse] */
/* compiled from: BaseAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002 \u0000*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n"}, m3636d2 = {"<anonymous>", "", "TRequest", "", "TApiResponse", "<unused var>", "advancedChart"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$getAdvancedChartEndpoint$2", m3645f = "BaseAdvancedChartStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$getAdvancedChartEndpoint$2, reason: use source file name */
/* loaded from: classes26.dex */
final class BaseAdvancedChartStore4<TApiResponse, TRequest> extends ContinuationImpl7 implements Function3<TRequest, TApiResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseAdvancedChartStore4(BaseAdvancedChartStore<? super TRequest, TApiResponse, TDbModel> baseAdvancedChartStore, Continuation<? super BaseAdvancedChartStore4> continuation) {
        super(3, continuation);
        this.this$0 = baseAdvancedChartStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
        return invoke2((BaseAdvancedChartStore4<TApiResponse, TRequest>) obj, obj2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TRequest trequest, TApiResponse tapiresponse, Continuation<? super Unit> continuation) {
        BaseAdvancedChartStore4 baseAdvancedChartStore4 = new BaseAdvancedChartStore4(this.this$0, continuation);
        baseAdvancedChartStore4.L$0 = tapiresponse;
        return baseAdvancedChartStore4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> baseAdvancedChartStore = this.this$0;
            this.label = 1;
            if (baseAdvancedChartStore.cacheChart(obj2, this) == coroutine_suspended) {
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
