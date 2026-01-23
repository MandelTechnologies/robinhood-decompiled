package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2Ui2faAuthBinding implements ViewBinding {
    public final TextInputLayout first;
    public final TextInputEditText firstEditText;
    public final TextInputLayout fourth;
    private final ConstraintLayout rootView;
    public final TextInputLayout second;
    public final TextInputEditText secondEditText;
    public final TextInputLayout third;

    private Pi2Ui2faAuthBinding(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2, TextInputLayout textInputLayout4) {
        this.rootView = constraintLayout;
        this.first = textInputLayout;
        this.firstEditText = textInputEditText;
        this.fourth = textInputLayout2;
        this.second = textInputLayout3;
        this.secondEditText = textInputEditText2;
        this.third = textInputLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2Ui2faAuthBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2Ui2faAuthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_2fa_auth, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2Ui2faAuthBinding bind(View view) {
        int i = R$id.first;
        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
        if (textInputLayout != null) {
            i = R$id.first_edit_text;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
            if (textInputEditText != null) {
                i = R$id.fourth;
                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout2 != null) {
                    i = R$id.second;
                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                    if (textInputLayout3 != null) {
                        i = R$id.second_edit_text;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                        if (textInputEditText2 != null) {
                            i = R$id.third;
                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                            if (textInputLayout4 != null) {
                                return new Pi2Ui2faAuthBinding((ConstraintLayout) view, textInputLayout, textInputEditText, textInputLayout2, textInputLayout3, textInputEditText2, textInputLayout4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
