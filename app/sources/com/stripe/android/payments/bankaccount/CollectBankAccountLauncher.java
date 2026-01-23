package com.stripe.android.payments.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountLauncher.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "Landroid/os/Parcelable;", "InstantDebits", "USBankAccount", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration, reason: use source file name */
/* loaded from: classes22.dex */
public interface CollectBankAccountLauncher extends Parcelable {

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "", "name", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getEmail", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration$USBankAccount, reason: from toString */
    public static final /* data */ class USBankAccount implements Parcelable, CollectBankAccountLauncher {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        private final String email;
        private final String name;

        /* compiled from: CollectBankAccountLauncher.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration$USBankAccount$Creator */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
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
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return Intrinsics.areEqual(this.name, uSBankAccount.name) && Intrinsics.areEqual(this.email, uSBankAccount.email);
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.email;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "USBankAccount(name=" + this.name + ", email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.email);
        }

        public USBankAccount(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.email = str;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "", "email", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEmail", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration$InstantDebits, reason: from toString */
    public static final /* data */ class InstantDebits implements Parcelable, CollectBankAccountLauncher {
        public static final Parcelable.Creator<InstantDebits> CREATOR = new Creator();
        private final String email;

        /* compiled from: CollectBankAccountLauncher.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration$InstantDebits$Creator */
        public static final class Creator implements Parcelable.Creator<InstantDebits> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebits createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstantDebits(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebits[] newArray(int i) {
                return new InstantDebits[i];
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
            return (other instanceof InstantDebits) && Intrinsics.areEqual(this.email, ((InstantDebits) other).email);
        }

        public int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InstantDebits(email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.email);
        }

        public InstantDebits(String str) {
            this.email = str;
        }

        public final String getEmail() {
            return this.email;
        }
    }
}
