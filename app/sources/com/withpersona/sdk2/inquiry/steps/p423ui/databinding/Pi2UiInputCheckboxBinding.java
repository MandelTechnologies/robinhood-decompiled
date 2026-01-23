package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiInputCheckboxBinding implements ViewBinding {
    public final MaterialCheckBox checkbox;
    public final TextView checkboxDescription;
    public final TextView checkboxError;
    public final TextView checkboxLabel;
    private final ConstraintLayout rootView;

    private Pi2UiInputCheckboxBinding(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.checkbox = materialCheckBox;
        this.checkboxDescription = textView;
        this.checkboxError = textView2;
        this.checkboxLabel = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2UiInputCheckboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiInputCheckboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_input_checkbox, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiInputCheckboxBinding bind(View view) {
        int i = R$id.checkbox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ViewBindings.findChildViewById(view, i);
        if (materialCheckBox != null) {
            i = R$id.checkbox_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R$id.checkbox_error;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R$id.checkbox_label;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new Pi2UiInputCheckboxBinding((ConstraintLayout) view, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
