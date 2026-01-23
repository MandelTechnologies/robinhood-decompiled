package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesProductStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresProduct", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesProductStore$futuresProductEndpoint$2", m3645f = "FuturesProductStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.arsenal.FuturesProductStore$futuresProductEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesProductStore3 extends ContinuationImpl7 implements Function2<FuturesProduct, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesProductStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesProductStore3(FuturesProductStore futuresProductStore, Continuation<? super FuturesProductStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresProductStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesProductStore3 futuresProductStore3 = new FuturesProductStore3(this.this$0, continuation);
        futuresProductStore3.L$0 = obj;
        return futuresProductStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesProduct futuresProduct, Continuation<? super Unit> continuation) {
        return ((FuturesProductStore3) create(futuresProduct, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.futuresProductDao.insert((FuturesProductDao) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
