package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowSplitBinding implements ViewBinding {
    public final RhTextView allocationInfoText;
    public final RhTextView allocationTotalText;
    public final RhTextView buyingPowerInfoText;
    public final RdsButton continueBtn;
    public final RdsNumpadView numpad;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;

    private FragmentInvestFlowSplitBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton, RdsNumpadView rdsNumpadView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.allocationInfoText = rhTextView;
        this.allocationTotalText = rhTextView2;
        this.buyingPowerInfoText = rhTextView3;
        this.continueBtn = rdsButton;
        this.numpad = rdsNumpadView;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowSplitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowSplitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_split, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowSplitBinding bind(View view) {
        int i = C19349R.id.allocation_info_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C19349R.id.allocation_total_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C19349R.id.buying_power_info_text;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C19349R.id.continue_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C19349R.id.numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C19349R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new FragmentInvestFlowSplitBinding((ConstraintLayout) view, rhTextView, rhTextView2, rhTextView3, rdsButton, rdsNumpadView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
