package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentQuestionListBinding implements ViewBinding {
    public final View questionListDivider;
    public final ConstraintLayout questionListFooter;
    public final RdsButton questionListFooterCta;
    public final RhTextView questionListFooterLabel;
    public final Guideline questionListFooterMidpoint;
    public final RhTextView questionListFooterText;
    public final RecyclerView questionListRecyclerView;
    private final ConstraintLayout rootView;

    private FragmentQuestionListBinding(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, RdsButton rdsButton, RhTextView rhTextView, Guideline guideline, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.questionListDivider = view;
        this.questionListFooter = constraintLayout2;
        this.questionListFooterCta = rdsButton;
        this.questionListFooterLabel = rhTextView;
        this.questionListFooterMidpoint = guideline;
        this.questionListFooterText = rhTextView2;
        this.questionListRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_question_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionListBinding bind(View view) {
        int i = C28477R.id.question_list_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C28477R.id.question_list_footer;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C28477R.id.question_list_footer_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C28477R.id.question_list_footer_label;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C28477R.id.question_list_footer_midpoint;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = C28477R.id.question_list_footer_text;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C28477R.id.question_list_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    return new FragmentQuestionListBinding((ConstraintLayout) view, viewFindChildViewById, constraintLayout, rdsButton, rhTextView, guideline, rhTextView2, recyclerView);
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
