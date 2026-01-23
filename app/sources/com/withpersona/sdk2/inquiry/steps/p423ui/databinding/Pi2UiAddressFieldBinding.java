package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiAddressFieldBinding implements ViewBinding {
    public final TextInputLayout addressCity;
    public final TextView addressExpandComponentsButton;
    public final TextInputLayout addressFieldCollapsed;
    public final MaterialAutoCompleteTextView addressFieldCollapsedTextView;
    public final TextInputLayout addressFieldExpanded;
    public final MaterialAutoCompleteTextView addressFieldExpandedTextView;
    public final ConstraintLayout addressFields;
    public final ConstraintLayout addressFieldsCollapsed;
    public final ConstraintLayout addressFieldsExpanded;
    public final TextView addressLabel;
    public final TextInputLayout addressPostalCode;
    public final TextInputLayout addressSubdivision;
    public final TextInputLayout addressSuite;
    public final TextInputEditText editTextCity;
    public final TextInputEditText editTextPostalCode;
    public final TextInputEditText editTextSubdivision;
    public final TextInputEditText editTextSuite;
    public final CircularProgressIndicator progressIndicator;
    private final ConstraintLayout rootView;

    private Pi2UiAddressFieldBinding(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, MaterialAutoCompleteTextView materialAutoCompleteTextView, TextInputLayout textInputLayout3, MaterialAutoCompleteTextView materialAutoCompleteTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView2, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = constraintLayout;
        this.addressCity = textInputLayout;
        this.addressExpandComponentsButton = textView;
        this.addressFieldCollapsed = textInputLayout2;
        this.addressFieldCollapsedTextView = materialAutoCompleteTextView;
        this.addressFieldExpanded = textInputLayout3;
        this.addressFieldExpandedTextView = materialAutoCompleteTextView2;
        this.addressFields = constraintLayout2;
        this.addressFieldsCollapsed = constraintLayout3;
        this.addressFieldsExpanded = constraintLayout4;
        this.addressLabel = textView2;
        this.addressPostalCode = textInputLayout4;
        this.addressSubdivision = textInputLayout5;
        this.addressSuite = textInputLayout6;
        this.editTextCity = textInputEditText;
        this.editTextPostalCode = textInputEditText2;
        this.editTextSubdivision = textInputEditText3;
        this.editTextSuite = textInputEditText4;
        this.progressIndicator = circularProgressIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2UiAddressFieldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiAddressFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_address_field, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiAddressFieldBinding bind(View view) {
        int i = R$id.address_city;
        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
        if (textInputLayout != null) {
            i = R$id.address_expand_components_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R$id.address_field_collapsed;
                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout2 != null) {
                    i = R$id.address_field_collapsed_text_view;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) ViewBindings.findChildViewById(view, i);
                    if (materialAutoCompleteTextView != null) {
                        i = R$id.address_field_expanded;
                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                        if (textInputLayout3 != null) {
                            i = R$id.address_field_expanded_text_view;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) ViewBindings.findChildViewById(view, i);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = R$id.address_fields_collapsed;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R$id.address_fields_expanded;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = R$id.address_label;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R$id.address_postal_code;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout4 != null) {
                                                i = R$id.address_subdivision;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (textInputLayout5 != null) {
                                                    i = R$id.address_suite;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                    if (textInputLayout6 != null) {
                                                        i = R$id.edit_text_city;
                                                        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                                        if (textInputEditText != null) {
                                                            i = R$id.edit_text_postal_code;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                                            if (textInputEditText2 != null) {
                                                                i = R$id.edit_text_subdivision;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                                                if (textInputEditText3 != null) {
                                                                    i = R$id.edit_text_suite;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                                                    if (textInputEditText4 != null) {
                                                                        i = R$id.progress_indicator;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                                                                        if (circularProgressIndicator != null) {
                                                                            return new Pi2UiAddressFieldBinding(constraintLayout, textInputLayout, textView, textInputLayout2, materialAutoCompleteTextView, textInputLayout3, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, constraintLayout3, textView2, textInputLayout4, textInputLayout5, textInputLayout6, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, circularProgressIndicator);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
