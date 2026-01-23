package com.robinhood.android.address.p062ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.address.p062ui.C8360R;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes24.dex */
public final class FragmentAddressMapBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final StyleableMapView mapview;
    public final RhTextView onboardingAddressRowMain;
    public final RhTextView onboardingAddressRowSecondary;
    public final RdsTextInputContainerView onboardingAptNumberEditContainer;
    public final RdsFormattedEditText onboardingAptNumberEdt;
    private final ConstraintLayout rootView;

    private FragmentAddressMapBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, StyleableMapView styleableMapView, RhTextView rhTextView, RhTextView rhTextView2, RdsTextInputContainerView rdsTextInputContainerView, RdsFormattedEditText rdsFormattedEditText) {
        this.rootView = constraintLayout;
        this.continueBtn = rdsButton;
        this.mapview = styleableMapView;
        this.onboardingAddressRowMain = rhTextView;
        this.onboardingAddressRowSecondary = rhTextView2;
        this.onboardingAptNumberEditContainer = rdsTextInputContainerView;
        this.onboardingAptNumberEdt = rdsFormattedEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddressMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddressMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8360R.layout.fragment_address_map, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAddressMapBinding bind(View view) {
        int i = C8360R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8360R.id.mapview;
            StyleableMapView styleableMapView = (StyleableMapView) ViewBindings.findChildViewById(view, i);
            if (styleableMapView != null) {
                i = C8360R.id.onboarding_address_row_main;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C8360R.id.onboarding_address_row_secondary;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C8360R.id.onboarding_apt_number_edit_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C8360R.id.onboarding_apt_number_edt;
                            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsFormattedEditText != null) {
                                return new FragmentAddressMapBinding((ConstraintLayout) view, rdsButton, styleableMapView, rhTextView, rhTextView2, rdsTextInputContainerView, rdsFormattedEditText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
