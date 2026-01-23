package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class FragmentRecommendationsOrderBinding implements ViewBinding {
    public final FrameLayout cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final FrameLayout designSystemReviewContainer;
    public final RdsNumpadView numpad;
    public final LinearLayout quickTradeAmountsContainer;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentRecommendationsOrderBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FrameLayout frameLayout2, RdsNumpadView rdsNumpadView, LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = frameLayout;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.designSystemReviewContainer = frameLayout2;
        this.numpad = rdsNumpadView;
        this.quickTradeAmountsContainer = linearLayout;
        this.reviewBtn = rdsButton;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.fragment_recommendations_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsOrderBinding bind(View view) {
        int i = C29895R.id.cardview;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C29895R.id.content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C29895R.id.design_system_review_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C29895R.id.numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C29895R.id.quick_trade_amounts_container;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C29895R.id.review_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C29895R.id.swipe_hint;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    return new FragmentRecommendationsOrderBinding(constraintLayout, frameLayout, constraintLayout, constraintLayout2, frameLayout2, rdsNumpadView, linearLayout, rdsButton, rhTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
