package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.StrategyDetailRowView;

/* loaded from: classes11.dex */
public final class FragmentOptionsUpgradeStrategyDetailBinding implements ViewBinding {
    public final RhTextView optionsUpgradeStrategyDetailBody;
    public final StrategyDetailRowView optionsUpgradeStrategyDetailFirstRow;
    public final StrategyDetailRowView optionsUpgradeStrategyDetailSecondRow;
    public final StrategyDetailRowView optionsUpgradeStrategyDetailThirdRow;
    public final RhTextView optionsUpgradeStrategyDetailTitle;
    private final ScrollView rootView;

    private FragmentOptionsUpgradeStrategyDetailBinding(ScrollView scrollView, RhTextView rhTextView, StrategyDetailRowView strategyDetailRowView, StrategyDetailRowView strategyDetailRowView2, StrategyDetailRowView strategyDetailRowView3, RhTextView rhTextView2) {
        this.rootView = scrollView;
        this.optionsUpgradeStrategyDetailBody = rhTextView;
        this.optionsUpgradeStrategyDetailFirstRow = strategyDetailRowView;
        this.optionsUpgradeStrategyDetailSecondRow = strategyDetailRowView2;
        this.optionsUpgradeStrategyDetailThirdRow = strategyDetailRowView3;
        this.optionsUpgradeStrategyDetailTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsUpgradeStrategyDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsUpgradeStrategyDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_options_upgrade_strategy_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsUpgradeStrategyDetailBinding bind(View view) {
        int i = C25121R.id.options_upgrade_strategy_detail_body;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25121R.id.options_upgrade_strategy_detail_first_row;
            StrategyDetailRowView strategyDetailRowView = (StrategyDetailRowView) ViewBindings.findChildViewById(view, i);
            if (strategyDetailRowView != null) {
                i = C25121R.id.options_upgrade_strategy_detail_second_row;
                StrategyDetailRowView strategyDetailRowView2 = (StrategyDetailRowView) ViewBindings.findChildViewById(view, i);
                if (strategyDetailRowView2 != null) {
                    i = C25121R.id.options_upgrade_strategy_detail_third_row;
                    StrategyDetailRowView strategyDetailRowView3 = (StrategyDetailRowView) ViewBindings.findChildViewById(view, i);
                    if (strategyDetailRowView3 != null) {
                        i = C25121R.id.options_upgrade_strategy_detail_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentOptionsUpgradeStrategyDetailBinding((ScrollView) view, rhTextView, strategyDetailRowView, strategyDetailRowView2, strategyDetailRowView3, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
