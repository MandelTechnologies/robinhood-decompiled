package com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ReferralOfferDetailEventLoggingDelegate.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u001e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;", "", "logPrimaryButtonTap", "", "offerId", "Ljava/util/UUID;", "buttonText", "", "source", "initialSource", "logSecondaryButtonTap", "logPermissionDialogAppearEvents", "logGrantPermissionTap", "logRejectPermissionTap", "logSearchQuery", "query", "logScroll", "scrollDepth", "", "logSentInviteButtonTap", "usePhone", "", "isRecommendedContact", "logInviteSentConfirmationAlertAppear", CarResultComposable2.BUTTONS, "", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "logInviteSentConfirmationAlertActionButtonTap", "logInviteSentConfirmationAlertDismissButtonTap", "logSmsInviteSent", "logEmailInviteSent", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface ReferralOfferDetailEventLoggingDelegate {
    void logEmailInviteSent(String source);

    void logGrantPermissionTap();

    void logInviteSentConfirmationAlertActionButtonTap(UUID offerId, String buttonText);

    void logInviteSentConfirmationAlertAppear(UUID offerId, List<GenericButton> buttons);

    void logInviteSentConfirmationAlertDismissButtonTap(UUID offerId, String buttonText);

    void logPermissionDialogAppearEvents();

    void logPrimaryButtonTap(UUID offerId, String buttonText, String source, String initialSource);

    void logRejectPermissionTap();

    void logScroll(int scrollDepth);

    void logSearchQuery(String query);

    void logSecondaryButtonTap(UUID offerId, String buttonText, String source, String initialSource);

    void logSentInviteButtonTap(boolean usePhone, boolean isRecommendedContact);

    void logSmsInviteSent(String source);
}
