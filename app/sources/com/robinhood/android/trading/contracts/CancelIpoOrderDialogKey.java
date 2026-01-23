package com.robinhood.android.trading.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.OrderSide;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelIpoOrderDialogKey.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000212B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "orderId", "Ljava/util/UUID;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Source;", "sharesQuantity", "Ljava/math/BigDecimal;", "symbol", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Source;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/models/db/OrderSide;)V", "getOrderId", "()Ljava/util/UUID;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Source;", "getSharesQuantity", "()Ljava/math/BigDecimal;", "getSymbol", "()Ljava/lang/String;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Source", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CancelIpoOrderDialogKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<CancelIpoOrderDialogKey> CREATOR = new Creator();
    private final BrokerageAccountType brokerageAccountType;
    private final UUID orderId;
    private final OrderSide orderSide;
    private final BigDecimal sharesQuantity;
    private final Source source;
    private final String symbol;

    /* compiled from: CancelIpoOrderDialogKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", "", "onOrderCancelled", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public interface Callbacks {
        void onOrderCancelled();
    }

    /* compiled from: CancelIpoOrderDialogKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<CancelIpoOrderDialogKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelIpoOrderDialogKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancelIpoOrderDialogKey((UUID) parcel.readSerializable(), BrokerageAccountType.valueOf(parcel.readString()), Source.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString(), OrderSide.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelIpoOrderDialogKey[] newArray(int i) {
            return new CancelIpoOrderDialogKey[i];
        }
    }

    public static /* synthetic */ CancelIpoOrderDialogKey copy$default(CancelIpoOrderDialogKey cancelIpoOrderDialogKey, UUID uuid, BrokerageAccountType brokerageAccountType, Source source, BigDecimal bigDecimal, String str, OrderSide orderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cancelIpoOrderDialogKey.orderId;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = cancelIpoOrderDialogKey.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            source = cancelIpoOrderDialogKey.source;
        }
        if ((i & 8) != 0) {
            bigDecimal = cancelIpoOrderDialogKey.sharesQuantity;
        }
        if ((i & 16) != 0) {
            str = cancelIpoOrderDialogKey.symbol;
        }
        if ((i & 32) != 0) {
            orderSide = cancelIpoOrderDialogKey.orderSide;
        }
        String str2 = str;
        OrderSide orderSide2 = orderSide;
        return cancelIpoOrderDialogKey.copy(uuid, brokerageAccountType, source, bigDecimal, str2, orderSide2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getSharesQuantity() {
        return this.sharesQuantity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final CancelIpoOrderDialogKey copy(UUID orderId, BrokerageAccountType brokerageAccountType, Source source, BigDecimal sharesQuantity, String symbol, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return new CancelIpoOrderDialogKey(orderId, brokerageAccountType, source, sharesQuantity, symbol, orderSide);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelIpoOrderDialogKey)) {
            return false;
        }
        CancelIpoOrderDialogKey cancelIpoOrderDialogKey = (CancelIpoOrderDialogKey) other;
        return Intrinsics.areEqual(this.orderId, cancelIpoOrderDialogKey.orderId) && this.brokerageAccountType == cancelIpoOrderDialogKey.brokerageAccountType && this.source == cancelIpoOrderDialogKey.source && Intrinsics.areEqual(this.sharesQuantity, cancelIpoOrderDialogKey.sharesQuantity) && Intrinsics.areEqual(this.symbol, cancelIpoOrderDialogKey.symbol) && this.orderSide == cancelIpoOrderDialogKey.orderSide;
    }

    public int hashCode() {
        return (((((((((this.orderId.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.source.hashCode()) * 31) + this.sharesQuantity.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.orderSide.hashCode();
    }

    public String toString() {
        return "CancelIpoOrderDialogKey(orderId=" + this.orderId + ", brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ", sharesQuantity=" + this.sharesQuantity + ", symbol=" + this.symbol + ", orderSide=" + this.orderSide + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.orderId);
        dest.writeString(this.brokerageAccountType.name());
        dest.writeString(this.source.name());
        dest.writeSerializable(this.sharesQuantity);
        dest.writeString(this.symbol);
        dest.writeString(this.orderSide.name());
    }

    public CancelIpoOrderDialogKey(UUID orderId, BrokerageAccountType brokerageAccountType, Source source, BigDecimal sharesQuantity, String symbol, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.orderId = orderId;
        this.brokerageAccountType = brokerageAccountType;
        this.source = source;
        this.sharesQuantity = sharesQuantity;
        this.symbol = symbol;
        this.orderSide = orderSide;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final Source getSource() {
        return this.source;
    }

    public final BigDecimal getSharesQuantity() {
        return this.sharesQuantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CancelIpoOrderDialogKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Source;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_ENTRY", "ORDER_DETAIL", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Source {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source ORDER_ENTRY = new Source("ORDER_ENTRY", 0);
        public static final Source ORDER_DETAIL = new Source("ORDER_DETAIL", 1);

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{ORDER_ENTRY, ORDER_DETAIL};
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i) {
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
