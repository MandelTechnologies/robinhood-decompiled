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
public final class FragmentQuestionConfirmDeleteDialogBinding implements ViewBinding {
    public final RdsButton questionCancelDeleteButton;
    public final RdsButton questionConfirmDeleteButton;
    private final FrameLayout rootView;

    private FragmentQuestionConfirmDeleteDialogBinding(FrameLayout frameLayout, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = frameLayout;
        this.questionCancelDeleteButton = rdsButton;
        this.questionConfirmDeleteButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionConfirmDeleteDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionConfirmDeleteDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_question_confirm_delete_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionConfirmDeleteDialogBinding bind(View view) {
        int i = C28477R.id.question_cancel_delete_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28477R.id.question_confirm_delete_button;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                return new FragmentQuestionConfirmDeleteDialogBinding((FrameLayout) view, rdsButton, rdsButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
