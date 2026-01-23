package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.store.event.ProposalResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Produce4;
import p479j$.time.Duration;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1", m3645f = "EventComboStore.kt", m3646l = {EnumC7081g.f2773x8d9721ad, EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Produce4<ProposalResult> $$this$channelFlow;
    final /* synthetic */ Ref.BooleanRef $isCurrentlyTimeout;
    final /* synthetic */ Duration $timeoutDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1(Duration duration, Produce4<? super ProposalResult> produce4, Ref.BooleanRef booleanRef, Continuation<? super EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1> continuation) {
        super(2, continuation);
        this.$timeoutDuration = duration;
        this.$$this$channelFlow = produce4;
        this.$isCurrentlyTimeout = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1(this.$timeoutDuration, this.$$this$channelFlow, this.$isCurrentlyTimeout, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.send(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long millis = this.$timeoutDuration.toMillis();
            this.label = 1;
            if (DelayKt.delay(millis, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$isCurrentlyTimeout.element = true;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Produce4<ProposalResult> produce4 = this.$$this$channelFlow;
        ProposalResult.Timeout timeout = ProposalResult.Timeout.INSTANCE;
        this.label = 2;
    }
}
