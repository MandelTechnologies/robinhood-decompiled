package com.twilio.twilsock.client;

import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TwilsockTransport.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/twilio/twilsock/client/TwilsockTransport$notifyListener$1"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockTransport$doDisconnect$$inlined$notifyListener$1", m3645f = "TwilsockTransport.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockTransport$doDisconnect$$inlined$notifyListener$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockTransport4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ErrorInfo $errorInfo$inlined;
    int label;
    final /* synthetic */ TwilsockTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilsockTransport4(TwilsockTransport twilsockTransport, Continuation continuation, ErrorInfo errorInfo) {
        super(2, continuation);
        this.this$0 = twilsockTransport;
        this.$errorInfo$inlined = errorInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwilsockTransport4(this.this$0, continuation, this.$errorInfo$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwilsockTransport4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.listener.onTransportDisconnected(this.$errorInfo$inlined);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
