package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.util.MathHelpers;
import kotlin.Metadata;

/* compiled from: Shadow.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.graphics.ShadowKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Shadow4 {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(Color2.m6733lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f), OffsetKt.m6554lerpWko1d7g(shadow.getOffset(), shadow2.getOffset(), f), MathHelpers.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
