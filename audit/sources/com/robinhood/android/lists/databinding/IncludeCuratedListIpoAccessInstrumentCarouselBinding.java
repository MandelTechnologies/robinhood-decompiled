package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessInstrumentCarousel;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessInstrumentCarouselBinding implements ViewBinding {
    private final CuratedListIpoAccessInstrumentCarousel rootView;

    private IncludeCuratedListIpoAccessInstrumentCarouselBinding(CuratedListIpoAccessInstrumentCarousel curatedListIpoAccessInstrumentCarousel) {
        this.rootView = curatedListIpoAccessInstrumentCarousel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListIpoAccessInstrumentCarousel getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessInstrumentCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessInstrumentCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_instrument_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessInstrumentCarouselBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListIpoAccessInstrumentCarouselBinding((CuratedListIpoAccessInstrumentCarousel) view);
    }
}
