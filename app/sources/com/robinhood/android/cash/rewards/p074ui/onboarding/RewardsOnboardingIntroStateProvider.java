package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroBottomSheetFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroViewState;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RewardsOnboardingIntroStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDataState;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState;", "<init>", "()V", "reduce", "dataState", "substituteVariables", "", "content", "sweepsInterestRate", "Ljava/math/BigDecimal;", "bonus", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingIntroStateProvider implements StateProvider<RewardsOnboardingIntroDataState, RewardsOnboardingIntroViewState> {
    public static final int $stable = 0;
    public static final String APY_PLACEHOLDER = "{{ .INTEREST_APY }}";

    @Override // com.robinhood.android.udf.StateProvider
    public RewardsOnboardingIntroViewState reduce(RewardsOnboardingIntroDataState dataState) {
        RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState;
        SortingHatUserState.Brokerage brokerage;
        SortingHatUserState.Brokerage brokerage2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<RewardsOnboardingContent> onboardingStepsContent = dataState.getOnboardingStepsContent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(onboardingStepsContent, 10));
        for (RewardsOnboardingContent rewardsOnboardingContent : onboardingStepsContent) {
            String strSubstituteVariables = substituteVariables(rewardsOnboardingContent.getTitle(), dataState.getSweepsInterestRate(), dataState.getBonus());
            String strSubstituteVariables2 = substituteVariables(rewardsOnboardingContent.getContent().toString(), dataState.getSweepsInterestRate(), dataState.getBonus());
            RewardsOnboardingContent.Disclosure disclosure = rewardsOnboardingContent.getDisclosure();
            arrayList.add(new OnboardingStep(strSubstituteVariables, strSubstituteVariables2, disclosure != null ? new Action(C10176R.string.rewards_disclosure_learn, new RewardsOnboardingIntroBottomSheetFragment.Args(disclosure)) : null));
        }
        SortingHatUserState sortingHatUserState = dataState.getSortingHatUserState();
        if (sortingHatUserState == null || (brokerage2 = sortingHatUserState.getBrokerage()) == null || !brokerage2.isApproved()) {
            SortingHatUserState sortingHatUserState2 = dataState.getSortingHatUserState();
            if (sortingHatUserState2 != null && (brokerage = sortingHatUserState2.getBrokerage()) != null && brokerage.getHasApplication()) {
                brokerageAccountState = RewardsOnboardingIntroViewState.BrokerageAccountState.HAS_APPLICATION;
            } else {
                brokerageAccountState = RewardsOnboardingIntroViewState.BrokerageAccountState.NO_ACCOUNT;
            }
        } else {
            brokerageAccountState = RewardsOnboardingIntroViewState.BrokerageAccountState.HAS_ACCOUNT;
        }
        return new RewardsOnboardingIntroViewState(brokerageAccountState, arrayList);
    }

    private final String substituteVariables(String content, BigDecimal sweepsInterestRate, String bonus) {
        return StringsKt.replace$default(StringsKt.replace$default(content, "{{ .INTEREST_APY }}", sweepsInterestRate + "%", false, 4, (Object) null), "{{ .PERCENTAGE }}", bonus == null ? "" : bonus, false, 4, (Object) null);
    }
}
