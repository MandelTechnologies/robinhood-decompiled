package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportNfcReaderConfig.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b2\u0010\u001d¨\u00063"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "Landroid/os/Parcelable;", "", "nfcScanPrompt", "authenticating", "reading", "cancelNfcScan", "nfcScanSuccess", "enablePassportNfcText", "enablePassportNfcConfirmButtonText", "enablePassportNfcCancelButtonText", "connectionLostText", "connectionLostConfirmButtonText", "authenticationErrorText", "authenticationErrorConfirmButtonText", "genericErrorText", "genericErrorConfirmButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNfcScanPrompt", "getAuthenticating", "getReading", "getCancelNfcScan", "getNfcScanSuccess", "getEnablePassportNfcText", "getEnablePassportNfcConfirmButtonText", "getEnablePassportNfcCancelButtonText", "getConnectionLostText", "getConnectionLostConfirmButtonText", "getAuthenticationErrorText", "getAuthenticationErrorConfirmButtonText", "getGenericErrorText", "getGenericErrorConfirmButtonText", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PassportNfcStrings implements Parcelable {
    public static final Parcelable.Creator<PassportNfcStrings> CREATOR = new Creator();
    private final String authenticating;
    private final String authenticationErrorConfirmButtonText;
    private final String authenticationErrorText;
    private final String cancelNfcScan;
    private final String connectionLostConfirmButtonText;
    private final String connectionLostText;
    private final String enablePassportNfcCancelButtonText;
    private final String enablePassportNfcConfirmButtonText;
    private final String enablePassportNfcText;
    private final String genericErrorConfirmButtonText;
    private final String genericErrorText;
    private final String nfcScanPrompt;
    private final String nfcScanSuccess;
    private final String reading;

    /* compiled from: PassportNfcReaderConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportNfcStrings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportNfcStrings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PassportNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportNfcStrings[] newArray(int i) {
            return new PassportNfcStrings[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcStrings)) {
            return false;
        }
        PassportNfcStrings passportNfcStrings = (PassportNfcStrings) other;
        return Intrinsics.areEqual(this.nfcScanPrompt, passportNfcStrings.nfcScanPrompt) && Intrinsics.areEqual(this.authenticating, passportNfcStrings.authenticating) && Intrinsics.areEqual(this.reading, passportNfcStrings.reading) && Intrinsics.areEqual(this.cancelNfcScan, passportNfcStrings.cancelNfcScan) && Intrinsics.areEqual(this.nfcScanSuccess, passportNfcStrings.nfcScanSuccess) && Intrinsics.areEqual(this.enablePassportNfcText, passportNfcStrings.enablePassportNfcText) && Intrinsics.areEqual(this.enablePassportNfcConfirmButtonText, passportNfcStrings.enablePassportNfcConfirmButtonText) && Intrinsics.areEqual(this.enablePassportNfcCancelButtonText, passportNfcStrings.enablePassportNfcCancelButtonText) && Intrinsics.areEqual(this.connectionLostText, passportNfcStrings.connectionLostText) && Intrinsics.areEqual(this.connectionLostConfirmButtonText, passportNfcStrings.connectionLostConfirmButtonText) && Intrinsics.areEqual(this.authenticationErrorText, passportNfcStrings.authenticationErrorText) && Intrinsics.areEqual(this.authenticationErrorConfirmButtonText, passportNfcStrings.authenticationErrorConfirmButtonText) && Intrinsics.areEqual(this.genericErrorText, passportNfcStrings.genericErrorText) && Intrinsics.areEqual(this.genericErrorConfirmButtonText, passportNfcStrings.genericErrorConfirmButtonText);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.nfcScanPrompt.hashCode() * 31) + this.authenticating.hashCode()) * 31) + this.reading.hashCode()) * 31) + this.cancelNfcScan.hashCode()) * 31) + this.nfcScanSuccess.hashCode()) * 31) + this.enablePassportNfcText.hashCode()) * 31) + this.enablePassportNfcConfirmButtonText.hashCode()) * 31) + this.enablePassportNfcCancelButtonText.hashCode()) * 31) + this.connectionLostText.hashCode()) * 31) + this.connectionLostConfirmButtonText.hashCode()) * 31) + this.authenticationErrorText.hashCode()) * 31) + this.authenticationErrorConfirmButtonText.hashCode()) * 31) + this.genericErrorText.hashCode()) * 31) + this.genericErrorConfirmButtonText.hashCode();
    }

    public String toString() {
        return "PassportNfcStrings(nfcScanPrompt=" + this.nfcScanPrompt + ", authenticating=" + this.authenticating + ", reading=" + this.reading + ", cancelNfcScan=" + this.cancelNfcScan + ", nfcScanSuccess=" + this.nfcScanSuccess + ", enablePassportNfcText=" + this.enablePassportNfcText + ", enablePassportNfcConfirmButtonText=" + this.enablePassportNfcConfirmButtonText + ", enablePassportNfcCancelButtonText=" + this.enablePassportNfcCancelButtonText + ", connectionLostText=" + this.connectionLostText + ", connectionLostConfirmButtonText=" + this.connectionLostConfirmButtonText + ", authenticationErrorText=" + this.authenticationErrorText + ", authenticationErrorConfirmButtonText=" + this.authenticationErrorConfirmButtonText + ", genericErrorText=" + this.genericErrorText + ", genericErrorConfirmButtonText=" + this.genericErrorConfirmButtonText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.nfcScanPrompt);
        dest.writeString(this.authenticating);
        dest.writeString(this.reading);
        dest.writeString(this.cancelNfcScan);
        dest.writeString(this.nfcScanSuccess);
        dest.writeString(this.enablePassportNfcText);
        dest.writeString(this.enablePassportNfcConfirmButtonText);
        dest.writeString(this.enablePassportNfcCancelButtonText);
        dest.writeString(this.connectionLostText);
        dest.writeString(this.connectionLostConfirmButtonText);
        dest.writeString(this.authenticationErrorText);
        dest.writeString(this.authenticationErrorConfirmButtonText);
        dest.writeString(this.genericErrorText);
        dest.writeString(this.genericErrorConfirmButtonText);
    }

    public PassportNfcStrings(String nfcScanPrompt, String authenticating, String reading, String cancelNfcScan, String nfcScanSuccess, String enablePassportNfcText, String enablePassportNfcConfirmButtonText, String enablePassportNfcCancelButtonText, String connectionLostText, String connectionLostConfirmButtonText, String authenticationErrorText, String authenticationErrorConfirmButtonText, String genericErrorText, String genericErrorConfirmButtonText) {
        Intrinsics.checkNotNullParameter(nfcScanPrompt, "nfcScanPrompt");
        Intrinsics.checkNotNullParameter(authenticating, "authenticating");
        Intrinsics.checkNotNullParameter(reading, "reading");
        Intrinsics.checkNotNullParameter(cancelNfcScan, "cancelNfcScan");
        Intrinsics.checkNotNullParameter(nfcScanSuccess, "nfcScanSuccess");
        Intrinsics.checkNotNullParameter(enablePassportNfcText, "enablePassportNfcText");
        Intrinsics.checkNotNullParameter(enablePassportNfcConfirmButtonText, "enablePassportNfcConfirmButtonText");
        Intrinsics.checkNotNullParameter(enablePassportNfcCancelButtonText, "enablePassportNfcCancelButtonText");
        Intrinsics.checkNotNullParameter(connectionLostText, "connectionLostText");
        Intrinsics.checkNotNullParameter(connectionLostConfirmButtonText, "connectionLostConfirmButtonText");
        Intrinsics.checkNotNullParameter(authenticationErrorText, "authenticationErrorText");
        Intrinsics.checkNotNullParameter(authenticationErrorConfirmButtonText, "authenticationErrorConfirmButtonText");
        Intrinsics.checkNotNullParameter(genericErrorText, "genericErrorText");
        Intrinsics.checkNotNullParameter(genericErrorConfirmButtonText, "genericErrorConfirmButtonText");
        this.nfcScanPrompt = nfcScanPrompt;
        this.authenticating = authenticating;
        this.reading = reading;
        this.cancelNfcScan = cancelNfcScan;
        this.nfcScanSuccess = nfcScanSuccess;
        this.enablePassportNfcText = enablePassportNfcText;
        this.enablePassportNfcConfirmButtonText = enablePassportNfcConfirmButtonText;
        this.enablePassportNfcCancelButtonText = enablePassportNfcCancelButtonText;
        this.connectionLostText = connectionLostText;
        this.connectionLostConfirmButtonText = connectionLostConfirmButtonText;
        this.authenticationErrorText = authenticationErrorText;
        this.authenticationErrorConfirmButtonText = authenticationErrorConfirmButtonText;
        this.genericErrorText = genericErrorText;
        this.genericErrorConfirmButtonText = genericErrorConfirmButtonText;
    }
}
