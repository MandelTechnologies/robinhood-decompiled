package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class FragmentRhyContrastIntroBinding implements ViewBinding {
    public final LottieAnimationView rhyContrastIntroAnimation;
    public final RhTextView rhyContrastIntroSubtitle;
    public final RhTextView rhyContrastIntroTitle;
    public final RdsTextButton rhyContrastReplayBtn;
    private final ConstraintLayout rootView;

    private FragmentRhyContrastIntroBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, RdsTextButton rdsTextButton) {
        this.rootView = constraintLayout;
        this.rhyContrastIntroAnimation = lottieAnimationView;
        this.rhyContrastIntroSubtitle = rhTextView;
        this.rhyContrastIntroTitle = rhTextView2;
        this.rhyContrastReplayBtn = rdsTextButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyContrastIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyContrastIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_contrast_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyContrastIntroBinding bind(View view) {
        int i = C27577R.id.rhy_contrast_intro_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C27577R.id.rhy_contrast_intro_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C27577R.id.rhy_contrast_intro_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C27577R.id.rhy_contrast_replay_btn;
                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                    if (rdsTextButton != null) {
                        return new FragmentRhyContrastIntroBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2, rdsTextButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
