package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringOrderReviewingBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final RdsNumpadView numpad;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentRecurringOrderReviewingBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, RdsNumpadView rdsNumpadView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.numpad = rdsNumpadView;
        this.reviewBtn = rdsButton;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringOrderReviewingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringOrderReviewingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_order_reviewing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringOrderReviewingBinding bind(View view) {
        int i = C11595R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C11595R.id.numpad;
            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadView != null) {
                i = C11595R.id.review_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C11595R.id.swipe_hint;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentRecurringOrderReviewingBinding(constraintLayout, cardView, constraintLayout, rdsNumpadView, rdsButton, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
