package com.robinhood.android.settings.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.settings.settings.C28321R;

/* loaded from: classes5.dex */
public final class MergeTrustedContactTextInputBinding implements ViewBinding {
    private final View rootView;
    public final RdsTextInputContainerView trustedContactInputContainer;
    public final RdsFormattedEditText trustedContactInputEditText;
    public final RhTextView trustedContactInputTextTitle;
    public final RhTextView trustedContactInputTextTrailingButton;

    private MergeTrustedContactTextInputBinding(View view, RdsTextInputContainerView rdsTextInputContainerView, RdsFormattedEditText rdsFormattedEditText, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.trustedContactInputContainer = rdsTextInputContainerView;
        this.trustedContactInputEditText = rdsFormattedEditText;
        this.trustedContactInputTextTitle = rhTextView;
        this.trustedContactInputTextTrailingButton = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTrustedContactTextInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28321R.layout.merge_trusted_contact_text_input, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTrustedContactTextInputBinding bind(View view) {
        int i = C28321R.id.trusted_contact_input_container;
        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputContainerView != null) {
            i = C28321R.id.trusted_contact_input_edit_text;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C28321R.id.trusted_contact_input_text_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28321R.id.trusted_contact_input_text_trailing_button;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeTrustedContactTextInputBinding(view, rdsTextInputContainerView, rdsFormattedEditText, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
