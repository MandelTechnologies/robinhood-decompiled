package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboarding.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;", "Landroid/os/Parcelable;", "AccountNumber", "AccountType", "Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo$AccountNumber;", "Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo$AccountType;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.contracts.OptionOnboardingAccountInfo, reason: use source file name */
/* loaded from: classes11.dex */
public interface OptionOnboarding2 extends Parcelable {

    /* compiled from: OptionOnboarding.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo$AccountNumber;", "Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.contracts.OptionOnboardingAccountInfo$AccountNumber, reason: from toString */
    public static final /* data */ class AccountNumber implements OptionOnboarding2 {
        public static final Parcelable.Creator<AccountNumber> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: OptionOnboarding.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.contracts.OptionOnboardingAccountInfo$AccountNumber$Creator */
        public static final class Creator implements Parcelable.Creator<AccountNumber> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountNumber createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountNumber(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountNumber[] newArray(int i) {
                return new AccountNumber[i];
            }
        }

        public static /* synthetic */ AccountNumber copy$default(AccountNumber accountNumber, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountNumber.accountNumber;
            }
            return accountNumber.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountNumber copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AccountNumber(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountNumber) && Intrinsics.areEqual(this.accountNumber, ((AccountNumber) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "AccountNumber(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public AccountNumber(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionOnboarding.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo$AccountType;", "Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.contracts.OptionOnboardingAccountInfo$AccountType, reason: from toString */
    public static final /* data */ class AccountType implements OptionOnboarding2 {
        public static final Parcelable.Creator<AccountType> CREATOR = new Creator();
        private final BrokerageAccountType accountType;

        /* compiled from: OptionOnboarding.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.contracts.OptionOnboardingAccountInfo$AccountType$Creator */
        public static final class Creator implements Parcelable.Creator<AccountType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountType(BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountType[] newArray(int i) {
                return new AccountType[i];
            }
        }

        public static /* synthetic */ AccountType copy$default(AccountType accountType, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = accountType.accountType;
            }
            return accountType.copy(brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final AccountType copy(BrokerageAccountType accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new AccountType(accountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountType) && this.accountType == ((AccountType) other).accountType;
        }

        public int hashCode() {
            return this.accountType.hashCode();
        }

        public String toString() {
            return "AccountType(accountType=" + this.accountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
        }

        public AccountType(BrokerageAccountType accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountType = accountType;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }
    }
}
