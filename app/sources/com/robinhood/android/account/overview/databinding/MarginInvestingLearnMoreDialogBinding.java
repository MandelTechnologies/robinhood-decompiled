package com.robinhood.android.account.overview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class MarginInvestingLearnMoreDialogBinding implements ViewBinding {
    public final RhTextView contentText;
    public final ShimmerLoadingView loadingView;
    public final RdsButton positiveBtn;
    private final LinearLayout rootView;

    private MarginInvestingLearnMoreDialogBinding(LinearLayout linearLayout, RhTextView rhTextView, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.contentText = rhTextView;
        this.loadingView = shimmerLoadingView;
        this.positiveBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MarginInvestingLearnMoreDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MarginInvestingLearnMoreDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8159R.layout.margin_investing_learn_more_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MarginInvestingLearnMoreDialogBinding bind(View view) {
        int i = C8159R.id.content_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8159R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C8159R.id.positive_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    return new MarginInvestingLearnMoreDialogBinding((LinearLayout) view, rhTextView, shimmerLoadingView, rdsButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
