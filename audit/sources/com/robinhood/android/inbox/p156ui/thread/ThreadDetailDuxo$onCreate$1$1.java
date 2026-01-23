package com.robinhood.android.inbox.p156ui.thread;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$onCreate$1$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class ThreadDetailDuxo$onCreate$1$1 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
    final /* synthetic */ Boolean $enabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreadDetailDuxo$onCreate$1$1(Boolean bool, Continuation<? super ThreadDetailDuxo$onCreate$1$1> continuation) {
        super(2, continuation);
        this.$enabled = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThreadDetailDuxo$onCreate$1$1 threadDetailDuxo$onCreate$1$1 = new ThreadDetailDuxo$onCreate$1$1(this.$enabled, continuation);
        threadDetailDuxo$onCreate$1$1.L$0 = obj;
        return threadDetailDuxo$onCreate$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
        return ((ThreadDetailDuxo$onCreate$1$1) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ThreadDetailDataState threadDetailDataState = (ThreadDetailDataState) this.L$0;
        Boolean bool = this.$enabled;
        Intrinsics.checkNotNull(bool);
        return ThreadDetailDataState.copy$default(threadDetailDataState, null, null, null, bool.booleanValue(), null, false, false, false, null, null, null, 2039, null);
    }
}
