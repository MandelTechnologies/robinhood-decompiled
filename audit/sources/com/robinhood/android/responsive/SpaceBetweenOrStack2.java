package com.robinhood.android.responsive;

import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpaceBetweenOrStack.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.responsive.SpaceBetweenOrStackKt$SpaceBetweenOrStack$1$1, reason: use source file name */
/* loaded from: classes17.dex */
final class SpaceBetweenOrStack2 implements MeasurePolicy {
    final /* synthetic */ boolean $reverseOrderWhenStacked;
    final /* synthetic */ int $verticalSpacingPixels;

    SpaceBetweenOrStack2(int i, boolean z) {
        this.$verticalSpacingPixels = i;
        this.$reverseOrderWhenStacked = z;
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
        final int i;
        int height;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        List arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(Constraints2.Constraints$default(0, Constraints.m7975getMaxWidthimpl(j), 0, 0, 12, null)));
        }
        Iterator it2 = arrayList.iterator();
        int iM7975getMaxWidthimpl = 0;
        int width = 0;
        while (it2.hasNext()) {
            width += ((Placeable) it2.next()).getWidth();
        }
        final boolean z = width > Constraints.m7975getMaxWidthimpl(j);
        int size = arrayList.size() - 1;
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int height2 = ((Placeable) it3.next()).getHeight();
        loop2: while (true) {
            i = height2;
            while (it3.hasNext()) {
                height2 = ((Placeable) it3.next()).getHeight();
                if (i < height2) {
                    break;
                }
            }
        }
        if (z) {
            Iterator it4 = arrayList.iterator();
            int height3 = 0;
            while (it4.hasNext()) {
                height3 += ((Placeable) it4.next()).getHeight();
            }
            height = height3 + (this.$verticalSpacingPixels * size);
        } else {
            Iterator it5 = arrayList.iterator();
            if (!it5.hasNext()) {
                throw new NoSuchElementException();
            }
            height = ((Placeable) it5.next()).getHeight();
            while (it5.hasNext()) {
                int height4 = ((Placeable) it5.next()).getHeight();
                if (height < height4) {
                    height = height4;
                }
            }
        }
        int i2 = height;
        if (!z && size != 0) {
            iM7975getMaxWidthimpl = (Constraints.m7975getMaxWidthimpl(j) - width) / size;
        }
        final int i3 = iM7975getMaxWidthimpl;
        if (z && this.$reverseOrderWhenStacked) {
            arrayList = CollectionsKt.reversed(arrayList);
        }
        final List list2 = arrayList;
        int iM7975getMaxWidthimpl2 = Constraints.m7975getMaxWidthimpl(j);
        final int i4 = this.$verticalSpacingPixels;
        return MeasureScope.layout$default(Layout, iM7975getMaxWidthimpl2, i2, null, new Function1() { // from class: com.robinhood.android.responsive.SpaceBetweenOrStackKt$SpaceBetweenOrStack$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpaceBetweenOrStack2.measure_3p2s80s$lambda$6(list2, z, i, i4, i3, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$6(List list, boolean z, int i, int i2, int i3, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator it = list.iterator();
        int width = 0;
        int height = 0;
        while (it.hasNext()) {
            Placeable placeable = (Placeable) it.next();
            Placeable.PlacementScope placementScope = layout;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, height + (!z ? (i - placeable.getHeight()) / 2 : 0), 0.0f, 4, null);
            if (z) {
                height += placeable.getHeight() + i2;
            } else {
                width += placeable.getWidth() + i3;
            }
            layout = placementScope;
        }
        return Unit.INSTANCE;
    }
}
