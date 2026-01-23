package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentAverageCostUnavailableBinding implements ViewBinding {
    private final ScrollView rootView;

    private FragmentAverageCostUnavailableBinding(ScrollView scrollView) {
        this.rootView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAverageCostUnavailableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAverageCostUnavailableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_average_cost_unavailable, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAverageCostUnavailableBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentAverageCostUnavailableBinding((ScrollView) view);
    }
}
