package com.robinhood.android.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.waitlist.C31444R;

/* loaded from: classes9.dex */
public final class FragmentWaitlistLoadingBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;

    private FragmentWaitlistLoadingBinding(ShimmerLoadingView shimmerLoadingView) {
        this.rootView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentWaitlistLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWaitlistLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31444R.layout.fragment_waitlist_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWaitlistLoadingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentWaitlistLoadingBinding((ShimmerLoadingView) view);
    }
}
