package com.robinhood.android.equities.taxlots.taxlotsmodelsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiTaxLot.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/ApiTaxLot;", "Landroid/os/Parcelable;", "open_lot_id", "Ljava/util/UUID;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;)V", "getOpen_lot_id", "()Ljava/util/UUID;", "getQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-tax-lots-models-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApiTaxLot implements Parcelable {
    private final UUID open_lot_id;
    private final BigDecimal quantity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ApiTaxLot> CREATOR = new Creator();

    /* compiled from: ApiTaxLot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiTaxLot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiTaxLot createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiTaxLot((UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiTaxLot[] newArray(int i) {
            return new ApiTaxLot[i];
        }
    }

    public static /* synthetic */ ApiTaxLot copy$default(ApiTaxLot apiTaxLot, UUID uuid, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiTaxLot.open_lot_id;
        }
        if ((i & 2) != 0) {
            bigDecimal = apiTaxLot.quantity;
        }
        return apiTaxLot.copy(uuid, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOpen_lot_id() {
        return this.open_lot_id;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final ApiTaxLot copy(UUID open_lot_id, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return new ApiTaxLot(open_lot_id, quantity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTaxLot)) {
            return false;
        }
        ApiTaxLot apiTaxLot = (ApiTaxLot) other;
        return Intrinsics.areEqual(this.open_lot_id, apiTaxLot.open_lot_id) && Intrinsics.areEqual(this.quantity, apiTaxLot.quantity);
    }

    public int hashCode() {
        return (this.open_lot_id.hashCode() * 31) + this.quantity.hashCode();
    }

    public String toString() {
        return "ApiTaxLot(open_lot_id=" + this.open_lot_id + ", quantity=" + this.quantity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.open_lot_id);
        dest.writeSerializable(this.quantity);
    }

    public ApiTaxLot(UUID open_lot_id, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.open_lot_id = open_lot_id;
        this.quantity = quantity;
    }

    public final UUID getOpen_lot_id() {
        return this.open_lot_id;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* compiled from: ApiTaxLot.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/ApiTaxLot$Companion;", "", "<init>", "()V", "fromTaxLotSelectionProto", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/ApiTaxLot;", "selection", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "lib-tax-lots-models-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApiTaxLot fromTaxLotSelectionProto(TaxLotSelection selection) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            String shares = selection.getShares();
            BigDecimal bigDecimal = shares != null ? new BigDecimal(shares) : null;
            if (bigDecimal == null) {
                throw new IllegalStateException("error converting proto tax lot selection to api tax lot: shares is null");
            }
            UUID uuidFromString = UUID.fromString(selection.getId());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            return new ApiTaxLot(uuidFromString, bigDecimal);
        }
    }
}
