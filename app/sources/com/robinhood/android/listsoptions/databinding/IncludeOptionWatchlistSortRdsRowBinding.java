package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class IncludeOptionWatchlistSortRdsRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeOptionWatchlistSortRdsRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionWatchlistSortRdsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionWatchlistSortRdsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.include_option_watchlist_sort_rds_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionWatchlistSortRdsRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionWatchlistSortRdsRowBinding((RdsRowView) view);
    }
}
