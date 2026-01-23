package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentAnalystReportBinding implements ViewBinding {
    public final RdsProgressBar loadingView;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final FrameLayout tradeBarFragment;

    private FragmentAnalystReportBinding(FrameLayout frameLayout, RdsProgressBar rdsProgressBar, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.loadingView = rdsProgressBar;
        this.recyclerView = recyclerView;
        this.tradeBarFragment = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAnalystReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAnalystReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_analyst_report, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAnalystReportBinding bind(View view) {
        int i = C15314R.id.loading_view;
        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
        if (rdsProgressBar != null) {
            i = C15314R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C15314R.id.trade_bar_fragment;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    return new FragmentAnalystReportBinding((FrameLayout) view, rdsProgressBar, recyclerView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
