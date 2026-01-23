package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardsOnboardingIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$onCreate$2$1", m3645f = "RewardsOnboardingIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RewardsOnboardingIntroDuxo3 extends ContinuationImpl7 implements Function2<RewardsOnboardingIntroDataState, Continuation<? super RewardsOnboardingIntroDataState>, Object> {
    final /* synthetic */ Optional<BigDecimal> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RewardsOnboardingIntroDuxo3(Optional<? extends BigDecimal> optional, Continuation<? super RewardsOnboardingIntroDuxo3> continuation) {
        super(2, continuation);
        this.$it = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsOnboardingIntroDuxo3 rewardsOnboardingIntroDuxo3 = new RewardsOnboardingIntroDuxo3(this.$it, continuation);
        rewardsOnboardingIntroDuxo3.L$0 = obj;
        return rewardsOnboardingIntroDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RewardsOnboardingIntroDataState rewardsOnboardingIntroDataState, Continuation<? super RewardsOnboardingIntroDataState> continuation) {
        return ((RewardsOnboardingIntroDuxo3) create(rewardsOnboardingIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RewardsOnboardingIntroDataState.copy$default((RewardsOnboardingIntroDataState) this.L$0, null, null, null, this.$it.getOrNull(), 7, null);
    }
}
