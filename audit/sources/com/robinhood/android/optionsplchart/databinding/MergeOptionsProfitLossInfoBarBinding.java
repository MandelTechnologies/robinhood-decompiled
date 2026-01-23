package com.robinhood.android.optionsplchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsplchart.C24771R;

/* loaded from: classes11.dex */
public final class MergeOptionsProfitLossInfoBarBinding implements ViewBinding {
    public final Guideline lossGuideline;
    public final Group optionsProfitLossAdditionalInfoContainer;
    public final Group optionsProfitLossCaretViews;
    public final Group optionsProfitLossExpectedProfitLossContainer;
    public final RhTextView optionsProfitLossExpectedProfitLossHeader;
    public final RhTextView optionsProfitLossExpectedProfitLossValue;
    public final ImageView optionsProfitLossInfoBarCaret;
    public final ImageView optionsProfitLossInfoBarCaretContainer;
    public final View optionsProfitLossInfoBarDividerCenter;
    public final View optionsProfitLossInfoBarDividerLeft;
    public final View optionsProfitLossInfoBarDividerRight;
    public final RhTextView optionsProfitLossInfoBreakeven;
    public final LinearLayout optionsProfitLossInfoBreakevenContainer;
    public final RhTextView optionsProfitLossInfoBreakevenHeader;
    public final RhTextView optionsProfitLossInfoMaxLoss;
    public final LinearLayout optionsProfitLossInfoMaxLossContainer;
    public final RhTextView optionsProfitLossInfoMaxLossHeader;
    public final RhTextView optionsProfitLossInfoMaxProfit;
    public final LinearLayout optionsProfitLossInfoMaxProfitContainer;
    public final RhTextView optionsProfitLossInfoMaxProfitHeader;
    public final Guideline profitGuideline;
    private final View rootView;

    private MergeOptionsProfitLossInfoBarBinding(View view, Guideline guideline, Group group, Group group2, Group group3, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, ImageView imageView2, View view2, View view3, View view4, RhTextView rhTextView3, LinearLayout linearLayout, RhTextView rhTextView4, RhTextView rhTextView5, LinearLayout linearLayout2, RhTextView rhTextView6, RhTextView rhTextView7, LinearLayout linearLayout3, RhTextView rhTextView8, Guideline guideline2) {
        this.rootView = view;
        this.lossGuideline = guideline;
        this.optionsProfitLossAdditionalInfoContainer = group;
        this.optionsProfitLossCaretViews = group2;
        this.optionsProfitLossExpectedProfitLossContainer = group3;
        this.optionsProfitLossExpectedProfitLossHeader = rhTextView;
        this.optionsProfitLossExpectedProfitLossValue = rhTextView2;
        this.optionsProfitLossInfoBarCaret = imageView;
        this.optionsProfitLossInfoBarCaretContainer = imageView2;
        this.optionsProfitLossInfoBarDividerCenter = view2;
        this.optionsProfitLossInfoBarDividerLeft = view3;
        this.optionsProfitLossInfoBarDividerRight = view4;
        this.optionsProfitLossInfoBreakeven = rhTextView3;
        this.optionsProfitLossInfoBreakevenContainer = linearLayout;
        this.optionsProfitLossInfoBreakevenHeader = rhTextView4;
        this.optionsProfitLossInfoMaxLoss = rhTextView5;
        this.optionsProfitLossInfoMaxLossContainer = linearLayout2;
        this.optionsProfitLossInfoMaxLossHeader = rhTextView6;
        this.optionsProfitLossInfoMaxProfit = rhTextView7;
        this.optionsProfitLossInfoMaxProfitContainer = linearLayout3;
        this.optionsProfitLossInfoMaxProfitHeader = rhTextView8;
        this.profitGuideline = guideline2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionsProfitLossInfoBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24771R.layout.merge_options_profit_loss_info_bar, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionsProfitLossInfoBarBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C24771R.id.loss_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C24771R.id.options_profit_loss_additional_info_container;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C24771R.id.options_profit_loss_caret_views;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = C24771R.id.options_profit_loss_expected_profit_loss_container;
                    Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                    if (group3 != null) {
                        i = C24771R.id.options_profit_loss_expected_profit_loss_header;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C24771R.id.options_profit_loss_expected_profit_loss_value;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C24771R.id.options_profit_loss_info_bar_caret;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C24771R.id.options_profit_loss_info_bar_caret_container;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24771R.id.options_profit_loss_info_bar_divider_center))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24771R.id.options_profit_loss_info_bar_divider_left))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C24771R.id.options_profit_loss_info_bar_divider_right))) != null) {
                                        i = C24771R.id.options_profit_loss_info_breakeven;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C24771R.id.options_profit_loss_info_breakeven_container;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C24771R.id.options_profit_loss_info_breakeven_header;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    i = C24771R.id.options_profit_loss_info_max_loss;
                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView5 != null) {
                                                        i = C24771R.id.options_profit_loss_info_max_loss_container;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout2 != null) {
                                                            i = C24771R.id.options_profit_loss_info_max_loss_header;
                                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView6 != null) {
                                                                i = C24771R.id.options_profit_loss_info_max_profit;
                                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView7 != null) {
                                                                    i = C24771R.id.options_profit_loss_info_max_profit_container;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout3 != null) {
                                                                        i = C24771R.id.options_profit_loss_info_max_profit_header;
                                                                        RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView8 != null) {
                                                                            i = C24771R.id.profit_guideline;
                                                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                            if (guideline2 != null) {
                                                                                return new MergeOptionsProfitLossInfoBarBinding(view, guideline, group, group2, group3, rhTextView, rhTextView2, imageView, imageView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, rhTextView3, linearLayout, rhTextView4, rhTextView5, linearLayout2, rhTextView6, rhTextView7, linearLayout3, rhTextView8, guideline2);
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
