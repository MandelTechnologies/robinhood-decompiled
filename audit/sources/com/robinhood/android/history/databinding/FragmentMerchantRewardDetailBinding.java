package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentMerchantRewardDetailBinding implements ViewBinding {
    public final LinearLayout merchantRewardDetailActions;
    public final ComposeView merchantRewardDetailComposeView;
    public final RdsTextButton merchantRewardDetailViewOfferButton;
    public final RdsButton merchantRewardDetailViewRewardButton;
    public final RdsButton merchantRewardDetailViewTransactionButton;
    private final ConstraintLayout rootView;

    private FragmentMerchantRewardDetailBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ComposeView composeView, RdsTextButton rdsTextButton, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.merchantRewardDetailActions = linearLayout;
        this.merchantRewardDetailComposeView = composeView;
        this.merchantRewardDetailViewOfferButton = rdsTextButton;
        this.merchantRewardDetailViewRewardButton = rdsButton;
        this.merchantRewardDetailViewTransactionButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMerchantRewardDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMerchantRewardDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_merchant_reward_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMerchantRewardDetailBinding bind(View view) {
        int i = C18359R.id.merchant_reward_detail_actions;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C18359R.id.merchant_reward_detail_compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C18359R.id.merchant_reward_detail_view_offer_button;
                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                if (rdsTextButton != null) {
                    i = C18359R.id.merchant_reward_detail_view_reward_button;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C18359R.id.merchant_reward_detail_view_transaction_button;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            return new FragmentMerchantRewardDetailBinding((ConstraintLayout) view, linearLayout, composeView, rdsTextButton, rdsButton, rdsButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
