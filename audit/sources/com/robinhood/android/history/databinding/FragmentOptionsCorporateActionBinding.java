package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentOptionsCorporateActionBinding implements ViewBinding {
    public final RecyclerView recyclerView;
    private final RecyclerView rootView;

    private FragmentOptionsCorporateActionBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsCorporateActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsCorporateActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_options_corporate_action, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsCorporateActionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentOptionsCorporateActionBinding(recyclerView, recyclerView);
    }
}
