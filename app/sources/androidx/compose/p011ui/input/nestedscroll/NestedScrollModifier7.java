package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, m3636d2 = {"nestedScroll", "Landroidx/compose/ui/Modifier;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class NestedScrollModifier7 {
    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollModifier nestedScrollModifier, NestedScrollModifier2 nestedScrollModifier2, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollModifier2 = null;
        }
        return nestedScroll(modifier, nestedScrollModifier, nestedScrollModifier2);
    }

    public static final Modifier nestedScroll(Modifier modifier, NestedScrollModifier nestedScrollModifier, NestedScrollModifier2 nestedScrollModifier2) {
        return modifier.then(new NestedScrollModifier6(nestedScrollModifier, nestedScrollModifier2));
    }
}
