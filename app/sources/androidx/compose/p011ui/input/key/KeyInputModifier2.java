package androidx.compose.p011ui.input.key;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: KeyInputModifier.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0006"}, m3636d2 = {"onKeyEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onPreviewKeyEvent", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.input.key.KeyInputModifierKt, reason: use source file name */
/* loaded from: classes.dex */
public final class KeyInputModifier2 {
    public static final Modifier onKeyEvent(Modifier modifier, Function1<? super KeyEvent, Boolean> function1) {
        return modifier.then(new KeyInputModifier(function1, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, Function1<? super KeyEvent, Boolean> function1) {
        return modifier.then(new KeyInputModifier(null, function1));
    }
}
