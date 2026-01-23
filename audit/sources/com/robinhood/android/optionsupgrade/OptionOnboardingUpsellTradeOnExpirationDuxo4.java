package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$turnOnTradeOnExpiration$3$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$turnOnTradeOnExpiration$3$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingUpsellTradeOnExpirationDuxo4 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    OptionOnboardingUpsellTradeOnExpirationDuxo4(Continuation<? super OptionOnboardingUpsellTradeOnExpirationDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingUpsellTradeOnExpirationDuxo4 optionOnboardingUpsellTradeOnExpirationDuxo4 = new OptionOnboardingUpsellTradeOnExpirationDuxo4(continuation);
        optionOnboardingUpsellTradeOnExpirationDuxo4.L$0 = obj;
        return optionOnboardingUpsellTradeOnExpirationDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState> continuation) {
        return ((OptionOnboardingUpsellTradeOnExpirationDuxo4) create(optionOnboardingUpsellTradeOnExpirationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOnboardingUpsellTradeOnExpirationViewState.copy$default((OptionOnboardingUpsellTradeOnExpirationViewState) this.L$0, false, false, false, false, null, 30, null);
    }
}
