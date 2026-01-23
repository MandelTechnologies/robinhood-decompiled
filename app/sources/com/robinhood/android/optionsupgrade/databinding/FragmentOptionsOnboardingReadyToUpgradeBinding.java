package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class FragmentOptionsOnboardingReadyToUpgradeBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ComposeView rows;

    private FragmentOptionsOnboardingReadyToUpgradeBinding(LinearLayout linearLayout, ComposeView composeView) {
        this.rootView = linearLayout;
        this.rows = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsOnboardingReadyToUpgradeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsOnboardingReadyToUpgradeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_options_onboarding_ready_to_upgrade, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsOnboardingReadyToUpgradeBinding bind(View view) {
        int i = C25121R.id.rows;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new FragmentOptionsOnboardingReadyToUpgradeBinding((LinearLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
