package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class MergePortfolioSummaryRowViewBinding implements ViewBinding {
    public final View divider;
    public final ImageView image;
    private final View rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private MergePortfolioSummaryRowViewBinding(View view, View view2, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.divider = view2;
        this.image = imageView;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergePortfolioSummaryRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25978R.layout.merge_portfolio_summary_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergePortfolioSummaryRowViewBinding bind(View view) {
        int i = C25978R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25978R.id.image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C25978R.id.subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C25978R.id.title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergePortfolioSummaryRowViewBinding(view, viewFindChildViewById, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
