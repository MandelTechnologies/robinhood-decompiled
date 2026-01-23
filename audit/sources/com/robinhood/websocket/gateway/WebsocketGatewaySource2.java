package com.robinhood.websocket.gateway;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* compiled from: WebsocketGatewaySource.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.gateway.WebsocketGatewaySource$scheduleCheckPong$2$1", m3645f = "WebsocketGatewaySource.kt", m3646l = {115}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.gateway.WebsocketGatewaySource$scheduleCheckPong$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class WebsocketGatewaySource2 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebsocketGatewaySource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebsocketGatewaySource2(WebsocketGatewaySource websocketGatewaySource, Continuation<? super WebsocketGatewaySource2> continuation) {
        super(1, continuation);
        this.this$0 = websocketGatewaySource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WebsocketGatewaySource2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WebsocketGatewaySource2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(WebsocketGatewayConstants.CLIENT_IDLE_TIMEOUT_MS, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.resetWebsocketConnection();
        return Unit.INSTANCE;
    }
}
