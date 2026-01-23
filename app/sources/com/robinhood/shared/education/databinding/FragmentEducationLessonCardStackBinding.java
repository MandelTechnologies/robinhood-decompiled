package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.cardstack.CardStackRecyclerView;

/* loaded from: classes6.dex */
public final class FragmentEducationLessonCardStackBinding implements ViewBinding {
    public final ImageView cardStackBackgroundImg;
    public final CardStackRecyclerView cardStackRecyclerView;
    public final RhTextView completionMessage;
    public final RhTextView completionTitle;
    public final ConstraintLayout educationLessonCardStackCompletionSection;
    public final ConstraintLayout educationLessonCardStackContent;
    public final ComposeView educationLessonCardStackRewardSection;
    public final ErrorView errorView;
    public final RdsIconButton footerNextButton;
    public final ShimmerLoadingView loadingView;
    public final RdsButton primaryCtaButton;
    private final FrameLayout rootView;
    public final RdsButton secondaryCtaButton;

    private FragmentEducationLessonCardStackBinding(FrameLayout frameLayout, ImageView imageView, CardStackRecyclerView cardStackRecyclerView, RhTextView rhTextView, RhTextView rhTextView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ComposeView composeView, ErrorView errorView, RdsIconButton rdsIconButton, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = frameLayout;
        this.cardStackBackgroundImg = imageView;
        this.cardStackRecyclerView = cardStackRecyclerView;
        this.completionMessage = rhTextView;
        this.completionTitle = rhTextView2;
        this.educationLessonCardStackCompletionSection = constraintLayout;
        this.educationLessonCardStackContent = constraintLayout2;
        this.educationLessonCardStackRewardSection = composeView;
        this.errorView = errorView;
        this.footerNextButton = rdsIconButton;
        this.loadingView = shimmerLoadingView;
        this.primaryCtaButton = rdsButton;
        this.secondaryCtaButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEducationLessonCardStackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEducationLessonCardStackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.fragment_education_lesson_card_stack, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEducationLessonCardStackBinding bind(View view) {
        int i = C38790R.id.card_stack_background_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C38790R.id.card_stack_recycler_view;
            CardStackRecyclerView cardStackRecyclerView = (CardStackRecyclerView) ViewBindings.findChildViewById(view, i);
            if (cardStackRecyclerView != null) {
                i = C38790R.id.completion_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C38790R.id.completion_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C38790R.id.education_lesson_card_stack_completion_section;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C38790R.id.education_lesson_card_stack_content;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C38790R.id.education_lesson_card_stack_reward_section;
                                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView != null) {
                                    i = C38790R.id.error_view;
                                    ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
                                    if (errorView != null) {
                                        i = C38790R.id.footer_next_button;
                                        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsIconButton != null) {
                                            i = C38790R.id.loading_view;
                                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                            if (shimmerLoadingView != null) {
                                                i = C38790R.id.primary_cta_button;
                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton != null) {
                                                    i = C38790R.id.secondary_cta_button;
                                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsButton2 != null) {
                                                        return new FragmentEducationLessonCardStackBinding((FrameLayout) view, imageView, cardStackRecyclerView, rhTextView, rhTextView2, constraintLayout, constraintLayout2, composeView, errorView, rdsIconButton, shimmerLoadingView, rdsButton, rdsButton2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
