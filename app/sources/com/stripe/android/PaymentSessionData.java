package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSessionData.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionData;", "Landroid/os/Parcelable;", "", "isShippingInfoRequired", "isShippingMethodRequired", "", "cartTotal", "shippingTotal", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "useGooglePay", "<init>", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V", "copy", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)Lcom/stripe/android/PaymentSessionData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "J", "getCartTotal", "()J", "getShippingTotal", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/model/ShippingMethod;", "getShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getUseGooglePay", "()Z", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PaymentSessionData implements Parcelable {
    public static final Parcelable.Creator<PaymentSessionData> CREATOR = new Creator();
    private final long cartTotal;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final PaymentMethod paymentMethod;
    private final ShippingInformation shippingInformation;
    private final ShippingMethod shippingMethod;
    private final long shippingTotal;
    private final boolean useGooglePay;

    /* compiled from: PaymentSessionData.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSessionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ShippingInformation shippingInformation;
            ShippingMethod shippingMethod;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            long j = parcel.readLong();
            boolean z6 = z2;
            long j2 = parcel.readLong();
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            ShippingMethod shippingMethodCreateFromParcel = parcel.readInt() == 0 ? null : ShippingMethod.CREATOR.createFromParcel(parcel);
            PaymentMethod paymentMethodCreateFromParcel = parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                z3 = z6;
                shippingInformation = shippingInformationCreateFromParcel;
                shippingMethod = shippingMethodCreateFromParcel;
            } else {
                shippingInformation = shippingInformationCreateFromParcel;
                shippingMethod = shippingMethodCreateFromParcel;
                z3 = z;
            }
            return new PaymentSessionData(z4, z5, j, j2, shippingInformation, shippingMethod, paymentMethodCreateFromParcel, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData[] newArray(int i) {
            return new PaymentSessionData[i];
        }
    }

    public static /* synthetic */ PaymentSessionData copy$default(PaymentSessionData paymentSessionData, boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentSessionData.isShippingInfoRequired;
        }
        if ((i & 2) != 0) {
            z2 = paymentSessionData.isShippingMethodRequired;
        }
        if ((i & 4) != 0) {
            j = paymentSessionData.cartTotal;
        }
        if ((i & 8) != 0) {
            j2 = paymentSessionData.shippingTotal;
        }
        if ((i & 16) != 0) {
            shippingInformation = paymentSessionData.shippingInformation;
        }
        if ((i & 32) != 0) {
            shippingMethod = paymentSessionData.shippingMethod;
        }
        if ((i & 64) != 0) {
            paymentMethod = paymentSessionData.paymentMethod;
        }
        if ((i & 128) != 0) {
            z3 = paymentSessionData.useGooglePay;
        }
        long j3 = j2;
        long j4 = j;
        return paymentSessionData.copy(z, z2, j4, j3, shippingInformation, shippingMethod, paymentMethod, z3);
    }

    public final PaymentSessionData copy(boolean isShippingInfoRequired, boolean isShippingMethodRequired, long cartTotal, long shippingTotal, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean useGooglePay) {
        return new PaymentSessionData(isShippingInfoRequired, isShippingMethodRequired, cartTotal, shippingTotal, shippingInformation, shippingMethod, paymentMethod, useGooglePay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionData)) {
            return false;
        }
        PaymentSessionData paymentSessionData = (PaymentSessionData) other;
        return this.isShippingInfoRequired == paymentSessionData.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionData.isShippingMethodRequired && this.cartTotal == paymentSessionData.cartTotal && this.shippingTotal == paymentSessionData.shippingTotal && Intrinsics.areEqual(this.shippingInformation, paymentSessionData.shippingInformation) && Intrinsics.areEqual(this.shippingMethod, paymentSessionData.shippingMethod) && Intrinsics.areEqual(this.paymentMethod, paymentSessionData.paymentMethod) && this.useGooglePay == paymentSessionData.useGooglePay;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isShippingInfoRequired) * 31) + Boolean.hashCode(this.isShippingMethodRequired)) * 31) + Long.hashCode(this.cartTotal)) * 31) + Long.hashCode(this.shippingTotal)) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int iHashCode2 = (iHashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        ShippingMethod shippingMethod = this.shippingMethod;
        int iHashCode3 = (iHashCode2 + (shippingMethod == null ? 0 : shippingMethod.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        return ((iHashCode3 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31) + Boolean.hashCode(this.useGooglePay);
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", cartTotal=" + this.cartTotal + ", shippingTotal=" + this.shippingTotal + ", shippingInformation=" + this.shippingInformation + ", shippingMethod=" + this.shippingMethod + ", paymentMethod=" + this.paymentMethod + ", useGooglePay=" + this.useGooglePay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeLong(this.cartTotal);
        parcel.writeLong(this.shippingTotal);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        ShippingMethod shippingMethod = this.shippingMethod;
        if (shippingMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingMethod.writeToParcel(parcel, flags);
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.useGooglePay ? 1 : 0);
    }

    public PaymentSessionData(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z3) {
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.cartTotal = j;
        this.shippingTotal = j2;
        this.shippingInformation = shippingInformation;
        this.shippingMethod = shippingMethod;
        this.paymentMethod = paymentMethod;
        this.useGooglePay = z3;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }
}
