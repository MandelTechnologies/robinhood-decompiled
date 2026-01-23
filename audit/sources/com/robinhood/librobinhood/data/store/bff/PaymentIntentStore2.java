package com.robinhood.librobinhood.data.store.bff;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetPaymentIntentsRequestDto;
import bff_money_movement.service.p019v1.GetPaymentIntentsResponseDto;
import bff_money_movement.service.p019v1.PaymentIntentDto;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.experiment.SingaporeTransfersExperiment;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PaymentIntentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lbff_money_movement/service/v1/PaymentIntentDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bff.PaymentIntentStore$getPaymentIntents$1", m3645f = "PaymentIntentStore.kt", m3646l = {200, 50}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bff.PaymentIntentStore$getPaymentIntents$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PaymentIntentStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends PaymentIntentDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentIntentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentIntentStore2(PaymentIntentStore paymentIntentStore, Continuation<? super PaymentIntentStore2> continuation) {
        super(2, continuation);
        this.this$0 = paymentIntentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentIntentStore2 paymentIntentStore2 = new PaymentIntentStore2(this.this$0, continuation);
        paymentIntentStore2.L$0 = obj;
        return paymentIntentStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends PaymentIntentDto>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<PaymentIntentDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<PaymentIntentDto>> continuation) {
        return ((PaymentIntentStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r12 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaginationCursor paginationCursor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{SingaporeTransfersExperiment.INSTANCE}, false, null, 6, null);
            this.L$0 = paginationCursor;
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableStreamState$default, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentIntentDtos.toPaginatedResult((GetPaymentIntentsResponseDto) obj);
        }
        paginationCursor = (PaginationCursor) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            BffMoneyMovementService bffMoneyMovementService = this.this$0.api;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            if (value == null) {
                value = "";
            }
            GetPaymentIntentsRequestDto getPaymentIntentsRequestDto = new GetPaymentIntentsRequestDto(value, 0, 2, null);
            this.L$0 = null;
            this.label = 2;
            obj = bffMoneyMovementService.GetPaymentIntents(getPaymentIntentsRequestDto, this);
        } else {
            return new PaginatedResult(CollectionsKt.emptyList(), null, null, 6, null);
        }
    }
}
