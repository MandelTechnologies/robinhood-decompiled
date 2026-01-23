package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentAskQuestionBinding implements ViewBinding {
    public final ConstraintLayout askQuestionConstraintLayout;
    public final ImageView askQuestionGuidelineDrawable;
    public final RdsInfoBannerView askQuestionGuidelines;
    public final RhTextView askQuestionGuidelinesHeader;
    public final RhTextView askQuestionHeader;
    public final NestedScrollView askQuestionScrollView;
    public final RdsButton askQuestionSubmitButton;
    public final RhTextView askQuestionSubtitle;
    public final RdsTextInputEditText askQuestionTextInput;
    public final RdsTextInputContainerView askQuestionTextInputContainer;
    private final LinearLayout rootView;

    private FragmentAskQuestionBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView, RhTextView rhTextView2, NestedScrollView nestedScrollView, RdsButton rdsButton, RhTextView rhTextView3, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView) {
        this.rootView = linearLayout;
        this.askQuestionConstraintLayout = constraintLayout;
        this.askQuestionGuidelineDrawable = imageView;
        this.askQuestionGuidelines = rdsInfoBannerView;
        this.askQuestionGuidelinesHeader = rhTextView;
        this.askQuestionHeader = rhTextView2;
        this.askQuestionScrollView = nestedScrollView;
        this.askQuestionSubmitButton = rdsButton;
        this.askQuestionSubtitle = rhTextView3;
        this.askQuestionTextInput = rdsTextInputEditText;
        this.askQuestionTextInputContainer = rdsTextInputContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAskQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAskQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_ask_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAskQuestionBinding bind(View view) {
        int i = C28477R.id.ask_question_constraint_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C28477R.id.ask_question_guideline_drawable;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C28477R.id.ask_question_guidelines;
                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                if (rdsInfoBannerView != null) {
                    i = C28477R.id.ask_question_guidelines_header;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C28477R.id.ask_question_header;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C28477R.id.ask_question_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C28477R.id.ask_question_submit_button;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C28477R.id.ask_question_subtitle;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C28477R.id.ask_question_text_input;
                                        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                                        if (rdsTextInputEditText != null) {
                                            i = C28477R.id.ask_question_text_input_container;
                                            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                                            if (rdsTextInputContainerView != null) {
                                                return new FragmentAskQuestionBinding((LinearLayout) view, constraintLayout, imageView, rdsInfoBannerView, rhTextView, rhTextView2, nestedScrollView, rdsButton, rhTextView3, rdsTextInputEditText, rdsTextInputContainerView);
                                            }
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
