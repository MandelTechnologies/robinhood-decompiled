package com.robinhood.android.mcduckling.card.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.mcduckling.card.help.C21627R;

/* loaded from: classes8.dex */
public final class ActivityCardHelpBinding implements ViewBinding {
    public final ConstraintLayout cardHelpRootContainer;
    public final FrameLayout fragmentContainer;
    private final ConstraintLayout rootView;
    public final RhToolbar toolbarWrapper;

    private ActivityCardHelpBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, RhToolbar rhToolbar) {
        this.rootView = constraintLayout;
        this.cardHelpRootContainer = constraintLayout2;
        this.fragmentContainer = frameLayout;
        this.toolbarWrapper = rhToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCardHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCardHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21627R.layout.activity_card_help, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCardHelpBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C21627R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C21627R.id.toolbar_wrapper;
            RhToolbar rhToolbar = (RhToolbar) ViewBindings.findChildViewById(view, i);
            if (rhToolbar != null) {
                return new ActivityCardHelpBinding(constraintLayout, constraintLayout, frameLayout, rhToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
