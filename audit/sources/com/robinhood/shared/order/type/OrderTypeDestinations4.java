package com.robinhood.shared.order.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.shared.crypto.contracts.orderType.OrderEducationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeDestinations.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypeSelectionDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/order/type/OrderTypeSelectionDest$Args;", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.OrderTypeSelectionDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeDestinations4 extends ComposableDestinationWithArgs<Args> {
    private final CryptoOrderTypeFragmentKey initialArgs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderTypeDestinations4> CREATOR = new Creator();

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypeSelectionDest$Creator */
    public static final class Creator implements Parcelable.Creator<OrderTypeDestinations4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderTypeDestinations4((CryptoOrderTypeFragmentKey) parcel.readParcelable(OrderTypeDestinations4.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations4[] newArray(int i) {
            return new OrderTypeDestinations4[i];
        }
    }

    public /* synthetic */ OrderTypeDestinations4(CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoOrderTypeFragmentKey);
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.initialArgs, flags);
    }

    private OrderTypeDestinations4(final CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey) {
        super("order_type_selection_dest", Args.class, new Function0() { // from class: com.robinhood.shared.order.type.OrderTypeSelectionDest$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeDestinations4._init_$lambda$0(cryptoOrderTypeFragmentKey);
            }
        }, null, null, 24, null);
        this.initialArgs = cryptoOrderTypeFragmentKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Args _init_$lambda$0(CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey) {
        String instrumentSymbol = cryptoOrderTypeFragmentKey.getInstrumentSymbol();
        UUID instrumentId = cryptoOrderTypeFragmentKey.getInstrumentId();
        OrderSide orderSide = cryptoOrderTypeFragmentKey.getOrderSide();
        UUID orderId = cryptoOrderTypeFragmentKey.getOrderId();
        Set<CryptoOrderTypeFragmentKey6> supportedTypes = cryptoOrderTypeFragmentKey.getSupportedTypes();
        List<OrderEducationItem> educationItems = cryptoOrderTypeFragmentKey.getEducationItems();
        if (educationItems == null) {
            educationItems = CollectionsKt.emptyList();
        }
        return new Args(instrumentSymbol, instrumentId, orderSide, orderId, supportedTypes, educationItems, cryptoOrderTypeFragmentKey.getInstrumentType());
    }

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J[\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypeSelectionDest$Args;", "Landroid/os/Parcelable;", "instrumentSymbol", "", "instrumentId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderId", "supportedOrderTypes", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "educationItems", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderId", "getSupportedOrderTypes", "()Ljava/util/Set;", "getEducationItems", "()Ljava/util/List;", "getInstrumentType", "()Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypeSelectionDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<OrderEducationItem> educationItems;
        private final UUID instrumentId;
        private final String instrumentSymbol;
        private final CryptoOrderTypeFragmentKey2 instrumentType;
        private final UUID orderId;
        private final OrderSide orderSide;
        private final Set<CryptoOrderTypeFragmentKey6> supportedOrderTypes;

        /* compiled from: OrderTypeDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.OrderTypeSelectionDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                UUID uuid = (UUID) parcel.readSerializable();
                OrderSide orderSideValueOf = OrderSide.valueOf(parcel.readString());
                UUID uuid2 = (UUID) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(CryptoOrderTypeFragmentKey6.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(string2, uuid, orderSideValueOf, uuid2, linkedHashSet, arrayList, CryptoOrderTypeFragmentKey2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, OrderSide orderSide, UUID uuid2, Set set, List list, CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey2, int i, Object obj) {
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
                set = args.supportedOrderTypes;
            }
            if ((i & 32) != 0) {
                list = args.educationItems;
            }
            if ((i & 64) != 0) {
                cryptoOrderTypeFragmentKey2 = args.instrumentType;
            }
            List list2 = list;
            CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey22 = cryptoOrderTypeFragmentKey2;
            Set set2 = set;
            OrderSide orderSide2 = orderSide;
            return args.copy(str, uuid, orderSide2, uuid2, set2, list2, cryptoOrderTypeFragmentKey22);
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

        public final Set<CryptoOrderTypeFragmentKey6> component5() {
            return this.supportedOrderTypes;
        }

        public final List<OrderEducationItem> component6() {
            return this.educationItems;
        }

        /* renamed from: component7, reason: from getter */
        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        public final Args copy(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedOrderTypes, List<OrderEducationItem> educationItems, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedOrderTypes, "supportedOrderTypes");
            Intrinsics.checkNotNullParameter(educationItems, "educationItems");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new Args(instrumentSymbol, instrumentId, orderSide, orderId, supportedOrderTypes, educationItems, instrumentType);
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
            return Intrinsics.areEqual(this.instrumentSymbol, args.instrumentSymbol) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.orderSide == args.orderSide && Intrinsics.areEqual(this.orderId, args.orderId) && Intrinsics.areEqual(this.supportedOrderTypes, args.supportedOrderTypes) && Intrinsics.areEqual(this.educationItems, args.educationItems) && this.instrumentType == args.instrumentType;
        }

        public int hashCode() {
            return (((((((((((this.instrumentSymbol.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.supportedOrderTypes.hashCode()) * 31) + this.educationItems.hashCode()) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "Args(instrumentSymbol=" + this.instrumentSymbol + ", instrumentId=" + this.instrumentId + ", orderSide=" + this.orderSide + ", orderId=" + this.orderId + ", supportedOrderTypes=" + this.supportedOrderTypes + ", educationItems=" + this.educationItems + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentSymbol);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.orderSide.name());
            dest.writeSerializable(this.orderId);
            Set<CryptoOrderTypeFragmentKey6> set = this.supportedOrderTypes;
            dest.writeInt(set.size());
            Iterator<CryptoOrderTypeFragmentKey6> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<OrderEducationItem> list = this.educationItems;
            dest.writeInt(list.size());
            Iterator<OrderEducationItem> it2 = list.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeString(this.instrumentType.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedOrderTypes, List<OrderEducationItem> educationItems, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedOrderTypes, "supportedOrderTypes");
            Intrinsics.checkNotNullParameter(educationItems, "educationItems");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentSymbol = instrumentSymbol;
            this.instrumentId = instrumentId;
            this.orderSide = orderSide;
            this.orderId = orderId;
            this.supportedOrderTypes = supportedOrderTypes;
            this.educationItems = educationItems;
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

        public final Set<CryptoOrderTypeFragmentKey6> getSupportedOrderTypes() {
            return this.supportedOrderTypes;
        }

        public final List<OrderEducationItem> getEducationItems() {
            return this.educationItems;
        }

        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypeSelectionDest$Companion;", "", "<init>", "()V", "createDest", "Lcom/robinhood/shared/order/type/OrderTypeSelectionDest;", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypeSelectionDest$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderTypeDestinations4 createDest(CryptoOrderTypeFragmentKey initialArgs) {
            Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
            return new OrderTypeDestinations4(initialArgs, null);
        }
    }
}
