package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"", "", "isLowScrollingDelta", "(F)Z", "Landroidx/compose/ui/unit/Dp;", "AnimationThreshold", "F", "AnimationSpeed", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollableKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class MouseWheelScrollable {
    private static final float AnimationThreshold = C2002Dp.m7995constructorimpl(6);
    private static final float AnimationSpeed = C2002Dp.m7995constructorimpl(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowScrollingDelta(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
