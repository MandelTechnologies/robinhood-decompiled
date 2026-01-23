package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class FragmentInboxThreadListBinding implements ViewBinding {
    public final ErrorView errorView;
    public final RdsProgressBar progressBar;
    public final LoggedRecyclerView recyclerView;
    private final FrameLayout rootView;
    public final SwipeRefreshLayout swipeRefreshView;

    private FragmentInboxThreadListBinding(FrameLayout frameLayout, ErrorView errorView, RdsProgressBar rdsProgressBar, LoggedRecyclerView loggedRecyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = frameLayout;
        this.errorView = errorView;
        this.progressBar = rdsProgressBar;
        this.recyclerView = loggedRecyclerView;
        this.swipeRefreshView = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInboxThreadListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInboxThreadListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.fragment_inbox_thread_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInboxThreadListBinding bind(View view) {
        int i = C18721R.id.error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C18721R.id.progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C18721R.id.recycler_view;
                LoggedRecyclerView loggedRecyclerView = (LoggedRecyclerView) ViewBindings.findChildViewById(view, i);
                if (loggedRecyclerView != null) {
                    i = C18721R.id.swipe_refresh_view;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i);
                    if (swipeRefreshLayout != null) {
                        return new FragmentInboxThreadListBinding((FrameLayout) view, errorView, rdsProgressBar, loggedRecyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
