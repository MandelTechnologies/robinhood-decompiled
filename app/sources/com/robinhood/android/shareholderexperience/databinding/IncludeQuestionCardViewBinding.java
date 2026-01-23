package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.questionlist.QuestionCardView;

/* loaded from: classes5.dex */
public final class IncludeQuestionCardViewBinding implements ViewBinding {
    private final QuestionCardView rootView;

    private IncludeQuestionCardViewBinding(QuestionCardView questionCardView) {
        this.rootView = questionCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public QuestionCardView getRoot() {
        return this.rootView;
    }

    public static IncludeQuestionCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuestionCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.include_question_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuestionCardViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQuestionCardViewBinding((QuestionCardView) view);
    }
}
