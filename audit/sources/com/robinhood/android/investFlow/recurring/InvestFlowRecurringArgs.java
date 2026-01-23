package com.robinhood.android.investFlow.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowRecurringArgs.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J~\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u001a\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b\u0003\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bC\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010-R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bH\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b\u0013\u0010 ¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringArgs;", "Landroid/os/Parcelable;", "", "isCrypto", "Lcom/robinhood/models/util/Money;", "totalAmount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "primaryPaymentMethod", "backupPaymentMethod", "j$/time/LocalDate", "startDate", "", "accountNumber", "showPaymentMethodAnnotation", "isRecurringUpsell", "<init>", "(ZLcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Ljava/util/List;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lj$/time/LocalDate;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Lcom/robinhood/models/util/Money;", "component3", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component4", "()Ljava/util/List;", "component5", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "component6", "component7", "()Lj$/time/LocalDate;", "component8", "()Ljava/lang/String;", "component9", "component10", "copy", "(ZLcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Ljava/util/List;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lj$/time/LocalDate;Ljava/lang/String;ZZ)Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringArgs;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/robinhood/models/util/Money;", "getTotalAmount", "setTotalAmount", "(Lcom/robinhood/models/util/Money;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Ljava/util/List;", "getAssetAllocations", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getPrimaryPaymentMethod", "getBackupPaymentMethod", "Lj$/time/LocalDate;", "getStartDate", "Ljava/lang/String;", "getAccountNumber", "getShowPaymentMethodAnnotation", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowRecurringArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowRecurringArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final List<ApiAssetAllocation> assetAllocations;
    private final InvestFlowPaymentMethod backupPaymentMethod;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final boolean isCrypto;
    private final boolean isRecurringUpsell;
    private final InvestFlowPaymentMethod primaryPaymentMethod;
    private final boolean showPaymentMethodAnnotation;
    private final LocalDate startDate;
    private Money totalAmount;

    /* compiled from: InvestFlowRecurringArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowRecurringArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowRecurringArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            Money money = (Money) parcel.readParcelable(InvestFlowRecurringArgs.class.getClassLoader());
            ApiInvestmentSchedule.Frequency frequencyValueOf = ApiInvestmentSchedule.Frequency.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestFlowRecurringArgs.class.getClassLoader()));
            }
            return new InvestFlowRecurringArgs(z, money, frequencyValueOf, arrayList, (InvestFlowPaymentMethod) parcel.readParcelable(InvestFlowRecurringArgs.class.getClassLoader()), (InvestFlowPaymentMethod) parcel.readParcelable(InvestFlowRecurringArgs.class.getClassLoader()), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowRecurringArgs[] newArray(int i) {
            return new InvestFlowRecurringArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowRecurringArgs copy$default(InvestFlowRecurringArgs investFlowRecurringArgs, boolean z, Money money, ApiInvestmentSchedule.Frequency frequency, List list, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, LocalDate localDate, String str, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowRecurringArgs.isCrypto;
        }
        if ((i & 2) != 0) {
            money = investFlowRecurringArgs.totalAmount;
        }
        if ((i & 4) != 0) {
            frequency = investFlowRecurringArgs.frequency;
        }
        if ((i & 8) != 0) {
            list = investFlowRecurringArgs.assetAllocations;
        }
        if ((i & 16) != 0) {
            investFlowPaymentMethod = investFlowRecurringArgs.primaryPaymentMethod;
        }
        if ((i & 32) != 0) {
            investFlowPaymentMethod2 = investFlowRecurringArgs.backupPaymentMethod;
        }
        if ((i & 64) != 0) {
            localDate = investFlowRecurringArgs.startDate;
        }
        if ((i & 128) != 0) {
            str = investFlowRecurringArgs.accountNumber;
        }
        if ((i & 256) != 0) {
            z2 = investFlowRecurringArgs.showPaymentMethodAnnotation;
        }
        if ((i & 512) != 0) {
            z3 = investFlowRecurringArgs.isRecurringUpsell;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        LocalDate localDate2 = localDate;
        String str2 = str;
        InvestFlowPaymentMethod investFlowPaymentMethod3 = investFlowPaymentMethod;
        InvestFlowPaymentMethod investFlowPaymentMethod4 = investFlowPaymentMethod2;
        return investFlowRecurringArgs.copy(z, money, frequency, list, investFlowPaymentMethod3, investFlowPaymentMethod4, localDate2, str2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final List<ApiAssetAllocation> component4() {
        return this.assetAllocations;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    /* renamed from: component6, reason: from getter */
    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    /* renamed from: component7, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final InvestFlowRecurringArgs copy(boolean isCrypto, Money totalAmount, ApiInvestmentSchedule.Frequency frequency, List<ApiAssetAllocation> assetAllocations, InvestFlowPaymentMethod primaryPaymentMethod, InvestFlowPaymentMethod backupPaymentMethod, LocalDate startDate, String accountNumber, boolean showPaymentMethodAnnotation, boolean isRecurringUpsell) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(primaryPaymentMethod, "primaryPaymentMethod");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowRecurringArgs(isCrypto, totalAmount, frequency, assetAllocations, primaryPaymentMethod, backupPaymentMethod, startDate, accountNumber, showPaymentMethodAnnotation, isRecurringUpsell);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowRecurringArgs)) {
            return false;
        }
        InvestFlowRecurringArgs investFlowRecurringArgs = (InvestFlowRecurringArgs) other;
        return this.isCrypto == investFlowRecurringArgs.isCrypto && Intrinsics.areEqual(this.totalAmount, investFlowRecurringArgs.totalAmount) && this.frequency == investFlowRecurringArgs.frequency && Intrinsics.areEqual(this.assetAllocations, investFlowRecurringArgs.assetAllocations) && Intrinsics.areEqual(this.primaryPaymentMethod, investFlowRecurringArgs.primaryPaymentMethod) && Intrinsics.areEqual(this.backupPaymentMethod, investFlowRecurringArgs.backupPaymentMethod) && Intrinsics.areEqual(this.startDate, investFlowRecurringArgs.startDate) && Intrinsics.areEqual(this.accountNumber, investFlowRecurringArgs.accountNumber) && this.showPaymentMethodAnnotation == investFlowRecurringArgs.showPaymentMethodAnnotation && this.isRecurringUpsell == investFlowRecurringArgs.isRecurringUpsell;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isCrypto) * 31) + this.totalAmount.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.assetAllocations.hashCode()) * 31) + this.primaryPaymentMethod.hashCode()) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.backupPaymentMethod;
        int iHashCode2 = (iHashCode + (investFlowPaymentMethod == null ? 0 : investFlowPaymentMethod.hashCode())) * 31;
        LocalDate localDate = this.startDate;
        return ((((((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.showPaymentMethodAnnotation)) * 31) + Boolean.hashCode(this.isRecurringUpsell);
    }

    public String toString() {
        return "InvestFlowRecurringArgs(isCrypto=" + this.isCrypto + ", totalAmount=" + this.totalAmount + ", frequency=" + this.frequency + ", assetAllocations=" + this.assetAllocations + ", primaryPaymentMethod=" + this.primaryPaymentMethod + ", backupPaymentMethod=" + this.backupPaymentMethod + ", startDate=" + this.startDate + ", accountNumber=" + this.accountNumber + ", showPaymentMethodAnnotation=" + this.showPaymentMethodAnnotation + ", isRecurringUpsell=" + this.isRecurringUpsell + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeParcelable(this.totalAmount, flags);
        dest.writeString(this.frequency.name());
        List<ApiAssetAllocation> list = this.assetAllocations;
        dest.writeInt(list.size());
        Iterator<ApiAssetAllocation> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.primaryPaymentMethod, flags);
        dest.writeParcelable(this.backupPaymentMethod, flags);
        dest.writeSerializable(this.startDate);
        dest.writeString(this.accountNumber);
        dest.writeInt(this.showPaymentMethodAnnotation ? 1 : 0);
        dest.writeInt(this.isRecurringUpsell ? 1 : 0);
    }

    public InvestFlowRecurringArgs(boolean z, Money totalAmount, ApiInvestmentSchedule.Frequency frequency, List<ApiAssetAllocation> assetAllocations, InvestFlowPaymentMethod primaryPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod, LocalDate localDate, String accountNumber, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(primaryPaymentMethod, "primaryPaymentMethod");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.isCrypto = z;
        this.totalAmount = totalAmount;
        this.frequency = frequency;
        this.assetAllocations = assetAllocations;
        this.primaryPaymentMethod = primaryPaymentMethod;
        this.backupPaymentMethod = investFlowPaymentMethod;
        this.startDate = localDate;
        this.accountNumber = accountNumber;
        this.showPaymentMethodAnnotation = z2;
        this.isRecurringUpsell = z3;
    }

    public /* synthetic */ InvestFlowRecurringArgs(boolean z, Money money, ApiInvestmentSchedule.Frequency frequency, List list, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, LocalDate localDate, String str, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, money, frequency, list, investFlowPaymentMethod, investFlowPaymentMethod2, localDate, str, z2, z3);
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final void setTotalAmount(Money money) {
        Intrinsics.checkNotNullParameter(money, "<set-?>");
        this.totalAmount = money;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final boolean isRecurringUpsell() {
        return this.isRecurringUpsell;
    }
}
