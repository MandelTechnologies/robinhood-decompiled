package com.robinhood.android.settings.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactAddressInput;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactTextInput;

/* loaded from: classes5.dex */
public final class FragmentTrustedContactUpdateBinding implements ViewBinding {
    public final LinearLayout inputContainer;
    public final RdsNumpadView numpad;
    private final LinearLayout rootView;
    public final ScrollView trustedAccountScrollView;
    public final TrustedContactAddressInput trustedContactAddressSelectContainer;
    public final TrustedContactTextInput trustedContactEmailInput;
    public final TrustedContactTextInput trustedContactFirstNameInput;
    public final RhTextView trustedContactInputTextTitle;
    public final TrustedContactTextInput trustedContactLastNameInput;
    public final TrustedContactTextInput trustedContactPhoneInput;
    public final RdsButton trustedContactPrimaryCta;
    public final RhTextView trustedContactUpdateSubtitle;
    public final RhTextView trustedContactUpdateTitle;

    private FragmentTrustedContactUpdateBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RdsNumpadView rdsNumpadView, ScrollView scrollView, TrustedContactAddressInput trustedContactAddressInput, TrustedContactTextInput trustedContactTextInput, TrustedContactTextInput trustedContactTextInput2, RhTextView rhTextView, TrustedContactTextInput trustedContactTextInput3, TrustedContactTextInput trustedContactTextInput4, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.inputContainer = linearLayout2;
        this.numpad = rdsNumpadView;
        this.trustedAccountScrollView = scrollView;
        this.trustedContactAddressSelectContainer = trustedContactAddressInput;
        this.trustedContactEmailInput = trustedContactTextInput;
        this.trustedContactFirstNameInput = trustedContactTextInput2;
        this.trustedContactInputTextTitle = rhTextView;
        this.trustedContactLastNameInput = trustedContactTextInput3;
        this.trustedContactPhoneInput = trustedContactTextInput4;
        this.trustedContactPrimaryCta = rdsButton;
        this.trustedContactUpdateSubtitle = rhTextView2;
        this.trustedContactUpdateTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTrustedContactUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTrustedContactUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28321R.layout.fragment_trusted_contact_update, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTrustedContactUpdateBinding bind(View view) {
        int i = C28321R.id.input_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C28321R.id.numpad;
            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadView != null) {
                i = C28321R.id.trusted_account_scroll_view;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C28321R.id.trusted_contact_address_select_container;
                    TrustedContactAddressInput trustedContactAddressInput = (TrustedContactAddressInput) ViewBindings.findChildViewById(view, i);
                    if (trustedContactAddressInput != null) {
                        i = C28321R.id.trusted_contact_email_input;
                        TrustedContactTextInput trustedContactTextInput = (TrustedContactTextInput) ViewBindings.findChildViewById(view, i);
                        if (trustedContactTextInput != null) {
                            i = C28321R.id.trusted_contact_first_name_input;
                            TrustedContactTextInput trustedContactTextInput2 = (TrustedContactTextInput) ViewBindings.findChildViewById(view, i);
                            if (trustedContactTextInput2 != null) {
                                i = C28321R.id.trusted_contact_input_text_title;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C28321R.id.trusted_contact_last_name_input;
                                    TrustedContactTextInput trustedContactTextInput3 = (TrustedContactTextInput) ViewBindings.findChildViewById(view, i);
                                    if (trustedContactTextInput3 != null) {
                                        i = C28321R.id.trusted_contact_phone_input;
                                        TrustedContactTextInput trustedContactTextInput4 = (TrustedContactTextInput) ViewBindings.findChildViewById(view, i);
                                        if (trustedContactTextInput4 != null) {
                                            i = C28321R.id.trusted_contact_primary_cta;
                                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton != null) {
                                                i = C28321R.id.trusted_contact_update_subtitle;
                                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView2 != null) {
                                                    i = C28321R.id.trusted_contact_update_title;
                                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView3 != null) {
                                                        return new FragmentTrustedContactUpdateBinding((LinearLayout) view, linearLayout, rdsNumpadView, scrollView, trustedContactAddressInput, trustedContactTextInput, trustedContactTextInput2, rhTextView, trustedContactTextInput3, trustedContactTextInput4, rdsButton, rhTextView2, rhTextView3);
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
