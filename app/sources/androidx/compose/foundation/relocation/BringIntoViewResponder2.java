package androidx.compose.foundation.relocation;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import kotlin.Metadata;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Rect;", "rect", "localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "localRectOf", "foundation_release"}, m3637k = 5, m3638mv = {1, 9, 0}, m3640xi = 48, m3641xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewResponderKt, reason: use source file name */
/* loaded from: classes4.dex */
final /* synthetic */ class BringIntoViewResponder2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m6562translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m6560getTopLeftF1C5BW0());
    }
}
