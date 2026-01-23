package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingIntroDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDataState;", "", "onboardingStepsContent", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "bonus", "", "sortingHatUserState", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "sweepsInterestRate", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;Ljava/math/BigDecimal;)V", "getOnboardingStepsContent", "()Ljava/util/List;", "getBonus", "()Ljava/lang/String;", "getSortingHatUserState", "()Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "getSweepsInterestRate", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingIntroDataState {
    public static final int $stable = 8;
    private final String bonus;
    private final List<RewardsOnboardingContent> onboardingStepsContent;
    private final SortingHatUserState sortingHatUserState;
    private final BigDecimal sweepsInterestRate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsOnboardingIntroDataState copy$default(RewardsOnboardingIntroDataState rewardsOnboardingIntroDataState, List list, String str, SortingHatUserState sortingHatUserState, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rewardsOnboardingIntroDataState.onboardingStepsContent;
        }
        if ((i & 2) != 0) {
            str = rewardsOnboardingIntroDataState.bonus;
        }
        if ((i & 4) != 0) {
            sortingHatUserState = rewardsOnboardingIntroDataState.sortingHatUserState;
        }
        if ((i & 8) != 0) {
            bigDecimal = rewardsOnboardingIntroDataState.sweepsInterestRate;
        }
        return rewardsOnboardingIntroDataState.copy(list, str, sortingHatUserState, bigDecimal);
    }

    public final List<RewardsOnboardingContent> component1() {
        return this.onboardingStepsContent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBonus() {
        return this.bonus;
    }

    /* renamed from: component3, reason: from getter */
    public final SortingHatUserState getSortingHatUserState() {
        return this.sortingHatUserState;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getSweepsInterestRate() {
        return this.sweepsInterestRate;
    }

    public final RewardsOnboardingIntroDataState copy(List<RewardsOnboardingContent> onboardingStepsContent, String bonus, SortingHatUserState sortingHatUserState, BigDecimal sweepsInterestRate) {
        Intrinsics.checkNotNullParameter(onboardingStepsContent, "onboardingStepsContent");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        return new RewardsOnboardingIntroDataState(onboardingStepsContent, bonus, sortingHatUserState, sweepsInterestRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingIntroDataState)) {
            return false;
        }
        RewardsOnboardingIntroDataState rewardsOnboardingIntroDataState = (RewardsOnboardingIntroDataState) other;
        return Intrinsics.areEqual(this.onboardingStepsContent, rewardsOnboardingIntroDataState.onboardingStepsContent) && Intrinsics.areEqual(this.bonus, rewardsOnboardingIntroDataState.bonus) && Intrinsics.areEqual(this.sortingHatUserState, rewardsOnboardingIntroDataState.sortingHatUserState) && Intrinsics.areEqual(this.sweepsInterestRate, rewardsOnboardingIntroDataState.sweepsInterestRate);
    }

    public int hashCode() {
        int iHashCode = ((this.onboardingStepsContent.hashCode() * 31) + this.bonus.hashCode()) * 31;
        SortingHatUserState sortingHatUserState = this.sortingHatUserState;
        int iHashCode2 = (iHashCode + (sortingHatUserState == null ? 0 : sortingHatUserState.hashCode())) * 31;
        BigDecimal bigDecimal = this.sweepsInterestRate;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOnboardingIntroDataState(onboardingStepsContent=" + this.onboardingStepsContent + ", bonus=" + this.bonus + ", sortingHatUserState=" + this.sortingHatUserState + ", sweepsInterestRate=" + this.sweepsInterestRate + ")";
    }

    public RewardsOnboardingIntroDataState(List<RewardsOnboardingContent> onboardingStepsContent, String bonus, SortingHatUserState sortingHatUserState, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(onboardingStepsContent, "onboardingStepsContent");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        this.onboardingStepsContent = onboardingStepsContent;
        this.bonus = bonus;
        this.sortingHatUserState = sortingHatUserState;
        this.sweepsInterestRate = bigDecimal;
    }

    public /* synthetic */ RewardsOnboardingIntroDataState(List list, String str, SortingHatUserState sortingHatUserState, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : sortingHatUserState, (i & 8) != 0 ? null : bigDecimal);
    }

    public final List<RewardsOnboardingContent> getOnboardingStepsContent() {
        return this.onboardingStepsContent;
    }

    public final String getBonus() {
        return this.bonus;
    }

    public final SortingHatUserState getSortingHatUserState() {
        return this.sortingHatUserState;
    }

    public final BigDecimal getSweepsInterestRate() {
        return this.sweepsInterestRate;
    }
}
