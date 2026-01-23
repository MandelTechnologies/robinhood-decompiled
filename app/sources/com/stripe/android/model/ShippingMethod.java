package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.ErrorResponse;
import com.stripe.android.core.model.StripeModel;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ShippingMethod.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/core/model/StripeModel;", "", AnnotatedPrivateKey.LABEL, "identifier", "", "amount", "Ljava/util/Currency;", "currency", ErrorResponse.DETAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getIdentifier", "J", "getAmount", "()J", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "getDetail", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ShippingMethod implements StripeModel {
    public static final Parcelable.Creator<ShippingMethod> CREATOR = new Creator();
    private final long amount;
    private final Currency currency;
    private final String detail;
    private final String identifier;
    private final String label;

    /* compiled from: ShippingMethod.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ShippingMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingMethod(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod[] newArray(int i) {
            return new ShippingMethod[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingMethod)) {
            return false;
        }
        ShippingMethod shippingMethod = (ShippingMethod) other;
        return Intrinsics.areEqual(this.label, shippingMethod.label) && Intrinsics.areEqual(this.identifier, shippingMethod.identifier) && this.amount == shippingMethod.amount && Intrinsics.areEqual(this.currency, shippingMethod.currency) && Intrinsics.areEqual(this.detail, shippingMethod.detail);
    }

    public int hashCode() {
        int iHashCode = ((((((this.label.hashCode() * 31) + this.identifier.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.currency.hashCode()) * 31;
        String str = this.detail;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ShippingMethod(label=" + this.label + ", identifier=" + this.identifier + ", amount=" + this.amount + ", currency=" + this.currency + ", detail=" + this.detail + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeString(this.identifier);
        parcel.writeLong(this.amount);
        parcel.writeSerializable(this.currency);
        parcel.writeString(this.detail);
    }

    @JvmOverloads
    public ShippingMethod(String label, String identifier, long j, Currency currency, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.label = label;
        this.identifier = identifier;
        this.amount = j;
        this.currency = currency;
        this.detail = str;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getDetail() {
        return this.detail;
    }
}
