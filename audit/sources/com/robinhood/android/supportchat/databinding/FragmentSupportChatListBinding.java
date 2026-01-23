package com.robinhood.android.supportchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.supportchat.C29104R;

/* loaded from: classes9.dex */
public final class FragmentSupportChatListBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ErrorView supportChatListErrorView;
    public final ShimmerLoadingView supportChatListLoadingView;
    public final RecyclerView supportChatListRecyclerView;
    public final SwipeRefreshLayout supportChatListSwipeRefreshLayout;

    private FragmentSupportChatListBinding(ConstraintLayout constraintLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = constraintLayout;
        this.supportChatListErrorView = errorView;
        this.supportChatListLoadingView = shimmerLoadingView;
        this.supportChatListRecyclerView = recyclerView;
        this.supportChatListSwipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSupportChatListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSupportChatListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29104R.layout.fragment_support_chat_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSupportChatListBinding bind(View view) {
        int i = C29104R.id.support_chat_list_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C29104R.id.support_chat_list_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C29104R.id.support_chat_list_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C29104R.id.support_chat_list_swipe_refresh_layout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i);
                    if (swipeRefreshLayout != null) {
                        return new FragmentSupportChatListBinding((ConstraintLayout) view, errorView, shimmerLoadingView, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
