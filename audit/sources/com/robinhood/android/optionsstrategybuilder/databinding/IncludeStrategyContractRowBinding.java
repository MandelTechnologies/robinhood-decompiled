package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView;

/* loaded from: classes11.dex */
public final class IncludeStrategyContractRowBinding implements ViewBinding {
    public final Barrier dataRowBarrier;
    public final RhTextView dataRowViewTitle1;
    public final RhTextView dataRowViewTitle2;
    public final RhTextView dataRowViewValue1;
    public final RhTextView dataRowViewValue2;
    public final View optionContractBottomDivider;
    public final Space optionContractBottomSpace;
    public final RhTextView optionContractMessageTxt;
    public final RhTextView optionContractPriceDeltaTxt;
    public final AnimatedRhTextView optionContractPriceTxt;
    public final RhTextView optionContractStrikePriceTxt;
    public final RhTextView optionStrategyPositionIndicator;
    public final Barrier priceBarrier;
    private final OptionStrategyRowView rootView;

    private IncludeStrategyContractRowBinding(OptionStrategyRowView optionStrategyRowView, Barrier barrier, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, View view, Space space, RhTextView rhTextView5, RhTextView rhTextView6, AnimatedRhTextView animatedRhTextView, RhTextView rhTextView7, RhTextView rhTextView8, Barrier barrier2) {
        this.rootView = optionStrategyRowView;
        this.dataRowBarrier = barrier;
        this.dataRowViewTitle1 = rhTextView;
        this.dataRowViewTitle2 = rhTextView2;
        this.dataRowViewValue1 = rhTextView3;
        this.dataRowViewValue2 = rhTextView4;
        this.optionContractBottomDivider = view;
        this.optionContractBottomSpace = space;
        this.optionContractMessageTxt = rhTextView5;
        this.optionContractPriceDeltaTxt = rhTextView6;
        this.optionContractPriceTxt = animatedRhTextView;
        this.optionContractStrikePriceTxt = rhTextView7;
        this.optionStrategyPositionIndicator = rhTextView8;
        this.priceBarrier = barrier2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionStrategyRowView getRoot() {
        return this.rootView;
    }

    public static IncludeStrategyContractRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeStrategyContractRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.include_strategy_contract_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeStrategyContractRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C24876R.id.data_row_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C24876R.id.data_row_view_title_1;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24876R.id.data_row_view_title_2;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C24876R.id.data_row_view_value_1;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C24876R.id.data_row_view_value_2;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24876R.id.option_contract_bottom_divider))) != null) {
                            i = C24876R.id.option_contract_bottom_space;
                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                            if (space != null) {
                                i = C24876R.id.option_contract_message_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C24876R.id.option_contract_price_delta_txt;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C24876R.id.option_contract_price_txt;
                                        AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                                        if (animatedRhTextView != null) {
                                            i = C24876R.id.option_contract_strike_price_txt;
                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView7 != null) {
                                                i = C24876R.id.option_strategy_position_indicator;
                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView8 != null) {
                                                    i = C24876R.id.price_barrier;
                                                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                    if (barrier2 != null) {
                                                        return new IncludeStrategyContractRowBinding((OptionStrategyRowView) view, barrier, rhTextView, rhTextView2, rhTextView3, rhTextView4, viewFindChildViewById, space, rhTextView5, rhTextView6, animatedRhTextView, rhTextView7, rhTextView8, barrier2);
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
