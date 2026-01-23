package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;

/* compiled from: Hoverable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.HoverableKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Hoverable2 {
    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, InteractionSource3 interactionSource3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, interactionSource3, z);
    }

    public static final Modifier hoverable(Modifier modifier, InteractionSource3 interactionSource3, boolean z) {
        return modifier.then(z ? new Hoverable(interactionSource3) : Modifier.INSTANCE);
    }
}
