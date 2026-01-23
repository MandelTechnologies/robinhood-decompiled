package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessHeaderView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessHeaderBinding implements ViewBinding {
    private final CuratedListIpoAccessHeaderView rootView;

    private IncludeCuratedListIpoAccessHeaderBinding(CuratedListIpoAccessHeaderView curatedListIpoAccessHeaderView) {
        this.rootView = curatedListIpoAccessHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListIpoAccessHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListIpoAccessHeaderBinding((CuratedListIpoAccessHeaderView) view);
    }
}
