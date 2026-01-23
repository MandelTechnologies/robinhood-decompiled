package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistGraphLayout;

/* loaded from: classes8.dex */
public final class FragmentOptionWatchlistHubContentBinding implements ViewBinding {
    public final OptionWatchlistGraphLayout optionWatchlistGraphLayout;
    public final RecyclerView optionWatchlistRecyclerView;
    private final LinearLayout rootView;

    private FragmentOptionWatchlistHubContentBinding(LinearLayout linearLayout, OptionWatchlistGraphLayout optionWatchlistGraphLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.optionWatchlistGraphLayout = optionWatchlistGraphLayout;
        this.optionWatchlistRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionWatchlistHubContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionWatchlistHubContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.fragment_option_watchlist_hub_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionWatchlistHubContentBinding bind(View view) {
        int i = C20943R.id.option_watchlist_graph_layout;
        OptionWatchlistGraphLayout optionWatchlistGraphLayout = (OptionWatchlistGraphLayout) ViewBindings.findChildViewById(view, i);
        if (optionWatchlistGraphLayout != null) {
            i = C20943R.id.option_watchlist_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentOptionWatchlistHubContentBinding((LinearLayout) view, optionWatchlistGraphLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
