package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState2;
import com.robinhood.models.p320db.InboxThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$3$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class ThreadListDuxo2 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
    final /* synthetic */ List<InboxThread> $threads;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreadListDuxo2(List<InboxThread> list, Continuation<? super ThreadListDuxo2> continuation) {
        super(2, continuation);
        this.$threads = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThreadListDuxo2 threadListDuxo2 = new ThreadListDuxo2(this.$threads, continuation);
        threadListDuxo2.L$0 = obj;
        return threadListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
        return ((ThreadListDuxo2) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ThreadListDataState threadListDataState = (ThreadListDataState) this.L$0;
        List<InboxThread> list = this.$threads;
        Intrinsics.checkNotNull(list);
        return ThreadListDataState.copy$default(threadListDataState, new ThreadListViewState2.Success(list), null, null, 0L, 14, null);
    }
}
