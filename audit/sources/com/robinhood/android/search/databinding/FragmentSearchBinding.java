package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.p250ui.SearchToolbarViewWrapper;

/* loaded from: classes5.dex */
public final class FragmentSearchBinding implements ViewBinding {
    public final RhTextView emptyRecentSearchText;
    public final LinearLayout recentSearchDefaultView;
    public final RecyclerView recentSearchList;
    private final LinearLayout rootView;
    public final SearchToolbarViewWrapper searchBarViewWrapper;
    public final RecyclerView searchDiscoverList;
    public final RecyclerView searchResultsList;
    public final SwipeRefreshLayout swipeRefreshView;

    private FragmentSearchBinding(LinearLayout linearLayout, RhTextView rhTextView, LinearLayout linearLayout2, RecyclerView recyclerView, SearchToolbarViewWrapper searchToolbarViewWrapper, RecyclerView recyclerView2, RecyclerView recyclerView3, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = linearLayout;
        this.emptyRecentSearchText = rhTextView;
        this.recentSearchDefaultView = linearLayout2;
        this.recentSearchList = recyclerView;
        this.searchBarViewWrapper = searchToolbarViewWrapper;
        this.searchDiscoverList = recyclerView2;
        this.searchResultsList = recyclerView3;
        this.swipeRefreshView = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSearchBinding bind(View view) {
        int i = C27909R.id.empty_recent_search_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.recent_search_default_view;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C27909R.id.recent_search_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C27909R.id.search_bar_view_wrapper;
                    SearchToolbarViewWrapper searchToolbarViewWrapper = (SearchToolbarViewWrapper) ViewBindings.findChildViewById(view, i);
                    if (searchToolbarViewWrapper != null) {
                        i = C27909R.id.search_discover_list;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            i = C27909R.id.search_results_list;
                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView3 != null) {
                                i = C27909R.id.swipe_refresh_view;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i);
                                if (swipeRefreshLayout != null) {
                                    return new FragmentSearchBinding((LinearLayout) view, rhTextView, linearLayout, recyclerView, searchToolbarViewWrapper, recyclerView2, recyclerView3, swipeRefreshLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
