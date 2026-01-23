package com.robinhood.android.gold.sage;

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

/* compiled from: GoldSageTimelineComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$TimelineItemRow$1$1, reason: use source file name */
/* loaded from: classes17.dex */
final class GoldSageTimelineComposable4 implements MeasurePolicy {
    final /* synthetic */ float $defaultSpacing;
    final /* synthetic */ float $localHorizontalPadding;

    GoldSageTimelineComposable4(float f, float f2) {
        this.$defaultSpacing = f;
        this.$localHorizontalPadding = f2;
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
        final int iMo5016toPx0680j_4 = (int) MeasurePolicy.mo5016toPx0680j_4(this.$defaultSpacing);
        final Placeable placeableMo7239measureBRTryo0 = ((Measurable) CollectionsKt.last((List) measurables)).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, 0, Constraints.m7975getMaxWidthimpl(j) - (((int) MeasurePolicy.mo5016toPx0680j_4(this.$localHorizontalPadding)) * 2), 0, 0, 13, null));
        int i = iMo5016toPx0680j_4 * 2;
        final Placeable placeableMo7239measureBRTryo02 = ((Measurable) CollectionsKt.first((List) measurables)).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, 0, 0, placeableMo7239measureBRTryo0.getHeight() + i, placeableMo7239measureBRTryo0.getHeight() + i, 3, null));
        return MeasureScope.layout$default(MeasurePolicy, placeableMo7239measureBRTryo02.getWidth() + placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight() + i, null, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$TimelineItemRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldSageTimelineComposable4.measure_3p2s80s$lambda$0(placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo0, iMo5016toPx0680j_4, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable placeable2, int i, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, placeable.getWidth(), i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
