package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$fetchTransferSummary$1$2$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$fetchTransferSummary$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AmountInputDuxo5 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
    final /* synthetic */ ApiTransferSummaryResponse $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountInputDuxo5(ApiTransferSummaryResponse apiTransferSummaryResponse, Continuation<? super AmountInputDuxo5> continuation) {
        super(2, continuation);
        this.$it = apiTransferSummaryResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmountInputDuxo5 amountInputDuxo5 = new AmountInputDuxo5(this.$it, continuation);
        amountInputDuxo5.L$0 = obj;
        return amountInputDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
        return ((AmountInputDuxo5) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AmountInputDataState.copy$default((AmountInputDataState) this.L$0, null, null, null, null, null, null, null, this.$it, null, false, 895, null);
    }
}
