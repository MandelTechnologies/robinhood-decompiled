package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012<\b\u0002\u0010\u0004\u001a6\u00120\u0012.\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0006\u0018\u00010\u0005\u0012\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00130\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J=\u0010\u001f\u001a6\u00120\u0012.\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0006\u0018\u00010\u0005HÆ\u0003J\u001f\u0010#\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00130\u0006\u0018\u00010\u0005HÆ\u0003J³\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032<\b\u0002\u0010\u0004\u001a6\u00120\u0012.\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0006\u0018\u00010\u00052\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00130\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017RE\u0010\u0004\u001a6\u00120\u0012.\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R%\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R'\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00130\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityViewState;", "", "sweepStatus", "Lcom/robinhood/android/cash/rewards/ui/onboarding/SweepStatus;", "content", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Pair;", "Ljava/util/HashMap;", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "Lkotlin/collections/HashMap;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/AssetSelectionContentIds;", "contentError", "", "introComplete", "assetSelected", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/SignupContentIds;", "signupComplete", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/SweepStatus;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getSweepStatus", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/SweepStatus;", "getContent", "()Lcom/robinhood/udf/UiEvent;", "getContentError", "getIntroComplete", "getAssetSelected", "getSignupComplete", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingActivityViewState {
    public static final int $stable = 8;
    private final UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> assetSelected;
    private final UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> content;
    private final UiEvent<Throwable> contentError;
    private final UiEvent<AssetSelectionContentIds> introComplete;
    private final UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> signupComplete;
    private final RewardsOnboardingActivityViewState5 sweepStatus;

    public RewardsOnboardingActivityViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RewardsOnboardingActivityViewState copy$default(RewardsOnboardingActivityViewState rewardsOnboardingActivityViewState, RewardsOnboardingActivityViewState5 rewardsOnboardingActivityViewState5, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsOnboardingActivityViewState5 = rewardsOnboardingActivityViewState.sweepStatus;
        }
        if ((i & 2) != 0) {
            uiEvent = rewardsOnboardingActivityViewState.content;
        }
        if ((i & 4) != 0) {
            uiEvent2 = rewardsOnboardingActivityViewState.contentError;
        }
        if ((i & 8) != 0) {
            uiEvent3 = rewardsOnboardingActivityViewState.introComplete;
        }
        if ((i & 16) != 0) {
            uiEvent4 = rewardsOnboardingActivityViewState.assetSelected;
        }
        if ((i & 32) != 0) {
            uiEvent5 = rewardsOnboardingActivityViewState.signupComplete;
        }
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent5;
        return rewardsOnboardingActivityViewState.copy(rewardsOnboardingActivityViewState5, uiEvent, uiEvent2, uiEvent3, uiEvent6, uiEvent7);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardsOnboardingActivityViewState5 getSweepStatus() {
        return this.sweepStatus;
    }

    public final UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> component2() {
        return this.content;
    }

    public final UiEvent<Throwable> component3() {
        return this.contentError;
    }

    public final UiEvent<AssetSelectionContentIds> component4() {
        return this.introComplete;
    }

    public final UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> component5() {
        return this.assetSelected;
    }

    public final UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> component6() {
        return this.signupComplete;
    }

    public final RewardsOnboardingActivityViewState copy(RewardsOnboardingActivityViewState5 sweepStatus, UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> content, UiEvent<Throwable> contentError, UiEvent<AssetSelectionContentIds> introComplete, UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> assetSelected, UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> signupComplete) {
        Intrinsics.checkNotNullParameter(sweepStatus, "sweepStatus");
        return new RewardsOnboardingActivityViewState(sweepStatus, content, contentError, introComplete, assetSelected, signupComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingActivityViewState)) {
            return false;
        }
        RewardsOnboardingActivityViewState rewardsOnboardingActivityViewState = (RewardsOnboardingActivityViewState) other;
        return this.sweepStatus == rewardsOnboardingActivityViewState.sweepStatus && Intrinsics.areEqual(this.content, rewardsOnboardingActivityViewState.content) && Intrinsics.areEqual(this.contentError, rewardsOnboardingActivityViewState.contentError) && Intrinsics.areEqual(this.introComplete, rewardsOnboardingActivityViewState.introComplete) && Intrinsics.areEqual(this.assetSelected, rewardsOnboardingActivityViewState.assetSelected) && Intrinsics.areEqual(this.signupComplete, rewardsOnboardingActivityViewState.signupComplete);
    }

    public int hashCode() {
        int iHashCode = this.sweepStatus.hashCode() * 31;
        UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> uiEvent = this.content;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.contentError;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<AssetSelectionContentIds> uiEvent3 = this.introComplete;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> uiEvent4 = this.assetSelected;
        int iHashCode5 = (iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> uiEvent5 = this.signupComplete;
        return iHashCode5 + (uiEvent5 != null ? uiEvent5.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOnboardingActivityViewState(sweepStatus=" + this.sweepStatus + ", content=" + this.content + ", contentError=" + this.contentError + ", introComplete=" + this.introComplete + ", assetSelected=" + this.assetSelected + ", signupComplete=" + this.signupComplete + ")";
    }

    public RewardsOnboardingActivityViewState(RewardsOnboardingActivityViewState5 sweepStatus, UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<AssetSelectionContentIds> uiEvent3, UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> uiEvent4, UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> uiEvent5) {
        Intrinsics.checkNotNullParameter(sweepStatus, "sweepStatus");
        this.sweepStatus = sweepStatus;
        this.content = uiEvent;
        this.contentError = uiEvent2;
        this.introComplete = uiEvent3;
        this.assetSelected = uiEvent4;
        this.signupComplete = uiEvent5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RewardsOnboardingActivityViewState(com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingActivityViewState5 r2, com.robinhood.udf.UiEvent r3, com.robinhood.udf.UiEvent r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, com.robinhood.udf.UiEvent r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.robinhood.android.cash.rewards.ui.onboarding.SweepStatus r2 = com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingActivityViewState5.NOT_ELIGIBLE
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingActivityViewState.<init>(com.robinhood.android.cash.rewards.ui.onboarding.SweepStatus, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final RewardsOnboardingActivityViewState5 getSweepStatus() {
        return this.sweepStatus;
    }

    public final UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> getContentError() {
        return this.contentError;
    }

    public final UiEvent<AssetSelectionContentIds> getIntroComplete() {
        return this.introComplete;
    }

    public final UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> getAssetSelected() {
        return this.assetSelected;
    }

    public final UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> getSignupComplete() {
        return this.signupComplete;
    }
}
