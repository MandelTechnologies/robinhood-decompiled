package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.intro.RecurringInvestmentGraphColumnView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRecurringInvestmentGraphLayoutBinding implements ViewBinding {
    public final RhTextView amountText;
    public final RecurringInvestmentGraphColumnView columnOneMonth;
    public final RecurringInvestmentGraphColumnView columnOneYear;
    public final RecurringInvestmentGraphColumnView columnTenYears;
    public final RecurringInvestmentGraphColumnView columnTwentyYears;
    public final RhTextView frequencyButton;
    private final View rootView;
    public final AppCompatSeekBar seekBar;
    public final Guideline verticalGuidelineCenter;

    private MergeRecurringInvestmentGraphLayoutBinding(View view, RhTextView rhTextView, RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView, RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView2, RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView3, RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView4, RhTextView rhTextView2, AppCompatSeekBar appCompatSeekBar, Guideline guideline) {
        this.rootView = view;
        this.amountText = rhTextView;
        this.columnOneMonth = recurringInvestmentGraphColumnView;
        this.columnOneYear = recurringInvestmentGraphColumnView2;
        this.columnTenYears = recurringInvestmentGraphColumnView3;
        this.columnTwentyYears = recurringInvestmentGraphColumnView4;
        this.frequencyButton = rhTextView2;
        this.seekBar = appCompatSeekBar;
        this.verticalGuidelineCenter = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecurringInvestmentGraphLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11595R.layout.merge_recurring_investment_graph_layout, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecurringInvestmentGraphLayoutBinding bind(View view) {
        int i = C11595R.id.amount_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11595R.id.column_one_month;
            RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView = (RecurringInvestmentGraphColumnView) ViewBindings.findChildViewById(view, i);
            if (recurringInvestmentGraphColumnView != null) {
                i = C11595R.id.column_one_year;
                RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView2 = (RecurringInvestmentGraphColumnView) ViewBindings.findChildViewById(view, i);
                if (recurringInvestmentGraphColumnView2 != null) {
                    i = C11595R.id.column_ten_years;
                    RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView3 = (RecurringInvestmentGraphColumnView) ViewBindings.findChildViewById(view, i);
                    if (recurringInvestmentGraphColumnView3 != null) {
                        i = C11595R.id.column_twenty_years;
                        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView4 = (RecurringInvestmentGraphColumnView) ViewBindings.findChildViewById(view, i);
                        if (recurringInvestmentGraphColumnView4 != null) {
                            i = C11595R.id.frequency_button;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C11595R.id.seekBar;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                                if (appCompatSeekBar != null) {
                                    i = C11595R.id.vertical_guideline_center;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline != null) {
                                        return new MergeRecurringInvestmentGraphLayoutBinding(view, rhTextView, recurringInvestmentGraphColumnView, recurringInvestmentGraphColumnView2, recurringInvestmentGraphColumnView3, recurringInvestmentGraphColumnView4, rhTextView2, appCompatSeekBar, guideline);
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
