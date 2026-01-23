package com.robinhood.android.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsMfaEnrollment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/PromptsMfaEnrollment;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "isFromCryptoTransfersEnrollment", "", "loggingIdentifier", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PromptsMfaEnrollment implements FragmentKey {
    public static final Parcelable.Creator<PromptsMfaEnrollment> CREATOR = new Creator();
    private final boolean isFromCryptoTransfersEnrollment;
    private final String loggingIdentifier;

    /* compiled from: PromptsMfaEnrollment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<PromptsMfaEnrollment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsMfaEnrollment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromptsMfaEnrollment(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsMfaEnrollment[] newArray(int i) {
            return new PromptsMfaEnrollment[i];
        }
    }

    public static /* synthetic */ PromptsMfaEnrollment copy$default(PromptsMfaEnrollment promptsMfaEnrollment, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = promptsMfaEnrollment.isFromCryptoTransfersEnrollment;
        }
        if ((i & 2) != 0) {
            str = promptsMfaEnrollment.loggingIdentifier;
        }
        return promptsMfaEnrollment.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFromCryptoTransfersEnrollment() {
        return this.isFromCryptoTransfersEnrollment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final PromptsMfaEnrollment copy(boolean isFromCryptoTransfersEnrollment, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new PromptsMfaEnrollment(isFromCryptoTransfersEnrollment, loggingIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptsMfaEnrollment)) {
            return false;
        }
        PromptsMfaEnrollment promptsMfaEnrollment = (PromptsMfaEnrollment) other;
        return this.isFromCryptoTransfersEnrollment == promptsMfaEnrollment.isFromCryptoTransfersEnrollment && Intrinsics.areEqual(this.loggingIdentifier, promptsMfaEnrollment.loggingIdentifier);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isFromCryptoTransfersEnrollment) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "PromptsMfaEnrollment(isFromCryptoTransfersEnrollment=" + this.isFromCryptoTransfersEnrollment + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isFromCryptoTransfersEnrollment ? 1 : 0);
        dest.writeString(this.loggingIdentifier);
    }

    public PromptsMfaEnrollment(boolean z, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.isFromCryptoTransfersEnrollment = z;
        this.loggingIdentifier = loggingIdentifier;
    }

    public /* synthetic */ PromptsMfaEnrollment(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str);
    }

    public final boolean isFromCryptoTransfersEnrollment() {
        return this.isFromCryptoTransfersEnrollment;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
