package com.robinhood.android.transfers.international.p266ui.amountinput;

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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1$4$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AmountInputDuxo4 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AmountInputDuxo4(Continuation<? super AmountInputDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmountInputDuxo4 amountInputDuxo4 = new AmountInputDuxo4(continuation);
        amountInputDuxo4.L$0 = obj;
        return amountInputDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
        return ((AmountInputDuxo4) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AmountInputDataState.copy$default((AmountInputDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, 511, null);
    }
}
