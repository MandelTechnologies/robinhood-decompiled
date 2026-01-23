package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppBar.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006JM\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010&\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010(\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010*\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0018\u0010/\u001a\u00020\u0004*\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00103\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u00020\u0004*\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0018\u00107\u001a\u00020\u0004*\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0018\u00109\u001a\u00020\u0004*\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m3636d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/TopAppBarColors;", "topAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "topAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "centerAlignedTopAppBarColors", "mediumTopAppBarColors", "largeTopAppBarColors", "Landroidx/compose/material3/TopAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "enterAlwaysScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/ui/unit/Dp;", "TopAppBarExpandedHeight", "F", "getTopAppBarExpandedHeight-D9Ej5fM", "()F", "MediumAppBarCollapsedHeight", "getMediumAppBarCollapsedHeight-D9Ej5fM", "MediumAppBarExpandedHeight", "getMediumAppBarExpandedHeight-D9Ej5fM", "LargeAppBarCollapsedHeight", "getLargeAppBarCollapsedHeight-D9Ej5fM", "LargeAppBarExpandedHeight", "getLargeAppBarExpandedHeight-D9Ej5fM", "Landroidx/compose/material3/ColorScheme;", "getDefaultTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getDefaultCenterAlignedTopAppBarColors$material3_release", "defaultCenterAlignedTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultLargeTopAppBarColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();
    private static final float LargeAppBarCollapsedHeight;
    private static final float LargeAppBarExpandedHeight;
    private static final float MediumAppBarCollapsedHeight;
    private static final float MediumAppBarExpandedHeight;
    private static final float TopAppBarExpandedHeight;

    private TopAppBarDefaults() {
    }

    public final TopAppBarColors topAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        TopAppBarColors defaultTopAppBarColors$material3_release = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTopAppBarColors$material3_release;
    }

    /* renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m6088topAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long jM6726getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM6726getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j2;
        long jM6726getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        long jM6726getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j4;
        long jM6726getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        TopAppBarColors topAppBarColorsM6079copyt635Npw = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m6079copyt635Npw(jM6726getUnspecified0d7_KjU, jM6726getUnspecified0d7_KjU2, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU4, jM6726getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColorsM6079copyt635Npw;
    }

    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached != null) {
            return defaultTopAppBarColorsCached;
        }
        TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorScheme2.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallTokens.getOnScrollContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallTokens.getLeadingIconColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallTokens.getHeadlineColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    @JvmName
    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM5186onlybOOhFvg = WindowInsetsKt.m5186onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m5191plusgK_yJZ4(companion.m5199getHorizontalJoeWqyM(), companion.m5200getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM5186onlybOOhFvg;
    }

    public final TopAppBarColors centerAlignedTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
        }
        TopAppBarColors defaultCenterAlignedTopAppBarColors$material3_release = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCenterAlignedTopAppBarColors$material3_release;
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached();
        if (defaultCenterAlignedTopAppBarColorsCached != null) {
            return defaultCenterAlignedTopAppBarColorsCached;
        }
        TopAppBarSmallCenteredTokens topAppBarSmallCenteredTokens = TopAppBarSmallCenteredTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorScheme2.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallCenteredTokens.getOnScrollContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallCenteredTokens.getLeadingIconColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallCenteredTokens.getHeadlineColor()), ColorScheme2.fromToken(colorScheme, topAppBarSmallCenteredTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors mediumTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
        }
        TopAppBarColors defaultMediumTopAppBarColors$material3_release = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultMediumTopAppBarColors$material3_release;
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultMediumTopAppBarColorsCached = colorScheme.getDefaultMediumTopAppBarColorsCached();
        if (defaultMediumTopAppBarColorsCached != null) {
            return defaultMediumTopAppBarColorsCached;
        }
        TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorScheme2.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarMediumTokens.getLeadingIconColor()), ColorScheme2.fromToken(colorScheme, topAppBarMediumTokens.getHeadlineColor()), ColorScheme2.fromToken(colorScheme, topAppBarMediumTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultMediumTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors largeTopAppBarColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        TopAppBarColors defaultLargeTopAppBarColors$material3_release = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultLargeTopAppBarColors$material3_release;
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultLargeTopAppBarColorsCached = colorScheme.getDefaultLargeTopAppBarColorsCached();
        if (defaultLargeTopAppBarColorsCached != null) {
            return defaultLargeTopAppBarColorsCached;
        }
        TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.INSTANCE;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorScheme2.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorScheme2.fromToken(colorScheme, topAppBarLargeTokens.getLeadingIconColor()), ColorScheme2.fromToken(colorScheme, topAppBarLargeTokens.getHeadlineColor()), ColorScheme2.fromToken(colorScheme, topAppBarLargeTokens.getTrailingIconColor()), null);
        colorScheme.setDefaultLargeTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterAlwaysScrollBehavior;
    }

    static {
        TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
        TopAppBarExpandedHeight = topAppBarSmallTokens.m6304getContainerHeightD9Ej5fM();
        MediumAppBarCollapsedHeight = topAppBarSmallTokens.m6304getContainerHeightD9Ej5fM();
        MediumAppBarExpandedHeight = TopAppBarMediumTokens.INSTANCE.m6303getContainerHeightD9Ej5fM();
        LargeAppBarCollapsedHeight = topAppBarSmallTokens.m6304getContainerHeightD9Ej5fM();
        LargeAppBarExpandedHeight = TopAppBarLargeTokens.INSTANCE.m6302getContainerHeightD9Ej5fM();
    }

    /* renamed from: getTopAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6087getTopAppBarExpandedHeightD9Ej5fM() {
        return TopAppBarExpandedHeight;
    }

    /* renamed from: getMediumAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6085getMediumAppBarCollapsedHeightD9Ej5fM() {
        return MediumAppBarCollapsedHeight;
    }

    /* renamed from: getMediumAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6086getMediumAppBarExpandedHeightD9Ej5fM() {
        return MediumAppBarExpandedHeight;
    }

    /* renamed from: getLargeAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6083getLargeAppBarCollapsedHeightD9Ej5fM() {
        return LargeAppBarCollapsedHeight;
    }

    /* renamed from: getLargeAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6084getLargeAppBarExpandedHeightD9Ej5fM() {
        return LargeAppBarExpandedHeight;
    }
}
