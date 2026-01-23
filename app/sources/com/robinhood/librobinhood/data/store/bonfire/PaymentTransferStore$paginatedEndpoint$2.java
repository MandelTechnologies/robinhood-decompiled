package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p320db.bonfire.PaymentTransfer2;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import com.robinhood.util.LastUpdatedAtManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/transfers/api/ApiPaymentTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$paginatedEndpoint$2", m3645f = "PaymentTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PaymentTransferStore$paginatedEndpoint$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiPaymentTransfer>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentTransferStore$paginatedEndpoint$2(PaymentTransferStore paymentTransferStore, Continuation<? super PaymentTransferStore$paginatedEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentTransferStore$paginatedEndpoint$2 paymentTransferStore$paginatedEndpoint$2 = new PaymentTransferStore$paginatedEndpoint$2(this.this$0, continuation);
        paymentTransferStore$paginatedEndpoint$2.L$0 = obj;
        return paymentTransferStore$paginatedEndpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiPaymentTransfer> paginatedResult, Continuation<? super Unit> continuation) {
        return ((PaymentTransferStore$paginatedEndpoint$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiPaymentTransfer> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiPaymentTransfer>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        if (paginatedResult.getNext() == null) {
            LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), PaymentTransfer.class, 0L, 2, null);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult, 10));
        Iterator<T> it = paginatedResult.iterator();
        while (it.hasNext()) {
            arrayList.add(PaymentTransfer2.toDbModel((ApiPaymentTransfer) it.next()));
        }
        this.this$0.checkHasTransferredFundsIntoRhc(arrayList);
        this.this$0.paymentTransferDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
