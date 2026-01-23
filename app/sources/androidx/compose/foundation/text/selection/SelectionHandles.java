package androidx.compose.foundation.text.selection;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.Popup3;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectionHandles.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "handleReferencePoint", "Landroidx/compose/ui/Alignment;", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "(Landroidx/compose/ui/Alignment;Landroidx/compose/foundation/text/selection/OffsetProvider;)V", "prevPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.selection.HandlePositionProvider, reason: use source file name */
/* loaded from: classes4.dex */
public final class SelectionHandles implements Popup3 {
    private final Alignment handleReferencePoint;
    private final SelectionHandles2 positionProvider;
    private long prevPosition = Offset.INSTANCE.m6553getZeroF1C5BW0();

    public SelectionHandles(Alignment alignment, SelectionHandles2 selectionHandles2) {
        this.handleReferencePoint = alignment;
        this.positionProvider = selectionHandles2;
    }

    @Override // androidx.compose.p011ui.window.Popup3
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo4929calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        long jMo5345provideF1C5BW0 = this.positionProvider.mo5345provideF1C5BW0();
        if ((9223372034707292159L & jMo5345provideF1C5BW0) == 9205357640488583168L) {
            jMo5345provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = jMo5345provideF1C5BW0;
        return IntOffset.m8042plusqkQi6aY(IntOffset.m8042plusqkQi6aY(anchorBounds.m8053getTopLeftnOccac(), IntOffset2.m8050roundk4lQ0M(jMo5345provideF1C5BW0)), this.handleReferencePoint.mo6433alignKFBX0sM(popupContentSize, IntSize.INSTANCE.m8064getZeroYbymL2g(), layoutDirection));
    }
}
