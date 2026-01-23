package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpDuxoV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: RoundupOnboardingSignUpComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$1$4$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RoundupOnboardingSignUpComposable4 implements Function0<Unit> {
    final /* synthetic */ RewardsOnboardingSignUpFragmentV2.Args $args;
    final /* synthetic */ RewardsOnboardingSignUpDuxoV2 $duxo;

    /* compiled from: RoundupOnboardingSignUpComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$1$4$2$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyIntentKey.RewardsOnboarding.Action.values().length];
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CREATE_ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.RESUME_ENROLLMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    RoundupOnboardingSignUpComposable4(RewardsOnboardingSignUpFragmentV2.Args args, RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2) {
        this.$args = args;
        this.$duxo = rewardsOnboardingSignUpDuxoV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.$args.getAction().ordinal()];
        if (i == 1) {
            this.$duxo.signUp();
        } else if (i == 2) {
            this.$duxo.resumeRoundup();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.$duxo.changeInvestment();
        }
    }
}
