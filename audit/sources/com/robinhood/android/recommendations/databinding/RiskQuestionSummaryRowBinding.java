package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class RiskQuestionSummaryRowBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsInlineDefinitionTextView summaryNameText;
    public final RhTextView summaryValueText;

    private RiskQuestionSummaryRowBinding(ConstraintLayout constraintLayout, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.summaryNameText = rdsInlineDefinitionTextView;
        this.summaryValueText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RiskQuestionSummaryRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RiskQuestionSummaryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.risk_question_summary_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RiskQuestionSummaryRowBinding bind(View view) {
        int i = C25978R.id.summary_name_text;
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
        if (rdsInlineDefinitionTextView != null) {
            i = C25978R.id.summary_value_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new RiskQuestionSummaryRowBinding((ConstraintLayout) view, rdsInlineDefinitionTextView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
