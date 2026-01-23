package com.robinhood.android.address.p062ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.address.p062ui.C8360R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes24.dex */
public final class FragmentManualAddress1Binding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RdsFormattedEditText onboardingManualAddressLine1;
    public final RdsTextInputContainerView onboardingManualAddressLine1Textinput;
    public final RdsFormattedEditText onboardingManualAddressLine2;
    public final RdsTextInputContainerView onboardingManualAddressLine2Textinput;
    public final RhTextView onboardingManualAddressPromptTxt;
    public final RhTextView onboardingManualAddressTitleTxt;
    private final LinearLayout rootView;

    private FragmentManualAddress1Binding(LinearLayout linearLayout, RdsButton rdsButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsFormattedEditText rdsFormattedEditText2, RdsTextInputContainerView rdsTextInputContainerView2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.continueBtn = rdsButton;
        this.onboardingManualAddressLine1 = rdsFormattedEditText;
        this.onboardingManualAddressLine1Textinput = rdsTextInputContainerView;
        this.onboardingManualAddressLine2 = rdsFormattedEditText2;
        this.onboardingManualAddressLine2Textinput = rdsTextInputContainerView2;
        this.onboardingManualAddressPromptTxt = rhTextView;
        this.onboardingManualAddressTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentManualAddress1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentManualAddress1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8360R.layout.fragment_manual_address_1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentManualAddress1Binding bind(View view) {
        int i = C8360R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8360R.id.onboarding_manual_address_line_1;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C8360R.id.onboarding_manual_address_line_1_textinput;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C8360R.id.onboarding_manual_address_line_2;
                    RdsFormattedEditText rdsFormattedEditText2 = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsFormattedEditText2 != null) {
                        i = C8360R.id.onboarding_manual_address_line_2_textinput;
                        RdsTextInputContainerView rdsTextInputContainerView2 = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView2 != null) {
                            i = C8360R.id.onboarding_manual_address_prompt_txt;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C8360R.id.onboarding_manual_address_title_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentManualAddress1Binding((LinearLayout) view, rdsButton, rdsFormattedEditText, rdsTextInputContainerView, rdsFormattedEditText2, rdsTextInputContainerView2, rhTextView, rhTextView2);
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
