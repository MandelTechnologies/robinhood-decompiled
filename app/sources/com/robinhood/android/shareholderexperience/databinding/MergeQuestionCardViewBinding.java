package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class MergeQuestionCardViewBinding implements ViewBinding {
    public final MaterialCardView questionCard;
    public final ConstraintLayout questionCardAnswerContainer;
    public final View questionCardAnswerDivider;
    public final RhTextView questionCardAnswerText;
    public final Group questionCardAnsweredImageViews;
    public final Group questionCardAnsweredTextViews;
    public final ImageView questionCardAnswererImage;
    public final View questionCardAnswererImageBorder;
    public final RhTextView questionCardAnswererName;
    public final RhTextView questionCardAnswererPosition;
    public final RhTextView questionCardUnansweredText;
    public final QuestionContentViewBinding questionContent;
    private final View rootView;

    private MergeQuestionCardViewBinding(View view, MaterialCardView materialCardView, ConstraintLayout constraintLayout, View view2, RhTextView rhTextView, Group group, Group group2, ImageView imageView, View view3, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, QuestionContentViewBinding questionContentViewBinding) {
        this.rootView = view;
        this.questionCard = materialCardView;
        this.questionCardAnswerContainer = constraintLayout;
        this.questionCardAnswerDivider = view2;
        this.questionCardAnswerText = rhTextView;
        this.questionCardAnsweredImageViews = group;
        this.questionCardAnsweredTextViews = group2;
        this.questionCardAnswererImage = imageView;
        this.questionCardAnswererImageBorder = view3;
        this.questionCardAnswererName = rhTextView2;
        this.questionCardAnswererPosition = rhTextView3;
        this.questionCardUnansweredText = rhTextView4;
        this.questionContent = questionContentViewBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeQuestionCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28477R.layout.merge_question_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeQuestionCardViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C28477R.id.question_card;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
        if (materialCardView != null) {
            i = C28477R.id.question_card_answer_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28477R.id.question_card_answer_divider))) != null) {
                i = C28477R.id.question_card_answer_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28477R.id.question_card_answered_image_views;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C28477R.id.question_card_answered_text_views;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C28477R.id.question_card_answerer_image;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C28477R.id.question_card_answerer_image_border))) != null) {
                                i = C28477R.id.question_card_answerer_name;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C28477R.id.question_card_answerer_position;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C28477R.id.question_card_unanswered_text;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C28477R.id.question_content))) != null) {
                                            return new MergeQuestionCardViewBinding(view, materialCardView, constraintLayout, viewFindChildViewById, rhTextView, group, group2, imageView, viewFindChildViewById2, rhTextView2, rhTextView3, rhTextView4, QuestionContentViewBinding.bind(viewFindChildViewById3));
                                        }
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
