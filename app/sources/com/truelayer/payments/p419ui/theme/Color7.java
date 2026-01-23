package com.truelayer.payments.p419ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorScheme2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0007*\u00020\bH\u0001¢\u0006\u0002\u0010\r\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"DarkColorDefaults", "Landroidx/compose/material3/ColorScheme;", "getDarkColorDefaults", "()Landroidx/compose/material3/ColorScheme;", "LightColorDefaults", "getLightColorDefaults", "contentColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/MaterialTheme;", ResourceTypes.COLOR, "contentColor-iJQMabo", "(Landroidx/compose/material3/MaterialTheme;JLandroidx/compose/runtime/Composer;II)J", "onToolbarColor", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)J", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.theme.ColorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Color7 {
    private static final ColorScheme DarkColorDefaults;
    private static final ColorScheme LightColorDefaults;

    public static final ColorScheme getDarkColorDefaults() {
        return DarkColorDefaults;
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        long jM6727getWhite0d7_KjU = companion.m6727getWhite0d7_KjU();
        Color8 color8 = Color8.INSTANCE;
        long jM27167getCharcoal1000d7_KjU = color8.m27167getCharcoal1000d7_KjU();
        long jM27171getDeepAzure300d7_KjU = color8.m27171getDeepAzure300d7_KjU();
        long jM6727getWhite0d7_KjU2 = companion.m6727getWhite0d7_KjU();
        long jM27167getCharcoal1000d7_KjU2 = color8.m27167getCharcoal1000d7_KjU();
        long jColor = Color2.Color(267711734);
        long jM6727getWhite0d7_KjU3 = companion.m6727getWhite0d7_KjU();
        DarkColorDefaults = ColorScheme2.m5781darkColorSchemeCXl9yA$default(jM6727getWhite0d7_KjU, jM27167getCharcoal1000d7_KjU, 0L, 0L, 0L, jM27171getDeepAzure300d7_KjU, 0L, 0L, jM6727getWhite0d7_KjU2, 0L, 0L, 0L, 0L, color8.m27167getCharcoal1000d7_KjU(), 0L, jM27167getCharcoal1000d7_KjU2, companion.m6727getWhite0d7_KjU(), jColor, jM6727getWhite0d7_KjU3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -500004, 15, null);
        LightColorDefaults = ColorScheme2.m5783lightColorSchemeCXl9yA$default(color8.m27167getCharcoal1000d7_KjU(), companion.m6727getWhite0d7_KjU(), 0L, 0L, 0L, color8.m27170getDeepAzure1000d7_KjU(), 0L, 0L, color8.m27167getCharcoal1000d7_KjU(), 0L, 0L, 0L, 0L, companion.m6727getWhite0d7_KjU(), 0L, companion.m6727getWhite0d7_KjU(), 0L, Color2.Color(253697829), color8.m27167getCharcoal1000d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -434468, 15, null);
    }

    public static final ColorScheme getLightColorDefaults() {
        return LightColorDefaults;
    }

    /* renamed from: contentColor-iJQMabo, reason: not valid java name */
    public static final long m27159contentColoriJQMabo(MaterialTheme contentColor, long j, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(contentColor, "$this$contentColor");
        composer.startReplaceableGroup(820936759);
        if ((i2 & 1) != 0) {
            j = contentColor.getColorScheme(composer, MaterialTheme.$stable | (i & 14)).getBackground();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(820936759, i, -1, "com.truelayer.payments.ui.theme.contentColor (Color.kt:54)");
        }
        long jM5778contentColorFor4WTKRHQ = ColorScheme2.m5778contentColorFor4WTKRHQ(contentColor.getColorScheme(composer, (i & 14) | MaterialTheme.$stable), j);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM5778contentColorFor4WTKRHQ;
    }

    public static final long onToolbarColor(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        composer.startReplaceableGroup(-23165473);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-23165473, i, -1, "com.truelayer.payments.ui.theme.onToolbarColor (Color.kt:60)");
        }
        long onSurface = materialTheme.getColorScheme(composer, (i & 14) | MaterialTheme.$stable).getOnSurface();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onSurface;
    }
}
