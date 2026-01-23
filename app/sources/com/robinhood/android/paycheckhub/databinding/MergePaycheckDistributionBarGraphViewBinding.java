package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.paycheckhub.C25434R;

/* loaded from: classes11.dex */
public final class MergePaycheckDistributionBarGraphViewBinding implements ViewBinding {
    public final View paycheckAmountInvested;
    public final View paycheckAmountReceived;
    private final View rootView;

    private MergePaycheckDistributionBarGraphViewBinding(View view, View view2, View view3) {
        this.rootView = view;
        this.paycheckAmountInvested = view2;
        this.paycheckAmountReceived = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergePaycheckDistributionBarGraphViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25434R.layout.merge_paycheck_distribution_bar_graph_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergePaycheckDistributionBarGraphViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C25434R.id.paycheck_amount_invested;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25434R.id.paycheck_amount_received))) != null) {
            return new MergePaycheckDistributionBarGraphViewBinding(view, viewFindChildViewById2, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
