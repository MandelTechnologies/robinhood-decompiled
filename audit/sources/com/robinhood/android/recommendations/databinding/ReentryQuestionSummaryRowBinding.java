package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class ReentryQuestionSummaryRowBinding implements ViewBinding {
    public final ImageView imageView;
    public final RdsInlineDefinitionTextView labelTxt;
    private final ConstraintLayout rootView;
    public final View separator;
    public final RhTextView valueTxt;

    private ReentryQuestionSummaryRowBinding(ConstraintLayout constraintLayout, ImageView imageView, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, View view, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.imageView = imageView;
        this.labelTxt = rdsInlineDefinitionTextView;
        this.separator = view;
        this.valueTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ReentryQuestionSummaryRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReentryQuestionSummaryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.reentry_question_summary_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ReentryQuestionSummaryRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C25978R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25978R.id.label_txt;
            RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
            if (rdsInlineDefinitionTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25978R.id.separator))) != null) {
                i = C25978R.id.value_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new ReentryQuestionSummaryRowBinding((ConstraintLayout) view, imageView, rdsInlineDefinitionTextView, viewFindChildViewById, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
