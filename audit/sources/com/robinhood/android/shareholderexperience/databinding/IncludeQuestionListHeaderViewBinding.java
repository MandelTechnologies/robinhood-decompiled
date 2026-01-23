package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView;

/* loaded from: classes5.dex */
public final class IncludeQuestionListHeaderViewBinding implements ViewBinding {
    private final QuestionListHeaderView rootView;

    private IncludeQuestionListHeaderViewBinding(QuestionListHeaderView questionListHeaderView) {
        this.rootView = questionListHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public QuestionListHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeQuestionListHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuestionListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.include_question_list_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuestionListHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQuestionListHeaderViewBinding((QuestionListHeaderView) view);
    }
}
