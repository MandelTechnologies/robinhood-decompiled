package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class FragmentRecommendationsDisclosuresBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RhTextView disclosureContent;
    public final DisclosureView disclosureView;
    public final ShimmerLoadingView loadingView;
    private final ConstraintLayout rootView;

    private FragmentRecommendationsDisclosuresBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, DisclosureView disclosureView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = constraintLayout;
        this.continueBtn = rdsButton;
        this.disclosureContent = rhTextView;
        this.disclosureView = disclosureView;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsDisclosuresBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsDisclosuresBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.fragment_recommendations_disclosures, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsDisclosuresBinding bind(View view) {
        int i = C29895R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29895R.id.disclosure_content;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29895R.id.disclosure_view;
                DisclosureView disclosureView = (DisclosureView) ViewBindings.findChildViewById(view, i);
                if (disclosureView != null) {
                    i = C29895R.id.loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        return new FragmentRecommendationsDisclosuresBinding((ConstraintLayout) view, rdsButton, rhTextView, disclosureView, shimmerLoadingView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
