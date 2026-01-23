package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$SduiAdvancedChartGroup$13$1$1 implements Function1<IntSize, Unit> {
    final /* synthetic */ SnapshotIntState2 $chartGroupXAxisHeight$delegate;

    SduiAdvancedChartKt$SduiAdvancedChartGroup$13$1$1(SnapshotIntState2 snapshotIntState2) {
        this.$chartGroupXAxisHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m18599invokeozmzZPI(intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m18599invokeozmzZPI(long j) {
        this.$chartGroupXAxisHeight$delegate.setIntValue((int) (j & 4294967295L));
    }
}
