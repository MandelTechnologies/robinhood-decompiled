package com.robinhood.shared.chart.store.advancedChart;

import com.robinhood.android.moria.network.Endpoint;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: BaseAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$advancedChartQuery$1$1", m3645f = "BaseAdvancedChartStore.kt", m3646l = {51, 52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$advancedChartQuery$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class BaseAdvancedChartStore2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ TRequest $request;
    int label;
    final /* synthetic */ BaseAdvancedChartStore<TRequest, TApiResponse, TDbModel> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseAdvancedChartStore2(BaseAdvancedChartStore<? super TRequest, TApiResponse, TDbModel> baseAdvancedChartStore, TRequest trequest, Continuation<? super BaseAdvancedChartStore2> continuation) {
        super(2, continuation);
        this.this$0 = baseAdvancedChartStore;
        this.$request = trequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAdvancedChartStore2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((BaseAdvancedChartStore2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[PHI: r7
      0x0038: PHI (r7v0 com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$advancedChartQuery$1$1) = 
      (r7v1 com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$advancedChartQuery$1$1)
      (r7v2 com.robinhood.shared.chart.store.advancedChart.BaseAdvancedChartStore$advancedChartQuery$1$1)
     binds: [B:12:0x0035, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0047 -> B:11:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BaseAdvancedChartStore2 baseAdvancedChartStore2;
        long duration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                baseAdvancedChartStore2 = this;
                Duration.Companion companion = Duration.INSTANCE;
                duration = Duration3.toDuration(5, DurationUnitJvm.MINUTES);
                baseAdvancedChartStore2.label = 2;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Endpoint endpoint = ((BaseAdvancedChartStore) this.this$0).getAdvancedChartEndpoint;
        TRequest trequest = this.$request;
        this.label = 1;
        baseAdvancedChartStore2 = this;
        if (Endpoint.DefaultImpls.forceFetch$default(endpoint, trequest, null, baseAdvancedChartStore2, 2, null) != coroutine_suspended) {
            Duration.Companion companion2 = Duration.INSTANCE;
            duration = Duration3.toDuration(5, DurationUnitJvm.MINUTES);
            baseAdvancedChartStore2.label = 2;
            if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                Endpoint endpoint2 = ((BaseAdvancedChartStore) this.this$0).getAdvancedChartEndpoint;
                TRequest trequest2 = this.$request;
                this.label = 1;
                baseAdvancedChartStore2 = this;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint2, trequest2, null, baseAdvancedChartStore2, 2, null) != coroutine_suspended) {
                }
            }
        }
        return coroutine_suspended;
    }
}
