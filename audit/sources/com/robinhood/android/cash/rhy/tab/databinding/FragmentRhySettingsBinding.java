package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;

/* loaded from: classes7.dex */
public final class FragmentRhySettingsBinding implements ViewBinding {
    public final RdsToggleView rhySettingsFragmentCashCushionToggle;
    public final RdsRowView rhySettingsFragmentChangePinRow;
    public final LinearLayout rhySettingsFragmentDebitCardContainer;
    public final RdsHeaderRowView rhySettingsFragmentDebitCardTitle;
    public final FragmentContainerView rhySettingsFragmentEarlyDdToggle;
    public final RdsRowView rhySettingsFragmentGooglePayRow;
    public final RdsToggleView rhySettingsFragmentLocationProtectionToggle;
    public final RdsToggleView rhySettingsFragmentLockCardToggle;
    public final RdsRowView rhySettingsFragmentManageDirectDepositRow;
    public final RdsRowView rhySettingsFragmentMatchaBlockedList;
    public final LinearLayout rhySettingsFragmentMatchaContainer;
    public final RdsRowView rhySettingsFragmentMatchaLimits;
    public final RdsRowView rhySettingsFragmentMatchaProfileEdit;
    public final RdsRowView rhySettingsFragmentMatchaProfileVisibility;
    public final RdsHeaderRowView rhySettingsFragmentMatchaTitle;
    public final RdsHeaderRowView rhySettingsFragmentPaycheckTitle;
    public final RdsRowView rhySettingsFragmentReportProblemRow;
    public final RdsHeaderRowView rhySettingsFragmentSettingsTitle;
    public final RdsRowView rhySettingsFragmentSetupDepositRow;
    public final RdsRowView rhySettingsFragmentShowAccountNumberRow;
    public final RdsToggleView rhySettingsFragmentSpendAlertsToggle;
    public final RdsHeaderRowView rhySettingsFragmentSupportTitle;
    private final ScrollView rootView;

    private FragmentRhySettingsBinding(ScrollView scrollView, RdsToggleView rdsToggleView, RdsRowView rdsRowView, LinearLayout linearLayout, RdsHeaderRowView rdsHeaderRowView, FragmentContainerView fragmentContainerView, RdsRowView rdsRowView2, RdsToggleView rdsToggleView2, RdsToggleView rdsToggleView3, RdsRowView rdsRowView3, RdsRowView rdsRowView4, LinearLayout linearLayout2, RdsRowView rdsRowView5, RdsRowView rdsRowView6, RdsRowView rdsRowView7, RdsHeaderRowView rdsHeaderRowView2, RdsHeaderRowView rdsHeaderRowView3, RdsRowView rdsRowView8, RdsHeaderRowView rdsHeaderRowView4, RdsRowView rdsRowView9, RdsRowView rdsRowView10, RdsToggleView rdsToggleView4, RdsHeaderRowView rdsHeaderRowView5) {
        this.rootView = scrollView;
        this.rhySettingsFragmentCashCushionToggle = rdsToggleView;
        this.rhySettingsFragmentChangePinRow = rdsRowView;
        this.rhySettingsFragmentDebitCardContainer = linearLayout;
        this.rhySettingsFragmentDebitCardTitle = rdsHeaderRowView;
        this.rhySettingsFragmentEarlyDdToggle = fragmentContainerView;
        this.rhySettingsFragmentGooglePayRow = rdsRowView2;
        this.rhySettingsFragmentLocationProtectionToggle = rdsToggleView2;
        this.rhySettingsFragmentLockCardToggle = rdsToggleView3;
        this.rhySettingsFragmentManageDirectDepositRow = rdsRowView3;
        this.rhySettingsFragmentMatchaBlockedList = rdsRowView4;
        this.rhySettingsFragmentMatchaContainer = linearLayout2;
        this.rhySettingsFragmentMatchaLimits = rdsRowView5;
        this.rhySettingsFragmentMatchaProfileEdit = rdsRowView6;
        this.rhySettingsFragmentMatchaProfileVisibility = rdsRowView7;
        this.rhySettingsFragmentMatchaTitle = rdsHeaderRowView2;
        this.rhySettingsFragmentPaycheckTitle = rdsHeaderRowView3;
        this.rhySettingsFragmentReportProblemRow = rdsRowView8;
        this.rhySettingsFragmentSettingsTitle = rdsHeaderRowView4;
        this.rhySettingsFragmentSetupDepositRow = rdsRowView9;
        this.rhySettingsFragmentShowAccountNumberRow = rdsRowView10;
        this.rhySettingsFragmentSpendAlertsToggle = rdsToggleView4;
        this.rhySettingsFragmentSupportTitle = rdsHeaderRowView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRhySettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhySettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_rhy_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhySettingsBinding bind(View view) {
        int i = C10285R.id.rhy_settings_fragment_cash_cushion_toggle;
        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
        if (rdsToggleView != null) {
            i = C10285R.id.rhy_settings_fragment_change_pin_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C10285R.id.rhy_settings_fragment_debit_card_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C10285R.id.rhy_settings_fragment_debit_card_title;
                    RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsHeaderRowView != null) {
                        i = C10285R.id.rhy_settings_fragment_early_dd_toggle;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView != null) {
                            i = C10285R.id.rhy_settings_fragment_google_pay_row;
                            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView2 != null) {
                                i = C10285R.id.rhy_settings_fragment_location_protection_toggle;
                                RdsToggleView rdsToggleView2 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                if (rdsToggleView2 != null) {
                                    i = C10285R.id.rhy_settings_fragment_lock_card_toggle;
                                    RdsToggleView rdsToggleView3 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                    if (rdsToggleView3 != null) {
                                        i = C10285R.id.rhy_settings_fragment_manage_direct_deposit_row;
                                        RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsRowView3 != null) {
                                            i = C10285R.id.rhy_settings_fragment_matcha_blocked_list;
                                            RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsRowView4 != null) {
                                                i = C10285R.id.rhy_settings_fragment_matcha_container;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    i = C10285R.id.rhy_settings_fragment_matcha_limits;
                                                    RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsRowView5 != null) {
                                                        i = C10285R.id.rhy_settings_fragment_matcha_profile_edit;
                                                        RdsRowView rdsRowView6 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsRowView6 != null) {
                                                            i = C10285R.id.rhy_settings_fragment_matcha_profile_visibility;
                                                            RdsRowView rdsRowView7 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsRowView7 != null) {
                                                                i = C10285R.id.rhy_settings_fragment_matcha_title;
                                                                RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsHeaderRowView2 != null) {
                                                                    i = C10285R.id.rhy_settings_fragment_paycheck_title;
                                                                    RdsHeaderRowView rdsHeaderRowView3 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                    if (rdsHeaderRowView3 != null) {
                                                                        i = C10285R.id.rhy_settings_fragment_report_problem_row;
                                                                        RdsRowView rdsRowView8 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsRowView8 != null) {
                                                                            i = C10285R.id.rhy_settings_fragment_settings_title;
                                                                            RdsHeaderRowView rdsHeaderRowView4 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsHeaderRowView4 != null) {
                                                                                i = C10285R.id.rhy_settings_fragment_setup_deposit_row;
                                                                                RdsRowView rdsRowView9 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsRowView9 != null) {
                                                                                    i = C10285R.id.rhy_settings_fragment_show_account_number_row;
                                                                                    RdsRowView rdsRowView10 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsRowView10 != null) {
                                                                                        i = C10285R.id.rhy_settings_fragment_spend_alerts_toggle;
                                                                                        RdsToggleView rdsToggleView4 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsToggleView4 != null) {
                                                                                            i = C10285R.id.rhy_settings_fragment_support_title;
                                                                                            RdsHeaderRowView rdsHeaderRowView5 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rdsHeaderRowView5 != null) {
                                                                                                return new FragmentRhySettingsBinding((ScrollView) view, rdsToggleView, rdsRowView, linearLayout, rdsHeaderRowView, fragmentContainerView, rdsRowView2, rdsToggleView2, rdsToggleView3, rdsRowView3, rdsRowView4, linearLayout2, rdsRowView5, rdsRowView6, rdsRowView7, rdsHeaderRowView2, rdsHeaderRowView3, rdsRowView8, rdsHeaderRowView4, rdsRowView9, rdsRowView10, rdsToggleView4, rdsHeaderRowView5);
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
