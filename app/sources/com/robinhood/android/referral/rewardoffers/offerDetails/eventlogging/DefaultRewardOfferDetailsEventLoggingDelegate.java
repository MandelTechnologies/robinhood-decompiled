package com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.referral.C26659R;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetailsSectionRenderingType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultRewardOfferDetailsEventLoggingDelegate.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J,\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/DefaultRewardOfferDetailsEventLoggingDelegate;", "Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/RewardOfferDetailsEventLoggingDelegate;", "analyticsLogger", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Landroid/content/res/Resources;)V", "logButtonTap", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "buttonAction", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "offerId", "Ljava/util/UUID;", "source", "", "initialSource", "logBulletActionTap", "logPastRewardButtonAppear", "logPastRewardButtonTap", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DefaultRewardOfferDetailsEventLoggingDelegate implements RewardOfferDetailsEventLoggingDelegate {
    public static final int $stable = 8;
    private final AnalyticsLogger analyticsLogger;
    private final EventLogger eventLogger;
    private final Resources resources;

    public DefaultRewardOfferDetailsEventLoggingDelegate(AnalyticsLogger analyticsLogger, EventLogger eventLogger, Resources resources) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "analyticsLogger");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.analyticsLogger = analyticsLogger;
        this.eventLogger = eventLogger;
        this.resources = resources;
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging.RewardOfferDetailsEventLoggingDelegate
    public void logButtonTap(UserInteractionEventData.Action action, ApiRewardOfferButtonAction buttonAction, UUID offerId, String source, String initialSource) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, "RewardOfferDetailsFragment-" + buttonAction.getAction().getType().getServerValue(), "offer_id:" + offerId, buttonAction.getDisplay_text(), null, null, "cta_button", null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging.RewardOfferDetailsEventLoggingDelegate
    public void logBulletActionTap(ApiRewardOfferButtonAction action, UUID offerId, String source, String initialSource) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, "RewardOfferDetailsFragment-" + action.getAction().getType().getServerValue(), "offer_id:" + offerId, null, null, null, ApiRewardOfferDetailsSectionRenderingType.Type.BULLET.getServerValue(), null, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null);
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action2 = UserInteractionEventData.Action.LEARN_MORE;
        Screen screen = new Screen(Screen.Name.REWARD_OFFER_DETAIL, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String string2 = offerId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, screen, new Component(componentType, string2, null, 4, null), null, new Context(0, 0, 0, action.getDisplay_text(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReferralEntryPointContext(source == null ? "uncategorized" : source, initialSource == null ? "" : initialSource, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -9, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging.RewardOfferDetailsEventLoggingDelegate
    public void logPastRewardButtonAppear(UUID offerId, String source, String initialSource) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.PAST;
        Screen screen = new Screen(Screen.Name.REWARD_OFFER_DETAIL, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String string2 = offerId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Component component = new Component(componentType, string2, null, 4, null);
        String string3 = this.resources.getString(C26659R.string.reward_offers_past_invites_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, string3, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReferralEntryPointContext(source == null ? "uncategorized" : source, initialSource == null ? "" : initialSource, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -9, -1, 16383, null), 8, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging.RewardOfferDetailsEventLoggingDelegate
    public void logPastRewardButtonTap(UUID offerId, String source, String initialSource) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.PAST;
        Screen screen = new Screen(Screen.Name.REWARD_OFFER_DETAIL, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String string2 = offerId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Component component = new Component(componentType, string2, null, 4, null);
        String string3 = this.resources.getString(C26659R.string.reward_offers_past_invites_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, string3, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReferralEntryPointContext(source == null ? "uncategorized" : source, initialSource == null ? "" : initialSource, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -9, -1, 16383, null), false, 40, null);
    }
}
