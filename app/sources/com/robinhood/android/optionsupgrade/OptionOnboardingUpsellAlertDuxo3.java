package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$4$1", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$4$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingUpsellAlertDuxo3 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    OptionOnboardingUpsellAlertDuxo3(Continuation<? super OptionOnboardingUpsellAlertDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingUpsellAlertDuxo3 optionOnboardingUpsellAlertDuxo3 = new OptionOnboardingUpsellAlertDuxo3(continuation);
        optionOnboardingUpsellAlertDuxo3.L$0 = obj;
        return optionOnboardingUpsellAlertDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState> continuation) {
        return ((OptionOnboardingUpsellAlertDuxo3) create(optionOnboardingUpsellAlertViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOnboardingUpsellAlertViewState.copy$default((OptionOnboardingUpsellAlertViewState) this.L$0, false, false, false, false, 14, null);
    }
}
