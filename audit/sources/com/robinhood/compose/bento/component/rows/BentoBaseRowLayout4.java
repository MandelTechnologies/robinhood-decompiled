package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout5;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BentoBaseRowLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$MiddleAndMetaLayout$1$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BentoBaseRowLayout4 implements MeasurePolicy {
    public static final BentoBaseRowLayout4 INSTANCE = new BentoBaseRowLayout4();

    BentoBaseRowLayout4() {
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
    public final MeasureResult mo4748measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, final long j) {
        Placeable placeableMo7239measureBRTryo0;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            Object layoutId = LayoutId2.getLayoutId((Measurable) obj);
            Intrinsics.checkNotNull(layoutId, "null cannot be cast to non-null type com.robinhood.compose.bento.component.rows.BentoRowScope.Slot");
            linkedHashMap.put((BentoBaseRowLayout5.Slot) layoutId, obj);
        }
        Measurable measurable = (Measurable) linkedHashMap.get(BentoBaseRowLayout5.Slot.Middle);
        Measurable measurable2 = (Measurable) linkedHashMap.get(BentoBaseRowLayout5.Slot.Meta);
        boolean zMightExist = BentoBaseRowLayout.mightExist(measurable, Constraints.m7976getMinHeightimpl(j));
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        boolean z = Constraints.m7975getMaxWidthimpl(j) == Integer.MAX_VALUE;
        Placeable placeableMo7239measureBRTryo02 = null;
        if (measurable2 != null) {
            placeableMo7239measureBRTryo0 = measurable2.mo7239measureBRTryo0(z ? j : Constraints.m7967copyZbe2FdA$default(j, 0, RangesKt.coerceAtLeast(iM7975getMaxWidthimpl - (zMightExist ? Layout.mo5010roundToPx0680j_4(BentoBaseRowLayout.MiddleElementMinWidthPlusPadding) : 0), 0), 0, 0, 12, null));
            iM7975getMaxWidthimpl = (iM7975getMaxWidthimpl - placeableMo7239measureBRTryo0.getWidth()) - ((!zMightExist || placeableMo7239measureBRTryo0.getWidth() <= 0) ? 0 : Layout.mo5010roundToPx0680j_4(BentoBaseRowLayout.MiddleElementPaddingEnd));
        } else {
            placeableMo7239measureBRTryo0 = null;
        }
        if (measurable != null) {
            placeableMo7239measureBRTryo02 = measurable.mo7239measureBRTryo0(z ? j : Constraints.m7967copyZbe2FdA$default(j, RangesKt.coerceAtMost(Layout.mo5010roundToPx0680j_4(BentoBaseRowLayout.MiddleElementMinWidthSansPadding), iM7975getMaxWidthimpl), iM7975getMaxWidthimpl, 0, 0, 12, null));
            placeableMo7239measureBRTryo02.getWidth();
        }
        final Placeable placeable = placeableMo7239measureBRTryo02;
        final int iMax = Math.max(placeableMo7239measureBRTryo0 != null ? placeableMo7239measureBRTryo0.getHeight() : 0, placeable != null ? placeable.getHeight() : 0);
        final Placeable placeable2 = placeableMo7239measureBRTryo0;
        return MeasureScope.layout$default(Layout, Constraints.m7975getMaxWidthimpl(j), iMax, null, new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$MiddleAndMetaLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return BentoBaseRowLayout4.measure_3p2s80s$lambda$3(placeable2, j, iMax, placeable, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(Placeable placeable, long j, int i, Placeable placeable2, Placeable.PlacementScope layout) {
        Placeable placeable3;
        Placeable placeable4;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placement placement = (placeable == null || placeable.getWidth() <= 0) ? null : new Placement(placeable, Constraints.m7975getMaxWidthimpl(j) - placeable.getWidth(), BentoBaseRowLayout.calculateCenteredY(placeable, i));
        Placement placement2 = placeable2 != null ? new Placement(placeable2, 0, BentoBaseRowLayout.calculateCenteredY(placeable2, i)) : null;
        if (placement2 != null && (placeable4 = placement2.getPlaceable()) != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable4, placement2.getX(), placement2.getY(), 0.0f, 4, null);
        }
        if (placement != null && (placeable3 = placement.getPlaceable()) != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable3, placement.getX(), placement.getY(), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
