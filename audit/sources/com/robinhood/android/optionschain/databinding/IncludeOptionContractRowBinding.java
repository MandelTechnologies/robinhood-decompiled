package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionContractRowView;

/* loaded from: classes11.dex */
public final class IncludeOptionContractRowBinding implements ViewBinding {
    public final AppCompatImageView addedToWatchlistCheck;
    public final View optionContractBottomDivider;
    public final Space optionContractBottomSpace;
    public final RhTextView optionContractMessageTxt;
    public final RdsDataRowView optionContractMetricOneTxt;
    public final RdsDataRowView optionContractMetricTwoTxt;
    public final AppCompatImageView optionContractPlusBtn;
    public final RhTextView optionContractPositionCountTxt;
    public final RhTextView optionContractPriceDeltaTxt;
    public final AnimatedRhTextView optionContractPriceTxt;
    public final RhTextView optionContractStrikePriceTxt;
    private final OptionContractRowView rootView;

    private IncludeOptionContractRowBinding(OptionContractRowView optionContractRowView, AppCompatImageView appCompatImageView, View view, Space space, RhTextView rhTextView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, AppCompatImageView appCompatImageView2, RhTextView rhTextView2, RhTextView rhTextView3, AnimatedRhTextView animatedRhTextView, RhTextView rhTextView4) {
        this.rootView = optionContractRowView;
        this.addedToWatchlistCheck = appCompatImageView;
        this.optionContractBottomDivider = view;
        this.optionContractBottomSpace = space;
        this.optionContractMessageTxt = rhTextView;
        this.optionContractMetricOneTxt = rdsDataRowView;
        this.optionContractMetricTwoTxt = rdsDataRowView2;
        this.optionContractPlusBtn = appCompatImageView2;
        this.optionContractPositionCountTxt = rhTextView2;
        this.optionContractPriceDeltaTxt = rhTextView3;
        this.optionContractPriceTxt = animatedRhTextView;
        this.optionContractStrikePriceTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionContractRowView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionContractRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionContractRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_contract_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionContractRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C24135R.id.added_to_watchlist_check;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24135R.id.option_contract_bottom_divider))) != null) {
            i = C24135R.id.option_contract_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C24135R.id.option_contract_message_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C24135R.id.option_contract_metric_one_txt;
                    RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView != null) {
                        i = C24135R.id.option_contract_metric_two_txt;
                        RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView2 != null) {
                            i = C24135R.id.option_contract_plus_btn;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = C24135R.id.option_contract_position_count_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C24135R.id.option_contract_price_delta_txt;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C24135R.id.option_contract_price_txt;
                                        AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                                        if (animatedRhTextView != null) {
                                            i = C24135R.id.option_contract_strike_price_txt;
                                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView4 != null) {
                                                return new IncludeOptionContractRowBinding((OptionContractRowView) view, appCompatImageView, viewFindChildViewById, space, rhTextView, rdsDataRowView, rdsDataRowView2, appCompatImageView2, rhTextView2, rhTextView3, animatedRhTextView, rhTextView4);
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
