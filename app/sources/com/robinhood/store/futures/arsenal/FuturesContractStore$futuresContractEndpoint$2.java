package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiFuturesContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$futuresContractEndpoint$2", m3645f = "FuturesContractStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesContractStore$futuresContractEndpoint$2 extends ContinuationImpl7 implements Function2<FuturesContract, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$futuresContractEndpoint$2(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$futuresContractEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$futuresContractEndpoint$2 futuresContractStore$futuresContractEndpoint$2 = new FuturesContractStore$futuresContractEndpoint$2(this.this$0, continuation);
        futuresContractStore$futuresContractEndpoint$2.L$0 = obj;
        return futuresContractStore$futuresContractEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesContract futuresContract, Continuation<? super Unit> continuation) {
        return ((FuturesContractStore$futuresContractEndpoint$2) create(futuresContract, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.futuresContractDao.insert((FuturesContractDao) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
