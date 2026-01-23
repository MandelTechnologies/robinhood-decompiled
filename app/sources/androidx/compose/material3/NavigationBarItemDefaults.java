package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavigationBar.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u00020\u0004*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:310)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3_release = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationBarItemColors$material3_release;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m5898colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i, int i2) {
        long j8;
        long jM6726getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM6726getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j2;
        long jM6726getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        long jM6726getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j4;
        long jM6726getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j5;
        long jM6726getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j6;
        long jM6726getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = jM6726getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:335)");
        } else {
            j8 = jM6726getUnspecified0d7_KjU;
        }
        NavigationBarItemColors navigationBarItemColorsM5894copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5894copy4JmcsL4(j8, jM6726getUnspecified0d7_KjU2, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU4, jM6726getUnspecified0d7_KjU5, jM6726getUnspecified0d7_KjU6, jM6726getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColorsM5894copy4JmcsL4;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached = colorScheme.getDefaultNavigationBarItemColorsCached();
        if (defaultNavigationBarItemColorsCached != null) {
            return defaultNavigationBarItemColorsCached;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorScheme2.fromToken(colorScheme, navigationBarTokens.getActiveIconColor()), ColorScheme2.fromToken(colorScheme, navigationBarTokens.getActiveLabelTextColor()), ColorScheme2.fromToken(colorScheme, navigationBarTokens.getActiveIndicatorColor()), ColorScheme2.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), ColorScheme2.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
