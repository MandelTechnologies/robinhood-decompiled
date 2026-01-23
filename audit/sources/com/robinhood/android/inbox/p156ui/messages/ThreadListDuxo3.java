package com.robinhood.android.inbox.p156ui.messages;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ThreadListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markSelectedThreadsAsRead$2$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markSelectedThreadsAsRead$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class ThreadListDuxo3 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ThreadListDuxo3(Continuation<? super ThreadListDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThreadListDuxo3 threadListDuxo3 = new ThreadListDuxo3(continuation);
        threadListDuxo3.L$0 = obj;
        return threadListDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
        return ((ThreadListDuxo3) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, null, SetsKt.emptySet(), 0L, 11, null);
    }
}
