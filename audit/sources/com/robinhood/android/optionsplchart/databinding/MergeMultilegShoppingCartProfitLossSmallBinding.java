package com.robinhood.android.optionsplchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.optionsplchart.C24771R;

/* loaded from: classes11.dex */
public final class MergeMultilegShoppingCartProfitLossSmallBinding implements ViewBinding {
    public final RdsButton multilegShoppingCartProfitLossAnalysisBtn;
    private final View rootView;

    private MergeMultilegShoppingCartProfitLossSmallBinding(View view, RdsButton rdsButton) {
        this.rootView = view;
        this.multilegShoppingCartProfitLossAnalysisBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMultilegShoppingCartProfitLossSmallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24771R.layout.merge_multileg_shopping_cart_profit_loss_small, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMultilegShoppingCartProfitLossSmallBinding bind(View view) {
        int i = C24771R.id.multileg_shopping_cart_profit_loss_analysis_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new MergeMultilegShoppingCartProfitLossSmallBinding(view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
