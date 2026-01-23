package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentMarginSubscriptionFeeDetailBinding implements ViewBinding {
    public final RdsDataRowView feeCost;
    public final RdsDataRowView feeCredit;
    public final RdsDataRowView feeDate;
    public final LinearLayout feeHasCreditWrapper;
    public final RdsDataRowView feeTotal;
    private final ScrollView rootView;

    private FragmentMarginSubscriptionFeeDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, LinearLayout linearLayout, RdsDataRowView rdsDataRowView4) {
        this.rootView = scrollView;
        this.feeCost = rdsDataRowView;
        this.feeCredit = rdsDataRowView2;
        this.feeDate = rdsDataRowView3;
        this.feeHasCreditWrapper = linearLayout;
        this.feeTotal = rdsDataRowView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMarginSubscriptionFeeDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginSubscriptionFeeDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_margin_subscription_fee_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginSubscriptionFeeDetailBinding bind(View view) {
        int i = C18359R.id.fee_cost;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.fee_credit;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C18359R.id.fee_date;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C18359R.id.fee_has_credit_wrapper;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C18359R.id.fee_total;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            return new FragmentMarginSubscriptionFeeDetailBinding((ScrollView) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, linearLayout, rdsDataRowView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
