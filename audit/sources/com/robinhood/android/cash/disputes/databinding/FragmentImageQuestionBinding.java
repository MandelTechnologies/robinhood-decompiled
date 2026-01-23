package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentImageQuestionBinding implements ViewBinding {
    public final ConstraintLayout imageQuestionContainer;
    public final RdsButton imageQuestionContinueButton;
    public final RecyclerView imageQuestionRecyclerView;
    public final RhTextView imageQuestionSubtitle;
    public final RdsTextInputEditText imageQuestionTextInput;
    public final RdsTextInputContainerView imageQuestionTextInputContainer;
    public final RhTextView imageQuestionTitle;
    public final RdsButton imageQuestionUploadButton;
    private final FocusSafeNestedScrollView rootView;

    private FragmentImageQuestionBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, ConstraintLayout constraintLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView2, RdsButton rdsButton2) {
        this.rootView = focusSafeNestedScrollView;
        this.imageQuestionContainer = constraintLayout;
        this.imageQuestionContinueButton = rdsButton;
        this.imageQuestionRecyclerView = recyclerView;
        this.imageQuestionSubtitle = rhTextView;
        this.imageQuestionTextInput = rdsTextInputEditText;
        this.imageQuestionTextInputContainer = rdsTextInputContainerView;
        this.imageQuestionTitle = rhTextView2;
        this.imageQuestionUploadButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentImageQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentImageQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_image_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentImageQuestionBinding bind(View view) {
        int i = C10007R.id.image_question_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C10007R.id.image_question_continue_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10007R.id.image_question_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C10007R.id.image_question_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10007R.id.image_question_text_input;
                        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputEditText != null) {
                            i = C10007R.id.image_question_text_input_container;
                            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputContainerView != null) {
                                i = C10007R.id.image_question_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C10007R.id.image_question_upload_button;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        return new FragmentImageQuestionBinding((FocusSafeNestedScrollView) view, constraintLayout, rdsButton, recyclerView, rhTextView, rdsTextInputEditText, rdsTextInputContainerView, rhTextView2, rdsButton2);
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
