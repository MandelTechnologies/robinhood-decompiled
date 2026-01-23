package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DebitCardVerificationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$onStart$3$1", m3645f = "DebitCardVerificationLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DebitCardVerificationLoadingDuxo2 extends ContinuationImpl7 implements Function2<DebitCardVerificationLoadingViewState, Continuation<? super DebitCardVerificationLoadingViewState>, Object> {
    final /* synthetic */ ApiPaymentInstrument $debitCardId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardVerificationLoadingDuxo2(ApiPaymentInstrument apiPaymentInstrument, Continuation<? super DebitCardVerificationLoadingDuxo2> continuation) {
        super(2, continuation);
        this.$debitCardId = apiPaymentInstrument;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebitCardVerificationLoadingDuxo2 debitCardVerificationLoadingDuxo2 = new DebitCardVerificationLoadingDuxo2(this.$debitCardId, continuation);
        debitCardVerificationLoadingDuxo2.L$0 = obj;
        return debitCardVerificationLoadingDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DebitCardVerificationLoadingViewState debitCardVerificationLoadingViewState, Continuation<? super DebitCardVerificationLoadingViewState> continuation) {
        return ((DebitCardVerificationLoadingDuxo2) create(debitCardVerificationLoadingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DebitCardVerificationLoadingViewState.copy$default((DebitCardVerificationLoadingViewState) this.L$0, this.$debitCardId.getInstrument_id(), null, false, 2, null);
    }
}
