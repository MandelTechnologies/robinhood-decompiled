package com.robinhood.android.common.options.bottomsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.bottomsheet.C11312R;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes2.dex */
public final class FragmentStrategyBuilderSpreadBinding implements ViewBinding {
    public final RecyclerView bottomSheetFragmentList;
    public final View contentDivider;
    public final RdsButton continueBtn;
    private final ConstraintLayout rootView;
    public final Space space;

    private FragmentStrategyBuilderSpreadBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, RdsButton rdsButton, Space space) {
        this.rootView = constraintLayout;
        this.bottomSheetFragmentList = recyclerView;
        this.contentDivider = view;
        this.continueBtn = rdsButton;
        this.space = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentStrategyBuilderSpreadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStrategyBuilderSpreadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11312R.layout.fragment_strategy_builder_spread, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentStrategyBuilderSpreadBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11312R.id.bottom_sheet_fragment_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11312R.id.content_divider))) != null) {
            i = C11312R.id.continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11312R.id.space;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    return new FragmentStrategyBuilderSpreadBinding((ConstraintLayout) view, recyclerView, viewFindChildViewById, rdsButton, space);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
