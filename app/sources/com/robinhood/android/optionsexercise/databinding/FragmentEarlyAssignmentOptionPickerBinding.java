package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentEarlyAssignmentOptionPickerBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final LinearLayout optionPickerMainLayout;
    public final LinearLayout optionPickerNoContractsLayout;
    public final RecyclerView optionPickerRecyclerview;
    private final FrameLayout rootView;

    private FragmentEarlyAssignmentOptionPickerBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.optionPickerMainLayout = linearLayout;
        this.optionPickerNoContractsLayout = linearLayout2;
        this.optionPickerRecyclerview = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEarlyAssignmentOptionPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEarlyAssignmentOptionPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_early_assignment_option_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEarlyAssignmentOptionPickerBinding bind(View view) {
        int i = C24704R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C24704R.id.option_picker_main_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C24704R.id.option_picker_no_contracts_layout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C24704R.id.option_picker_recyclerview;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new FragmentEarlyAssignmentOptionPickerBinding((FrameLayout) view, shimmerLoadingView, linearLayout, linearLayout2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
