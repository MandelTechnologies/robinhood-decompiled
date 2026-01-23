package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListCarouselView;

/* loaded from: classes8.dex */
public final class IncludeRhListCuratedListChipCarouselBinding implements ViewBinding {
    public final CuratedListRhListCarouselView rhListCuratedListChipContainer;
    private final CuratedListRhListCarouselView rootView;

    private IncludeRhListCuratedListChipCarouselBinding(CuratedListRhListCarouselView curatedListRhListCarouselView, CuratedListRhListCarouselView curatedListRhListCarouselView2) {
        this.rootView = curatedListRhListCarouselView;
        this.rhListCuratedListChipContainer = curatedListRhListCarouselView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListRhListCarouselView getRoot() {
        return this.rootView;
    }

    public static IncludeRhListCuratedListChipCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhListCuratedListChipCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_rh_list_curated_list_chip_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhListCuratedListChipCarouselBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CuratedListRhListCarouselView curatedListRhListCarouselView = (CuratedListRhListCarouselView) view;
        return new IncludeRhListCuratedListChipCarouselBinding(curatedListRhListCarouselView, curatedListRhListCarouselView);
    }
}
