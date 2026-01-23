package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class IncludeGenericActionableInfoLoadingBinding implements ViewBinding {
    public final Barrier genericActionableInfoLoadingBarrier;
    public final Barrier genericActionableInfoLoadingBarrier2;
    public final View genericActionableInfoLoadingDetail;
    public final Guideline genericActionableInfoLoadingGuideline;
    public final View genericActionableInfoLoadingImage;
    public final View genericActionableInfoLoadingPrimaryAction;
    public final View genericActionableInfoLoadingTitle;
    private final ConstraintLayout rootView;

    private IncludeGenericActionableInfoLoadingBinding(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, View view, Guideline guideline, View view2, View view3, View view4) {
        this.rootView = constraintLayout;
        this.genericActionableInfoLoadingBarrier = barrier;
        this.genericActionableInfoLoadingBarrier2 = barrier2;
        this.genericActionableInfoLoadingDetail = view;
        this.genericActionableInfoLoadingGuideline = guideline;
        this.genericActionableInfoLoadingImage = view2;
        this.genericActionableInfoLoadingPrimaryAction = view3;
        this.genericActionableInfoLoadingTitle = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeGenericActionableInfoLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeGenericActionableInfoLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_generic_actionable_info_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeGenericActionableInfoLoadingBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = C11048R.id.generic_actionable_info_loading_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C11048R.id.generic_actionable_info_loading_barrier2;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11048R.id.generic_actionable_info_loading_detail))) != null) {
                i = C11048R.id.generic_actionable_info_loading_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11048R.id.generic_actionable_info_loading_image))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C11048R.id.generic_actionable_info_loading_primary_action))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C11048R.id.generic_actionable_info_loading_title))) != null) {
                    return new IncludeGenericActionableInfoLoadingBinding((ConstraintLayout) view, barrier, barrier2, viewFindChildViewById, guideline, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
