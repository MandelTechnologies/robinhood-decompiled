package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes20.dex */
public final class FragmentWelcomeBinding implements ViewBinding {
    public final ConstraintLayout buttonContainer;
    public final LottieAnimationView maxWelcomeAnimationView;
    public final IncludeMaxWelcomeBottomSheetBinding maxWelcomeBottomSheet;
    public final DotIndicators maxWelcomeDotIndicators;
    public final RhTextView maxWelcomeIntroSubtitle;
    public final RhTextView maxWelcomeIntroTitle;
    public final RdsButton maxWelcomeLoginBtn;
    public final RdsButton maxWelcomeSignupBtn;
    public final ViewPager2 maxWelcomeViewPager;
    public final MotionLayout root;
    private final ConstraintLayout rootView;

    private FragmentWelcomeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding, DotIndicators dotIndicators, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RdsButton rdsButton2, ViewPager2 viewPager2, MotionLayout motionLayout) {
        this.rootView = constraintLayout;
        this.buttonContainer = constraintLayout2;
        this.maxWelcomeAnimationView = lottieAnimationView;
        this.maxWelcomeBottomSheet = includeMaxWelcomeBottomSheetBinding;
        this.maxWelcomeDotIndicators = dotIndicators;
        this.maxWelcomeIntroSubtitle = rhTextView;
        this.maxWelcomeIntroTitle = rhTextView2;
        this.maxWelcomeLoginBtn = rdsButton;
        this.maxWelcomeSignupBtn = rdsButton2;
        this.maxWelcomeViewPager = viewPager2;
        this.root = motionLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeBinding bind(View view) {
        View viewFindChildViewById;
        int i = C31456R.id.button_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31456R.id.max_welcome_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C31456R.id.max_welcome_bottom_sheet))) != null) {
                IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBindingBind = IncludeMaxWelcomeBottomSheetBinding.bind(viewFindChildViewById);
                i = C31456R.id.max_welcome_dot_indicators;
                DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
                if (dotIndicators != null) {
                    i = C31456R.id.max_welcome_intro_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C31456R.id.max_welcome_intro_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C31456R.id.max_welcome_login_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C31456R.id.max_welcome_signup_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C31456R.id.max_welcome_view_pager;
                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                    if (viewPager2 != null) {
                                        i = C31456R.id.root;
                                        MotionLayout motionLayout = (MotionLayout) ViewBindings.findChildViewById(view, i);
                                        if (motionLayout != null) {
                                            return new FragmentWelcomeBinding((ConstraintLayout) view, constraintLayout, lottieAnimationView, includeMaxWelcomeBottomSheetBindingBind, dotIndicators, rhTextView, rhTextView2, rdsButton, rdsButton2, viewPager2, motionLayout);
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
