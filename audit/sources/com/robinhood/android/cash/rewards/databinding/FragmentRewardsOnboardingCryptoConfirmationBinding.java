package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOnboardingCryptoConfirmationBinding implements ViewBinding {
    public final RdsButtonBarView rewardsOnboardingAccountApprovedContinueButton;
    public final RhTextView rewardsOnboardingCryptoConfirmationSubtitle;
    public final RhTextView rewardsOnboardingCryptoConfirmationTitle;
    public final FocusSafeNestedScrollView rewardsOnboardingSignUpScrollView;
    private final LinearLayout rootView;

    private FragmentRewardsOnboardingCryptoConfirmationBinding(LinearLayout linearLayout, RdsButtonBarView rdsButtonBarView, RhTextView rhTextView, RhTextView rhTextView2, FocusSafeNestedScrollView focusSafeNestedScrollView) {
        this.rootView = linearLayout;
        this.rewardsOnboardingAccountApprovedContinueButton = rdsButtonBarView;
        this.rewardsOnboardingCryptoConfirmationSubtitle = rhTextView;
        this.rewardsOnboardingCryptoConfirmationTitle = rhTextView2;
        this.rewardsOnboardingSignUpScrollView = focusSafeNestedScrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingCryptoConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingCryptoConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_crypto_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingCryptoConfirmationBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_account_approved_continue_button;
        RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
        if (rdsButtonBarView != null) {
            i = C10176R.id.rewards_onboarding_crypto_confirmation_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10176R.id.rewards_onboarding_crypto_confirmation_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C10176R.id.rewards_onboarding_sign_up_scroll_view;
                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (focusSafeNestedScrollView != null) {
                        return new FragmentRewardsOnboardingCryptoConfirmationBinding((LinearLayout) view, rdsButtonBarView, rhTextView, rhTextView2, focusSafeNestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
