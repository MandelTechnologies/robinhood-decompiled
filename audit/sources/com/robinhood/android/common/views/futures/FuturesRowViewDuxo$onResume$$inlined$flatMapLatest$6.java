package com.robinhood.android.common.views.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.views.futures.FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6", m3645f = "FuturesRowViewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6 extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends FuturesChartResult>>, UUID, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FuturesRowViewDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6(Continuation continuation, FuturesRowViewDuxo futuresRowViewDuxo) {
        super(3, continuation);
        this.this$0 = futuresRowViewDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Result<? extends FuturesChartResult>> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6 futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6 = new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6(continuation, this.this$0);
        futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6.L$0 = flowCollector;
        futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6.L$1 = uuid;
        return futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r12, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6 futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            UUID uuid = (UUID) this.L$1;
            FuturesChartsServiceManager futuresChartsServiceManager = this.this$0.futuresChartsServiceManager;
            DisplaySpan displaySpan = DisplaySpan.DAY;
            ChartType chartType = ChartType.LINE;
            this.L$0 = flowCollector;
            this.label = 1;
            futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6 = this;
            obj = futuresChartsServiceManager.streamFuturesChartResult(uuid, displaySpan, chartType, false, true, futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6 = this;
        futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6.L$0 = null;
        futuresRowViewDuxo$onResume$$inlined$flatMapLatest$6.label = 2;
    }
}
