package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListSortItemsBottomSheetFragmentBinding implements ViewBinding {
    public final RdsButton curatedListItemSortDoneBtn;
    public final RecyclerView curatedListItemSortOptionRecyclerView;
    private final LinearLayout rootView;

    private CuratedListSortItemsBottomSheetFragmentBinding(LinearLayout linearLayout, RdsButton rdsButton, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.curatedListItemSortDoneBtn = rdsButton;
        this.curatedListItemSortOptionRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListSortItemsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListSortItemsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_sort_items_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListSortItemsBottomSheetFragmentBinding bind(View view) {
        int i = C20839R.id.curated_list_item_sort_done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20839R.id.curated_list_item_sort_option_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new CuratedListSortItemsBottomSheetFragmentBinding((LinearLayout) view, rdsButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
