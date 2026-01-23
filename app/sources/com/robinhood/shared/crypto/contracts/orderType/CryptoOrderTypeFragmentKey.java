package com.robinhood.shared.crypto.contracts.orderType;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.OrderSide;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \"2\u00020\u0001:\u0003 !\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002#$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "instrumentSymbol", "", "getInstrumentSymbol", "()Ljava/lang/String;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "orderId", "getOrderId", "supportedTypes", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "getSupportedTypes", "()Ljava/util/Set;", "educationItems", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "getEducationItems", "()Ljava/util/List;", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "getInstrumentType", "()Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "SelectOrderType", "EditOrderType", "Companion", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$EditOrderType;", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$SelectOrderType;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class CryptoOrderTypeFragmentKey implements FragmentKey {
    public static final String SELECTED_ORDER_EDUCATION_ACTION_KEY = "SELECTED_ORDER_EDUCATION_ACTION_KEY";
    public static final String SELECTED_ORDER_PRICE_RESULT_KEY = "SELECTED_ORDER_PRICE_RESULT_KEY";

    public /* synthetic */ CryptoOrderTypeFragmentKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<OrderEducationItem> getEducationItems();

    public abstract UUID getInstrumentId();

    public abstract String getInstrumentSymbol();

    public abstract CryptoOrderTypeFragmentKey2 getInstrumentType();

    public abstract UUID getOrderId();

    public abstract OrderSide getOrderSide();

    public abstract Set<CryptoOrderTypeFragmentKey6> getSupportedTypes();

    private CryptoOrderTypeFragmentKey() {
    }

    /* compiled from: CryptoOrderTypeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J]\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$SelectOrderType;", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "instrumentSymbol", "", "instrumentId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderId", "supportedTypes", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "educationItems", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderId", "getSupportedTypes", "()Ljava/util/Set;", "getEducationItems", "()Ljava/util/List;", "getInstrumentType", "()Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectOrderType extends CryptoOrderTypeFragmentKey {
        public static final Parcelable.Creator<SelectOrderType> CREATOR = new Creator();
        private final List<OrderEducationItem> educationItems;
        private final UUID instrumentId;
        private final String instrumentSymbol;
        private final CryptoOrderTypeFragmentKey2 instrumentType;
        private final UUID orderId;
        private final OrderSide orderSide;
        private final Set<CryptoOrderTypeFragmentKey6> supportedTypes;

        /* compiled from: CryptoOrderTypeFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SelectOrderType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectOrderType createFromParcel(Parcel parcel) {
                ArrayList arrayList;
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
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList.add(OrderEducationItem.CREATOR.createFromParcel(parcel));
                    }
                }
                return new SelectOrderType(string2, uuid, orderSideValueOf, uuid2, linkedHashSet, arrayList, CryptoOrderTypeFragmentKey2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectOrderType[] newArray(int i) {
                return new SelectOrderType[i];
            }
        }

        public static /* synthetic */ SelectOrderType copy$default(SelectOrderType selectOrderType, String str, UUID uuid, OrderSide orderSide, UUID uuid2, Set set, List list, CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectOrderType.instrumentSymbol;
            }
            if ((i & 2) != 0) {
                uuid = selectOrderType.instrumentId;
            }
            if ((i & 4) != 0) {
                orderSide = selectOrderType.orderSide;
            }
            if ((i & 8) != 0) {
                uuid2 = selectOrderType.orderId;
            }
            if ((i & 16) != 0) {
                set = selectOrderType.supportedTypes;
            }
            if ((i & 32) != 0) {
                list = selectOrderType.educationItems;
            }
            if ((i & 64) != 0) {
                cryptoOrderTypeFragmentKey2 = selectOrderType.instrumentType;
            }
            List list2 = list;
            CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey22 = cryptoOrderTypeFragmentKey2;
            Set set2 = set;
            OrderSide orderSide2 = orderSide;
            return selectOrderType.copy(str, uuid, orderSide2, uuid2, set2, list2, cryptoOrderTypeFragmentKey22);
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
            return this.supportedTypes;
        }

        public final List<OrderEducationItem> component6() {
            return this.educationItems;
        }

        /* renamed from: component7, reason: from getter */
        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        public final SelectOrderType copy(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedTypes, List<OrderEducationItem> educationItems, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new SelectOrderType(instrumentSymbol, instrumentId, orderSide, orderId, supportedTypes, educationItems, instrumentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectOrderType)) {
                return false;
            }
            SelectOrderType selectOrderType = (SelectOrderType) other;
            return Intrinsics.areEqual(this.instrumentSymbol, selectOrderType.instrumentSymbol) && Intrinsics.areEqual(this.instrumentId, selectOrderType.instrumentId) && this.orderSide == selectOrderType.orderSide && Intrinsics.areEqual(this.orderId, selectOrderType.orderId) && Intrinsics.areEqual(this.supportedTypes, selectOrderType.supportedTypes) && Intrinsics.areEqual(this.educationItems, selectOrderType.educationItems) && this.instrumentType == selectOrderType.instrumentType;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.instrumentSymbol.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.supportedTypes.hashCode()) * 31;
            List<OrderEducationItem> list = this.educationItems;
            return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "SelectOrderType(instrumentSymbol=" + this.instrumentSymbol + ", instrumentId=" + this.instrumentId + ", orderSide=" + this.orderSide + ", orderId=" + this.orderId + ", supportedTypes=" + this.supportedTypes + ", educationItems=" + this.educationItems + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentSymbol);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.orderSide.name());
            dest.writeSerializable(this.orderId);
            Set<CryptoOrderTypeFragmentKey6> set = this.supportedTypes;
            dest.writeInt(set.size());
            Iterator<CryptoOrderTypeFragmentKey6> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<OrderEducationItem> list = this.educationItems;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<OrderEducationItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.instrumentType.name());
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public OrderSide getOrderSide() {
            return this.orderSide;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public UUID getOrderId() {
            return this.orderId;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public Set<CryptoOrderTypeFragmentKey6> getSupportedTypes() {
            return this.supportedTypes;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public List<OrderEducationItem> getEducationItems() {
            return this.educationItems;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelectOrderType(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedTypes, List<OrderEducationItem> list, CryptoOrderTypeFragmentKey2 instrumentType) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentSymbol = instrumentSymbol;
            this.instrumentId = instrumentId;
            this.orderSide = orderSide;
            this.orderId = orderId;
            this.supportedTypes = supportedTypes;
            this.educationItems = list;
            this.instrumentType = instrumentType;
        }
    }

    /* compiled from: CryptoOrderTypeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0012HÆ\u0003Jg\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey$EditOrderType;", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "instrumentSymbol", "", "instrumentId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderId", "supportedTypes", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "orderPrices", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "educationItems", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/Set;Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;Ljava/util/List;Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderId", "getSupportedTypes", "()Ljava/util/Set;", "getOrderPrices", "()Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "getEducationItems", "()Ljava/util/List;", "getInstrumentType", "()Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditOrderType extends CryptoOrderTypeFragmentKey {
        public static final Parcelable.Creator<EditOrderType> CREATOR = new Creator();
        private final List<OrderEducationItem> educationItems;
        private final UUID instrumentId;
        private final String instrumentSymbol;
        private final CryptoOrderTypeFragmentKey2 instrumentType;
        private final UUID orderId;
        private final CryptoOrderTypeFragmentKey5 orderPrices;
        private final OrderSide orderSide;
        private final Set<CryptoOrderTypeFragmentKey6> supportedTypes;

        /* compiled from: CryptoOrderTypeFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<EditOrderType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditOrderType createFromParcel(Parcel parcel) {
                ArrayList arrayList;
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
                CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey5 = (CryptoOrderTypeFragmentKey5) parcel.readParcelable(EditOrderType.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList.add(OrderEducationItem.CREATOR.createFromParcel(parcel));
                    }
                }
                return new EditOrderType(string2, uuid, orderSideValueOf, uuid2, linkedHashSet, cryptoOrderTypeFragmentKey5, arrayList, CryptoOrderTypeFragmentKey2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditOrderType[] newArray(int i) {
                return new EditOrderType[i];
            }
        }

        public static /* synthetic */ EditOrderType copy$default(EditOrderType editOrderType, String str, UUID uuid, OrderSide orderSide, UUID uuid2, Set set, CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey5, List list, CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editOrderType.instrumentSymbol;
            }
            if ((i & 2) != 0) {
                uuid = editOrderType.instrumentId;
            }
            if ((i & 4) != 0) {
                orderSide = editOrderType.orderSide;
            }
            if ((i & 8) != 0) {
                uuid2 = editOrderType.orderId;
            }
            if ((i & 16) != 0) {
                set = editOrderType.supportedTypes;
            }
            if ((i & 32) != 0) {
                cryptoOrderTypeFragmentKey5 = editOrderType.orderPrices;
            }
            if ((i & 64) != 0) {
                list = editOrderType.educationItems;
            }
            if ((i & 128) != 0) {
                cryptoOrderTypeFragmentKey2 = editOrderType.instrumentType;
            }
            List list2 = list;
            CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey22 = cryptoOrderTypeFragmentKey2;
            Set set2 = set;
            CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey52 = cryptoOrderTypeFragmentKey5;
            return editOrderType.copy(str, uuid, orderSide, uuid2, set2, cryptoOrderTypeFragmentKey52, list2, cryptoOrderTypeFragmentKey22);
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
            return this.supportedTypes;
        }

        /* renamed from: component6, reason: from getter */
        public final CryptoOrderTypeFragmentKey5 getOrderPrices() {
            return this.orderPrices;
        }

        public final List<OrderEducationItem> component7() {
            return this.educationItems;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        public final EditOrderType copy(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedTypes, CryptoOrderTypeFragmentKey5 orderPrices, List<OrderEducationItem> educationItems, CryptoOrderTypeFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new EditOrderType(instrumentSymbol, instrumentId, orderSide, orderId, supportedTypes, orderPrices, educationItems, instrumentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditOrderType)) {
                return false;
            }
            EditOrderType editOrderType = (EditOrderType) other;
            return Intrinsics.areEqual(this.instrumentSymbol, editOrderType.instrumentSymbol) && Intrinsics.areEqual(this.instrumentId, editOrderType.instrumentId) && this.orderSide == editOrderType.orderSide && Intrinsics.areEqual(this.orderId, editOrderType.orderId) && Intrinsics.areEqual(this.supportedTypes, editOrderType.supportedTypes) && Intrinsics.areEqual(this.orderPrices, editOrderType.orderPrices) && Intrinsics.areEqual(this.educationItems, editOrderType.educationItems) && this.instrumentType == editOrderType.instrumentType;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.instrumentSymbol.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.supportedTypes.hashCode()) * 31) + this.orderPrices.hashCode()) * 31;
            List<OrderEducationItem> list = this.educationItems;
            return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "EditOrderType(instrumentSymbol=" + this.instrumentSymbol + ", instrumentId=" + this.instrumentId + ", orderSide=" + this.orderSide + ", orderId=" + this.orderId + ", supportedTypes=" + this.supportedTypes + ", orderPrices=" + this.orderPrices + ", educationItems=" + this.educationItems + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentSymbol);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.orderSide.name());
            dest.writeSerializable(this.orderId);
            Set<CryptoOrderTypeFragmentKey6> set = this.supportedTypes;
            dest.writeInt(set.size());
            Iterator<CryptoOrderTypeFragmentKey6> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeParcelable(this.orderPrices, flags);
            List<OrderEducationItem> list = this.educationItems;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<OrderEducationItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.instrumentType.name());
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public OrderSide getOrderSide() {
            return this.orderSide;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public UUID getOrderId() {
            return this.orderId;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public Set<CryptoOrderTypeFragmentKey6> getSupportedTypes() {
            return this.supportedTypes;
        }

        public final CryptoOrderTypeFragmentKey5 getOrderPrices() {
            return this.orderPrices;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public List<OrderEducationItem> getEducationItems() {
            return this.educationItems;
        }

        @Override // com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey
        public CryptoOrderTypeFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EditOrderType(String instrumentSymbol, UUID instrumentId, OrderSide orderSide, UUID orderId, Set<? extends CryptoOrderTypeFragmentKey6> supportedTypes, CryptoOrderTypeFragmentKey5 orderPrices, List<OrderEducationItem> list, CryptoOrderTypeFragmentKey2 instrumentType) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentSymbol = instrumentSymbol;
            this.instrumentId = instrumentId;
            this.orderSide = orderSide;
            this.orderId = orderId;
            this.supportedTypes = supportedTypes;
            this.orderPrices = orderPrices;
            this.educationItems = list;
            this.instrumentType = instrumentType;
        }
    }
}
