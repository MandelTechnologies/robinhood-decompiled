package com.robinhood.android.common.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.equitydetail.C11150R;
import com.robinhood.android.common.equitydetail.performance.PerformanceView;

/* loaded from: classes2.dex */
public final class IncludePerformanceViewBinding implements ViewBinding {
    private final PerformanceView rootView;

    private IncludePerformanceViewBinding(PerformanceView performanceView) {
        this.rootView = performanceView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PerformanceView getRoot() {
        return this.rootView;
    }

    public static IncludePerformanceViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludePerformanceViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11150R.layout.include_performance_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludePerformanceViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludePerformanceViewBinding((PerformanceView) view);
    }
}
