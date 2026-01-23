package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.IpoQuoteGraphLayout;
import com.robinhood.android.graph.IntervalSelectorLayout;

/* loaded from: classes3.dex */
public final class IncludeIpoQuoteGraphLayoutBinding implements ViewBinding {
    public final IntervalSelectorLayout intervalSelectorLayout;
    public final RhTextView ipoDetailTxt;
    public final AnimatedRhTextView ipoEstimatedPriceTxt;
    public final RhTextView ipoHeaderTxt;
    public final ImageView ipoImg;
    public final LinearLayout quoteGraphLayoutCardContent;
    private final IpoQuoteGraphLayout rootView;

    private IncludeIpoQuoteGraphLayoutBinding(IpoQuoteGraphLayout ipoQuoteGraphLayout, IntervalSelectorLayout intervalSelectorLayout, RhTextView rhTextView, AnimatedRhTextView animatedRhTextView, RhTextView rhTextView2, ImageView imageView, LinearLayout linearLayout) {
        this.rootView = ipoQuoteGraphLayout;
        this.intervalSelectorLayout = intervalSelectorLayout;
        this.ipoDetailTxt = rhTextView;
        this.ipoEstimatedPriceTxt = animatedRhTextView;
        this.ipoHeaderTxt = rhTextView2;
        this.ipoImg = imageView;
        this.quoteGraphLayoutCardContent = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoQuoteGraphLayout getRoot() {
        return this.rootView;
    }

    public static IncludeIpoQuoteGraphLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoQuoteGraphLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_ipo_quote_graph_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoQuoteGraphLayoutBinding bind(View view) {
        int i = C15314R.id.interval_selector_layout;
        IntervalSelectorLayout intervalSelectorLayout = (IntervalSelectorLayout) ViewBindings.findChildViewById(view, i);
        if (intervalSelectorLayout != null) {
            i = C15314R.id.ipo_detail_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15314R.id.ipo_estimated_price_txt;
                AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                if (animatedRhTextView != null) {
                    i = C15314R.id.ipo_header_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C15314R.id.ipo_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C15314R.id.quote_graph_layout_card_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                return new IncludeIpoQuoteGraphLayoutBinding((IpoQuoteGraphLayout) view, intervalSelectorLayout, rhTextView, animatedRhTextView, rhTextView2, imageView, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
