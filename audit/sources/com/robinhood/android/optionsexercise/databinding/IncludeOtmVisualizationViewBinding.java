package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.education.OtmVisualizationView;

/* loaded from: classes11.dex */
public final class IncludeOtmVisualizationViewBinding implements ViewBinding {
    private final OtmVisualizationView rootView;

    private IncludeOtmVisualizationViewBinding(OtmVisualizationView otmVisualizationView) {
        this.rootView = otmVisualizationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OtmVisualizationView getRoot() {
        return this.rootView;
    }

    public static IncludeOtmVisualizationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOtmVisualizationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.include_otm_visualization_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOtmVisualizationViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOtmVisualizationViewBinding((OtmVisualizationView) view);
    }
}
