package com.robinhood.shared.order.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey2;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeDestinations.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypePriceInputDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$EditOrderType;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$EditOrderType;)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.OrderTypePriceInputDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeDestinations3 extends ComposableDestinationWithArgs<Args> {
    private final CryptoOrderTypeFragmentKey.EditOrderType initialArgs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderTypeDestinations3> CREATOR = new Creator();

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypePriceInputDest$Creator */
    public static final class Creator implements Parcelable.Creator<OrderTypeDestinations3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderTypeDestinations3((CryptoOrderTypeFragmentKey.EditOrderType) parcel.readParcelable(OrderTypeDestinations3.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations3[] newArray(int i) {
            return new OrderTypeDestinations3[i];
        }
    }

    public /* synthetic */ OrderTypeDestinations3(CryptoOrderTypeFragmentKey.EditOrderType editOrderType, DefaultConstructorMarker defaultConstructorMarker) {
        this(editOrderType);
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.initialArgs, flags);
    }

    private OrderTypeDestinations3(final CryptoOrderTypeFragmentKey.EditOrderType editOrderType) {
        super("order_type_price_input_dest", Args.class, editOrderType != null ? new Function0() { // from class: com.robinhood.shared.order.type.OrderTypePriceInputDest$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeDestinations3._init_$lambda$1$lambda$0(editOrderType, editOrderType);
            }
        } : null, null, null, 24, null);
        this.initialArgs = editOrderType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Args _init_$lambda$1$lambda$0(CryptoOrderTypeFragmentKey.EditOrderType editOrderType, CryptoOrderTypeFragmentKey.EditOrderType editOrderType2) {
        return new Args(editOrderType.getInstrumentSymbol(), editOrderType.getInstrumentId(), editOrderType.getOrderSide(), editOrderType.getOrderId(), EditableOrderPrice2.toEditableOrderPrice(editOrderType.getOrderPrices()), true, editOrderType2.getInstrumentType());
    }

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", "Landroid/os/Parcelable;", "instrumentSymbol", "", "instrumentId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderId", "editableOrderPrice", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "isEditingPrice", "", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;ZLcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderId", "getEditableOrderPrice", "()Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "()Z", "getInstrumentType", "()Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypePriceInputDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final EditableOrderPrice editableOrderPrice;
        private final UUID instrumentId;
        private final String instrumentSymbol;
        private final CryptoOrderTypeFragmentKey2 instrumentType;
        private final boolean isEditingPrice;
        private final UUID orderId;
        private final OrderSide orderSide;

        /* compiled from: OrderTypeDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.OrderTypePriceInputDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (EditableOrderPrice) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, CryptoOrderTypeFragmentKey2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, OrderSide orderSide, UUID uuid2, EditableOrderPrice editableOrderPrice, boolean z, CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.instrumentSymbol;
            }
            if ((i & 2) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 4) != 0) {
                orderSide = args.orderSide;
            }
            if ((i & 8) != 0) {
                uuid2 = args.orderId;
            }
            if ((i & 16) != 0) {
                editableOrderPrice = args.editableOrderPrice;
            }
            if ((i & 32) != 0) {
                z = args.isEditingPrice;
            }
            if ((i & 64) != 0) {
                cryptoOrderTypeFragmentKey2 = args.instrumentType;
            }
            boolean z2 = z;
            CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey22 = cryptoOrderTypeFragmentKey2;
            EditableOrderPrice editableOrderPrice2 = editableOrderPrice;
            OrderSide orderSide2 = orderSide;
            return args.copy(str, uuid, orderSide2, uuid2, editableOrderPrice2, z2, cryptoOrderTypeFragmentKey22);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component5, reason: from getter */
        public final EditableOrderPrice getEditableOrderPrice() {
            return this.editableOrderPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsEditingPrice() {
            return this.isEditingPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        public final Args copy(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, EditableOrderPrice editableOrderPrice, boolean isEditingPrice, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(editableOrderPrice, "editableOrderPrice");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new Args(instrumentSymbol, instrumentId, orderSide, orderId, editableOrderPrice, isEditingPrice, instrumentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.instrumentSymbol, args.instrumentSymbol) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.orderSide == args.orderSide && Intrinsics.areEqual(this.orderId, args.orderId) && Intrinsics.areEqual(this.editableOrderPrice, args.editableOrderPrice) && this.isEditingPrice == args.isEditingPrice && this.instrumentType == args.instrumentType;
        }

        public int hashCode() {
            return (((((((((((this.instrumentSymbol.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.editableOrderPrice.hashCode()) * 31) + Boolean.hashCode(this.isEditingPrice)) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "Args(instrumentSymbol=" + this.instrumentSymbol + ", instrumentId=" + this.instrumentId + ", orderSide=" + this.orderSide + ", orderId=" + this.orderId + ", editableOrderPrice=" + this.editableOrderPrice + ", isEditingPrice=" + this.isEditingPrice + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentSymbol);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.orderSide.name());
            dest.writeSerializable(this.orderId);
            dest.writeParcelable(this.editableOrderPrice, flags);
            dest.writeInt(this.isEditingPrice ? 1 : 0);
            dest.writeString(this.instrumentType.name());
        }

        public Args(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, EditableOrderPrice editableOrderPrice, boolean z, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(editableOrderPrice, "editableOrderPrice");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentSymbol = instrumentSymbol;
            this.instrumentId = instrumentId;
            this.orderSide = orderSide;
            this.orderId = orderId;
            this.editableOrderPrice = editableOrderPrice;
            this.isEditingPrice = z;
            this.instrumentType = instrumentType;
        }

        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final EditableOrderPrice getEditableOrderPrice() {
            return this.editableOrderPrice;
        }

        public final boolean isEditingPrice() {
            return this.isEditingPrice;
        }

        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Companion;", "", "<init>", "()V", "createDest", "Lcom/robinhood/shared/order/type/OrderTypePriceInputDest;", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "createComposeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "args", "Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypePriceInputDest$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OrderTypeDestinations3 createDest(CryptoOrderTypeFragmentKey initialArgs) {
            Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (initialArgs instanceof CryptoOrderTypeFragmentKey.EditOrderType) {
                return new OrderTypeDestinations3((CryptoOrderTypeFragmentKey.EditOrderType) initialArgs, defaultConstructorMarker);
            }
            return new OrderTypeDestinations3(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ComposeNav createComposeNav(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return ComposableDestinationWithArgs.composeNav$default(new OrderTypeDestinations3(null, 0 == true ? 1 : 0), args, null, null, 6, null);
        }
    }
}
