package com.robinhood.android.optionsrolling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsrolling.C24772R;

/* loaded from: classes11.dex */
public final class MergeRollingStatsViewBinding implements ViewBinding {
    public final Space bottomMargin;
    public final RhTextView cursedSpacer;
    public final ConstraintLayout optionsRollingDataSubtitle;
    public final RhTextView optionsRollingNetCost;
    public final RhTextView optionsRollingNetCostTitle;
    public final TextView optionsRollingSelectContractSubtitle;
    public final RhTextView optionsRollingTimeIncrease;
    public final RhTextView optionsRollingTimeIncreaseTitle;
    public final RhTextView optionsRollingTotalCostTitle;
    public final RhTextView optionsRollingTotalCredit;
    private final View rootView;

    private MergeRollingStatsViewBinding(View view, Space space, RhTextView rhTextView, ConstraintLayout constraintLayout, RhTextView rhTextView2, RhTextView rhTextView3, TextView textView, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7) {
        this.rootView = view;
        this.bottomMargin = space;
        this.cursedSpacer = rhTextView;
        this.optionsRollingDataSubtitle = constraintLayout;
        this.optionsRollingNetCost = rhTextView2;
        this.optionsRollingNetCostTitle = rhTextView3;
        this.optionsRollingSelectContractSubtitle = textView;
        this.optionsRollingTimeIncrease = rhTextView4;
        this.optionsRollingTimeIncreaseTitle = rhTextView5;
        this.optionsRollingTotalCostTitle = rhTextView6;
        this.optionsRollingTotalCredit = rhTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRollingStatsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24772R.layout.merge_rolling_stats_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRollingStatsViewBinding bind(View view) {
        int i = C24772R.id.bottom_margin;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C24772R.id.cursed_spacer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24772R.id.options_rolling_data_subtitle;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C24772R.id.options_rolling_net_cost;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C24772R.id.options_rolling_net_cost_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C24772R.id.options_rolling_select_contract_subtitle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C24772R.id.options_rolling_time_increase;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    i = C24772R.id.options_rolling_time_increase_title;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C24772R.id.options_rolling_total_cost_title;
                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView6 != null) {
                                            i = C24772R.id.options_rolling_total_credit;
                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView7 != null) {
                                                return new MergeRollingStatsViewBinding(view, space, rhTextView, constraintLayout, rhTextView2, rhTextView3, textView, rhTextView4, rhTextView5, rhTextView6, rhTextView7);
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
