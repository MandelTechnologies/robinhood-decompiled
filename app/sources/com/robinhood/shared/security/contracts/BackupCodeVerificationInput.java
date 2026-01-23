package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationInput.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "Landroid/os/Parcelable;", "flowId", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "email", "totpToken", "enrollmentToken", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlowId", "()Ljava/lang/String;", "getChallengeId", "()Ljava/util/UUID;", "getEmail", "getTotpToken", "getEnrollmentToken", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BackupCodeVerificationInput implements Parcelable {
    public static final Parcelable.Creator<BackupCodeVerificationInput> CREATOR = new Creator();
    private final UUID challengeId;
    private final String email;
    private final String enrollmentToken;
    private final String flowId;
    private final String phoneNumber;
    private final String totpToken;

    /* compiled from: BackupCodeVerificationInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BackupCodeVerificationInput> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCodeVerificationInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackupCodeVerificationInput(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCodeVerificationInput[] newArray(int i) {
            return new BackupCodeVerificationInput[i];
        }
    }

    public static /* synthetic */ BackupCodeVerificationInput copy$default(BackupCodeVerificationInput backupCodeVerificationInput, String str, UUID uuid, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backupCodeVerificationInput.flowId;
        }
        if ((i & 2) != 0) {
            uuid = backupCodeVerificationInput.challengeId;
        }
        if ((i & 4) != 0) {
            str2 = backupCodeVerificationInput.email;
        }
        if ((i & 8) != 0) {
            str3 = backupCodeVerificationInput.totpToken;
        }
        if ((i & 16) != 0) {
            str4 = backupCodeVerificationInput.enrollmentToken;
        }
        if ((i & 32) != 0) {
            str5 = backupCodeVerificationInput.phoneNumber;
        }
        String str6 = str4;
        String str7 = str5;
        return backupCodeVerificationInput.copy(str, uuid, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFlowId() {
        return this.flowId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTotpToken() {
        return this.totpToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEnrollmentToken() {
        return this.enrollmentToken;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final BackupCodeVerificationInput copy(String flowId, UUID challengeId, String email, String totpToken, String enrollmentToken, String phoneNumber) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return new BackupCodeVerificationInput(flowId, challengeId, email, totpToken, enrollmentToken, phoneNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupCodeVerificationInput)) {
            return false;
        }
        BackupCodeVerificationInput backupCodeVerificationInput = (BackupCodeVerificationInput) other;
        return Intrinsics.areEqual(this.flowId, backupCodeVerificationInput.flowId) && Intrinsics.areEqual(this.challengeId, backupCodeVerificationInput.challengeId) && Intrinsics.areEqual(this.email, backupCodeVerificationInput.email) && Intrinsics.areEqual(this.totpToken, backupCodeVerificationInput.totpToken) && Intrinsics.areEqual(this.enrollmentToken, backupCodeVerificationInput.enrollmentToken) && Intrinsics.areEqual(this.phoneNumber, backupCodeVerificationInput.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = this.flowId.hashCode() * 31;
        UUID uuid = this.challengeId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.email;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.totpToken;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enrollmentToken;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phoneNumber;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "BackupCodeVerificationInput(flowId=" + this.flowId + ", challengeId=" + this.challengeId + ", email=" + this.email + ", totpToken=" + this.totpToken + ", enrollmentToken=" + this.enrollmentToken + ", phoneNumber=" + this.phoneNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.flowId);
        dest.writeSerializable(this.challengeId);
        dest.writeString(this.email);
        dest.writeString(this.totpToken);
        dest.writeString(this.enrollmentToken);
        dest.writeString(this.phoneNumber);
    }

    public BackupCodeVerificationInput(String flowId, UUID uuid, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        this.flowId = flowId;
        this.challengeId = uuid;
        this.email = str;
        this.totpToken = str2;
        this.enrollmentToken = str3;
        this.phoneNumber = str4;
    }

    public /* synthetic */ BackupCodeVerificationInput(String str, UUID uuid, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final UUID getChallengeId() {
        return this.challengeId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getTotpToken() {
        return this.totpToken;
    }

    public final String getEnrollmentToken() {
        return this.enrollmentToken;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}
