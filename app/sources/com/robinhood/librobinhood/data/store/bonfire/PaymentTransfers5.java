package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import com.robinhood.models.p320db.NonOriginatedAchTransfer2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.transfers.models.p406db.AchTransfer2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentTransfers.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001aE\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\b\b\u0000\u0010\b*\u00020\t*\u00020\u00022\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00060\u000b¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u001a;\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u000e\"\b\b\u0000\u0010\b*\u00020\t*\u00020\u00022\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000e0\u000b¢\u0006\u0002\b\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m3636d2 = {"toNonOriginatedAchTransfer", "Lcom/robinhood/models/db/NonOriginatedAchTransfer;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "toOriginatedAchTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "fetchAdditionalDataIfOwner", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "T", "", "paymentInstrumentQuery", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "fetchIfOwner", "Lkotlinx/coroutines/flow/Flow;", "lib-store-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransfersKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class PaymentTransfers5 {
    public static final NonOriginatedAchTransfer toNonOriginatedAchTransfer(PaymentTransfer paymentTransfer) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        ApiPaymentTransferDetails details = paymentTransfer.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer");
        return NonOriginatedAchTransfer2.toDbModel((ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer) details);
    }

    public static final AchTransfer toOriginatedAchTransfer(PaymentTransfer paymentTransfer) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        ApiPaymentTransferDetails details = paymentTransfer.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiAchTransfer");
        return AchTransfer2.toDbModel((ApiPaymentTransferDetails.ApiAchTransfer) details);
    }

    public static final <T> Observable<Optional<T>> fetchAdditionalDataIfOwner(PaymentTransfer paymentTransfer, Function1<? super PaymentTransfer, ? extends Observable<T>> paymentInstrumentQuery) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        Intrinsics.checkNotNullParameter(paymentInstrumentQuery, "paymentInstrumentQuery");
        if (paymentTransfer.getIsOwner()) {
            Observable<Optional<T>> observable = (Observable<Optional<T>>) paymentInstrumentQuery.invoke(paymentTransfer).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransfersKt.fetchAdditionalDataIfOwner.1
                @Override // io.reactivex.functions.Function
                public final Optional<T> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C345301<T, R>) obj);
                }
            });
            Intrinsics.checkNotNull(observable);
            return observable;
        }
        Observable<Optional<T>> observableJust = Observable.just(Optional2.INSTANCE);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PaymentTransfers.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransfersKt$fetchIfOwner$1", m3645f = "PaymentTransfers.kt", m3646l = {49, 51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransfersKt$fetchIfOwner$1 */
    static final class C345311<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<PaymentTransfer, Flow<T>> $paymentInstrumentQuery;
        final /* synthetic */ PaymentTransfer $this_fetchIfOwner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C345311(PaymentTransfer paymentTransfer, Function1<? super PaymentTransfer, ? extends Flow<? extends T>> function1, Continuation<? super C345311> continuation) {
            super(2, continuation);
            this.$this_fetchIfOwner = paymentTransfer;
            this.$paymentInstrumentQuery = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C345311 c345311 = new C345311(this.$this_fetchIfOwner, this.$paymentInstrumentQuery, continuation);
            c345311.L$0 = obj;
            return c345311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C345311) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5.emit(null, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$this_fetchIfOwner.getIsOwner()) {
                    Flow<T> flowInvoke = this.$paymentInstrumentQuery.invoke(this.$this_fetchIfOwner);
                    this.label = 1;
                } else {
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Flow<T> fetchIfOwner(PaymentTransfer paymentTransfer, Function1<? super PaymentTransfer, ? extends Flow<? extends T>> paymentInstrumentQuery) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        Intrinsics.checkNotNullParameter(paymentInstrumentQuery, "paymentInstrumentQuery");
        return FlowKt.flow(new C345311(paymentTransfer, paymentInstrumentQuery, null));
    }
}
