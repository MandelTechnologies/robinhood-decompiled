package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class FragmentOptionEditLegRatioBinding implements ViewBinding {
    public final RhTextView optionEditLegRatioDescription;
    public final RdsNumpadContainerView optionEditLegRatioNumpad;
    public final RecyclerView optionEditLegRatioRecyclerView;
    public final RhTextView optionEditLegRatioTitle;
    private final ConstraintLayout rootView;

    private FragmentOptionEditLegRatioBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsNumpadContainerView rdsNumpadContainerView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.optionEditLegRatioDescription = rhTextView;
        this.optionEditLegRatioNumpad = rdsNumpadContainerView;
        this.optionEditLegRatioRecyclerView = recyclerView;
        this.optionEditLegRatioTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionEditLegRatioBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionEditLegRatioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.fragment_option_edit_leg_ratio, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionEditLegRatioBinding bind(View view) {
        int i = C24135R.id.option_edit_leg_ratio_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24135R.id.option_edit_leg_ratio_numpad;
            RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadContainerView != null) {
                i = C24135R.id.option_edit_leg_ratio_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C24135R.id.option_edit_leg_ratio_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentOptionEditLegRatioBinding((ConstraintLayout) view, rhTextView, rdsNumpadContainerView, recyclerView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
