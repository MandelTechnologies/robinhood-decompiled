package com.robinhood.android.common.p088ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;

/* loaded from: classes2.dex */
public final class ActivityRdsLoadingBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;

    private ActivityRdsLoadingBinding(ShimmerLoadingView shimmerLoadingView) {
        this.rootView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static ActivityRdsLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRdsLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11839R.layout.activity_rds_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRdsLoadingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ActivityRdsLoadingBinding((ShimmerLoadingView) view);
    }
}
