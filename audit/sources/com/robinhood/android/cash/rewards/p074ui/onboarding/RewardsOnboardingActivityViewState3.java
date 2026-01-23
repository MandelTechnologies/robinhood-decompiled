package com.robinhood.android.cash.rewards.p074ui.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardsOnboardingActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "", "<init>", "(Ljava/lang/String;I)V", "VARIABLE_BONUS", "ASSET_SELECTION_EXP", "ASSET_SELECTION_TITLE", "ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE", "ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED", "ASSET_SELECTION_BROKE_SWEEP_ENROLLED", "SIGNUP_CHANGE_SELECTION_RHS", "SIGNUP_CHANGE_SELECTION_RHC", "SIGNUP_SWEEP_INELIGIBLE", "SIGNUP_BROKERAGE", "SIGNUP_REVIEW_ASSET_RHS", "SIGNUP_REVIEW_ASSET_RHC", "CONFIRMATION_BROKE", "CONFIRMATION_ASSET", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.OnboardingContentEnum, reason: use source file name */
/* loaded from: classes7.dex */
public final class RewardsOnboardingActivityViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsOnboardingActivityViewState3[] $VALUES;
    public static final RewardsOnboardingActivityViewState3 VARIABLE_BONUS = new RewardsOnboardingActivityViewState3("VARIABLE_BONUS", 0);
    public static final RewardsOnboardingActivityViewState3 ASSET_SELECTION_EXP = new RewardsOnboardingActivityViewState3("ASSET_SELECTION_EXP", 1);
    public static final RewardsOnboardingActivityViewState3 ASSET_SELECTION_TITLE = new RewardsOnboardingActivityViewState3("ASSET_SELECTION_TITLE", 2);
    public static final RewardsOnboardingActivityViewState3 ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE = new RewardsOnboardingActivityViewState3("ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE", 3);
    public static final RewardsOnboardingActivityViewState3 ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED = new RewardsOnboardingActivityViewState3("ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED", 4);
    public static final RewardsOnboardingActivityViewState3 ASSET_SELECTION_BROKE_SWEEP_ENROLLED = new RewardsOnboardingActivityViewState3("ASSET_SELECTION_BROKE_SWEEP_ENROLLED", 5);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_CHANGE_SELECTION_RHS = new RewardsOnboardingActivityViewState3("SIGNUP_CHANGE_SELECTION_RHS", 6);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_CHANGE_SELECTION_RHC = new RewardsOnboardingActivityViewState3("SIGNUP_CHANGE_SELECTION_RHC", 7);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_SWEEP_INELIGIBLE = new RewardsOnboardingActivityViewState3("SIGNUP_SWEEP_INELIGIBLE", 8);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_BROKERAGE = new RewardsOnboardingActivityViewState3("SIGNUP_BROKERAGE", 9);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_REVIEW_ASSET_RHS = new RewardsOnboardingActivityViewState3("SIGNUP_REVIEW_ASSET_RHS", 10);
    public static final RewardsOnboardingActivityViewState3 SIGNUP_REVIEW_ASSET_RHC = new RewardsOnboardingActivityViewState3("SIGNUP_REVIEW_ASSET_RHC", 11);
    public static final RewardsOnboardingActivityViewState3 CONFIRMATION_BROKE = new RewardsOnboardingActivityViewState3("CONFIRMATION_BROKE", 12);
    public static final RewardsOnboardingActivityViewState3 CONFIRMATION_ASSET = new RewardsOnboardingActivityViewState3("CONFIRMATION_ASSET", 13);

    private static final /* synthetic */ RewardsOnboardingActivityViewState3[] $values() {
        return new RewardsOnboardingActivityViewState3[]{VARIABLE_BONUS, ASSET_SELECTION_EXP, ASSET_SELECTION_TITLE, ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE, ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED, ASSET_SELECTION_BROKE_SWEEP_ENROLLED, SIGNUP_CHANGE_SELECTION_RHS, SIGNUP_CHANGE_SELECTION_RHC, SIGNUP_SWEEP_INELIGIBLE, SIGNUP_BROKERAGE, SIGNUP_REVIEW_ASSET_RHS, SIGNUP_REVIEW_ASSET_RHC, CONFIRMATION_BROKE, CONFIRMATION_ASSET};
    }

    public static EnumEntries<RewardsOnboardingActivityViewState3> getEntries() {
        return $ENTRIES;
    }

    private RewardsOnboardingActivityViewState3(String str, int i) {
    }

    static {
        RewardsOnboardingActivityViewState3[] rewardsOnboardingActivityViewState3Arr$values = $values();
        $VALUES = rewardsOnboardingActivityViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(rewardsOnboardingActivityViewState3Arr$values);
    }

    public static RewardsOnboardingActivityViewState3 valueOf(String str) {
        return (RewardsOnboardingActivityViewState3) Enum.valueOf(RewardsOnboardingActivityViewState3.class, str);
    }

    public static RewardsOnboardingActivityViewState3[] values() {
        return (RewardsOnboardingActivityViewState3[]) $VALUES.clone();
    }
}
