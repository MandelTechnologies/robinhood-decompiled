package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class FragmentOptionsUpgradeStrategiesBinding implements ViewBinding {
    public final RdsRowView optionsUpgradeStrategiesBearishRow;
    public final RdsRowView optionsUpgradeStrategiesBullishRow;
    public final RdsButton optionsUpgradeStrategiesContinueBtn;
    public final RdsRowView optionsUpgradeStrategiesLowVolatilityRow;
    private final LinearLayout rootView;

    private FragmentOptionsUpgradeStrategiesBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsButton rdsButton, RdsRowView rdsRowView3) {
        this.rootView = linearLayout;
        this.optionsUpgradeStrategiesBearishRow = rdsRowView;
        this.optionsUpgradeStrategiesBullishRow = rdsRowView2;
        this.optionsUpgradeStrategiesContinueBtn = rdsButton;
        this.optionsUpgradeStrategiesLowVolatilityRow = rdsRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsUpgradeStrategiesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsUpgradeStrategiesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_options_upgrade_strategies, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsUpgradeStrategiesBinding bind(View view) {
        int i = C25121R.id.options_upgrade_strategies_bearish_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C25121R.id.options_upgrade_strategies_bullish_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C25121R.id.options_upgrade_strategies_continue_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C25121R.id.options_upgrade_strategies_low_volatility_row;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        return new FragmentOptionsUpgradeStrategiesBinding((LinearLayout) view, rdsRowView, rdsRowView2, rdsButton, rdsRowView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
