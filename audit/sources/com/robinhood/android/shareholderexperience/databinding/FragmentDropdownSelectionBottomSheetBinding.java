package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class FragmentDropdownSelectionBottomSheetBinding implements ViewBinding {
    public final RecyclerView dropdownSelectionRecyclerView;
    public final RhTextView dropdownSelectionTitle;
    private final LinearLayout rootView;

    private FragmentDropdownSelectionBottomSheetBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.dropdownSelectionRecyclerView = recyclerView;
        this.dropdownSelectionTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDropdownSelectionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDropdownSelectionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.fragment_dropdown_selection_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDropdownSelectionBottomSheetBinding bind(View view) {
        int i = C28477R.id.dropdown_selection_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C28477R.id.dropdown_selection_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentDropdownSelectionBottomSheetBinding((LinearLayout) view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
