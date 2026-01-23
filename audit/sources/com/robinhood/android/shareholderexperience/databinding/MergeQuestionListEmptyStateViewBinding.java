package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class MergeQuestionListEmptyStateViewBinding implements ViewBinding {
    public final RdsTextButton questionListEmptyStateCta;
    public final RhTextView questionListEmptyStatePrimaryText;
    public final RhTextView questionListEmptyStateSecondaryText;
    private final View rootView;

    private MergeQuestionListEmptyStateViewBinding(View view, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.questionListEmptyStateCta = rdsTextButton;
        this.questionListEmptyStatePrimaryText = rhTextView;
        this.questionListEmptyStateSecondaryText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeQuestionListEmptyStateViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28477R.layout.merge_question_list_empty_state_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeQuestionListEmptyStateViewBinding bind(View view) {
        int i = C28477R.id.question_list_empty_state_cta;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C28477R.id.question_list_empty_state_primary_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C28477R.id.question_list_empty_state_secondary_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeQuestionListEmptyStateViewBinding(view, rdsTextButton, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
