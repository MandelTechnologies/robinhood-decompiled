package com.robinhood.android.isa.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferFundsKey.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Direct", "Deeplink", "Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey$Deeplink;", "Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey$Direct;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface IsaTransferFundsKey extends Parcelable, IntentKey {

    /* compiled from: IsaTransferFundsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(IsaTransferFundsKey isaTransferFundsKey) {
            return IntentKey.DefaultImpls.getNavigationType(isaTransferFundsKey);
        }
    }

    /* compiled from: IsaTransferFundsKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey$Direct;", "Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Direct implements IsaTransferFundsKey {
        public static final Parcelable.Creator<Direct> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: IsaTransferFundsKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Direct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Direct createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Direct(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Direct[] newArray(int i) {
                return new Direct[i];
            }
        }

        public static /* synthetic */ Direct copy$default(Direct direct, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = direct.accountNumber;
            }
            return direct.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Direct copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Direct(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Direct) && Intrinsics.areEqual(this.accountNumber, ((Direct) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Direct(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Direct(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: IsaTransferFundsKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey$Deeplink;", "Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink implements IsaTransferFundsKey {
        public static final Parcelable.Creator<Deeplink> CREATOR = new Creator();
        private final Uri uri;

        /* compiled from: IsaTransferFundsKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Deeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Deeplink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink((Uri) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Deeplink[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = deeplink.uri;
            }
            return deeplink.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final Deeplink copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Deeplink(uri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && Intrinsics.areEqual(this.uri, ((Deeplink) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "Deeplink(uri=" + this.uri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uri, flags);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Deeplink(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }
}
