package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockState;
import java.util.Iterator;
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

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/twilio/twilsock/client/TwilsockImpl$notifyObservers$1"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl$stateMachine$1$1$1$invoke$$inlined$notifyObservers$1", m3645f = "Twilsock.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1$1$1$invoke$$inlined$notifyObservers$1 */
/* loaded from: classes12.dex */
public final class C43467x63982183 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TwilsockState.Disconnected $this_onEnter$inlined;
    int label;
    final /* synthetic */ TwilsockImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43467x63982183(TwilsockImpl twilsockImpl, Continuation continuation, TwilsockState.Disconnected disconnected) {
        super(2, continuation);
        this.this$0 = twilsockImpl;
        this.$this_onEnter$inlined = disconnected;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C43467x63982183(this.this$0, continuation, this.$this_onEnter$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C43467x63982183) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Iterator it = this.this$0.observers.iterator();
        while (it.hasNext()) {
            ((TwilsockObserver) it.next()).getOnDisconnected().invoke(this.$this_onEnter$inlined.getErrorInfo().getMessage());
        }
        return Unit.INSTANCE;
    }
}
