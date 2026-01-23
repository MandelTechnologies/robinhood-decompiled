package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import kotlin.Metadata;

/* compiled from: Ripple.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/material/RippleDefaults;", "", "()V", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "lightTheme", "", "rippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "rippleColor", "rippleColor-5vOe2sY", "(JZ)J", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class RippleDefaults {
    public static final RippleDefaults INSTANCE = new RippleDefaults();

    private RippleDefaults() {
    }

    /* renamed from: rippleColor-5vOe2sY, reason: not valid java name */
    public final long m5622rippleColor5vOe2sY(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) Color2.m6734luminance8_81llA(contentColor)) >= 0.5d) ? contentColor : Color.INSTANCE.m6727getWhite0d7_KjU();
    }

    /* renamed from: rippleAlpha-DxMtmZc, reason: not valid java name */
    public final RippleAlpha m5621rippleAlphaDxMtmZc(long contentColor, boolean lightTheme) {
        if (lightTheme) {
            return ((double) Color2.m6734luminance8_81llA(contentColor)) > 0.5d ? RippleKt.LightThemeHighContrastRippleAlpha : RippleKt.LightThemeLowContrastRippleAlpha;
        }
        return RippleKt.DarkThemeRippleAlpha;
    }
}
