package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2RadioButtonBinding implements ViewBinding {
    public final MaterialRadioButton radioButton;
    public final TextView radioButtonDescription;
    public final TextView radioButtonLabel;
    private final ConstraintLayout rootView;

    private Pi2RadioButtonBinding(ConstraintLayout constraintLayout, MaterialRadioButton materialRadioButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.radioButton = materialRadioButton;
        this.radioButtonDescription = textView;
        this.radioButtonLabel = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2RadioButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_radio_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2RadioButtonBinding bind(View view) {
        int i = R$id.radio_button;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) ViewBindings.findChildViewById(view, i);
        if (materialRadioButton != null) {
            i = R$id.radio_button_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R$id.radio_button_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new Pi2RadioButtonBinding((ConstraintLayout) view, materialRadioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
