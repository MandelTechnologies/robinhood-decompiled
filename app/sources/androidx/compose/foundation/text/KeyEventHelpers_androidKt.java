package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent2;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

/* compiled from: KeyEventHelpers.android.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m3636d2 = {"showCharacterPalette", "", "cancelsTextSelection", "", "Landroidx/compose/ui/input/key/KeyEvent;", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class KeyEventHelpers_androidKt {
    public static final void showCharacterPalette() {
    }

    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m5349cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEvent2.m7113equalsimpl0(KeyEvent_androidKt.m7118getTypeZmokQxo(keyEvent), KeyEvent2.INSTANCE.m7115getKeyUpCS__XNY());
    }
}
