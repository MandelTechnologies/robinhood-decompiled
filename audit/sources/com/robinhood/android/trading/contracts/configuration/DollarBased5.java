package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
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
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/SimpleLimit;", "New", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$New;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit, reason: use source file name */
/* loaded from: classes9.dex */
public interface DollarBased5 extends DollarBased, DirectOrder5 {

    /* compiled from: DollarBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.getOrderAmountType(dollarBased5);
        }

        public static Order.Configuration getOrderConfiguration(DollarBased5 dollarBased5) {
            return DirectOrder5.DefaultImpls.getOrderConfiguration(dollarBased5);
        }

        public static boolean getTaxLots(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.getTaxLots(dollarBased5);
        }

        public static OrderTimeInForce getTimeInForce(DollarBased5 dollarBased5) {
            return DirectOrder5.DefaultImpls.getTimeInForce(dollarBased5);
        }

        public static boolean isBuySellDollarOrder(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.isBuySellDollarOrder(dollarBased5);
        }

        public static boolean isBuySellOrder(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.isBuySellOrder(dollarBased5);
        }

        public static boolean isBuySellSharesOrder(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.isBuySellSharesOrder(dollarBased5);
        }

        public static boolean isDefaultOrderType(DollarBased5 dollarBased5) {
            return DollarBased.DefaultImpls.isDefaultOrderType(dollarBased5);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$New;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "presetPercentLimit", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "getPresetPercentLimit", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Draft;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$New, reason: from toString */
    public static final /* data */ class New implements DollarBased5 {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal dollarAmount;
        private final BigDecimal presetPercentLimit;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$New$Creator */
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        public static /* synthetic */ New copy$default(New r0, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = r0.dollarAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = r0.presetPercentLimit;
            }
            return r0.copy(str, bigDecimal, bigDecimal2);
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
        public final BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        public final New copy(String accountNumber, BigDecimal dollarAmount, BigDecimal presetPercentLimit) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            return new New(accountNumber, dollarAmount, presetPercentLimit);
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
            return Intrinsics.areEqual(this.accountNumber, r5.accountNumber) && Intrinsics.areEqual(this.dollarAmount, r5.dollarAmount) && Intrinsics.areEqual(this.presetPercentLimit, r5.presetPercentLimit);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.dollarAmount;
            return ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.presetPercentLimit.hashCode();
        }

        public String toString() {
            return "New(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ", presetPercentLimit=" + this.presetPercentLimit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
            dest.writeSerializable(this.presetPercentLimit);
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

        public New(String accountNumber, BigDecimal bigDecimal, BigDecimal presetPercentLimit) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            this.accountNumber = accountNumber;
            this.dollarAmount = bigDecimal;
            this.presetPercentLimit = presetPercentLimit;
        }

        public /* synthetic */ New(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal, bigDecimal2);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DollarBased4
        public BigDecimal getDollarAmount() {
            return this.dollarAmount;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder5
        public BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft completedDraft() {
            String accountNumber = getAccountNumber();
            BigDecimal dollarAmount = getDollarAmount();
            if (dollarAmount == null) {
                return null;
            }
            return new Draft(accountNumber, dollarAmount, getPresetPercentLimit(), false);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0000H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "presetPercentLimit", "autoValidate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "getPresetPercentLimit", "getAutoValidate", "()Z", "validated", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Validated;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$Draft, reason: from toString */
    public static final /* data */ class Draft implements DollarBased5, DirectOrder.Draft {
        public static final Parcelable.Creator<Draft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal dollarAmount;
        private final BigDecimal presetPercentLimit;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$Draft$Creator */
        public static final class Creator implements Parcelable.Creator<Draft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft[] newArray(int i) {
                return new Draft[i];
            }
        }

        public static /* synthetic */ Draft copy$default(Draft draft, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = draft.dollarAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = draft.presetPercentLimit;
            }
            if ((i & 8) != 0) {
                z = draft.autoValidate;
            }
            return draft.copy(str, bigDecimal, bigDecimal2, z);
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
        public final BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final Draft copy(String accountNumber, BigDecimal dollarAmount, BigDecimal presetPercentLimit, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            return new Draft(accountNumber, dollarAmount, presetPercentLimit, autoValidate);
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
            return Intrinsics.areEqual(this.accountNumber, draft.accountNumber) && Intrinsics.areEqual(this.dollarAmount, draft.dollarAmount) && Intrinsics.areEqual(this.presetPercentLimit, draft.presetPercentLimit) && this.autoValidate == draft.autoValidate;
        }

        public int hashCode() {
            return (((((this.accountNumber.hashCode() * 31) + this.dollarAmount.hashCode()) * 31) + this.presetPercentLimit.hashCode()) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "Draft(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ", presetPercentLimit=" + this.presetPercentLimit + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
            dest.writeSerializable(this.presetPercentLimit);
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

        public Draft(String accountNumber, BigDecimal dollarAmount, BigDecimal presetPercentLimit, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            this.accountNumber = accountNumber;
            this.dollarAmount = dollarAmount;
            this.presetPercentLimit = presetPercentLimit;
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

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder5
        public BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(getAccountNumber(), getDollarAmount(), getPresetPercentLimit(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return copy$default(this, null, null, null, false, 7, null);
        }
    }

    /* compiled from: DollarBased.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Validated;", "accountNumber", "", "dollarAmount", "Ljava/math/BigDecimal;", "presetPercentLimit", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getDollarAmount", "()Ljava/math/BigDecimal;", "getPresetPercentLimit", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Draft;", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$Validated, reason: from toString */
    public static final /* data */ class Validated implements DollarBased5, DirectOrder.Validated {
        public static final Parcelable.Creator<Validated> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final BigDecimal dollarAmount;
        private final String orderSummary;
        private final BigDecimal presetPercentLimit;

        /* compiled from: DollarBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarSimpleLimit$Validated$Creator */
        public static final class Creator implements Parcelable.Creator<Validated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Validated(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated[] newArray(int i) {
                return new Validated[i];
            }
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = validated.dollarAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = validated.presetPercentLimit;
            }
            if ((i & 8) != 0) {
                list = validated.checkOverrides;
            }
            if ((i & 16) != 0) {
                str2 = validated.orderSummary;
            }
            String str3 = str2;
            BigDecimal bigDecimal3 = bigDecimal2;
            return validated.copy(str, bigDecimal, bigDecimal3, list, str3);
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
        public final BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        public final List<String> component4() {
            return this.checkOverrides;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final Validated copy(String accountNumber, BigDecimal dollarAmount, BigDecimal presetPercentLimit, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(accountNumber, dollarAmount, presetPercentLimit, checkOverrides, orderSummary);
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
            return Intrinsics.areEqual(this.accountNumber, validated.accountNumber) && Intrinsics.areEqual(this.dollarAmount, validated.dollarAmount) && Intrinsics.areEqual(this.presetPercentLimit, validated.presetPercentLimit) && Intrinsics.areEqual(this.checkOverrides, validated.checkOverrides) && Intrinsics.areEqual(this.orderSummary, validated.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.dollarAmount.hashCode()) * 31) + this.presetPercentLimit.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Validated(accountNumber=" + this.accountNumber + ", dollarAmount=" + this.dollarAmount + ", presetPercentLimit=" + this.presetPercentLimit + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.dollarAmount);
            dest.writeSerializable(this.presetPercentLimit);
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

        public Validated(String accountNumber, BigDecimal dollarAmount, BigDecimal presetPercentLimit, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.dollarAmount = dollarAmount;
            this.presetPercentLimit = presetPercentLimit;
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

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder5
        public BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
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
            return new Draft(getAccountNumber(), getDollarAmount(), getPresetPercentLimit(), false);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, null, checkOverrides, orderSummary, 7, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return new Draft(getAccountNumber(), getDollarAmount(), getPresetPercentLimit(), false);
        }
    }
}
