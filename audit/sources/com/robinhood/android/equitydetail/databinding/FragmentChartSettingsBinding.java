package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsTextButtonRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentChartSettingsBinding implements ViewBinding {
    public final RdsTextButtonRowView chartSettingsCandlestickChartEducationTour;
    public final RdsRadioButtonRowView chartSettingsCandlestickSelection;
    public final LinearLayout chartSettingsEducationTourContainer;
    public final RdsToggleView chartSettingsHoursRow;
    public final RdsTextButtonRowView chartSettingsLineChartEducationTour;
    public final RdsRadioButtonRowView chartSettingsLineSelection;
    public final NewRdsRadioGroup chartSettingsTypeRadiogroup;
    public final RhTextView chartSettingsTypeTitle;
    public final RhTextView hoursSectionTitle;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;

    private FragmentChartSettingsBinding(NestedScrollView nestedScrollView, RdsTextButtonRowView rdsTextButtonRowView, RdsRadioButtonRowView rdsRadioButtonRowView, LinearLayout linearLayout, RdsToggleView rdsToggleView, RdsTextButtonRowView rdsTextButtonRowView2, RdsRadioButtonRowView rdsRadioButtonRowView2, NewRdsRadioGroup newRdsRadioGroup, RhTextView rhTextView, RhTextView rhTextView2, NestedScrollView nestedScrollView2) {
        this.rootView = nestedScrollView;
        this.chartSettingsCandlestickChartEducationTour = rdsTextButtonRowView;
        this.chartSettingsCandlestickSelection = rdsRadioButtonRowView;
        this.chartSettingsEducationTourContainer = linearLayout;
        this.chartSettingsHoursRow = rdsToggleView;
        this.chartSettingsLineChartEducationTour = rdsTextButtonRowView2;
        this.chartSettingsLineSelection = rdsRadioButtonRowView2;
        this.chartSettingsTypeRadiogroup = newRdsRadioGroup;
        this.chartSettingsTypeTitle = rhTextView;
        this.hoursSectionTitle = rhTextView2;
        this.scrollView = nestedScrollView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentChartSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChartSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_chart_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChartSettingsBinding bind(View view) {
        int i = C15314R.id.chart_settings_candlestick_chart_education_tour;
        RdsTextButtonRowView rdsTextButtonRowView = (RdsTextButtonRowView) ViewBindings.findChildViewById(view, i);
        if (rdsTextButtonRowView != null) {
            i = C15314R.id.chart_settings_candlestick_selection;
            RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRadioButtonRowView != null) {
                i = C15314R.id.chart_settings_education_tour_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C15314R.id.chart_settings_hours_row;
                    RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                    if (rdsToggleView != null) {
                        i = C15314R.id.chart_settings_line_chart_education_tour;
                        RdsTextButtonRowView rdsTextButtonRowView2 = (RdsTextButtonRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextButtonRowView2 != null) {
                            i = C15314R.id.chart_settings_line_selection;
                            RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRadioButtonRowView2 != null) {
                                i = C15314R.id.chart_settings_type_radiogroup;
                                NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                if (newRdsRadioGroup != null) {
                                    i = C15314R.id.chart_settings_type_title;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null) {
                                        i = C15314R.id.hours_section_title;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            return new FragmentChartSettingsBinding(nestedScrollView, rdsTextButtonRowView, rdsRadioButtonRowView, linearLayout, rdsToggleView, rdsTextButtonRowView2, rdsRadioButtonRowView2, newRdsRadioGroup, rhTextView, rhTextView2, nestedScrollView);
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
