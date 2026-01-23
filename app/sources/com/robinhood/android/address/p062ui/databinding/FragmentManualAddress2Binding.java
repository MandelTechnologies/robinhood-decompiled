package com.robinhood.android.address.p062ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.address.p062ui.C8360R;
import com.robinhood.android.address.p062ui.StateDropdown;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes24.dex */
public final class FragmentManualAddress2Binding implements ViewBinding {
    public final RdsNumpadView numpad;
    public final RdsFormattedEditText onboardingManualAddressCity;
    public final RdsTextInputContainerView onboardingManualAddressCityTextinput;
    public final RdsButton onboardingManualAddressContinueBtn;
    public final RhTextView onboardingManualAddressPromptTxt;
    public final RdsFormattedEditText onboardingManualAddressProvince;
    public final RdsTextInputContainerView onboardingManualAddressProvinceTextinput;
    public final StateDropdown onboardingManualAddressStateDropdown;
    public final RhTextView onboardingManualAddressTitleTxt;
    public final RdsFormattedEditText onboardingManualAddressZip;
    public final RdsTextInputContainerView onboardingManualAddressZipTextinput;
    private final LinearLayout rootView;

    private FragmentManualAddress2Binding(LinearLayout linearLayout, RdsNumpadView rdsNumpadView, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton, RhTextView rhTextView, RdsFormattedEditText rdsFormattedEditText2, RdsTextInputContainerView rdsTextInputContainerView2, StateDropdown stateDropdown, RhTextView rhTextView2, RdsFormattedEditText rdsFormattedEditText3, RdsTextInputContainerView rdsTextInputContainerView3) {
        this.rootView = linearLayout;
        this.numpad = rdsNumpadView;
        this.onboardingManualAddressCity = rdsFormattedEditText;
        this.onboardingManualAddressCityTextinput = rdsTextInputContainerView;
        this.onboardingManualAddressContinueBtn = rdsButton;
        this.onboardingManualAddressPromptTxt = rhTextView;
        this.onboardingManualAddressProvince = rdsFormattedEditText2;
        this.onboardingManualAddressProvinceTextinput = rdsTextInputContainerView2;
        this.onboardingManualAddressStateDropdown = stateDropdown;
        this.onboardingManualAddressTitleTxt = rhTextView2;
        this.onboardingManualAddressZip = rdsFormattedEditText3;
        this.onboardingManualAddressZipTextinput = rdsTextInputContainerView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentManualAddress2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentManualAddress2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8360R.layout.fragment_manual_address_2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentManualAddress2Binding bind(View view) {
        int i = C8360R.id.numpad;
        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
        if (rdsNumpadView != null) {
            i = C8360R.id.onboarding_manual_address_city;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C8360R.id.onboarding_manual_address_city_textinput;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C8360R.id.onboarding_manual_address_continue_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C8360R.id.onboarding_manual_address_prompt_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C8360R.id.onboarding_manual_address_province;
                            RdsFormattedEditText rdsFormattedEditText2 = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsFormattedEditText2 != null) {
                                i = C8360R.id.onboarding_manual_address_province_textinput;
                                RdsTextInputContainerView rdsTextInputContainerView2 = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                                if (rdsTextInputContainerView2 != null) {
                                    i = C8360R.id.onboarding_manual_address_state_dropdown;
                                    StateDropdown stateDropdown = (StateDropdown) ViewBindings.findChildViewById(view, i);
                                    if (stateDropdown != null) {
                                        i = C8360R.id.onboarding_manual_address_title_txt;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C8360R.id.onboarding_manual_address_zip;
                                            RdsFormattedEditText rdsFormattedEditText3 = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                                            if (rdsFormattedEditText3 != null) {
                                                i = C8360R.id.onboarding_manual_address_zip_textinput;
                                                RdsTextInputContainerView rdsTextInputContainerView3 = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                                                if (rdsTextInputContainerView3 != null) {
                                                    return new FragmentManualAddress2Binding((LinearLayout) view, rdsNumpadView, rdsFormattedEditText, rdsTextInputContainerView, rdsButton, rhTextView, rdsFormattedEditText2, rdsTextInputContainerView2, stateDropdown, rhTextView2, rdsFormattedEditText3, rdsTextInputContainerView3);
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
