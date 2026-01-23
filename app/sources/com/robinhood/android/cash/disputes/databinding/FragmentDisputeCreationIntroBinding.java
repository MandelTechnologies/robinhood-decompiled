package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentDisputeCreationIntroBinding implements ViewBinding {
    public final RdsButton disputeCreationButton;
    public final RhTextView disputeCreationIntroDescription;
    public final RhTextView disputeCreationIntroLearnMoreText;
    public final LottieAnimationView disputeCreationIntroLottieView;
    public final RhTextView disputeCreationIntroTitle;
    private final ConstraintLayout rootView;

    private FragmentDisputeCreationIntroBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.disputeCreationButton = rdsButton;
        this.disputeCreationIntroDescription = rhTextView;
        this.disputeCreationIntroLearnMoreText = rhTextView2;
        this.disputeCreationIntroLottieView = lottieAnimationView;
        this.disputeCreationIntroTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDisputeCreationIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDisputeCreationIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_dispute_creation_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDisputeCreationIntroBinding bind(View view) {
        int i = C10007R.id.dispute_creation_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.dispute_creation_intro_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10007R.id.dispute_creation_intro_learn_more_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C10007R.id.dispute_creation_intro_lottie_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C10007R.id.dispute_creation_intro_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentDisputeCreationIntroBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, lottieAnimationView, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
