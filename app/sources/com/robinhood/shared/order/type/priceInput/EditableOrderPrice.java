package com.robinhood.shared.order.type.priceInput;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.order.type.util.TimeInForceUtil2;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditableOrderPrice.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "Landroid/os/Parcelable;", "<init>", "()V", "Limit", "Companion", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice$Limit;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class EditableOrderPrice implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Limit DEFAULT_LIMIT_ORDER_PRICE;

    public /* synthetic */ EditableOrderPrice(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditableOrderPrice() {
    }

    /* compiled from: EditableOrderPrice.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice$Limit;", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getPrice", "()Ljava/math/BigDecimal;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Limit extends EditableOrderPrice {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();
        private final BigDecimal price;
        private final OrderTimeInForce timeInForce;

        /* compiled from: EditableOrderPrice.kt */
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

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }
    }

    /* compiled from: EditableOrderPrice.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice$Companion;", "", "<init>", "()V", "DEFAULT_LIMIT_ORDER_PRICE", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice$Limit;", "getDEFAULT_LIMIT_ORDER_PRICE", "()Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice$Limit;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Limit getDEFAULT_LIMIT_ORDER_PRICE() {
            return EditableOrderPrice.DEFAULT_LIMIT_ORDER_PRICE;
        }
    }

    static {
        BigDecimal scale = BigDecimal.ZERO.setScale(2);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        DEFAULT_LIMIT_ORDER_PRICE = new Limit(scale, (OrderTimeInForce) CollectionsKt.first((List) TimeInForceUtil2.getSupportedTimeInForceValues()));
    }
}
