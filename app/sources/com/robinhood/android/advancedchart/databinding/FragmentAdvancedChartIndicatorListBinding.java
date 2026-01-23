package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedChartIndicatorListBinding implements ViewBinding {
    public final RdsButton addIndicatorBottomButton;
    public final RhTextView emptyTxt;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private FragmentAdvancedChartIndicatorListBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.addIndicatorBottomButton = rdsButton;
        this.emptyTxt = rhTextView;
        this.recyclerView = recyclerView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedChartIndicatorListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedChartIndicatorListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.fragment_advanced_chart_indicator_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedChartIndicatorListBinding bind(View view) {
        int i = C8502R.id.add_indicator_bottom_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8502R.id.empty_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C8502R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C8502R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentAdvancedChartIndicatorListBinding((ConstraintLayout) view, rdsButton, rhTextView, recyclerView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
