package com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging;

import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: RewardOfferDetailsEventLoggingDelegate.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/RewardOfferDetailsEventLoggingDelegate;", "", "logButtonTap", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "buttonAction", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "offerId", "Ljava/util/UUID;", "source", "", "initialSource", "logBulletActionTap", "logPastRewardButtonAppear", "logPastRewardButtonTap", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RewardOfferDetailsEventLoggingDelegate {
    void logBulletActionTap(ApiRewardOfferButtonAction action, UUID offerId, String source, String initialSource);

    void logButtonTap(UserInteractionEventData.Action action, ApiRewardOfferButtonAction buttonAction, UUID offerId, String source, String initialSource);

    void logPastRewardButtonAppear(UUID offerId, String source, String initialSource);

    void logPastRewardButtonTap(UUID offerId, String source, String initialSource);
}
