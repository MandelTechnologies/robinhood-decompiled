package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeRelatedIndustryViewBinding implements ViewBinding {
    public final CuratedListChipRecyclerView relatedIndustryCuratedListRecyclerView;
    private final View rootView;

    private MergeRelatedIndustryViewBinding(View view, CuratedListChipRecyclerView curatedListChipRecyclerView) {
        this.rootView = view;
        this.relatedIndustryCuratedListRecyclerView = curatedListChipRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRelatedIndustryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_related_industry_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRelatedIndustryViewBinding bind(View view) {
        int i = C15314R.id.related_industry_curated_list_recycler_view;
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
        if (curatedListChipRecyclerView != null) {
            return new MergeRelatedIndustryViewBinding(view, curatedListChipRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
