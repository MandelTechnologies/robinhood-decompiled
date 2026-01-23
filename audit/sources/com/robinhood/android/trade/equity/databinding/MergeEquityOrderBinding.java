package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.share.ExpandableEstimatedCostRowView;

/* loaded from: classes9.dex */
public final class MergeEquityOrderBinding implements ViewBinding {
    public final View accountBottomDivider;
    public final LinearLayout accountGroup;
    public final RhTextView accountLabelTxt;
    public final View accountTopDivider;
    public final RhTextView accountTxt;
    public final RhTextView accountTxtSubtitle;
    public final RhTextView backupWithholdingAmountTxt;
    public final View backupWithholdingBottomDivider;
    public final LinearLayout backupWithholdingGroup;
    public final RhTextView backupWithholdingLabelTxt;
    public final LinearLayout collateralGroup;
    public final RhTextView collateralLabelTxt;
    public final RhTextView collateralTxt;
    public final RdsTextButton editOrderTextButton;
    public final RdsTextButton editTrailOrderTextButton;
    public final LinearLayout estimatedCostGroup;
    public final ExpandableEstimatedCostRowView expandableEstimatedCostRow;
    public final RhTextView orderCreateDescriptionTxt;
    public final RhTextView orderCreateExecutionTxt;
    public final RhTextView orderCreateTitleTxt;
    public final View orderPriceBottomDivider;
    public final RhTextView orderPriceLabelTxt;
    public final RhTextView orderReviewLabelTxt;
    public final RhTextView orderReviewTxt;
    public final RhTextView orderTimeInForceLabelTxt;
    public final RhTextView orderTrailingPegLabelTxt;
    public final View orderTrailingPegLabelTxtBottomDivider;
    public final LinearLayout priceGroup;
    public final RhTextView priceTxt;
    private final View rootView;
    public final ConstraintLayout shareQuantityContainer;
    public final RhEditText shareQuantityEdt;
    public final View shareQuantityEdtBottomDivider;
    public final RhTextView sharesLabelTxt;
    public final View taxLotBottomDivider;
    public final RhTextView taxLotGainLossTxt;
    public final LinearLayout taxLotGroup;
    public final RhTextView taxLotLabelTxt;
    public final RhTextView taxLotM1LabelPrimary;
    public final RhTextView taxLotM1LabelSecondary;
    public final RhTextView taxLotTermTxt;
    public final View taxLotsM1BottomDivider;
    public final LinearLayout taxLotsM1Group;
    public final RhTextView taxLotsM1Value;
    public final RhTextView taxLotsNumberOfShareLabel;
    public final View taxLotsNumberOfSharesBottomDivider;
    public final LinearLayout taxLotsNumberOfSharesGroup;
    public final RhTextView taxLotsNumberOfSharesValue;
    public final RhTextView totalCostLabelTxt;
    public final RhTextView totalCostSubtitleTxt;
    public final RhTextView totalCostTxt;
    public final View tradeSettingsBottomDivider;
    public final LinearLayout tradeSettingsGroup;
    public final RhTextView tradeSettingsLabelTxt;
    public final RhTextView tradeSettingsTrailingSubtitle;
    public final RhTextView tradeSettingsTrailingTitle;
    public final LinearLayout trailingPegGroup;
    public final RhTextView trailingPegStopPriceLabelTxt;
    public final RhTextView trailingPegStopPriceTimeInForceTxt;
    public final RhTextView trailingPegTxt;

    private MergeEquityOrderBinding(View view, View view2, LinearLayout linearLayout, RhTextView rhTextView, View view3, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, View view4, LinearLayout linearLayout2, RhTextView rhTextView5, LinearLayout linearLayout3, RhTextView rhTextView6, RhTextView rhTextView7, RdsTextButton rdsTextButton, RdsTextButton rdsTextButton2, LinearLayout linearLayout4, ExpandableEstimatedCostRowView expandableEstimatedCostRowView, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, View view5, RhTextView rhTextView11, RhTextView rhTextView12, RhTextView rhTextView13, RhTextView rhTextView14, RhTextView rhTextView15, View view6, LinearLayout linearLayout5, RhTextView rhTextView16, ConstraintLayout constraintLayout, RhEditText rhEditText, View view7, RhTextView rhTextView17, View view8, RhTextView rhTextView18, LinearLayout linearLayout6, RhTextView rhTextView19, RhTextView rhTextView20, RhTextView rhTextView21, RhTextView rhTextView22, View view9, LinearLayout linearLayout7, RhTextView rhTextView23, RhTextView rhTextView24, View view10, LinearLayout linearLayout8, RhTextView rhTextView25, RhTextView rhTextView26, RhTextView rhTextView27, RhTextView rhTextView28, View view11, LinearLayout linearLayout9, RhTextView rhTextView29, RhTextView rhTextView30, RhTextView rhTextView31, LinearLayout linearLayout10, RhTextView rhTextView32, RhTextView rhTextView33, RhTextView rhTextView34) {
        this.rootView = view;
        this.accountBottomDivider = view2;
        this.accountGroup = linearLayout;
        this.accountLabelTxt = rhTextView;
        this.accountTopDivider = view3;
        this.accountTxt = rhTextView2;
        this.accountTxtSubtitle = rhTextView3;
        this.backupWithholdingAmountTxt = rhTextView4;
        this.backupWithholdingBottomDivider = view4;
        this.backupWithholdingGroup = linearLayout2;
        this.backupWithholdingLabelTxt = rhTextView5;
        this.collateralGroup = linearLayout3;
        this.collateralLabelTxt = rhTextView6;
        this.collateralTxt = rhTextView7;
        this.editOrderTextButton = rdsTextButton;
        this.editTrailOrderTextButton = rdsTextButton2;
        this.estimatedCostGroup = linearLayout4;
        this.expandableEstimatedCostRow = expandableEstimatedCostRowView;
        this.orderCreateDescriptionTxt = rhTextView8;
        this.orderCreateExecutionTxt = rhTextView9;
        this.orderCreateTitleTxt = rhTextView10;
        this.orderPriceBottomDivider = view5;
        this.orderPriceLabelTxt = rhTextView11;
        this.orderReviewLabelTxt = rhTextView12;
        this.orderReviewTxt = rhTextView13;
        this.orderTimeInForceLabelTxt = rhTextView14;
        this.orderTrailingPegLabelTxt = rhTextView15;
        this.orderTrailingPegLabelTxtBottomDivider = view6;
        this.priceGroup = linearLayout5;
        this.priceTxt = rhTextView16;
        this.shareQuantityContainer = constraintLayout;
        this.shareQuantityEdt = rhEditText;
        this.shareQuantityEdtBottomDivider = view7;
        this.sharesLabelTxt = rhTextView17;
        this.taxLotBottomDivider = view8;
        this.taxLotGainLossTxt = rhTextView18;
        this.taxLotGroup = linearLayout6;
        this.taxLotLabelTxt = rhTextView19;
        this.taxLotM1LabelPrimary = rhTextView20;
        this.taxLotM1LabelSecondary = rhTextView21;
        this.taxLotTermTxt = rhTextView22;
        this.taxLotsM1BottomDivider = view9;
        this.taxLotsM1Group = linearLayout7;
        this.taxLotsM1Value = rhTextView23;
        this.taxLotsNumberOfShareLabel = rhTextView24;
        this.taxLotsNumberOfSharesBottomDivider = view10;
        this.taxLotsNumberOfSharesGroup = linearLayout8;
        this.taxLotsNumberOfSharesValue = rhTextView25;
        this.totalCostLabelTxt = rhTextView26;
        this.totalCostSubtitleTxt = rhTextView27;
        this.totalCostTxt = rhTextView28;
        this.tradeSettingsBottomDivider = view11;
        this.tradeSettingsGroup = linearLayout9;
        this.tradeSettingsLabelTxt = rhTextView29;
        this.tradeSettingsTrailingSubtitle = rhTextView30;
        this.tradeSettingsTrailingTitle = rhTextView31;
        this.trailingPegGroup = linearLayout10;
        this.trailingPegStopPriceLabelTxt = rhTextView32;
        this.trailingPegStopPriceTimeInForceTxt = rhTextView33;
        this.trailingPegTxt = rhTextView34;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEquityOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29365R.layout.merge_equity_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEquityOrderBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        View viewFindChildViewById9;
        int i = C29365R.id.account_bottom_divider;
        View viewFindChildViewById10 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById10 != null) {
            i = C29365R.id.account_group;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C29365R.id.account_label_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29365R.id.account_top_divider))) != null) {
                    i = C29365R.id.account_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C29365R.id.account_txt_subtitle;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C29365R.id.backup_withholding_amount_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C29365R.id.backup_withholding_bottom_divider))) != null) {
                                i = C29365R.id.backup_withholding_group;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C29365R.id.backup_withholding_label_txt;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C29365R.id.collateral_group;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout3 != null) {
                                            i = C29365R.id.collateral_label_txt;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                i = C29365R.id.collateral_txt;
                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView7 != null) {
                                                    i = C29365R.id.edit_order_text_button;
                                                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsTextButton != null) {
                                                        i = C29365R.id.edit_trail_order_text_button;
                                                        RdsTextButton rdsTextButton2 = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsTextButton2 != null) {
                                                            i = C29365R.id.estimated_cost_group;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout4 != null) {
                                                                i = C29365R.id.expandable_estimated_cost_row;
                                                                ExpandableEstimatedCostRowView expandableEstimatedCostRowView = (ExpandableEstimatedCostRowView) ViewBindings.findChildViewById(view, i);
                                                                if (expandableEstimatedCostRowView != null) {
                                                                    i = C29365R.id.order_create_description_txt;
                                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView8 != null) {
                                                                        i = C29365R.id.order_create_execution_txt;
                                                                        RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView9 != null) {
                                                                            i = C29365R.id.order_create_title_txt;
                                                                            RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView10 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C29365R.id.order_price_bottom_divider))) != null) {
                                                                                i = C29365R.id.order_price_label_txt;
                                                                                RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView11 != null) {
                                                                                    i = C29365R.id.order_review_label_txt;
                                                                                    RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhTextView12 != null) {
                                                                                        i = C29365R.id.order_review_txt;
                                                                                        RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhTextView13 != null) {
                                                                                            i = C29365R.id.order_time_in_force_label_txt;
                                                                                            RhTextView rhTextView14 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rhTextView14 != null) {
                                                                                                i = C29365R.id.order_trailing_peg_label_txt;
                                                                                                RhTextView rhTextView15 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (rhTextView15 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C29365R.id.order_trailing_peg_label_txt_bottom_divider))) != null) {
                                                                                                    i = C29365R.id.price_group;
                                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (linearLayout5 != null) {
                                                                                                        i = C29365R.id.price_txt;
                                                                                                        RhTextView rhTextView16 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (rhTextView16 != null) {
                                                                                                            i = C29365R.id.share_quantity_container;
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                            if (constraintLayout != null) {
                                                                                                                i = C29365R.id.share_quantity_edt;
                                                                                                                RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                                                                                                if (rhEditText != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C29365R.id.share_quantity_edt_bottom_divider))) != null) {
                                                                                                                    i = C29365R.id.shares_label_txt;
                                                                                                                    RhTextView rhTextView17 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (rhTextView17 != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C29365R.id.tax_lot_bottom_divider))) != null) {
                                                                                                                        i = C29365R.id.tax_lot_gain_loss_txt;
                                                                                                                        RhTextView rhTextView18 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (rhTextView18 != null) {
                                                                                                                            i = C29365R.id.tax_lot_group;
                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                i = C29365R.id.tax_lot_label_txt;
                                                                                                                                RhTextView rhTextView19 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (rhTextView19 != null) {
                                                                                                                                    i = C29365R.id.tax_lot_m1_label_primary;
                                                                                                                                    RhTextView rhTextView20 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (rhTextView20 != null) {
                                                                                                                                        i = C29365R.id.tax_lot_m1_label_secondary;
                                                                                                                                        RhTextView rhTextView21 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (rhTextView21 != null) {
                                                                                                                                            i = C29365R.id.tax_lot_term_txt;
                                                                                                                                            RhTextView rhTextView22 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (rhTextView22 != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C29365R.id.tax_lots_m1_bottom_divider))) != null) {
                                                                                                                                                i = C29365R.id.tax_lots_m1_group;
                                                                                                                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                                    i = C29365R.id.tax_lots_m1_value;
                                                                                                                                                    RhTextView rhTextView23 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (rhTextView23 != null) {
                                                                                                                                                        i = C29365R.id.tax_lots_number_of_share_label;
                                                                                                                                                        RhTextView rhTextView24 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (rhTextView24 != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C29365R.id.tax_lots_number_of_shares_bottom_divider))) != null) {
                                                                                                                                                            i = C29365R.id.tax_lots_number_of_shares_group;
                                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                                i = C29365R.id.tax_lots_number_of_shares_value;
                                                                                                                                                                RhTextView rhTextView25 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (rhTextView25 != null) {
                                                                                                                                                                    i = C29365R.id.total_cost_label_txt;
                                                                                                                                                                    RhTextView rhTextView26 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (rhTextView26 != null) {
                                                                                                                                                                        i = C29365R.id.total_cost_subtitle_txt;
                                                                                                                                                                        RhTextView rhTextView27 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (rhTextView27 != null) {
                                                                                                                                                                            i = C29365R.id.total_cost_txt;
                                                                                                                                                                            RhTextView rhTextView28 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (rhTextView28 != null && (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i = C29365R.id.trade_settings_bottom_divider))) != null) {
                                                                                                                                                                                i = C29365R.id.trade_settings_group;
                                                                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                                                                    i = C29365R.id.trade_settings_label_txt;
                                                                                                                                                                                    RhTextView rhTextView29 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (rhTextView29 != null) {
                                                                                                                                                                                        i = C29365R.id.trade_settings_trailing_subtitle;
                                                                                                                                                                                        RhTextView rhTextView30 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (rhTextView30 != null) {
                                                                                                                                                                                            i = C29365R.id.trade_settings_trailing_title;
                                                                                                                                                                                            RhTextView rhTextView31 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (rhTextView31 != null) {
                                                                                                                                                                                                i = C29365R.id.trailing_peg_group;
                                                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                                                                                    i = C29365R.id.trailing_peg_stop_price_label_txt;
                                                                                                                                                                                                    RhTextView rhTextView32 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (rhTextView32 != null) {
                                                                                                                                                                                                        i = C29365R.id.trailing_peg_stop_price_time_in_force_txt;
                                                                                                                                                                                                        RhTextView rhTextView33 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (rhTextView33 != null) {
                                                                                                                                                                                                            i = C29365R.id.trailing_peg_txt;
                                                                                                                                                                                                            RhTextView rhTextView34 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (rhTextView34 != null) {
                                                                                                                                                                                                                return new MergeEquityOrderBinding(view, viewFindChildViewById10, linearLayout, rhTextView, viewFindChildViewById, rhTextView2, rhTextView3, rhTextView4, viewFindChildViewById2, linearLayout2, rhTextView5, linearLayout3, rhTextView6, rhTextView7, rdsTextButton, rdsTextButton2, linearLayout4, expandableEstimatedCostRowView, rhTextView8, rhTextView9, rhTextView10, viewFindChildViewById3, rhTextView11, rhTextView12, rhTextView13, rhTextView14, rhTextView15, viewFindChildViewById4, linearLayout5, rhTextView16, constraintLayout, rhEditText, viewFindChildViewById5, rhTextView17, viewFindChildViewById6, rhTextView18, linearLayout6, rhTextView19, rhTextView20, rhTextView21, rhTextView22, viewFindChildViewById7, linearLayout7, rhTextView23, rhTextView24, viewFindChildViewById8, linearLayout8, rhTextView25, rhTextView26, rhTextView27, rhTextView28, viewFindChildViewById9, linearLayout9, rhTextView29, rhTextView30, rhTextView31, linearLayout10, rhTextView32, rhTextView33, rhTextView34);
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
