package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class IncludeOrderLoadingViewBinding implements ViewBinding {
    public final Guideline guideline;
    public final ConstraintLayout loadingView;
    public final RhTextView orderDisclaimerTxt;
    public final RdsProgressBar progressBar;
    private final ConstraintLayout rootView;

    private IncludeOrderLoadingViewBinding(ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, RhTextView rhTextView, RdsProgressBar rdsProgressBar) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.loadingView = constraintLayout2;
        this.orderDisclaimerTxt = rhTextView;
        this.progressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOrderLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.include_order_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderLoadingViewBinding bind(View view) {
        int i = C20649R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C20649R.id.order_disclaimer_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C20649R.id.progress_bar;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    return new IncludeOrderLoadingViewBinding(constraintLayout, guideline, constraintLayout, rhTextView, rdsProgressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
