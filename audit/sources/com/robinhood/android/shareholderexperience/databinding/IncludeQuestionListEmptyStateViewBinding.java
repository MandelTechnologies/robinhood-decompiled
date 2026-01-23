package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView;

/* loaded from: classes5.dex */
public final class IncludeQuestionListEmptyStateViewBinding implements ViewBinding {
    private final QuestionListEmptyStateView rootView;

    private IncludeQuestionListEmptyStateViewBinding(QuestionListEmptyStateView questionListEmptyStateView) {
        this.rootView = questionListEmptyStateView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public QuestionListEmptyStateView getRoot() {
        return this.rootView;
    }

    public static IncludeQuestionListEmptyStateViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuestionListEmptyStateViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.include_question_list_empty_state_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuestionListEmptyStateViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQuestionListEmptyStateViewBinding((QuestionListEmptyStateView) view);
    }
}
