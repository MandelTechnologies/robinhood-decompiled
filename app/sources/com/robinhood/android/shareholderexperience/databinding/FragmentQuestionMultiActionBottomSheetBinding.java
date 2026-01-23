package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentQuestionMultiActionBottomSheetBinding implements ViewBinding {
    public final RdsRowView questionMultiActionDeleteRow;
    public final RdsButton questionMultiActionDoneButton;
    public final RdsRowView questionMultiActionShareRow;
    private final LinearLayout rootView;

    private FragmentQuestionMultiActionBottomSheetBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsButton rdsButton, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.questionMultiActionDeleteRow = rdsRowView;
        this.questionMultiActionDoneButton = rdsButton;
        this.questionMultiActionShareRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionMultiActionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionMultiActionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_question_multi_action_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionMultiActionBottomSheetBinding bind(View view) {
        int i = C28477R.id.question_multi_action_delete_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C28477R.id.question_multi_action_done_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C28477R.id.question_multi_action_share_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    return new FragmentQuestionMultiActionBottomSheetBinding((LinearLayout) view, rdsRowView, rdsButton, rdsRowView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
