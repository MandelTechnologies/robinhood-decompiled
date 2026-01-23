package com.robinhood.android.address.p062ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.address.p062ui.C8360R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAddressSelectorBinding implements ViewBinding {
    public final Space extraSpace1;
    public final Space extraSpace2;
    public final RhTextView onboardingAddressDisclaimer;
    public final RdsTextInputEditText onboardingAddressEdt;
    public final RdsTextInputContainerView onboardingAddressInputContainer;
    public final RdsProgressBar onboardingAddressProgressBar;
    public final RhTextView onboardingAddressRequiredInfoDisclaimer;
    public final RecyclerView onboardingAddressSelectorList;
    private final LinearLayout rootView;

    private FragmentAddressSelectorBinding(LinearLayout linearLayout, Space space, Space space2, RhTextView rhTextView, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsProgressBar rdsProgressBar, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.extraSpace1 = space;
        this.extraSpace2 = space2;
        this.onboardingAddressDisclaimer = rhTextView;
        this.onboardingAddressEdt = rdsTextInputEditText;
        this.onboardingAddressInputContainer = rdsTextInputContainerView;
        this.onboardingAddressProgressBar = rdsProgressBar;
        this.onboardingAddressRequiredInfoDisclaimer = rhTextView2;
        this.onboardingAddressSelectorList = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddressSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddressSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8360R.layout.fragment_address_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAddressSelectorBinding bind(View view) {
        int i = C8360R.id.extra_space_1;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C8360R.id.extra_space_2;
            Space space2 = (Space) ViewBindings.findChildViewById(view, i);
            if (space2 != null) {
                i = C8360R.id.onboarding_address_disclaimer;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C8360R.id.onboarding_address_edt;
                    RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputEditText != null) {
                        i = C8360R.id.onboarding_address_input_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C8360R.id.onboarding_address_progress_bar;
                            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                            if (rdsProgressBar != null) {
                                i = C8360R.id.onboarding_address_required_info_disclaimer;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C8360R.id.onboarding_address_selector_list;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        return new FragmentAddressSelectorBinding((LinearLayout) view, space, space2, rhTextView, rdsTextInputEditText, rdsTextInputContainerView, rdsProgressBar, rhTextView2, recyclerView);
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
