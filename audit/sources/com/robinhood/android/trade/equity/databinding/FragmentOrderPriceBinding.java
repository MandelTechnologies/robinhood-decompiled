package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentOrderPriceBinding implements ViewBinding {
    public final ComposeView alertComposeView;
    public final LinearLayout orderPriceCurrentPriceGroup;
    public final RhTextView orderPriceCurrentPriceValue;
    public final LinearLayout orderPriceHeader;
    public final RdsNumpadContainerView orderPriceNumpad;
    public final RhTextView orderPricePriceDisplayTxt;
    public final View orderPricePriceDivider;
    public final RhTextView orderPricePriceDollarPrefix;
    public final RhEditText orderPricePriceEdt;
    public final RhTextView orderPricePriceLabelTxt;
    public final RhTextView orderPricePromptTxt;
    public final RhTextView orderPriceTitleTxt;
    private final ConstraintLayout rootView;

    private FragmentOrderPriceBinding(ConstraintLayout constraintLayout, ComposeView composeView, LinearLayout linearLayout, RhTextView rhTextView, LinearLayout linearLayout2, RdsNumpadContainerView rdsNumpadContainerView, RhTextView rhTextView2, View view, RhTextView rhTextView3, RhEditText rhEditText, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.alertComposeView = composeView;
        this.orderPriceCurrentPriceGroup = linearLayout;
        this.orderPriceCurrentPriceValue = rhTextView;
        this.orderPriceHeader = linearLayout2;
        this.orderPriceNumpad = rdsNumpadContainerView;
        this.orderPricePriceDisplayTxt = rhTextView2;
        this.orderPricePriceDivider = view;
        this.orderPricePriceDollarPrefix = rhTextView3;
        this.orderPricePriceEdt = rhEditText;
        this.orderPricePriceLabelTxt = rhTextView4;
        this.orderPricePromptTxt = rhTextView5;
        this.orderPriceTitleTxt = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderPriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderPriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_order_price, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderPriceBinding bind(View view) {
        View viewFindChildViewById;
        int i = C29365R.id.alert_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C29365R.id.order_price_current_price_group;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C29365R.id.order_price_current_price_value;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29365R.id.order_price_header;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C29365R.id.order_price_numpad;
                        RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadContainerView != null) {
                            i = C29365R.id.order_price_price_display_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29365R.id.order_price_price_divider))) != null) {
                                i = C29365R.id.order_price_price_dollar_prefix;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C29365R.id.order_price_price_edt;
                                    RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                    if (rhEditText != null) {
                                        i = C29365R.id.order_price_price_label_txt;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C29365R.id.order_price_prompt_txt;
                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView5 != null) {
                                                i = C29365R.id.order_price_title_txt;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    return new FragmentOrderPriceBinding((ConstraintLayout) view, composeView, linearLayout, rhTextView, linearLayout2, rdsNumpadContainerView, rhTextView2, viewFindChildViewById, rhTextView3, rhEditText, rhTextView4, rhTextView5, rhTextView6);
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
