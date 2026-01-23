package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringScheduleBinding implements ViewBinding {
    public final RhTextView recurringPaycheckScheduleNextOrderDateTxt;
    public final RhTextView recurringScheduleDisclaimerTxt;
    public final RdsButton recurringScheduleDoneBtn;
    public final LegacyRdsRadioButton recurringScheduleFrequencyBiweeklyBtn;
    public final LegacyRdsRadioButton recurringScheduleFrequencyDailyBtn;
    public final LegacyRdsRadioButton recurringScheduleFrequencyMonthlyBtn;
    public final LegacyRdsRadioButton recurringScheduleFrequencyPaycheckBtn;
    public final View recurringScheduleFrequencyPaycheckDivider;
    public final LegacyRdsRadioGroup recurringScheduleFrequencyRadioGroup;
    public final LegacyRdsRadioButton recurringScheduleFrequencyWeeklyBtn;
    public final RhTextView recurringScheduleNextOrderDateTxt;
    public final RhTextView recurringScheduleSubtitleTxt;
    public final RhTextView recurringScheduleTitleTxt;
    private final LinearLayout rootView;

    private FragmentRecurringScheduleBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, LegacyRdsRadioButton legacyRdsRadioButton, LegacyRdsRadioButton legacyRdsRadioButton2, LegacyRdsRadioButton legacyRdsRadioButton3, LegacyRdsRadioButton legacyRdsRadioButton4, View view, LegacyRdsRadioGroup legacyRdsRadioGroup, LegacyRdsRadioButton legacyRdsRadioButton5, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5) {
        this.rootView = linearLayout;
        this.recurringPaycheckScheduleNextOrderDateTxt = rhTextView;
        this.recurringScheduleDisclaimerTxt = rhTextView2;
        this.recurringScheduleDoneBtn = rdsButton;
        this.recurringScheduleFrequencyBiweeklyBtn = legacyRdsRadioButton;
        this.recurringScheduleFrequencyDailyBtn = legacyRdsRadioButton2;
        this.recurringScheduleFrequencyMonthlyBtn = legacyRdsRadioButton3;
        this.recurringScheduleFrequencyPaycheckBtn = legacyRdsRadioButton4;
        this.recurringScheduleFrequencyPaycheckDivider = view;
        this.recurringScheduleFrequencyRadioGroup = legacyRdsRadioGroup;
        this.recurringScheduleFrequencyWeeklyBtn = legacyRdsRadioButton5;
        this.recurringScheduleNextOrderDateTxt = rhTextView3;
        this.recurringScheduleSubtitleTxt = rhTextView4;
        this.recurringScheduleTitleTxt = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringScheduleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringScheduleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringScheduleBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11595R.id.recurring_paycheck_schedule_next_order_date_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11595R.id.recurring_schedule_disclaimer_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C11595R.id.recurring_schedule_done_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C11595R.id.recurring_schedule_frequency_biweekly_btn;
                    LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                    if (legacyRdsRadioButton != null) {
                        i = C11595R.id.recurring_schedule_frequency_daily_btn;
                        LegacyRdsRadioButton legacyRdsRadioButton2 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                        if (legacyRdsRadioButton2 != null) {
                            i = C11595R.id.recurring_schedule_frequency_monthly_btn;
                            LegacyRdsRadioButton legacyRdsRadioButton3 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                            if (legacyRdsRadioButton3 != null) {
                                i = C11595R.id.recurring_schedule_frequency_paycheck_btn;
                                LegacyRdsRadioButton legacyRdsRadioButton4 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                                if (legacyRdsRadioButton4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11595R.id.recurring_schedule_frequency_paycheck_divider))) != null) {
                                    i = C11595R.id.recurring_schedule_frequency_radio_group;
                                    LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                    if (legacyRdsRadioGroup != null) {
                                        i = C11595R.id.recurring_schedule_frequency_weekly_btn;
                                        LegacyRdsRadioButton legacyRdsRadioButton5 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                                        if (legacyRdsRadioButton5 != null) {
                                            i = C11595R.id.recurring_schedule_next_order_date_txt;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C11595R.id.recurring_schedule_subtitle_txt;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    i = C11595R.id.recurring_schedule_title_txt;
                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView5 != null) {
                                                        return new FragmentRecurringScheduleBinding((LinearLayout) view, rhTextView, rhTextView2, rdsButton, legacyRdsRadioButton, legacyRdsRadioButton2, legacyRdsRadioButton3, legacyRdsRadioButton4, viewFindChildViewById, legacyRdsRadioGroup, legacyRdsRadioButton5, rhTextView3, rhTextView4, rhTextView5);
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
