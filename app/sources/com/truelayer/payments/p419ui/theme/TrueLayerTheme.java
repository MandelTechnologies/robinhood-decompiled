package com.truelayer.payments.p419ui.theme;

import android.content.Context;
import android.os.Build;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorScheme2;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Theme.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/TrueLayerTheme;", "", "lightPalette", "Landroidx/compose/material3/ColorScheme;", "darkPalette", "typography", "Landroidx/compose/material3/Typography;", "shapes", "Landroidx/compose/material3/Shapes;", "dynamicColorsEnabled", "", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;Z)V", "getDarkPalette", "()Landroidx/compose/material3/ColorScheme;", "getDynamicColorsEnabled", "()Z", "getLightPalette", "getShapes", "()Landroidx/compose/material3/Shapes;", "getTypography", "()Landroidx/compose/material3/Typography;", "colors", "isDarkTheme", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class TrueLayerTheme {
    public static final int $stable = 0;
    private final ColorScheme darkPalette;
    private final boolean dynamicColorsEnabled;
    private final ColorScheme lightPalette;
    private final Shapes shapes;
    private final Typography typography;

    public TrueLayerTheme() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ TrueLayerTheme copy$default(TrueLayerTheme trueLayerTheme, ColorScheme colorScheme, ColorScheme colorScheme2, Typography typography, Shapes shapes, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            colorScheme = trueLayerTheme.lightPalette;
        }
        if ((i & 2) != 0) {
            colorScheme2 = trueLayerTheme.darkPalette;
        }
        if ((i & 4) != 0) {
            typography = trueLayerTheme.typography;
        }
        if ((i & 8) != 0) {
            shapes = trueLayerTheme.shapes;
        }
        if ((i & 16) != 0) {
            z = trueLayerTheme.dynamicColorsEnabled;
        }
        boolean z2 = z;
        Typography typography2 = typography;
        return trueLayerTheme.copy(colorScheme, colorScheme2, typography2, shapes, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorScheme getLightPalette() {
        return this.lightPalette;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorScheme getDarkPalette() {
        return this.darkPalette;
    }

    /* renamed from: component3, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    /* renamed from: component4, reason: from getter */
    public final Shapes getShapes() {
        return this.shapes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDynamicColorsEnabled() {
        return this.dynamicColorsEnabled;
    }

    public final TrueLayerTheme copy(ColorScheme lightPalette, ColorScheme darkPalette, Typography typography, Shapes shapes, boolean dynamicColorsEnabled) {
        Intrinsics.checkNotNullParameter(lightPalette, "lightPalette");
        Intrinsics.checkNotNullParameter(darkPalette, "darkPalette");
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(shapes, "shapes");
        return new TrueLayerTheme(lightPalette, darkPalette, typography, shapes, dynamicColorsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrueLayerTheme)) {
            return false;
        }
        TrueLayerTheme trueLayerTheme = (TrueLayerTheme) other;
        return Intrinsics.areEqual(this.lightPalette, trueLayerTheme.lightPalette) && Intrinsics.areEqual(this.darkPalette, trueLayerTheme.darkPalette) && Intrinsics.areEqual(this.typography, trueLayerTheme.typography) && Intrinsics.areEqual(this.shapes, trueLayerTheme.shapes) && this.dynamicColorsEnabled == trueLayerTheme.dynamicColorsEnabled;
    }

    public int hashCode() {
        return (((((((this.lightPalette.hashCode() * 31) + this.darkPalette.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.shapes.hashCode()) * 31) + Boolean.hashCode(this.dynamicColorsEnabled);
    }

    public String toString() {
        return "TrueLayerTheme(lightPalette=" + this.lightPalette + ", darkPalette=" + this.darkPalette + ", typography=" + this.typography + ", shapes=" + this.shapes + ", dynamicColorsEnabled=" + this.dynamicColorsEnabled + ")";
    }

    public TrueLayerTheme(ColorScheme lightPalette, ColorScheme darkPalette, Typography typography, Shapes shapes, boolean z) {
        Intrinsics.checkNotNullParameter(lightPalette, "lightPalette");
        Intrinsics.checkNotNullParameter(darkPalette, "darkPalette");
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(shapes, "shapes");
        this.lightPalette = lightPalette;
        this.darkPalette = darkPalette;
        this.typography = typography;
        this.shapes = shapes;
        this.dynamicColorsEnabled = z;
    }

    public /* synthetic */ TrueLayerTheme(ColorScheme colorScheme, ColorScheme colorScheme2, Typography typography, Shapes shapes, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorScheme2.m5783lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null) : colorScheme, (i & 2) != 0 ? ColorScheme2.m5781darkColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null) : colorScheme2, (i & 4) != 0 ? Typography6.getTypographyDefaults() : typography, (i & 8) != 0 ? Shape2.getShapeDefaults() : shapes, (i & 16) != 0 ? false : z);
    }

    public final ColorScheme getLightPalette() {
        return this.lightPalette;
    }

    public final ColorScheme getDarkPalette() {
        return this.darkPalette;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    public final Shapes getShapes() {
        return this.shapes;
    }

    public final boolean getDynamicColorsEnabled() {
        return this.dynamicColorsEnabled;
    }

    public final ColorScheme colors(boolean z, Composer composer, int i) {
        ColorScheme colorSchemeDynamicLightColorScheme;
        composer.startReplaceableGroup(1877105157);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1877105157, i, -1, "com.truelayer.payments.ui.theme.TrueLayerTheme.colors (Theme.kt:48)");
        }
        boolean z2 = Build.VERSION.SDK_INT >= 31 ? this.dynamicColorsEnabled : false;
        if (z2 && z) {
            composer.startReplaceableGroup(-1276300012);
            colorSchemeDynamicLightColorScheme = DynamicTonalPaletteKt.dynamicDarkColorScheme((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            composer.endReplaceableGroup();
        } else if (z2 && !z) {
            composer.startReplaceableGroup(-1276299923);
            colorSchemeDynamicLightColorScheme = DynamicTonalPaletteKt.dynamicLightColorScheme((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            composer.endReplaceableGroup();
        } else if (z) {
            composer.startReplaceableGroup(-1276299850);
            composer.endReplaceableGroup();
            colorSchemeDynamicLightColorScheme = this.darkPalette;
        } else {
            composer.startReplaceableGroup(-1276299818);
            composer.endReplaceableGroup();
            colorSchemeDynamicLightColorScheme = this.lightPalette;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorSchemeDynamicLightColorScheme;
    }
}
