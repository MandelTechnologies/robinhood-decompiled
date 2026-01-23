package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class MergeRecommendationsNbboRowBinding implements ViewBinding {
    public final RhTextView amountTxt;
    public final RhTextView lastPriceTxt;
    public final RhTextView nbboTxt;
    public final RhTextView percentTxt;
    private final ConstraintLayout rootView;
    public final RhTextView tickerDescriptionTxt;
    public final RhTextView tickerTxt;

    private MergeRecommendationsNbboRowBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.amountTxt = rhTextView;
        this.lastPriceTxt = rhTextView2;
        this.nbboTxt = rhTextView3;
        this.percentTxt = rhTextView4;
        this.tickerDescriptionTxt = rhTextView5;
        this.tickerTxt = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeRecommendationsNbboRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeRecommendationsNbboRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.merge_recommendations_nbbo_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeRecommendationsNbboRowBinding bind(View view) {
        int i = C29895R.id.amount_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C29895R.id.last_price_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C29895R.id.nbbo_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C29895R.id.percent_txt;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        i = C29895R.id.ticker_description_txt;
                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView5 != null) {
                            i = C29895R.id.ticker_txt;
                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView6 != null) {
                                return new MergeRecommendationsNbboRowBinding((ConstraintLayout) view, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
