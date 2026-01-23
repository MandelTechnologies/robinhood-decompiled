package com.stripe.android.stripe3ds2.init.p418ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes26.dex */
public final class StripeButtonCustomization extends BaseCustomization implements ButtonCustomization, Parcelable {
    public static final Parcelable.Creator<StripeButtonCustomization> CREATOR = new Parcelable.Creator<StripeButtonCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeButtonCustomization createFromParcel(Parcel parcel) {
            return new StripeButtonCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeButtonCustomization[] newArray(int i) {
            return new StripeButtonCustomization[i];
        }
    };
    private String mBackgroundColor;
    private int mCornerRadius;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StripeButtonCustomization() {
    }

    private StripeButtonCustomization(Parcel parcel) {
        super(parcel);
        this.mBackgroundColor = parcel.readString();
        this.mCornerRadius = parcel.readInt();
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.ButtonCustomization
    public String getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.ButtonCustomization
    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StripeButtonCustomization) && typedEquals((StripeButtonCustomization) obj);
        }
        return true;
    }

    private boolean typedEquals(StripeButtonCustomization stripeButtonCustomization) {
        return ObjectUtils.equals(this.mBackgroundColor, stripeButtonCustomization.mBackgroundColor) && this.mCornerRadius == stripeButtonCustomization.mCornerRadius;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mBackgroundColor, Integer.valueOf(this.mCornerRadius));
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mBackgroundColor);
        parcel.writeInt(this.mCornerRadius);
    }
}
