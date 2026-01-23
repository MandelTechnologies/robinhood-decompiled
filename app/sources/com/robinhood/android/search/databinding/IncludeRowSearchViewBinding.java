package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchRowView;

/* loaded from: classes5.dex */
public final class IncludeRowSearchViewBinding implements ViewBinding {
    private final SearchRowView rootView;

    private IncludeRowSearchViewBinding(SearchRowView searchRowView) {
        this.rootView = searchRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SearchRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowSearchViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_row_search_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowSearchViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowSearchViewBinding((SearchRowView) view);
    }
}
