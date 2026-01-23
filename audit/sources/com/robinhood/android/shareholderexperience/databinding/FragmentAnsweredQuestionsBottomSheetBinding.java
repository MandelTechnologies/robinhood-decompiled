package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentAnsweredQuestionsBottomSheetBinding implements ViewBinding {
    public final View answerSheetBottomShadow;
    public final ImageButton answerSheetCloseButton;
    public final ImageView answerSheetCompanyLogo;
    public final View answerSheetCompanyLogoBorder;
    public final RdsPogView answerSheetCompanyPog;
    public final ConstraintLayout answerSheetHeader;
    public final RecyclerView answerSheetRecyclerView;
    public final ImageButton answerSheetShareButton;
    public final RhTextView answerSheetTitle;
    public final View answerSheetTopShadow;
    private final ConstraintLayout rootView;

    private FragmentAnsweredQuestionsBottomSheetBinding(ConstraintLayout constraintLayout, View view, ImageButton imageButton, ImageView imageView, View view2, RdsPogView rdsPogView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ImageButton imageButton2, RhTextView rhTextView, View view3) {
        this.rootView = constraintLayout;
        this.answerSheetBottomShadow = view;
        this.answerSheetCloseButton = imageButton;
        this.answerSheetCompanyLogo = imageView;
        this.answerSheetCompanyLogoBorder = view2;
        this.answerSheetCompanyPog = rdsPogView;
        this.answerSheetHeader = constraintLayout2;
        this.answerSheetRecyclerView = recyclerView;
        this.answerSheetShareButton = imageButton2;
        this.answerSheetTitle = rhTextView;
        this.answerSheetTopShadow = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAnsweredQuestionsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAnsweredQuestionsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_answered_questions_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAnsweredQuestionsBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C28477R.id.answer_sheet_bottom_shadow;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C28477R.id.answer_sheet_close_button;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = C28477R.id.answer_sheet_company_logo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28477R.id.answer_sheet_company_logo_border))) != null) {
                    i = C28477R.id.answer_sheet_company_pog;
                    RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                    if (rdsPogView != null) {
                        i = C28477R.id.answer_sheet_header;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C28477R.id.answer_sheet_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C28477R.id.answer_sheet_share_button;
                                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                if (imageButton2 != null) {
                                    i = C28477R.id.answer_sheet_title;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C28477R.id.answer_sheet_top_shadow))) != null) {
                                        return new FragmentAnsweredQuestionsBottomSheetBinding((ConstraintLayout) view, viewFindChildViewById3, imageButton, imageView, viewFindChildViewById, rdsPogView, constraintLayout, recyclerView, imageButton2, rhTextView, viewFindChildViewById2);
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
