package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$2$1 implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: $i */
    final /* synthetic */ int f4902$i;
    final /* synthetic */ SnapshotStateMap<Integer, Rect> $yAxisSecondaryRects;

    SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$2$1(SnapshotStateMap<Integer, Rect> snapshotStateMap, int i) {
        this.$yAxisSecondaryRects = snapshotStateMap;
        this.f4902$i = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.$yAxisSecondaryRects.put(Integer.valueOf(this.f4902$i), Rect2.m6565Recttz77jQw(LayoutCoordinates2.positionInParent(coordinates), IntSize2.m8067toSizeozmzZPI(coordinates.mo7241getSizeYbymL2g())));
    }
}
