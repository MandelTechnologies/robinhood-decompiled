package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore$declineRequestEndpoint$2", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class MatchaPendingTransactionStore$declineRequestEndpoint$2 extends ContinuationImpl7 implements Function2<ApiMatchaRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaPendingTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaPendingTransactionStore$declineRequestEndpoint$2(MatchaPendingTransactionStore matchaPendingTransactionStore, Continuation<? super MatchaPendingTransactionStore$declineRequestEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = matchaPendingTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaPendingTransactionStore$declineRequestEndpoint$2 matchaPendingTransactionStore$declineRequestEndpoint$2 = new MatchaPendingTransactionStore$declineRequestEndpoint$2(this.this$0, continuation);
        matchaPendingTransactionStore$declineRequestEndpoint$2.L$0 = obj;
        return matchaPendingTransactionStore$declineRequestEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchaRequest apiMatchaRequest, Continuation<? super Unit> continuation) {
        return ((MatchaPendingTransactionStore$declineRequestEndpoint$2) create(apiMatchaRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.deleteTransaction(((ApiMatchaRequest) this.L$0).getId());
        return Unit.INSTANCE;
    }
}
