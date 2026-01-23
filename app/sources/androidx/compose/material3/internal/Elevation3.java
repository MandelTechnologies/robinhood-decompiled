package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;

/* compiled from: Elevation.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Landroidx/compose/material3/internal/ElevationDefaults;", "", "()V", "incomingAnimationSpecForInteraction", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingAnimationSpecForInteraction", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material3.internal.ElevationDefaults, reason: use source file name */
/* loaded from: classes4.dex */
final class Elevation3 {
    public static final Elevation3 INSTANCE = new Elevation3();

    private Elevation3() {
    }

    public final AnimationSpec<C2002Dp> incomingAnimationSpecForInteraction(Interaction interaction) {
        if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction.Start) || (interaction instanceof HoverInteraction) || (interaction instanceof FocusInteraction)) {
            return Elevation4.DefaultIncomingSpec;
        }
        return null;
    }

    public final AnimationSpec<C2002Dp> outgoingAnimationSpecForInteraction(Interaction interaction) {
        if (!(interaction instanceof PressInteraction.Press) && !(interaction instanceof DragInteraction.Start)) {
            if (interaction instanceof HoverInteraction) {
                return Elevation4.HoveredOutgoingSpec;
            }
            if (interaction instanceof FocusInteraction) {
                return Elevation4.DefaultOutgoingSpec;
            }
            return null;
        }
        return Elevation4.DefaultOutgoingSpec;
    }
}
