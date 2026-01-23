package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.carousel.EquityInstrumentCarousel;

/* loaded from: classes3.dex */
public final class MergeSimilarInstrumentsBinding implements ViewBinding {
    public final EquityInstrumentCarousel instrumentCarousel;
    private final View rootView;
    public final RhTextView similarInstrumentDescription;

    private MergeSimilarInstrumentsBinding(View view, EquityInstrumentCarousel equityInstrumentCarousel, RhTextView rhTextView) {
        this.rootView = view;
        this.instrumentCarousel = equityInstrumentCarousel;
        this.similarInstrumentDescription = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSimilarInstrumentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_similar_instruments, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSimilarInstrumentsBinding bind(View view) {
        int i = C15314R.id.instrument_carousel;
        EquityInstrumentCarousel equityInstrumentCarousel = (EquityInstrumentCarousel) ViewBindings.findChildViewById(view, i);
        if (equityInstrumentCarousel != null) {
            i = C15314R.id.similar_instrument_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeSimilarInstrumentsBinding(view, equityInstrumentCarousel, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
