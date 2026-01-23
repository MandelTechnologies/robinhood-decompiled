package com.robinhood.android.optionsplchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar;

/* loaded from: classes11.dex */
public final class MergeMultilegShoppingCartProfitLossBinding implements ViewBinding {
    public final OptionsProfitLossChartView multilegShoppingCartProfitLossChart;
    public final OptionsProfitLossInfoBar multilegShoppingCartProfitLossInfoBar;
    public final RdsButton multilegShoppingCartProfitLossLearnMore;
    public final FrameLayout multilegShoppingCartProfitLossSpacer;
    private final View rootView;

    private MergeMultilegShoppingCartProfitLossBinding(View view, OptionsProfitLossChartView optionsProfitLossChartView, OptionsProfitLossInfoBar optionsProfitLossInfoBar, RdsButton rdsButton, FrameLayout frameLayout) {
        this.rootView = view;
        this.multilegShoppingCartProfitLossChart = optionsProfitLossChartView;
        this.multilegShoppingCartProfitLossInfoBar = optionsProfitLossInfoBar;
        this.multilegShoppingCartProfitLossLearnMore = rdsButton;
        this.multilegShoppingCartProfitLossSpacer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMultilegShoppingCartProfitLossBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24771R.layout.merge_multileg_shopping_cart_profit_loss, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMultilegShoppingCartProfitLossBinding bind(View view) {
        int i = C24771R.id.multileg_shopping_cart_profit_loss_chart;
        OptionsProfitLossChartView optionsProfitLossChartView = (OptionsProfitLossChartView) ViewBindings.findChildViewById(view, i);
        if (optionsProfitLossChartView != null) {
            i = C24771R.id.multileg_shopping_cart_profit_loss_info_bar;
            OptionsProfitLossInfoBar optionsProfitLossInfoBar = (OptionsProfitLossInfoBar) ViewBindings.findChildViewById(view, i);
            if (optionsProfitLossInfoBar != null) {
                i = C24771R.id.multileg_shopping_cart_profit_loss_learn_more;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C24771R.id.multileg_shopping_cart_profit_loss_spacer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        return new MergeMultilegShoppingCartProfitLossBinding(view, optionsProfitLossChartView, optionsProfitLossInfoBar, rdsButton, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
