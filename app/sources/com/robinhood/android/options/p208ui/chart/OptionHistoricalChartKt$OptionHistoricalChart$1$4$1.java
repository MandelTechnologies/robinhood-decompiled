package com.robinhood.android.options.p208ui.chart;

import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionHistoricalChartKt$OptionHistoricalChart$1$4$1 implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ SnapshotIntState2 $graphHeaderHeight$delegate;

    OptionHistoricalChartKt$OptionHistoricalChart$1$4$1(SnapshotIntState2 snapshotIntState2) {
        this.$graphHeaderHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$graphHeaderHeight$delegate.setIntValue((int) (it.mo7241getSizeYbymL2g() & 4294967295L));
    }
}
