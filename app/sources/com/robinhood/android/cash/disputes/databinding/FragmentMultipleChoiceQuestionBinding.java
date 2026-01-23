package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentMultipleChoiceQuestionBinding implements ViewBinding {
    public final RecyclerView multipleChoiceQuestionRecyclerView;
    public final RhTextView multipleChoiceQuestionSubtitle;
    public final RhTextView multipleChoiceQuestionTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentMultipleChoiceQuestionBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.multipleChoiceQuestionRecyclerView = recyclerView;
        this.multipleChoiceQuestionSubtitle = rhTextView;
        this.multipleChoiceQuestionTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMultipleChoiceQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMultipleChoiceQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_multiple_choice_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMultipleChoiceQuestionBinding bind(View view) {
        int i = C10007R.id.multiple_choice_question_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C10007R.id.multiple_choice_question_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10007R.id.multiple_choice_question_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentMultipleChoiceQuestionBinding((FocusSafeNestedScrollView) view, recyclerView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
