package com.stripe.android.view;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsActivityStarter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"com/stripe/android/view/PaymentMethodsActivityStarter$Result", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "", "useGooglePay", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "Z", "getUseGooglePay", "()Z", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.PaymentMethodsActivityStarter$Result, reason: use source file name and from toString */
/* loaded from: classes26.dex */
public final /* data */ class Result implements Parcelable {

    @JvmField
    public final PaymentMethod paymentMethod;
    private final boolean useGooglePay;
    public static final int $stable = 8;
    public static final Parcelable.Creator<Result> CREATOR = new Creator();

    /* compiled from: PaymentMethodsActivityStarter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.PaymentMethodsActivityStarter$Result$Creator */
    public static final class Creator implements Parcelable.Creator<Result> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Result(parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result[] newArray(int i) {
            return new Result[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Result() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return Intrinsics.areEqual(this.paymentMethod, result.paymentMethod) && this.useGooglePay == result.useGooglePay;
    }

    public int hashCode() {
        PaymentMethod paymentMethod = this.paymentMethod;
        return ((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + Boolean.hashCode(this.useGooglePay);
    }

    public String toString() {
        return "Result(paymentMethod=" + this.paymentMethod + ", useGooglePay=" + this.useGooglePay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.useGooglePay ? 1 : 0);
    }

    public Result(PaymentMethod paymentMethod, boolean z) {
        this.paymentMethod = paymentMethod;
        this.useGooglePay = z;
    }

    public /* synthetic */ Result(PaymentMethod paymentMethod, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethod, (i & 2) != 0 ? false : z);
    }

    public Bundle toBundle() {
        return Bundle2.bundleOf(Tuples4.m3642to("extra_activity_result", this));
    }
}
