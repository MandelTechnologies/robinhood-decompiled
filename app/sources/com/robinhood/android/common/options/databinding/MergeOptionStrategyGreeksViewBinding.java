package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.row.RdsDataRowView;

/* loaded from: classes2.dex */
public final class MergeOptionStrategyGreeksViewBinding implements ViewBinding {
    public final RdsDataRowView deltaRow;
    public final RdsDataRowView gammaRow;
    public final RdsDataRowView rhoRow;
    private final View rootView;
    public final RdsDataRowView thetaRow;
    public final RdsDataRowView vegaRow;

    private MergeOptionStrategyGreeksViewBinding(View view, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5) {
        this.rootView = view;
        this.deltaRow = rdsDataRowView;
        this.gammaRow = rdsDataRowView2;
        this.rhoRow = rdsDataRowView3;
        this.thetaRow = rdsDataRowView4;
        this.vegaRow = rdsDataRowView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyGreeksViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11303R.layout.merge_option_strategy_greeks_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionStrategyGreeksViewBinding bind(View view) {
        int i = C11303R.id.delta_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C11303R.id.gamma_row;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C11303R.id.rho_row;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C11303R.id.theta_row;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C11303R.id.vega_row;
                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView5 != null) {
                            return new MergeOptionStrategyGreeksViewBinding(view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
