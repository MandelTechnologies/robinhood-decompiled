package com.robinhood.android.equitydetail.p123ui.chartsettings;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentChartSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartSettingsBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ChartSettingsBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChartSettingsBinding> {
    public static final ChartSettingsBottomSheetFragment2 INSTANCE = new ChartSettingsBottomSheetFragment2();

    ChartSettingsBottomSheetFragment2() {
        super(1, FragmentChartSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentChartSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChartSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChartSettingsBinding.bind(p0);
    }
}
