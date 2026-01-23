package com.stripe.android.stripe3ds2.init.p418ui;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;

/* loaded from: classes26.dex */
public interface UiCustomization {

    public enum ButtonType {
        SUBMIT,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        SELECT
    }

    String getAccentColor();

    ButtonCustomization getButtonCustomization(ButtonType buttonType) throws InvalidInputException;

    LabelCustomization getLabelCustomization();

    TextBoxCustomization getTextBoxCustomization();
}
