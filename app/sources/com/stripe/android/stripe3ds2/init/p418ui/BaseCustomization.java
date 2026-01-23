package com.stripe.android.stripe3ds2.init.p418ui;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes26.dex */
public abstract class BaseCustomization implements Customization, Parcelable {
    private String mTextColor;
    private String mTextFontName;
    private int mTextFontSize;

    BaseCustomization() {
    }

    BaseCustomization(Parcel parcel) {
        this.mTextFontName = parcel.readString();
        this.mTextColor = parcel.readString();
        this.mTextFontSize = parcel.readInt();
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.Customization
    public String getTextFontName() {
        return this.mTextFontName;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.Customization
    public String getTextColor() {
        return this.mTextColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.Customization
    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTextFontName);
        parcel.writeString(this.mTextColor);
        parcel.writeInt(this.mTextFontSize);
    }
}
