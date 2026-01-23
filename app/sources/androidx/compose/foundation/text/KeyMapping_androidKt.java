package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

/* compiled from: KeyMapping.android.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo5350mapZmokQxo(KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m7122isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m7120isAltPressedZmokQxo(event)) {
                long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5379getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5380getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5381getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5378getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m7120isAltPressedZmokQxo(event)) {
                long jM7117getKeyZmokQxo2 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5379getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5380getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5381getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5378getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMapping2.getDefaultKeyMapping().mo5350mapZmokQxo(event) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
