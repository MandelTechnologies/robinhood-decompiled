package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.performance.PerformanceViewSdp;

/* loaded from: classes3.dex */
public final class IncludePerformanceViewSdpBinding implements ViewBinding {
    private final PerformanceViewSdp rootView;

    private IncludePerformanceViewSdpBinding(PerformanceViewSdp performanceViewSdp) {
        this.rootView = performanceViewSdp;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PerformanceViewSdp getRoot() {
        return this.rootView;
    }

    public static IncludePerformanceViewSdpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludePerformanceViewSdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_performance_view_sdp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludePerformanceViewSdpBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludePerformanceViewSdpBinding((PerformanceViewSdp) view);
    }
}
