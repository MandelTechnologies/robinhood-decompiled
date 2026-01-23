package com.stripe.android.stripe3ds2.init.p418ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes26.dex */
public final class StripeTextBoxCustomization extends BaseCustomization implements TextBoxCustomization, Parcelable {
    public static final Parcelable.Creator<StripeTextBoxCustomization> CREATOR = new Parcelable.Creator<StripeTextBoxCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeTextBoxCustomization createFromParcel(Parcel parcel) {
            return new StripeTextBoxCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeTextBoxCustomization[] newArray(int i) {
            return new StripeTextBoxCustomization[i];
        }
    };
    private String mBorderColor;
    private int mBorderWidth;
    private int mCornerRadius;
    private String mHintTextColor;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StripeTextBoxCustomization() {
    }

    private StripeTextBoxCustomization(Parcel parcel) {
        super(parcel);
        this.mBorderWidth = parcel.readInt();
        this.mBorderColor = parcel.readString();
        this.mCornerRadius = parcel.readInt();
        this.mHintTextColor = parcel.readString();
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.TextBoxCustomization
    public String getBorderColor() {
        return this.mBorderColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.TextBoxCustomization
    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.TextBoxCustomization
    public String getHintTextColor() {
        return this.mHintTextColor;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StripeTextBoxCustomization) && typedEquals((StripeTextBoxCustomization) obj);
        }
        return true;
    }

    private boolean typedEquals(StripeTextBoxCustomization stripeTextBoxCustomization) {
        return this.mBorderWidth == stripeTextBoxCustomization.mBorderWidth && ObjectUtils.equals(this.mBorderColor, stripeTextBoxCustomization.mBorderColor) && this.mCornerRadius == stripeTextBoxCustomization.mCornerRadius && ObjectUtils.equals(this.mHintTextColor, stripeTextBoxCustomization.mHintTextColor);
    }

    public int hashCode() {
        return ObjectUtils.hash(Integer.valueOf(this.mBorderWidth), this.mBorderColor, Integer.valueOf(this.mCornerRadius), this.mHintTextColor);
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mBorderWidth);
        parcel.writeString(this.mBorderColor);
        parcel.writeInt(this.mCornerRadius);
        parcel.writeString(this.mHintTextColor);
    }
}
