package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
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
@DebugMetadata(m3644c = "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$onCreate$1$1", m3645f = "RewardsOnboardingIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RewardsOnboardingIntroDuxo2 extends ContinuationImpl7 implements Function2<RewardsOnboardingIntroDataState, Continuation<? super RewardsOnboardingIntroDataState>, Object> {
    final /* synthetic */ SortingHatUserState $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsOnboardingIntroDuxo2(SortingHatUserState sortingHatUserState, Continuation<? super RewardsOnboardingIntroDuxo2> continuation) {
        super(2, continuation);
        this.$it = sortingHatUserState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsOnboardingIntroDuxo2 rewardsOnboardingIntroDuxo2 = new RewardsOnboardingIntroDuxo2(this.$it, continuation);
        rewardsOnboardingIntroDuxo2.L$0 = obj;
        return rewardsOnboardingIntroDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RewardsOnboardingIntroDataState rewardsOnboardingIntroDataState, Continuation<? super RewardsOnboardingIntroDataState> continuation) {
        return ((RewardsOnboardingIntroDuxo2) create(rewardsOnboardingIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RewardsOnboardingIntroDataState.copy$default((RewardsOnboardingIntroDataState) this.L$0, null, null, this.$it, null, 11, null);
    }
}
