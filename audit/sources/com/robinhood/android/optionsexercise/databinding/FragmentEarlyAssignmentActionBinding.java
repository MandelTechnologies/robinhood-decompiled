package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentEarlyAssignmentActionBinding implements ViewBinding {
    public final RhTextView earlyAssignmentActionContactSupport;
    public final RhTextView earlyAssignmentActionExerciseDescription;
    public final RdsRowView earlyAssignmentActionExerciseRow;
    public final RdsButton earlyAssignmentActionSeeComparisonBtn;
    public final RdsRowView earlyAssignmentActionTradeUnderlyingRow;
    private final LinearLayout rootView;

    private FragmentEarlyAssignmentActionBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsRowView rdsRowView, RdsButton rdsButton, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.earlyAssignmentActionContactSupport = rhTextView;
        this.earlyAssignmentActionExerciseDescription = rhTextView2;
        this.earlyAssignmentActionExerciseRow = rdsRowView;
        this.earlyAssignmentActionSeeComparisonBtn = rdsButton;
        this.earlyAssignmentActionTradeUnderlyingRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEarlyAssignmentActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEarlyAssignmentActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_early_assignment_action, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEarlyAssignmentActionBinding bind(View view) {
        int i = C24704R.id.early_assignment_action_contact_support;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24704R.id.early_assignment_action_exercise_description;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C24704R.id.early_assignment_action_exercise_row;
                RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView != null) {
                    i = C24704R.id.early_assignment_action_see_comparison_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C24704R.id.early_assignment_action_trade_underlying_row;
                        RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView2 != null) {
                            return new FragmentEarlyAssignmentActionBinding((LinearLayout) view, rhTextView, rhTextView2, rdsRowView, rdsButton, rdsRowView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
