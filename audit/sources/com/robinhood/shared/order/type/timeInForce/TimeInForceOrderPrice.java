package com.robinhood.shared.order.type.timeInForce;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeInForceOrderPrice.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/TimeInForceOrderPrice;", "Landroid/os/Parcelable;", "<init>", "()V", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "orderType", "Lcom/robinhood/models/db/OrderType;", "getOrderType", "()Lcom/robinhood/models/db/OrderType;", "Limit", "Lcom/robinhood/shared/order/type/timeInForce/TimeInForceOrderPrice$Limit;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class TimeInForceOrderPrice implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ TimeInForceOrderPrice(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract OrderType getOrderType();

    public abstract OrderTimeInForce getTimeInForce();

    private TimeInForceOrderPrice() {
    }

    /* compiled from: TimeInForceOrderPrice.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/TimeInForceOrderPrice$Limit;", "Lcom/robinhood/shared/order/type/timeInForce/TimeInForceOrderPrice;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getPrice", "()Ljava/math/BigDecimal;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "orderType", "Lcom/robinhood/models/db/OrderType;", "getOrderType", "()Lcom/robinhood/models/db/OrderType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Limit extends TimeInForceOrderPrice {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();
        private final BigDecimal price;
        private final OrderTimeInForce timeInForce;

        /* compiled from: TimeInForceOrderPrice.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Limit(BigDecimal price, OrderTimeInForce timeInForce) {
            super(null);
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.price = price;
            this.timeInForce = timeInForce;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        @Override // com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPrice
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPrice
        public OrderType getOrderType() {
            return OrderType.LIMIT;
        }
    }
}
