package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: HorizontalStaggeredGrid.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.HorizontalStaggeredGridKt$HorizontalStaggeredGrid$1$1, reason: use source file name */
/* loaded from: classes20.dex */
final class HorizontalStaggeredGrid5 implements MeasurePolicy {
    final /* synthetic */ PaddingValues $edgePadding;
    final /* synthetic */ float $horizontalSpacing;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ int $rows;
    final /* synthetic */ float $verticalSpacing;

    HorizontalStaggeredGrid5(PaddingValues paddingValues, LayoutDirection layoutDirection, int i, float f, float f2) {
        this.$edgePadding = paddingValues;
        this.$layoutDirection = layoutDirection;
        this.$rows = i;
        this.$horizontalSpacing = f;
        this.$verticalSpacing = f2;
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
    public final MeasureResult mo4748measure3p2s80s(final MeasureScope Layout, List<? extends Measurable> measurables, long j) {
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        final int iMo5010roundToPx0680j_4 = Layout.mo5010roundToPx0680j_4(this.$edgePadding.mo5118calculateLeftPaddingu2uoSUM(this.$layoutDirection));
        int iMo5010roundToPx0680j_42 = Layout.mo5010roundToPx0680j_4(this.$edgePadding.mo5119calculateRightPaddingu2uoSUM(this.$layoutDirection));
        int i = this.$rows;
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = 0;
        }
        int i4 = this.$rows;
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr2[i5] = 0;
        }
        List<? extends Measurable> list = measurables;
        int i6 = this.$rows;
        float f = this.$horizontalSpacing;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i7 = 0;
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i9 = i6;
            Placeable placeableMo7239measureBRTryo0 = ((Measurable) next).mo7239measureBRTryo0(j);
            int i10 = i7 % i9;
            iArr[i10] = iArr[i10] + placeableMo7239measureBRTryo0.getWidth() + Layout.mo5010roundToPx0680j_4(f);
            iArr2[i10] = Math.max(iArr2[i10], placeableMo7239measureBRTryo0.getHeight());
            arrayList.add(placeableMo7239measureBRTryo0);
            i6 = i9;
            i7 = i8;
            i2 = i2;
        }
        int i11 = i2;
        for (int i12 = i11; i12 < i; i12++) {
            iArr[i12] = iArr[i12] - Layout.mo5010roundToPx0680j_4(this.$horizontalSpacing);
        }
        Integer numMaxOrNull = ArraysKt.maxOrNull(iArr);
        int iCoerceIn = RangesKt.coerceIn((numMaxOrNull != null ? numMaxOrNull.intValue() : i11) + iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42, Constraints.m7977getMinWidthimpl(j), Constraints.m7975getMaxWidthimpl(j));
        int i13 = 1;
        int iCoerceIn2 = RangesKt.coerceIn(ArraysKt.sum(iArr2) + ((this.$rows - 1) * Layout.mo5010roundToPx0680j_4(this.$verticalSpacing)), Constraints.m7976getMinHeightimpl(j), Constraints.m7974getMaxHeightimpl(j));
        int i14 = this.$rows;
        final int[] iArr3 = new int[i14];
        for (int i15 = i11; i15 < i14; i15++) {
            iArr3[i15] = i11;
        }
        while (true) {
            final int i16 = this.$rows;
            if (i13 < i16) {
                int i17 = i13 - 1;
                iArr3[i13] = iArr3[i17] + iArr2[i17] + Layout.mo5010roundToPx0680j_4(this.$verticalSpacing);
                i13++;
            } else {
                final float f2 = this.$horizontalSpacing;
                return MeasureScope.layout$default(Layout, iCoerceIn, iCoerceIn2, null, new Function1() { // from class: com.robinhood.compose.bento.component.HorizontalStaggeredGridKt$HorizontalStaggeredGrid$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HorizontalStaggeredGrid5.measure_3p2s80s$lambda$2(i16, iMo5010roundToPx0680j_4, arrayList, iArr3, Layout, f2, (Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$2(int i, int i2, List list, int[] iArr, MeasureScope measureScope, float f, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr2[i4] = i2;
        }
        for (Object obj : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Placeable placeable = (Placeable) obj;
            int i6 = i3 % i;
            Placeable.PlacementScope.place$default(layout, placeable, iArr2[i6], iArr[i6], 0.0f, 4, null);
            iArr2[i6] = iArr2[i6] + placeable.getWidth() + measureScope.mo5010roundToPx0680j_4(f);
            layout = placementScope;
            i3 = i5;
        }
        return Unit.INSTANCE;
    }
}
