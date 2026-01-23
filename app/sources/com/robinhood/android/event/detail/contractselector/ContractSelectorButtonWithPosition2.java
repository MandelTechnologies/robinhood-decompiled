package com.robinhood.android.event.detail.contractselector;

import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContractSelectorButtonWithPosition.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt$ContractSelectorButtonWithPosition$2$1, reason: use source file name */
/* loaded from: classes17.dex */
final class ContractSelectorButtonWithPosition2 implements MeasurePolicy {
    final /* synthetic */ Density $density;
    final /* synthetic */ C2002Dp $width;

    ContractSelectorButtonWithPosition2(C2002Dp c2002Dp, Density density) {
        this.$width = c2002Dp;
        this.$density = density;
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
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        final Placeable placeableMo7239measureBRTryo0 = measurables.get(0).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        C2002Dp c2002Dp = this.$width;
        if (c2002Dp != null) {
            int iMo5010roundToPx0680j_4 = this.$density.mo5010roundToPx0680j_4(c2002Dp.getValue());
            tuples2M3642to = Tuples4.m3642to(Constraints.m7964boximpl(Constraints.m7967copyZbe2FdA$default(j, iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_4, 0, 0, 12, null)), Integer.valueOf(iMo5010roundToPx0680j_4));
        } else {
            tuples2M3642to = Tuples4.m3642to(Constraints.m7964boximpl(j), Integer.valueOf(Constraints.m7975getMaxWidthimpl(j)));
        }
        long value = ((Constraints) tuples2M3642to.component1()).getValue();
        final int iIntValue = ((Number) tuples2M3642to.component2()).intValue();
        final Placeable placeableMo7239measureBRTryo02 = measurables.get(1).mo7239measureBRTryo0(value);
        int height = (placeableMo7239measureBRTryo0.getHeight() + placeableMo7239measureBRTryo02.getHeight()) - (placeableMo7239measureBRTryo0.getHeight() / 2);
        final C2002Dp c2002Dp2 = this.$width;
        return MeasureScope.layout$default(Layout, iIntValue, height, null, new Function1() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt$ContractSelectorButtonWithPosition$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractSelectorButtonWithPosition2.measure_3p2s80s$lambda$1(placeableMo7239measureBRTryo0, iIntValue, placeableMo7239measureBRTryo02, c2002Dp2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(Placeable placeable, int i, Placeable placeable2, C2002Dp c2002Dp, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.placeRelative(placeable, i - placeable.getWidth(), 0, 1.0f);
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, c2002Dp != null ? i - placeable2.getWidth() : 0, placeable.getHeight() / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
