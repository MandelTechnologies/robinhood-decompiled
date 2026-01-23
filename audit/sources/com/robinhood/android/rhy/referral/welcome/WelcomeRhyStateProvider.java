package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyStateProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState;", "<init>", "()V", "reduce", "dataState", "ctaConfig", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "hasAccount", "", "rhyReferralOutAction", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "disclosureContentLoaded", "ctaConfig$feature_rhy_referral_externalDebug", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class WelcomeRhyStateProvider implements StateProvider<WelcomeRhyDataState, WelcomeRhyViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public WelcomeRhyViewState reduce(WelcomeRhyDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new WelcomeRhyViewState(ctaConfig$feature_rhy_referral_externalDebug(dataState.getHasAccount(), dataState.getRhyReferralOutAction(), dataState.getDisclosureContent() != null), dataState.getDisclosureContent());
    }

    public final WelcomeRhyViewState.CtaConfig ctaConfig$feature_rhy_referral_externalDebug(boolean hasAccount, RhyReferralOnboardingStore4 rhyReferralOutAction, boolean disclosureContentLoaded) {
        boolean z = !disclosureContentLoaded;
        if (!hasAccount) {
            return new WelcomeRhyViewState.CtaConfig.Auth(disclosureContentLoaded, z);
        }
        return new WelcomeRhyViewState.CtaConfig.Continue(disclosureContentLoaded, z, rhyReferralOutAction);
    }
}
