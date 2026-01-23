package com.robinhood.android.options.combo.p206db;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ComboOrder.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "id", "legId", "Ljava/math/BigDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processedQuantity", "quantity", "j$/time/LocalDate", "settlementDate", "j$/time/Instant", "timestamp", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "component6", "()Lj$/time/LocalDate;", "component7", "()Lj$/time/Instant;", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;)Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getLegId", "Ljava/math/BigDecimal;", "getPrice", "getProcessedQuantity", "getQuantity", "Lj$/time/LocalDate;", "getSettlementDate", "Lj$/time/Instant;", "getTimestamp", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderExecution implements Parcelable {
    public static final Parcelable.Creator<ComboOrderExecution> CREATOR = new Creator();
    private final UUID id;
    private final UUID legId;
    private final BigDecimal price;
    private final BigDecimal processedQuantity;
    private final BigDecimal quantity;
    private final LocalDate settlementDate;
    private final Instant timestamp;

    /* compiled from: ComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComboOrderExecution> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderExecution createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComboOrderExecution((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrderExecution[] newArray(int i) {
            return new ComboOrderExecution[i];
        }
    }

    public static /* synthetic */ ComboOrderExecution copy$default(ComboOrderExecution comboOrderExecution, UUID uuid, UUID uuid2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, LocalDate localDate, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = comboOrderExecution.id;
        }
        if ((i & 2) != 0) {
            uuid2 = comboOrderExecution.legId;
        }
        if ((i & 4) != 0) {
            bigDecimal = comboOrderExecution.price;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = comboOrderExecution.processedQuantity;
        }
        if ((i & 16) != 0) {
            bigDecimal3 = comboOrderExecution.quantity;
        }
        if ((i & 32) != 0) {
            localDate = comboOrderExecution.settlementDate;
        }
        if ((i & 64) != 0) {
            instant = comboOrderExecution.timestamp;
        }
        LocalDate localDate2 = localDate;
        Instant instant2 = instant;
        BigDecimal bigDecimal4 = bigDecimal3;
        BigDecimal bigDecimal5 = bigDecimal;
        return comboOrderExecution.copy(uuid, uuid2, bigDecimal5, bigDecimal2, bigDecimal4, localDate2, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getLegId() {
        return this.legId;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getProcessedQuantity() {
        return this.processedQuantity;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component6, reason: from getter */
    public final LocalDate getSettlementDate() {
        return this.settlementDate;
    }

    /* renamed from: component7, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final ComboOrderExecution copy(UUID id, UUID legId, BigDecimal price, BigDecimal processedQuantity, BigDecimal quantity, LocalDate settlementDate, Instant timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlementDate, "settlementDate");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new ComboOrderExecution(id, legId, price, processedQuantity, quantity, settlementDate, timestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderExecution)) {
            return false;
        }
        ComboOrderExecution comboOrderExecution = (ComboOrderExecution) other;
        return Intrinsics.areEqual(this.id, comboOrderExecution.id) && Intrinsics.areEqual(this.legId, comboOrderExecution.legId) && Intrinsics.areEqual(this.price, comboOrderExecution.price) && Intrinsics.areEqual(this.processedQuantity, comboOrderExecution.processedQuantity) && Intrinsics.areEqual(this.quantity, comboOrderExecution.quantity) && Intrinsics.areEqual(this.settlementDate, comboOrderExecution.settlementDate) && Intrinsics.areEqual(this.timestamp, comboOrderExecution.timestamp);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.legId.hashCode()) * 31) + this.price.hashCode()) * 31;
        BigDecimal bigDecimal = this.processedQuantity;
        return ((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.quantity.hashCode()) * 31) + this.settlementDate.hashCode()) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "ComboOrderExecution(id=" + this.id + ", legId=" + this.legId + ", price=" + this.price + ", processedQuantity=" + this.processedQuantity + ", quantity=" + this.quantity + ", settlementDate=" + this.settlementDate + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeSerializable(this.legId);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.processedQuantity);
        dest.writeSerializable(this.quantity);
        dest.writeSerializable(this.settlementDate);
        dest.writeSerializable(this.timestamp);
    }

    public ComboOrderExecution(UUID id, UUID legId, BigDecimal price, BigDecimal bigDecimal, BigDecimal quantity, LocalDate settlementDate, Instant timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlementDate, "settlementDate");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.id = id;
        this.legId = legId;
        this.price = price;
        this.processedQuantity = bigDecimal;
        this.quantity = quantity;
        this.settlementDate = settlementDate;
        this.timestamp = timestamp;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getLegId() {
        return this.legId;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final BigDecimal getProcessedQuantity() {
        return this.processedQuantity;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final LocalDate getSettlementDate() {
        return this.settlementDate;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }
}
