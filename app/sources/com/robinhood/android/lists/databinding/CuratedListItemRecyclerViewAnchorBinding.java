package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListItemRecyclerViewAnchorBinding implements ViewBinding {
    private final View rootView;

    private CuratedListItemRecyclerViewAnchorBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static CuratedListItemRecyclerViewAnchorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListItemRecyclerViewAnchorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_item_recycler_view_anchor, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListItemRecyclerViewAnchorBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CuratedListItemRecyclerViewAnchorBinding(view);
    }
}
