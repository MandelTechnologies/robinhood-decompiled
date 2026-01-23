package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent2;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifier2;
import androidx.compose.p011ui.input.key.Key_androidKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: TextFieldFocusModifier.android.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m3636d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifier2.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m5424invokeZmokQxo(keyEvent.getNativeKeyEvent());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m5424invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo6487moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEvent2.m7113equalsimpl0(KeyEvent_androidKt.m7118getTypeZmokQxo(keyEvent), KeyEvent2.INSTANCE.m7114getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.m5423isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo6487moveFocus3ESFkO8 = focusManager.mo6487moveFocus3ESFkO8(FocusDirection.INSTANCE.m6485getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m5423isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo6487moveFocus3ESFkO8 = focusManager.mo6487moveFocus3ESFkO8(FocusDirection.INSTANCE.m6478getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m5423isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo6487moveFocus3ESFkO8 = focusManager.mo6487moveFocus3ESFkO8(FocusDirection.INSTANCE.m6481getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m5423isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo6487moveFocus3ESFkO8 = focusManager.mo6487moveFocus3ESFkO8(FocusDirection.INSTANCE.m6484getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m5423isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo6487moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo6487moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m5423isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return Key_androidKt.m7123getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m7117getKeyZmokQxo(keyEvent)) == i;
    }
}
