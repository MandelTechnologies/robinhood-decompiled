package com.robinhood.android.rhy.referral.referrer;

import com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.rhy.referral.p345db.ReferrerLanding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsReferrerLandingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDataState;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "<init>", "()V", "reduce", "dataState", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsReferrerLandingStateProvider implements StateProvider<RhyReferralsReferrerLandingDataState, RhyReferralsReferrerLandingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyReferralsReferrerLandingViewState reduce(RhyReferralsReferrerLandingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null) {
            return new RhyReferralsReferrerLandingViewState.Error(dataState.getError());
        }
        ReferrerLanding referrerLanding = dataState.getReferrerLanding();
        if (referrerLanding != null) {
            return new RhyReferralsReferrerLandingViewState.Loaded(referrerLanding);
        }
        return RhyReferralsReferrerLandingViewState.Loading.INSTANCE;
    }
}
