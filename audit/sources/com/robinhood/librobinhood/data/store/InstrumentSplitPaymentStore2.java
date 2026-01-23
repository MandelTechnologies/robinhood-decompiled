package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiInstrumentSplitPayment;
import com.robinhood.models.p320db.InstrumentSplitPayment;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
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

/* compiled from: InstrumentSplitPaymentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiInstrumentSplitPayment;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$getSplitPayments$1", m3645f = "InstrumentSplitPaymentStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$getSplitPayments$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentSplitPaymentStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiInstrumentSplitPayment>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentSplitPaymentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentSplitPaymentStore2(InstrumentSplitPaymentStore instrumentSplitPaymentStore, Continuation<? super InstrumentSplitPaymentStore2> continuation) {
        super(2, continuation);
        this.this$0 = instrumentSplitPaymentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentSplitPaymentStore2 instrumentSplitPaymentStore2 = new InstrumentSplitPaymentStore2(this.this$0, continuation);
        instrumentSplitPaymentStore2.L$0 = obj;
        return instrumentSplitPaymentStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiInstrumentSplitPayment>> continuation) {
        return invoke2((Tuples2<UUID, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiInstrumentSplitPayment>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiInstrumentSplitPayment>> continuation) {
        return ((InstrumentSplitPaymentStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        UUID uuid = (UUID) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        LocalDate lastUpdatedAtDate = this.this$0.getLastUpdatedAtManager().getLastUpdatedAtDate(InstrumentSplitPayment.class);
        Brokeback brokeback = this.this$0.brokeback;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        String stringOrEmpty = Uuids.toStringOrEmpty(uuid);
        this.label = 1;
        Object instrumentSplitPayments = brokeback.getInstrumentSplitPayments(lastUpdatedAtDate, value, stringOrEmpty, this);
        return instrumentSplitPayments == coroutine_suspended ? coroutine_suspended : instrumentSplitPayments;
    }
}
