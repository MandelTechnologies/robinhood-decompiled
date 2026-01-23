package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class AnswerListNextQuestionFooterBinding implements ViewBinding {
    public final ImageButton nextQuestionButton;
    private final FrameLayout rootView;

    private AnswerListNextQuestionFooterBinding(FrameLayout frameLayout, ImageButton imageButton) {
        this.rootView = frameLayout;
        this.nextQuestionButton = imageButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static AnswerListNextQuestionFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AnswerListNextQuestionFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.answer_list_next_question_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AnswerListNextQuestionFooterBinding bind(View view) {
        int i = C28477R.id.next_question_button;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            return new AnswerListNextQuestionFooterBinding((FrameLayout) view, imageButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
