package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class MergeAnswerCardViewBinding implements ViewBinding {
    public final RhTextView answerCardAnswerText;
    public final ImageView answerCardAnswererImage;
    public final View answerCardAnswererImageBorder;
    public final RhTextView answerCardAnswererName;
    public final RhTextView answerCardAnswererPosition;
    public final ConstraintLayout answerCardContainer;
    private final View rootView;

    private MergeAnswerCardViewBinding(View view, RhTextView rhTextView, ImageView imageView, View view2, RhTextView rhTextView2, RhTextView rhTextView3, ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.answerCardAnswerText = rhTextView;
        this.answerCardAnswererImage = imageView;
        this.answerCardAnswererImageBorder = view2;
        this.answerCardAnswererName = rhTextView2;
        this.answerCardAnswererPosition = rhTextView3;
        this.answerCardContainer = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAnswerCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28477R.layout.merge_answer_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAnswerCardViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C28477R.id.answer_card_answer_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28477R.id.answer_card_answerer_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28477R.id.answer_card_answerer_image_border))) != null) {
                i = C28477R.id.answer_card_answerer_name;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C28477R.id.answer_card_answerer_position;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C28477R.id.answer_card_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            return new MergeAnswerCardViewBinding(view, rhTextView, imageView, viewFindChildViewById, rhTextView2, rhTextView3, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
