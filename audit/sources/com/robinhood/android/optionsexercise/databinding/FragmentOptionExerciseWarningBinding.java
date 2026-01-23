package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentOptionExerciseWarningBinding implements ViewBinding {
    public final RhTextView exerciseWarningDescription;
    public final RhTextView exerciseWarningLastUpdated;
    public final RhTextView exerciseWarningTitle;
    public final FrameLayout exerciseWarningVisualizationContainer;
    private final LinearLayout rootView;

    private FragmentOptionExerciseWarningBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.exerciseWarningDescription = rhTextView;
        this.exerciseWarningLastUpdated = rhTextView2;
        this.exerciseWarningTitle = rhTextView3;
        this.exerciseWarningVisualizationContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionExerciseWarningBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionExerciseWarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_option_exercise_warning, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionExerciseWarningBinding bind(View view) {
        int i = C24704R.id.exercise_warning_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24704R.id.exercise_warning_last_updated;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C24704R.id.exercise_warning_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C24704R.id.exercise_warning_visualization_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        return new FragmentOptionExerciseWarningBinding((LinearLayout) view, rhTextView, rhTextView2, rhTextView3, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
