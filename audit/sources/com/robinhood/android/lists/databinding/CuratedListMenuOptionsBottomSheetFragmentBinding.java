package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButtonContainerView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListMenuOptionsBottomSheetFragmentBinding implements ViewBinding {
    public final RdsButtonContainerView curatedListMenuOptionsDoneButtonContainer;
    public final RecyclerView curatedListMenuOptionsRecyclerView;
    private final LinearLayout rootView;

    private CuratedListMenuOptionsBottomSheetFragmentBinding(LinearLayout linearLayout, RdsButtonContainerView rdsButtonContainerView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.curatedListMenuOptionsDoneButtonContainer = rdsButtonContainerView;
        this.curatedListMenuOptionsRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListMenuOptionsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListMenuOptionsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_menu_options_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListMenuOptionsBottomSheetFragmentBinding bind(View view) {
        int i = C20839R.id.curated_list_menu_options_done_button_container;
        RdsButtonContainerView rdsButtonContainerView = (RdsButtonContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsButtonContainerView != null) {
            i = C20839R.id.curated_list_menu_options_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new CuratedListMenuOptionsBottomSheetFragmentBinding((LinearLayout) view, rdsButtonContainerView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
