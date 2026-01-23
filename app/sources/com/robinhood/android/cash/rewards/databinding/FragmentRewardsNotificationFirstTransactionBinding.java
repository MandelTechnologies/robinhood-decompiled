package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRewardsNotificationFirstTransactionBinding implements ViewBinding {
    public final LottieAnimationView rewardsNotificationFirstTransactionAnimation;
    public final RdsButton rewardsNotificationFirstTransactionCompleteButton;
    public final RhTextView rewardsNotificationFirstTransactionDescription;
    public final RhTextView rewardsNotificationFirstTransactionDisclosure;
    public final RhTextView rewardsNotificationFirstTransactionTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsNotificationFirstTransactionBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.rewardsNotificationFirstTransactionAnimation = lottieAnimationView;
        this.rewardsNotificationFirstTransactionCompleteButton = rdsButton;
        this.rewardsNotificationFirstTransactionDescription = rhTextView;
        this.rewardsNotificationFirstTransactionDisclosure = rhTextView2;
        this.rewardsNotificationFirstTransactionTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsNotificationFirstTransactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsNotificationFirstTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_notification_first_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsNotificationFirstTransactionBinding bind(View view) {
        int i = C10176R.id.rewards_notification_first_transaction_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C10176R.id.rewards_notification_first_transaction_complete_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10176R.id.rewards_notification_first_transaction_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_notification_first_transaction_disclosure;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C10176R.id.rewards_notification_first_transaction_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentRewardsNotificationFirstTransactionBinding((ConstraintLayout) view, lottieAnimationView, rdsButton, rhTextView, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
