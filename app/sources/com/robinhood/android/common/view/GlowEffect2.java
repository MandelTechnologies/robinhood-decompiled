package com.robinhood.android.common.view;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: GlowEffect.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a>\u0010\n\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m3636d2 = {"recreate", "Lcom/robinhood/android/common/view/GlowEffect;", "context", "Landroid/content/Context;", "width", "", "height", "scale", "", "radius", "recreateExpanded", "expansionFactor", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.view.GlowEffectKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class GlowEffect2 {
    public static final GlowEffect recreate(GlowEffect glowEffect, Context context, int i, int i2, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (glowEffect != null && glowEffect.getWidth() == i && glowEffect.getHeight() == i2 && glowEffect.getScale() == f && glowEffect.getRadius() == f2) {
            return glowEffect;
        }
        if (glowEffect != null) {
            glowEffect.close();
        }
        return GlowEffect.INSTANCE.create(context, i, i2, f, f2);
    }

    public static final GlowEffect recreateExpanded(GlowEffect glowEffect, Context context, int i, int i2, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (glowEffect == null || glowEffect.getScale() != f || glowEffect.getRadius() != f2) {
            return GlowEffect.INSTANCE.create(context, MathKt.roundToInt(i * f3), MathKt.roundToInt(i2 * f3), f, f2);
        }
        if (i < glowEffect.getWidth() && i2 < glowEffect.getHeight()) {
            return glowEffect;
        }
        glowEffect.close();
        return GlowEffect.INSTANCE.create(context, MathKt.roundToInt(i * f3), MathKt.roundToInt(i2 * f3), f, f2);
    }
}
