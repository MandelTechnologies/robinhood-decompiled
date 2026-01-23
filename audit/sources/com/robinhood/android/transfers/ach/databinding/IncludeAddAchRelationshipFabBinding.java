package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.RhFloatingActionButton;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class IncludeAddAchRelationshipFabBinding implements ViewBinding {
    public final RhFloatingActionButton fab;
    public final CoordinatorLayout fabCoordinatorLayout;
    private final CoordinatorLayout rootView;

    private IncludeAddAchRelationshipFabBinding(CoordinatorLayout coordinatorLayout, RhFloatingActionButton rhFloatingActionButton, CoordinatorLayout coordinatorLayout2) {
        this.rootView = coordinatorLayout;
        this.fab = rhFloatingActionButton;
        this.fabCoordinatorLayout = coordinatorLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAddAchRelationshipFabBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAddAchRelationshipFabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.include_add_ach_relationship_fab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAddAchRelationshipFabBinding bind(View view) {
        int i = C30082R.id.fab;
        RhFloatingActionButton rhFloatingActionButton = (RhFloatingActionButton) ViewBindings.findChildViewById(view, i);
        if (rhFloatingActionButton != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            return new IncludeAddAchRelationshipFabBinding(coordinatorLayout, rhFloatingActionButton, coordinatorLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
