package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListUserSortOptionsView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListSortOptionViewBinding implements ViewBinding {
    public final CuratedListUserSortOptionsView curatedListSortOptionView;
    private final CuratedListUserSortOptionsView rootView;

    private IncludeCuratedListSortOptionViewBinding(CuratedListUserSortOptionsView curatedListUserSortOptionsView, CuratedListUserSortOptionsView curatedListUserSortOptionsView2) {
        this.rootView = curatedListUserSortOptionsView;
        this.curatedListSortOptionView = curatedListUserSortOptionsView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListUserSortOptionsView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListSortOptionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListSortOptionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_sort_option_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListSortOptionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CuratedListUserSortOptionsView curatedListUserSortOptionsView = (CuratedListUserSortOptionsView) view;
        return new IncludeCuratedListSortOptionViewBinding(curatedListUserSortOptionsView, curatedListUserSortOptionsView);
    }
}
