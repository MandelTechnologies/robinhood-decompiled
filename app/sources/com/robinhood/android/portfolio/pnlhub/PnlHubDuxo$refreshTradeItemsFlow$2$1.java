package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$refreshTradeItemsFlow$2$1", m3645f = "PnlHubDuxo.kt", m3646l = {99, 100}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$refreshTradeItemsFlow$2$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ PnlHubViewState.Ready $viewState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$refreshTradeItemsFlow$2$1(PnlHubViewState.Ready ready, Continuation<? super PnlHubDuxo$refreshTradeItemsFlow$2$1> continuation) {
        super(2, continuation);
        this.$viewState = ready;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$refreshTradeItemsFlow$2$1 pnlHubDuxo$refreshTradeItemsFlow$2$1 = new PnlHubDuxo$refreshTradeItemsFlow$2$1(this.$viewState, continuation);
        pnlHubDuxo$refreshTradeItemsFlow$2$1.L$0 = obj;
        return pnlHubDuxo$refreshTradeItemsFlow$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((PnlHubDuxo$refreshTradeItemsFlow$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r4, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Boolean boolBoxBoolean;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ProfitAndLossTradeListState tradeListState = this.$viewState.getTradeListState();
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            boolBoxBoolean = boxing.boxBoolean(tradeListState.shouldRefresh$feature_profit_and_loss_hub_externalDebug(instantNow));
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(boolBoxBoolean, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            ProfitAndLossTradeListState tradeListState2 = this.$viewState.getTradeListState();
            Instant instantNow2 = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
            boolBoxBoolean = boxing.boxBoolean(tradeListState2.shouldRefresh$feature_profit_and_loss_hub_externalDebug(instantNow2));
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(boolBoxBoolean, this) != coroutine_suspended) {
                flowCollector2 = flowCollector;
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(60000, DurationUnitJvm.MILLISECONDS);
                this.L$0 = flowCollector2;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        flowCollector2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        Duration.Companion companion2 = Duration.INSTANCE;
        long duration2 = Duration3.toDuration(60000, DurationUnitJvm.MILLISECONDS);
        this.L$0 = flowCollector2;
        this.label = 2;
    }
}
