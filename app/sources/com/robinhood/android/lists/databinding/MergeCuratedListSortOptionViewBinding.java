package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeCuratedListSortOptionViewBinding implements ViewBinding {
    public final RdsChip curatedListSortChip;
    private final View rootView;

    private MergeCuratedListSortOptionViewBinding(View view, RdsChip rdsChip) {
        this.rootView = view;
        this.curatedListSortChip = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListSortOptionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_sort_option_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListSortOptionViewBinding bind(View view) {
        int i = C20839R.id.curated_list_sort_chip;
        RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
        if (rdsChip != null) {
            return new MergeCuratedListSortOptionViewBinding(view, rdsChip);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
