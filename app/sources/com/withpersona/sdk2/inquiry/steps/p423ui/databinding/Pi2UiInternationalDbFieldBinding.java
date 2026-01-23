package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiInternationalDbFieldBinding implements ViewBinding {
    public final ConstraintLayout idbContainer;
    public final TextInputLayout idbCountryInput;
    public final AutoCompleteTextView idbCountryTextView;
    public final TextView idbDescription;
    public final TextInputLayout idbIdTypeInput;
    public final AutoCompleteTextView idbIdTypeTextView;
    public final TextView idbLabel;
    public final TextInputLayout idbValueInput;
    public final TextInputEditText idbValueTextView;
    private final ConstraintLayout rootView;

    private Pi2UiInternationalDbFieldBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, TextView textView, TextInputLayout textInputLayout2, AutoCompleteTextView autoCompleteTextView2, TextView textView2, TextInputLayout textInputLayout3, TextInputEditText textInputEditText) {
        this.rootView = constraintLayout;
        this.idbContainer = constraintLayout2;
        this.idbCountryInput = textInputLayout;
        this.idbCountryTextView = autoCompleteTextView;
        this.idbDescription = textView;
        this.idbIdTypeInput = textInputLayout2;
        this.idbIdTypeTextView = autoCompleteTextView2;
        this.idbLabel = textView2;
        this.idbValueInput = textInputLayout3;
        this.idbValueTextView = textInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2UiInternationalDbFieldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiInternationalDbFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_international_db_field, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiInternationalDbFieldBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R$id.idb_country_input;
        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
        if (textInputLayout != null) {
            i = R$id.idb_country_text_view;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, i);
            if (autoCompleteTextView != null) {
                i = R$id.idb_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R$id.idb_id_type_input;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                    if (textInputLayout2 != null) {
                        i = R$id.idb_id_type_text_view;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) ViewBindings.findChildViewById(view, i);
                        if (autoCompleteTextView2 != null) {
                            i = R$id.idb_label;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R$id.idb_value_input;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                if (textInputLayout3 != null) {
                                    i = R$id.idb_value_text_view;
                                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                    if (textInputEditText != null) {
                                        return new Pi2UiInternationalDbFieldBinding(constraintLayout, constraintLayout, textInputLayout, autoCompleteTextView, textView, textInputLayout2, autoCompleteTextView2, textView2, textInputLayout3, textInputEditText);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
