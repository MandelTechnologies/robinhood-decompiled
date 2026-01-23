package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class FragmentOptionUpgradeInvestmentProfileBinding implements ViewBinding {
    public final FrameLayout optionUpgradeInvestmentProfileChildFragmentContainer;
    public final RdsButton optionUpgradeInvestmentProfileDoneBtn;
    private final LinearLayout rootView;

    private FragmentOptionUpgradeInvestmentProfileBinding(LinearLayout linearLayout, FrameLayout frameLayout, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.optionUpgradeInvestmentProfileChildFragmentContainer = frameLayout;
        this.optionUpgradeInvestmentProfileDoneBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionUpgradeInvestmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionUpgradeInvestmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_option_upgrade_investment_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionUpgradeInvestmentProfileBinding bind(View view) {
        int i = C25121R.id.option_upgrade_investment_profile_child_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C25121R.id.option_upgrade_investment_profile_done_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                return new FragmentOptionUpgradeInvestmentProfileBinding((LinearLayout) view, frameLayout, rdsButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
