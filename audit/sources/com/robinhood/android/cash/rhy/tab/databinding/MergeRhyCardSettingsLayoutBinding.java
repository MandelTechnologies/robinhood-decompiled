package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;

/* loaded from: classes7.dex */
public final class MergeRhyCardSettingsLayoutBinding implements ViewBinding {
    public final RdsToggleView rhyCardSettingsCashCushionToggle;
    public final RdsRowView rhyCardSettingsChangePinRow;
    public final RdsRowView rhyCardSettingsGooglePayRow;
    public final RdsToggleView rhyCardSettingsLocationProtectionToggle;
    public final RdsToggleView rhyCardSettingsLockCardToggle;
    public final RdsRowView rhyCardSettingsMailCardRow;
    public final RdsRowView rhyCardSettingsReportProblemRow;
    public final RdsHeaderRowView rhyCardSettingsSecurityHeader;
    public final RdsToggleView rhyCardSettingsShowCardNumberToggle;
    public final RdsToggleView rhyCardSettingsSpendAlertToggle;
    public final RdsHeaderRowView rhyCardSettingsSpendingHeader;
    public final RdsHeaderRowView rhyCardSettingsSupportHeader;
    private final View rootView;

    private MergeRhyCardSettingsLayoutBinding(View view, RdsToggleView rdsToggleView, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsToggleView rdsToggleView2, RdsToggleView rdsToggleView3, RdsRowView rdsRowView3, RdsRowView rdsRowView4, RdsHeaderRowView rdsHeaderRowView, RdsToggleView rdsToggleView4, RdsToggleView rdsToggleView5, RdsHeaderRowView rdsHeaderRowView2, RdsHeaderRowView rdsHeaderRowView3) {
        this.rootView = view;
        this.rhyCardSettingsCashCushionToggle = rdsToggleView;
        this.rhyCardSettingsChangePinRow = rdsRowView;
        this.rhyCardSettingsGooglePayRow = rdsRowView2;
        this.rhyCardSettingsLocationProtectionToggle = rdsToggleView2;
        this.rhyCardSettingsLockCardToggle = rdsToggleView3;
        this.rhyCardSettingsMailCardRow = rdsRowView3;
        this.rhyCardSettingsReportProblemRow = rdsRowView4;
        this.rhyCardSettingsSecurityHeader = rdsHeaderRowView;
        this.rhyCardSettingsShowCardNumberToggle = rdsToggleView4;
        this.rhyCardSettingsSpendAlertToggle = rdsToggleView5;
        this.rhyCardSettingsSpendingHeader = rdsHeaderRowView2;
        this.rhyCardSettingsSupportHeader = rdsHeaderRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyCardSettingsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10285R.layout.merge_rhy_card_settings_layout, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyCardSettingsLayoutBinding bind(View view) {
        int i = C10285R.id.rhy_card_settings_cash_cushion_toggle;
        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
        if (rdsToggleView != null) {
            i = C10285R.id.rhy_card_settings_change_pin_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C10285R.id.rhy_card_settings_google_pay_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C10285R.id.rhy_card_settings_location_protection_toggle;
                    RdsToggleView rdsToggleView2 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                    if (rdsToggleView2 != null) {
                        i = C10285R.id.rhy_card_settings_lock_card_toggle;
                        RdsToggleView rdsToggleView3 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                        if (rdsToggleView3 != null) {
                            i = C10285R.id.rhy_card_settings_mail_card_row;
                            RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView3 != null) {
                                i = C10285R.id.rhy_card_settings_report_problem_row;
                                RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsRowView4 != null) {
                                    i = C10285R.id.rhy_card_settings_security_header;
                                    RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsHeaderRowView != null) {
                                        i = C10285R.id.rhy_card_settings_show_card_number_toggle;
                                        RdsToggleView rdsToggleView4 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                        if (rdsToggleView4 != null) {
                                            i = C10285R.id.rhy_card_settings_spend_alert_toggle;
                                            RdsToggleView rdsToggleView5 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                            if (rdsToggleView5 != null) {
                                                i = C10285R.id.rhy_card_settings_spending_header;
                                                RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                if (rdsHeaderRowView2 != null) {
                                                    i = C10285R.id.rhy_card_settings_support_header;
                                                    RdsHeaderRowView rdsHeaderRowView3 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsHeaderRowView3 != null) {
                                                        return new MergeRhyCardSettingsLayoutBinding(view, rdsToggleView, rdsRowView, rdsRowView2, rdsToggleView2, rdsToggleView3, rdsRowView3, rdsRowView4, rdsHeaderRowView, rdsToggleView4, rdsToggleView5, rdsHeaderRowView2, rdsHeaderRowView3);
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
