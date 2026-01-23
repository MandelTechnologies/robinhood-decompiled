package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationQuizViewBinding implements ViewBinding {
    public final LinearLayout quizAnswerFeedbackCard;
    public final RhTextView quizAnswerFeedbackTxt;
    public final RecyclerView quizAnswersRecyclerView;
    public final RdsInlineDefinitionTextView quizContentTxt;
    public final RhTextView quizHeaderTxt;
    public final RhTextView quizTitleTxt;
    private final View rootView;

    private MergeEducationQuizViewBinding(View view, LinearLayout linearLayout, RhTextView rhTextView, RecyclerView recyclerView, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.quizAnswerFeedbackCard = linearLayout;
        this.quizAnswerFeedbackTxt = rhTextView;
        this.quizAnswersRecyclerView = recyclerView;
        this.quizContentTxt = rdsInlineDefinitionTextView;
        this.quizHeaderTxt = rhTextView2;
        this.quizTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationQuizViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_quiz_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationQuizViewBinding bind(View view) {
        int i = C38790R.id.quiz_answer_feedback_card;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C38790R.id.quiz_answer_feedback_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C38790R.id.quiz_answers_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C38790R.id.quiz_content_txt;
                    RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
                    if (rdsInlineDefinitionTextView != null) {
                        i = C38790R.id.quiz_header_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C38790R.id.quiz_title_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new MergeEducationQuizViewBinding(view, linearLayout, rhTextView, recyclerView, rdsInlineDefinitionTextView, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
