package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeRhListCuratedListChipCarouselBinding implements ViewBinding {
    public final CuratedListChipRecyclerView rhListCuratedListChipCarousel;
    private final View rootView;

    private MergeRhListCuratedListChipCarouselBinding(View view, CuratedListChipRecyclerView curatedListChipRecyclerView) {
        this.rootView = view;
        this.rhListCuratedListChipCarousel = curatedListChipRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhListCuratedListChipCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_rh_list_curated_list_chip_carousel, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhListCuratedListChipCarouselBinding bind(View view) {
        int i = C20839R.id.rh_list_curated_list_chip_carousel;
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
        if (curatedListChipRecyclerView != null) {
            return new MergeRhListCuratedListChipCarouselBinding(view, curatedListChipRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
