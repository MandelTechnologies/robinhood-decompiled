package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.trading.contracts.configuration.ShareOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareBasic;", "Lcom/robinhood/android/trading/contracts/configuration/ShareOrder;", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getShareQuantity", "()Ljava/math/BigDecimal;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "mutateShareQuantity", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ShareBasic implements ShareOrder {
    public static final Parcelable.Creator<ShareBasic> CREATOR = new Creator();
    private final String accountNumber;
    private final BigDecimal shareQuantity;

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ShareBasic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBasic createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareBasic(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBasic[] newArray(int i) {
            return new ShareBasic[i];
        }
    }

    public static /* synthetic */ ShareBasic copy$default(ShareBasic shareBasic, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareBasic.accountNumber;
        }
        if ((i & 2) != 0) {
            bigDecimal = shareBasic.shareQuantity;
        }
        return shareBasic.copy(str, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getShareQuantity() {
        return this.shareQuantity;
    }

    public final ShareBasic copy(String accountNumber, BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new ShareBasic(accountNumber, shareQuantity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareBasic)) {
            return false;
        }
        ShareBasic shareBasic = (ShareBasic) other;
        return Intrinsics.areEqual(this.accountNumber, shareBasic.accountNumber) && Intrinsics.areEqual(this.shareQuantity, shareBasic.shareQuantity);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration.Direct, com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    public Order.Configuration getOrderConfiguration() {
        return null;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        BigDecimal bigDecimal = this.shareQuantity;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "ShareBasic(accountNumber=" + this.accountNumber + ", shareQuantity=" + this.shareQuantity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.shareQuantity);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public DefaultableOrderConfiguration getOrderAmountType() {
        return ShareOrder.DefaultImpls.getOrderAmountType(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
    public boolean getTaxLots() {
        return ShareOrder.DefaultImpls.getTaxLots(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellDollarOrder() {
        return ShareOrder.DefaultImpls.isBuySellDollarOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellOrder() {
        return ShareOrder.DefaultImpls.isBuySellOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isBuySellSharesOrder() {
        return ShareOrder.DefaultImpls.isBuySellSharesOrder(this);
    }

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    public boolean isDefaultOrderType() {
        return ShareOrder.DefaultImpls.isDefaultOrderType(this);
    }

    public ShareBasic(String accountNumber, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.shareQuantity = bigDecimal;
    }

    public /* synthetic */ ShareBasic(String str, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
    public ShareBasic mutateShareQuantity(BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        return copy$default(this, null, shareQuantity, 1, null);
    }
}
