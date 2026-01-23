package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentOptionExerciseReasonBinding implements ViewBinding {
    public final RdsRowView exerciseReasonAssignmentRow;
    public final RdsRowView exerciseReasonExecutionRow;
    public final RdsRowView exerciseReasonLiquidityRow;
    public final RhTextView exerciseReasonTitle;
    private final LinearLayout rootView;

    private FragmentOptionExerciseReasonBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.exerciseReasonAssignmentRow = rdsRowView;
        this.exerciseReasonExecutionRow = rdsRowView2;
        this.exerciseReasonLiquidityRow = rdsRowView3;
        this.exerciseReasonTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionExerciseReasonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionExerciseReasonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_option_exercise_reason, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionExerciseReasonBinding bind(View view) {
        int i = C24704R.id.exercise_reason_assignment_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C24704R.id.exercise_reason_execution_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C24704R.id.exercise_reason_liquidity_row;
                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView3 != null) {
                    i = C24704R.id.exercise_reason_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentOptionExerciseReasonBinding((LinearLayout) view, rdsRowView, rdsRowView2, rdsRowView3, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
