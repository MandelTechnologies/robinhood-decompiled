package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "sizeOnMainAxis", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;Landroidx/compose/foundation/gestures/Orientation;)I", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "singleAxisViewportSize", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyGridSnapLayoutInfoProvider {
    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        long jMo5233getViewportSizeYbymL2g;
        if (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical) {
            jMo5233getViewportSizeYbymL2g = lazyGridLayoutInfo.mo5233getViewportSizeYbymL2g() & 4294967295L;
        } else {
            jMo5233getViewportSizeYbymL2g = lazyGridLayoutInfo.mo5233getViewportSizeYbymL2g() >> 32;
        }
        return (int) jMo5233getViewportSizeYbymL2g;
    }

    public static final int sizeOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        long jMo5230getSizeYbymL2g;
        if (orientation == Orientation.Vertical) {
            jMo5230getSizeYbymL2g = lazyGridItemInfo.mo5230getSizeYbymL2g() & 4294967295L;
        } else {
            jMo5230getSizeYbymL2g = lazyGridItemInfo.mo5230getSizeYbymL2g() >> 32;
        }
        return (int) jMo5230getSizeYbymL2g;
    }

    public static final int offsetOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntOffset.m8039getYimpl(lazyGridItemInfo.mo5229getOffsetnOccac());
        }
        return IntOffset.m8038getXimpl(lazyGridItemInfo.mo5229getOffsetnOccac());
    }
}
