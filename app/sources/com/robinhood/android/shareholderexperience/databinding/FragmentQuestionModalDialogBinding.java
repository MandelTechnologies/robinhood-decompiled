package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentQuestionModalDialogBinding implements ViewBinding {
    public final RdsButton questionModalCloseButton;
    public final QuestionContentViewBinding questionModalContent;
    public final RdsButton questionModalDeleteButton;
    public final RdsButton questionModalShareButton;
    private final FrameLayout rootView;

    private FragmentQuestionModalDialogBinding(FrameLayout frameLayout, RdsButton rdsButton, QuestionContentViewBinding questionContentViewBinding, RdsButton rdsButton2, RdsButton rdsButton3) {
        this.rootView = frameLayout;
        this.questionModalCloseButton = rdsButton;
        this.questionModalContent = questionContentViewBinding;
        this.questionModalDeleteButton = rdsButton2;
        this.questionModalShareButton = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionModalDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionModalDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_question_modal_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionModalDialogBinding bind(View view) {
        View viewFindChildViewById;
        int i = C28477R.id.question_modal_close_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28477R.id.question_modal_content))) != null) {
            QuestionContentViewBinding questionContentViewBindingBind = QuestionContentViewBinding.bind(viewFindChildViewById);
            i = C28477R.id.question_modal_delete_button;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C28477R.id.question_modal_share_button;
                RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton3 != null) {
                    return new FragmentQuestionModalDialogBinding((FrameLayout) view, rdsButton, questionContentViewBindingBind, rdsButton2, rdsButton3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
