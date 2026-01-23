package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder2;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedOrder.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Draft", "Complete", "MarketNew", "MarketDraft", "MarketComplete", "LimitNew", "LimitDraft", "LimitComplete", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitNew;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketNew;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface AdvancedOrder extends ShareBasedOrderConfiguration {

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(advancedOrder);
        }

        public static boolean getTaxLots(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(advancedOrder);
        }

        public static boolean isBuySellDollarOrder(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(advancedOrder);
        }

        public static boolean isBuySellOrder(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(advancedOrder);
        }

        public static boolean isBuySellSharesOrder(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(advancedOrder);
        }

        public static boolean isDefaultOrderType(AdvancedOrder advancedOrder) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(advancedOrder);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "shareQuantity", "Ljava/math/BigDecimal;", "getShareQuantity", "()Ljava/math/BigDecimal;", "taxLots", "", "getTaxLots", "()Z", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitDraft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketDraft;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Draft extends AdvancedOrder, ShareDraft {
        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        BigDecimal getShareQuantity();

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        boolean getTaxLots();

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean getTaxLots(Draft draft) {
                return false;
            }

            public static DirectOrder.Draft completedDraft(Draft draft) {
                return ShareDraft.DefaultImpls.completedDraft(draft);
            }

            public static DefaultableOrderConfiguration getOrderAmountType(Draft draft) {
                return DefaultImpls.getOrderAmountType(draft);
            }

            public static boolean isBuySellDollarOrder(Draft draft) {
                return DefaultImpls.isBuySellDollarOrder(draft);
            }

            public static boolean isBuySellOrder(Draft draft) {
                return DefaultImpls.isBuySellOrder(draft);
            }

            public static boolean isBuySellSharesOrder(Draft draft) {
                return DefaultImpls.isBuySellSharesOrder(draft);
            }

            public static boolean isDefaultOrderType(Draft draft) {
                return DefaultImpls.isDefaultOrderType(draft);
            }
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Complete extends AdvancedOrder, ShareValidated {

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static DirectOrder.Draft completedDraft(Complete complete) {
                return ShareValidated.DefaultImpls.completedDraft(complete);
            }

            public static boolean getAutoValidate(Complete complete) {
                return ShareValidated.DefaultImpls.getAutoValidate(complete);
            }

            public static DefaultableOrderConfiguration getOrderAmountType(Complete complete) {
                return DefaultImpls.getOrderAmountType(complete);
            }

            public static boolean getTaxLots(Complete complete) {
                return DefaultImpls.getTaxLots(complete);
            }

            public static boolean isBuySellDollarOrder(Complete complete) {
                return DefaultImpls.isBuySellDollarOrder(complete);
            }

            public static boolean isBuySellOrder(Complete complete) {
                return DefaultImpls.isBuySellOrder(complete);
            }

            public static boolean isBuySellSharesOrder(Complete complete) {
                return DefaultImpls.isBuySellSharesOrder(complete);
            }

            public static boolean isDefaultOrderType(Complete complete) {
                return DefaultImpls.isDefaultOrderType(complete);
            }
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketNew;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "taxLots", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTaxLots", "()Z", "mutateShareQuantity", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketDraft;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketNew implements AdvancedOrder, DirectOrder4 {
        public static final Parcelable.Creator<MarketNew> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarketNew> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketNew createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketNew(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketNew[] newArray(int i) {
                return new MarketNew[i];
            }
        }

        public static /* synthetic */ MarketNew copy$default(MarketNew marketNew, String str, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketNew.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = marketNew.shareQuantity;
            }
            if ((i & 4) != 0) {
                z = marketNew.taxLots;
            }
            return marketNew.copy(str, bigDecimal, z);
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        public final MarketNew copy(String accountNumber, BigDecimal shareQuantity, boolean taxLots) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new MarketNew(accountNumber, shareQuantity, taxLots);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketNew)) {
                return false;
            }
            MarketNew marketNew = (MarketNew) other;
            return Intrinsics.areEqual(this.accountNumber, marketNew.accountNumber) && Intrinsics.areEqual(this.shareQuantity, marketNew.shareQuantity) && this.taxLots == marketNew.taxLots;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.shareQuantity;
            return ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.taxLots);
        }

        public String toString() {
            return "MarketNew(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", taxLots=" + this.taxLots + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeInt(this.taxLots ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder4.DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DirectOrder4.DefaultImpls.getTimeInForce(this);
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

        public MarketNew(String accountNumber, BigDecimal bigDecimal, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.shareQuantity = bigDecimal;
            this.taxLots = z;
        }

        public /* synthetic */ MarketNew(String str, BigDecimal bigDecimal, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal, z);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public MarketNew mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, false, 5, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketDraft completedDraft() {
            String accountNumber = getAccountNumber();
            BigDecimal shareQuantity = getShareQuantity();
            if (shareQuantity == null) {
                return null;
            }
            return new MarketDraft(accountNumber, shareQuantity, getTaxLots(), false);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0000H\u0016J \u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0000H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketDraft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "taxLots", "", "autoValidate", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTaxLots", "()Z", "getAutoValidate", "mutateShareQuantity", "completedDraft", "validated", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MarketDraft implements Draft, DirectOrder4 {
        public static final Parcelable.Creator<MarketDraft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarketDraft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketDraft createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketDraft(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketDraft[] newArray(int i) {
                return new MarketDraft[i];
            }
        }

        public static /* synthetic */ MarketDraft copy$default(MarketDraft marketDraft, String str, BigDecimal bigDecimal, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketDraft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = marketDraft.shareQuantity;
            }
            if ((i & 4) != 0) {
                z = marketDraft.taxLots;
            }
            if ((i & 8) != 0) {
                z2 = marketDraft.autoValidate;
            }
            return marketDraft.copy(str, bigDecimal, z, z2);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketDraft completedDraft() {
            return this;
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final MarketDraft copy(String accountNumber, BigDecimal shareQuantity, boolean taxLots, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return new MarketDraft(accountNumber, shareQuantity, taxLots, autoValidate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketDraft)) {
                return false;
            }
            MarketDraft marketDraft = (MarketDraft) other;
            return Intrinsics.areEqual(this.accountNumber, marketDraft.accountNumber) && Intrinsics.areEqual(this.shareQuantity, marketDraft.shareQuantity) && this.taxLots == marketDraft.taxLots && this.autoValidate == marketDraft.autoValidate;
        }

        public int hashCode() {
            return (((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + Boolean.hashCode(this.taxLots)) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "MarketDraft(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", taxLots=" + this.taxLots + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeInt(this.taxLots ? 1 : 0);
            dest.writeInt(this.autoValidate ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return Draft.DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder4.DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DirectOrder4.DefaultImpls.getTimeInForce(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return Draft.DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return Draft.DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return Draft.DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return Draft.DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ ShareValidated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public MarketDraft(String accountNumber, BigDecimal shareQuantity, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.taxLots = z;
            this.autoValidate = z2;
            if (getTaxLots() && getAutoValidate()) {
                throw new IllegalStateException("Tax lot orders should not be auto-validated.");
            }
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.AdvancedOrder.Draft, com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.AdvancedOrder.Draft, com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public MarketDraft mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, false, false, 13, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketComplete validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new MarketComplete(getAccountNumber(), getShareQuantity(), getTaxLots(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketDraft edit() {
            return copy$default(this, null, null, false, false, 7, null);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0018\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "taxLots", "", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getTaxLots", "()Z", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "mutateShareQuantity", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketDraft;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketComplete implements Complete, DirectOrder4 {
        public static final Parcelable.Creator<MarketComplete> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final String orderSummary;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarketComplete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketComplete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketComplete(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarketComplete[] newArray(int i) {
                return new MarketComplete[i];
            }
        }

        public static /* synthetic */ MarketComplete copy$default(MarketComplete marketComplete, String str, BigDecimal bigDecimal, boolean z, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketComplete.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = marketComplete.shareQuantity;
            }
            if ((i & 4) != 0) {
                z = marketComplete.taxLots;
            }
            if ((i & 8) != 0) {
                list = marketComplete.checkOverrides;
            }
            if ((i & 16) != 0) {
                str2 = marketComplete.orderSummary;
            }
            String str3 = str2;
            boolean z2 = z;
            return marketComplete.copy(str, bigDecimal, z2, list, str3);
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        public final List<String> component4() {
            return this.checkOverrides;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final MarketComplete copy(String accountNumber, BigDecimal shareQuantity, boolean taxLots, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new MarketComplete(accountNumber, shareQuantity, taxLots, checkOverrides, orderSummary);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketComplete)) {
                return false;
            }
            MarketComplete marketComplete = (MarketComplete) other;
            return Intrinsics.areEqual(this.accountNumber, marketComplete.accountNumber) && Intrinsics.areEqual(this.shareQuantity, marketComplete.shareQuantity) && this.taxLots == marketComplete.taxLots && Intrinsics.areEqual(this.checkOverrides, marketComplete.checkOverrides) && Intrinsics.areEqual(this.orderSummary, marketComplete.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + Boolean.hashCode(this.taxLots)) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MarketComplete(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", taxLots=" + this.taxLots + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeInt(this.taxLots ? 1 : 0);
            dest.writeStringList(this.checkOverrides);
            dest.writeString(this.orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft completedDraft() {
            return Complete.DefaultImpls.completedDraft(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return Complete.DefaultImpls.getAutoValidate(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return Complete.DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder4.DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return DirectOrder4.DefaultImpls.getTimeInForce(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return Complete.DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return Complete.DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return Complete.DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return Complete.DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public MarketComplete(String accountNumber, BigDecimal shareQuantity, boolean z, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.taxLots = z;
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

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
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
        public MarketComplete mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, false, null, null, 29, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketComplete validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, false, checkOverrides, orderSummary, 7, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public MarketDraft edit() {
            return new MarketDraft(getAccountNumber(), getShareQuantity(), getTaxLots(), false);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitNew;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/Limit;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "limitPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "taxLots", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getLimitPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getTaxLots", "()Z", "mutateShareQuantity", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitDraft;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitNew implements AdvancedOrder, DirectOrder2 {
        public static final Parcelable.Creator<LimitNew> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;
        private final OrderTimeInForce timeInForce;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<LimitNew> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitNew createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitNew(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(LimitNew.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(LimitNew.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitNew[] newArray(int i) {
                return new LimitNew[i];
            }
        }

        public static /* synthetic */ LimitNew copy$default(LimitNew limitNew, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitNew.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = limitNew.shareQuantity;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = limitNew.limitPrice;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = limitNew.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = limitNew.marketHours;
            }
            if ((i & 32) != 0) {
                z = limitNew.taxLots;
            }
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            boolean z2 = z;
            return limitNew.copy(str, bigDecimal, bigDecimal2, orderTimeInForce, orderMarketHours2, z2);
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
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        public final LimitNew copy(String accountNumber, BigDecimal shareQuantity, BigDecimal limitPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean taxLots) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new LimitNew(accountNumber, shareQuantity, limitPrice, timeInForce, marketHours, taxLots);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitNew)) {
                return false;
            }
            LimitNew limitNew = (LimitNew) other;
            return Intrinsics.areEqual(this.accountNumber, limitNew.accountNumber) && Intrinsics.areEqual(this.shareQuantity, limitNew.shareQuantity) && Intrinsics.areEqual(this.limitPrice, limitNew.limitPrice) && this.timeInForce == limitNew.timeInForce && this.marketHours == limitNew.marketHours && this.taxLots == limitNew.taxLots;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.shareQuantity;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.limitPrice;
            int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            OrderTimeInForce orderTimeInForce = this.timeInForce;
            int iHashCode4 = (iHashCode3 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31;
            OrderMarketHours orderMarketHours = this.marketHours;
            return ((iHashCode4 + (orderMarketHours != null ? orderMarketHours.hashCode() : 0)) * 31) + Boolean.hashCode(this.taxLots);
        }

        public String toString() {
            return "LimitNew(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", limitPrice=" + this.limitPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", taxLots=" + this.taxLots + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.limitPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
            dest.writeInt(this.taxLots ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder2.DefaultImpls.getOrderConfiguration(this);
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

        public LimitNew(String accountNumber, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.shareQuantity = bigDecimal;
            this.limitPrice = bigDecimal2;
            this.timeInForce = orderTimeInForce;
            this.marketHours = orderMarketHours;
            this.taxLots = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LimitNew(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z2;
            OrderMarketHours orderMarketHours2;
            bigDecimal = (i & 2) != 0 ? null : bigDecimal;
            bigDecimal2 = (i & 4) != 0 ? null : bigDecimal2;
            orderTimeInForce = (i & 8) != 0 ? null : orderTimeInForce;
            if ((i & 16) != 0) {
                z2 = z;
                orderMarketHours2 = null;
            } else {
                z2 = z;
                orderMarketHours2 = orderMarketHours;
            }
            this(str, bigDecimal, bigDecimal2, orderTimeInForce, orderMarketHours2, z2);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public LimitNew mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, null, null, null, false, 61, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitDraft completedDraft() {
            BigDecimal limitPrice;
            OrderTimeInForce timeInForce;
            OrderMarketHours marketHours;
            String accountNumber = getAccountNumber();
            BigDecimal shareQuantity = getShareQuantity();
            if (shareQuantity == null || (limitPrice = getLimitPrice()) == null || (timeInForce = getTimeInForce()) == null || (marketHours = getMarketHours()) == null) {
                return null;
            }
            return new LimitDraft(accountNumber, shareQuantity, limitPrice, timeInForce, marketHours, getTaxLots(), false);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0000H\u0016J \u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\"2\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010$\u001a\u00020\u0000H\u0016J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitDraft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/Limit;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "limitPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "taxLots", "", "autoValidate", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getLimitPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getTaxLots", "()Z", "getAutoValidate", "mutateShareQuantity", "completedDraft", "validated", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class LimitDraft implements Draft, DirectOrder2 {
        public static final Parcelable.Creator<LimitDraft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;
        private final OrderTimeInForce timeInForce;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<LimitDraft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitDraft createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                OrderTimeInForce orderTimeInForce = (OrderTimeInForce) parcel.readParcelable(LimitDraft.class.getClassLoader());
                OrderMarketHours orderMarketHours = (OrderMarketHours) parcel.readParcelable(LimitDraft.class.getClassLoader());
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new LimitDraft(string2, bigDecimal, bigDecimal2, orderTimeInForce, orderMarketHours, z2, parcel.readInt() == 0 ? z : true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitDraft[] newArray(int i) {
                return new LimitDraft[i];
            }
        }

        public static /* synthetic */ LimitDraft copy$default(LimitDraft limitDraft, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitDraft.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = limitDraft.shareQuantity;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = limitDraft.limitPrice;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = limitDraft.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = limitDraft.marketHours;
            }
            if ((i & 32) != 0) {
                z = limitDraft.taxLots;
            }
            if ((i & 64) != 0) {
                z2 = limitDraft.autoValidate;
            }
            boolean z3 = z;
            boolean z4 = z2;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            BigDecimal bigDecimal3 = bigDecimal2;
            return limitDraft.copy(str, bigDecimal, bigDecimal3, orderTimeInForce, orderMarketHours2, z3, z4);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitDraft completedDraft() {
            return this;
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
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final LimitDraft copy(String accountNumber, BigDecimal shareQuantity, BigDecimal limitPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean taxLots, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            return new LimitDraft(accountNumber, shareQuantity, limitPrice, timeInForce, marketHours, taxLots, autoValidate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitDraft)) {
                return false;
            }
            LimitDraft limitDraft = (LimitDraft) other;
            return Intrinsics.areEqual(this.accountNumber, limitDraft.accountNumber) && Intrinsics.areEqual(this.shareQuantity, limitDraft.shareQuantity) && Intrinsics.areEqual(this.limitPrice, limitDraft.limitPrice) && this.timeInForce == limitDraft.timeInForce && this.marketHours == limitDraft.marketHours && this.taxLots == limitDraft.taxLots && this.autoValidate == limitDraft.autoValidate;
        }

        public int hashCode() {
            return (((((((((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + this.limitPrice.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + Boolean.hashCode(this.taxLots)) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "LimitDraft(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", limitPrice=" + this.limitPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", taxLots=" + this.taxLots + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.limitPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
            dest.writeInt(this.taxLots ? 1 : 0);
            dest.writeInt(this.autoValidate ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return Draft.DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder2.DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return Draft.DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return Draft.DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return Draft.DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return Draft.DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ ShareValidated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public LimitDraft(String accountNumber, BigDecimal shareQuantity, BigDecimal limitPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.limitPrice = limitPrice;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.taxLots = z;
            this.autoValidate = z2;
            if (getTaxLots() && getAutoValidate()) {
                throw new IllegalStateException("Tax lot orders should not be auto-validated.");
            }
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.AdvancedOrder.Draft, com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.AdvancedOrder.Draft, com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public LimitDraft mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, null, null, null, false, false, 125, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitComplete validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new LimitComplete(getAccountNumber(), getShareQuantity(), getLimitPrice(), getTimeInForce(), getMarketHours(), getTaxLots(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitDraft edit() {
            return copy$default(this, null, null, null, null, null, false, false, 63, null);
        }
    }

    /* compiled from: AdvancedOrder.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\"\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003Ja\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020/HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020/R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "Lcom/robinhood/android/trading/contracts/configuration/Limit;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "limitPrice", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "taxLots", "", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;ZLjava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getLimitPrice", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getTaxLots", "()Z", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "mutateShareQuantity", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitDraft;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitComplete implements Complete, DirectOrder2 {
        public static final Parcelable.Creator<LimitComplete> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final BigDecimal limitPrice;
        private final OrderMarketHours marketHours;
        private final String orderSummary;
        private final BigDecimal shareQuantity;
        private final boolean taxLots;
        private final OrderTimeInForce timeInForce;

        /* compiled from: AdvancedOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<LimitComplete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitComplete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitComplete(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(LimitComplete.class.getClassLoader()), (OrderMarketHours) parcel.readParcelable(LimitComplete.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitComplete[] newArray(int i) {
                return new LimitComplete[i];
            }
        }

        public static /* synthetic */ LimitComplete copy$default(LimitComplete limitComplete, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, boolean z, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitComplete.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = limitComplete.shareQuantity;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = limitComplete.limitPrice;
            }
            if ((i & 8) != 0) {
                orderTimeInForce = limitComplete.timeInForce;
            }
            if ((i & 16) != 0) {
                orderMarketHours = limitComplete.marketHours;
            }
            if ((i & 32) != 0) {
                z = limitComplete.taxLots;
            }
            if ((i & 64) != 0) {
                list = limitComplete.checkOverrides;
            }
            if ((i & 128) != 0) {
                str2 = limitComplete.orderSummary;
            }
            List list2 = list;
            String str3 = str2;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            boolean z2 = z;
            return limitComplete.copy(str, bigDecimal, bigDecimal2, orderTimeInForce, orderMarketHours2, z2, list2, str3);
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
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
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
        public final boolean getTaxLots() {
            return this.taxLots;
        }

        public final List<String> component7() {
            return this.checkOverrides;
        }

        /* renamed from: component8, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final LimitComplete copy(String accountNumber, BigDecimal shareQuantity, BigDecimal limitPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean taxLots, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new LimitComplete(accountNumber, shareQuantity, limitPrice, timeInForce, marketHours, taxLots, checkOverrides, orderSummary);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitComplete)) {
                return false;
            }
            LimitComplete limitComplete = (LimitComplete) other;
            return Intrinsics.areEqual(this.accountNumber, limitComplete.accountNumber) && Intrinsics.areEqual(this.shareQuantity, limitComplete.shareQuantity) && Intrinsics.areEqual(this.limitPrice, limitComplete.limitPrice) && this.timeInForce == limitComplete.timeInForce && this.marketHours == limitComplete.marketHours && this.taxLots == limitComplete.taxLots && Intrinsics.areEqual(this.checkOverrides, limitComplete.checkOverrides) && Intrinsics.areEqual(this.orderSummary, limitComplete.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + this.limitPrice.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + Boolean.hashCode(this.taxLots)) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LimitComplete(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", limitPrice=" + this.limitPrice + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", taxLots=" + this.taxLots + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
            dest.writeSerializable(this.limitPrice);
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeParcelable(this.marketHours, flags);
            dest.writeInt(this.taxLots ? 1 : 0);
            dest.writeStringList(this.checkOverrides);
            dest.writeString(this.orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public DirectOrder.Draft completedDraft() {
            return Complete.DefaultImpls.completedDraft(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Validated, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return Complete.DefaultImpls.getAutoValidate(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return Complete.DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
        public Order.Configuration getOrderConfiguration() {
            return DirectOrder2.DefaultImpls.getOrderConfiguration(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return Complete.DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return Complete.DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return Complete.DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return Complete.DefaultImpls.isDefaultOrderType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ DirectOrder.Validated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public LimitComplete(String accountNumber, BigDecimal shareQuantity, BigDecimal limitPrice, OrderTimeInForce timeInForce, OrderMarketHours marketHours, boolean z, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
            this.limitPrice = limitPrice;
            this.timeInForce = timeInForce;
            this.marketHours = marketHours;
            this.taxLots = z;
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

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder3
        public OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
        public boolean getTaxLots() {
            return this.taxLots;
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
        public LimitComplete mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitComplete validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, null, null, null, false, checkOverrides, orderSummary, 63, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public LimitDraft edit() {
            return new LimitDraft(getAccountNumber(), getShareQuantity(), getLimitPrice(), getTimeInForce(), getMarketHours(), getTaxLots(), false);
        }
    }
}
