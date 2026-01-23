package com.robinhood.android.options.combo.p206db;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrder.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "orderId", "type", "", "displayName", "feeRate", "Ljava/math/BigDecimal;", "fee", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()Ljava/util/UUID;", "getOrderId", "getType", "()Ljava/lang/String;", "getDisplayName", "getFeeRate", "()Ljava/math/BigDecimal;", "getFee", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderSalesTax implements Parcelable {
    public static final Parcelable.Creator<ComboOrderSalesTax> CREATOR = new Creator();
    private final String displayName;
    private final BigDecimal fee;
    private final BigDecimal feeRate;
    private final UUID id;
    private final UUID orderId;
    private final String type;

    /* compiled from: ComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComboOrderSalesTax> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderSalesTax createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComboOrderSalesTax((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderSalesTax[] newArray(int i) {
            return new ComboOrderSalesTax[i];
        }
    }

    public static /* synthetic */ ComboOrderSalesTax copy$default(ComboOrderSalesTax comboOrderSalesTax, UUID uuid, UUID uuid2, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = comboOrderSalesTax.id;
        }
        if ((i & 2) != 0) {
            uuid2 = comboOrderSalesTax.orderId;
        }
        if ((i & 4) != 0) {
            str = comboOrderSalesTax.type;
        }
        if ((i & 8) != 0) {
            str2 = comboOrderSalesTax.displayName;
        }
        if ((i & 16) != 0) {
            bigDecimal = comboOrderSalesTax.feeRate;
        }
        if ((i & 32) != 0) {
            bigDecimal2 = comboOrderSalesTax.fee;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        return comboOrderSalesTax.copy(uuid, uuid2, str, str2, bigDecimal3, bigDecimal4);
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
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getFeeRate() {
        return this.feeRate;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    public final ComboOrderSalesTax copy(UUID id, UUID orderId, String type2, String displayName, BigDecimal feeRate, BigDecimal fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(feeRate, "feeRate");
        Intrinsics.checkNotNullParameter(fee, "fee");
        return new ComboOrderSalesTax(id, orderId, type2, displayName, feeRate, fee);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderSalesTax)) {
            return false;
        }
        ComboOrderSalesTax comboOrderSalesTax = (ComboOrderSalesTax) other;
        return Intrinsics.areEqual(this.id, comboOrderSalesTax.id) && Intrinsics.areEqual(this.orderId, comboOrderSalesTax.orderId) && Intrinsics.areEqual(this.type, comboOrderSalesTax.type) && Intrinsics.areEqual(this.displayName, comboOrderSalesTax.displayName) && Intrinsics.areEqual(this.feeRate, comboOrderSalesTax.feeRate) && Intrinsics.areEqual(this.fee, comboOrderSalesTax.fee);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.feeRate.hashCode()) * 31) + this.fee.hashCode();
    }

    public String toString() {
        return "ComboOrderSalesTax(id=" + this.id + ", orderId=" + this.orderId + ", type=" + this.type + ", displayName=" + this.displayName + ", feeRate=" + this.feeRate + ", fee=" + this.fee + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeSerializable(this.orderId);
        dest.writeString(this.type);
        dest.writeString(this.displayName);
        dest.writeSerializable(this.feeRate);
        dest.writeSerializable(this.fee);
    }

    public ComboOrderSalesTax(UUID id, UUID orderId, String type2, String displayName, BigDecimal feeRate, BigDecimal fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(feeRate, "feeRate");
        Intrinsics.checkNotNullParameter(fee, "fee");
        this.id = id;
        this.orderId = orderId;
        this.type = type2;
        this.displayName = displayName;
        this.feeRate = feeRate;
        this.fee = fee;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final BigDecimal getFeeRate() {
        return this.feeRate;
    }

    public final BigDecimal getFee() {
        return this.fee;
    }
}
