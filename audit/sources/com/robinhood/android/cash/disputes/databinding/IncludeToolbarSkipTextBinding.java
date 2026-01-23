package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes7.dex */
public final class IncludeToolbarSkipTextBinding implements ViewBinding {
    public final RdsButton disputeToolbarSkipButton;
    public final FrameLayout disputeToolbarSkipContainer;
    private final FrameLayout rootView;

    private IncludeToolbarSkipTextBinding(FrameLayout frameLayout, RdsButton rdsButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.disputeToolbarSkipButton = rdsButton;
        this.disputeToolbarSkipContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeToolbarSkipTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToolbarSkipTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_toolbar_skip_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToolbarSkipTextBinding bind(View view) {
        int i = C10007R.id.dispute_toolbar_skip_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new IncludeToolbarSkipTextBinding(frameLayout, rdsButton, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
