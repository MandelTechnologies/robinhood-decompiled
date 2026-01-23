package com.robinhood.android.options.combo.p206db;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrder.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010$\u001a\u00020\u000bJ\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "orderId", "instrumentId", "instrumentType", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "ratioQuantity", "", "side", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;Lcom/robinhood/models/db/OrderPositionEffect;ILcom/robinhood/models/db/OrderSide;)V", "getId", "()Ljava/util/UUID;", "getOrderId", "getInstrumentId", "getInstrumentType", "()Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getRatioQuantity", "()I", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderLeg implements Parcelable {
    public static final Parcelable.Creator<ComboOrderLeg> CREATOR = new Creator();
    private final UUID id;
    private final UUID instrumentId;
    private final ApiComboOrder.InstrumentType instrumentType;
    private final UUID orderId;
    private final OrderPositionEffect positionEffect;
    private final int ratioQuantity;
    private final OrderSide side;

    /* compiled from: ComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComboOrderLeg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderLeg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComboOrderLeg((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), ApiComboOrder.InstrumentType.valueOf(parcel.readString()), OrderPositionEffect.valueOf(parcel.readString()), parcel.readInt(), OrderSide.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderLeg[] newArray(int i) {
            return new ComboOrderLeg[i];
        }
    }

    public static /* synthetic */ ComboOrderLeg copy$default(ComboOrderLeg comboOrderLeg, UUID uuid, UUID uuid2, UUID uuid3, ApiComboOrder.InstrumentType instrumentType, OrderPositionEffect orderPositionEffect, int i, OrderSide orderSide, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = comboOrderLeg.id;
        }
        if ((i2 & 2) != 0) {
            uuid2 = comboOrderLeg.orderId;
        }
        if ((i2 & 4) != 0) {
            uuid3 = comboOrderLeg.instrumentId;
        }
        if ((i2 & 8) != 0) {
            instrumentType = comboOrderLeg.instrumentType;
        }
        if ((i2 & 16) != 0) {
            orderPositionEffect = comboOrderLeg.positionEffect;
        }
        if ((i2 & 32) != 0) {
            i = comboOrderLeg.ratioQuantity;
        }
        if ((i2 & 64) != 0) {
            orderSide = comboOrderLeg.side;
        }
        int i3 = i;
        OrderSide orderSide2 = orderSide;
        OrderPositionEffect orderPositionEffect2 = orderPositionEffect;
        UUID uuid4 = uuid3;
        return comboOrderLeg.copy(uuid, uuid2, uuid4, instrumentType, orderPositionEffect2, i3, orderSide2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiComboOrder.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }

    /* renamed from: component7, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    public final ComboOrderLeg copy(UUID id, UUID orderId, UUID instrumentId, ApiComboOrder.InstrumentType instrumentType, OrderPositionEffect positionEffect, int ratioQuantity, OrderSide side) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(side, "side");
        return new ComboOrderLeg(id, orderId, instrumentId, instrumentType, positionEffect, ratioQuantity, side);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderLeg)) {
            return false;
        }
        ComboOrderLeg comboOrderLeg = (ComboOrderLeg) other;
        return Intrinsics.areEqual(this.id, comboOrderLeg.id) && Intrinsics.areEqual(this.orderId, comboOrderLeg.orderId) && Intrinsics.areEqual(this.instrumentId, comboOrderLeg.instrumentId) && this.instrumentType == comboOrderLeg.instrumentType && this.positionEffect == comboOrderLeg.positionEffect && this.ratioQuantity == comboOrderLeg.ratioQuantity && this.side == comboOrderLeg.side;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + Integer.hashCode(this.ratioQuantity)) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "ComboOrderLeg(id=" + this.id + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ", positionEffect=" + this.positionEffect + ", ratioQuantity=" + this.ratioQuantity + ", side=" + this.side + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeSerializable(this.orderId);
        dest.writeSerializable(this.instrumentId);
        dest.writeString(this.instrumentType.name());
        dest.writeString(this.positionEffect.name());
        dest.writeInt(this.ratioQuantity);
        dest.writeString(this.side.name());
    }

    public ComboOrderLeg(UUID id, UUID orderId, UUID instrumentId, ApiComboOrder.InstrumentType instrumentType, OrderPositionEffect positionEffect, int i, OrderSide side) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(side, "side");
        this.id = id;
        this.orderId = orderId;
        this.instrumentId = instrumentId;
        this.instrumentType = instrumentType;
        this.positionEffect = positionEffect;
        this.ratioQuantity = i;
        this.side = side;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final ApiComboOrder.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }

    public final OrderSide getSide() {
        return this.side;
    }
}
