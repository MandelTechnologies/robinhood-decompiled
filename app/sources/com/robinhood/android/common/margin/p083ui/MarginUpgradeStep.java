package com.robinhood.android.common.margin.p083ui;

import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarginUpgradeStep.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "", "progressBarValue", "", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "ukOnboardingProgressBarData", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep$ProgressBarData;", "showProgressBar", "", "<init>", "(Ljava/lang/String;IFLcom/robinhood/rosetta/eventlogging/Screen$Name;Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep$ProgressBarData;Z)V", "getProgressBarValue", "()F", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getUkOnboardingProgressBarData", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep$ProgressBarData;", "getShowProgressBar", "()Z", "SPLASH", "EDUCATION", "INVESTMENT_PROFILE", "ELIGIBILITY", "MARGIN_LIMIT", "TIERED_RATES", "TIERED_RATES_QUICK_ONBOARDING", "AGREEMENT", "AGREEMENT_QUICK_ONBOARDING", "DEFAULT_CONFIRMATION", "GOLD_ONLY_CONFIRMATION", "MARGIN_UPGRADE_ERROR", "GOLD_UPSELL", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ProgressBarData", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MarginUpgradeStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarginUpgradeStep[] $VALUES;
    public static final MarginUpgradeStep AGREEMENT;
    public static final MarginUpgradeStep AGREEMENT_QUICK_ONBOARDING;
    public static final MarginUpgradeStep DEFAULT_CONFIRMATION;
    public static final MarginUpgradeStep GOLD_ONLY_CONFIRMATION;
    public static final MarginUpgradeStep GOLD_UPSELL;
    public static final MarginUpgradeStep INVESTMENT_PROFILE;
    public static final MarginUpgradeStep MARGIN_UPGRADE_ERROR;
    public static final MarginUpgradeStep TIERED_RATES;
    public static final MarginUpgradeStep TIERED_RATES_QUICK_ONBOARDING;
    private final float progressBarValue;
    private final Screen screen;
    private final Screen.Name screenName;
    private final boolean showProgressBar;
    private final ProgressBarData ukOnboardingProgressBarData;
    public static final MarginUpgradeStep SPLASH = new MarginUpgradeStep("SPLASH", 0, 0.0f, Screen.Name.MARGIN_UPGRADE_SPLASH, null, false, 12, null);
    public static final MarginUpgradeStep EDUCATION = new MarginUpgradeStep("EDUCATION", 1, 2.0f, Screen.Name.MARGIN_UPGRADE_EDUCATION, null, false, 12, null);
    public static final MarginUpgradeStep ELIGIBILITY = new MarginUpgradeStep("ELIGIBILITY", 3, 4.0f, Screen.Name.MARGIN_UPGRADE_ELIGIBILITY, new ProgressBarData(4, 6, 0.5f), false, 8, null);
    public static final MarginUpgradeStep MARGIN_LIMIT = new MarginUpgradeStep("MARGIN_LIMIT", 4, 5.0f, Screen.Name.MARGIN_UPGRADE_MARGIN_LIMIT_SET, null, false, 12, null);

    private static final /* synthetic */ MarginUpgradeStep[] $values() {
        return new MarginUpgradeStep[]{SPLASH, EDUCATION, INVESTMENT_PROFILE, ELIGIBILITY, MARGIN_LIMIT, TIERED_RATES, TIERED_RATES_QUICK_ONBOARDING, AGREEMENT, AGREEMENT_QUICK_ONBOARDING, DEFAULT_CONFIRMATION, GOLD_ONLY_CONFIRMATION, MARGIN_UPGRADE_ERROR, GOLD_UPSELL};
    }

    public static EnumEntries<MarginUpgradeStep> getEntries() {
        return $ENTRIES;
    }

    private MarginUpgradeStep(String str, int i, float f, Screen.Name name, ProgressBarData progressBarData, boolean z) {
        this.progressBarValue = f;
        this.screenName = name;
        this.ukOnboardingProgressBarData = progressBarData;
        this.showProgressBar = z;
        this.screen = new Screen(name, null, null, null, 14, null);
    }

    /* synthetic */ MarginUpgradeStep(String str, int i, float f, Screen.Name name, ProgressBarData progressBarData, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, f, name, (i2 & 4) != 0 ? null : progressBarData, (i2 & 8) != 0 ? true : z);
    }

    public final float getProgressBarValue() {
        return this.progressBarValue;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public final ProgressBarData getUkOnboardingProgressBarData() {
        return this.ukOnboardingProgressBarData;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        INVESTMENT_PROFILE = new MarginUpgradeStep("INVESTMENT_PROFILE", 2, 3.0f, Screen.Name.MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE, new ProgressBarData(1, 6, 0.5f), z, i, defaultConstructorMarker);
        Screen.Name name = Screen.Name.MARGIN_UPGRADE_TIERED_RATES;
        TIERED_RATES = new MarginUpgradeStep("TIERED_RATES", 5, 6.0f, name, new ProgressBarData(4, 6, 1.0f), false, 8, null);
        TIERED_RATES_QUICK_ONBOARDING = new MarginUpgradeStep("TIERED_RATES_QUICK_ONBOARDING", 6, 6.0f, name, null, false, 4, null);
        Screen.Name name2 = Screen.Name.MARGIN_UPGRADE_AGREEMENT;
        AGREEMENT = new MarginUpgradeStep("AGREEMENT", 7, 8.0f, name2, new ProgressBarData(5, 6, 0.5f), z, i, defaultConstructorMarker);
        AGREEMENT_QUICK_ONBOARDING = new MarginUpgradeStep("AGREEMENT_QUICK_ONBOARDING", 8, 8.0f, name2, null, false, 4, 0 == true ? 1 : 0);
        DEFAULT_CONFIRMATION = new MarginUpgradeStep("DEFAULT_CONFIRMATION", 9, 0.0f, Screen.Name.MARGIN_UPGRADE_CONFIRMATION, null, false, 12, null);
        GOLD_ONLY_CONFIRMATION = new MarginUpgradeStep("GOLD_ONLY_CONFIRMATION", 10, 0.0f, Screen.Name.MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION, null, false, 12, null);
        MARGIN_UPGRADE_ERROR = new MarginUpgradeStep("MARGIN_UPGRADE_ERROR", 11, 0.0f, Screen.Name.MARGIN_UPGRADE_ERROR, null, false, 12, defaultConstructorMarker);
        GOLD_UPSELL = new MarginUpgradeStep("GOLD_UPSELL", 12, 0.0f, Screen.Name.MARGIN_UPGRADE_GOLD_UPSELL, null, false, 12, null);
        MarginUpgradeStep[] marginUpgradeStepArr$values = $values();
        $VALUES = marginUpgradeStepArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marginUpgradeStepArr$values);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    /* compiled from: MarginUpgradeStep.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep$ProgressBarData;", "", "segmentIdx", "", "segments", "progress", "", "<init>", "(IIF)V", "getSegmentIdx", "()I", "getSegments", "getProgress", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ProgressBarData {
        public static final int $stable = 0;
        private final float progress;
        private final int segmentIdx;
        private final int segments;

        public static /* synthetic */ ProgressBarData copy$default(ProgressBarData progressBarData, int i, int i2, float f, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = progressBarData.segmentIdx;
            }
            if ((i3 & 2) != 0) {
                i2 = progressBarData.segments;
            }
            if ((i3 & 4) != 0) {
                f = progressBarData.progress;
            }
            return progressBarData.copy(i, i2, f);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSegmentIdx() {
            return this.segmentIdx;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSegments() {
            return this.segments;
        }

        /* renamed from: component3, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        public final ProgressBarData copy(int segmentIdx, int segments, float progress) {
            return new ProgressBarData(segmentIdx, segments, progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarData)) {
                return false;
            }
            ProgressBarData progressBarData = (ProgressBarData) other;
            return this.segmentIdx == progressBarData.segmentIdx && this.segments == progressBarData.segments && Float.compare(this.progress, progressBarData.progress) == 0;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.segmentIdx) * 31) + Integer.hashCode(this.segments)) * 31) + Float.hashCode(this.progress);
        }

        public String toString() {
            return "ProgressBarData(segmentIdx=" + this.segmentIdx + ", segments=" + this.segments + ", progress=" + this.progress + ")";
        }

        public ProgressBarData(int i, int i2, float f) {
            this.segmentIdx = i;
            this.segments = i2;
            this.progress = f;
        }

        public final int getSegmentIdx() {
            return this.segmentIdx;
        }

        public final int getSegments() {
            return this.segments;
        }

        public final float getProgress() {
            return this.progress;
        }
    }

    public static MarginUpgradeStep valueOf(String str) {
        return (MarginUpgradeStep) Enum.valueOf(MarginUpgradeStep.class, str);
    }

    public static MarginUpgradeStep[] values() {
        return (MarginUpgradeStep[]) $VALUES.clone();
    }
}
