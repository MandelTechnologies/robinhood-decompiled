package com.robinhood.android.settings.p254ui.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.recurring.C28446R;
import com.robinhood.android.settings.p254ui.recurring.InvestmentScheduleDataView;

/* loaded from: classes5.dex */
public final class FragmentInvestmentScheduleSettingsBinding implements ViewBinding {
    public final RdsRowView investmentScheduleAmountRow;
    public final RdsRowView investmentScheduleBackupRow;
    public final LinearLayout investmentScheduleDataDivider;
    public final InvestmentScheduleDataView investmentScheduleDataFirstInvestmentDate;
    public final InvestmentScheduleDataView investmentScheduleDataNextInvestmentDate;
    public final InvestmentScheduleDataView investmentScheduleDataPriceChange;
    public final LinearLayout investmentScheduleDataSectionFirst;
    public final LinearLayout investmentScheduleDataSectionSecond;
    public final InvestmentScheduleDataView investmentScheduleDataTotalInvested;
    public final RdsButton investmentScheduleDeleteBtn;
    public final RdsButton investmentScheduleEndBtn;
    public final RdsRowView investmentScheduleNextDateRow;
    public final RdsButton investmentSchedulePauseBtn;
    public final RdsInfoBannerView investmentSchedulePauseReasonBanner;
    public final RdsRowView investmentScheduleRetirementTaxYearRow;
    public final RdsRowView investmentScheduleRetirementTypeRow;
    public final RdsRowView investmentScheduleScheduleRow;
    public final RhTextView investmentScheduleSettingsCollapsingTitle;
    public final AppBarLayout investmentScheduleSettingsLayout;
    public final RdsRowView investmentScheduleSourceOfFundsRow;
    public final RdsToggleView investmentScheduleToggleView;
    public final RdsButton investmentScheduleUnpauseBtn;
    public final LinearLayout listContainer;
    private final CoordinatorLayout rootView;

    private FragmentInvestmentScheduleSettingsBinding(CoordinatorLayout coordinatorLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, LinearLayout linearLayout, InvestmentScheduleDataView investmentScheduleDataView, InvestmentScheduleDataView investmentScheduleDataView2, InvestmentScheduleDataView investmentScheduleDataView3, LinearLayout linearLayout2, LinearLayout linearLayout3, InvestmentScheduleDataView investmentScheduleDataView4, RdsButton rdsButton, RdsButton rdsButton2, RdsRowView rdsRowView3, RdsButton rdsButton3, RdsInfoBannerView rdsInfoBannerView, RdsRowView rdsRowView4, RdsRowView rdsRowView5, RdsRowView rdsRowView6, RhTextView rhTextView, AppBarLayout appBarLayout, RdsRowView rdsRowView7, RdsToggleView rdsToggleView, RdsButton rdsButton4, LinearLayout linearLayout4) {
        this.rootView = coordinatorLayout;
        this.investmentScheduleAmountRow = rdsRowView;
        this.investmentScheduleBackupRow = rdsRowView2;
        this.investmentScheduleDataDivider = linearLayout;
        this.investmentScheduleDataFirstInvestmentDate = investmentScheduleDataView;
        this.investmentScheduleDataNextInvestmentDate = investmentScheduleDataView2;
        this.investmentScheduleDataPriceChange = investmentScheduleDataView3;
        this.investmentScheduleDataSectionFirst = linearLayout2;
        this.investmentScheduleDataSectionSecond = linearLayout3;
        this.investmentScheduleDataTotalInvested = investmentScheduleDataView4;
        this.investmentScheduleDeleteBtn = rdsButton;
        this.investmentScheduleEndBtn = rdsButton2;
        this.investmentScheduleNextDateRow = rdsRowView3;
        this.investmentSchedulePauseBtn = rdsButton3;
        this.investmentSchedulePauseReasonBanner = rdsInfoBannerView;
        this.investmentScheduleRetirementTaxYearRow = rdsRowView4;
        this.investmentScheduleRetirementTypeRow = rdsRowView5;
        this.investmentScheduleScheduleRow = rdsRowView6;
        this.investmentScheduleSettingsCollapsingTitle = rhTextView;
        this.investmentScheduleSettingsLayout = appBarLayout;
        this.investmentScheduleSourceOfFundsRow = rdsRowView7;
        this.investmentScheduleToggleView = rdsToggleView;
        this.investmentScheduleUnpauseBtn = rdsButton4;
        this.listContainer = linearLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestmentScheduleSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestmentScheduleSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28446R.layout.fragment_investment_schedule_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestmentScheduleSettingsBinding bind(View view) {
        int i = C28446R.id.investment_schedule_amount_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C28446R.id.investment_schedule_backup_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C28446R.id.investment_schedule_data_divider;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C28446R.id.investment_schedule_data_first_investment_date;
                    InvestmentScheduleDataView investmentScheduleDataView = (InvestmentScheduleDataView) ViewBindings.findChildViewById(view, i);
                    if (investmentScheduleDataView != null) {
                        i = C28446R.id.investment_schedule_data_next_investment_date;
                        InvestmentScheduleDataView investmentScheduleDataView2 = (InvestmentScheduleDataView) ViewBindings.findChildViewById(view, i);
                        if (investmentScheduleDataView2 != null) {
                            i = C28446R.id.investment_schedule_data_price_change;
                            InvestmentScheduleDataView investmentScheduleDataView3 = (InvestmentScheduleDataView) ViewBindings.findChildViewById(view, i);
                            if (investmentScheduleDataView3 != null) {
                                i = C28446R.id.investment_schedule_data_section_first;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C28446R.id.investment_schedule_data_section_second;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C28446R.id.investment_schedule_data_total_invested;
                                        InvestmentScheduleDataView investmentScheduleDataView4 = (InvestmentScheduleDataView) ViewBindings.findChildViewById(view, i);
                                        if (investmentScheduleDataView4 != null) {
                                            i = C28446R.id.investment_schedule_delete_btn;
                                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton != null) {
                                                i = C28446R.id.investment_schedule_end_btn;
                                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton2 != null) {
                                                    i = C28446R.id.investment_schedule_next_date_row;
                                                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsRowView3 != null) {
                                                        i = C28446R.id.investment_schedule_pause_btn;
                                                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton3 != null) {
                                                            i = C28446R.id.investment_schedule_pause_reason_banner;
                                                            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsInfoBannerView != null) {
                                                                i = C28446R.id.investment_schedule_retirement_tax_year_row;
                                                                RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsRowView4 != null) {
                                                                    i = C28446R.id.investment_schedule_retirement_type_row;
                                                                    RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                    if (rdsRowView5 != null) {
                                                                        i = C28446R.id.investment_schedule_schedule_row;
                                                                        RdsRowView rdsRowView6 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsRowView6 != null) {
                                                                            i = C28446R.id.investment_schedule_settings_collapsing_title;
                                                                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView != null) {
                                                                                i = C28446R.id.investment_schedule_settings_layout;
                                                                                AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (appBarLayout != null) {
                                                                                    i = C28446R.id.investment_schedule_source_of_funds_row;
                                                                                    RdsRowView rdsRowView7 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsRowView7 != null) {
                                                                                        i = C28446R.id.investment_schedule_toggle_view;
                                                                                        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsToggleView != null) {
                                                                                            i = C28446R.id.investment_schedule_unpause_btn;
                                                                                            RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                            if (rdsButton4 != null) {
                                                                                                i = C28446R.id.list_container;
                                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout4 != null) {
                                                                                                    return new FragmentInvestmentScheduleSettingsBinding((CoordinatorLayout) view, rdsRowView, rdsRowView2, linearLayout, investmentScheduleDataView, investmentScheduleDataView2, investmentScheduleDataView3, linearLayout2, linearLayout3, investmentScheduleDataView4, rdsButton, rdsButton2, rdsRowView3, rdsButton3, rdsInfoBannerView, rdsRowView4, rdsRowView5, rdsRowView6, rhTextView, appBarLayout, rdsRowView7, rdsToggleView, rdsButton4, linearLayout4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
