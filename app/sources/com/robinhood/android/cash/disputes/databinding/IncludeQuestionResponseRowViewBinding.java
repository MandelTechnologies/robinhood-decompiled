package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.QuestionResponseRowView;

/* loaded from: classes7.dex */
public final class IncludeQuestionResponseRowViewBinding implements ViewBinding {
    private final QuestionResponseRowView rootView;

    private IncludeQuestionResponseRowViewBinding(QuestionResponseRowView questionResponseRowView) {
        this.rootView = questionResponseRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public QuestionResponseRowView getRoot() {
        return this.rootView;
    }

    public static IncludeQuestionResponseRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuestionResponseRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_question_response_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuestionResponseRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQuestionResponseRowViewBinding((QuestionResponseRowView) view);
    }
}
