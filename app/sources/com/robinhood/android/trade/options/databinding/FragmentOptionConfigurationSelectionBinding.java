package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.trade.options.C29757R;

/* loaded from: classes9.dex */
public final class FragmentOptionConfigurationSelectionBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    public final RecyclerView recyclerView;
    private final FragmentContainerLayout rootView;

    private FragmentOptionConfigurationSelectionBinding(FragmentContainerLayout fragmentContainerLayout, FragmentContainerLayout fragmentContainerLayout2, RecyclerView recyclerView) {
        this.rootView = fragmentContainerLayout;
        this.fragmentContainer = fragmentContainerLayout2;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FragmentContainerLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionConfigurationSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionConfigurationSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29757R.layout.fragment_option_configuration_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionConfigurationSelectionBinding bind(View view) {
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) view;
        int i = C29757R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentOptionConfigurationSelectionBinding(fragmentContainerLayout, fragmentContainerLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
