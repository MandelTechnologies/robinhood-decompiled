package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.recentSearch.RecentSearchRowView;

/* loaded from: classes5.dex */
public final class IncludeRowRecentSearchViewBinding implements ViewBinding {
    private final RecentSearchRowView rootView;

    private IncludeRowRecentSearchViewBinding(RecentSearchRowView recentSearchRowView) {
        this.rootView = recentSearchRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecentSearchRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowRecentSearchViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowRecentSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_row_recent_search_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowRecentSearchViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowRecentSearchViewBinding((RecentSearchRowView) view);
    }
}
