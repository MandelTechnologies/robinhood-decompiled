package com.robinhood.shared.feature.discovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.feature.discovery.C38951R;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidgetView;

/* loaded from: classes6.dex */
public final class IncludeFeatureDiscoveryWidgetViewBinding implements ViewBinding {
    private final FeatureDiscoveryWidgetView rootView;

    private IncludeFeatureDiscoveryWidgetViewBinding(FeatureDiscoveryWidgetView featureDiscoveryWidgetView) {
        this.rootView = featureDiscoveryWidgetView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FeatureDiscoveryWidgetView getRoot() {
        return this.rootView;
    }

    public static IncludeFeatureDiscoveryWidgetViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeFeatureDiscoveryWidgetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38951R.layout.include_feature_discovery_widget_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeFeatureDiscoveryWidgetViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeFeatureDiscoveryWidgetViewBinding((FeatureDiscoveryWidgetView) view);
    }
}
