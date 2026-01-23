package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentScheduleAutomaticDepositV2Binding implements ViewBinding {
    public final LegacyRdsRadioButton automaticDepositFrequencyBiweeklyRow;
    public final LegacyRdsRadioButton automaticDepositFrequencyMonthlyRow;
    public final LegacyRdsRadioButton automaticDepositFrequencyQuarterlyRow;
    public final LegacyRdsRadioButton automaticDepositFrequencyWeeklyRow;
    public final FrameLayout fragmentContainer;
    public final ShimmerLoadingView rdsLoadingView;
    private final FrameLayout rootView;
    public final LegacyRdsRadioGroup scheduleAutomaticDepositRadioGroup;
    public final RhTextView scheduleAutomaticDepositSubtitle;
    public final RhTextView scheduleAutomaticDepositTitle;
    public final RhTextView scheduleAutomaticDepositV2Description;
    public final RdsButton scheduleAutomaticDepositV2PrimaryCta;
    public final RdsButton scheduleAutomaticDepositV2SecondaryCta;

    private FragmentScheduleAutomaticDepositV2Binding(FrameLayout frameLayout, LegacyRdsRadioButton legacyRdsRadioButton, LegacyRdsRadioButton legacyRdsRadioButton2, LegacyRdsRadioButton legacyRdsRadioButton3, LegacyRdsRadioButton legacyRdsRadioButton4, FrameLayout frameLayout2, ShimmerLoadingView shimmerLoadingView, LegacyRdsRadioGroup legacyRdsRadioGroup, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = frameLayout;
        this.automaticDepositFrequencyBiweeklyRow = legacyRdsRadioButton;
        this.automaticDepositFrequencyMonthlyRow = legacyRdsRadioButton2;
        this.automaticDepositFrequencyQuarterlyRow = legacyRdsRadioButton3;
        this.automaticDepositFrequencyWeeklyRow = legacyRdsRadioButton4;
        this.fragmentContainer = frameLayout2;
        this.rdsLoadingView = shimmerLoadingView;
        this.scheduleAutomaticDepositRadioGroup = legacyRdsRadioGroup;
        this.scheduleAutomaticDepositSubtitle = rhTextView;
        this.scheduleAutomaticDepositTitle = rhTextView2;
        this.scheduleAutomaticDepositV2Description = rhTextView3;
        this.scheduleAutomaticDepositV2PrimaryCta = rdsButton;
        this.scheduleAutomaticDepositV2SecondaryCta = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScheduleAutomaticDepositV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScheduleAutomaticDepositV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_schedule_automatic_deposit_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentScheduleAutomaticDepositV2Binding bind(View view) {
        int i = C30082R.id.automatic_deposit_frequency_biweekly_row;
        LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
        if (legacyRdsRadioButton != null) {
            i = C30082R.id.automatic_deposit_frequency_monthly_row;
            LegacyRdsRadioButton legacyRdsRadioButton2 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
            if (legacyRdsRadioButton2 != null) {
                i = C30082R.id.automatic_deposit_frequency_quarterly_row;
                LegacyRdsRadioButton legacyRdsRadioButton3 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                if (legacyRdsRadioButton3 != null) {
                    i = C30082R.id.automatic_deposit_frequency_weekly_row;
                    LegacyRdsRadioButton legacyRdsRadioButton4 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                    if (legacyRdsRadioButton4 != null) {
                        i = C30082R.id.fragment_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = C30082R.id.rds_loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C30082R.id.schedule_automatic_deposit_radio_group;
                                LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                if (legacyRdsRadioGroup != null) {
                                    i = C30082R.id.schedule_automatic_deposit_subtitle;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null) {
                                        i = C30082R.id.schedule_automatic_deposit_title;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C30082R.id.schedule_automatic_deposit_v2_description;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C30082R.id.schedule_automatic_deposit_v2_primary_cta;
                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton != null) {
                                                    i = C30082R.id.schedule_automatic_deposit_v2_secondary_cta;
                                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsButton2 != null) {
                                                        return new FragmentScheduleAutomaticDepositV2Binding((FrameLayout) view, legacyRdsRadioButton, legacyRdsRadioButton2, legacyRdsRadioButton3, legacyRdsRadioButton4, frameLayout, shimmerLoadingView, legacyRdsRadioGroup, rhTextView, rhTextView2, rhTextView3, rdsButton, rdsButton2);
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
