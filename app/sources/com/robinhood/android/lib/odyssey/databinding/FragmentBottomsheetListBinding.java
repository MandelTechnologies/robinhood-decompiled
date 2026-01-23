package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;

/* loaded from: classes8.dex */
public final class FragmentBottomsheetListBinding implements ViewBinding {
    public final RecyclerView bottomSheetFragmentList;
    public final RhTextView bottomSheetFragmentTitle;
    private final LinearLayout rootView;

    private FragmentBottomsheetListBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.bottomSheetFragmentList = recyclerView;
        this.bottomSheetFragmentTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBottomsheetListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomsheetListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_bottomsheet_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomsheetListBinding bind(View view) {
        int i = C20335R.id.bottom_sheet_fragment_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C20335R.id.bottom_sheet_fragment_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentBottomsheetListBinding((LinearLayout) view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
