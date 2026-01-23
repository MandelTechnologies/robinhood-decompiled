package com.robinhood.android.slip.onboarding;

import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$loadSlipOnboarding$2$1", m3645f = "SlipOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$loadSlipOnboarding$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipOnboardingDuxo3 extends ContinuationImpl7 implements Function2<SlipOnboardingViewState, Continuation<? super SlipOnboardingViewState>, Object> {
    final /* synthetic */ SLIPContext $loggingContext;
    final /* synthetic */ boolean $showRecommendedFlow;
    final /* synthetic */ SlipOnboarding $slipOnboarding;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipOnboardingDuxo3(boolean z, SlipOnboarding slipOnboarding, SLIPContext sLIPContext, Continuation<? super SlipOnboardingDuxo3> continuation) {
        super(2, continuation);
        this.$showRecommendedFlow = z;
        this.$slipOnboarding = slipOnboarding;
        this.$loggingContext = sLIPContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipOnboardingDuxo3 slipOnboardingDuxo3 = new SlipOnboardingDuxo3(this.$showRecommendedFlow, this.$slipOnboarding, this.$loggingContext, continuation);
        slipOnboardingDuxo3.L$0 = obj;
        return slipOnboardingDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipOnboardingViewState slipOnboardingViewState, Continuation<? super SlipOnboardingViewState> continuation) {
        return ((SlipOnboardingDuxo3) create(slipOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((SlipOnboardingViewState) this.L$0).copy(this.$showRecommendedFlow, this.$slipOnboarding, this.$loggingContext);
    }
}
