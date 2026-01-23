package com.robinhood.android.investFlow.split;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowManifest;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitArgs.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "totalAmount", "Lcom/robinhood/models/util/Money;", "manifest", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "isCrypto", "", "allocationStrategy", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;ZLcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "getAccountNumber", "()Ljava/lang/String;", "getTotalAmount", "()Lcom/robinhood/models/util/Money;", "getManifest", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "()Z", "getAllocationStrategy", "()Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSplitArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowSplitArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final AllocationStrategy allocationStrategy;
    private final boolean isCrypto;
    private final InvestFlowManifest manifest;
    private final InvestFlowFrequency selectedFrequency;
    private final Money totalAmount;

    /* compiled from: InvestFlowSplitArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowSplitArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSplitArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestFlowSplitArgs(parcel.readString(), (Money) parcel.readParcelable(InvestFlowSplitArgs.class.getClassLoader()), (InvestFlowManifest) parcel.readParcelable(InvestFlowSplitArgs.class.getClassLoader()), parcel.readInt() != 0, (AllocationStrategy) parcel.readParcelable(InvestFlowSplitArgs.class.getClassLoader()), (InvestFlowFrequency) parcel.readParcelable(InvestFlowSplitArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowSplitArgs[] newArray(int i) {
            return new InvestFlowSplitArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowSplitArgs copy$default(InvestFlowSplitArgs investFlowSplitArgs, String str, Money money, InvestFlowManifest investFlowManifest, boolean z, AllocationStrategy allocationStrategy, InvestFlowFrequency investFlowFrequency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investFlowSplitArgs.accountNumber;
        }
        if ((i & 2) != 0) {
            money = investFlowSplitArgs.totalAmount;
        }
        if ((i & 4) != 0) {
            investFlowManifest = investFlowSplitArgs.manifest;
        }
        if ((i & 8) != 0) {
            z = investFlowSplitArgs.isCrypto;
        }
        if ((i & 16) != 0) {
            allocationStrategy = investFlowSplitArgs.allocationStrategy;
        }
        if ((i & 32) != 0) {
            investFlowFrequency = investFlowSplitArgs.selectedFrequency;
        }
        AllocationStrategy allocationStrategy2 = allocationStrategy;
        InvestFlowFrequency investFlowFrequency2 = investFlowFrequency;
        return investFlowSplitArgs.copy(str, money, investFlowManifest, z, allocationStrategy2, investFlowFrequency2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final InvestFlowManifest getManifest() {
        return this.manifest;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component5, reason: from getter */
    public final AllocationStrategy getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /* renamed from: component6, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final InvestFlowSplitArgs copy(String accountNumber, Money totalAmount, InvestFlowManifest manifest, boolean isCrypto, AllocationStrategy allocationStrategy, InvestFlowFrequency selectedFrequency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(allocationStrategy, "allocationStrategy");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        return new InvestFlowSplitArgs(accountNumber, totalAmount, manifest, isCrypto, allocationStrategy, selectedFrequency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSplitArgs)) {
            return false;
        }
        InvestFlowSplitArgs investFlowSplitArgs = (InvestFlowSplitArgs) other;
        return Intrinsics.areEqual(this.accountNumber, investFlowSplitArgs.accountNumber) && Intrinsics.areEqual(this.totalAmount, investFlowSplitArgs.totalAmount) && Intrinsics.areEqual(this.manifest, investFlowSplitArgs.manifest) && this.isCrypto == investFlowSplitArgs.isCrypto && Intrinsics.areEqual(this.allocationStrategy, investFlowSplitArgs.allocationStrategy) && Intrinsics.areEqual(this.selectedFrequency, investFlowSplitArgs.selectedFrequency);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        Money money = this.totalAmount;
        return ((((((((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.manifest.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.allocationStrategy.hashCode()) * 31) + this.selectedFrequency.hashCode();
    }

    public String toString() {
        return "InvestFlowSplitArgs(accountNumber=" + this.accountNumber + ", totalAmount=" + this.totalAmount + ", manifest=" + this.manifest + ", isCrypto=" + this.isCrypto + ", allocationStrategy=" + this.allocationStrategy + ", selectedFrequency=" + this.selectedFrequency + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.totalAmount, flags);
        dest.writeParcelable(this.manifest, flags);
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeParcelable(this.allocationStrategy, flags);
        dest.writeParcelable(this.selectedFrequency, flags);
    }

    public InvestFlowSplitArgs(String accountNumber, Money money, InvestFlowManifest manifest, boolean z, AllocationStrategy allocationStrategy, InvestFlowFrequency selectedFrequency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(allocationStrategy, "allocationStrategy");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.accountNumber = accountNumber;
        this.totalAmount = money;
        this.manifest = manifest;
        this.isCrypto = z;
        this.allocationStrategy = allocationStrategy;
        this.selectedFrequency = selectedFrequency;
    }

    public /* synthetic */ InvestFlowSplitArgs(String str, Money money, InvestFlowManifest investFlowManifest, boolean z, AllocationStrategy allocationStrategy, InvestFlowFrequency investFlowFrequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, money, investFlowManifest, (i & 8) != 0 ? false : z, allocationStrategy, investFlowFrequency);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final InvestFlowManifest getManifest() {
        return this.manifest;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final AllocationStrategy getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }
}
