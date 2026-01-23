package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class MergeStrategyDetailRowViewBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView strategyDescription;
    public final RhTextView strategyTitle;
    public final LottieAnimationView strategyVisualizationLottie;

    private MergeStrategyDetailRowViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView) {
        this.rootView = view;
        this.strategyDescription = rhTextView;
        this.strategyTitle = rhTextView2;
        this.strategyVisualizationLottie = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeStrategyDetailRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25121R.layout.merge_strategy_detail_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeStrategyDetailRowViewBinding bind(View view) {
        int i = C25121R.id.strategy_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25121R.id.strategy_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C25121R.id.strategy_visualization_lottie;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    return new MergeStrategyDetailRowViewBinding(view, rhTextView, rhTextView2, lottieAnimationView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
