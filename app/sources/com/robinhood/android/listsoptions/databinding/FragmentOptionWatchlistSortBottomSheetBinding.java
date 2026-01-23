package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class FragmentOptionWatchlistSortBottomSheetBinding implements ViewBinding {
    public final RdsButton optionWatchlistSortDoneBtn;
    public final RecyclerView optionWatchlistSortRecyclerView;
    private final LinearLayout rootView;

    private FragmentOptionWatchlistSortBottomSheetBinding(LinearLayout linearLayout, RdsButton rdsButton, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.optionWatchlistSortDoneBtn = rdsButton;
        this.optionWatchlistSortRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionWatchlistSortBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionWatchlistSortBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.fragment_option_watchlist_sort_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionWatchlistSortBottomSheetBinding bind(View view) {
        int i = C20943R.id.option_watchlist_sort_done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20943R.id.option_watchlist_sort_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentOptionWatchlistSortBottomSheetBinding((LinearLayout) view, rdsButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
