package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentMarginSubscriptionFeeRefundDetailBinding implements ViewBinding {
    public final RdsDataRowView marginRefundDetailAmount;
    public final RdsDataRowView marginRefundDetailDate;
    private final ScrollView rootView;

    private FragmentMarginSubscriptionFeeRefundDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2) {
        this.rootView = scrollView;
        this.marginRefundDetailAmount = rdsDataRowView;
        this.marginRefundDetailDate = rdsDataRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMarginSubscriptionFeeRefundDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginSubscriptionFeeRefundDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_margin_subscription_fee_refund_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginSubscriptionFeeRefundDetailBinding bind(View view) {
        int i = C18359R.id.margin_refund_detail_amount;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.margin_refund_detail_date;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                return new FragmentMarginSubscriptionFeeRefundDetailBinding((ScrollView) view, rdsDataRowView, rdsDataRowView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
