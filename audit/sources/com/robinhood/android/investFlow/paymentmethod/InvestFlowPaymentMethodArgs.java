package com.robinhood.android.investFlow.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowPaymentMethodArgs.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodArgs;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "accountBuyingPower", "Lcom/robinhood/models/util/Money;", "isCrypto", "", "isBackup", "accountNumber", "", "showPaymentMethodAnnotation", "<init>", "(Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/models/util/Money;ZZLjava/lang/String;Z)V", "getPaymentMethod", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getAccountBuyingPower", "()Lcom/robinhood/models/util/Money;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getShowPaymentMethodAnnotation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowPaymentMethodArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowPaymentMethodArgs> CREATOR = new Creator();
    private final Money accountBuyingPower;
    private final String accountNumber;
    private final boolean isBackup;
    private final boolean isCrypto;
    private final InvestFlowPaymentMethod paymentMethod;
    private final boolean showPaymentMethodAnnotation;

    /* compiled from: InvestFlowPaymentMethodArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowPaymentMethodArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowPaymentMethodArgs createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InvestFlowPaymentMethod investFlowPaymentMethod = (InvestFlowPaymentMethod) parcel.readParcelable(InvestFlowPaymentMethodArgs.class.getClassLoader());
            Money money = (Money) parcel.readParcelable(InvestFlowPaymentMethodArgs.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z2;
                str = string2;
            } else {
                str = string2;
                z3 = z;
            }
            return new InvestFlowPaymentMethodArgs(investFlowPaymentMethod, money, z4, z5, str, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowPaymentMethodArgs[] newArray(int i) {
            return new InvestFlowPaymentMethodArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowPaymentMethodArgs copy$default(InvestFlowPaymentMethodArgs investFlowPaymentMethodArgs, InvestFlowPaymentMethod investFlowPaymentMethod, Money money, boolean z, boolean z2, String str, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            investFlowPaymentMethod = investFlowPaymentMethodArgs.paymentMethod;
        }
        if ((i & 2) != 0) {
            money = investFlowPaymentMethodArgs.accountBuyingPower;
        }
        if ((i & 4) != 0) {
            z = investFlowPaymentMethodArgs.isCrypto;
        }
        if ((i & 8) != 0) {
            z2 = investFlowPaymentMethodArgs.isBackup;
        }
        if ((i & 16) != 0) {
            str = investFlowPaymentMethodArgs.accountNumber;
        }
        if ((i & 32) != 0) {
            z3 = investFlowPaymentMethodArgs.showPaymentMethodAnnotation;
        }
        String str2 = str;
        boolean z4 = z3;
        return investFlowPaymentMethodArgs.copy(investFlowPaymentMethod, money, z, z2, str2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestFlowPaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBackup() {
        return this.isBackup;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final InvestFlowPaymentMethodArgs copy(InvestFlowPaymentMethod paymentMethod, Money accountBuyingPower, boolean isCrypto, boolean isBackup, String accountNumber, boolean showPaymentMethodAnnotation) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowPaymentMethodArgs(paymentMethod, accountBuyingPower, isCrypto, isBackup, accountNumber, showPaymentMethodAnnotation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowPaymentMethodArgs)) {
            return false;
        }
        InvestFlowPaymentMethodArgs investFlowPaymentMethodArgs = (InvestFlowPaymentMethodArgs) other;
        return Intrinsics.areEqual(this.paymentMethod, investFlowPaymentMethodArgs.paymentMethod) && Intrinsics.areEqual(this.accountBuyingPower, investFlowPaymentMethodArgs.accountBuyingPower) && this.isCrypto == investFlowPaymentMethodArgs.isCrypto && this.isBackup == investFlowPaymentMethodArgs.isBackup && Intrinsics.areEqual(this.accountNumber, investFlowPaymentMethodArgs.accountNumber) && this.showPaymentMethodAnnotation == investFlowPaymentMethodArgs.showPaymentMethodAnnotation;
    }

    public int hashCode() {
        InvestFlowPaymentMethod investFlowPaymentMethod = this.paymentMethod;
        int iHashCode = (investFlowPaymentMethod == null ? 0 : investFlowPaymentMethod.hashCode()) * 31;
        Money money = this.accountBuyingPower;
        return ((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + Boolean.hashCode(this.isBackup)) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.showPaymentMethodAnnotation);
    }

    public String toString() {
        return "InvestFlowPaymentMethodArgs(paymentMethod=" + this.paymentMethod + ", accountBuyingPower=" + this.accountBuyingPower + ", isCrypto=" + this.isCrypto + ", isBackup=" + this.isBackup + ", accountNumber=" + this.accountNumber + ", showPaymentMethodAnnotation=" + this.showPaymentMethodAnnotation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.paymentMethod, flags);
        dest.writeParcelable(this.accountBuyingPower, flags);
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeInt(this.isBackup ? 1 : 0);
        dest.writeString(this.accountNumber);
        dest.writeInt(this.showPaymentMethodAnnotation ? 1 : 0);
    }

    public InvestFlowPaymentMethodArgs(InvestFlowPaymentMethod investFlowPaymentMethod, Money money, boolean z, boolean z2, String accountNumber, boolean z3) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.paymentMethod = investFlowPaymentMethod;
        this.accountBuyingPower = money;
        this.isCrypto = z;
        this.isBackup = z2;
        this.accountNumber = accountNumber;
        this.showPaymentMethodAnnotation = z3;
    }

    public /* synthetic */ InvestFlowPaymentMethodArgs(InvestFlowPaymentMethod investFlowPaymentMethod, Money money, boolean z, boolean z2, String str, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investFlowPaymentMethod, (i & 2) != 0 ? null : money, (i & 4) != 0 ? false : z, z2, str, z3);
    }

    public final InvestFlowPaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final boolean isBackup() {
        return this.isBackup;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }
}
