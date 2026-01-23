package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.LocalDate;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$paginatedEndpoint$1", m3645f = "PaymentTransferStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PaymentTransferStore$paginatedEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiPaymentTransfer>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentTransferStore$paginatedEndpoint$1(PaymentTransferStore paymentTransferStore, Continuation<? super PaymentTransferStore$paginatedEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentTransferStore$paginatedEndpoint$1 paymentTransferStore$paginatedEndpoint$1 = new PaymentTransferStore$paginatedEndpoint$1(this.this$0, continuation);
        paymentTransferStore$paginatedEndpoint$1.L$0 = obj;
        return paymentTransferStore$paginatedEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiPaymentTransfer>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiPaymentTransfer>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiPaymentTransfer>> continuation) {
        return ((PaymentTransferStore$paginatedEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        LocalDate lastUpdatedAtDate = this.this$0.getLastUpdatedAtManager().getLastUpdatedAtDate(PaymentTransfer.class);
        this.label = 1;
        Object paymentTransfers$default = TransfersBonfireApi.DefaultImpls.getPaymentTransfers$default(transfersBonfireApi, lastUpdatedAtDate, null, value, this, 2, null);
        return paymentTransfers$default == coroutine_suspended ? coroutine_suspended : paymentTransfers$default;
    }
}
