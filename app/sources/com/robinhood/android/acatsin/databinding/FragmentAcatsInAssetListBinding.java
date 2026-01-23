package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInAssetListBinding implements ViewBinding {
    public final RecyclerView assetListRecycler;
    public final HorizontalScrollView assetTypeChipContainer;
    public final ChipGroup assetTypeChipGroup;
    public final ShimmerLoadingView loadingView;
    private final LinearLayout rootView;

    private FragmentAcatsInAssetListBinding(LinearLayout linearLayout, RecyclerView recyclerView, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = linearLayout;
        this.assetListRecycler = recyclerView;
        this.assetTypeChipContainer = horizontalScrollView;
        this.assetTypeChipGroup = chipGroup;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInAssetListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInAssetListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_asset_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInAssetListBinding bind(View view) {
        int i = C7725R.id.asset_list_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C7725R.id.asset_type_chip_container;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
            if (horizontalScrollView != null) {
                i = C7725R.id.asset_type_chip_group;
                ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
                if (chipGroup != null) {
                    i = C7725R.id.loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        return new FragmentAcatsInAssetListBinding((LinearLayout) view, recyclerView, horizontalScrollView, chipGroup, shimmerLoadingView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
