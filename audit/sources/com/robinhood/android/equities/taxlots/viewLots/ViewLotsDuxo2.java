package com.robinhood.android.equities.taxlots.viewLots;

import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ViewLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$requestNextPage$1$1", m3645f = "ViewLotsDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$requestNextPage$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ViewLotsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewLotsDataState $it;
    int label;
    final /* synthetic */ ViewLotsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewLotsDuxo2(ViewLotsDuxo viewLotsDuxo, ViewLotsDataState viewLotsDataState, Continuation<? super ViewLotsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = viewLotsDuxo;
        this.$it = viewLotsDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ViewLotsDuxo2(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ViewLotsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
            String accountNumber = this.$it.getAccountNumber();
            UUID orderId = this.$it.getOrderId();
            UUID instrumentId = this.$it.getInstrumentId();
            this.label = 1;
            if (taxLotsCachedService.requestNextPage(accountNumber, orderId, instrumentId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C149881(null));
        this.this$0.requestNextPageJob = null;
        return Unit.INSTANCE;
    }

    /* compiled from: ViewLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$requestNextPage$1$1$1", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$requestNextPage$1$1$1 */
    static final class C149881 extends ContinuationImpl7 implements Function2<ViewLotsDataState, Continuation<? super ViewLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C149881(Continuation<? super C149881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149881 c149881 = new C149881(continuation);
            c149881.L$0 = obj;
            return c149881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ViewLotsDataState viewLotsDataState, Continuation<? super ViewLotsDataState> continuation) {
            return ((C149881) create(viewLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ViewLotsDataState viewLotsDataState = (ViewLotsDataState) this.L$0;
            return ViewLotsDataState.copy$default(viewLotsDataState, null, null, null, null, viewLotsDataState.getNextPageRequestSize() + 50, null, null, null, 239, null);
        }
    }
}
