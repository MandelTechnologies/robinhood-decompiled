package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;

/* loaded from: classes10.dex */
public final class StripeCardMultilineWidgetBinding implements ViewBinding {
    public final CardBrandView cardBrandView;
    public final FrameLayout cardNumberInputContainer;
    public final CardNumberEditText etCardNumber;
    public final CvcEditText etCvc;
    public final ExpiryDateEditText etExpiry;
    public final PostalCodeEditText etPostalCode;
    private final View rootView;
    public final LinearLayout secondRowLayout;
    public final CardNumberTextInputLayout tlCardNumber;
    public final TextInputLayout tlCvc;
    public final TextInputLayout tlExpiry;
    public final TextInputLayout tlPostalCode;

    private StripeCardMultilineWidgetBinding(View view, CardBrandView cardBrandView, FrameLayout frameLayout, CardNumberEditText cardNumberEditText, CvcEditText cvcEditText, ExpiryDateEditText expiryDateEditText, PostalCodeEditText postalCodeEditText, LinearLayout linearLayout, CardNumberTextInputLayout cardNumberTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.rootView = view;
        this.cardBrandView = cardBrandView;
        this.cardNumberInputContainer = frameLayout;
        this.etCardNumber = cardNumberEditText;
        this.etCvc = cvcEditText;
        this.etExpiry = expiryDateEditText;
        this.etPostalCode = postalCodeEditText;
        this.secondRowLayout = linearLayout;
        this.tlCardNumber = cardNumberTextInputLayout;
        this.tlCvc = textInputLayout;
        this.tlExpiry = textInputLayout2;
        this.tlPostalCode = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeCardMultilineWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.stripe_card_multiline_widget, viewGroup);
        return bind(viewGroup);
    }

    public static StripeCardMultilineWidgetBinding bind(View view) {
        int i = R$id.card_brand_view;
        CardBrandView cardBrandView = (CardBrandView) ViewBindings.findChildViewById(view, i);
        if (cardBrandView != null) {
            i = R$id.card_number_input_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R$id.et_card_number;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) ViewBindings.findChildViewById(view, i);
                if (cardNumberEditText != null) {
                    i = R$id.et_cvc;
                    CvcEditText cvcEditText = (CvcEditText) ViewBindings.findChildViewById(view, i);
                    if (cvcEditText != null) {
                        i = R$id.et_expiry;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) ViewBindings.findChildViewById(view, i);
                        if (expiryDateEditText != null) {
                            i = R$id.et_postal_code;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i);
                            if (postalCodeEditText != null) {
                                i = R$id.second_row_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R$id.tl_card_number;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) ViewBindings.findChildViewById(view, i);
                                    if (cardNumberTextInputLayout != null) {
                                        i = R$id.tl_cvc;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                        if (textInputLayout != null) {
                                            i = R$id.tl_expiry;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout2 != null) {
                                                i = R$id.tl_postal_code;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (textInputLayout3 != null) {
                                                    return new StripeCardMultilineWidgetBinding(view, cardBrandView, frameLayout, cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText, linearLayout, cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
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
