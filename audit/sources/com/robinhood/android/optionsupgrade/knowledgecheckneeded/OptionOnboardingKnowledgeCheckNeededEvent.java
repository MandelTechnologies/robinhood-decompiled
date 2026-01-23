package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingKnowledgeCheckNeededEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "", "<init>", "()V", "ScheduleAppointment", "OpenChat", "OpenAppointment", "Error", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$Error;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$OpenAppointment;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$OpenChat;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$ScheduleAppointment;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionOnboardingKnowledgeCheckNeededEvent {
    public static final int $stable = 0;

    public /* synthetic */ OptionOnboardingKnowledgeCheckNeededEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$ScheduleAppointment;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "campaignId", "", "<init>", "(Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScheduleAppointment extends OptionOnboardingKnowledgeCheckNeededEvent {
        public static final int $stable = 0;
        private final String campaignId;

        public static /* synthetic */ ScheduleAppointment copy$default(ScheduleAppointment scheduleAppointment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scheduleAppointment.campaignId;
            }
            return scheduleAppointment.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCampaignId() {
            return this.campaignId;
        }

        public final ScheduleAppointment copy(String campaignId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            return new ScheduleAppointment(campaignId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScheduleAppointment) && Intrinsics.areEqual(this.campaignId, ((ScheduleAppointment) other).campaignId);
        }

        public int hashCode() {
            return this.campaignId.hashCode();
        }

        public String toString() {
            return "ScheduleAppointment(campaignId=" + this.campaignId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScheduleAppointment(String campaignId) {
            super(null);
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            this.campaignId = campaignId;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }
    }

    private OptionOnboardingKnowledgeCheckNeededEvent() {
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$OpenChat;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "inquiryId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInquiryId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenChat extends OptionOnboardingKnowledgeCheckNeededEvent {
        public static final int $stable = 8;
        private final UUID inquiryId;

        public static /* synthetic */ OpenChat copy$default(OpenChat openChat, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = openChat.inquiryId;
            }
            return openChat.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final OpenChat copy(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new OpenChat(inquiryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenChat) && Intrinsics.areEqual(this.inquiryId, ((OpenChat) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        public String toString() {
            return "OpenChat(inquiryId=" + this.inquiryId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenChat(UUID inquiryId) {
            super(null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$OpenAppointment;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "appointmentId", "", "<init>", "(Ljava/lang/String;)V", "getAppointmentId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenAppointment extends OptionOnboardingKnowledgeCheckNeededEvent {
        public static final int $stable = 0;
        private final String appointmentId;

        public static /* synthetic */ OpenAppointment copy$default(OpenAppointment openAppointment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openAppointment.appointmentId;
            }
            return openAppointment.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppointmentId() {
            return this.appointmentId;
        }

        public final OpenAppointment copy(String appointmentId) {
            Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
            return new OpenAppointment(appointmentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenAppointment) && Intrinsics.areEqual(this.appointmentId, ((OpenAppointment) other).appointmentId);
        }

        public int hashCode() {
            return this.appointmentId.hashCode();
        }

        public String toString() {
            return "OpenAppointment(appointmentId=" + this.appointmentId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAppointment(String appointmentId) {
            super(null);
            Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
            this.appointmentId = appointmentId;
        }

        public final String getAppointmentId() {
            return this.appointmentId;
        }
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent$Error;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends OptionOnboardingKnowledgeCheckNeededEvent {
        public static final int $stable = 8;
        private final Exception exception;

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Exception getException() {
            return this.exception;
        }
    }
}
