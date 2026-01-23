package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.common.C11048R;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingIntroViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState;", "", "brokerageAccountState", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;", "onboardingSteps", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingStep;", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;Ljava/util/List;)V", "getBrokerageAccountState", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;", "getOnboardingSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BrokerageAccountState", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingIntroViewState {
    public static final int $stable = 8;
    private final BrokerageAccountState brokerageAccountState;
    private final List<OnboardingStep> onboardingSteps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsOnboardingIntroViewState copy$default(RewardsOnboardingIntroViewState rewardsOnboardingIntroViewState, BrokerageAccountState brokerageAccountState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountState = rewardsOnboardingIntroViewState.brokerageAccountState;
        }
        if ((i & 2) != 0) {
            list = rewardsOnboardingIntroViewState.onboardingSteps;
        }
        return rewardsOnboardingIntroViewState.copy(brokerageAccountState, list);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountState getBrokerageAccountState() {
        return this.brokerageAccountState;
    }

    public final List<OnboardingStep> component2() {
        return this.onboardingSteps;
    }

    public final RewardsOnboardingIntroViewState copy(BrokerageAccountState brokerageAccountState, List<OnboardingStep> onboardingSteps) {
        Intrinsics.checkNotNullParameter(brokerageAccountState, "brokerageAccountState");
        Intrinsics.checkNotNullParameter(onboardingSteps, "onboardingSteps");
        return new RewardsOnboardingIntroViewState(brokerageAccountState, onboardingSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingIntroViewState)) {
            return false;
        }
        RewardsOnboardingIntroViewState rewardsOnboardingIntroViewState = (RewardsOnboardingIntroViewState) other;
        return this.brokerageAccountState == rewardsOnboardingIntroViewState.brokerageAccountState && Intrinsics.areEqual(this.onboardingSteps, rewardsOnboardingIntroViewState.onboardingSteps);
    }

    public int hashCode() {
        return (this.brokerageAccountState.hashCode() * 31) + this.onboardingSteps.hashCode();
    }

    public String toString() {
        return "RewardsOnboardingIntroViewState(brokerageAccountState=" + this.brokerageAccountState + ", onboardingSteps=" + this.onboardingSteps + ")";
    }

    public RewardsOnboardingIntroViewState(BrokerageAccountState brokerageAccountState, List<OnboardingStep> onboardingSteps) {
        Intrinsics.checkNotNullParameter(brokerageAccountState, "brokerageAccountState");
        Intrinsics.checkNotNullParameter(onboardingSteps, "onboardingSteps");
        this.brokerageAccountState = brokerageAccountState;
        this.onboardingSteps = onboardingSteps;
    }

    public final BrokerageAccountState getBrokerageAccountState() {
        return this.brokerageAccountState;
    }

    public final List<OnboardingStep> getOnboardingSteps() {
        return this.onboardingSteps;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RewardsOnboardingIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;", "", "actionButtonResId", "", "<init>", "(Ljava/lang/String;II)V", "getActionButtonResId", "()I", "HAS_ACCOUNT", "HAS_APPLICATION", "NO_ACCOUNT", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BrokerageAccountState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrokerageAccountState[] $VALUES;
        public static final BrokerageAccountState HAS_ACCOUNT = new BrokerageAccountState("HAS_ACCOUNT", 0, C10176R.string.rewards_onboarding_asset_selection);
        public static final BrokerageAccountState HAS_APPLICATION = new BrokerageAccountState("HAS_APPLICATION", 1, C11048R.string.general_label_continue);
        public static final BrokerageAccountState NO_ACCOUNT = new BrokerageAccountState("NO_ACCOUNT", 2, C11048R.string.general_label_continue);
        private final int actionButtonResId;

        private static final /* synthetic */ BrokerageAccountState[] $values() {
            return new BrokerageAccountState[]{HAS_ACCOUNT, HAS_APPLICATION, NO_ACCOUNT};
        }

        public static EnumEntries<BrokerageAccountState> getEntries() {
            return $ENTRIES;
        }

        private BrokerageAccountState(String str, int i, int i2) {
            this.actionButtonResId = i2;
        }

        public final int getActionButtonResId() {
            return this.actionButtonResId;
        }

        static {
            BrokerageAccountState[] brokerageAccountStateArr$values = $values();
            $VALUES = brokerageAccountStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(brokerageAccountStateArr$values);
        }

        public static BrokerageAccountState valueOf(String str) {
            return (BrokerageAccountState) Enum.valueOf(BrokerageAccountState.class, str);
        }

        public static BrokerageAccountState[] values() {
            return (BrokerageAccountState[]) $VALUES.clone();
        }
    }
}
