package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFeeFooterComposeView;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationLayout;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class IncludeOptionOrderConfirmationLayoutBinding implements ViewBinding {
    public final View accountDivider;
    public final TextView accountLabelTxt;
    public final TextView accountNameSubtitle;
    public final TextView accountNameTitle;
    public final LinearLayout accountRow;
    public final View bidAskDivider;
    public final Group bidAskGroup;
    public final RhTextView bidAskLabelTxt;
    public final RhTextView bidAskTxt;
    public final View collateralDivider;
    public final Group collateralGroup;
    public final RhTextView collateralLabelTxt;
    public final RhTextView collateralTxt;
    public final View commissionsPaidDivider;
    public final Group commissionsPaidGroup;
    public final RhTextView commissionsPaidLabelTxt;
    public final RhTextView commissionsPaidTxt;
    public final BlockableNestedScrollView contentScrollview;
    public final OptionOrderConfirmationFeeFooterComposeView feeFooter;
    public final View fillPriceDivider;
    public final RhTextView fillPriceLabelTxt;
    public final RhTextView fillPriceTxt;
    public final View limitPriceDivider;
    public final Group limitPriceGroup;
    public final RhTextView limitPriceLabelTxt;
    public final RhTextView limitPriceTxt;
    public final View newPositionDivider;
    public final Group newPositionGroup;
    public final RhTextView newPositionLabelTxt;
    public final RhTextView newPositionTxt;
    public final RdsButton okBtn;
    public final OptionOrderConfirmationLayout orderConfirmationLayout;
    public final RhTextView orderStatusPromptTxt;
    public final RhTextView orderStatusTxt;
    public final View releasedCollateralDivider;
    public final Group releasedCollateralGroup;
    public final RhTextView releasedCollateralLabelTxt;
    public final RhTextView releasedCollateralTxt;
    public final RdsButton replaceOrderBtn;
    private final OptionOrderConfirmationLayout rootView;
    public final RhTextView shareQuantityLabelTxt;
    public final RhTextView shareQuantityTxt;
    public final View stopPriceDivider;
    public final Group stopPriceGroup;
    public final RhTextView stopPriceLabelTxt;
    public final RhTextView stopPriceTxt;
    public final RhTextView summaryTxt;
    public final RhTextView totalCostLabelTxt;
    public final RhTextView totalCostTxt;

    private IncludeOptionOrderConfirmationLayoutBinding(OptionOrderConfirmationLayout optionOrderConfirmationLayout, View view, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, View view2, Group group, RhTextView rhTextView, RhTextView rhTextView2, View view3, Group group2, RhTextView rhTextView3, RhTextView rhTextView4, View view4, Group group3, RhTextView rhTextView5, RhTextView rhTextView6, BlockableNestedScrollView blockableNestedScrollView, OptionOrderConfirmationFeeFooterComposeView optionOrderConfirmationFeeFooterComposeView, View view5, RhTextView rhTextView7, RhTextView rhTextView8, View view6, Group group4, RhTextView rhTextView9, RhTextView rhTextView10, View view7, Group group5, RhTextView rhTextView11, RhTextView rhTextView12, RdsButton rdsButton, OptionOrderConfirmationLayout optionOrderConfirmationLayout2, RhTextView rhTextView13, RhTextView rhTextView14, View view8, Group group6, RhTextView rhTextView15, RhTextView rhTextView16, RdsButton rdsButton2, RhTextView rhTextView17, RhTextView rhTextView18, View view9, Group group7, RhTextView rhTextView19, RhTextView rhTextView20, RhTextView rhTextView21, RhTextView rhTextView22, RhTextView rhTextView23) {
        this.rootView = optionOrderConfirmationLayout;
        this.accountDivider = view;
        this.accountLabelTxt = textView;
        this.accountNameSubtitle = textView2;
        this.accountNameTitle = textView3;
        this.accountRow = linearLayout;
        this.bidAskDivider = view2;
        this.bidAskGroup = group;
        this.bidAskLabelTxt = rhTextView;
        this.bidAskTxt = rhTextView2;
        this.collateralDivider = view3;
        this.collateralGroup = group2;
        this.collateralLabelTxt = rhTextView3;
        this.collateralTxt = rhTextView4;
        this.commissionsPaidDivider = view4;
        this.commissionsPaidGroup = group3;
        this.commissionsPaidLabelTxt = rhTextView5;
        this.commissionsPaidTxt = rhTextView6;
        this.contentScrollview = blockableNestedScrollView;
        this.feeFooter = optionOrderConfirmationFeeFooterComposeView;
        this.fillPriceDivider = view5;
        this.fillPriceLabelTxt = rhTextView7;
        this.fillPriceTxt = rhTextView8;
        this.limitPriceDivider = view6;
        this.limitPriceGroup = group4;
        this.limitPriceLabelTxt = rhTextView9;
        this.limitPriceTxt = rhTextView10;
        this.newPositionDivider = view7;
        this.newPositionGroup = group5;
        this.newPositionLabelTxt = rhTextView11;
        this.newPositionTxt = rhTextView12;
        this.okBtn = rdsButton;
        this.orderConfirmationLayout = optionOrderConfirmationLayout2;
        this.orderStatusPromptTxt = rhTextView13;
        this.orderStatusTxt = rhTextView14;
        this.releasedCollateralDivider = view8;
        this.releasedCollateralGroup = group6;
        this.releasedCollateralLabelTxt = rhTextView15;
        this.releasedCollateralTxt = rhTextView16;
        this.replaceOrderBtn = rdsButton2;
        this.shareQuantityLabelTxt = rhTextView17;
        this.shareQuantityTxt = rhTextView18;
        this.stopPriceDivider = view9;
        this.stopPriceGroup = group7;
        this.stopPriceLabelTxt = rhTextView19;
        this.stopPriceTxt = rhTextView20;
        this.summaryTxt = rhTextView21;
        this.totalCostLabelTxt = rhTextView22;
        this.totalCostTxt = rhTextView23;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionOrderConfirmationLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOptionOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29757R.layout.include_option_order_confirmation_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionOrderConfirmationLayoutBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        int i = C29757R.id.account_divider;
        View viewFindChildViewById9 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById9 != null) {
            i = C29757R.id.account_label_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C29757R.id.account_name_subtitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C29757R.id.account_name_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C29757R.id.account_row;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29757R.id.bid_ask_divider))) != null) {
                            i = C29757R.id.bid_ask_group;
                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                            if (group != null) {
                                i = C29757R.id.bid_ask_label_txt;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C29757R.id.bid_ask_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C29757R.id.collateral_divider))) != null) {
                                        i = C29757R.id.collateral_group;
                                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                        if (group2 != null) {
                                            i = C29757R.id.collateral_label_txt;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C29757R.id.collateral_txt;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C29757R.id.commissions_paid_divider))) != null) {
                                                    i = C29757R.id.commissions_paid_group;
                                                    Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                                    if (group3 != null) {
                                                        i = C29757R.id.commissions_paid_label_txt;
                                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView5 != null) {
                                                            i = C29757R.id.commissions_paid_txt;
                                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView6 != null) {
                                                                i = C29757R.id.content_scrollview;
                                                                BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                if (blockableNestedScrollView != null) {
                                                                    i = C29757R.id.fee_footer;
                                                                    OptionOrderConfirmationFeeFooterComposeView optionOrderConfirmationFeeFooterComposeView = (OptionOrderConfirmationFeeFooterComposeView) ViewBindings.findChildViewById(view, i);
                                                                    if (optionOrderConfirmationFeeFooterComposeView != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C29757R.id.fill_price_divider))) != null) {
                                                                        i = C29757R.id.fill_price_label_txt;
                                                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView7 != null) {
                                                                            i = C29757R.id.fill_price_txt;
                                                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView8 != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C29757R.id.limit_price_divider))) != null) {
                                                                                i = C29757R.id.limit_price_group;
                                                                                Group group4 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                if (group4 != null) {
                                                                                    i = C29757R.id.limit_price_label_txt;
                                                                                    RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhTextView9 != null) {
                                                                                        i = C29757R.id.limit_price_txt;
                                                                                        RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhTextView10 != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C29757R.id.new_position_divider))) != null) {
                                                                                            i = C29757R.id.new_position_group;
                                                                                            Group group5 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                            if (group5 != null) {
                                                                                                i = C29757R.id.new_position_label_txt;
                                                                                                RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (rhTextView11 != null) {
                                                                                                    i = C29757R.id.new_position_txt;
                                                                                                    RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (rhTextView12 != null) {
                                                                                                        i = C29757R.id.ok_btn;
                                                                                                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                                        if (rdsButton != null) {
                                                                                                            OptionOrderConfirmationLayout optionOrderConfirmationLayout = (OptionOrderConfirmationLayout) view;
                                                                                                            i = C29757R.id.order_status_prompt_txt;
                                                                                                            RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (rhTextView13 != null) {
                                                                                                                i = C29757R.id.order_status_txt;
                                                                                                                RhTextView rhTextView14 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (rhTextView14 != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C29757R.id.released_collateral_divider))) != null) {
                                                                                                                    i = C29757R.id.released_collateral_group;
                                                                                                                    Group group6 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (group6 != null) {
                                                                                                                        i = C29757R.id.released_collateral_label_txt;
                                                                                                                        RhTextView rhTextView15 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (rhTextView15 != null) {
                                                                                                                            i = C29757R.id.released_collateral_txt;
                                                                                                                            RhTextView rhTextView16 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (rhTextView16 != null) {
                                                                                                                                i = C29757R.id.replace_order_btn;
                                                                                                                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (rdsButton2 != null) {
                                                                                                                                    i = C29757R.id.share_quantity_label_txt;
                                                                                                                                    RhTextView rhTextView17 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (rhTextView17 != null) {
                                                                                                                                        i = C29757R.id.share_quantity_txt;
                                                                                                                                        RhTextView rhTextView18 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (rhTextView18 != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C29757R.id.stop_price_divider))) != null) {
                                                                                                                                            i = C29757R.id.stop_price_group;
                                                                                                                                            Group group7 = (Group) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (group7 != null) {
                                                                                                                                                i = C29757R.id.stop_price_label_txt;
                                                                                                                                                RhTextView rhTextView19 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (rhTextView19 != null) {
                                                                                                                                                    i = C29757R.id.stop_price_txt;
                                                                                                                                                    RhTextView rhTextView20 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (rhTextView20 != null) {
                                                                                                                                                        i = C29757R.id.summary_txt;
                                                                                                                                                        RhTextView rhTextView21 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (rhTextView21 != null) {
                                                                                                                                                            i = C29757R.id.total_cost_label_txt;
                                                                                                                                                            RhTextView rhTextView22 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (rhTextView22 != null) {
                                                                                                                                                                i = C29757R.id.total_cost_txt;
                                                                                                                                                                RhTextView rhTextView23 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (rhTextView23 != null) {
                                                                                                                                                                    return new IncludeOptionOrderConfirmationLayoutBinding(optionOrderConfirmationLayout, viewFindChildViewById9, textView, textView2, textView3, linearLayout, viewFindChildViewById, group, rhTextView, rhTextView2, viewFindChildViewById2, group2, rhTextView3, rhTextView4, viewFindChildViewById3, group3, rhTextView5, rhTextView6, blockableNestedScrollView, optionOrderConfirmationFeeFooterComposeView, viewFindChildViewById4, rhTextView7, rhTextView8, viewFindChildViewById5, group4, rhTextView9, rhTextView10, viewFindChildViewById6, group5, rhTextView11, rhTextView12, rdsButton, optionOrderConfirmationLayout, rhTextView13, rhTextView14, viewFindChildViewById7, group6, rhTextView15, rhTextView16, rdsButton2, rhTextView17, rhTextView18, viewFindChildViewById8, group7, rhTextView19, rhTextView20, rhTextView21, rhTextView22, rhTextView23);
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
