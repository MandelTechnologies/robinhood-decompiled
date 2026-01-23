package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListSortOptionItemView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListSortOptionsItemViewBinding implements ViewBinding {
    private final CuratedListSortOptionItemView rootView;

    private IncludeCuratedListSortOptionsItemViewBinding(CuratedListSortOptionItemView curatedListSortOptionItemView) {
        this.rootView = curatedListSortOptionItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListSortOptionItemView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListSortOptionsItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListSortOptionsItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_sort_options_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListSortOptionsItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListSortOptionsItemViewBinding((CuratedListSortOptionItemView) view);
    }
}
