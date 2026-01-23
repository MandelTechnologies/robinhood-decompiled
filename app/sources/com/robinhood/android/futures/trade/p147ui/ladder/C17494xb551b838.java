package com.robinhood.android.futures.trade.p147ui.ladder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.p410dx.DxTopic;
import com.robinhood.websocket.p410dx.models.DxResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes10.dex */
public final class C17494xb551b838 extends ContinuationImpl7 implements Function3<FlowCollector<? super DxResponse.DomSnapshot>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FuturesLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17494xb551b838(Continuation continuation, FuturesLadderDuxo futuresLadderDuxo) {
        super(3, continuation);
        this.this$0 = futuresLadderDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super DxResponse.DomSnapshot> flowCollector, String str, Continuation<? super Unit> continuation) {
        C17494xb551b838 c17494xb551b838 = new C17494xb551b838(continuation, this.this$0);
        c17494xb551b838.L$0 = flowCollector;
        c17494xb551b838.L$1 = str;
        return c17494xb551b838.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T> flowStream = this.this$0.dxWebsocketSource.stream(new DxTopic.DepthOfMarket((String) this.L$1, DxTopic.InstrumentType.FUTURES));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStream, this) == coroutine_suspended) {
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
