package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentOrderPreIpoBidPriceBinding implements ViewBinding {
    public final LinearLayout currentPriceGroup;
    public final RhTextView currentPriceTxt;
    public final RhTextView currentPriceValue;
    public final LinearLayout expandedToolbar;
    public final RdsNumpadContainerView numpad;
    public final RhTextView orderPricePromptTxt;
    public final RhTextView orderPriceTitleTxt;
    public final RhTextView priceDisplayTxt;
    public final View priceDivider;
    public final RhTextView priceDollarPrefix;
    public final RhEditText priceEdt;
    public final RhTextView priceLabelTxt;
    private final LinearLayout rootView;

    private FragmentOrderPreIpoBidPriceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RhTextView rhTextView, RhTextView rhTextView2, LinearLayout linearLayout3, RdsNumpadContainerView rdsNumpadContainerView, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, View view, RhTextView rhTextView6, RhEditText rhEditText, RhTextView rhTextView7) {
        this.rootView = linearLayout;
        this.currentPriceGroup = linearLayout2;
        this.currentPriceTxt = rhTextView;
        this.currentPriceValue = rhTextView2;
        this.expandedToolbar = linearLayout3;
        this.numpad = rdsNumpadContainerView;
        this.orderPricePromptTxt = rhTextView3;
        this.orderPriceTitleTxt = rhTextView4;
        this.priceDisplayTxt = rhTextView5;
        this.priceDivider = view;
        this.priceDollarPrefix = rhTextView6;
        this.priceEdt = rhEditText;
        this.priceLabelTxt = rhTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderPreIpoBidPriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderPreIpoBidPriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_order_pre_ipo_bid_price, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderPreIpoBidPriceBinding bind(View view) {
        View viewFindChildViewById;
        int i = C29365R.id.current_price_group;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C29365R.id.current_price_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29365R.id.current_price_value;
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
                                        i = C29365R.id.price_dollar_prefix;
                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView6 != null) {
                                            i = C29365R.id.price_edt;
                                            RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                            if (rhEditText != null) {
                                                i = C29365R.id.price_label_txt;
                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView7 != null) {
                                                    return new FragmentOrderPreIpoBidPriceBinding((LinearLayout) view, linearLayout, rhTextView, rhTextView2, linearLayout2, rdsNumpadContainerView, rhTextView3, rhTextView4, rhTextView5, viewFindChildViewById, rhTextView6, rhEditText, rhTextView7);
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
