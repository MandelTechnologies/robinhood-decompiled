package com.robinhood.shared.feature.discovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.feature.discovery.C38951R;

/* loaded from: classes6.dex */
public final class MergeFeatureDiscoveryWidgetViewBinding implements ViewBinding {
    public final ComposeView composeView;
    private final View rootView;

    private MergeFeatureDiscoveryWidgetViewBinding(View view, ComposeView composeView) {
        this.rootView = view;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeFeatureDiscoveryWidgetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38951R.layout.merge_feature_discovery_widget_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeFeatureDiscoveryWidgetViewBinding bind(View view) {
        int i = C38951R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new MergeFeatureDiscoveryWidgetViewBinding(view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
