package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;

/* loaded from: classes10.dex */
public final class StripeCardInputWidgetBinding implements ViewBinding {
    public final CardBrandView cardBrandView;
    public final CardNumberEditText cardNumberEditText;
    public final TextInputLayout cardNumberTextInputLayout;
    public final FrameLayout container;
    public final CvcEditText cvcEditText;
    public final TextInputLayout cvcTextInputLayout;
    public final ExpiryDateEditText expiryDateEditText;
    public final TextInputLayout expiryDateTextInputLayout;
    public final PostalCodeEditText postalCodeEditText;
    public final TextInputLayout postalCodeTextInputLayout;
    private final View rootView;

    private StripeCardInputWidgetBinding(View view, CardBrandView cardBrandView, CardNumberEditText cardNumberEditText, TextInputLayout textInputLayout, FrameLayout frameLayout, CvcEditText cvcEditText, TextInputLayout textInputLayout2, ExpiryDateEditText expiryDateEditText, TextInputLayout textInputLayout3, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.cardBrandView = cardBrandView;
        this.cardNumberEditText = cardNumberEditText;
        this.cardNumberTextInputLayout = textInputLayout;
        this.container = frameLayout;
        this.cvcEditText = cvcEditText;
        this.cvcTextInputLayout = textInputLayout2;
        this.expiryDateEditText = expiryDateEditText;
        this.expiryDateTextInputLayout = textInputLayout3;
        this.postalCodeEditText = postalCodeEditText;
        this.postalCodeTextInputLayout = textInputLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeCardInputWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.stripe_card_input_widget, viewGroup);
        return bind(viewGroup);
    }

    public static StripeCardInputWidgetBinding bind(View view) {
        int i = R$id.card_brand_view;
        CardBrandView cardBrandView = (CardBrandView) ViewBindings.findChildViewById(view, i);
        if (cardBrandView != null) {
            i = R$id.card_number_edit_text;
            CardNumberEditText cardNumberEditText = (CardNumberEditText) ViewBindings.findChildViewById(view, i);
            if (cardNumberEditText != null) {
                i = R$id.card_number_text_input_layout;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout != null) {
                    i = R$id.container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R$id.cvc_edit_text;
                        CvcEditText cvcEditText = (CvcEditText) ViewBindings.findChildViewById(view, i);
                        if (cvcEditText != null) {
                            i = R$id.cvc_text_input_layout;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                            if (textInputLayout2 != null) {
                                i = R$id.expiry_date_edit_text;
                                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) ViewBindings.findChildViewById(view, i);
                                if (expiryDateEditText != null) {
                                    i = R$id.expiry_date_text_input_layout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                    if (textInputLayout3 != null) {
                                        i = R$id.postal_code_edit_text;
                                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i);
                                        if (postalCodeEditText != null) {
                                            i = R$id.postal_code_text_input_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout4 != null) {
                                                return new StripeCardInputWidgetBinding(view, cardBrandView, cardNumberEditText, textInputLayout, frameLayout, cvcEditText, textInputLayout2, expiryDateEditText, textInputLayout3, postalCodeEditText, textInputLayout4);
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
