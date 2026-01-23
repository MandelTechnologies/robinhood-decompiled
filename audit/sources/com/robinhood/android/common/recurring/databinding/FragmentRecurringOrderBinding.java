package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringOrderBinding implements ViewBinding {
    public final Space bottomSpace;
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final RdsNumpadView numpad;
    public final RhTextView paycheckRecurringOrderDisclaimer;
    public final RhTextView paycheckRecurringOrderDisclaimerTitle;
    public final RdsButton reviewBtn;
    public final Barrier reviewBtnBarrier;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentRecurringOrderBinding(ConstraintLayout constraintLayout, Space space, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RdsNumpadView rdsNumpadView, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, Barrier barrier, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.bottomSpace = space;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.numpad = rdsNumpadView;
        this.paycheckRecurringOrderDisclaimer = rhTextView;
        this.paycheckRecurringOrderDisclaimerTitle = rhTextView2;
        this.reviewBtn = rdsButton;
        this.reviewBtnBarrier = barrier;
        this.swipeHint = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringOrderBinding bind(View view) {
        int i = C11595R.id.bottom_space;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C11595R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C11595R.id.content;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C11595R.id.numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C11595R.id.paycheck_recurring_order_disclaimer;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C11595R.id.paycheck_recurring_order_disclaimer_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C11595R.id.review_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C11595R.id.review_btn_barrier;
                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                    if (barrier != null) {
                                        i = C11595R.id.swipe_hint;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new FragmentRecurringOrderBinding(constraintLayout, space, cardView, constraintLayout, constraintLayout2, rdsNumpadView, rhTextView, rhTextView2, rdsButton, barrier, rhTextView3);
                                        }
                                    }
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
