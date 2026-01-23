package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchToolbarContainer;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedBinding implements ViewBinding {
    public final ErrorView newsFeedErrorRetryView;
    public final FrameLayout newsFeedFragmentRootContainer;
    public final LoggedRecyclerView recyclerView;
    private final FrameLayout rootView;
    public final SearchToolbarContainer searchToolbarContainer;
    public final RdsTextInputEditText searchToolbarEdt;
    public final SwipeRefreshLayout swipeRefreshView;

    private FragmentNewsFeedBinding(FrameLayout frameLayout, ErrorView errorView, FrameLayout frameLayout2, LoggedRecyclerView loggedRecyclerView, SearchToolbarContainer searchToolbarContainer, RdsTextInputEditText rdsTextInputEditText, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = frameLayout;
        this.newsFeedErrorRetryView = errorView;
        this.newsFeedFragmentRootContainer = frameLayout2;
        this.recyclerView = loggedRecyclerView;
        this.searchToolbarContainer = searchToolbarContainer;
        this.searchToolbarEdt = rdsTextInputEditText;
        this.swipeRefreshView = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedBinding bind(View view) {
        int i = C27909R.id.news_feed_error_retry_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = C27909R.id.recycler_view;
            LoggedRecyclerView loggedRecyclerView = (LoggedRecyclerView) ViewBindings.findChildViewById(view, i);
            if (loggedRecyclerView != null) {
                i = C27909R.id.search_toolbar_container;
                SearchToolbarContainer searchToolbarContainer = (SearchToolbarContainer) ViewBindings.findChildViewById(view, i);
                if (searchToolbarContainer != null) {
                    i = C27909R.id.search_toolbar_edt;
                    RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputEditText != null) {
                        i = C27909R.id.swipe_refresh_view;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i);
                        if (swipeRefreshLayout != null) {
                            return new FragmentNewsFeedBinding(frameLayout, errorView, frameLayout, loggedRecyclerView, searchToolbarContainer, rdsTextInputEditText, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
