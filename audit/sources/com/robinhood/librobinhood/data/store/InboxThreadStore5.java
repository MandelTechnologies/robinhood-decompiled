package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiThread;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxThreadStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiThread;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxThreadStore$getThreads$2", m3645f = "InboxThreadStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InboxThreadStore$getThreads$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InboxThreadStore5 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiThread>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InboxThreadStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxThreadStore5(InboxThreadStore inboxThreadStore, Continuation<? super InboxThreadStore5> continuation) {
        super(2, continuation);
        this.this$0 = inboxThreadStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InboxThreadStore5 inboxThreadStore5 = new InboxThreadStore5(this.this$0, continuation);
        inboxThreadStore5.L$0 = obj;
        return inboxThreadStore5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiThread> paginatedResult, Continuation<? super Unit> continuation) {
        return ((InboxThreadStore5) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiThread> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiThread>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((PaginatedResult<ApiThread>) this.L$0);
        return Unit.INSTANCE;
    }
}
