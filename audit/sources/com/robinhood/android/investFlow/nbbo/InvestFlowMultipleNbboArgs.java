package com.robinhood.android.investFlow.nbbo;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowMultipleNbboArgs.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboArgs;", "Landroid/os/Parcelable;", "totalAmount", "Lcom/robinhood/models/util/Money;", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "isCrypto", "", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;ZLjava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getTotalAmount", "()Lcom/robinhood/models/util/Money;", "getAssetAllocations", "()Ljava/util/List;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowMultipleNbboArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowMultipleNbboArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final List<ApiAssetAllocation> assetAllocations;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean isCrypto;
    private final Money totalAmount;

    /* compiled from: InvestFlowMultipleNbboArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowMultipleNbboArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowMultipleNbboArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Money money = (Money) parcel.readParcelable(InvestFlowMultipleNbboArgs.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowMultipleNbboArgs.class.getClassLoader()));
            }
            return new InvestFlowMultipleNbboArgs(money, arrayList, parcel.readInt() != 0, parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowMultipleNbboArgs[] newArray(int i) {
            return new InvestFlowMultipleNbboArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowMultipleNbboArgs copy$default(InvestFlowMultipleNbboArgs investFlowMultipleNbboArgs, Money money, List list, boolean z, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            money = investFlowMultipleNbboArgs.totalAmount;
        }
        if ((i & 2) != 0) {
            list = investFlowMultipleNbboArgs.assetAllocations;
        }
        if ((i & 4) != 0) {
            z = investFlowMultipleNbboArgs.isCrypto;
        }
        if ((i & 8) != 0) {
            str = investFlowMultipleNbboArgs.accountNumber;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = investFlowMultipleNbboArgs.brokerageAccountType;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        boolean z2 = z;
        return investFlowMultipleNbboArgs.copy(money, list, z2, str, brokerageAccountType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final List<ApiAssetAllocation> component2() {
        return this.assetAllocations;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final InvestFlowMultipleNbboArgs copy(Money totalAmount, List<ApiAssetAllocation> assetAllocations, boolean isCrypto, String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new InvestFlowMultipleNbboArgs(totalAmount, assetAllocations, isCrypto, accountNumber, brokerageAccountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowMultipleNbboArgs)) {
            return false;
        }
        InvestFlowMultipleNbboArgs investFlowMultipleNbboArgs = (InvestFlowMultipleNbboArgs) other;
        return Intrinsics.areEqual(this.totalAmount, investFlowMultipleNbboArgs.totalAmount) && Intrinsics.areEqual(this.assetAllocations, investFlowMultipleNbboArgs.assetAllocations) && this.isCrypto == investFlowMultipleNbboArgs.isCrypto && Intrinsics.areEqual(this.accountNumber, investFlowMultipleNbboArgs.accountNumber) && this.brokerageAccountType == investFlowMultipleNbboArgs.brokerageAccountType;
    }

    public int hashCode() {
        return (((((((this.totalAmount.hashCode() * 31) + this.assetAllocations.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.accountNumber.hashCode()) * 31) + this.brokerageAccountType.hashCode();
    }

    public String toString() {
        return "InvestFlowMultipleNbboArgs(totalAmount=" + this.totalAmount + ", assetAllocations=" + this.assetAllocations + ", isCrypto=" + this.isCrypto + ", accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.totalAmount, flags);
        List<ApiAssetAllocation> list = this.assetAllocations;
        dest.writeInt(list.size());
        Iterator<ApiAssetAllocation> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeString(this.accountNumber);
        dest.writeString(this.brokerageAccountType.name());
    }

    public InvestFlowMultipleNbboArgs(Money totalAmount, List<ApiAssetAllocation> assetAllocations, boolean z, String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.totalAmount = totalAmount;
        this.assetAllocations = assetAllocations;
        this.isCrypto = z;
        this.accountNumber = accountNumber;
        this.brokerageAccountType = brokerageAccountType;
    }

    public /* synthetic */ InvestFlowMultipleNbboArgs(Money money, List list, boolean z, String str, BrokerageAccountType brokerageAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, list, (i & 4) != 0 ? false : z, str, brokerageAccountType);
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }
}
