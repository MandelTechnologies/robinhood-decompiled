package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListHeaderView;

/* loaded from: classes8.dex */
public final class IncludeRhListHeaderViewBinding implements ViewBinding {
    private final CuratedListRhListHeaderView rootView;

    private IncludeRhListHeaderViewBinding(CuratedListRhListHeaderView curatedListRhListHeaderView) {
        this.rootView = curatedListRhListHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListRhListHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeRhListHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_rh_list_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhListHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRhListHeaderViewBinding((CuratedListRhListHeaderView) view);
    }
}
