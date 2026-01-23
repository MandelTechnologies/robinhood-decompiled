package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardPills.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$QuoteWithPositionPill$2$1, reason: use source file name */
/* loaded from: classes17.dex */
final class CardPills2 implements MeasurePolicy {
    public static final CardPills2 INSTANCE = new CardPills2();

    CardPills2() {
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
        final Placeable placeableMo7239measureBRTryo0 = measurables.get(0).mo7239measureBRTryo0(j);
        final Placeable placeableMo7239measureBRTryo02 = measurables.get(1).mo7239measureBRTryo0(j);
        final int iMax = Math.max(placeableMo7239measureBRTryo02.getWidth(), placeableMo7239measureBRTryo0.getWidth());
        return MeasureScope.layout$default(Layout, iMax, (placeableMo7239measureBRTryo0.getHeight() + placeableMo7239measureBRTryo02.getHeight()) - (placeableMo7239measureBRTryo0.getHeight() / 2), null, new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$QuoteWithPositionPill$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardPills2.measure_3p2s80s$lambda$0(placeableMo7239measureBRTryo0, iMax, placeableMo7239measureBRTryo02, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, int i, Placeable placeable2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.placeRelative(placeable, i - placeable.getWidth(), 0, 1.0f);
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i - placeable2.getWidth(), placeable.getHeight() / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
