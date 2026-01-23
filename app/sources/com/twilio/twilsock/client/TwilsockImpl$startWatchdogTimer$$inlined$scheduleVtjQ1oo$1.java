package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockEvent;
import com.twilio.util.ErrorInfo;
import com.twilio.util.Timer;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Timer.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/twilio/util/Timer$schedule$1"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl$startWatchdogTimer$$inlined$schedule-VtjQ1oo$1", m3645f = "Twilsock.kt", m3646l = {26}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockImpl$startWatchdogTimer$$inlined$schedule-VtjQ1oo$1, reason: invalid class name */
/* loaded from: classes12.dex */
public final class TwilsockImpl$startWatchdogTimer$$inlined$scheduleVtjQ1oo$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    int label;
    final /* synthetic */ TwilsockImpl this$0;
    final /* synthetic */ Timer this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilsockImpl$startWatchdogTimer$$inlined$scheduleVtjQ1oo$1(long j, Timer timer, Continuation continuation, TwilsockImpl twilsockImpl) {
        super(2, continuation);
        this.$duration = j;
        this.this$0$inline_fun = timer;
        this.this$0 = twilsockImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwilsockImpl$startWatchdogTimer$$inlined$scheduleVtjQ1oo$1(this.$duration, this.this$0$inline_fun, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwilsockImpl$startWatchdogTimer$$inlined$scheduleVtjQ1oo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$duration;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0$inline_fun.setJob(null);
        TwilioLogger.w$default(TwilioLogger3.getLogger(this.this$0), "watchdog timeout", (Throwable) null, 2, (Object) null);
        this.this$0.stateMachine.transition(new TwilsockEvent.OnNonFatalError(new ErrorInfo(TwilioException2.Timeout, 0, 0, "watchdog timeout", (String) null, 22, (DefaultConstructorMarker) null)));
        return Unit.INSTANCE;
    }
}
