package com.robinhood.android.inbox.p156ui.thread;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ThreadDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$fetchPreviousMessages$2$2", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class ThreadDetailDuxo$fetchPreviousMessages$2$2 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ThreadDetailDuxo$fetchPreviousMessages$2$2(Continuation<? super ThreadDetailDuxo$fetchPreviousMessages$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThreadDetailDuxo$fetchPreviousMessages$2$2 threadDetailDuxo$fetchPreviousMessages$2$2 = new ThreadDetailDuxo$fetchPreviousMessages$2$2(continuation);
        threadDetailDuxo$fetchPreviousMessages$2$2.L$0 = obj;
        return threadDetailDuxo$fetchPreviousMessages$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
        return ((ThreadDetailDuxo$fetchPreviousMessages$2$2) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ThreadDetailDataState.copy$default((ThreadDetailDataState) this.L$0, null, null, null, false, null, false, false, false, null, null, null, 1983, null);
    }
}
