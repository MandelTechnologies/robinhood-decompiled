package com.robinhood.android.investFlow.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowAmountArgs.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003JY\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010(\u001a\u00020\nJ\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0010HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountArgs;", "Landroid/os/Parcelable;", "instrumentIds", "", "Ljava/util/UUID;", "amount", "Lcom/robinhood/models/util/Money;", "minOrderAmount", "Ljava/math/BigDecimal;", "numberSelectedInstruments", "", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "isCrypto", "", "accountNumber", "", "<init>", "(Ljava/util/List;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;ILcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLjava/lang/String;)V", "getInstrumentIds", "()Ljava/util/List;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getMinOrderAmount", "()Ljava/math/BigDecimal;", "getNumberSelectedInstruments", "()I", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowAmountArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowAmountArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final Money amount;
    private final List<UUID> instrumentIds;
    private final boolean isCrypto;
    private final BigDecimal minOrderAmount;
    private final int numberSelectedInstruments;
    private final InvestFlowFrequency selectedFrequency;

    /* compiled from: InvestFlowAmountArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowAmountArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowAmountArgs createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readSerializable());
                }
                arrayList = arrayList2;
            }
            return new InvestFlowAmountArgs(arrayList, (Money) parcel.readParcelable(InvestFlowAmountArgs.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), parcel.readInt(), (InvestFlowFrequency) parcel.readParcelable(InvestFlowAmountArgs.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowAmountArgs[] newArray(int i) {
            return new InvestFlowAmountArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowAmountArgs copy$default(InvestFlowAmountArgs investFlowAmountArgs, List list, Money money, BigDecimal bigDecimal, int i, InvestFlowFrequency investFlowFrequency, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = investFlowAmountArgs.instrumentIds;
        }
        if ((i2 & 2) != 0) {
            money = investFlowAmountArgs.amount;
        }
        if ((i2 & 4) != 0) {
            bigDecimal = investFlowAmountArgs.minOrderAmount;
        }
        if ((i2 & 8) != 0) {
            i = investFlowAmountArgs.numberSelectedInstruments;
        }
        if ((i2 & 16) != 0) {
            investFlowFrequency = investFlowAmountArgs.selectedFrequency;
        }
        if ((i2 & 32) != 0) {
            z = investFlowAmountArgs.isCrypto;
        }
        if ((i2 & 64) != 0) {
            str = investFlowAmountArgs.accountNumber;
        }
        boolean z2 = z;
        String str2 = str;
        InvestFlowFrequency investFlowFrequency2 = investFlowFrequency;
        BigDecimal bigDecimal2 = bigDecimal;
        return investFlowAmountArgs.copy(list, money, bigDecimal2, i, investFlowFrequency2, z2, str2);
    }

    public final List<UUID> component1() {
        return this.instrumentIds;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNumberSelectedInstruments() {
        return this.numberSelectedInstruments;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowAmountArgs copy(List<UUID> instrumentIds, Money amount, BigDecimal minOrderAmount, int numberSelectedInstruments, InvestFlowFrequency selectedFrequency, boolean isCrypto, String accountNumber) {
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowAmountArgs(instrumentIds, amount, minOrderAmount, numberSelectedInstruments, selectedFrequency, isCrypto, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowAmountArgs)) {
            return false;
        }
        InvestFlowAmountArgs investFlowAmountArgs = (InvestFlowAmountArgs) other;
        return Intrinsics.areEqual(this.instrumentIds, investFlowAmountArgs.instrumentIds) && Intrinsics.areEqual(this.amount, investFlowAmountArgs.amount) && Intrinsics.areEqual(this.minOrderAmount, investFlowAmountArgs.minOrderAmount) && this.numberSelectedInstruments == investFlowAmountArgs.numberSelectedInstruments && Intrinsics.areEqual(this.selectedFrequency, investFlowAmountArgs.selectedFrequency) && this.isCrypto == investFlowAmountArgs.isCrypto && Intrinsics.areEqual(this.accountNumber, investFlowAmountArgs.accountNumber);
    }

    public int hashCode() {
        List<UUID> list = this.instrumentIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Money money = this.amount;
        return ((((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 31) + this.minOrderAmount.hashCode()) * 31) + Integer.hashCode(this.numberSelectedInstruments)) * 31) + this.selectedFrequency.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "InvestFlowAmountArgs(instrumentIds=" + this.instrumentIds + ", amount=" + this.amount + ", minOrderAmount=" + this.minOrderAmount + ", numberSelectedInstruments=" + this.numberSelectedInstruments + ", selectedFrequency=" + this.selectedFrequency + ", isCrypto=" + this.isCrypto + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UUID> list = this.instrumentIds;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }
        dest.writeParcelable(this.amount, flags);
        dest.writeSerializable(this.minOrderAmount);
        dest.writeInt(this.numberSelectedInstruments);
        dest.writeParcelable(this.selectedFrequency, flags);
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeString(this.accountNumber);
    }

    public InvestFlowAmountArgs(List<UUID> list, Money money, BigDecimal minOrderAmount, int i, InvestFlowFrequency selectedFrequency, boolean z, String accountNumber) {
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.instrumentIds = list;
        this.amount = money;
        this.minOrderAmount = minOrderAmount;
        this.numberSelectedInstruments = i;
        this.selectedFrequency = selectedFrequency;
        this.isCrypto = z;
        this.accountNumber = accountNumber;
    }

    public /* synthetic */ InvestFlowAmountArgs(List list, Money money, BigDecimal bigDecimal, int i, InvestFlowFrequency investFlowFrequency, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? null : money, bigDecimal, i, investFlowFrequency, (i2 & 32) != 0 ? false : z, str);
    }

    public final List<UUID> getInstrumentIds() {
        return this.instrumentIds;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public final int getNumberSelectedInstruments() {
        return this.numberSelectedInstruments;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
