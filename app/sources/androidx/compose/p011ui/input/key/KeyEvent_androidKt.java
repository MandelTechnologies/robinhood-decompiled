package androidx.compose.p011ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyEvent.android.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e*\n\u0010\u0015\"\u00020\u00142\u00020\u0014¨\u0006\u0016"}, m3636d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "Landroidx/compose/ui/input/key/Key;", "getKey-ZmokQxo", "(Landroid/view/KeyEvent;)J", "key", "", "getUtf16CodePoint-ZmokQxo", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/KeyEventType;", "getType-ZmokQxo", "type", "", "isAltPressed-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "isCtrlPressed-ZmokQxo", "isCtrlPressed", "isShiftPressed-ZmokQxo", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m7117getKeyZmokQxo(KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m7119getUtf16CodePointZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m7118getTypeZmokQxo(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return KeyEvent2.INSTANCE.m7114getKeyDownCS__XNY();
        }
        if (action == 1) {
            return KeyEvent2.INSTANCE.m7115getKeyUpCS__XNY();
        }
        return KeyEvent2.INSTANCE.m7116getUnknownCS__XNY();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7120isAltPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7121isCtrlPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7122isShiftPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
