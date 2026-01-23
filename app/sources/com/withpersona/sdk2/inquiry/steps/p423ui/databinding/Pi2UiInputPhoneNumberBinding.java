package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiInputPhoneNumberBinding implements ViewBinding {
    public final TextInputLayout inputLayout;
    private final TextInputLayout rootView;

    private Pi2UiInputPhoneNumberBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.inputLayout = textInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextInputLayout getRoot() {
        return this.rootView;
    }

    public static Pi2UiInputPhoneNumberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiInputPhoneNumberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_input_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiInputPhoneNumberBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new Pi2UiInputPhoneNumberBinding(textInputLayout, textInputLayout);
    }
}
