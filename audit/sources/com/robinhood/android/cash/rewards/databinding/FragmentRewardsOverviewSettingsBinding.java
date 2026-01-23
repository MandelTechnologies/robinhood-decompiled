package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOverviewSettingsBinding implements ViewBinding {
    public final RdsRowView rewardsOverviewAssetSelectionRow;
    public final RdsToggleView rewardsOverviewRoundupToggleRow;
    public final RdsHeaderRowView rhySettingsFragmentSupportTitle;
    private final LinearLayout rootView;

    private FragmentRewardsOverviewSettingsBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsToggleView rdsToggleView, RdsHeaderRowView rdsHeaderRowView) {
        this.rootView = linearLayout;
        this.rewardsOverviewAssetSelectionRow = rdsRowView;
        this.rewardsOverviewRoundupToggleRow = rdsToggleView;
        this.rhySettingsFragmentSupportTitle = rdsHeaderRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOverviewSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOverviewSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_overview_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOverviewSettingsBinding bind(View view) {
        int i = C10176R.id.rewards_overview_asset_selection_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C10176R.id.rewards_overview_roundup_toggle_row;
            RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
            if (rdsToggleView != null) {
                i = C10176R.id.rhy_settings_fragment_support_title;
                RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                if (rdsHeaderRowView != null) {
                    return new FragmentRewardsOverviewSettingsBinding((LinearLayout) view, rdsRowView, rdsToggleView, rdsHeaderRowView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
