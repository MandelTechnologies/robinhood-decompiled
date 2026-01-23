package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;

/* loaded from: classes24.dex */
public final class IncludeAssetReviewToolbarEditButtonBinding implements ViewBinding {
    public final RdsRippleContainerView actionEdit;
    private final ConstraintLayout rootView;

    private IncludeAssetReviewToolbarEditButtonBinding(ConstraintLayout constraintLayout, RdsRippleContainerView rdsRippleContainerView) {
        this.rootView = constraintLayout;
        this.actionEdit = rdsRippleContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAssetReviewToolbarEditButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAssetReviewToolbarEditButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.include_asset_review_toolbar_edit_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAssetReviewToolbarEditButtonBinding bind(View view) {
        int i = C7686R.id.action_edit;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            return new IncludeAssetReviewToolbarEditButtonBinding((ConstraintLayout) view, rdsRippleContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
