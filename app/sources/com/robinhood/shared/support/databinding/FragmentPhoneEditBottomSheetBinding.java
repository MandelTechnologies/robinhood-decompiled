package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentPhoneEditBottomSheetBinding implements ViewBinding {
    public final RdsButton phoneEditCancelBtn;
    public final RdsTextButton phoneEditChangeCountryCodeBtn;
    public final RdsFormattedEditText phoneEditInput;
    public final RdsTextInputContainerView phoneEditInputContainer;
    public final RdsButton phoneEditSaveBtn;
    public final RhTextView phoneEditTitleTxt;
    private final ConstraintLayout rootView;

    private FragmentPhoneEditBottomSheetBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsTextButton rdsTextButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton2, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.phoneEditCancelBtn = rdsButton;
        this.phoneEditChangeCountryCodeBtn = rdsTextButton;
        this.phoneEditInput = rdsFormattedEditText;
        this.phoneEditInputContainer = rdsTextInputContainerView;
        this.phoneEditSaveBtn = rdsButton2;
        this.phoneEditTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPhoneEditBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPhoneEditBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_phone_edit_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPhoneEditBottomSheetBinding bind(View view) {
        int i = C39996R.id.phone_edit_cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39996R.id.phone_edit_change_country_code_btn;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C39996R.id.phone_edit_input;
                RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                if (rdsFormattedEditText != null) {
                    i = C39996R.id.phone_edit_input_container;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C39996R.id.phone_edit_save_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C39996R.id.phone_edit_title_txt;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentPhoneEditBottomSheetBinding((ConstraintLayout) view, rdsButton, rdsTextButton, rdsFormattedEditText, rdsTextInputContainerView, rdsButton2, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
