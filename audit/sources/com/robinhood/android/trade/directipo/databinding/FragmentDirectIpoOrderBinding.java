package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentDirectIpoOrderBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final LinearLayout designSystemReviewContainer;
    public final RdsNumpadView numpad;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentDirectIpoOrderBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BlockableNestedScrollView blockableNestedScrollView, LinearLayout linearLayout, RdsNumpadView rdsNumpadView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.contentScrollview = blockableNestedScrollView;
        this.designSystemReviewContainer = linearLayout;
        this.numpad = rdsNumpadView;
        this.reviewBtn = rdsButton;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.fragment_direct_ipo_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoOrderBinding bind(View view) {
        int i = C29323R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C29323R.id.content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C29323R.id.content_scrollview;
                BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                if (blockableNestedScrollView != null) {
                    i = C29323R.id.design_system_review_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C29323R.id.numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C29323R.id.review_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C29323R.id.swipe_hint;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    return new FragmentDirectIpoOrderBinding(constraintLayout, cardView, constraintLayout, constraintLayout2, blockableNestedScrollView, linearLayout, rdsNumpadView, rdsButton, rhTextView);
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
