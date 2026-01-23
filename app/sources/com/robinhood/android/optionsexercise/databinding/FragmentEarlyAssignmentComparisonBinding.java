package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentEarlyAssignmentComparisonBinding implements ViewBinding {
    public final LinearLayout earlyAssignmentComparisonBuyUnderlyingCons;
    public final RhTextView earlyAssignmentComparisonDescription;
    public final RhTextView earlyAssignmentComparisonSellUnderlyingCons;
    public final RhTextView earlyAssignmentComparisonSubtitle;
    public final RhTextView earlyAssignmentComparisonTitle;
    public final RhTextView earlyAssignmentComparisonTradeUnderlyingDetail;
    public final RhTextView earlyAssignmentComparisonTradeUnderlyingHeader;
    private final ScrollView rootView;

    private FragmentEarlyAssignmentComparisonBinding(ScrollView scrollView, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = scrollView;
        this.earlyAssignmentComparisonBuyUnderlyingCons = linearLayout;
        this.earlyAssignmentComparisonDescription = rhTextView;
        this.earlyAssignmentComparisonSellUnderlyingCons = rhTextView2;
        this.earlyAssignmentComparisonSubtitle = rhTextView3;
        this.earlyAssignmentComparisonTitle = rhTextView4;
        this.earlyAssignmentComparisonTradeUnderlyingDetail = rhTextView5;
        this.earlyAssignmentComparisonTradeUnderlyingHeader = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentEarlyAssignmentComparisonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEarlyAssignmentComparisonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_early_assignment_comparison, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEarlyAssignmentComparisonBinding bind(View view) {
        int i = C24704R.id.early_assignment_comparison_buy_underlying_cons;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C24704R.id.early_assignment_comparison_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24704R.id.early_assignment_comparison_sell_underlying_cons;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C24704R.id.early_assignment_comparison_subtitle;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C24704R.id.early_assignment_comparison_title;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C24704R.id.early_assignment_comparison_trade_underlying_detail;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                i = C24704R.id.early_assignment_comparison_trade_underlying_header;
                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView6 != null) {
                                    return new FragmentEarlyAssignmentComparisonBinding((ScrollView) view, linearLayout, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6);
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
