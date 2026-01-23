package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class FragmentRhyOpenAccountBinding implements ViewBinding {
    public final LottieAnimationView rhyOpenAccountAnimation;
    public final Guideline rhyOpenAccountAnimationBottomGuideline;
    public final Guideline rhyOpenAccountAnimationTopGuideline;
    public final RdsButton rhyOpenAccountRewardsLaterBtn;
    public final RdsButton rhyOpenAccountSetupRewardsBtn;
    public final RhTextView rhyOpenAccountStatusText;
    private final MotionLayout rootView;

    private FragmentRhyOpenAccountBinding(MotionLayout motionLayout, LottieAnimationView lottieAnimationView, Guideline guideline, Guideline guideline2, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView) {
        this.rootView = motionLayout;
        this.rhyOpenAccountAnimation = lottieAnimationView;
        this.rhyOpenAccountAnimationBottomGuideline = guideline;
        this.rhyOpenAccountAnimationTopGuideline = guideline2;
        this.rhyOpenAccountRewardsLaterBtn = rdsButton;
        this.rhyOpenAccountSetupRewardsBtn = rdsButton2;
        this.rhyOpenAccountStatusText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyOpenAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyOpenAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_open_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyOpenAccountBinding bind(View view) {
        int i = C27577R.id.rhy_open_account_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C27577R.id.rhy_open_account_animation_bottom_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C27577R.id.rhy_open_account_animation_top_guideline;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null) {
                    i = C27577R.id.rhy_open_account_rewards_later_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C27577R.id.rhy_open_account_setup_rewards_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C27577R.id.rhy_open_account_status_text;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentRhyOpenAccountBinding((MotionLayout) view, lottieAnimationView, guideline, guideline2, rdsButton, rdsButton2, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
