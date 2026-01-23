package com.robinhood.android.engagement.infolandingpage;

import com.robinhood.android.engagement.infolandingpage.InfoLandingPageViewState;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoLandingPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataState;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "<init>", "()V", "reduce", "dataState", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageDataStateProvider, reason: use source file name */
/* loaded from: classes7.dex */
public final class InfoLandingPageDuxo2 implements StateProvider<InfoLandingPageDataState, InfoLandingPageViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InfoLandingPageViewState reduce(InfoLandingPageDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiRewardOfferDetails content = dataState.getContent();
        Throwable error = dataState.getError();
        if (error != null) {
            return new InfoLandingPageViewState.Error(error);
        }
        if (content != null) {
            return new InfoLandingPageViewState.Loaded(RewardOfferDetails2.toRewardOfferDetails(content));
        }
        return InfoLandingPageViewState.Loading.INSTANCE;
    }
}
