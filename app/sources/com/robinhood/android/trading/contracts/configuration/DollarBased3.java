package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DollarBased.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "New", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$New;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket, reason: use source file name */
/* loaded from: classes9.dex */
public interface DollarBased3 extends DollarBased, DirectOrder4 {

    /* compiled from: DollarBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.getOrderAmountType(dollarBased3);
        }

        public static Order.Configuration getOrderConfiguration(DollarBased3 dollarBased3) {
            return DirectOrder4.DefaultImpls.getOrderConfiguration(dollarBased3);
        }

        public static boolean getTaxLots(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.getTaxLots(dollarBased3);
        }

        public static OrderTimeInForce getTimeInForce(DollarBased3 dollarBased3) {
            return DirectOrder4.DefaultImpls.getTimeInForce(dollarBased3);
        }

        public static boolean isBuySellDollarOrder(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.isBuySellDollarOrder(dollarBased3);
        }

        public static boolean isBuySellOrder(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.isBuySellOrder(dollarBased3);
        }

        public static boolean isBuySellSharesOrder(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.isBuySellSharesOrder(dollarBased3);
        }

        public static boolean isDefaultOrderType(DollarBased3 dollarBased3) {
            return DollarBased.DefaultImpls.isDefaultOrderType(dollarBased3);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$New;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Draft;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$New, reason: from toString */
    public static final /* data */ class New implements DollarBased3 {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal dollarAmount;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$New$Creator */
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New(parcel.readString(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        public static /* synthetic */ New copy$default(New r0, String str, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = r0.dollarAmount;
            }
            return r0.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        public final New copy(String accountNumber, BigDecimal dollarAmount) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new New(accountNumber, dollarAmount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(this.accountNumber, r5.accountNumber) && Intrinsics.areEqual(this.dollarAmount, r5.dollarAmount);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.dollarAmount;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public String toString() {
            return "New(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DefaultImpls.getTimeInForce(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return DefaultImpls.isDefaultOrderType(this);
        }

        public New(String accountNumber, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.dollarAmount = bigDecimal;
        }

        public /* synthetic */ New(String str, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft completedDraft() {
            String accountNumber = getAccountNumber();
            BigDecimal dollarAmount = getDollarAmount();
            if (dollarAmount == null) {
                return null;
            }
            return new Draft(accountNumber, dollarAmount, false);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "autoValidate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "getAutoValidate", "()Z", "validated", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Validated;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$Draft, reason: from toString */
    public static final /* data */ class Draft implements DollarBased3, DirectOrder.Draft {
        public static final Parcelable.Creator<Draft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal dollarAmount;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$Draft$Creator */
        public static final class Creator implements Parcelable.Creator<Draft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft[] newArray(int i) {
                return new Draft[i];
            }
        }

        public static /* synthetic */ Draft copy$default(Draft draft, String str, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = draft.dollarAmount;
            }
            if ((i & 4) != 0) {
                z = draft.autoValidate;
            }
            return draft.copy(str, bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final Draft copy(String accountNumber, BigDecimal dollarAmount, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            return new Draft(accountNumber, dollarAmount, autoValidate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Draft)) {
                return false;
            }
            Draft draft = (Draft) other;
            return Intrinsics.areEqual(this.accountNumber, draft.accountNumber) && Intrinsics.areEqual(this.dollarAmount, draft.dollarAmount) && this.autoValidate == draft.autoValidate;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.dollarAmount.hashCode()) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "Draft(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
            dest.writeInt(this.autoValidate ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft completedDraft() {
            return DirectOrder.Draft.DefaultImpls.completedDraft(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DefaultImpls.getTimeInForce(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public Draft(String accountNumber, BigDecimal dollarAmount, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            this.accountNumber = accountNumber;
            this.dollarAmount = dollarAmount;
            this.autoValidate = z;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4
        public BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(getAccountNumber(), getDollarAmount(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return copy$default(this, null, null, false, 3, null);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Validated;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Draft;", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$Validated, reason: from toString */
    public static final /* data */ class Validated implements DollarBased3, DirectOrder.Validated {
        public static final Parcelable.Creator<Validated> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final BigDecimal dollarAmount;
        private final String orderSummary;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarMarket$Validated$Creator */
        public static final class Creator implements Parcelable.Creator<Validated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Validated(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated[] newArray(int i) {
                return new Validated[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Validated copy$default(Validated validated, String str, BigDecimal bigDecimal, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = validated.dollarAmount;
            }
            if ((i & 4) != 0) {
                list = validated.checkOverrides;
            }
            if ((i & 8) != 0) {
                str2 = validated.orderSummary;
            }
            return validated.copy(str, bigDecimal, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        public final List<String> component3() {
            return this.checkOverrides;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final Validated copy(String accountNumber, BigDecimal dollarAmount, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(accountNumber, dollarAmount, checkOverrides, orderSummary);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) other;
            return Intrinsics.areEqual(this.accountNumber, validated.accountNumber) && Intrinsics.areEqual(this.dollarAmount, validated.dollarAmount) && Intrinsics.areEqual(this.checkOverrides, validated.checkOverrides) && Intrinsics.areEqual(this.orderSummary, validated.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.dollarAmount.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Validated(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
            dest.writeStringList(this.checkOverrides);
            dest.writeString(this.orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return DirectOrder.Validated.DefaultImpls.getAutoValidate(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DefaultImpls.getTimeInForce(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public Validated(String accountNumber, BigDecimal dollarAmount, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.dollarAmount = dollarAmount;
            this.checkOverrides = checkOverrides;
            this.orderSummary = str;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4
        public BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated
        public List<String> getCheckOverrides() {
            return this.checkOverrides;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated
        public String getOrderSummary() {
            return this.orderSummary;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft completedDraft() {
            return new Draft(getAccountNumber(), getDollarAmount(), false);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, checkOverrides, orderSummary, 3, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return new Draft(getAccountNumber(), getDollarAmount(), false);
        }
    }
}
