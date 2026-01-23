package com.robinhood.android.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.waitlist.C31444R;

/* loaded from: classes9.dex */
public final class FragmentWaitlistSpotBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final RhTextView inWaitlistSubtitle;
    public final RhTextView inWaitlistTitle;
    public final RhTextView joinWaitlistSubtitle;
    public final RhTextView joinWaitlistTitle;
    public final RdsButton primaryActionBtn;
    private final ConstraintLayout rootView;
    public final RdsButton secondaryActionBtn;

    private FragmentWaitlistSpotBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.inWaitlistSubtitle = rhTextView;
        this.inWaitlistTitle = rhTextView2;
        this.joinWaitlistSubtitle = rhTextView3;
        this.joinWaitlistTitle = rhTextView4;
        this.primaryActionBtn = rdsButton;
        this.secondaryActionBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWaitlistSpotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWaitlistSpotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31444R.layout.fragment_waitlist_spot, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWaitlistSpotBinding bind(View view) {
        int i = C31444R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C31444R.id.in_waitlist_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C31444R.id.in_waitlist_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C31444R.id.join_waitlist_subtitle;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C31444R.id.join_waitlist_title;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C31444R.id.primary_action_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C31444R.id.secondary_action_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    return new FragmentWaitlistSpotBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2, rhTextView3, rhTextView4, rdsButton, rdsButton2);
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
