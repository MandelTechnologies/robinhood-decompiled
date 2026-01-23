package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.OptionOrderAfterHoursDisclosureComposeView;
import com.robinhood.android.trade.options.OptionOrderLimitPriceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderQuantityRowComposeView;
import com.robinhood.android.trade.options.OptionOrderStopTriggerPriceRowView;
import com.robinhood.android.trade.options.OptionOrderTimeInForceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderTotalCostRowComposeView;
import com.robinhood.android.trade.options.OptionOrderTradingSessionRowComposeView;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView;

/* loaded from: classes9.dex */
public final class MergeOptionOrderBinding implements ViewBinding {
    public final View accountDivider;
    public final LinearLayout accountGroup;
    public final Group collateralGroup;
    public final View contractDivider;
    public final View costDivider;
    public final View marketPriceDivider;
    public final RhTextView optionOrderAccountLabel;
    public final OptionOrderBidAskBarComposeView optionOrderBidAskBar;
    public final Barrier optionOrderBidAskRowBottomBarrier;
    public final RhTextView optionOrderBidAskSingleLegTxt;
    public final RhTextView optionOrderBidAskTxt;
    public final RhTextView optionOrderContractSubtitleLabel;
    public final RhTextView optionOrderContractsLabel;
    public final OptionOrderAfterHoursDisclosureComposeView optionOrderFragmentAfterHoursDisclosureComposeView;
    public final RhTextView optionOrderFragmentCollateralLabel;
    public final RhTextView optionOrderFragmentCollateralTxt;
    public final RhEditText optionOrderFragmentContractsEdt;
    public final LinearLayout optionOrderFragmentMultilegSummaryContainer;
    public final RhTextView optionOrderFragmentReleasedCollateralLabel;
    public final RhTextView optionOrderFragmentReleasedCollateralTxt;
    public final RhTextView optionOrderFragmentSinglelegSummaryBody;
    public final RhMoneyInputView optionOrderFragmentStopPriceInputview;
    public final OptionOrderLimitPriceRowComposeView optionOrderLimitPriceComposeData;
    public final ConstraintLayout optionOrderLimitPriceData;
    public final RhMoneyInputView optionOrderLimitPriceInput;
    public final LinearLayout optionOrderLimitPriceRow;
    public final Barrier optionOrderLimitPriceRowBottomBarrier;
    public final OptionOrderMarketPriceRowComposeView optionOrderMarketPriceRow;
    public final RdsInfoTag optionOrderMarketabilityInfoTag;
    public final Space optionOrderPriceDividerTopPlaceholder;
    public final RhTextView optionOrderPriceLabel;
    public final OptionOrderQuantityRowComposeView optionOrderQuantityComposeRowData;
    public final LinearLayout optionOrderQuantityRow;
    public final ConstraintLayout optionOrderQuantityRowData;
    public final RhTextView optionOrderSelectedAccountSubtitle;
    public final RhTextView optionOrderSelectedAccountTitle;
    public final RhTextView optionOrderStopPriceLabel;
    public final LinearLayout optionOrderStopPriceRow;
    public final OptionOrderStopTriggerPriceRowView optionOrderStopTriggerPriceRow;
    public final Barrier optionOrderSummaryBarrier;
    public final OptionOrderTimeInForceRowComposeView optionOrderTimeInForceRow;
    public final OptionOrderTotalCostRowComposeView optionOrderTotalCostRow;
    public final OptionOrderTradingSessionRowComposeView optionOrderTradingSessionRow;
    public final View priceDivider;
    public final View releasedCollateralDivider;
    public final Group releasedCollateralGroup;
    private final View rootView;
    public final Group stopLimitPriceGroup;
    public final View stopPriceDivider;
    public final View stopTriggerPriceDivider;
    public final View timeInForceDivider;
    public final View tradingSessionDivider;

    private MergeOptionOrderBinding(View view, View view2, LinearLayout linearLayout, Group group, View view3, View view4, View view5, RhTextView rhTextView, OptionOrderBidAskBarComposeView optionOrderBidAskBarComposeView, Barrier barrier, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, OptionOrderAfterHoursDisclosureComposeView optionOrderAfterHoursDisclosureComposeView, RhTextView rhTextView6, RhTextView rhTextView7, RhEditText rhEditText, LinearLayout linearLayout2, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhMoneyInputView rhMoneyInputView, OptionOrderLimitPriceRowComposeView optionOrderLimitPriceRowComposeView, ConstraintLayout constraintLayout, RhMoneyInputView rhMoneyInputView2, LinearLayout linearLayout3, Barrier barrier2, OptionOrderMarketPriceRowComposeView optionOrderMarketPriceRowComposeView, RdsInfoTag rdsInfoTag, Space space, RhTextView rhTextView11, OptionOrderQuantityRowComposeView optionOrderQuantityRowComposeView, LinearLayout linearLayout4, ConstraintLayout constraintLayout2, RhTextView rhTextView12, RhTextView rhTextView13, RhTextView rhTextView14, LinearLayout linearLayout5, OptionOrderStopTriggerPriceRowView optionOrderStopTriggerPriceRowView, Barrier barrier3, OptionOrderTimeInForceRowComposeView optionOrderTimeInForceRowComposeView, OptionOrderTotalCostRowComposeView optionOrderTotalCostRowComposeView, OptionOrderTradingSessionRowComposeView optionOrderTradingSessionRowComposeView, View view6, View view7, Group group2, Group group3, View view8, View view9, View view10, View view11) {
        this.rootView = view;
        this.accountDivider = view2;
        this.accountGroup = linearLayout;
        this.collateralGroup = group;
        this.contractDivider = view3;
        this.costDivider = view4;
        this.marketPriceDivider = view5;
        this.optionOrderAccountLabel = rhTextView;
        this.optionOrderBidAskBar = optionOrderBidAskBarComposeView;
        this.optionOrderBidAskRowBottomBarrier = barrier;
        this.optionOrderBidAskSingleLegTxt = rhTextView2;
        this.optionOrderBidAskTxt = rhTextView3;
        this.optionOrderContractSubtitleLabel = rhTextView4;
        this.optionOrderContractsLabel = rhTextView5;
        this.optionOrderFragmentAfterHoursDisclosureComposeView = optionOrderAfterHoursDisclosureComposeView;
        this.optionOrderFragmentCollateralLabel = rhTextView6;
        this.optionOrderFragmentCollateralTxt = rhTextView7;
        this.optionOrderFragmentContractsEdt = rhEditText;
        this.optionOrderFragmentMultilegSummaryContainer = linearLayout2;
        this.optionOrderFragmentReleasedCollateralLabel = rhTextView8;
        this.optionOrderFragmentReleasedCollateralTxt = rhTextView9;
        this.optionOrderFragmentSinglelegSummaryBody = rhTextView10;
        this.optionOrderFragmentStopPriceInputview = rhMoneyInputView;
        this.optionOrderLimitPriceComposeData = optionOrderLimitPriceRowComposeView;
        this.optionOrderLimitPriceData = constraintLayout;
        this.optionOrderLimitPriceInput = rhMoneyInputView2;
        this.optionOrderLimitPriceRow = linearLayout3;
        this.optionOrderLimitPriceRowBottomBarrier = barrier2;
        this.optionOrderMarketPriceRow = optionOrderMarketPriceRowComposeView;
        this.optionOrderMarketabilityInfoTag = rdsInfoTag;
        this.optionOrderPriceDividerTopPlaceholder = space;
        this.optionOrderPriceLabel = rhTextView11;
        this.optionOrderQuantityComposeRowData = optionOrderQuantityRowComposeView;
        this.optionOrderQuantityRow = linearLayout4;
        this.optionOrderQuantityRowData = constraintLayout2;
        this.optionOrderSelectedAccountSubtitle = rhTextView12;
        this.optionOrderSelectedAccountTitle = rhTextView13;
        this.optionOrderStopPriceLabel = rhTextView14;
        this.optionOrderStopPriceRow = linearLayout5;
        this.optionOrderStopTriggerPriceRow = optionOrderStopTriggerPriceRowView;
        this.optionOrderSummaryBarrier = barrier3;
        this.optionOrderTimeInForceRow = optionOrderTimeInForceRowComposeView;
        this.optionOrderTotalCostRow = optionOrderTotalCostRowComposeView;
        this.optionOrderTradingSessionRow = optionOrderTradingSessionRowComposeView;
        this.priceDivider = view6;
        this.releasedCollateralDivider = view7;
        this.releasedCollateralGroup = group2;
        this.stopLimitPriceGroup = group3;
        this.stopPriceDivider = view8;
        this.stopTriggerPriceDivider = view9;
        this.timeInForceDivider = view10;
        this.tradingSessionDivider = view11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29757R.layout.merge_option_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionOrderBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        View viewFindChildViewById9;
        int i = C29757R.id.account_divider;
        View viewFindChildViewById10 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById10 != null) {
            i = C29757R.id.account_group;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C29757R.id.collateral_group;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29757R.id.contract_divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C29757R.id.cost_divider))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C29757R.id.market_price_divider))) != null) {
                    i = C29757R.id.option_order_account_label;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C29757R.id.option_order_bid_ask_bar;
                        OptionOrderBidAskBarComposeView optionOrderBidAskBarComposeView = (OptionOrderBidAskBarComposeView) ViewBindings.findChildViewById(view, i);
                        if (optionOrderBidAskBarComposeView != null) {
                            i = C29757R.id.option_order_bid_ask_row_bottom_barrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier != null) {
                                i = C29757R.id.option_order_bid_ask_single_leg_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C29757R.id.option_order_bid_ask_txt;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C29757R.id.option_order_contract_subtitle_label;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C29757R.id.option_order_contracts_label;
                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView5 != null) {
                                                i = C29757R.id.option_order_fragment_after_hours_disclosure_compose_view;
                                                OptionOrderAfterHoursDisclosureComposeView optionOrderAfterHoursDisclosureComposeView = (OptionOrderAfterHoursDisclosureComposeView) ViewBindings.findChildViewById(view, i);
                                                if (optionOrderAfterHoursDisclosureComposeView != null) {
                                                    i = C29757R.id.option_order_fragment_collateral_label;
                                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView6 != null) {
                                                        i = C29757R.id.option_order_fragment_collateral_txt;
                                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView7 != null) {
                                                            i = C29757R.id.option_order_fragment_contracts_edt;
                                                            RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                                            if (rhEditText != null) {
                                                                i = C29757R.id.option_order_fragment_multileg_summary_container;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout2 != null) {
                                                                    i = C29757R.id.option_order_fragment_released_collateral_label;
                                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView8 != null) {
                                                                        i = C29757R.id.option_order_fragment_released_collateral_txt;
                                                                        RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView9 != null) {
                                                                            i = C29757R.id.option_order_fragment_singleleg_summary_body;
                                                                            RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView10 != null) {
                                                                                i = C29757R.id.option_order_fragment_stop_price_inputview;
                                                                                RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhMoneyInputView != null) {
                                                                                    i = C29757R.id.option_order_limit_price_compose_data;
                                                                                    OptionOrderLimitPriceRowComposeView optionOrderLimitPriceRowComposeView = (OptionOrderLimitPriceRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                    if (optionOrderLimitPriceRowComposeView != null) {
                                                                                        i = C29757R.id.option_order_limit_price_data;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (constraintLayout != null) {
                                                                                            i = C29757R.id.option_order_limit_price_input;
                                                                                            RhMoneyInputView rhMoneyInputView2 = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rhMoneyInputView2 != null) {
                                                                                                i = C29757R.id.option_order_limit_price_row;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i = C29757R.id.option_order_limit_price_row_bottom_barrier;
                                                                                                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                                    if (barrier2 != null) {
                                                                                                        i = C29757R.id.option_order_market_price_row;
                                                                                                        OptionOrderMarketPriceRowComposeView optionOrderMarketPriceRowComposeView = (OptionOrderMarketPriceRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (optionOrderMarketPriceRowComposeView != null) {
                                                                                                            i = C29757R.id.option_order_marketability_info_tag;
                                                                                                            RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                                                                                                            if (rdsInfoTag != null) {
                                                                                                                i = C29757R.id.option_order_price_divider_top_placeholder;
                                                                                                                Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                                if (space != null) {
                                                                                                                    i = C29757R.id.option_order_price_label;
                                                                                                                    RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (rhTextView11 != null) {
                                                                                                                        i = C29757R.id.option_order_quantity_compose_row_data;
                                                                                                                        OptionOrderQuantityRowComposeView optionOrderQuantityRowComposeView = (OptionOrderQuantityRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (optionOrderQuantityRowComposeView != null) {
                                                                                                                            i = C29757R.id.option_order_quantity_row;
                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                i = C29757R.id.option_order_quantity_row_data;
                                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (constraintLayout2 != null) {
                                                                                                                                    i = C29757R.id.option_order_selected_account_subtitle;
                                                                                                                                    RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (rhTextView12 != null) {
                                                                                                                                        i = C29757R.id.option_order_selected_account_title;
                                                                                                                                        RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (rhTextView13 != null) {
                                                                                                                                            i = C29757R.id.option_order_stop_price_label;
                                                                                                                                            RhTextView rhTextView14 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (rhTextView14 != null) {
                                                                                                                                                i = C29757R.id.option_order_stop_price_row;
                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                    i = C29757R.id.option_order_stop_trigger_price_row;
                                                                                                                                                    OptionOrderStopTriggerPriceRowView optionOrderStopTriggerPriceRowView = (OptionOrderStopTriggerPriceRowView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (optionOrderStopTriggerPriceRowView != null) {
                                                                                                                                                        i = C29757R.id.option_order_summary_barrier;
                                                                                                                                                        Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (barrier3 != null) {
                                                                                                                                                            i = C29757R.id.option_order_time_in_force_row;
                                                                                                                                                            OptionOrderTimeInForceRowComposeView optionOrderTimeInForceRowComposeView = (OptionOrderTimeInForceRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (optionOrderTimeInForceRowComposeView != null) {
                                                                                                                                                                i = C29757R.id.option_order_total_cost_row;
                                                                                                                                                                OptionOrderTotalCostRowComposeView optionOrderTotalCostRowComposeView = (OptionOrderTotalCostRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (optionOrderTotalCostRowComposeView != null) {
                                                                                                                                                                    i = C29757R.id.option_order_trading_session_row;
                                                                                                                                                                    OptionOrderTradingSessionRowComposeView optionOrderTradingSessionRowComposeView = (OptionOrderTradingSessionRowComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (optionOrderTradingSessionRowComposeView != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C29757R.id.price_divider))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C29757R.id.released_collateral_divider))) != null) {
                                                                                                                                                                        i = C29757R.id.released_collateral_group;
                                                                                                                                                                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (group2 != null) {
                                                                                                                                                                            i = C29757R.id.stop_limit_price_group;
                                                                                                                                                                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (group3 != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C29757R.id.stop_price_divider))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C29757R.id.stop_trigger_price_divider))) != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C29757R.id.time_in_force_divider))) != null && (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i = C29757R.id.trading_session_divider))) != null) {
                                                                                                                                                                                return new MergeOptionOrderBinding(view, viewFindChildViewById10, linearLayout, group, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, rhTextView, optionOrderBidAskBarComposeView, barrier, rhTextView2, rhTextView3, rhTextView4, rhTextView5, optionOrderAfterHoursDisclosureComposeView, rhTextView6, rhTextView7, rhEditText, linearLayout2, rhTextView8, rhTextView9, rhTextView10, rhMoneyInputView, optionOrderLimitPriceRowComposeView, constraintLayout, rhMoneyInputView2, linearLayout3, barrier2, optionOrderMarketPriceRowComposeView, rdsInfoTag, space, rhTextView11, optionOrderQuantityRowComposeView, linearLayout4, constraintLayout2, rhTextView12, rhTextView13, rhTextView14, linearLayout5, optionOrderStopTriggerPriceRowView, barrier3, optionOrderTimeInForceRowComposeView, optionOrderTotalCostRowComposeView, optionOrderTradingSessionRowComposeView, viewFindChildViewById4, viewFindChildViewById5, group2, group3, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9);
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
