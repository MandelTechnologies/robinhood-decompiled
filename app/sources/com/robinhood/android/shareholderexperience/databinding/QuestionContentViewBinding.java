package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class QuestionContentViewBinding implements ViewBinding {
    public final RhTextView questionAdditionalInfo;
    public final Space questionBottomSpace;
    public final RdsInfoTag questionInfoTag;
    public final RhTextView questionPrimaryText;
    public final RhTextView questionSecondaryText;
    public final RdsIconButton questionShareButton;
    public final RhTextView questionText;
    public final RdsIconButton questionVoteButton;
    private final ConstraintLayout rootView;

    private QuestionContentViewBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, Space space, RdsInfoTag rdsInfoTag, RhTextView rhTextView2, RhTextView rhTextView3, RdsIconButton rdsIconButton, RhTextView rhTextView4, RdsIconButton rdsIconButton2) {
        this.rootView = constraintLayout;
        this.questionAdditionalInfo = rhTextView;
        this.questionBottomSpace = space;
        this.questionInfoTag = rdsInfoTag;
        this.questionPrimaryText = rhTextView2;
        this.questionSecondaryText = rhTextView3;
        this.questionShareButton = rdsIconButton;
        this.questionText = rhTextView4;
        this.questionVoteButton = rdsIconButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static QuestionContentViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QuestionContentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.question_content_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static QuestionContentViewBinding bind(View view) {
        int i = C28477R.id.question_additional_info;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28477R.id.question_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C28477R.id.question_info_tag;
                RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                if (rdsInfoTag != null) {
                    i = C28477R.id.question_primary_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C28477R.id.question_secondary_text;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C28477R.id.question_share_button;
                            RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                            if (rdsIconButton != null) {
                                i = C28477R.id.question_text;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    i = C28477R.id.question_vote_button;
                                    RdsIconButton rdsIconButton2 = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsIconButton2 != null) {
                                        return new QuestionContentViewBinding((ConstraintLayout) view, rhTextView, space, rdsInfoTag, rhTextView2, rhTextView3, rdsIconButton, rhTextView4, rdsIconButton2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
