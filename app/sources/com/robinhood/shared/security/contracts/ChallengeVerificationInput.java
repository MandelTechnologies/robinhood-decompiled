package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationInput.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "Landroid/os/Parcelable;", "flowId", "", "isEmbeddedInPathfinder", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "email", "userUuid", "Ljava/util/UUID;", "verificationWorkflowId", "fallbackCtaText", "initialAlert", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput$Alert;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/api/Challenge;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput$Alert;)V", "getFlowId", "()Ljava/lang/String;", "()Z", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getEmail", "getUserUuid", "()Ljava/util/UUID;", "getVerificationWorkflowId", "getFallbackCtaText", "getInitialAlert", "()Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput$Alert;", "challengeContextFallbackType", "getChallengeContextFallbackType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Alert", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeVerificationInput implements Parcelable {
    public static final Parcelable.Creator<ChallengeVerificationInput> CREATOR = new Creator();
    private final Challenge challenge;
    private final String email;
    private final String fallbackCtaText;
    private final String flowId;
    private final Alert initialAlert;
    private final boolean isEmbeddedInPathfinder;
    private final UUID userUuid;
    private final UUID verificationWorkflowId;

    /* compiled from: ChallengeVerificationInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeVerificationInput> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeVerificationInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeVerificationInput(parcel.readString(), parcel.readInt() != 0, (Challenge) parcel.readParcelable(ChallengeVerificationInput.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Alert.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeVerificationInput[] newArray(int i) {
            return new ChallengeVerificationInput[i];
        }
    }

    public static /* synthetic */ ChallengeVerificationInput copy$default(ChallengeVerificationInput challengeVerificationInput, String str, boolean z, Challenge challenge, String str2, UUID uuid, UUID uuid2, String str3, Alert alert, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeVerificationInput.flowId;
        }
        if ((i & 2) != 0) {
            z = challengeVerificationInput.isEmbeddedInPathfinder;
        }
        if ((i & 4) != 0) {
            challenge = challengeVerificationInput.challenge;
        }
        if ((i & 8) != 0) {
            str2 = challengeVerificationInput.email;
        }
        if ((i & 16) != 0) {
            uuid = challengeVerificationInput.userUuid;
        }
        if ((i & 32) != 0) {
            uuid2 = challengeVerificationInput.verificationWorkflowId;
        }
        if ((i & 64) != 0) {
            str3 = challengeVerificationInput.fallbackCtaText;
        }
        if ((i & 128) != 0) {
            alert = challengeVerificationInput.initialAlert;
        }
        String str4 = str3;
        Alert alert2 = alert;
        UUID uuid3 = uuid;
        UUID uuid4 = uuid2;
        return challengeVerificationInput.copy(str, z, challenge, str2, uuid3, uuid4, str4, alert2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFlowId() {
        return this.flowId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEmbeddedInPathfinder() {
        return this.isEmbeddedInPathfinder;
    }

    /* renamed from: component3, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getUserUuid() {
        return this.userUuid;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getVerificationWorkflowId() {
        return this.verificationWorkflowId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    /* renamed from: component8, reason: from getter */
    public final Alert getInitialAlert() {
        return this.initialAlert;
    }

    public final ChallengeVerificationInput copy(String flowId, boolean isEmbeddedInPathfinder, Challenge challenge, String email, UUID userUuid, UUID verificationWorkflowId, String fallbackCtaText, Alert initialAlert) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return new ChallengeVerificationInput(flowId, isEmbeddedInPathfinder, challenge, email, userUuid, verificationWorkflowId, fallbackCtaText, initialAlert);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeVerificationInput)) {
            return false;
        }
        ChallengeVerificationInput challengeVerificationInput = (ChallengeVerificationInput) other;
        return Intrinsics.areEqual(this.flowId, challengeVerificationInput.flowId) && this.isEmbeddedInPathfinder == challengeVerificationInput.isEmbeddedInPathfinder && Intrinsics.areEqual(this.challenge, challengeVerificationInput.challenge) && Intrinsics.areEqual(this.email, challengeVerificationInput.email) && Intrinsics.areEqual(this.userUuid, challengeVerificationInput.userUuid) && Intrinsics.areEqual(this.verificationWorkflowId, challengeVerificationInput.verificationWorkflowId) && Intrinsics.areEqual(this.fallbackCtaText, challengeVerificationInput.fallbackCtaText) && Intrinsics.areEqual(this.initialAlert, challengeVerificationInput.initialAlert);
    }

    public int hashCode() {
        int iHashCode = ((this.flowId.hashCode() * 31) + Boolean.hashCode(this.isEmbeddedInPathfinder)) * 31;
        Challenge challenge = this.challenge;
        int iHashCode2 = (iHashCode + (challenge == null ? 0 : challenge.hashCode())) * 31;
        String str = this.email;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.userUuid;
        int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.verificationWorkflowId;
        int iHashCode5 = (iHashCode4 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str2 = this.fallbackCtaText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Alert alert = this.initialAlert;
        return iHashCode6 + (alert != null ? alert.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeVerificationInput(flowId=" + this.flowId + ", isEmbeddedInPathfinder=" + this.isEmbeddedInPathfinder + ", challenge=" + this.challenge + ", email=" + this.email + ", userUuid=" + this.userUuid + ", verificationWorkflowId=" + this.verificationWorkflowId + ", fallbackCtaText=" + this.fallbackCtaText + ", initialAlert=" + this.initialAlert + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.flowId);
        dest.writeInt(this.isEmbeddedInPathfinder ? 1 : 0);
        dest.writeParcelable(this.challenge, flags);
        dest.writeString(this.email);
        dest.writeSerializable(this.userUuid);
        dest.writeSerializable(this.verificationWorkflowId);
        dest.writeString(this.fallbackCtaText);
        Alert alert = this.initialAlert;
        if (alert == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alert.writeToParcel(dest, flags);
        }
    }

    public ChallengeVerificationInput(String flowId, boolean z, Challenge challenge, String str, UUID uuid, UUID uuid2, String str2, Alert alert) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        this.flowId = flowId;
        this.isEmbeddedInPathfinder = z;
        this.challenge = challenge;
        this.email = str;
        this.userUuid = uuid;
        this.verificationWorkflowId = uuid2;
        this.fallbackCtaText = str2;
        this.initialAlert = alert;
    }

    public /* synthetic */ ChallengeVerificationInput(String str, boolean z, Challenge challenge, String str2, UUID uuid, UUID uuid2, String str3, Alert alert, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, challenge, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : uuid, (i & 32) != 0 ? null : uuid2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : alert);
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final boolean isEmbeddedInPathfinder() {
        return this.isEmbeddedInPathfinder;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getEmail() {
        return this.email;
    }

    public final UUID getUserUuid() {
        return this.userUuid;
    }

    public final UUID getVerificationWorkflowId() {
        return this.verificationWorkflowId;
    }

    public final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    public final Alert getInitialAlert() {
        return this.initialAlert;
    }

    public final String getChallengeContextFallbackType() {
        if (this.isEmbeddedInPathfinder && this.fallbackCtaText != null) {
            return SuvConstants.DEFAULT_FLOW_ID;
        }
        Challenge challenge = this.challenge;
        return String.valueOf(challenge != null ? challenge.getAlternate_type() : null);
    }

    /* compiled from: ChallengeVerificationInput.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput$Alert;", "Landroid/os/Parcelable;", "title", "", "description", "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getDismissCtaText", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Alert implements Parcelable {
        public static final Parcelable.Creator<Alert> CREATOR = new Creator();
        private final String description;
        private final String dismissCtaText;
        private final String title;

        /* compiled from: ChallengeVerificationInput.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Alert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Alert createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Alert(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Alert[] newArray(int i) {
                return new Alert[i];
            }
        }

        public static /* synthetic */ Alert copy$default(Alert alert, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alert.title;
            }
            if ((i & 2) != 0) {
                str2 = alert.description;
            }
            if ((i & 4) != 0) {
                str3 = alert.dismissCtaText;
            }
            return alert.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        public final Alert copy(String title, String description, String dismissCtaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
            return new Alert(title, description, dismissCtaText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alert)) {
                return false;
            }
            Alert alert = (Alert) other;
            return Intrinsics.areEqual(this.title, alert.title) && Intrinsics.areEqual(this.description, alert.description) && Intrinsics.areEqual(this.dismissCtaText, alert.dismissCtaText);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.dismissCtaText.hashCode();
        }

        public String toString() {
            return "Alert(title=" + this.title + ", description=" + this.description + ", dismissCtaText=" + this.dismissCtaText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.dismissCtaText);
        }

        public Alert(String title, String description, String dismissCtaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
            this.title = title;
            this.description = description;
            this.dismissCtaText = dismissCtaText;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }
    }
}
