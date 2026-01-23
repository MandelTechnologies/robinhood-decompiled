package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountEditText;

/* loaded from: classes12.dex */
public final class MergeCryptoAmountInputViewBinding implements ViewBinding {
    public final CryptoAmountEditText amountEditText;
    public final RhTextView frontSymbolText;
    public final RhTextView rearSymbolText;
    private final View rootView;

    private MergeCryptoAmountInputViewBinding(View view, CryptoAmountEditText cryptoAmountEditText, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.amountEditText = cryptoAmountEditText;
        this.frontSymbolText = rhTextView;
        this.rearSymbolText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoAmountInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C40095R.layout.merge_crypto_amount_input_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoAmountInputViewBinding bind(View view) {
        int i = C40095R.id.amount_edit_text;
        CryptoAmountEditText cryptoAmountEditText = (CryptoAmountEditText) ViewBindings.findChildViewById(view, i);
        if (cryptoAmountEditText != null) {
            i = C40095R.id.front_symbol_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C40095R.id.rear_symbol_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeCryptoAmountInputViewBinding(view, cryptoAmountEditText, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
