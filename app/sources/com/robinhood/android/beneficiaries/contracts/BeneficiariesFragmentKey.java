package com.robinhood.android.beneficiaries.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiariesFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "SelectAccount", "List", "Detail", "UpdateBeneficiary", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$Detail;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$List;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$SelectAccount;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$UpdateBeneficiary;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class BeneficiariesFragmentKey implements FragmentKey {
    public /* synthetic */ BeneficiariesFragmentKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BeneficiariesFragmentKey() {
    }

    /* compiled from: BeneficiariesFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$SelectAccount;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SelectAccount extends BeneficiariesFragmentKey {
        public static final SelectAccount INSTANCE = new SelectAccount();
        public static final Parcelable.Creator<SelectAccount> CREATOR = new Creator();

        /* compiled from: BeneficiariesFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SelectAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectAccount.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectAccount[] newArray(int i) {
                return new SelectAccount[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SelectAccount() {
            super(null);
        }
    }

    /* compiled from: BeneficiariesFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$List;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class List extends BeneficiariesFragmentKey {
        public static final Parcelable.Creator<List> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: BeneficiariesFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<List> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final List createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new List(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final List[] newArray(int i) {
                return new List[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public List(String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }
    }

    /* compiled from: BeneficiariesFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$Detail;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Detail extends BeneficiariesFragmentKey {
        public static final Parcelable.Creator<Detail> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID beneficiaryId;

        /* compiled from: BeneficiariesFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Detail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Detail(parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail[] newArray(int i) {
                return new Detail[i];
            }
        }

        public static /* synthetic */ Detail copy$default(Detail detail, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detail.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = detail.beneficiaryId;
            }
            return detail.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        public final Detail copy(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            return new Detail(accountNumber, beneficiaryId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) other;
            return Intrinsics.areEqual(this.accountNumber, detail.accountNumber) && Intrinsics.areEqual(this.beneficiaryId, detail.beneficiaryId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.beneficiaryId.hashCode();
        }

        public String toString() {
            return "Detail(accountNumber=" + this.accountNumber + ", beneficiaryId=" + this.beneficiaryId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.beneficiaryId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Detail(String accountNumber, UUID beneficiaryId) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.accountNumber = accountNumber;
            this.beneficiaryId = beneficiaryId;
        }
    }

    /* compiled from: BeneficiariesFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$UpdateBeneficiary;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateBeneficiary extends BeneficiariesFragmentKey {
        public static final Parcelable.Creator<UpdateBeneficiary> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID beneficiaryId;

        /* compiled from: BeneficiariesFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<UpdateBeneficiary> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateBeneficiary createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateBeneficiary(parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateBeneficiary[] newArray(int i) {
                return new UpdateBeneficiary[i];
            }
        }

        public static /* synthetic */ UpdateBeneficiary copy$default(UpdateBeneficiary updateBeneficiary, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateBeneficiary.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = updateBeneficiary.beneficiaryId;
            }
            return updateBeneficiary.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        public final UpdateBeneficiary copy(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new UpdateBeneficiary(accountNumber, beneficiaryId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateBeneficiary)) {
                return false;
            }
            UpdateBeneficiary updateBeneficiary = (UpdateBeneficiary) other;
            return Intrinsics.areEqual(this.accountNumber, updateBeneficiary.accountNumber) && Intrinsics.areEqual(this.beneficiaryId, updateBeneficiary.beneficiaryId);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            UUID uuid = this.beneficiaryId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "UpdateBeneficiary(accountNumber=" + this.accountNumber + ", beneficiaryId=" + this.beneficiaryId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.beneficiaryId);
        }

        public /* synthetic */ UpdateBeneficiary(String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : uuid);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateBeneficiary(String accountNumber, UUID uuid) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.beneficiaryId = uuid;
        }
    }
}
