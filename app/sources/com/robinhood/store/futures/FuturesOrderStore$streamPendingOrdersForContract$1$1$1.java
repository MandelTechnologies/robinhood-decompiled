package com.robinhood.store.futures;

import com.robinhood.websocket.gateway.WebsocketGatewayTopic;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$streamPendingOrdersForContract$1$1$1", m3645f = "FuturesOrderStore.kt", m3646l = {513}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$streamPendingOrdersForContract$1$1$1 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$streamPendingOrdersForContract$1$1$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$streamPendingOrdersForContract$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FuturesOrderStore$streamPendingOrdersForContract$1$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FuturesOrderStore$streamPendingOrdersForContract$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<T> flowStream = this.this$0.websocketGatewaySource.stream(WebsocketGatewayTopic.FuturesOrderUpdates.INSTANCE);
            C414611 c414611 = new C414611(this.this$0);
            this.label = 1;
            if (FlowKt.collectLatest(flowStream, c414611, this) == coroutine_suspended) {
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

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$streamPendingOrdersForContract$1$1$1$1 */
    /* synthetic */ class C414611 extends FunctionReferenceImpl implements Function2<WebsocketGatewayData.FuturesOrderUpdateData, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C414611(Object obj) {
            super(2, obj, FuturesOrderStore.class, "onWebsocketOrderUpdateReceived", "onWebsocketOrderUpdateReceived(Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WebsocketGatewayData.FuturesOrderUpdateData futuresOrderUpdateData, Continuation<? super Unit> continuation) {
            return ((FuturesOrderStore) this.receiver).onWebsocketOrderUpdateReceived(futuresOrderUpdateData, continuation);
        }
    }
}
