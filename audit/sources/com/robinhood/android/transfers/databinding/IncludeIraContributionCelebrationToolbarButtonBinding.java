package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class IncludeIraContributionCelebrationToolbarButtonBinding implements ViewBinding {
    public final RdsTextButton iraContributionCelebrationToolbarButton;
    public final FrameLayout iraContributionCelebrationToolbarButtonContainer;
    private final FrameLayout rootView;

    private IncludeIraContributionCelebrationToolbarButtonBinding(FrameLayout frameLayout, RdsTextButton rdsTextButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.iraContributionCelebrationToolbarButton = rdsTextButton;
        this.iraContributionCelebrationToolbarButtonContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeIraContributionCelebrationToolbarButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIraContributionCelebrationToolbarButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.include_ira_contribution_celebration_toolbar_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIraContributionCelebrationToolbarButtonBinding bind(View view) {
        int i = C30065R.id.ira_contribution_celebration_toolbar_button;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new IncludeIraContributionCelebrationToolbarButtonBinding(frameLayout, rdsTextButton, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
