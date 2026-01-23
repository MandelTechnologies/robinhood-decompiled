package com.robinhood.android.options.statistics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.options.statistics.C23799R;

/* loaded from: classes11.dex */
public final class MergeOptionStrategyStatisticsViewBinding implements ViewBinding {
    public final RdsDataRowView changeOfProfitRow;
    public final RdsDataRowView dailyHighRow;
    public final RdsDataRowView dailyLowRow;
    public final RdsDataRowView impliedVolatilityRow;
    public final RdsDataRowView lastTradeRow;
    public final RdsDataRowView markRow;
    public final RdsDataRowView openInterestRow;
    public final RdsDataRowView previousCloseRow;
    private final View rootView;
    public final RdsDataRowView volumeRow;

    private MergeOptionStrategyStatisticsViewBinding(View view, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8, RdsDataRowView rdsDataRowView9) {
        this.rootView = view;
        this.changeOfProfitRow = rdsDataRowView;
        this.dailyHighRow = rdsDataRowView2;
        this.dailyLowRow = rdsDataRowView3;
        this.impliedVolatilityRow = rdsDataRowView4;
        this.lastTradeRow = rdsDataRowView5;
        this.markRow = rdsDataRowView6;
        this.openInterestRow = rdsDataRowView7;
        this.previousCloseRow = rdsDataRowView8;
        this.volumeRow = rdsDataRowView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyStatisticsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C23799R.layout.merge_option_strategy_statistics_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionStrategyStatisticsViewBinding bind(View view) {
        int i = C23799R.id.change_of_profit_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C23799R.id.daily_high_row;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C23799R.id.daily_low_row;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C23799R.id.implied_volatility_row;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C23799R.id.last_trade_row;
                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView5 != null) {
                            i = C23799R.id.mark_row;
                            RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView6 != null) {
                                i = C23799R.id.open_interest_row;
                                RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView7 != null) {
                                    i = C23799R.id.previous_close_row;
                                    RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView8 != null) {
                                        i = C23799R.id.volume_row;
                                        RdsDataRowView rdsDataRowView9 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView9 != null) {
                                            return new MergeOptionStrategyStatisticsViewBinding(view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7, rdsDataRowView8, rdsDataRowView9);
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
