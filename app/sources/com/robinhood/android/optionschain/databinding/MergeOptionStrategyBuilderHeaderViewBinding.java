package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionStrategyBuilderHeaderViewBinding implements ViewBinding {
    public final RhTextView currentPriceTxt;
    public final LinearLayout optionsStrategyBuilderSentimentLayout;
    public final RdsInfoBannerView optionsStrategyBuilderTooltip;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private MergeOptionStrategyBuilderHeaderViewBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, LinearLayout linearLayout, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.currentPriceTxt = rhTextView;
        this.optionsStrategyBuilderSentimentLayout = linearLayout;
        this.optionsStrategyBuilderTooltip = rdsInfoBannerView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyBuilderHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeOptionStrategyBuilderHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.merge_option_strategy_builder_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeOptionStrategyBuilderHeaderViewBinding bind(View view) {
        int i = C24135R.id.current_price_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24135R.id.options_strategy_builder_sentiment_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C24135R.id.options_strategy_builder_tooltip;
                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                if (rdsInfoBannerView != null) {
                    i = C24135R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeOptionStrategyBuilderHeaderViewBinding((ConstraintLayout) view, rhTextView, linearLayout, rdsInfoBannerView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
