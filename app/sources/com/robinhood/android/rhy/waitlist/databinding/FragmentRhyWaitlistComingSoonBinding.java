package com.robinhood.android.rhy.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.rhy.waitlist.C27560R;

/* loaded from: classes5.dex */
public final class FragmentRhyWaitlistComingSoonBinding implements ViewBinding {
    public final RdsButtonBarView rhyWaitlistComingSoonButtonBar;
    public final LottieAnimationView rhyWaitlistComingSoonLottie;
    public final ScrollView rhyWaitlistComingSoonScrollView;
    private final ConstraintLayout rootView;

    private FragmentRhyWaitlistComingSoonBinding(ConstraintLayout constraintLayout, RdsButtonBarView rdsButtonBarView, LottieAnimationView lottieAnimationView, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.rhyWaitlistComingSoonButtonBar = rdsButtonBarView;
        this.rhyWaitlistComingSoonLottie = lottieAnimationView;
        this.rhyWaitlistComingSoonScrollView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyWaitlistComingSoonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyWaitlistComingSoonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27560R.layout.fragment_rhy_waitlist_coming_soon, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyWaitlistComingSoonBinding bind(View view) {
        int i = C27560R.id.rhy_waitlist_coming_soon_button_bar;
        RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
        if (rdsButtonBarView != null) {
            i = C27560R.id.rhy_waitlist_coming_soon_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C27560R.id.rhy_waitlist_coming_soon_scroll_view;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    return new FragmentRhyWaitlistComingSoonBinding((ConstraintLayout) view, rdsButtonBarView, lottieAnimationView, scrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
