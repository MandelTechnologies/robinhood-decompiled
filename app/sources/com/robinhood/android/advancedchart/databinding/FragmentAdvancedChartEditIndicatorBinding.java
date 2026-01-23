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
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedChartEditIndicatorBinding implements ViewBinding {
    public final RdsButton doneBtn;
    public final RdsNumpadView numpad;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final RhTextView title;

    private FragmentAdvancedChartEditIndicatorBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsNumpadView rdsNumpadView, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.doneBtn = rdsButton;
        this.numpad = rdsNumpadView;
        this.recyclerView = recyclerView;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedChartEditIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedChartEditIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.fragment_advanced_chart_edit_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedChartEditIndicatorBinding bind(View view) {
        int i = C8502R.id.done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8502R.id.numpad;
            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadView != null) {
                i = C8502R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C8502R.id.title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentAdvancedChartEditIndicatorBinding((ConstraintLayout) view, rdsButton, rdsNumpadView, recyclerView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
