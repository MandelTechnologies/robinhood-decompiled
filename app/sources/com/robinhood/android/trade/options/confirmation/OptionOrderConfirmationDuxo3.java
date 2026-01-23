package com.robinhood.android.trade.options.confirmation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$3$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OptionOrderConfirmationDuxo3 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
    final /* synthetic */ Boolean $killswitchEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOrderConfirmationDuxo3(Boolean bool, Continuation<? super OptionOrderConfirmationDuxo3> continuation) {
        super(2, continuation);
        this.$killswitchEnabled = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOrderConfirmationDuxo3 optionOrderConfirmationDuxo3 = new OptionOrderConfirmationDuxo3(this.$killswitchEnabled, continuation);
        optionOrderConfirmationDuxo3.L$0 = obj;
        return optionOrderConfirmationDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
        return ((OptionOrderConfirmationDuxo3) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, !this.$killswitchEnabled.booleanValue(), false, null, null, null, false, false, 1015, null);
    }
}
