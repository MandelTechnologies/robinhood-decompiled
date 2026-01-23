package androidx.compose.p011ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.android.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f*\f\b\u0000\u0010\u000e\"\u00020\f2\u00020\f¨\u0006\u000f"}, m3636d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "EmptyPointerKeyboardModifiers", "()I", "Landroidx/compose/ui/input/pointer/PointerButtons;", "", "isPrimaryPressed-aHzCx-E", "(I)Z", "isPrimaryPressed", "isSecondaryPressed-aHzCx-E", "isSecondaryPressed", "isCtrlPressed-5xRPYO0", "isCtrlPressed", "", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7164isCtrlPressed5xRPYO0(int i) {
        return (i & 4096) != 0;
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7165isPrimaryPressedaHzCxE(int i) {
        return (i & 33) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7166isSecondaryPressedaHzCxE(int i) {
        return (i & 66) != 0;
    }

    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m7197constructorimpl(0);
    }
}
