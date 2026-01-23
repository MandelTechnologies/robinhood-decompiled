package com.stripe.android.stripe3ds2.init.p418ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.p418ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes26.dex */
public final class StripeUiCustomization implements UiCustomization, Parcelable {
    public static final Parcelable.Creator<StripeUiCustomization> CREATOR = new Parcelable.Creator<StripeUiCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization createFromParcel(Parcel parcel) {
            return new StripeUiCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization[] newArray(int i) {
            return new StripeUiCustomization[i];
        }
    };
    private String mAccentColor;
    private final Map<String, ButtonCustomization> mCustomButtonTypeCustomization;
    private final Map<UiCustomization.ButtonType, ButtonCustomization> mDefaultButtonTypeCustomizations;
    private LabelCustomization mLabelCustomization;
    private TextBoxCustomization mTextBoxCustomization;
    private ToolbarCustomization mToolbarCustomization;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StripeUiCustomization() {
        this.mDefaultButtonTypeCustomizations = new EnumMap(UiCustomization.ButtonType.class);
        this.mCustomButtonTypeCustomization = new HashMap();
    }

    private StripeUiCustomization(Parcel parcel) {
        this.mAccentColor = parcel.readString();
        this.mToolbarCustomization = (ToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
        this.mLabelCustomization = (LabelCustomization) parcel.readParcelable(StripeLabelCustomization.class.getClassLoader());
        this.mTextBoxCustomization = (TextBoxCustomization) parcel.readParcelable(StripeTextBoxCustomization.class.getClassLoader());
        this.mDefaultButtonTypeCustomizations = new HashMap();
        Bundle bundle = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                ButtonCustomization buttonCustomization = (ButtonCustomization) BundleCompat.getParcelable(bundle, str, ButtonCustomization.class);
                if (buttonCustomization != null) {
                    this.mDefaultButtonTypeCustomizations.put(UiCustomization.ButtonType.valueOf(str), buttonCustomization);
                }
            }
        }
        this.mCustomButtonTypeCustomization = new HashMap();
        Bundle bundle2 = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                ButtonCustomization buttonCustomization2 = (ButtonCustomization) BundleCompat.getParcelable(bundle2, str2, ButtonCustomization.class);
                if (buttonCustomization2 != null) {
                    this.mCustomButtonTypeCustomization.put(str2, buttonCustomization2);
                }
            }
        }
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.UiCustomization
    public ButtonCustomization getButtonCustomization(UiCustomization.ButtonType buttonType) throws InvalidInputException {
        return this.mDefaultButtonTypeCustomizations.get(buttonType);
    }

    public ToolbarCustomization getToolbarCustomization() {
        return this.mToolbarCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.UiCustomization
    public LabelCustomization getLabelCustomization() {
        return this.mLabelCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.UiCustomization
    public TextBoxCustomization getTextBoxCustomization() {
        return this.mTextBoxCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.p418ui.UiCustomization
    public String getAccentColor() {
        return this.mAccentColor;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StripeUiCustomization) && typedEquals((StripeUiCustomization) obj);
        }
        return true;
    }

    private boolean typedEquals(StripeUiCustomization stripeUiCustomization) {
        return ObjectUtils.equals(this.mToolbarCustomization, stripeUiCustomization.mToolbarCustomization) && ObjectUtils.equals(this.mAccentColor, stripeUiCustomization.mAccentColor) && ObjectUtils.equals(this.mLabelCustomization, stripeUiCustomization.mLabelCustomization) && ObjectUtils.equals(this.mTextBoxCustomization, stripeUiCustomization.mTextBoxCustomization) && ObjectUtils.equals(this.mDefaultButtonTypeCustomizations, stripeUiCustomization.mDefaultButtonTypeCustomizations) && ObjectUtils.equals(this.mCustomButtonTypeCustomization, stripeUiCustomization.mCustomButtonTypeCustomization);
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mToolbarCustomization, this.mAccentColor, this.mLabelCustomization, this.mTextBoxCustomization, this.mDefaultButtonTypeCustomizations, this.mCustomButtonTypeCustomization);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccentColor);
        parcel.writeParcelable((StripeToolbarCustomization) this.mToolbarCustomization, 0);
        parcel.writeParcelable((StripeLabelCustomization) this.mLabelCustomization, 0);
        parcel.writeParcelable((StripeTextBoxCustomization) this.mTextBoxCustomization, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry<UiCustomization.ButtonType, ButtonCustomization> entry : this.mDefaultButtonTypeCustomizations.entrySet()) {
            bundle.putParcelable(entry.getKey().name(), (StripeButtonCustomization) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, ButtonCustomization> entry2 : this.mCustomButtonTypeCustomization.entrySet()) {
            bundle2.putParcelable(entry2.getKey(), (StripeButtonCustomization) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }
}
