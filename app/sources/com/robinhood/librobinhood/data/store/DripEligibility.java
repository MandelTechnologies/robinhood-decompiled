package com.robinhood.librobinhood.data.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripEligibility.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripEligibility;", "", "Ineligible", "Eligible", "AlreadyOnboarded", "Lcom/robinhood/librobinhood/data/store/DripEligibility$AlreadyOnboarded;", "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "Lcom/robinhood/librobinhood/data/store/DripEligibility$Ineligible;", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface DripEligibility {

    /* compiled from: DripEligibility.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripEligibility$Ineligible;", "Lcom/robinhood/librobinhood/data/store/DripEligibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements DripEligibility {
        public static final Ineligible INSTANCE = new Ineligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ineligible);
        }

        public int hashCode() {
            return 41776619;
        }

        public String toString() {
            return "Ineligible";
        }

        private Ineligible() {
        }
    }

    /* compiled from: DripEligibility.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "Lcom/robinhood/librobinhood/data/store/DripEligibility;", "Landroid/os/Parcelable;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "isOriginalAccount", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Eligible implements DripEligibility, Parcelable {
        public static final Parcelable.Creator<Eligible> CREATOR = new Creator();
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;
        private final boolean isOriginalAccount;

        /* compiled from: DripEligibility.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Eligible> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Eligible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Eligible(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Eligible[] newArray(int i) {
                return new Eligible[i];
            }
        }

        public static /* synthetic */ Eligible copy$default(Eligible eligible, String str, BrokerageAccountType brokerageAccountType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eligible.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = eligible.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                z = eligible.isOriginalAccount;
            }
            return eligible.copy(str, brokerageAccountType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsOriginalAccount() {
            return this.isOriginalAccount;
        }

        public final Eligible copy(String accountNumber, BrokerageAccountType brokerageAccountType, boolean isOriginalAccount) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new Eligible(accountNumber, brokerageAccountType, isOriginalAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) other;
            return Intrinsics.areEqual(this.accountNumber, eligible.accountNumber) && this.brokerageAccountType == eligible.brokerageAccountType && this.isOriginalAccount == eligible.isOriginalAccount;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + Boolean.hashCode(this.isOriginalAccount);
        }

        public String toString() {
            return "Eligible(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", isOriginalAccount=" + this.isOriginalAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeInt(this.isOriginalAccount ? 1 : 0);
        }

        public Eligible(String accountNumber, BrokerageAccountType brokerageAccountType, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
            this.isOriginalAccount = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final boolean isOriginalAccount() {
            return this.isOriginalAccount;
        }
    }

    /* compiled from: DripEligibility.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripEligibility$AlreadyOnboarded;", "Lcom/robinhood/librobinhood/data/store/DripEligibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyOnboarded implements DripEligibility {
        public static final AlreadyOnboarded INSTANCE = new AlreadyOnboarded();

        public boolean equals(Object other) {
            return this == other || (other instanceof AlreadyOnboarded);
        }

        public int hashCode() {
            return -1495283075;
        }

        public String toString() {
            return "AlreadyOnboarded";
        }

        private AlreadyOnboarded() {
        }
    }
}
