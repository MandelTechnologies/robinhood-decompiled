package com.robinhood.compose.bento.component.rows;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
final class BentoTimelineRowKt$BentoTimelineRow$2$1$1 implements MeasurePolicy {
    final /* synthetic */ float $localHorizontalPadding;
    final /* synthetic */ float $localVerticalPadding;

    BentoTimelineRowKt$BentoTimelineRow$2$1$1(float f, float f2) {
        this.$localHorizontalPadding = f;
        this.$localVerticalPadding = f2;
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
    public final MeasureResult mo4748measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j) {
        Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int iMo5016toPx0680j_4 = (int) MeasurePolicy.mo5016toPx0680j_4(this.$localHorizontalPadding);
        int iMo5016toPx0680j_42 = (int) MeasurePolicy.mo5016toPx0680j_4(this.$localVerticalPadding);
        final Placeable placeableMo7239measureBRTryo0 = ((Measurable) CollectionsKt.last((List) measurables)).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, 0, Constraints.m7975getMaxWidthimpl(j) - (iMo5016toPx0680j_4 * 2), 0, 0, 13, null));
        final Placeable placeableMo7239measureBRTryo02 = ((Measurable) CollectionsKt.first((List) measurables)).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, 0, 0, placeableMo7239measureBRTryo0.getHeight() + iMo5016toPx0680j_42, placeableMo7239measureBRTryo0.getHeight() + iMo5016toPx0680j_42, 3, null));
        return MeasureScope.layout$default(MeasurePolicy, placeableMo7239measureBRTryo02.getWidth() + placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight() + iMo5016toPx0680j_42, null, new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BentoTimelineRowKt$BentoTimelineRow$2$1$1.measure_3p2s80s$lambda$0(placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable placeable2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, placeable.getWidth(), 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
