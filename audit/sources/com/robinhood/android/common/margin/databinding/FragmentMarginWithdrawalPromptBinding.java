package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentMarginWithdrawalPromptBinding implements ViewBinding {
    public final ConstraintLayout content;
    public final RhTextView descriptionTxt;
    public final RhTextView disclosureTxt;
    public final ImageView illustrationImg;
    public final RdsButton leaveOffBtn;
    public final ShimmerLoadingView loadingView;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final RhTextView titleTxt;
    public final SparkleButton turnOnBtn;

    private FragmentMarginWithdrawalPromptBinding(ScrollView scrollView, ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, RdsButton rdsButton, ShimmerLoadingView shimmerLoadingView, ScrollView scrollView2, RhTextView rhTextView3, SparkleButton sparkleButton) {
        this.rootView = scrollView;
        this.content = constraintLayout;
        this.descriptionTxt = rhTextView;
        this.disclosureTxt = rhTextView2;
        this.illustrationImg = imageView;
        this.leaveOffBtn = rdsButton;
        this.loadingView = shimmerLoadingView;
        this.scrollView = scrollView2;
        this.titleTxt = rhTextView3;
        this.turnOnBtn = sparkleButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMarginWithdrawalPromptBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginWithdrawalPromptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.fragment_margin_withdrawal_prompt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginWithdrawalPromptBinding bind(View view) {
        int i = C11223R.id.content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C11223R.id.description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11223R.id.disclosure_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11223R.id.illustration_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C11223R.id.leave_off_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C11223R.id.loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                ScrollView scrollView = (ScrollView) view;
                                i = C11223R.id.title_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C11223R.id.turn_on_btn;
                                    SparkleButton sparkleButton = (SparkleButton) ViewBindings.findChildViewById(view, i);
                                    if (sparkleButton != null) {
                                        return new FragmentMarginWithdrawalPromptBinding(scrollView, constraintLayout, rhTextView, rhTextView2, imageView, rdsButton, shimmerLoadingView, scrollView, rhTextView3, sparkleButton);
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
