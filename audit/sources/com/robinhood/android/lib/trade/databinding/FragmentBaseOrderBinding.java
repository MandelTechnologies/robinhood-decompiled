package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.RhFloatingActionButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class FragmentBaseOrderBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final RdsNumpadView numpad;
    public final RhFloatingActionButton reviewOrderBtn;
    private final ConstraintLayout rootView;
    public final CoordinatorLayout snackbarShim;
    public final RhTextView swipeHint;

    private FragmentBaseOrderBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RdsNumpadView rdsNumpadView, RhFloatingActionButton rhFloatingActionButton, CoordinatorLayout coordinatorLayout, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.numpad = rdsNumpadView;
        this.reviewOrderBtn = rhFloatingActionButton;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBaseOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBaseOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.fragment_base_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBaseOrderBinding bind(View view) {
        int i = C20649R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C20649R.id.content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C20649R.id.numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C20649R.id.review_order_btn;
                    RhFloatingActionButton rhFloatingActionButton = (RhFloatingActionButton) ViewBindings.findChildViewById(view, i);
                    if (rhFloatingActionButton != null) {
                        i = C20649R.id.snackbar_shim;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null) {
                            i = C20649R.id.swipe_hint;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentBaseOrderBinding(constraintLayout, cardView, constraintLayout, constraintLayout2, rdsNumpadView, rhFloatingActionButton, coordinatorLayout, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
