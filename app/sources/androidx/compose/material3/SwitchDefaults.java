package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Switch.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J²\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u00020\u0004*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m3636d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SwitchColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/unit/Dp;", "IconSize", "F", "getIconSize-D9Ej5fM", "()F", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "defaultSwitchColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = C2002Dp.m7995constructorimpl(16);

    private SwitchDefaults() {
    }

    public final SwitchColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
        }
        SwitchColors defaultSwitchColors$material3_release = getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors$material3_release;
    }

    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m5980colorsV1nXRL4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i, int i2, int i3) {
        long j17;
        long j18;
        long jM6732compositeOverOWjLjI;
        long j19;
        long jM6732compositeOverOWjLjI2;
        long j20;
        long jM6732compositeOverOWjLjI3;
        long j21;
        long jM6732compositeOverOWjLjI4;
        long j22;
        long jM6732compositeOverOWjLjI5;
        long j23;
        int i4;
        long jM6732compositeOverOWjLjI6;
        long j24;
        long jM6732compositeOverOWjLjI7;
        long value = (i3 & 1) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j2;
        long jM6725getTransparent0d7_KjU = (i3 & 4) != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j3;
        long value3 = (i3 & 8) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j4;
        long value4 = (i3 & 16) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j5;
        long value5 = (i3 & 32) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j6;
        long value6 = (i3 & 64) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j7;
        long value7 = (i3 & 128) != 0 ? ColorScheme2.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j8;
        if ((i3 & 256) != 0) {
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            j17 = value;
            j18 = value2;
            jM6732compositeOverOWjLjI = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens.getDisabledSelectedHandleColor(), composer, 6), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j17 = value;
            j18 = value2;
            jM6732compositeOverOWjLjI = j9;
        }
        if ((i3 & 512) != 0) {
            SwitchTokens switchTokens2 = SwitchTokens.INSTANCE;
            j19 = jM6732compositeOverOWjLjI;
            jM6732compositeOverOWjLjI2 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens2.getDisabledSelectedTrackColor(), composer, 6), switchTokens2.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j19 = jM6732compositeOverOWjLjI;
            jM6732compositeOverOWjLjI2 = j10;
        }
        long jM6725getTransparent0d7_KjU2 = (i3 & 1024) != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j11;
        if ((i3 & 2048) != 0) {
            SwitchTokens switchTokens3 = SwitchTokens.INSTANCE;
            j20 = jM6732compositeOverOWjLjI2;
            jM6732compositeOverOWjLjI3 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens3.getDisabledSelectedIconColor(), composer, 6), switchTokens3.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j20 = jM6732compositeOverOWjLjI2;
            jM6732compositeOverOWjLjI3 = j12;
        }
        if ((i3 & 4096) != 0) {
            SwitchTokens switchTokens4 = SwitchTokens.INSTANCE;
            j21 = jM6732compositeOverOWjLjI3;
            jM6732compositeOverOWjLjI4 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens4.getDisabledUnselectedHandleColor(), composer, 6), switchTokens4.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j21 = jM6732compositeOverOWjLjI3;
            jM6732compositeOverOWjLjI4 = j13;
        }
        if ((i3 & 8192) != 0) {
            SwitchTokens switchTokens5 = SwitchTokens.INSTANCE;
            j22 = jM6732compositeOverOWjLjI4;
            jM6732compositeOverOWjLjI5 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens5.getDisabledUnselectedTrackColor(), composer, 6), switchTokens5.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j22 = jM6732compositeOverOWjLjI4;
            jM6732compositeOverOWjLjI5 = j14;
        }
        if ((i3 & 16384) != 0) {
            SwitchTokens switchTokens6 = SwitchTokens.INSTANCE;
            i4 = 6;
            j23 = jM6732compositeOverOWjLjI5;
            jM6732compositeOverOWjLjI6 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens6.getDisabledUnselectedTrackOutlineColor(), composer, 6), switchTokens6.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j23 = jM6732compositeOverOWjLjI5;
            i4 = 6;
            jM6732compositeOverOWjLjI6 = j15;
        }
        if ((i3 & 32768) != 0) {
            SwitchTokens switchTokens7 = SwitchTokens.INSTANCE;
            j24 = jM6732compositeOverOWjLjI6;
            jM6732compositeOverOWjLjI7 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(switchTokens7.getDisabledUnselectedIconColor(), composer, i4), switchTokens7.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i4).getSurface());
        } else {
            j24 = jM6732compositeOverOWjLjI6;
            jM6732compositeOverOWjLjI7 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i, i2, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        long j25 = j18;
        long j26 = j17;
        SwitchColors switchColors = new SwitchColors(j26, j25, jM6725getTransparent0d7_KjU, value3, value4, value5, value6, value7, j19, j20, jM6725getTransparent0d7_KjU2, j21, j22, j23, j24, jM6732compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3_release(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3_release = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached$material3_release != null) {
            return defaultSwitchColorsCached$material3_release;
        }
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        long jFromToken = ColorScheme2.fromToken(colorScheme, switchTokens.getSelectedHandleColor());
        long jFromToken2 = ColorScheme2.fromToken(colorScheme, switchTokens.getSelectedTrackColor());
        Color.Companion companion = Color.INSTANCE;
        SwitchColors switchColors = new SwitchColors(jFromToken, jFromToken2, companion.m6725getTransparent0d7_KjU(), ColorScheme2.fromToken(colorScheme, switchTokens.getSelectedIconColor()), ColorScheme2.fromToken(colorScheme, switchTokens.getUnselectedHandleColor()), ColorScheme2.fromToken(colorScheme, switchTokens.getUnselectedTrackColor()), ColorScheme2.fromToken(colorScheme, switchTokens.getUnselectedFocusTrackOutlineColor()), ColorScheme2.fromToken(colorScheme, switchTokens.getUnselectedIconColor()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledSelectedHandleColor()), switchTokens.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledSelectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), companion.m6725getTransparent0d7_KjU(), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledSelectedIconColor()), switchTokens.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledUnselectedHandleColor()), switchTokens.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackOutlineColor()), switchTokens.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, switchTokens.getDisabledUnselectedIconColor()), switchTokens.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.setDefaultSwitchColorsCached$material3_release(switchColors);
        return switchColors;
    }
}
