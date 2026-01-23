package com.robinhood.shared.crypto.contracts.orderType;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "Landroid/os/Parcelable;", "<init>", "()V", "Market", "Limit", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices$Limit;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices$Market;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderPrices, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class CryptoOrderTypeFragmentKey5 implements Parcelable {
    public /* synthetic */ CryptoOrderTypeFragmentKey5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderTypeFragmentKey5() {
    }

    /* compiled from: CryptoOrderTypeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices$Market;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderPrices$Market */
    public static final /* data */ class Market extends CryptoOrderTypeFragmentKey5 {
        public static final Market INSTANCE = new Market();
        public static final Parcelable.Creator<Market> CREATOR = new Creator();

        /* compiled from: CryptoOrderTypeFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderPrices$Market$Creator */
        public static final class Creator implements Parcelable.Creator<Market> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Market createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Market.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Market[] newArray(int i) {
                return new Market[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Market);
        }

        public int hashCode() {
            return 664793182;
        }

        public String toString() {
            return "Market";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Market() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderTypeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices$Limit;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getPrice", "()Ljava/math/BigDecimal;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderPrices$Limit, reason: from toString */
    public static final /* data */ class Limit extends CryptoOrderTypeFragmentKey5 {
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();
        private final BigDecimal price;
        private final OrderTimeInForce timeInForce;

        /* compiled from: CryptoOrderTypeFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderPrices$Limit$Creator */
        public static final class Creator implements Parcelable.Creator<Limit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Limit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((BigDecimal) parcel.readSerializable(), (OrderTimeInForce) parcel.readParcelable(Limit.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Limit[] newArray(int i) {
                return new Limit[i];
            }
        }

        public static /* synthetic */ Limit copy$default(Limit limit, BigDecimal bigDecimal, OrderTimeInForce orderTimeInForce, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = limit.price;
            }
            if ((i & 2) != 0) {
                orderTimeInForce = limit.timeInForce;
            }
            return limit.copy(bigDecimal, orderTimeInForce);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final Limit copy(BigDecimal price, OrderTimeInForce timeInForce) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new Limit(price, timeInForce);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return Intrinsics.areEqual(this.price, limit.price) && this.timeInForce == limit.timeInForce;
        }

        public int hashCode() {
            return (this.price.hashCode() * 31) + this.timeInForce.hashCode();
        }

        public String toString() {
            return "Limit(price=" + this.price + ", timeInForce=" + this.timeInForce + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.price);
            dest.writeParcelable(this.timeInForce, flags);
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Limit(BigDecimal price, OrderTimeInForce timeInForce) {
            super(null);
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.price = price;
            this.timeInForce = timeInForce;
        }
    }
}
