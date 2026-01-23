package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.crypto.p375ui.tickerinputview.CryptoTickerInputView;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class MergeCryptoQuoteOrderBinding implements ViewBinding {
    public final ComposeView accountSelectorComposeView;
    public final FrameLayout belowInputViewGroup;
    public final ComposeView cryptoFeeBannerComposeView;
    public final Barrier cryptoOrderPriceDetailsBarrier;
    public final ComposeView cryptoOrderRowsComposeView;
    public final RhTextView cryptoPowerTxt;
    public final ComposeView cryptoRecurringHookChip;
    public final ComposeView cryptoReviewTxtComposeView;
    public final CryptoTickerInputView inputView;
    public final RhTextView result;
    private final View rootView;

    private MergeCryptoQuoteOrderBinding(View view, ComposeView composeView, FrameLayout frameLayout, ComposeView composeView2, Barrier barrier, ComposeView composeView3, RhTextView rhTextView, ComposeView composeView4, ComposeView composeView5, CryptoTickerInputView cryptoTickerInputView, RhTextView rhTextView2) {
        this.rootView = view;
        this.accountSelectorComposeView = composeView;
        this.belowInputViewGroup = frameLayout;
        this.cryptoFeeBannerComposeView = composeView2;
        this.cryptoOrderPriceDetailsBarrier = barrier;
        this.cryptoOrderRowsComposeView = composeView3;
        this.cryptoPowerTxt = rhTextView;
        this.cryptoRecurringHookChip = composeView4;
        this.cryptoReviewTxtComposeView = composeView5;
        this.inputView = cryptoTickerInputView;
        this.result = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoQuoteOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C40095R.layout.merge_crypto_quote_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoQuoteOrderBinding bind(View view) {
        int i = C40095R.id.accountSelectorComposeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C40095R.id.below_input_view_group;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C40095R.id.crypto_fee_banner_compose_view;
                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView2 != null) {
                    i = C40095R.id.crypto_order_price_details_barrier;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier != null) {
                        i = C40095R.id.crypto_order_rows_compose_view;
                        ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView3 != null) {
                            i = C40095R.id.cryptoPowerTxt;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C40095R.id.crypto_recurring_hook_chip;
                                ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView4 != null) {
                                    i = C40095R.id.crypto_review_txt_compose_view;
                                    ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView5 != null) {
                                        i = C40095R.id.input_view;
                                        CryptoTickerInputView cryptoTickerInputView = (CryptoTickerInputView) ViewBindings.findChildViewById(view, i);
                                        if (cryptoTickerInputView != null) {
                                            i = C40095R.id.result;
                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView2 != null) {
                                                return new MergeCryptoQuoteOrderBinding(view, composeView, frameLayout, composeView2, barrier, composeView3, rhTextView, composeView4, composeView5, cryptoTickerInputView, rhTextView2);
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
