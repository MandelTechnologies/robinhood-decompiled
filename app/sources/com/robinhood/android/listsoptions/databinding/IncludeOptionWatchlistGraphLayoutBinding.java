package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistGraphLayout;

/* loaded from: classes8.dex */
public final class IncludeOptionWatchlistGraphLayoutBinding implements ViewBinding {
    private final OptionWatchlistGraphLayout rootView;

    private IncludeOptionWatchlistGraphLayoutBinding(OptionWatchlistGraphLayout optionWatchlistGraphLayout) {
        this.rootView = optionWatchlistGraphLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionWatchlistGraphLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOptionWatchlistGraphLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionWatchlistGraphLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.include_option_watchlist_graph_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionWatchlistGraphLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionWatchlistGraphLayoutBinding((OptionWatchlistGraphLayout) view);
    }
}
