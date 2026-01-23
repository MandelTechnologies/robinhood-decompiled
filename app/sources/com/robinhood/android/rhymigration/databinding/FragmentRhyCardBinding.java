package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class FragmentRhyCardBinding implements ViewBinding {
    public final RhTextView rhyCardEta;
    public final LinearLayout rhyCardEtaWrapper;
    public final LottieAnimationView rhyCardLottie;
    public final RdsButton rhyCardPrimaryBtn;
    public final RdsButton rhyCardSecondaryBtn;
    public final RhTextView rhyCardSubtitle;
    public final RhTextView rhyCardTitle;
    private final ConstraintLayout rootView;

    private FragmentRhyCardBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.rhyCardEta = rhTextView;
        this.rhyCardEtaWrapper = linearLayout;
        this.rhyCardLottie = lottieAnimationView;
        this.rhyCardPrimaryBtn = rdsButton;
        this.rhyCardSecondaryBtn = rdsButton2;
        this.rhyCardSubtitle = rhTextView2;
        this.rhyCardTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyCardBinding bind(View view) {
        int i = C27577R.id.rhy_card_eta;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27577R.id.rhy_card_eta_wrapper;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C27577R.id.rhy_card_lottie;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C27577R.id.rhy_card_primary_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C27577R.id.rhy_card_secondary_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C27577R.id.rhy_card_subtitle;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C27577R.id.rhy_card_title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentRhyCardBinding((ConstraintLayout) view, rhTextView, linearLayout, lottieAnimationView, rdsButton, rdsButton2, rhTextView2, rhTextView3);
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
