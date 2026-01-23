package com.robinhood.android.common.mcduckling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentCardShippingReviewBinding implements ViewBinding {
    public final RdsDataRowView cardShippingReviewAddress;
    public final RdsDataRowView cardShippingReviewCard;
    public final RdsDataRowView cardShippingReviewEstimatedArrival;
    public final RhTextView cardShippingReviewTitle;
    public final RdsButton continueBtn;
    private final LinearLayout rootView;

    private FragmentCardShippingReviewBinding(LinearLayout linearLayout, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RhTextView rhTextView, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.cardShippingReviewAddress = rdsDataRowView;
        this.cardShippingReviewCard = rdsDataRowView2;
        this.cardShippingReviewEstimatedArrival = rdsDataRowView3;
        this.cardShippingReviewTitle = rhTextView;
        this.continueBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardShippingReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardShippingReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11257R.layout.fragment_card_shipping_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardShippingReviewBinding bind(View view) {
        int i = C11257R.id.card_shipping_review_address;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C11257R.id.card_shipping_review_card;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C11257R.id.card_shipping_review_estimated_arrival;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C11257R.id.card_shipping_review_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C11257R.id.continue_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            return new FragmentCardShippingReviewBinding((LinearLayout) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rhTextView, rdsButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
