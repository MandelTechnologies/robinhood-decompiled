package com.robinhood.shared.feature.discovery.p382ui;

import android.view.View;
import com.robinhood.shared.feature.discovery.databinding.MergeFeatureDiscoveryWidgetViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureDiscoveryWidgetView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class FeatureDiscoveryWidgetView2 extends FunctionReferenceImpl implements Function1<View, MergeFeatureDiscoveryWidgetViewBinding> {
    public static final FeatureDiscoveryWidgetView2 INSTANCE = new FeatureDiscoveryWidgetView2();

    FeatureDiscoveryWidgetView2() {
        super(1, MergeFeatureDiscoveryWidgetViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/feature/discovery/databinding/MergeFeatureDiscoveryWidgetViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeFeatureDiscoveryWidgetViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeFeatureDiscoveryWidgetViewBinding.bind(p0);
    }
}
