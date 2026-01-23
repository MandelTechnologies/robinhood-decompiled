package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.trading.contracts.configuration.DollarBased4;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DollarBased.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarBasic;", "Lcom/robinhood/android/trading/contracts/configuration/DollarOrder;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DollarBasic implements DollarBased4 {
    public static final Parcelable.Creator<DollarBasic> CREATOR = new Creator();
    private final String accountNumber;
    private final BigDecimal dollarAmount;

    /* compiled from: DollarBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DollarBasic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DollarBasic createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DollarBasic(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DollarBasic[] newArray(int i) {
            return new DollarBasic[i];
        }
    }

    public static /* synthetic */ DollarBasic copy$default(DollarBasic dollarBasic, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dollarBasic.accountNumber;
        }
        if ((i & 2) != 0) {
            bigDecimal = dollarBasic.dollarAmount;
        }
        return dollarBasic.copy(str, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getDollarAmount() {
        return this.dollarAmount;
    }

    public final DollarBasic copy(String accountNumber, BigDecimal dollarAmount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new DollarBasic(accountNumber, dollarAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DollarBasic)) {
            return false;
        }
        DollarBasic dollarBasic = (DollarBasic) other;
        return Intrinsics.areEqual(this.accountNumber, dollarBasic.accountNumber) && Intrinsics.areEqual(this.dollarAmount, dollarBasic.dollarAmount);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    public Order.Configuration getOrderConfiguration() {
        return null;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        BigDecimal bigDecimal = this.dollarAmount;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "DollarBasic(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.dollarAmount);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public DefaultableOrderConfiguration getOrderAmountType() {
        return DollarBased4.DefaultImpls.getOrderAmountType(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellDollarOrder() {
        return DollarBased4.DefaultImpls.isBuySellDollarOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellOrder() {
        return DollarBased4.DefaultImpls.isBuySellOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellSharesOrder() {
        return DollarBased4.DefaultImpls.isBuySellSharesOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isDefaultOrderType() {
        return DollarBased4.DefaultImpls.isDefaultOrderType(this);
    }

    public DollarBasic(String accountNumber, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.dollarAmount = bigDecimal;
    }

    public /* synthetic */ DollarBasic(String str, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bigDecimal);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4
    public BigDecimal getDollarAmount() {
        return this.dollarAmount;
    }
}
