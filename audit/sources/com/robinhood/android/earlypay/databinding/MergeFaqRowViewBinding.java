package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.earlypay.C14433R;

/* loaded from: classes7.dex */
public final class MergeFaqRowViewBinding implements ViewBinding {
    public final RhTextView answerTxt;
    public final ImageView expandAnswerBtn;
    public final RhTextView questionTxt;
    private final View rootView;

    private MergeFaqRowViewBinding(View view, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = view;
        this.answerTxt = rhTextView;
        this.expandAnswerBtn = imageView;
        this.questionTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeFaqRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14433R.layout.merge_faq_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeFaqRowViewBinding bind(View view) {
        int i = C14433R.id.answer_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14433R.id.expand_answer_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C14433R.id.question_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeFaqRowViewBinding(view, rhTextView, imageView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
