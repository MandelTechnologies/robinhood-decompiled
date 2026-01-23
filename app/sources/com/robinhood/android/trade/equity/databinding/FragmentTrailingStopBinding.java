package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentTrailingStopBinding implements ViewBinding {
    public final LinearLayout currentPriceGroup;
    public final RhTextView currentPriceTxt;
    public final RhTextView currentPriceValueTxt;
    public final LinearLayout expandedToolbar;
    public final RdsNumpadContainerView numpad;
    public final RhTextView orderPricePromptTxt;
    public final RhTextView orderPriceTitleTxt;
    public final RhTextView priceDisplayTxt;
    public final View priceDivider;
    public final RhTextView priceLabelTxt;
    private final ConstraintLayout rootView;
    public final View trailAmountDivider;
    public final RhTextView trailAmountDollarPrefix;
    public final RhEditText trailAmountEdt;
    public final RhTextView trailAmountLabelGroup;
    public final RhTextView trailAmountPercentagePostfix;

    private FragmentTrailingStopBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, LinearLayout linearLayout2, RdsNumpadContainerView rdsNumpadContainerView, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, View view, RhTextView rhTextView6, View view2, RhTextView rhTextView7, RhEditText rhEditText, RhTextView rhTextView8, RhTextView rhTextView9) {
        this.rootView = constraintLayout;
        this.currentPriceGroup = linearLayout;
        this.currentPriceTxt = rhTextView;
        this.currentPriceValueTxt = rhTextView2;
        this.expandedToolbar = linearLayout2;
        this.numpad = rdsNumpadContainerView;
        this.orderPricePromptTxt = rhTextView3;
        this.orderPriceTitleTxt = rhTextView4;
        this.priceDisplayTxt = rhTextView5;
        this.priceDivider = view;
        this.priceLabelTxt = rhTextView6;
        this.trailAmountDivider = view2;
        this.trailAmountDollarPrefix = rhTextView7;
        this.trailAmountEdt = rhEditText;
        this.trailAmountLabelGroup = rhTextView8;
        this.trailAmountPercentagePostfix = rhTextView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTrailingStopBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTrailingStopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_trailing_stop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTrailingStopBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C29365R.id.current_price_group;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C29365R.id.current_price_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29365R.id.current_price_value_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C29365R.id.expanded_toolbar;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C29365R.id.numpad;
                        RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadContainerView != null) {
                            i = C29365R.id.order_price_prompt_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C29365R.id.order_price_title_txt;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    i = C29365R.id.price_display_txt;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29365R.id.price_divider))) != null) {
                                        i = C29365R.id.price_label_txt;
                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView6 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C29365R.id.trail_amount_divider))) != null) {
                                            i = C29365R.id.trail_amount_dollar_prefix;
                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView7 != null) {
                                                i = C29365R.id.trail_amount_edt;
                                                RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                                if (rhEditText != null) {
                                                    i = C29365R.id.trail_amount_label_group;
                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView8 != null) {
                                                        i = C29365R.id.trail_amount_percentage_postfix;
                                                        RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView9 != null) {
                                                            return new FragmentTrailingStopBinding((ConstraintLayout) view, linearLayout, rhTextView, rhTextView2, linearLayout2, rdsNumpadContainerView, rhTextView3, rhTextView4, rhTextView5, viewFindChildViewById, rhTextView6, viewFindChildViewById2, rhTextView7, rhEditText, rhTextView8, rhTextView9);
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
