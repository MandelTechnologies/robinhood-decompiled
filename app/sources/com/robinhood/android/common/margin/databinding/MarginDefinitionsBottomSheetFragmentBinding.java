package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MarginDefinitionsBottomSheetFragmentBinding implements ViewBinding {
    public final RdsButton gotItBtn;
    public final RecyclerView marginDefinitionsList;
    private final ConstraintLayout rootView;
    public final RhTextView title;

    private MarginDefinitionsBottomSheetFragmentBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.gotItBtn = rdsButton;
        this.marginDefinitionsList = recyclerView;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MarginDefinitionsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MarginDefinitionsBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.margin_definitions_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MarginDefinitionsBottomSheetFragmentBinding bind(View view) {
        int i = C11223R.id.got_it_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C11223R.id.margin_definitions_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C11223R.id.title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new MarginDefinitionsBottomSheetFragmentBinding((ConstraintLayout) view, rdsButton, recyclerView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
