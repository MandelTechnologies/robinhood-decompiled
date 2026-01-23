package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.education.HighPremiumVisualizationView;

/* loaded from: classes11.dex */
public final class IncludeHighPremiumVisualizationViewBinding implements ViewBinding {
    private final HighPremiumVisualizationView rootView;

    private IncludeHighPremiumVisualizationViewBinding(HighPremiumVisualizationView highPremiumVisualizationView) {
        this.rootView = highPremiumVisualizationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public HighPremiumVisualizationView getRoot() {
        return this.rootView;
    }

    public static IncludeHighPremiumVisualizationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeHighPremiumVisualizationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.include_high_premium_visualization_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeHighPremiumVisualizationViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeHighPremiumVisualizationViewBinding((HighPremiumVisualizationView) view);
    }
}
