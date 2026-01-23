package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowRecurringBinding implements ViewBinding {
    public final RdsRowView accountTypeRow;
    public final RdsRowView amountRow;
    public final RdsRowView backupPaymentMethodRow;
    public final LinearLayout dataRows;
    public final RhTextView disclaimer;
    public final RdsTextButton expandBtn;
    public final LinearLayout footerContent;
    public final RdsRowView frequencyRow;
    public final RhTextView investFlowRecurringTitleTxt;
    public final RhTextView orderSummaryDescription;
    public final RhTextView orderSummaryTitle;
    public final RdsRowView paymentMethodRow;
    public final RecyclerView recyclerView;
    public final RhTextView retirementSubtitle;
    public final RdsButton reviewButton;
    private final ConstraintLayout rootView;
    public final View rowBottomDivider;
    public final ScrollView scrollView;
    public final Space space;
    public final RdsRowView startDateRow;
    public final RhTextView totalLabelTxt;
    public final ConstraintLayout totalRowContainer;
    public final RhTextView totalValueTxt;

    private FragmentInvestFlowRecurringBinding(ConstraintLayout constraintLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, LinearLayout linearLayout, RhTextView rhTextView, RdsTextButton rdsTextButton, LinearLayout linearLayout2, RdsRowView rdsRowView4, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RdsRowView rdsRowView5, RecyclerView recyclerView, RhTextView rhTextView5, RdsButton rdsButton, View view, ScrollView scrollView, Space space, RdsRowView rdsRowView6, RhTextView rhTextView6, ConstraintLayout constraintLayout2, RhTextView rhTextView7) {
        this.rootView = constraintLayout;
        this.accountTypeRow = rdsRowView;
        this.amountRow = rdsRowView2;
        this.backupPaymentMethodRow = rdsRowView3;
        this.dataRows = linearLayout;
        this.disclaimer = rhTextView;
        this.expandBtn = rdsTextButton;
        this.footerContent = linearLayout2;
        this.frequencyRow = rdsRowView4;
        this.investFlowRecurringTitleTxt = rhTextView2;
        this.orderSummaryDescription = rhTextView3;
        this.orderSummaryTitle = rhTextView4;
        this.paymentMethodRow = rdsRowView5;
        this.recyclerView = recyclerView;
        this.retirementSubtitle = rhTextView5;
        this.reviewButton = rdsButton;
        this.rowBottomDivider = view;
        this.scrollView = scrollView;
        this.space = space;
        this.startDateRow = rdsRowView6;
        this.totalLabelTxt = rhTextView6;
        this.totalRowContainer = constraintLayout2;
        this.totalValueTxt = rhTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowRecurringBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowRecurringBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_recurring, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowRecurringBinding bind(View view) {
        View viewFindChildViewById;
        int i = C19349R.id.account_type_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C19349R.id.amount_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C19349R.id.backup_payment_method_row;
                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView3 != null) {
                    i = C19349R.id.data_rows;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C19349R.id.disclaimer;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C19349R.id.expand_btn;
                            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                            if (rdsTextButton != null) {
                                i = C19349R.id.footer_content;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C19349R.id.frequency_row;
                                    RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsRowView4 != null) {
                                        i = C19349R.id.invest_flow_recurring_title_txt;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C19349R.id.order_summary_description;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C19349R.id.order_summary_title;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    i = C19349R.id.payment_method_row;
                                                    RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsRowView5 != null) {
                                                        i = C19349R.id.recycler_view;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = C19349R.id.retirement_subtitle;
                                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView5 != null) {
                                                                i = C19349R.id.review_button;
                                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                if (rdsButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C19349R.id.row_bottom_divider))) != null) {
                                                                    i = C19349R.id.scroll_view;
                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                    if (scrollView != null) {
                                                                        i = C19349R.id.space;
                                                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                                        if (space != null) {
                                                                            i = C19349R.id.start_date_row;
                                                                            RdsRowView rdsRowView6 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsRowView6 != null) {
                                                                                i = C19349R.id.total_label_txt;
                                                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView6 != null) {
                                                                                    i = C19349R.id.total_row_container;
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (constraintLayout != null) {
                                                                                        i = C19349R.id.total_value_txt;
                                                                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhTextView7 != null) {
                                                                                            return new FragmentInvestFlowRecurringBinding((ConstraintLayout) view, rdsRowView, rdsRowView2, rdsRowView3, linearLayout, rhTextView, rdsTextButton, linearLayout2, rdsRowView4, rhTextView2, rhTextView3, rhTextView4, rdsRowView5, recyclerView, rhTextView5, rdsButton, viewFindChildViewById, scrollView, space, rdsRowView6, rhTextView6, constraintLayout, rhTextView7);
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
