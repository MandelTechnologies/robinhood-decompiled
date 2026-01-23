package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDetailView;

/* loaded from: classes8.dex */
public final class IncludeRhListDetailViewBinding implements ViewBinding {
    public final CuratedListRhListDetailView curatedListRhListDetailView;
    private final CuratedListRhListDetailView rootView;

    private IncludeRhListDetailViewBinding(CuratedListRhListDetailView curatedListRhListDetailView, CuratedListRhListDetailView curatedListRhListDetailView2) {
        this.rootView = curatedListRhListDetailView;
        this.curatedListRhListDetailView = curatedListRhListDetailView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListRhListDetailView getRoot() {
        return this.rootView;
    }

    public static IncludeRhListDetailViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhListDetailViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_rh_list_detail_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhListDetailViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CuratedListRhListDetailView curatedListRhListDetailView = (CuratedListRhListDetailView) view;
        return new IncludeRhListDetailViewBinding(curatedListRhListDetailView, curatedListRhListDetailView);
    }
}
