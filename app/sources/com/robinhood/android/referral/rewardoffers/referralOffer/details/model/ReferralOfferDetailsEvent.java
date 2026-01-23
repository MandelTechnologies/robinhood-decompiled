package com.robinhood.android.referral.rewardoffers.referralOffer.details.model;

import com.robinhood.android.referral.lib.invite.InviteUserData;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferInfoSheet;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralOfferDetailsEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "", "<init>", "()V", "ShowPastRewards", "ShowPermissionRequest", "ShowPermissionExplanation", "CancelInvitePreparation", "InviteContactViaWhatsApp", "InviteContactViaText", "InviteContactViaEmail", "ShowInviteSentConfirmation", "ShowPreparationAlert", "ShowInfoSheet", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$CancelInvitePreparation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaEmail;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaText;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaWhatsApp;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowInfoSheet;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowInviteSentConfirmation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPastRewards;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPermissionExplanation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPermissionRequest;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPreparationAlert;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class ReferralOfferDetailsEvent {
    public static final int $stable = 0;

    public /* synthetic */ ReferralOfferDetailsEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ReferralOfferDetailsEvent() {
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPastRewards;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowPastRewards extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        public static final ShowPastRewards INSTANCE = new ShowPastRewards();

        private ShowPastRewards() {
            super(null);
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPermissionRequest;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowPermissionRequest extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        public static final ShowPermissionRequest INSTANCE = new ShowPermissionRequest();

        private ShowPermissionRequest() {
            super(null);
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPermissionExplanation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowPermissionExplanation extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        public static final ShowPermissionExplanation INSTANCE = new ShowPermissionExplanation();

        private ShowPermissionExplanation() {
            super(null);
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$CancelInvitePreparation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CancelInvitePreparation extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        public static final CancelInvitePreparation INSTANCE = new CancelInvitePreparation();

        private CancelInvitePreparation() {
            super(null);
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaWhatsApp;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InviteContactViaWhatsApp extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ InviteContactViaWhatsApp copy$default(InviteContactViaWhatsApp inviteContactViaWhatsApp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inviteContactViaWhatsApp.message;
            }
            return inviteContactViaWhatsApp.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final InviteContactViaWhatsApp copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new InviteContactViaWhatsApp(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InviteContactViaWhatsApp) && Intrinsics.areEqual(this.message, ((InviteContactViaWhatsApp) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "InviteContactViaWhatsApp(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InviteContactViaWhatsApp(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaText;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "<init>", "(Lcom/robinhood/android/referral/lib/invite/InviteUserData;)V", "getData", "()Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InviteContactViaText extends ReferralOfferDetailsEvent {
        public static final int $stable = InviteUserData.$stable;
        private final InviteUserData data;

        public static /* synthetic */ InviteContactViaText copy$default(InviteContactViaText inviteContactViaText, InviteUserData inviteUserData, int i, Object obj) {
            if ((i & 1) != 0) {
                inviteUserData = inviteContactViaText.data;
            }
            return inviteContactViaText.copy(inviteUserData);
        }

        /* renamed from: component1, reason: from getter */
        public final InviteUserData getData() {
            return this.data;
        }

        public final InviteContactViaText copy(InviteUserData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new InviteContactViaText(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InviteContactViaText) && Intrinsics.areEqual(this.data, ((InviteContactViaText) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "InviteContactViaText(data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InviteContactViaText(InviteUserData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final InviteUserData getData() {
            return this.data;
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$InviteContactViaEmail;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "<init>", "(Lcom/robinhood/android/referral/lib/invite/InviteUserData;)V", "getData", "()Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InviteContactViaEmail extends ReferralOfferDetailsEvent {
        public static final int $stable = InviteUserData.$stable;
        private final InviteUserData data;

        public static /* synthetic */ InviteContactViaEmail copy$default(InviteContactViaEmail inviteContactViaEmail, InviteUserData inviteUserData, int i, Object obj) {
            if ((i & 1) != 0) {
                inviteUserData = inviteContactViaEmail.data;
            }
            return inviteContactViaEmail.copy(inviteUserData);
        }

        /* renamed from: component1, reason: from getter */
        public final InviteUserData getData() {
            return this.data;
        }

        public final InviteContactViaEmail copy(InviteUserData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new InviteContactViaEmail(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InviteContactViaEmail) && Intrinsics.areEqual(this.data, ((InviteContactViaEmail) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "InviteContactViaEmail(data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InviteContactViaEmail(InviteUserData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final InviteUserData getData() {
            return this.data;
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowInviteSentConfirmation;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$InfoAlertAction;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAction$InfoAlertAction;)V", "getAction", "()Lcom/robinhood/models/serverdriven/db/GenericAction$InfoAlertAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInviteSentConfirmation extends ReferralOfferDetailsEvent {
        public static final int $stable = 8;
        private final GenericAction.InfoAlertAction action;

        public static /* synthetic */ ShowInviteSentConfirmation copy$default(ShowInviteSentConfirmation showInviteSentConfirmation, GenericAction.InfoAlertAction infoAlertAction, int i, Object obj) {
            if ((i & 1) != 0) {
                infoAlertAction = showInviteSentConfirmation.action;
            }
            return showInviteSentConfirmation.copy(infoAlertAction);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAction.InfoAlertAction getAction() {
            return this.action;
        }

        public final ShowInviteSentConfirmation copy(GenericAction.InfoAlertAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new ShowInviteSentConfirmation(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInviteSentConfirmation) && Intrinsics.areEqual(this.action, ((ShowInviteSentConfirmation) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "ShowInviteSentConfirmation(action=" + this.action + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInviteSentConfirmation(GenericAction.InfoAlertAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public final GenericAction.InfoAlertAction getAction() {
            return this.action;
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPreparationAlert;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "preparationText", "", "cancelCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreparationText", "()Ljava/lang/String;", "getCancelCta", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPreparationAlert extends ReferralOfferDetailsEvent {
        public static final int $stable = 0;
        private final String cancelCta;
        private final String preparationText;

        public static /* synthetic */ ShowPreparationAlert copy$default(ShowPreparationAlert showPreparationAlert, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showPreparationAlert.preparationText;
            }
            if ((i & 2) != 0) {
                str2 = showPreparationAlert.cancelCta;
            }
            return showPreparationAlert.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPreparationText() {
            return this.preparationText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCancelCta() {
            return this.cancelCta;
        }

        public final ShowPreparationAlert copy(String preparationText, String cancelCta) {
            Intrinsics.checkNotNullParameter(preparationText, "preparationText");
            Intrinsics.checkNotNullParameter(cancelCta, "cancelCta");
            return new ShowPreparationAlert(preparationText, cancelCta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPreparationAlert)) {
                return false;
            }
            ShowPreparationAlert showPreparationAlert = (ShowPreparationAlert) other;
            return Intrinsics.areEqual(this.preparationText, showPreparationAlert.preparationText) && Intrinsics.areEqual(this.cancelCta, showPreparationAlert.cancelCta);
        }

        public int hashCode() {
            return (this.preparationText.hashCode() * 31) + this.cancelCta.hashCode();
        }

        public String toString() {
            return "ShowPreparationAlert(preparationText=" + this.preparationText + ", cancelCta=" + this.cancelCta + ")";
        }

        public final String getPreparationText() {
            return this.preparationText;
        }

        public final String getCancelCta() {
            return this.cancelCta;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPreparationAlert(String preparationText, String cancelCta) {
            super(null);
            Intrinsics.checkNotNullParameter(preparationText, "preparationText");
            Intrinsics.checkNotNullParameter(cancelCta, "cancelCta");
            this.preparationText = preparationText;
            this.cancelCta = cancelCta;
        }
    }

    /* compiled from: ReferralOfferDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowInfoSheet;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "content", "Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "<init>", "(Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;)V", "getContent", "()Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInfoSheet extends ReferralOfferDetailsEvent {
        public static final int $stable = 8;
        private final ReferralOfferInfoSheet content;

        public static /* synthetic */ ShowInfoSheet copy$default(ShowInfoSheet showInfoSheet, ReferralOfferInfoSheet referralOfferInfoSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                referralOfferInfoSheet = showInfoSheet.content;
            }
            return showInfoSheet.copy(referralOfferInfoSheet);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralOfferInfoSheet getContent() {
            return this.content;
        }

        public final ShowInfoSheet copy(ReferralOfferInfoSheet content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ShowInfoSheet(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInfoSheet) && Intrinsics.areEqual(this.content, ((ShowInfoSheet) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ShowInfoSheet(content=" + this.content + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInfoSheet(ReferralOfferInfoSheet content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final ReferralOfferInfoSheet getContent() {
            return this.content;
        }
    }
}
