package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder7;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareDraft;
import com.robinhood.android.trading.contracts.configuration.ShareValidated;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/StopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "New", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareStopLimit extends ShareBasedOrderConfiguration, DirectOrder7, Buildable {

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(shareStopLimit);
        }

        public static Order.Configuration getOrderConfiguration(ShareStopLimit shareStopLimit) {
            return DirectOrder7.DefaultImpls.getOrderConfiguration(shareStopLimit);
        }

        public static boolean getTaxLots(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(shareStopLimit);
        }

        public static boolean isBuySellDollarOrder(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(shareStopLimit);
        }

        public static boolean isBuySellOrder(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(shareStopLimit);
        }

        public static boolean isBuySellSharesOrder(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(shareStopLimit);
        }

        public static boolean isDefaultOrderType(ShareStopLimit shareStopLimit) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(shareStopLimit);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "accountNumber", "", "limitPrice", "Ljava/math/BigDecimal;", "shareQuantity", "stopPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;)V", "getAccountNumber", "()Ljava/lang/String;", "getLimitPrice", "()Ljava/math/BigDecimal;", "getShareQuantity", "getStopPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "mutateShareQuantity", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class New implements ShareStopLimit {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final BigDecimal stopPrice;
        private final OrderTimeInForce timeInForce;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(New.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(New.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        public static /* synthetic */ New copy$default(New r0, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = r0.limitPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = r0.shareQuantity;
            }
            if ((i & 8) != 0) {
                bigDecimal3 = r0.stopPrice;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = r0.timeInForce;
            }
            if ((i & 32) != 0) {
                orderMarketHours = r0.marketHours;
            }
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            return r0.copy(str, bigDecimal, bigDecimal2, bigDecimal3, orderTimeInForce2, orderMarketHours2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        public final New copy(String accountNumber, BigDecimal limitPrice, BigDecimal shareQuantity, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new New(accountNumber, limitPrice, shareQuantity, stopPrice, timeInForce, marketHours);
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
            return Intrinsics.areEqual(this.accountNumber, r5.accountNumber) && Intrinsics.areEqual(this.limitPrice, r5.limitPrice) && Intrinsics.areEqual(this.shareQuantity, r5.shareQuantity) && Intrinsics.areEqual(this.stopPrice, r5.stopPrice) && this.timeInForce == r5.timeInForce && this.marketHours == r5.marketHours;
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.limitPrice.hashCode()) * 31;
            BigDecimal bigDecimal = this.shareQuantity;
            int iHashCode2 = (((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.stopPrice.hashCode()) * 31) + this.timeInForce.hashCode()) * 31;
            OrderMarketHours orderMarketHours = this.marketHours;
            return iHashCode2 + (orderMarketHours != null ? orderMarketHours.hashCode() : 0);
        }

        public String toString() {
            return "New(accountNumber=" + this.accountNumber + ", limitPrice=" + this.limitPrice + ", shareQuantity=" + this.shareQuantity + ", stopPrice=" + this.stopPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.limitPrice);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.stopPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
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

        public New(String accountNumber, BigDecimal limitPrice, BigDecimal bigDecimal, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.accountNumber = accountNumber;
            this.limitPrice = limitPrice;
            this.shareQuantity = bigDecimal;
            this.stopPrice = stopPrice;
            this.timeInForce = timeInForce;
            this.marketHours = orderMarketHours;
        }

        public /* synthetic */ New(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bigDecimal, (i & 4) != 0 ? null : bigDecimal2, bigDecimal3, orderTimeInForce, (i & 32) != 0 ? null : orderMarketHours);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder8
        public BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public New mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, null, shareQuantity, null, null, null, 59, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public ShareDraft completedDraft() {
            String accountNumber = getAccountNumber();
            BigDecimal limitPrice = getLimitPrice();
            BigDecimal shareQuantity = getShareQuantity();
            if (shareQuantity == null) {
                return null;
            }
            BigDecimal stopPrice = getStopPrice();
            OrderTimeInForce timeInForce = getTimeInForce();
            OrderMarketHours marketHours = getMarketHours();
            if (marketHours == null) {
                return null;
            }
            return new Draft(accountNumber, limitPrice, shareQuantity, stopPrice, timeInForce, marketHours, false);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "accountNumber", "", "limitPrice", "Ljava/math/BigDecimal;", "shareQuantity", "stopPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "autoValidate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getLimitPrice", "()Ljava/math/BigDecimal;", "getShareQuantity", "getStopPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getAutoValidate", "()Z", "mutateShareQuantity", "validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Validated;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Draft implements ShareStopLimit, ShareDraft {
        public static final Parcelable.Creator<Draft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final BigDecimal stopPrice;
        private final OrderTimeInForce timeInForce;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Draft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(Draft.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(Draft.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft[] newArray(int i) {
                return new Draft[i];
            }
        }

        public static /* synthetic */ Draft copy$default(Draft draft, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = draft.limitPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = draft.shareQuantity;
            }
            if ((i & 8) != 0) {
                bigDecimal3 = draft.stopPrice;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = draft.timeInForce;
            }
            if ((i & 32) != 0) {
                orderMarketHours = draft.marketHours;
            }
            if ((i & 64) != 0) {
                z = draft.autoValidate;
            }
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            boolean z2 = z;
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            BigDecimal bigDecimal4 = bigDecimal2;
            return draft.copy(str, bigDecimal, bigDecimal4, bigDecimal3, orderTimeInForce2, orderMarketHours2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final Draft copy(String accountNumber, BigDecimal limitPrice, BigDecimal shareQuantity, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            return new Draft(accountNumber, limitPrice, shareQuantity, stopPrice, timeInForce, marketHours, autoValidate);
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
            return Intrinsics.areEqual(this.accountNumber, draft.accountNumber) && Intrinsics.areEqual(this.limitPrice, draft.limitPrice) && Intrinsics.areEqual(this.shareQuantity, draft.shareQuantity) && Intrinsics.areEqual(this.stopPrice, draft.stopPrice) && this.timeInForce == draft.timeInForce && this.marketHours == draft.marketHours && this.autoValidate == draft.autoValidate;
        }

        public int hashCode() {
            return (((((((((((this.accountNumber.hashCode() * 31) + this.limitPrice.hashCode()) * 31) + this.shareQuantity.hashCode()) * 31) + this.stopPrice.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "Draft(accountNumber=" + this.accountNumber + ", limitPrice=" + this.limitPrice + ", shareQuantity=" + this.shareQuantity + ", stopPrice=" + this.stopPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.limitPrice);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.stopPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
            dest.writeInt(this.autoValidate ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft completedDraft() {
            return ShareDraft.DefaultImpls.completedDraft(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
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

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ ShareValidated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public Draft(String accountNumber, BigDecimal limitPrice, BigDecimal shareQuantity, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            this.accountNumber = accountNumber;
            this.limitPrice = limitPrice;
            this.shareQuantity = shareQuantity;
            this.stopPrice = stopPrice;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.autoValidate = z;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder8
        public BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public Draft mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, null, shareQuantity, null, null, null, false, 123, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(getAccountNumber(), getLimitPrice(), getShareQuantity(), getStopPrice(), getTimeInForce(), getMarketHours(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft edit() {
            return copy$default(this, null, null, null, null, null, null, false, 63, null);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010 \u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003Ja\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "accountNumber", "", "limitPrice", "Ljava/math/BigDecimal;", "shareQuantity", "stopPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Ljava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getLimitPrice", "()Ljava/math/BigDecimal;", "getShareQuantity", "getStopPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "mutateShareQuantity", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Draft;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Validated implements ShareStopLimit, ShareValidated {
        public static final Parcelable.Creator<Validated> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final String orderSummary;
        private final BigDecimal shareQuantity;
        private final BigDecimal stopPrice;
        private final OrderTimeInForce timeInForce;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Validated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Validated(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(Validated.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(Validated.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated[] newArray(int i) {
                return new Validated[i];
            }
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = validated.limitPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = validated.shareQuantity;
            }
            if ((i & 8) != 0) {
                bigDecimal3 = validated.stopPrice;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = validated.timeInForce;
            }
            if ((i & 32) != 0) {
                orderMarketHours = validated.marketHours;
            }
            if ((i & 64) != 0) {
                list = validated.checkOverrides;
            }
            if ((i & 128) != 0) {
                str2 = validated.orderSummary;
            }
            List list2 = list;
            String str3 = str2;
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            return validated.copy(str, bigDecimal, bigDecimal2, bigDecimal3, orderTimeInForce2, orderMarketHours2, list2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        public final List<String> component7() {
            return this.checkOverrides;
        }

        /* renamed from: component8, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final Validated copy(String accountNumber, BigDecimal limitPrice, BigDecimal shareQuantity, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(accountNumber, limitPrice, shareQuantity, stopPrice, timeInForce, marketHours, checkOverrides, orderSummary);
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
            return Intrinsics.areEqual(this.accountNumber, validated.accountNumber) && Intrinsics.areEqual(this.limitPrice, validated.limitPrice) && Intrinsics.areEqual(this.shareQuantity, validated.shareQuantity) && Intrinsics.areEqual(this.stopPrice, validated.stopPrice) && this.timeInForce == validated.timeInForce && this.marketHours == validated.marketHours && Intrinsics.areEqual(this.checkOverrides, validated.checkOverrides) && Intrinsics.areEqual(this.orderSummary, validated.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.accountNumber.hashCode() * 31) + this.limitPrice.hashCode()) * 31) + this.shareQuantity.hashCode()) * 31) + this.stopPrice.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Validated(accountNumber=" + this.accountNumber + ", limitPrice=" + this.limitPrice + ", shareQuantity=" + this.shareQuantity + ", stopPrice=" + this.stopPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.limitPrice);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.stopPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
            dest.writeStringList(this.checkOverrides);
            dest.writeString(this.orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft completedDraft() {
            return ShareValidated.DefaultImpls.completedDraft(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return ShareValidated.DefaultImpls.getAutoValidate(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return DefaultImpls.getTaxLots(this);
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

        public Validated(String accountNumber, BigDecimal limitPrice, BigDecimal shareQuantity, BigDecimal stopPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.limitPrice = limitPrice;
            this.shareQuantity = shareQuantity;
            this.stopPrice = stopPrice;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.checkOverrides = checkOverrides;
            this.orderSummary = str;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder8
        public BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated
        public List<String> getCheckOverrides() {
            return this.checkOverrides;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated
        public String getOrderSummary() {
            return this.orderSummary;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public Validated mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, null, shareQuantity, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, null, null, null, null, checkOverrides, orderSummary, 63, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return new Draft(getAccountNumber(), getLimitPrice(), getShareQuantity(), getStopPrice(), getTimeInForce(), getMarketHours(), false);
        }
    }
}
