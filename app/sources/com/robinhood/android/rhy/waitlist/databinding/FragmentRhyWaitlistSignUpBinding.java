package com.robinhood.android.rhy.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.rhy.waitlist.C27560R;

/* loaded from: classes5.dex */
public final class FragmentRhyWaitlistSignUpBinding implements ViewBinding {
    public final RdsButtonBarView rhyWaitlistSignUpButtonBar;
    public final MotionLayout rhyWaitlistSignUpButtonMotion;
    public final View rhyWaitlistSignUpDetailsBackground;
    public final LinearLayout rhyWaitlistSignUpDetailsContainer;
    public final LottieAnimationView rhyWaitlistSignUpLottie;
    public final MotionLayout rhyWaitlistSignUpLottieMotion;
    public final ScrollView rhyWaitlistSignUpScrollView;
    private final MotionLayout rootView;

    private FragmentRhyWaitlistSignUpBinding(MotionLayout motionLayout, RdsButtonBarView rdsButtonBarView, MotionLayout motionLayout2, View view, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, MotionLayout motionLayout3, ScrollView scrollView) {
        this.rootView = motionLayout;
        this.rhyWaitlistSignUpButtonBar = rdsButtonBarView;
        this.rhyWaitlistSignUpButtonMotion = motionLayout2;
        this.rhyWaitlistSignUpDetailsBackground = view;
        this.rhyWaitlistSignUpDetailsContainer = linearLayout;
        this.rhyWaitlistSignUpLottie = lottieAnimationView;
        this.rhyWaitlistSignUpLottieMotion = motionLayout3;
        this.rhyWaitlistSignUpScrollView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyWaitlistSignUpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyWaitlistSignUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27560R.layout.fragment_rhy_waitlist_sign_up, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyWaitlistSignUpBinding bind(View view) {
        int i = C27560R.id.rhy_waitlist_sign_up_button_bar;
        RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
        if (rdsButtonBarView != null) {
            MotionLayout motionLayout = (MotionLayout) view;
            i = C27560R.id.rhy_waitlist_sign_up_details_background;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById != null) {
                i = C27560R.id.rhy_waitlist_sign_up_details_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C27560R.id.rhy_waitlist_sign_up_lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C27560R.id.rhy_waitlist_sign_up_lottie_motion;
                        MotionLayout motionLayout2 = (MotionLayout) ViewBindings.findChildViewById(view, i);
                        if (motionLayout2 != null) {
                            i = C27560R.id.rhy_waitlist_sign_up_scroll_view;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                            if (scrollView != null) {
                                return new FragmentRhyWaitlistSignUpBinding(motionLayout, rdsButtonBarView, motionLayout, viewFindChildViewById, linearLayout, lottieAnimationView, motionLayout2, scrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
