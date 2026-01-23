package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeCuratedListIpoAccessFilterBinding implements ViewBinding {
    public final RecyclerView chipRecyclerView;
    private final View rootView;

    private MergeCuratedListIpoAccessFilterBinding(View view, RecyclerView recyclerView) {
        this.rootView = view;
        this.chipRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListIpoAccessFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_ipo_access_filter, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListIpoAccessFilterBinding bind(View view) {
        int i = C20839R.id.chip_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new MergeCuratedListIpoAccessFilterBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
