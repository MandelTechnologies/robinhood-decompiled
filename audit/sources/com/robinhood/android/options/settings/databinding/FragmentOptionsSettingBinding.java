package com.robinhood.android.options.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.settings.C23695R;

/* loaded from: classes11.dex */
public final class FragmentOptionsSettingBinding implements ViewBinding {
    public final ComposeView composeView;
    public final RdsInfoBannerView optionsRetirementAccountWarning;
    public final RhTextView optionsSettingBuyCallsPutsTxt;
    public final RdsButton optionsSettingDowngradeBtn;
    public final RhTextView optionsSettingExerciseTxt;
    public final RhTextView optionsSettingSellCoveredCallsTxt;
    public final RhTextView optionsSettingSellCoveredPutsTxt;
    public final ComposeView optionsSettingShortSellingComposeView;
    public final RhTextView optionsSettingSpreadsDisabledTxt;
    public final RhTextView optionsSettingSpreadsEnabledTxt;
    public final RhTextView optionsSettingTierTxt;
    public final RhTextView optionsSettingTradeOnExpirationDisclaimer;
    public final RdsToggleView optionsSettingTradeOnExpirationToggle;
    public final RdsButton optionsSettingUpgradeBtn;
    private final LinearLayout rootView;

    private FragmentOptionsSettingBinding(LinearLayout linearLayout, ComposeView composeView, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, ComposeView composeView2, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RdsToggleView rdsToggleView, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.composeView = composeView;
        this.optionsRetirementAccountWarning = rdsInfoBannerView;
        this.optionsSettingBuyCallsPutsTxt = rhTextView;
        this.optionsSettingDowngradeBtn = rdsButton;
        this.optionsSettingExerciseTxt = rhTextView2;
        this.optionsSettingSellCoveredCallsTxt = rhTextView3;
        this.optionsSettingSellCoveredPutsTxt = rhTextView4;
        this.optionsSettingShortSellingComposeView = composeView2;
        this.optionsSettingSpreadsDisabledTxt = rhTextView5;
        this.optionsSettingSpreadsEnabledTxt = rhTextView6;
        this.optionsSettingTierTxt = rhTextView7;
        this.optionsSettingTradeOnExpirationDisclaimer = rhTextView8;
        this.optionsSettingTradeOnExpirationToggle = rdsToggleView;
        this.optionsSettingUpgradeBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsSettingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23695R.layout.fragment_options_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsSettingBinding bind(View view) {
        int i = C23695R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C23695R.id.options_retirement_account_warning;
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
            if (rdsInfoBannerView != null) {
                i = C23695R.id.options_setting_buy_calls_puts_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C23695R.id.options_setting_downgrade_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C23695R.id.options_setting_exercise_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C23695R.id.options_setting_sell_covered_calls_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C23695R.id.options_setting_sell_covered_puts_txt;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    i = C23695R.id.options_setting_short_selling_compose_view;
                                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView2 != null) {
                                        i = C23695R.id.options_setting_spreads_disabled_txt;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C23695R.id.options_setting_spreads_enabled_txt;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                i = C23695R.id.options_setting_tier_txt;
                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView7 != null) {
                                                    i = C23695R.id.options_setting_trade_on_expiration_disclaimer;
                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView8 != null) {
                                                        i = C23695R.id.options_setting_trade_on_expiration_toggle;
                                                        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsToggleView != null) {
                                                            i = C23695R.id.options_setting_upgrade_btn;
                                                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                            if (rdsButton2 != null) {
                                                                return new FragmentOptionsSettingBinding((LinearLayout) view, composeView, rdsInfoBannerView, rhTextView, rdsButton, rhTextView2, rhTextView3, rhTextView4, composeView2, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rdsToggleView, rdsButton2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
