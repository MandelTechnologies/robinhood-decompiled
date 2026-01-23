package com.robinhood.android.search.highlights.p249ui.sports.components;

import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SearchHighlightsSportsCardLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.ui.sports.components.SearchHighlightsSportsCardLayoutKt$SearchHighlightsSportsCardLayout$1$1, reason: use source file name */
/* loaded from: classes20.dex */
final class SearchHighlightsSportsCardLayout2 implements MeasurePolicy {
    final /* synthetic */ float $minimumWidth;

    SearchHighlightsSportsCardLayout2(float f) {
        this.$minimumWidth = f;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo4748measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int iCoerceAtMost = RangesKt.coerceAtMost(Math.max(measurables.get(0).maxIntrinsicWidth(Constraints.m7974getMaxHeightimpl(j)), Math.max(measurables.get(2).maxIntrinsicWidth(Constraints.m7974getMaxHeightimpl(j)), Layout.mo5010roundToPx0680j_4(this.$minimumWidth))), Constraints.m7975getMaxWidthimpl(j));
        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j, iCoerceAtMost, iCoerceAtMost, 0, 0, 12, null);
        final Placeable placeableMo7239measureBRTryo0 = measurables.get(0).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        final Placeable placeableMo7239measureBRTryo02 = measurables.get(1).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        final Placeable placeableMo7239measureBRTryo03 = measurables.get(2).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        final Placeable placeableMo7239measureBRTryo04 = measurables.get(3).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        return MeasureScope.layout$default(Layout, iCoerceAtMost, placeableMo7239measureBRTryo0.getHeight() + placeableMo7239measureBRTryo02.getHeight() + placeableMo7239measureBRTryo03.getHeight() + placeableMo7239measureBRTryo04.getHeight(), null, new Function1() { // from class: com.robinhood.android.search.highlights.ui.sports.components.SearchHighlightsSportsCardLayoutKt$SearchHighlightsSportsCardLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHighlightsSportsCardLayout2.measure_3p2s80s$lambda$0(placeableMo7239measureBRTryo0, placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo03, placeableMo7239measureBRTryo04, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        int height = placeable.getHeight();
        Placeable.PlacementScope.place$default(layout, placeable2, 0, height, 0.0f, 4, null);
        int height2 = height + placeable2.getHeight();
        Placeable.PlacementScope.place$default(layout, placeable3, 0, height2, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(layout, placeable4, 0, height2 + placeable3.getHeight(), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
