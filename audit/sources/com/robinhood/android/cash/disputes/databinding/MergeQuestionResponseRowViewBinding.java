package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeQuestionResponseRowViewBinding implements ViewBinding {
    public final View questionResponseRowBottomDivider;
    public final RhTextView questionResponseRowFileCount;
    public final ImageView questionResponseRowFileImage;
    public final RhTextView questionResponseRowPrimaryText;
    public final RhTextView questionResponseRowSecondaryText;
    private final View rootView;

    private MergeQuestionResponseRowViewBinding(View view, View view2, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.questionResponseRowBottomDivider = view2;
        this.questionResponseRowFileCount = rhTextView;
        this.questionResponseRowFileImage = imageView;
        this.questionResponseRowPrimaryText = rhTextView2;
        this.questionResponseRowSecondaryText = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeQuestionResponseRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10007R.layout.merge_question_response_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeQuestionResponseRowViewBinding bind(View view) {
        int i = C10007R.id.question_response_row_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C10007R.id.question_response_row_file_count;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10007R.id.question_response_row_file_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C10007R.id.question_response_row_primary_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C10007R.id.question_response_row_secondary_text;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new MergeQuestionResponseRowViewBinding(view, viewFindChildViewById, rhTextView, imageView, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
