package com.robinhood.android.account.accountfunding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFundingOptionsFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey;", "Landroid/os/Parcelable;", "<init>", "()V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "transferFundsEntryPoint", "getTransferFundsEntryPoint", "source", "getSource", "location", "getLocation", "FullScreen", "BottomSheet", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$BottomSheet;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$FullScreen;", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsKey, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AccountFundingOptionsFragmentKeys implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ AccountFundingOptionsFragmentKeys(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getAccountNumber();

    public abstract String getLocation();

    public abstract String getSource();

    public abstract String getTransferFundsEntryPoint();

    private AccountFundingOptionsFragmentKeys() {
    }

    /* compiled from: AccountFundingOptionsFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$FullScreen;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "transferFundsEntryPoint", "location", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getTransferFundsEntryPoint", "getLocation", "getSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsKey$FullScreen, reason: from toString */
    public static final /* data */ class FullScreen extends AccountFundingOptionsFragmentKeys implements FragmentKey {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FullScreen> CREATOR = new Creator();
        private final String accountNumber;
        private final String location;
        private final String source;
        private final String transferFundsEntryPoint;

        /* compiled from: AccountFundingOptionsFragmentKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsKey$FullScreen$Creator */
        public static final class Creator implements Parcelable.Creator<FullScreen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullScreen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullScreen[] newArray(int i) {
                return new FullScreen[i];
            }
        }

        public static /* synthetic */ FullScreen copy$default(FullScreen fullScreen, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fullScreen.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = fullScreen.transferFundsEntryPoint;
            }
            if ((i & 4) != 0) {
                str3 = fullScreen.location;
            }
            if ((i & 8) != 0) {
                str4 = fullScreen.source;
            }
            return fullScreen.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransferFundsEntryPoint() {
            return this.transferFundsEntryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final FullScreen copy(String accountNumber, String transferFundsEntryPoint, String location, String source) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new FullScreen(accountNumber, transferFundsEntryPoint, location, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullScreen)) {
                return false;
            }
            FullScreen fullScreen = (FullScreen) other;
            return Intrinsics.areEqual(this.accountNumber, fullScreen.accountNumber) && Intrinsics.areEqual(this.transferFundsEntryPoint, fullScreen.transferFundsEntryPoint) && Intrinsics.areEqual(this.location, fullScreen.location) && Intrinsics.areEqual(this.source, fullScreen.source);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            String str = this.transferFundsEntryPoint;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.location;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreen(accountNumber=" + this.accountNumber + ", transferFundsEntryPoint=" + this.transferFundsEntryPoint + ", location=" + this.location + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.transferFundsEntryPoint);
            dest.writeString(this.location);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getTransferFundsEntryPoint() {
            return this.transferFundsEntryPoint;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getLocation() {
            return this.location;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullScreen(String accountNumber, String str, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.transferFundsEntryPoint = str;
            this.location = str2;
            this.source = str3;
        }
    }

    /* compiled from: AccountFundingOptionsFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$BottomSheet;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "accountNumber", "", "transferFundsEntryPoint", "location", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getTransferFundsEntryPoint", "getLocation", "getSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsKey$BottomSheet, reason: from toString */
    public static final /* data */ class BottomSheet extends AccountFundingOptionsFragmentKeys implements DialogFragmentKey {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BottomSheet> CREATOR = new Creator();
        private final String accountNumber;
        private final String location;
        private final String source;
        private final String transferFundsEntryPoint;

        /* compiled from: AccountFundingOptionsFragmentKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsKey$BottomSheet$Creator */
        public static final class Creator implements Parcelable.Creator<BottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bottomSheet.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = bottomSheet.transferFundsEntryPoint;
            }
            if ((i & 4) != 0) {
                str3 = bottomSheet.location;
            }
            if ((i & 8) != 0) {
                str4 = bottomSheet.source;
            }
            return bottomSheet.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransferFundsEntryPoint() {
            return this.transferFundsEntryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final BottomSheet copy(String accountNumber, String transferFundsEntryPoint, String location, String source) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new BottomSheet(accountNumber, transferFundsEntryPoint, location, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) other;
            return Intrinsics.areEqual(this.accountNumber, bottomSheet.accountNumber) && Intrinsics.areEqual(this.transferFundsEntryPoint, bottomSheet.transferFundsEntryPoint) && Intrinsics.areEqual(this.location, bottomSheet.location) && Intrinsics.areEqual(this.source, bottomSheet.source);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            String str = this.transferFundsEntryPoint;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.location;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BottomSheet(accountNumber=" + this.accountNumber + ", transferFundsEntryPoint=" + this.transferFundsEntryPoint + ", location=" + this.location + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.transferFundsEntryPoint);
            dest.writeString(this.location);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getTransferFundsEntryPoint() {
            return this.transferFundsEntryPoint;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getLocation() {
            return this.location;
        }

        @Override // com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys
        public String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomSheet(String accountNumber, String str, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.transferFundsEntryPoint = str;
            this.location = str2;
            this.source = str3;
        }
    }
}
