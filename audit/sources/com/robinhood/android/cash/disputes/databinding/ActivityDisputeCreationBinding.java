package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.common.p088ui.view.RhToolbar;

/* loaded from: classes7.dex */
public final class ActivityDisputeCreationBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    private final ConstraintLayout rootView;
    public final RhToolbar toolbarWrapper;

    private ActivityDisputeCreationBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, RhToolbar rhToolbar) {
        this.rootView = constraintLayout;
        this.fragmentContainer = frameLayout;
        this.toolbarWrapper = rhToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDisputeCreationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDisputeCreationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.activity_dispute_creation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDisputeCreationBinding bind(View view) {
        int i = C10007R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C10007R.id.toolbar_wrapper;
            RhToolbar rhToolbar = (RhToolbar) ViewBindings.findChildViewById(view, i);
            if (rhToolbar != null) {
                return new ActivityDisputeCreationBinding((ConstraintLayout) view, frameLayout, rhToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
