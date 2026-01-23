package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class MergeDirectIpoOrderBinding implements ViewBinding {
    public final RhMoneyInputView directIpoCustomPriceEdt;
    public final RhTextView directIpoDescriptionTxt;
    public final RhTextView directIpoOrderDisclaimerTxt;
    public final Barrier directIpoPriceBarrier;
    public final View directIpoPriceBottomDivider;
    public final RhTextView directIpoPriceLabelTxt;
    public final RhTextView directIpoPriceSubtitleTxt;
    public final RhTextView directIpoPriceValueTxt;
    public final RhTextView directIpoReviewTxt;
    public final RhTextView directIpoSetPriceTypeBtn;
    public final RhEditText directIpoSharesQuantityEdt;
    public final View directIpoSharesQuantityEdtBottomDivider;
    public final RhTextView directIpoSharesQuantityLabelTxt;
    public final RhTextView directIpoTitleTxt;
    public final RhTextView directIpoTotalLabelTxt;
    public final RhTextView directIpoTotalValueTxt;
    private final View rootView;

    private MergeDirectIpoOrderBinding(View view, RhMoneyInputView rhMoneyInputView, RhTextView rhTextView, RhTextView rhTextView2, Barrier barrier, View view2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhEditText rhEditText, View view3, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11) {
        this.rootView = view;
        this.directIpoCustomPriceEdt = rhMoneyInputView;
        this.directIpoDescriptionTxt = rhTextView;
        this.directIpoOrderDisclaimerTxt = rhTextView2;
        this.directIpoPriceBarrier = barrier;
        this.directIpoPriceBottomDivider = view2;
        this.directIpoPriceLabelTxt = rhTextView3;
        this.directIpoPriceSubtitleTxt = rhTextView4;
        this.directIpoPriceValueTxt = rhTextView5;
        this.directIpoReviewTxt = rhTextView6;
        this.directIpoSetPriceTypeBtn = rhTextView7;
        this.directIpoSharesQuantityEdt = rhEditText;
        this.directIpoSharesQuantityEdtBottomDivider = view3;
        this.directIpoSharesQuantityLabelTxt = rhTextView8;
        this.directIpoTitleTxt = rhTextView9;
        this.directIpoTotalLabelTxt = rhTextView10;
        this.directIpoTotalValueTxt = rhTextView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29323R.layout.merge_direct_ipo_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDirectIpoOrderBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C29323R.id.direct_ipo_custom_price_edt;
        RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
        if (rhMoneyInputView != null) {
            i = C29323R.id.direct_ipo_description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29323R.id.direct_ipo_order_disclaimer_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C29323R.id.direct_ipo_price_barrier;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29323R.id.direct_ipo_price_bottom_divider))) != null) {
                        i = C29323R.id.direct_ipo_price_label_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C29323R.id.direct_ipo_price_subtitle_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C29323R.id.direct_ipo_price_value_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C29323R.id.direct_ipo_review_txt;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C29323R.id.direct_ipo_set_price_type_btn;
                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView7 != null) {
                                            i = C29323R.id.direct_ipo_shares_quantity_edt;
                                            RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                            if (rhEditText != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C29323R.id.direct_ipo_shares_quantity_edt_bottom_divider))) != null) {
                                                i = C29323R.id.direct_ipo_shares_quantity_label_txt;
                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView8 != null) {
                                                    i = C29323R.id.direct_ipo_title_txt;
                                                    RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView9 != null) {
                                                        i = C29323R.id.direct_ipo_total_label_txt;
                                                        RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView10 != null) {
                                                            i = C29323R.id.direct_ipo_total_value_txt;
                                                            RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView11 != null) {
                                                                return new MergeDirectIpoOrderBinding(view, rhMoneyInputView, rhTextView, rhTextView2, barrier, viewFindChildViewById, rhTextView3, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhEditText, viewFindChildViewById2, rhTextView8, rhTextView9, rhTextView10, rhTextView11);
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
