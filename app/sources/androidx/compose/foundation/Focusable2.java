package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.FocusableKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Focusable2 {
    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, InteractionSource3 interactionSource3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            interactionSource3 = null;
        }
        return focusable(modifier, z, interactionSource3);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, InteractionSource3 interactionSource3) {
        Modifier focusable;
        if (z) {
            focusable = new Focusable(interactionSource3);
        } else {
            focusable = Modifier.INSTANCE;
        }
        return modifier.then(focusable);
    }
}
