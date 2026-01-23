package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder9;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareDraft;
import com.robinhood.android.trading.contracts.configuration.ShareValidated;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/TrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "New", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareTrailingStop extends ShareBasedOrderConfiguration, DirectOrder9, Buildable {

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(shareTrailingStop);
        }

        public static Order.Configuration getOrderConfiguration(ShareTrailingStop shareTrailingStop) {
            return DirectOrder9.DefaultImpls.getOrderConfiguration(shareTrailingStop);
        }

        public static boolean getTaxLots(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(shareTrailingStop);
        }

        public static boolean isBuySellDollarOrder(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(shareTrailingStop);
        }

        public static boolean isBuySellOrder(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(shareTrailingStop);
        }

        public static boolean isBuySellSharesOrder(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(shareTrailingStop);
        }

        public static boolean isDefaultOrderType(ShareTrailingStop shareTrailingStop) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(shareTrailingStop);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTrailingPeg;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "mutateShareQuantity", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class New implements ShareTrailingStop {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final String accountNumber;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final OrderTimeInForce timeInForce;
        private final OrderTrailingPeg trailingPeg;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New(parcel.readString(), (BigDecimal) parcel.readSerializable(), (OrderTrailingPeg) parcel.readParcelable(New.class.getClassLoader()), (OrderTimeInForce) parcel.readParcelable(New.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(New.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        public static /* synthetic */ New copy$default(New r0, String str, BigDecimal bigDecimal, OrderTrailingPeg orderTrailingPeg, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = r0.shareQuantity;
            }
            if ((i & 4) != 0) {
                orderTrailingPeg = r0.trailingPeg;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = r0.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = r0.marketHours;
            }
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            OrderTrailingPeg orderTrailingPeg2 = orderTrailingPeg;
            return r0.copy(str, bigDecimal, orderTrailingPeg2, orderTimeInForce, orderMarketHours2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        public final New copy(String accountNumber, BigDecimal shareQuantity, OrderTrailingPeg trailingPeg, OrderTimeInForce timeInForce, OrderMarketHours marketHours) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new New(accountNumber, shareQuantity, trailingPeg, timeInForce, marketHours);
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
            return Intrinsics.areEqual(this.accountNumber, r5.accountNumber) && Intrinsics.areEqual(this.shareQuantity, r5.shareQuantity) && Intrinsics.areEqual(this.trailingPeg, r5.trailingPeg) && this.timeInForce == r5.timeInForce && this.marketHours == r5.marketHours;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.shareQuantity;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            OrderTrailingPeg orderTrailingPeg = this.trailingPeg;
            int iHashCode3 = (((iHashCode2 + (orderTrailingPeg == null ? 0 : orderTrailingPeg.hashCode())) * 31) + this.timeInForce.hashCode()) * 31;
            OrderMarketHours orderMarketHours = this.marketHours;
            return iHashCode3 + (orderMarketHours != null ? orderMarketHours.hashCode() : 0);
        }

        public String toString() {
            return "New(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", trailingPeg=" + this.trailingPeg + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeParcelable(this.trailingPeg, flags);
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

        public New(String accountNumber, BigDecimal bigDecimal, OrderTrailingPeg orderTrailingPeg, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.accountNumber = accountNumber;
            this.shareQuantity = bigDecimal;
            this.trailingPeg = orderTrailingPeg;
            this.timeInForce = timeInForce;
            this.marketHours = orderMarketHours;
        }

        public /* synthetic */ New(String str, BigDecimal bigDecimal, OrderTrailingPeg orderTrailingPeg, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : orderTrailingPeg, orderTimeInForce, (i & 16) != 0 ? null : orderMarketHours);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
        public OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public New mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, null, null, null, 29, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public ShareDraft completedDraft() {
            OrderTrailingPeg trailingPeg;
            String accountNumber = getAccountNumber();
            BigDecimal shareQuantity = getShareQuantity();
            if (shareQuantity == null || (trailingPeg = getTrailingPeg()) == null) {
                return null;
            }
            OrderTimeInForce timeInForce = getTimeInForce();
            OrderMarketHours marketHours = getMarketHours();
            if (marketHours == null) {
                return null;
            }
            return new Draft(accountNumber, shareQuantity, trailingPeg, timeInForce, marketHours, false);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010#\u001a\u00020\u0000H\u0016J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003JE\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0004HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "autoValidate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTrailingPeg;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getAutoValidate", "()Z", "mutateShareQuantity", "validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Validated;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Draft implements ShareTrailingStop, ShareDraft {
        public static final Parcelable.Creator<Draft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final OrderTimeInForce timeInForce;
        private final OrderTrailingPeg trailingPeg;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Draft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft(parcel.readString(), (BigDecimal) parcel.readSerializable(), (OrderTrailingPeg) parcel.readParcelable(Draft.class.getClassLoader()), (OrderTimeInForce) parcel.readParcelable(Draft.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(Draft.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Draft[] newArray(int i) {
                return new Draft[i];
            }
        }

        public static /* synthetic */ Draft copy$default(Draft draft, String str, BigDecimal bigDecimal, OrderTrailingPeg orderTrailingPeg, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = draft.shareQuantity;
            }
            if ((i & 4) != 0) {
                orderTrailingPeg = draft.trailingPeg;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = draft.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = draft.marketHours;
            }
            if ((i & 32) != 0) {
                z = draft.autoValidate;
            }
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            boolean z2 = z;
            return draft.copy(str, bigDecimal, orderTrailingPeg, orderTimeInForce, orderMarketHours2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final Draft copy(String accountNumber, BigDecimal shareQuantity, OrderTrailingPeg trailingPeg, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            return new Draft(accountNumber, shareQuantity, trailingPeg, timeInForce, marketHours, autoValidate);
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
            return Intrinsics.areEqual(this.accountNumber, draft.accountNumber) && Intrinsics.areEqual(this.shareQuantity, draft.shareQuantity) && Intrinsics.areEqual(this.trailingPeg, draft.trailingPeg) && this.timeInForce == draft.timeInForce && this.marketHours == draft.marketHours && this.autoValidate == draft.autoValidate;
        }

        public int hashCode() {
            return (((((((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + this.trailingPeg.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "Draft(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", trailingPeg=" + this.trailingPeg + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeParcelable(this.trailingPeg, flags);
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

        public Draft(String accountNumber, BigDecimal shareQuantity, OrderTrailingPeg trailingPeg, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.trailingPeg = trailingPeg;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.autoValidate = z;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
        public OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
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
            return copy$default(this, null, shareQuantity, null, null, null, false, 61, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(getAccountNumber(), getShareQuantity(), getTrailingPeg(), getTimeInForce(), getMarketHours(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return copy$default(this, null, null, null, null, null, false, 31, null);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010 \u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003JW\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTrailingPeg;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Ljava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "mutateShareQuantity", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Draft;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Validated implements ShareTrailingStop, ShareValidated {
        public static final Parcelable.Creator<Validated> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final OrderMarketHours marketHours;
        private final String orderSummary;
        private final BigDecimal shareQuantity;
        private final OrderTimeInForce timeInForce;
        private final OrderTrailingPeg trailingPeg;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Validated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Validated(parcel.readString(), (BigDecimal) parcel.readSerializable(), (OrderTrailingPeg) parcel.readParcelable(Validated.class.getClassLoader()), (OrderTimeInForce) parcel.readParcelable(Validated.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(Validated.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Validated[] newArray(int i) {
                return new Validated[i];
            }
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, BigDecimal bigDecimal, OrderTrailingPeg orderTrailingPeg, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = validated.shareQuantity;
            }
            if ((i & 4) != 0) {
                orderTrailingPeg = validated.trailingPeg;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = validated.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = validated.marketHours;
            }
            if ((i & 32) != 0) {
                list = validated.checkOverrides;
            }
            if ((i & 64) != 0) {
                str2 = validated.orderSummary;
            }
            List list2 = list;
            String str3 = str2;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            OrderTrailingPeg orderTrailingPeg2 = orderTrailingPeg;
            return validated.copy(str, bigDecimal, orderTrailingPeg2, orderTimeInForce, orderMarketHours2, list2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        public final List<String> component6() {
            return this.checkOverrides;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final Validated copy(String accountNumber, BigDecimal shareQuantity, OrderTrailingPeg trailingPeg, OrderTimeInForce timeInForce, OrderMarketHours marketHours, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(accountNumber, shareQuantity, trailingPeg, timeInForce, marketHours, checkOverrides, orderSummary);
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
            return Intrinsics.areEqual(this.accountNumber, validated.accountNumber) && Intrinsics.areEqual(this.shareQuantity, validated.shareQuantity) && Intrinsics.areEqual(this.trailingPeg, validated.trailingPeg) && this.timeInForce == validated.timeInForce && this.marketHours == validated.marketHours && Intrinsics.areEqual(this.checkOverrides, validated.checkOverrides) && Intrinsics.areEqual(this.orderSummary, validated.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + this.trailingPeg.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Validated(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", trailingPeg=" + this.trailingPeg + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeParcelable(this.trailingPeg, flags);
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

        public Validated(String accountNumber, BigDecimal shareQuantity, OrderTrailingPeg trailingPeg, OrderTimeInForce timeInForce, OrderMarketHours marketHours, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.trailingPeg = trailingPeg;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.checkOverrides = checkOverrides;
            this.orderSummary = str;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
        public OrderTrailingPeg getTrailingPeg() {
            return this.trailingPeg;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder9
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
            return copy$default(this, null, shareQuantity, null, null, null, null, null, 125, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, null, null, null, checkOverrides, orderSummary, 31, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return new Draft(getAccountNumber(), getShareQuantity(), getTrailingPeg(), getTimeInForce(), getMarketHours(), false);
        }
    }
}
