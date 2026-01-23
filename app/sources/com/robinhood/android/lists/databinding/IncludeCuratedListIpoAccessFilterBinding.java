package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessFilterView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessFilterBinding implements ViewBinding {
    private final CuratedListIpoAccessFilterView rootView;

    private IncludeCuratedListIpoAccessFilterBinding(CuratedListIpoAccessFilterView curatedListIpoAccessFilterView) {
        this.rootView = curatedListIpoAccessFilterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListIpoAccessFilterView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessFilterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessFilterBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListIpoAccessFilterBinding((CuratedListIpoAccessFilterView) view);
    }
}
