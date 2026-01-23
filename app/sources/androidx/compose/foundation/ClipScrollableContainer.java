package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClipScrollableContainer.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m3636d2 = {"MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "getMaxSupportedElevation", "()F", "F", "clipScrollableContainer", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.ClipScrollableContainerKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ClipScrollableContainer {
    private static final float MaxSupportedElevation = C2002Dp.m7995constructorimpl(30);

    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        Modifier modifierClip;
        if (orientation == Orientation.Vertical) {
            modifierClip = Clip.clip(Modifier.INSTANCE, ClipScrollableContainer3.INSTANCE);
        } else {
            modifierClip = Clip.clip(Modifier.INSTANCE, ClipScrollableContainer2.INSTANCE);
        }
        return modifier.then(modifierClip);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
