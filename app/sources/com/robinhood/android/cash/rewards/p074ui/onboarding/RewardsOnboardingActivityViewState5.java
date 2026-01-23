package com.robinhood.android.cash.rewards.p074ui.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardsOnboardingActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/SweepStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ELIGIBLE", "ELIGIBLE_NOT_ENROLLED", "ENROLLED", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.SweepStatus, reason: use source file name */
/* loaded from: classes7.dex */
public final class RewardsOnboardingActivityViewState5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsOnboardingActivityViewState5[] $VALUES;
    public static final RewardsOnboardingActivityViewState5 NOT_ELIGIBLE = new RewardsOnboardingActivityViewState5("NOT_ELIGIBLE", 0);
    public static final RewardsOnboardingActivityViewState5 ELIGIBLE_NOT_ENROLLED = new RewardsOnboardingActivityViewState5("ELIGIBLE_NOT_ENROLLED", 1);
    public static final RewardsOnboardingActivityViewState5 ENROLLED = new RewardsOnboardingActivityViewState5("ENROLLED", 2);

    private static final /* synthetic */ RewardsOnboardingActivityViewState5[] $values() {
        return new RewardsOnboardingActivityViewState5[]{NOT_ELIGIBLE, ELIGIBLE_NOT_ENROLLED, ENROLLED};
    }

    public static EnumEntries<RewardsOnboardingActivityViewState5> getEntries() {
        return $ENTRIES;
    }

    private RewardsOnboardingActivityViewState5(String str, int i) {
    }

    static {
        RewardsOnboardingActivityViewState5[] rewardsOnboardingActivityViewState5Arr$values = $values();
        $VALUES = rewardsOnboardingActivityViewState5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(rewardsOnboardingActivityViewState5Arr$values);
    }

    public static RewardsOnboardingActivityViewState5 valueOf(String str) {
        return (RewardsOnboardingActivityViewState5) Enum.valueOf(RewardsOnboardingActivityViewState5.class, str);
    }

    public static RewardsOnboardingActivityViewState5[] values() {
        return (RewardsOnboardingActivityViewState5[]) $VALUES.clone();
    }
}
