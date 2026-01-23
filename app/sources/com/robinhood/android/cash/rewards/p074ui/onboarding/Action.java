package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/Action;", "", "linkTextRes", "", "linkArgs", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;", "<init>", "(ILcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;)V", "getLinkTextRes", "()I", "getLinkArgs", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Action {
    public static final int $stable = 8;
    private final RewardsOnboardingIntroBottomSheetFragment.Args linkArgs;
    private final int linkTextRes;

    public static /* synthetic */ Action copy$default(Action action, int i, RewardsOnboardingIntroBottomSheetFragment.Args args, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = action.linkTextRes;
        }
        if ((i2 & 2) != 0) {
            args = action.linkArgs;
        }
        return action.copy(i, args);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLinkTextRes() {
        return this.linkTextRes;
    }

    /* renamed from: component2, reason: from getter */
    public final RewardsOnboardingIntroBottomSheetFragment.Args getLinkArgs() {
        return this.linkArgs;
    }

    public final Action copy(int linkTextRes, RewardsOnboardingIntroBottomSheetFragment.Args linkArgs) {
        Intrinsics.checkNotNullParameter(linkArgs, "linkArgs");
        return new Action(linkTextRes, linkArgs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return this.linkTextRes == action.linkTextRes && Intrinsics.areEqual(this.linkArgs, action.linkArgs);
    }

    public int hashCode() {
        return (Integer.hashCode(this.linkTextRes) * 31) + this.linkArgs.hashCode();
    }

    public String toString() {
        return "Action(linkTextRes=" + this.linkTextRes + ", linkArgs=" + this.linkArgs + ")";
    }

    public Action(int i, RewardsOnboardingIntroBottomSheetFragment.Args linkArgs) {
        Intrinsics.checkNotNullParameter(linkArgs, "linkArgs");
        this.linkTextRes = i;
        this.linkArgs = linkArgs;
    }

    public final int getLinkTextRes() {
        return this.linkTextRes;
    }

    public final RewardsOnboardingIntroBottomSheetFragment.Args getLinkArgs() {
        return this.linkArgs;
    }
}
