package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class FragmentRecommendationsOrderBreakdownReviewBinding implements ViewBinding {
    public final FrameLayout cardview;
    public final ConstraintLayout constraintLayout;
    public final LinearLayout designSystemReviewContainer;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentRecommendationsOrderBreakdownReviewBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, RdsNumpadView rdsNumpadView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = frameLayout;
        this.constraintLayout = constraintLayout2;
        this.designSystemReviewContainer = linearLayout;
        this.numpad = rdsNumpadView;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsOrderBreakdownReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsOrderBreakdownReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.fragment_recommendations_order_breakdown_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsOrderBreakdownReviewBinding bind(View view) {
        int i = C29895R.id.cardview;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C29895R.id.design_system_review_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C29895R.id.numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C29895R.id.swipe_hint;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentRecommendationsOrderBreakdownReviewBinding(constraintLayout, frameLayout, constraintLayout, linearLayout, rdsNumpadView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
