package com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultReferralOfferDetailEventLoggingDelegate.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J,\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J \u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010'\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010(\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010)\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/DefaultReferralOfferDetailEventLoggingDelegate;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;", "analyticsLogger", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;)V", "logPrimaryButtonTap", "", "offerId", "Ljava/util/UUID;", "buttonText", "", "source", "initialSource", "logSecondaryButtonTap", "logPermissionDialogAppearEvents", "logGrantPermissionTap", "logRejectPermissionTap", "logSearchQuery", "query", "logScroll", "scrollDepth", "", "logSentInviteButtonTap", "usePhone", "", "isRecommendedContact", "logInviteSentConfirmationAlertAppear", CarResultComposable2.BUTTONS, "", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "logInviteSentConfirmationAlertButtonAppear", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "logInviteSentConfirmationAlertActionButtonTap", "logInviteSentConfirmationAlertDismissButtonTap", "logInviteSentConfirmationAlertButtonTap", "logSmsInviteSent", "logEmailInviteSent", "logInviteSent", "type", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DefaultReferralOfferDetailEventLoggingDelegate implements ReferralOfferDetailEventLoggingDelegate {
    public static final int $stable = 8;
    private final AnalyticsLogger analyticsLogger;
    private final EventLogger eventLogger;

    public DefaultReferralOfferDetailEventLoggingDelegate(AnalyticsLogger analyticsLogger, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "analyticsLogger");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.analyticsLogger = analyticsLogger;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logPrimaryButtonTap(UUID offerId, String buttonText, String source, String initialSource) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, "RewardOfferDetailsFragment-deeplink", "offer_id:" + offerId, buttonText, null, null, "cta_button", null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logSecondaryButtonTap(UUID offerId, String buttonText, String source, String initialSource) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, "RewardOfferDetailsFragment-deeplink", "offer_id:" + offerId, buttonText, null, null, "cta_button", null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logPermissionDialogAppearEvents() {
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analyticsLogger, AnalyticsStrings.BUTTON_GROUP_SYSTEM_CONTACT_PERMISSIONS, AnalyticsStrings.BUTTON_SYSTEM_CONTACT_PERMISSIONS_ACCEPT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analyticsLogger, AnalyticsStrings.BUTTON_GROUP_SYSTEM_CONTACT_PERMISSIONS, AnalyticsStrings.BUTTON_SYSTEM_CONTACT_PERMISSIONS_REJECT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logGrantPermissionTap() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, AnalyticsStrings.BUTTON_GROUP_SYSTEM_CONTACT_PERMISSIONS, AnalyticsStrings.BUTTON_SYSTEM_CONTACT_PERMISSIONS_ACCEPT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logRejectPermissionTap() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, AnalyticsStrings.BUTTON_GROUP_SYSTEM_CONTACT_PERMISSIONS, AnalyticsStrings.BUTTON_SYSTEM_CONTACT_PERMISSIONS_REJECT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        EventLogger.DefaultImpls.logType$default(this.eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, new Screen(Screen.Name.CONTACTS_LIST, null, null, null, 14, null), new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, new Context(0, 0, 0, null, null, query, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logScroll(int scrollDepth) {
        EventLogger.DefaultImpls.logScroll$default(this.eventLogger, null, new Screen(Screen.Name.CONTACTS_LIST, null, null, null, 14, null), new Component(Component.ComponentType.LIST_CONTACTS, null, null, 6, null), null, new Context(0, 0, scrollDepth, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, -1, -1, -1, -1, 16383, null), 9, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logSentInviteButtonTap(boolean usePhone, boolean isRecommendedContact) {
        String str;
        AnalyticsLogger analyticsLogger = this.analyticsLogger;
        if (usePhone) {
            if (isRecommendedContact) {
                str = AnalyticsStrings.BUTTON_REFERRALS_SMS_REC;
            } else {
                str = AnalyticsStrings.BUTTON_REFERRALS_SMS;
            }
        } else if (isRecommendedContact) {
            str = AnalyticsStrings.BUTTON_REFERRALS_EMAIL_REC;
        } else {
            str = AnalyticsStrings.BUTTON_REFERRALS_EMAIL;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_REFERRALS_SHARE, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logInviteSentConfirmationAlertAppear(UUID offerId, List<GenericButton> buttons) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        GenericButton genericButton = (GenericButton) CollectionsKt.getOrNull(buttons, 0);
        if (genericButton != null) {
            logInviteSentConfirmationAlertButtonAppear(offerId, genericButton.getTitle(), UserInteractionEventData.Action.PRIMARY_CTA);
        }
        GenericButton genericButton2 = (GenericButton) CollectionsKt.getOrNull(buttons, 1);
        if (genericButton2 != null) {
            logInviteSentConfirmationAlertButtonAppear(offerId, genericButton2.getTitle(), UserInteractionEventData.Action.SECONDARY_CTA);
        }
    }

    private final void logInviteSentConfirmationAlertButtonAppear(UUID offerId, String buttonText, UserInteractionEventData.Action action) {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG;
        String string2 = offerId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logInviteSentConfirmationAlertActionButtonTap(UUID offerId, String buttonText) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analyticsLogger, AnalyticsStrings.BUTTON_GROUP_REFERRALS_SHARE, AnalyticsStrings.BUTTON_POST_INVITE_SHARE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        logInviteSentConfirmationAlertButtonTap(offerId, buttonText, UserInteractionEventData.Action.PRIMARY_CTA);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logInviteSentConfirmationAlertDismissButtonTap(UUID offerId, String buttonText) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        logInviteSentConfirmationAlertButtonTap(offerId, buttonText, UserInteractionEventData.Action.SECONDARY_CTA);
    }

    private final void logInviteSentConfirmationAlertButtonTap(UUID offerId, String buttonText, UserInteractionEventData.Action action) {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG;
        String string2 = offerId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logSmsInviteSent(String source) {
        logInviteSent(source, "sms");
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate
    public void logEmailInviteSent(String source) {
        logInviteSent(source, "email");
    }

    private final void logInviteSent(String source, String type2) {
        AnalyticsLogger analyticsLogger = this.analyticsLogger;
        if (source == null) {
            source = "";
        }
        analyticsLogger.logComm(AnalyticsStrings.COMM_REFERRAL_SHARE, type2, source, 1, 1);
    }
}
