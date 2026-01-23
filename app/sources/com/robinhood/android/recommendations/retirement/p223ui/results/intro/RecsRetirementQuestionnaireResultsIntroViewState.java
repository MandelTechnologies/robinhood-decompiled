package com.robinhood.android.recommendations.retirement.p223ui.results.intro;

import com.airbnb.lottie.compose.LottieClipSpec;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementLoadingConstants;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementQuestionnaireResultsIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState;", "", "results", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "showErrorAlert", "", "initialAnimationPlayed", "animationsEnabled", "lottiePhase", "Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState$LottiePhase;", "<init>", "(Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;ZZZLcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState$LottiePhase;)V", "getResults", "()Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "getShowErrorAlert", "()Z", "getInitialAnimationPlayed", "getAnimationsEnabled", "getLottiePhase", "()Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState$LottiePhase;", "isBackButtonVisible", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "LottiePhase", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecsRetirementQuestionnaireResultsIntroViewState {
    public static final int $stable = 8;
    private final boolean animationsEnabled;
    private final boolean initialAnimationPlayed;
    private final LottiePhase lottiePhase;
    private final UiQuestionnaireResults results;
    private final boolean showErrorAlert;

    /* compiled from: RecsRetirementQuestionnaireResultsIntroViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LottiePhase.values().length];
            try {
                iArr[LottiePhase.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LottiePhase.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LottiePhase.LOOPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecsRetirementQuestionnaireResultsIntroViewState() {
        this(null, false, false, false, null, 31, null);
    }

    public static /* synthetic */ RecsRetirementQuestionnaireResultsIntroViewState copy$default(RecsRetirementQuestionnaireResultsIntroViewState recsRetirementQuestionnaireResultsIntroViewState, UiQuestionnaireResults uiQuestionnaireResults, boolean z, boolean z2, boolean z3, LottiePhase lottiePhase, int i, Object obj) {
        if ((i & 1) != 0) {
            uiQuestionnaireResults = recsRetirementQuestionnaireResultsIntroViewState.results;
        }
        if ((i & 2) != 0) {
            z = recsRetirementQuestionnaireResultsIntroViewState.showErrorAlert;
        }
        if ((i & 4) != 0) {
            z2 = recsRetirementQuestionnaireResultsIntroViewState.initialAnimationPlayed;
        }
        if ((i & 8) != 0) {
            z3 = recsRetirementQuestionnaireResultsIntroViewState.animationsEnabled;
        }
        if ((i & 16) != 0) {
            lottiePhase = recsRetirementQuestionnaireResultsIntroViewState.lottiePhase;
        }
        LottiePhase lottiePhase2 = lottiePhase;
        boolean z4 = z2;
        return recsRetirementQuestionnaireResultsIntroViewState.copy(uiQuestionnaireResults, z, z4, z3, lottiePhase2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiQuestionnaireResults getResults() {
        return this.results;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowErrorAlert() {
        return this.showErrorAlert;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInitialAnimationPlayed() {
        return this.initialAnimationPlayed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAnimationsEnabled() {
        return this.animationsEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final LottiePhase getLottiePhase() {
        return this.lottiePhase;
    }

    public final RecsRetirementQuestionnaireResultsIntroViewState copy(UiQuestionnaireResults results, boolean showErrorAlert, boolean initialAnimationPlayed, boolean animationsEnabled, LottiePhase lottiePhase) {
        Intrinsics.checkNotNullParameter(lottiePhase, "lottiePhase");
        return new RecsRetirementQuestionnaireResultsIntroViewState(results, showErrorAlert, initialAnimationPlayed, animationsEnabled, lottiePhase);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecsRetirementQuestionnaireResultsIntroViewState)) {
            return false;
        }
        RecsRetirementQuestionnaireResultsIntroViewState recsRetirementQuestionnaireResultsIntroViewState = (RecsRetirementQuestionnaireResultsIntroViewState) other;
        return Intrinsics.areEqual(this.results, recsRetirementQuestionnaireResultsIntroViewState.results) && this.showErrorAlert == recsRetirementQuestionnaireResultsIntroViewState.showErrorAlert && this.initialAnimationPlayed == recsRetirementQuestionnaireResultsIntroViewState.initialAnimationPlayed && this.animationsEnabled == recsRetirementQuestionnaireResultsIntroViewState.animationsEnabled && this.lottiePhase == recsRetirementQuestionnaireResultsIntroViewState.lottiePhase;
    }

    public int hashCode() {
        UiQuestionnaireResults uiQuestionnaireResults = this.results;
        return ((((((((uiQuestionnaireResults == null ? 0 : uiQuestionnaireResults.hashCode()) * 31) + Boolean.hashCode(this.showErrorAlert)) * 31) + Boolean.hashCode(this.initialAnimationPlayed)) * 31) + Boolean.hashCode(this.animationsEnabled)) * 31) + this.lottiePhase.hashCode();
    }

    public String toString() {
        return "RecsRetirementQuestionnaireResultsIntroViewState(results=" + this.results + ", showErrorAlert=" + this.showErrorAlert + ", initialAnimationPlayed=" + this.initialAnimationPlayed + ", animationsEnabled=" + this.animationsEnabled + ", lottiePhase=" + this.lottiePhase + ")";
    }

    public RecsRetirementQuestionnaireResultsIntroViewState(UiQuestionnaireResults uiQuestionnaireResults, boolean z, boolean z2, boolean z3, LottiePhase lottiePhase) {
        Intrinsics.checkNotNullParameter(lottiePhase, "lottiePhase");
        this.results = uiQuestionnaireResults;
        this.showErrorAlert = z;
        this.initialAnimationPlayed = z2;
        this.animationsEnabled = z3;
        this.lottiePhase = lottiePhase;
    }

    public final UiQuestionnaireResults getResults() {
        return this.results;
    }

    public final boolean getShowErrorAlert() {
        return this.showErrorAlert;
    }

    public final boolean getInitialAnimationPlayed() {
        return this.initialAnimationPlayed;
    }

    public final boolean getAnimationsEnabled() {
        return this.animationsEnabled;
    }

    public /* synthetic */ RecsRetirementQuestionnaireResultsIntroViewState(UiQuestionnaireResults uiQuestionnaireResults, boolean z, boolean z2, boolean z3, LottiePhase lottiePhase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiQuestionnaireResults, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? LottiePhase.LOADING : lottiePhase);
    }

    public final LottiePhase getLottiePhase() {
        return this.lottiePhase;
    }

    public final boolean isBackButtonVisible() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.lottiePhase.ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecsRetirementQuestionnaireResultsIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroViewState$LottiePhase;", "", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "endProgress", "", "<init>", "(Ljava/lang/String;ILcom/airbnb/lottie/compose/LottieClipSpec;F)V", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "getEndProgress", "()F", "LOADING", "TRANSITION", "LOOPING", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LottiePhase {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LottiePhase[] $VALUES;
        private final LottieClipSpec clipSpec;
        private final float endProgress;
        public static final LottiePhase LOADING = new LottiePhase("LOADING", 0, new LottieClipSpec.Frame(0, 123, false, 4, null), 0.13681869f);
        public static final LottiePhase TRANSITION = new LottiePhase("TRANSITION", 1, new LottieClipSpec.Frame(123, 316, false, 4, null), 0.35150167f);
        public static final LottiePhase LOOPING = new LottiePhase("LOOPING", 2, new LottieClipSpec.Frame(316, Integer.valueOf(RecsRetirementLoadingConstants.LoopingPhaseMaxFrame), false, 4, null), 1.0f);

        private static final /* synthetic */ LottiePhase[] $values() {
            return new LottiePhase[]{LOADING, TRANSITION, LOOPING};
        }

        public static EnumEntries<LottiePhase> getEntries() {
            return $ENTRIES;
        }

        private LottiePhase(String str, int i, LottieClipSpec lottieClipSpec, float f) {
            this.clipSpec = lottieClipSpec;
            this.endProgress = f;
        }

        public final LottieClipSpec getClipSpec() {
            return this.clipSpec;
        }

        public final float getEndProgress() {
            return this.endProgress;
        }

        static {
            LottiePhase[] lottiePhaseArr$values = $values();
            $VALUES = lottiePhaseArr$values;
            $ENTRIES = EnumEntries2.enumEntries(lottiePhaseArr$values);
        }

        public static LottiePhase valueOf(String str) {
            return (LottiePhase) Enum.valueOf(LottiePhase.class, str);
        }

        public static LottiePhase[] values() {
            return (LottiePhase[]) $VALUES.clone();
        }
    }
}
