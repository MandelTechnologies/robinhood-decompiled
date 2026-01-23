package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.dao.RhyTransactionDao;
import com.robinhood.models.p320db.bonfire.RhyTransaction3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransaction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$endpoint$2", m3645f = "RhyTransactionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTransactionStore3 extends ContinuationImpl7 implements Function2<ApiRhyTransaction, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTransactionStore3(RhyTransactionStore rhyTransactionStore, Continuation<? super RhyTransactionStore3> continuation) {
        super(2, continuation);
        this.this$0 = rhyTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyTransactionStore3 rhyTransactionStore3 = new RhyTransactionStore3(this.this$0, continuation);
        rhyTransactionStore3.L$0 = obj;
        return rhyTransactionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRhyTransaction apiRhyTransaction, Continuation<? super Unit> continuation) {
        return ((RhyTransactionStore3) create(apiRhyTransaction, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((RhyTransactionDao) RhyTransaction3.toDbModel((ApiRhyTransaction) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
