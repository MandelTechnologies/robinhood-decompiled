package com.robinhood.transfers.api.p405uk;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiPaymentTransferFxConversion.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversion;", "Landroid/os/Parcelable;", "actual_target_amount", "Ljava/math/BigDecimal;", "actual_target_fx_rate", "base_amount", "base_currency", "Ljava/util/Currency;", "target_amount", "target_currency", "target_fx_rate", "target_fx_rate_id", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getActual_target_amount", "()Ljava/math/BigDecimal;", "getActual_target_fx_rate", "getBase_amount", "getBase_currency", "()Ljava/util/Currency;", "getTarget_amount", "getTarget_currency", "getTarget_fx_rate", "getTarget_fx_rate_id", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ApiPaymentTransferFxConversion implements Parcelable {
    public static final Parcelable.Creator<ApiPaymentTransferFxConversion> CREATOR = new Creator();
    private final BigDecimal actual_target_amount;
    private final BigDecimal actual_target_fx_rate;
    private final BigDecimal base_amount;
    private final Currency base_currency;
    private final BigDecimal target_amount;
    private final Currency target_currency;
    private final BigDecimal target_fx_rate;
    private final String target_fx_rate_id;

    /* compiled from: ApiPaymentTransferFxConversion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiPaymentTransferFxConversion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiPaymentTransferFxConversion createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiPaymentTransferFxConversion((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (Currency) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (Currency) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiPaymentTransferFxConversion[] newArray(int i) {
            return new ApiPaymentTransferFxConversion[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.actual_target_amount);
        dest.writeSerializable(this.actual_target_fx_rate);
        dest.writeSerializable(this.base_amount);
        dest.writeSerializable(this.base_currency);
        dest.writeSerializable(this.target_amount);
        dest.writeSerializable(this.target_currency);
        dest.writeSerializable(this.target_fx_rate);
        dest.writeString(this.target_fx_rate_id);
    }

    public ApiPaymentTransferFxConversion(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal base_amount, Currency base_currency, BigDecimal target_amount, Currency target_currency, BigDecimal target_fx_rate, String target_fx_rate_id) {
        Intrinsics.checkNotNullParameter(base_amount, "base_amount");
        Intrinsics.checkNotNullParameter(base_currency, "base_currency");
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        this.actual_target_amount = bigDecimal;
        this.actual_target_fx_rate = bigDecimal2;
        this.base_amount = base_amount;
        this.base_currency = base_currency;
        this.target_amount = target_amount;
        this.target_currency = target_currency;
        this.target_fx_rate = target_fx_rate;
        this.target_fx_rate_id = target_fx_rate_id;
    }

    public final BigDecimal getActual_target_amount() {
        return this.actual_target_amount;
    }

    public final BigDecimal getActual_target_fx_rate() {
        return this.actual_target_fx_rate;
    }

    public final BigDecimal getBase_amount() {
        return this.base_amount;
    }

    public final Currency getBase_currency() {
        return this.base_currency;
    }

    public final BigDecimal getTarget_amount() {
        return this.target_amount;
    }

    public final Currency getTarget_currency() {
        return this.target_currency;
    }

    public final BigDecimal getTarget_fx_rate() {
        return this.target_fx_rate;
    }

    public final String getTarget_fx_rate_id() {
        return this.target_fx_rate_id;
    }
}
