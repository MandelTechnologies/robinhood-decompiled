package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.safetylabels.C27803R;

/* loaded from: classes5.dex */
public final class FragmentSafetyLabelsLessonBinding implements ViewBinding {
    public final ErrorView errorView;
    public final ShimmerLoadingView loadingView;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;

    private FragmentSafetyLabelsLessonBinding(FrameLayout frameLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.errorView = errorView;
        this.loadingView = shimmerLoadingView;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSafetyLabelsLessonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSafetyLabelsLessonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27803R.layout.fragment_safety_labels_lesson, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSafetyLabelsLessonBinding bind(View view) {
        int i = C27803R.id.error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C27803R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C27803R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentSafetyLabelsLessonBinding((FrameLayout) view, errorView, shimmerLoadingView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
