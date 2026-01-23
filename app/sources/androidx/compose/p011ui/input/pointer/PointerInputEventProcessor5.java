package androidx.compose.p011ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/input/pointer/PositionCalculator;", "", "localToScreen", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.PositionCalculator, reason: use source file name */
/* loaded from: classes.dex */
public interface PointerInputEventProcessor5 {
    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    long mo7211localToScreenMKHz9U(long localPosition);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    long mo7212screenToLocalMKHz9U(long positionOnScreen);
}
