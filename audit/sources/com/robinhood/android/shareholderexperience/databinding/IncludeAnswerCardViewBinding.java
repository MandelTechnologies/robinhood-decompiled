package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.answer.AnswerCardView;

/* loaded from: classes5.dex */
public final class IncludeAnswerCardViewBinding implements ViewBinding {
    private final AnswerCardView rootView;

    private IncludeAnswerCardViewBinding(AnswerCardView answerCardView) {
        this.rootView = answerCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AnswerCardView getRoot() {
        return this.rootView;
    }

    public static IncludeAnswerCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAnswerCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.include_answer_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAnswerCardViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAnswerCardViewBinding((AnswerCardView) view);
    }
}
