package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.ReferralCallToActionView;
import com.robinhood.android.common.p088ui.TopNavInboxButtonView;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;
import com.robinhood.android.designsystem.button.RdsIconButton;

/* loaded from: classes24.dex */
public final class AccountCenterToolbarBinding implements ViewBinding {
    public final ConstraintLayout accountCenterToolbarContainer;
    public final TopNavInboxButtonView accountCenterToolbarInboxButton;
    public final ReferralCallToActionView accountCenterToolbarRewardButton;
    public final TopNavButtonView accountCenterToolbarSearchButton;
    public final RdsIconButton accountCenterToolbarSettingsButton;
    public final ComposeView displayCurrencySwitcher;
    private final ConstraintLayout rootView;

    private AccountCenterToolbarBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TopNavInboxButtonView topNavInboxButtonView, ReferralCallToActionView referralCallToActionView, TopNavButtonView topNavButtonView, RdsIconButton rdsIconButton, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.accountCenterToolbarContainer = constraintLayout2;
        this.accountCenterToolbarInboxButton = topNavInboxButtonView;
        this.accountCenterToolbarRewardButton = referralCallToActionView;
        this.accountCenterToolbarSearchButton = topNavButtonView;
        this.accountCenterToolbarSettingsButton = rdsIconButton;
        this.displayCurrencySwitcher = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AccountCenterToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AccountCenterToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.account_center_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AccountCenterToolbarBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C8293R.id.account_center_toolbar_inbox_button;
        TopNavInboxButtonView topNavInboxButtonView = (TopNavInboxButtonView) ViewBindings.findChildViewById(view, i);
        if (topNavInboxButtonView != null) {
            i = C8293R.id.account_center_toolbar_reward_button;
            ReferralCallToActionView referralCallToActionView = (ReferralCallToActionView) ViewBindings.findChildViewById(view, i);
            if (referralCallToActionView != null) {
                i = C8293R.id.account_center_toolbar_search_button;
                TopNavButtonView topNavButtonView = (TopNavButtonView) ViewBindings.findChildViewById(view, i);
                if (topNavButtonView != null) {
                    i = C8293R.id.account_center_toolbar_settings_button;
                    RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                    if (rdsIconButton != null) {
                        i = C8293R.id.display_currency_switcher;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            return new AccountCenterToolbarBinding(constraintLayout, constraintLayout, topNavInboxButtonView, referralCallToActionView, topNavButtonView, rdsIconButton, composeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
