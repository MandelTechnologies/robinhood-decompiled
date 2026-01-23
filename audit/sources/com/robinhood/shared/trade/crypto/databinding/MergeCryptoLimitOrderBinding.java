package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView;

/* loaded from: classes12.dex */
public final class MergeCryptoLimitOrderBinding implements ViewBinding {
    public final CryptoAmountInputView cryptoAmountEdt;
    public final ComposeView cryptoAmountLabelContent;
    public final ComposeView cryptoEstimatedAmountContent;
    public final ComposeView cryptoEstimatedReviewContent;
    public final CryptoAmountInputView cryptoLimitPriceEdt;
    public final ComposeView cryptoLimitPriceLabelContent;
    public final ComposeView feeRow1;
    public final ComposeView feeRow2;
    public final ComposeView limitOrderHeaderContent;
    public final ComposeView loadingViewContent;
    private final View rootView;

    private MergeCryptoLimitOrderBinding(View view, CryptoAmountInputView cryptoAmountInputView, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, CryptoAmountInputView cryptoAmountInputView2, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8) {
        this.rootView = view;
        this.cryptoAmountEdt = cryptoAmountInputView;
        this.cryptoAmountLabelContent = composeView;
        this.cryptoEstimatedAmountContent = composeView2;
        this.cryptoEstimatedReviewContent = composeView3;
        this.cryptoLimitPriceEdt = cryptoAmountInputView2;
        this.cryptoLimitPriceLabelContent = composeView4;
        this.feeRow1 = composeView5;
        this.feeRow2 = composeView6;
        this.limitOrderHeaderContent = composeView7;
        this.loadingViewContent = composeView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoLimitOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C40095R.layout.merge_crypto_limit_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoLimitOrderBinding bind(View view) {
        int i = C40095R.id.crypto_amount_edt;
        CryptoAmountInputView cryptoAmountInputView = (CryptoAmountInputView) ViewBindings.findChildViewById(view, i);
        if (cryptoAmountInputView != null) {
            i = C40095R.id.crypto_amount_label_content;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C40095R.id.crypto_estimated_amount_content;
                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView2 != null) {
                    i = C40095R.id.crypto_estimated_review_content;
                    ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView3 != null) {
                        i = C40095R.id.crypto_limit_price_edt;
                        CryptoAmountInputView cryptoAmountInputView2 = (CryptoAmountInputView) ViewBindings.findChildViewById(view, i);
                        if (cryptoAmountInputView2 != null) {
                            i = C40095R.id.crypto_limit_price_label_content;
                            ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView4 != null) {
                                i = C40095R.id.fee_row_1;
                                ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView5 != null) {
                                    i = C40095R.id.fee_row_2;
                                    ComposeView composeView6 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView6 != null) {
                                        i = C40095R.id.limit_order_header_content;
                                        ComposeView composeView7 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView7 != null) {
                                            i = C40095R.id.loading_view_content;
                                            ComposeView composeView8 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                            if (composeView8 != null) {
                                                return new MergeCryptoLimitOrderBinding(view, cryptoAmountInputView, composeView, composeView2, composeView3, cryptoAmountInputView2, composeView4, composeView5, composeView6, composeView7, composeView8);
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
