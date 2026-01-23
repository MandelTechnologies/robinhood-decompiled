package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthenticationRequestParameters.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\r¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "Landroid/os/Parcelable;", "", "deviceData", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "sdkAppId", "sdkReferenceNumber", "sdkEphemeralPublicKey", "messageVersion", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDeviceData", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkAppId", "getSdkReferenceNumber", "getSdkEphemeralPublicKey", "getMessageVersion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AuthenticationRequestParameters implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequestParameters> CREATOR = new Creator();
    private final String deviceData;
    private final String messageVersion;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    /* compiled from: AuthenticationRequestParameters.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthenticationRequestParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthenticationRequestParameters(parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters[] newArray(int i) {
            return new AuthenticationRequestParameters[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationRequestParameters)) {
            return false;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) other;
        return Intrinsics.areEqual(this.deviceData, authenticationRequestParameters.deviceData) && Intrinsics.areEqual(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && Intrinsics.areEqual(this.sdkAppId, authenticationRequestParameters.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, authenticationRequestParameters.messageVersion);
    }

    public int hashCode() {
        return (((((((((this.deviceData.hashCode() * 31) + this.sdkTransactionId.hashCode()) * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode();
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.deviceData + ", sdkTransactionId=" + this.sdkTransactionId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.deviceData);
        this.sdkTransactionId.writeToParcel(parcel, flags);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
    }

    public AuthenticationRequestParameters(String deviceData, SdkTransactionId sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.deviceData = deviceData;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
    }

    public final String getDeviceData() {
        return this.deviceData;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }
}
