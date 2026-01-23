package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentQuestionSubmittedBinding implements ViewBinding {
    public final RdsButton questionSubmitDoneButton;
    public final LottieAnimationView questionSubmitDrawable;
    public final RhTextView questionSubmitHeader;
    public final RdsButton questionSubmitShareButton;
    public final RhTextView questionSubmitSubtitle;
    private final ConstraintLayout rootView;

    private FragmentQuestionSubmittedBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.questionSubmitDoneButton = rdsButton;
        this.questionSubmitDrawable = lottieAnimationView;
        this.questionSubmitHeader = rhTextView;
        this.questionSubmitShareButton = rdsButton2;
        this.questionSubmitSubtitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionSubmittedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionSubmittedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_question_submitted, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionSubmittedBinding bind(View view) {
        int i = C28477R.id.question_submit_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28477R.id.question_submit_drawable;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C28477R.id.question_submit_header;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28477R.id.question_submit_share_button;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C28477R.id.question_submit_subtitle;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentQuestionSubmittedBinding((ConstraintLayout) view, rdsButton, lottieAnimationView, rhTextView, rdsButton2, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
