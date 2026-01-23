package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class ActivityInvestFlowBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final ConstraintLayout rootView;

    private ActivityInvestFlowBinding(ConstraintLayout constraintLayout, FragmentContainerLayout fragmentContainerLayout) {
        this.rootView = constraintLayout;
        this.fragmentContainer = fragmentContainerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityInvestFlowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityInvestFlowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.activity_invest_flow, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityInvestFlowBinding bind(View view) {
        int i = C19349R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            return new ActivityInvestFlowBinding((ConstraintLayout) view, fragmentContainerLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
