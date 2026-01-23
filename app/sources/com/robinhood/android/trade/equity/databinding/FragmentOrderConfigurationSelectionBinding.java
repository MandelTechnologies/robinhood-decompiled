package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentOrderConfigurationSelectionBinding implements ViewBinding {
    public final RecyclerView recyclerView;
    private final RecyclerView rootView;

    private FragmentOrderConfigurationSelectionBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentOrderConfigurationSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderConfigurationSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_order_configuration_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderConfigurationSelectionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentOrderConfigurationSelectionBinding(recyclerView, recyclerView);
    }
}
