package com.robinhood.android.recommendations.retirement.p223ui.results.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.data.store.recommendations.retirement.RecsRetirementQuestionnaireResultsStore;
import com.robinhood.android.recommendations.retirement.p223ui.results.intro.RecsRetirementQuestionnaireResultsIntroFragment;
import com.robinhood.android.recommendations.retirement.p223ui.results.intro.RecsRetirementQuestionnaireResultsIntroViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecsRetirementQuestionnaireResultsIntroDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "questionnaireResultsStore", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementQuestionnaireResultsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementQuestionnaireResultsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "updateLottieProgress", "lottieAbsoluteProgress", "", "setAreAnimationsEnabled", "enabled", "", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsIntroDuxo extends OldBaseDuxo<RecsRetirementQuestionnaireResultsIntroViewState> implements HasSavedState {
    private final RecsRetirementQuestionnaireResultsStore questionnaireResultsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecsRetirementQuestionnaireResultsIntroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.values().length];
            try {
                iArr[RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecsRetirementQuestionnaireResultsIntroDuxo(RecsRetirementQuestionnaireResultsStore questionnaireResultsStore, SavedStateHandle savedStateHandle) {
        super(new RecsRetirementQuestionnaireResultsIntroViewState(null, false, false, false, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(questionnaireResultsStore, "questionnaireResultsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.questionnaireResultsStore = questionnaireResultsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.questionnaireResultsStore.getQuestionnaireResults(((RecsRetirementQuestionnaireResultsIntroFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.onStart$lambda$1(this.f$0, (UiQuestionnaireResults) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecsRetirementQuestionnaireResultsIntroDuxo recsRetirementQuestionnaireResultsIntroDuxo, final UiQuestionnaireResults results) {
        Intrinsics.checkNotNullParameter(results, "results");
        recsRetirementQuestionnaireResultsIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.onStart$lambda$1$lambda$0(results, (RecsRetirementQuestionnaireResultsIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementQuestionnaireResultsIntroViewState onStart$lambda$1$lambda$0(UiQuestionnaireResults uiQuestionnaireResults, RecsRetirementQuestionnaireResultsIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getAnimationsEnabled()) {
            return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, uiQuestionnaireResults, false, false, false, null, 30, null);
        }
        return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, uiQuestionnaireResults, false, false, false, RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.LOOPING, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecsRetirementQuestionnaireResultsIntroDuxo recsRetirementQuestionnaireResultsIntroDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        recsRetirementQuestionnaireResultsIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.onStart$lambda$3$lambda$2((RecsRetirementQuestionnaireResultsIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementQuestionnaireResultsIntroViewState onStart$lambda$3$lambda$2(RecsRetirementQuestionnaireResultsIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, null, true, false, false, null, 29, null);
    }

    public final void updateLottieProgress(final float lottieAbsoluteProgress) {
        if (0.0f > lottieAbsoluteProgress || lottieAbsoluteProgress > 1.0f) {
            throw new IllegalStateException("Lottie progress must be within range [0f:1f]");
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.updateLottieProgress$lambda$5(lottieAbsoluteProgress, (RecsRetirementQuestionnaireResultsIntroViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementQuestionnaireResultsIntroViewState updateLottieProgress$lambda$5(float f, RecsRetirementQuestionnaireResultsIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (f >= applyMutation.getLottiePhase().getEndProgress() - 0.01f) {
            RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase lottiePhase = applyMutation.getLottiePhase();
            RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase lottiePhase2 = RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.LOOPING;
            if (lottiePhase != lottiePhase2) {
                if (WhenMappings.$EnumSwitchMapping$0[applyMutation.getLottiePhase().ordinal()] == 1) {
                    lottiePhase2 = applyMutation.getResults() != null ? RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.TRANSITION : RecsRetirementQuestionnaireResultsIntroViewState.LottiePhase.LOADING;
                }
                return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, null, false, false, false, lottiePhase2, 15, null);
            }
        }
        return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, null, false, false, false, null, 31, null);
    }

    public final void setAreAnimationsEnabled(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementQuestionnaireResultsIntroDuxo.setAreAnimationsEnabled$lambda$6(enabled, (RecsRetirementQuestionnaireResultsIntroViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementQuestionnaireResultsIntroViewState setAreAnimationsEnabled$lambda$6(boolean z, RecsRetirementQuestionnaireResultsIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementQuestionnaireResultsIntroViewState.copy$default(applyMutation, null, false, false, z, null, 23, null);
    }

    /* compiled from: RecsRetirementQuestionnaireResultsIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecsRetirementQuestionnaireResultsIntroDuxo, RecsRetirementQuestionnaireResultsIntroFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementQuestionnaireResultsIntroFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecsRetirementQuestionnaireResultsIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementQuestionnaireResultsIntroFragment.Args getArgs(RecsRetirementQuestionnaireResultsIntroDuxo recsRetirementQuestionnaireResultsIntroDuxo) {
            return (RecsRetirementQuestionnaireResultsIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recsRetirementQuestionnaireResultsIntroDuxo);
        }
    }
}
