package com.robinhood.android.widget.p277ui;

import android.view.View;
import com.robinhood.android.widget.databinding.ActivityPortfolioWidgetConfigurationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetConfigurationActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.widget.ui.PortfolioWidgetConfigurationActivity$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PortfolioWidgetConfigurationActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityPortfolioWidgetConfigurationBinding> {
    public static final PortfolioWidgetConfigurationActivity2 INSTANCE = new PortfolioWidgetConfigurationActivity2();

    PortfolioWidgetConfigurationActivity2() {
        super(1, ActivityPortfolioWidgetConfigurationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/widget/databinding/ActivityPortfolioWidgetConfigurationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityPortfolioWidgetConfigurationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityPortfolioWidgetConfigurationBinding.bind(p0);
    }
}
