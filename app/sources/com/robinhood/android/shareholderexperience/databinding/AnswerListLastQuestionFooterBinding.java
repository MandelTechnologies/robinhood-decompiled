package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class AnswerListLastQuestionFooterBinding implements ViewBinding {
    public final RdsButton answerListFooterDoneButton;
    public final RhTextView answerListFooterMessage;
    private final LinearLayout rootView;

    private AnswerListLastQuestionFooterBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.answerListFooterDoneButton = rdsButton;
        this.answerListFooterMessage = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AnswerListLastQuestionFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AnswerListLastQuestionFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.answer_list_last_question_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AnswerListLastQuestionFooterBinding bind(View view) {
        int i = C28477R.id.answer_list_footer_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28477R.id.answer_list_footer_message;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new AnswerListLastQuestionFooterBinding((LinearLayout) view, rdsButton, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
