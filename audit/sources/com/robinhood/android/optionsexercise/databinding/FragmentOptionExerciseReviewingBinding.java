package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentOptionExerciseReviewingBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final FrameLayout designSystemReviewContainer;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;
    public final RhTextView swipeHint;

    private FragmentOptionExerciseReviewingBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, FrameLayout frameLayout, RdsNumpadView rdsNumpadView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.designSystemReviewContainer = frameLayout;
        this.numpad = rdsNumpadView;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionExerciseReviewingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionExerciseReviewingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_option_exercise_reviewing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionExerciseReviewingBinding bind(View view) {
        int i = C24704R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C24704R.id.design_system_review_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C24704R.id.numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C24704R.id.swipe_hint;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentOptionExerciseReviewingBinding(constraintLayout, cardView, constraintLayout, frameLayout, rdsNumpadView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
