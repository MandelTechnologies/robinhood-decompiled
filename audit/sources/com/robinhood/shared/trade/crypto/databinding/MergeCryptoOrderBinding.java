package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView;

/* loaded from: classes12.dex */
public final class MergeCryptoOrderBinding implements ViewBinding {
    public final ComposeView accountSelectorComposeView;
    public final ComposeView amountRowComposeView;
    public final CryptoAmountInputView cryptoAmountEdt;
    public final RhTextView cryptoAmountLabel;
    public final ConstraintLayout cryptoAmountRowContainer;
    public final ComposeView cryptoOrderHeaderComposeView;
    public final ComposeView cryptoOrderRowsComposeView;
    public final ComposeView cryptoReviewTxtComposeView;
    private final View rootView;

    private MergeCryptoOrderBinding(View view, ComposeView composeView, ComposeView composeView2, CryptoAmountInputView cryptoAmountInputView, RhTextView rhTextView, ConstraintLayout constraintLayout, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5) {
        this.rootView = view;
        this.accountSelectorComposeView = composeView;
        this.amountRowComposeView = composeView2;
        this.cryptoAmountEdt = cryptoAmountInputView;
        this.cryptoAmountLabel = rhTextView;
        this.cryptoAmountRowContainer = constraintLayout;
        this.cryptoOrderHeaderComposeView = composeView3;
        this.cryptoOrderRowsComposeView = composeView4;
        this.cryptoReviewTxtComposeView = composeView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C40095R.layout.merge_crypto_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoOrderBinding bind(View view) {
        int i = C40095R.id.accountSelectorComposeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C40095R.id.amount_row_compose_view;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView2 != null) {
                i = C40095R.id.crypto_amount_edt;
                CryptoAmountInputView cryptoAmountInputView = (CryptoAmountInputView) ViewBindings.findChildViewById(view, i);
                if (cryptoAmountInputView != null) {
                    i = C40095R.id.crypto_amount_label;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C40095R.id.crypto_amount_row_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C40095R.id.crypto_order_header_compose_view;
                            ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView3 != null) {
                                i = C40095R.id.crypto_order_rows_compose_view;
                                ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView4 != null) {
                                    i = C40095R.id.crypto_review_txt_compose_view;
                                    ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView5 != null) {
                                        return new MergeCryptoOrderBinding(view, composeView, composeView2, cryptoAmountInputView, rhTextView, constraintLayout, composeView3, composeView4, composeView5);
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
