package com.stripe.android.stripe3ds2.init.p418ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes26.dex */
public final class StripeLabelCustomization extends BaseCustomization implements LabelCustomization, Parcelable {
    public static final Parcelable.Creator<StripeLabelCustomization> CREATOR = new Parcelable.Creator<StripeLabelCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeLabelCustomization createFromParcel(Parcel parcel) {
            return new StripeLabelCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeLabelCustomization[] newArray(int i) {
            return new StripeLabelCustomization[i];
        }
    };
    private String mHeadingTextColor;
    private String mHeadingTextFontName;
    private int mHeadingTextFontSize;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StripeLabelCustomization() {
    }

    private StripeLabelCustomization(Parcel parcel) {
        super(parcel);
        this.mHeadingTextColor = parcel.readString();
        this.mHeadingTextFontName = parcel.readString();
        this.mHeadingTextFontSize = parcel.readInt();
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization
    public String getHeadingTextColor() {
        return this.mHeadingTextColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization
    public String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization
    public int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StripeLabelCustomization) && typedEquals((StripeLabelCustomization) obj);
        }
        return true;
    }

    private boolean typedEquals(StripeLabelCustomization stripeLabelCustomization) {
        return ObjectUtils.equals(this.mHeadingTextColor, stripeLabelCustomization.mHeadingTextColor) && ObjectUtils.equals(this.mHeadingTextFontName, stripeLabelCustomization.mHeadingTextFontName) && this.mHeadingTextFontSize == stripeLabelCustomization.mHeadingTextFontSize;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mHeadingTextColor, this.mHeadingTextFontName, Integer.valueOf(this.mHeadingTextFontSize));
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mHeadingTextColor);
        parcel.writeString(this.mHeadingTextFontName);
        parcel.writeInt(this.mHeadingTextFontSize);
    }
}
