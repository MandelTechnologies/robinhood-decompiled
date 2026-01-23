package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$combinedContractAndProductEndpoint$2", m3645f = "FuturesContractStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesContractStore$combinedContractAndProductEndpoint$2 extends ContinuationImpl7 implements Function2<Tuples2<? extends FuturesContract, ? extends FuturesProduct>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$combinedContractAndProductEndpoint$2(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$combinedContractAndProductEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$combinedContractAndProductEndpoint$2 futuresContractStore$combinedContractAndProductEndpoint$2 = new FuturesContractStore$combinedContractAndProductEndpoint$2(this.this$0, continuation);
        futuresContractStore$combinedContractAndProductEndpoint$2.L$0 = obj;
        return futuresContractStore$combinedContractAndProductEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends FuturesContract, ? extends FuturesProduct> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<FuturesContract, FuturesProduct>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<FuturesContract, FuturesProduct> tuples2, Continuation<? super Unit> continuation) {
        return ((FuturesContractStore$combinedContractAndProductEndpoint$2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            FuturesContract futuresContract = (FuturesContract) tuples2.component1();
            FuturesProduct futuresProduct = (FuturesProduct) tuples2.component2();
            this.this$0.futuresContractDao.insert((FuturesContractDao) futuresContract);
            this.this$0.futuresProductDao.insert((FuturesProductDao) futuresProduct);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
