package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentAcatsInDetailBinding implements ViewBinding {
    public final RecyclerView footerButtonsRecyclerView;
    public final ShimmerLoadingView loadingView;
    private final ConstraintLayout rootView;
    public final RecyclerView rowRecyclerView;

    private FragmentAcatsInDetailBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView2) {
        this.rootView = constraintLayout;
        this.footerButtonsRecyclerView = recyclerView;
        this.loadingView = shimmerLoadingView;
        this.rowRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_acats_in_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInDetailBinding bind(View view) {
        int i = C18359R.id.footer_buttons_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C18359R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C18359R.id.row_recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null) {
                    return new FragmentAcatsInDetailBinding((ConstraintLayout) view, recyclerView, shimmerLoadingView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
