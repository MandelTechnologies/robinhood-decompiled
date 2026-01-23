package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.ChipTabLayout;

/* loaded from: classes11.dex */
public final class FragmentOptionsUpgradeComparisonBinding implements ViewBinding {
    public final ChipTabLayout optionsUpgradeChipTabs;
    public final ViewPager2 optionsUpgradeSpreadsPager;
    private final LinearLayout rootView;

    private FragmentOptionsUpgradeComparisonBinding(LinearLayout linearLayout, ChipTabLayout chipTabLayout, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.optionsUpgradeChipTabs = chipTabLayout;
        this.optionsUpgradeSpreadsPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsUpgradeComparisonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsUpgradeComparisonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_options_upgrade_comparison, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsUpgradeComparisonBinding bind(View view) {
        int i = C25121R.id.options_upgrade_chip_tabs;
        ChipTabLayout chipTabLayout = (ChipTabLayout) ViewBindings.findChildViewById(view, i);
        if (chipTabLayout != null) {
            i = C25121R.id.options_upgrade_spreads_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new FragmentOptionsUpgradeComparisonBinding((LinearLayout) view, chipTabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
