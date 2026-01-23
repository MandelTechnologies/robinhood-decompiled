package com.robinhood.android.transfers.p271ui.max.i18n.details;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UkBankTransferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$2$1", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkBankTransferDetailsDuxo2 extends ContinuationImpl7 implements Function2<UkBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState>, Object> {
    final /* synthetic */ boolean $isInCancelableUkTransferExperiment;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UkBankTransferDetailsDuxo2(boolean z, Continuation<? super UkBankTransferDetailsDuxo2> continuation) {
        super(2, continuation);
        this.$isInCancelableUkTransferExperiment = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UkBankTransferDetailsDuxo2 ukBankTransferDetailsDuxo2 = new UkBankTransferDetailsDuxo2(this.$isInCancelableUkTransferExperiment, continuation);
        ukBankTransferDetailsDuxo2.L$0 = obj;
        return ukBankTransferDetailsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UkBankTransferDetailsDataState ukBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState> continuation) {
        return ((UkBankTransferDetailsDuxo2) create(ukBankTransferDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UkBankTransferDetailsDataState.copy$default((UkBankTransferDetailsDataState) this.L$0, null, null, this.$isInCancelableUkTransferExperiment, false, 11, null);
    }
}
