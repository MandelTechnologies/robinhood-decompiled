package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeInstrumentStrategiesViewBinding implements ViewBinding {
    public final Guideline fiftyPercentGuideline;
    public final Space optionsCardHeaderSpace;
    public final RhTextView optionsCashCollateralLabel;
    public final RhTextView optionsCashCollateralTxt;
    public final RhTextView optionsCashHeldForExercisesLabel;
    public final RhTextView optionsCashHeldForExercisesTxt;
    public final RhTextView optionsEquityValueLabel;
    public final RhTextView optionsEquityValueTxt;
    public final RhTextView optionsSharesHeldForExercisesLabel;
    public final RhTextView optionsSharesHeldForExercisesTxt;
    public final RhTextView optionsStockCollateralLabel;
    public final RhTextView optionsStockCollateralTxt;
    public final RhTextView optionsTodaysReturnLabel;
    public final RhTextView optionsTodaysReturnTxt;
    public final RhTextView optionsTotalContractsLabel;
    public final RhTextView optionsTotalContractsTxt;
    public final RhTextView optionsTotalReturnLabel;
    public final RhTextView optionsTotalReturnTxt;
    private final View rootView;

    private MergeInstrumentStrategiesViewBinding(View view, Guideline guideline, Space space, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11, RhTextView rhTextView12, RhTextView rhTextView13, RhTextView rhTextView14, RhTextView rhTextView15, RhTextView rhTextView16) {
        this.rootView = view;
        this.fiftyPercentGuideline = guideline;
        this.optionsCardHeaderSpace = space;
        this.optionsCashCollateralLabel = rhTextView;
        this.optionsCashCollateralTxt = rhTextView2;
        this.optionsCashHeldForExercisesLabel = rhTextView3;
        this.optionsCashHeldForExercisesTxt = rhTextView4;
        this.optionsEquityValueLabel = rhTextView5;
        this.optionsEquityValueTxt = rhTextView6;
        this.optionsSharesHeldForExercisesLabel = rhTextView7;
        this.optionsSharesHeldForExercisesTxt = rhTextView8;
        this.optionsStockCollateralLabel = rhTextView9;
        this.optionsStockCollateralTxt = rhTextView10;
        this.optionsTodaysReturnLabel = rhTextView11;
        this.optionsTodaysReturnTxt = rhTextView12;
        this.optionsTotalContractsLabel = rhTextView13;
        this.optionsTotalContractsTxt = rhTextView14;
        this.optionsTotalReturnLabel = rhTextView15;
        this.optionsTotalReturnTxt = rhTextView16;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeInstrumentStrategiesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_instrument_strategies_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeInstrumentStrategiesViewBinding bind(View view) {
        int i = C15314R.id.fifty_percent_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C15314R.id.options_card_header_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C15314R.id.options_cash_collateral_label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C15314R.id.options_cash_collateral_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C15314R.id.options_cash_held_for_exercises_label;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C15314R.id.options_cash_held_for_exercises_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C15314R.id.options_equity_value_label;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C15314R.id.options_equity_value_txt;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C15314R.id.options_shares_held_for_exercises_label;
                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView7 != null) {
                                            i = C15314R.id.options_shares_held_for_exercises_txt;
                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView8 != null) {
                                                i = C15314R.id.options_stock_collateral_label;
                                                RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView9 != null) {
                                                    i = C15314R.id.options_stock_collateral_txt;
                                                    RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView10 != null) {
                                                        i = C15314R.id.options_todays_return_label;
                                                        RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView11 != null) {
                                                            i = C15314R.id.options_todays_return_txt;
                                                            RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView12 != null) {
                                                                i = C15314R.id.options_total_contracts_label;
                                                                RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView13 != null) {
                                                                    i = C15314R.id.options_total_contracts_txt;
                                                                    RhTextView rhTextView14 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView14 != null) {
                                                                        i = C15314R.id.options_total_return_label;
                                                                        RhTextView rhTextView15 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView15 != null) {
                                                                            i = C15314R.id.options_total_return_txt;
                                                                            RhTextView rhTextView16 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView16 != null) {
                                                                                return new MergeInstrumentStrategiesViewBinding(view, guideline, space, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rhTextView9, rhTextView10, rhTextView11, rhTextView12, rhTextView13, rhTextView14, rhTextView15, rhTextView16);
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
