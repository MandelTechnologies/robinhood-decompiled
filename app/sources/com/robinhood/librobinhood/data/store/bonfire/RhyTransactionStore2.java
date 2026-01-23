package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransaction;", "request", "Lcom/robinhood/shared/models/history/shared/TransactionReference;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$endpoint$1", m3645f = "RhyTransactionStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTransactionStore2 extends ContinuationImpl7 implements Function2<TransactionReference, Continuation<? super ApiRhyTransaction>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTransactionStore2(RhyTransactionStore rhyTransactionStore, Continuation<? super RhyTransactionStore2> continuation) {
        super(2, continuation);
        this.this$0 = rhyTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyTransactionStore2 rhyTransactionStore2 = new RhyTransactionStore2(this.this$0, continuation);
        rhyTransactionStore2.L$0 = obj;
        return rhyTransactionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransactionReference transactionReference, Continuation<? super ApiRhyTransaction> continuation) {
        return ((RhyTransactionStore2) create(transactionReference, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        TransactionReference transactionReference = (TransactionReference) this.L$0;
        RhyBonfireApi rhyBonfireApi = this.this$0.api;
        UUID sourceId = transactionReference.getSourceId();
        String serverValue = transactionReference.getSourceType().getServerValue();
        this.label = 1;
        Object rhyTransaction = rhyBonfireApi.getRhyTransaction(sourceId, serverValue, this);
        return rhyTransaction == coroutine_suspended ? coroutine_suspended : rhyTransaction;
    }
}
