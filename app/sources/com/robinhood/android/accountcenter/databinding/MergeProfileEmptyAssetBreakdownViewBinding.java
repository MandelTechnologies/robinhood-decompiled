package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class MergeProfileEmptyAssetBreakdownViewBinding implements ViewBinding {
    public final CuratedListChipRecyclerView profileEmptyAssetBreakdownCuratedListsView;
    public final RhTextView profileEmptyAssetBreakdownDescriptionTxt;
    private final View rootView;

    private MergeProfileEmptyAssetBreakdownViewBinding(View view, CuratedListChipRecyclerView curatedListChipRecyclerView, RhTextView rhTextView) {
        this.rootView = view;
        this.profileEmptyAssetBreakdownCuratedListsView = curatedListChipRecyclerView;
        this.profileEmptyAssetBreakdownDescriptionTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProfileEmptyAssetBreakdownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8293R.layout.merge_profile_empty_asset_breakdown_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProfileEmptyAssetBreakdownViewBinding bind(View view) {
        int i = C8293R.id.profile_empty_asset_breakdown_curated_lists_view;
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
        if (curatedListChipRecyclerView != null) {
            i = C8293R.id.profile_empty_asset_breakdown_description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeProfileEmptyAssetBreakdownViewBinding(view, curatedListChipRecyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
