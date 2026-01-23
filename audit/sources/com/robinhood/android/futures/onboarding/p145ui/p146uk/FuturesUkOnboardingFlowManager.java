package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import com.robinhood.android.futures.onboarding.p145ui.QuestionnaireFlow;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityFragment;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesUkOnboardingFlowManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\"\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityFragment$Callbacks;", "callbacks", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager$Callbacks;", "<init>", "(Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager$Callbacks;)V", "onInvestorProfileReviewed", "", "onUkSuitabilityCompleted", "onUkKnowledgeQuizCompleted", "onProceedToNextStepUk", "passedCheckpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "alreadyEligibleForNextStep", "", "canSubmitNextStep", "Callbacks", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesUkOnboardingFlowManager implements FuturesUkCheckEligibilityFragment.Callbacks {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: FuturesUkOnboardingFlowManager.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager$Callbacks;", "", "popBackstack", "", "checkSuitability", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "showInvestorProfile", "showQuestionnaireFlow", "questionnaireFlow", "Lcom/robinhood/android/futures/onboarding/ui/QuestionnaireFlow;", "onUkSubflowCompleted", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void checkSuitability(SuitabilityCheckpointDto checkpoint);

        void onUkSubflowCompleted();

        void popBackstack();

        void showInvestorProfile();

        void showQuestionnaireFlow(QuestionnaireFlow questionnaireFlow);
    }

    /* compiled from: FuturesUkOnboardingFlowManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuitabilityCheckpointDto.values().length];
            try {
                iArr[SuitabilityCheckpointDto.INVESTOR_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuitabilityCheckpointDto.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuitabilityCheckpointDto.KNOWLEDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuitabilityCheckpointDto.SUITABILITY_CHECKPOINT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FuturesUkOnboardingFlowManager(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    public final void onInvestorProfileReviewed() {
        this.callbacks.checkSuitability(SuitabilityCheckpointDto.INVESTOR_PROFILE);
    }

    public final void onUkSuitabilityCompleted() {
        this.callbacks.checkSuitability(SuitabilityCheckpointDto.EXPERIENCE);
    }

    public final void onUkKnowledgeQuizCompleted() {
        this.callbacks.checkSuitability(SuitabilityCheckpointDto.KNOWLEDGE);
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityFragment.Callbacks
    public void onProceedToNextStepUk(SuitabilityCheckpointDto passedCheckpoint, boolean alreadyEligibleForNextStep, boolean canSubmitNextStep) {
        this.callbacks.popBackstack();
        int i = passedCheckpoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[passedCheckpoint.ordinal()];
        if (i == -1) {
            this.callbacks.showInvestorProfile();
            return;
        }
        if (i == 1) {
            if (alreadyEligibleForNextStep) {
                this.callbacks.checkSuitability(SuitabilityCheckpointDto.EXPERIENCE);
                return;
            } else {
                if (canSubmitNextStep) {
                    this.callbacks.showQuestionnaireFlow(QuestionnaireFlow.UK_FUTURES_SUITABILITY);
                    return;
                }
                throw new IllegalStateException("Should not reach onProceedToNextStepUk while not being eligible for next step");
            }
        }
        if (i != 2) {
            if (i == 3) {
                this.callbacks.onUkSubflowCompleted();
                return;
            } else {
                if (i == 4) {
                    throw new IllegalStateException("We should not receive UNSPECIFIED in futures onboarding.");
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        if (alreadyEligibleForNextStep) {
            this.callbacks.onUkSubflowCompleted();
        } else {
            if (canSubmitNextStep) {
                this.callbacks.showQuestionnaireFlow(QuestionnaireFlow.UK_KNOWLEDGE_QUIZ);
                return;
            }
            throw new IllegalStateException("Should not reach onProceedToNextStepUk while not being eligible for next step");
        }
    }
}
