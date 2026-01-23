package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class IncludeSpreadComparisonPageBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTextView spreadComparisonPageDescription;
    public final LottieAnimationView spreadComparisonPageLottie;

    private IncludeSpreadComparisonPageBinding(LinearLayout linearLayout, RhTextView rhTextView, LottieAnimationView lottieAnimationView) {
        this.rootView = linearLayout;
        this.spreadComparisonPageDescription = rhTextView;
        this.spreadComparisonPageLottie = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSpreadComparisonPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSpreadComparisonPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.include_spread_comparison_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSpreadComparisonPageBinding bind(View view) {
        int i = C25121R.id.spread_comparison_page_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25121R.id.spread_comparison_page_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                return new IncludeSpreadComparisonPageBinding((LinearLayout) view, rhTextView, lottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
