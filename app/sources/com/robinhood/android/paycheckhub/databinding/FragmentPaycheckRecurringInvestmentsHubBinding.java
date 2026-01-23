package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;

/* loaded from: classes11.dex */
public final class FragmentPaycheckRecurringInvestmentsHubBinding implements ViewBinding {
    public final RhTextView brokerageCashEmptyMessage;
    public final RecyclerView brokerageCashRecyclerView;
    public final LinearLayout brokerageCashSection;
    public final RhTextView brokerageCashTitle;
    public final RdsButton createNewPaycheckInvestmentButton;
    public final RhTextView cryptoEmptyMessage;
    public final RecyclerView cryptoRecyclerView;
    public final LinearLayout cryptoSection;
    public final RhTextView cryptoSectionTitle;
    public final LinearLayout equitiesSection;
    public final RhTextView paycheckRecurringInvestmentDisclaimer;
    public final RdsSettingsRowView paycheckRecurringInvestmentsActiveCount;
    public final RdsSettingsRowView paycheckRecurringInvestmentsLastUpdated;
    public final RdsSettingsRowView paycheckRecurringInvestmentsPausedCount;
    public final RdsSettingsRowView paycheckRecurringInvestmentsTotalAmountInvested;
    public final RhTextView retirementEmptyMessage;
    public final RecyclerView retirementRecyclerView;
    public final LinearLayout retirementSection;
    public final RhTextView retirementSectionTitle;
    private final LinearLayout rootView;
    public final RhTextView stocksAndEtfsEmptyMessage;
    public final RecyclerView stocksAndEtfsRecyclerView;

    private FragmentPaycheckRecurringInvestmentsHubBinding(LinearLayout linearLayout, RhTextView rhTextView, RecyclerView recyclerView, LinearLayout linearLayout2, RhTextView rhTextView2, RdsButton rdsButton, RhTextView rhTextView3, RecyclerView recyclerView2, LinearLayout linearLayout3, RhTextView rhTextView4, LinearLayout linearLayout4, RhTextView rhTextView5, RdsSettingsRowView rdsSettingsRowView, RdsSettingsRowView rdsSettingsRowView2, RdsSettingsRowView rdsSettingsRowView3, RdsSettingsRowView rdsSettingsRowView4, RhTextView rhTextView6, RecyclerView recyclerView3, LinearLayout linearLayout5, RhTextView rhTextView7, RhTextView rhTextView8, RecyclerView recyclerView4) {
        this.rootView = linearLayout;
        this.brokerageCashEmptyMessage = rhTextView;
        this.brokerageCashRecyclerView = recyclerView;
        this.brokerageCashSection = linearLayout2;
        this.brokerageCashTitle = rhTextView2;
        this.createNewPaycheckInvestmentButton = rdsButton;
        this.cryptoEmptyMessage = rhTextView3;
        this.cryptoRecyclerView = recyclerView2;
        this.cryptoSection = linearLayout3;
        this.cryptoSectionTitle = rhTextView4;
        this.equitiesSection = linearLayout4;
        this.paycheckRecurringInvestmentDisclaimer = rhTextView5;
        this.paycheckRecurringInvestmentsActiveCount = rdsSettingsRowView;
        this.paycheckRecurringInvestmentsLastUpdated = rdsSettingsRowView2;
        this.paycheckRecurringInvestmentsPausedCount = rdsSettingsRowView3;
        this.paycheckRecurringInvestmentsTotalAmountInvested = rdsSettingsRowView4;
        this.retirementEmptyMessage = rhTextView6;
        this.retirementRecyclerView = recyclerView3;
        this.retirementSection = linearLayout5;
        this.retirementSectionTitle = rhTextView7;
        this.stocksAndEtfsEmptyMessage = rhTextView8;
        this.stocksAndEtfsRecyclerView = recyclerView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckRecurringInvestmentsHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckRecurringInvestmentsHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25434R.layout.fragment_paycheck_recurring_investments_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckRecurringInvestmentsHubBinding bind(View view) {
        int i = C25434R.id.brokerage_cash_empty_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25434R.id.brokerage_cash_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C25434R.id.brokerage_cash_section;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C25434R.id.brokerage_cash_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25434R.id.create_new_paycheck_investment_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C25434R.id.crypto_empty_message;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C25434R.id.crypto_recycler_view;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView2 != null) {
                                    i = C25434R.id.crypto_section;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = C25434R.id.crypto_section_title;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C25434R.id.equities_section;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout3 != null) {
                                                i = C25434R.id.paycheck_recurring_investment_disclaimer;
                                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView5 != null) {
                                                    i = C25434R.id.paycheck_recurring_investments_active_count;
                                                    RdsSettingsRowView rdsSettingsRowView = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsSettingsRowView != null) {
                                                        i = C25434R.id.paycheck_recurring_investments_last_updated;
                                                        RdsSettingsRowView rdsSettingsRowView2 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsSettingsRowView2 != null) {
                                                            i = C25434R.id.paycheck_recurring_investments_paused_count;
                                                            RdsSettingsRowView rdsSettingsRowView3 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsSettingsRowView3 != null) {
                                                                i = C25434R.id.paycheck_recurring_investments_total_amount_invested;
                                                                RdsSettingsRowView rdsSettingsRowView4 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsSettingsRowView4 != null) {
                                                                    i = C25434R.id.retirement_empty_message;
                                                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView6 != null) {
                                                                        i = C25434R.id.retirement_recycler_view;
                                                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView3 != null) {
                                                                            i = C25434R.id.retirement_section;
                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout4 != null) {
                                                                                i = C25434R.id.retirement_section_title;
                                                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView7 != null) {
                                                                                    i = C25434R.id.stocks_and_etfs_empty_message;
                                                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhTextView8 != null) {
                                                                                        i = C25434R.id.stocks_and_etfs_recycler_view;
                                                                                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                        if (recyclerView4 != null) {
                                                                                            return new FragmentPaycheckRecurringInvestmentsHubBinding((LinearLayout) view, rhTextView, recyclerView, linearLayout, rhTextView2, rdsButton, rhTextView3, recyclerView2, linearLayout2, rhTextView4, linearLayout3, rhTextView5, rdsSettingsRowView, rdsSettingsRowView2, rdsSettingsRowView3, rdsSettingsRowView4, rhTextView6, recyclerView3, linearLayout4, rhTextView7, rhTextView8, recyclerView4);
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
