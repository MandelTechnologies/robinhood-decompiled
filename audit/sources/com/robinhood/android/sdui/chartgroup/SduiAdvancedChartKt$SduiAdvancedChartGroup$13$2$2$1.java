package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$2$1 implements Function1<Rect, Unit> {
    final /* synthetic */ SnapshotStateMap<Integer, Rect> $chartRects;

    /* renamed from: $i */
    final /* synthetic */ int f4905$i;

    SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$2$1(SnapshotStateMap<Integer, Rect> snapshotStateMap, int i) {
        this.$chartRects = snapshotStateMap;
        this.f4905$i = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Rect rect) {
        invoke2(rect);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.$chartRects.put(Integer.valueOf(this.f4905$i), rect);
    }
}
