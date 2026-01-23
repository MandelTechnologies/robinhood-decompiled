package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareDraft;
import com.robinhood.android.trading.contracts.configuration.ShareValidated;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "New", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareMarket extends ShareBasedOrderConfiguration, DirectOrder4 {

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(shareMarket);
        }

        public static Order.Configuration getOrderConfiguration(ShareMarket shareMarket) {
            return DirectOrder4.DefaultImpls.getOrderConfiguration(shareMarket);
        }

        public static boolean getTaxLots(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(shareMarket);
        }

        public static OrderTimeInForce getTimeInForce(ShareMarket shareMarket) {
            return DirectOrder4.DefaultImpls.getTimeInForce(shareMarket);
        }

        public static boolean isBuySellDollarOrder(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(shareMarket);
        }

        public static boolean isBuySellOrder(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(shareMarket);
        }

        public static boolean isBuySellSharesOrder(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(shareMarket);
        }

        public static boolean isDefaultOrderType(ShareMarket shareMarket) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(shareMarket);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$New;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "mutateShareQuantity", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Draft;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class New implements ShareMarket {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal shareQuantity;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                bigDecimal = r0.shareQuantity;
            }
            return r0.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        public final New copy(String accountNumber, BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new New(accountNumber, shareQuantity);
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
            return Intrinsics.areEqual(this.accountNumber, r5.accountNumber) && Intrinsics.areEqual(this.shareQuantity, r5.shareQuantity);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.shareQuantity;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public String toString() {
            return "New(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
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
            this.shareQuantity = bigDecimal;
        }

        public /* synthetic */ New(String str, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public New mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, 1, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft completedDraft() {
            String accountNumber = getAccountNumber();
            BigDecimal shareQuantity = getShareQuantity();
            if (shareQuantity == null) {
                return null;
            }
            return new Draft(accountNumber, shareQuantity, false);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "autoValidate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getAutoValidate", "()Z", "mutateShareQuantity", "validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Validated;", "checkOverrides", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Draft implements ShareMarket, ShareDraft {
        public static final Parcelable.Creator<Draft> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean autoValidate;
        private final BigDecimal shareQuantity;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                bigDecimal = draft.shareQuantity;
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
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAutoValidate() {
            return this.autoValidate;
        }

        public final Draft copy(String accountNumber, BigDecimal shareQuantity, boolean autoValidate) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return new Draft(accountNumber, shareQuantity, autoValidate);
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
            return Intrinsics.areEqual(this.accountNumber, draft.accountNumber) && Intrinsics.areEqual(this.shareQuantity, draft.shareQuantity) && this.autoValidate == draft.autoValidate;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + Boolean.hashCode(this.autoValidate);
        }

        public String toString() {
            return "Draft(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", autoValidate=" + this.autoValidate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
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

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public /* bridge */ /* synthetic */ ShareValidated validated(List list, String str) {
            return validated((List<String>) list, str);
        }

        public Draft(String accountNumber, BigDecimal shareQuantity, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
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

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public boolean getAutoValidate() {
            return this.autoValidate;
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
        public Draft mutateShareQuantity(BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return copy$default(this, null, shareQuantity, false, 5, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.ShareDraft, com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(getAccountNumber(), getShareQuantity(), checkOverrides, orderSummary);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return copy$default(this, null, null, false, 3, null);
        }
    }

    /* compiled from: ShareBased.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "checkOverrides", "", "orderSummary", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "getCheckOverrides", "()Ljava/util/List;", "getOrderSummary", "mutateShareQuantity", "validated", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Draft;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Validated implements ShareMarket, ShareValidated {
        public static final Parcelable.Creator<Validated> CREATOR = new Creator();
        private final String accountNumber;
        private final List<String> checkOverrides;
        private final String orderSummary;
        private final BigDecimal shareQuantity;

        /* compiled from: ShareBased.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                bigDecimal = validated.shareQuantity;
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
        public final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        public final List<String> component3() {
            return this.checkOverrides;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOrderSummary() {
            return this.orderSummary;
        }

        public final Validated copy(String accountNumber, BigDecimal shareQuantity, List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return new Validated(accountNumber, shareQuantity, checkOverrides, orderSummary);
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
            return Intrinsics.areEqual(this.accountNumber, validated.accountNumber) && Intrinsics.areEqual(this.shareQuantity, validated.shareQuantity) && Intrinsics.areEqual(this.checkOverrides, validated.checkOverrides) && Intrinsics.areEqual(this.orderSummary, validated.orderSummary);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.shareQuantity.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31;
            String str = this.orderSummary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Validated(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ", checkOverrides=" + this.checkOverrides + ", orderSummary=" + this.orderSummary + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.shareQuantity);
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

        public Validated(String accountNumber, BigDecimal shareQuantity, List<String> checkOverrides, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            this.accountNumber = accountNumber;
            this.shareQuantity = shareQuantity;
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
            return copy$default(this, null, shareQuantity, null, null, 13, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Validated validated(List<String> checkOverrides, String orderSummary) {
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            return copy$default(this, null, null, checkOverrides, orderSummary, 3, null);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        public Draft edit() {
            return new Draft(getAccountNumber(), getShareQuantity(), false);
        }
    }
}
