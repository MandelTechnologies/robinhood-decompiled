package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessEmptyView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessEmptyViewBinding implements ViewBinding {
    private final CuratedListIpoAccessEmptyView rootView;

    private IncludeCuratedListIpoAccessEmptyViewBinding(CuratedListIpoAccessEmptyView curatedListIpoAccessEmptyView) {
        this.rootView = curatedListIpoAccessEmptyView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListIpoAccessEmptyView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessEmptyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessEmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_empty_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessEmptyViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListIpoAccessEmptyViewBinding((CuratedListIpoAccessEmptyView) view);
    }
}
