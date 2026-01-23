package com.robinhood.transfers.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams4;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceFeeDiscount.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/transfers/api/ServiceFeeDiscount;", "Landroid/os/Parcelable;", "discount_scheme", "", "value", "Lcom/robinhood/models/api/bonfire/transfer/MatchaDiscountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/MatchaDiscountType;)V", "getDiscount_scheme", "()Ljava/lang/String;", "getValue", "()Lcom/robinhood/models/api/bonfire/transfer/MatchaDiscountType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServiceFeeDiscount implements Parcelable {
    public static final Parcelable.Creator<ServiceFeeDiscount> CREATOR = new Creator();
    private final String discount_scheme;
    private final ApiServiceFeeParams4 value;

    /* compiled from: ServiceFeeDiscount.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceFeeDiscount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeDiscount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ServiceFeeDiscount(parcel.readString(), ApiServiceFeeParams4.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeDiscount[] newArray(int i) {
            return new ServiceFeeDiscount[i];
        }
    }

    public static /* synthetic */ ServiceFeeDiscount copy$default(ServiceFeeDiscount serviceFeeDiscount, String str, ApiServiceFeeParams4 apiServiceFeeParams4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceFeeDiscount.discount_scheme;
        }
        if ((i & 2) != 0) {
            apiServiceFeeParams4 = serviceFeeDiscount.value;
        }
        return serviceFeeDiscount.copy(str, apiServiceFeeParams4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDiscount_scheme() {
        return this.discount_scheme;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiServiceFeeParams4 getValue() {
        return this.value;
    }

    public final ServiceFeeDiscount copy(String discount_scheme, ApiServiceFeeParams4 value) {
        Intrinsics.checkNotNullParameter(discount_scheme, "discount_scheme");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ServiceFeeDiscount(discount_scheme, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceFeeDiscount)) {
            return false;
        }
        ServiceFeeDiscount serviceFeeDiscount = (ServiceFeeDiscount) other;
        return Intrinsics.areEqual(this.discount_scheme, serviceFeeDiscount.discount_scheme) && this.value == serviceFeeDiscount.value;
    }

    public int hashCode() {
        return (this.discount_scheme.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "ServiceFeeDiscount(discount_scheme=" + this.discount_scheme + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.discount_scheme);
        dest.writeString(this.value.name());
    }

    public ServiceFeeDiscount(String discount_scheme, ApiServiceFeeParams4 value) {
        Intrinsics.checkNotNullParameter(discount_scheme, "discount_scheme");
        Intrinsics.checkNotNullParameter(value, "value");
        this.discount_scheme = discount_scheme;
        this.value = value;
    }

    public final String getDiscount_scheme() {
        return this.discount_scheme;
    }

    public final ApiServiceFeeParams4 getValue() {
        return this.value;
    }
}
