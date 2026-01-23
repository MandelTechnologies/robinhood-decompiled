package com.robinhood.feature.sweep.onboarding.fragments;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingSplashHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashHandler;", "", "<init>", "()V", "getNextFragmentAfterSplash", "Landroidx/fragment/app/Fragment;", "sweepFlow", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "accountNumber", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SweepOnboardingSplashHandler {
    public static final int $stable = 0;
    public static final SweepOnboardingSplashHandler INSTANCE = new SweepOnboardingSplashHandler();

    private SweepOnboardingSplashHandler() {
    }

    public final Fragment getNextFragmentAfterSplash(ApiSweepFlow sweepFlow, String accountNumber) {
        if (sweepFlow == null) {
            return SweepOnboardingSweepAgreementFragment.INSTANCE.newInstance((Parcelable) new SweepOnboardingSweepAgreementFragment.Args(null, null, accountNumber, 3, null));
        }
        if (sweepFlow.isGoldAvailable() & (!sweepFlow.isGold())) {
            SweepOnboardingLearnMoreGoldFragment.Companion companion = SweepOnboardingLearnMoreGoldFragment.INSTANCE;
            ApiSweepFlow.LearnMoreGold learnMoreGold = sweepFlow.getLearnMoreGold();
            Intrinsics.checkNotNull(learnMoreGold);
            return companion.newInstance((Parcelable) new SweepOnboardingLearnMoreGoldFragment.Args(learnMoreGold));
        }
        return SweepOnboardingSweepAgreementFragment.INSTANCE.newInstance((Parcelable) new SweepOnboardingSweepAgreementFragment.Args(sweepFlow.getSweepAgreement(), Boolean.valueOf(sweepFlow.isGold()), accountNumber));
    }
}
