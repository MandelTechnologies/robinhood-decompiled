package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.view.CryptoInstrumentCarousel;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeAvailableCoinsBinding implements ViewBinding {
    public final RhTextView availableCoinsDescription;
    public final ComposeView availableCoinsHeaderComposeView;
    public final CryptoInstrumentCarousel instrumentCarousel;
    private final View rootView;

    private MergeAvailableCoinsBinding(View view, RhTextView rhTextView, ComposeView composeView, CryptoInstrumentCarousel cryptoInstrumentCarousel) {
        this.rootView = view;
        this.availableCoinsDescription = rhTextView;
        this.availableCoinsHeaderComposeView = composeView;
        this.instrumentCarousel = cryptoInstrumentCarousel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAvailableCoinsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C12757R.layout.merge_available_coins, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAvailableCoinsBinding bind(View view) {
        int i = C12757R.id.available_coins_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C12757R.id.available_coins_header_compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C12757R.id.instrument_carousel;
                CryptoInstrumentCarousel cryptoInstrumentCarousel = (CryptoInstrumentCarousel) ViewBindings.findChildViewById(view, i);
                if (cryptoInstrumentCarousel != null) {
                    return new MergeAvailableCoinsBinding(view, rhTextView, composeView, cryptoInstrumentCarousel);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
