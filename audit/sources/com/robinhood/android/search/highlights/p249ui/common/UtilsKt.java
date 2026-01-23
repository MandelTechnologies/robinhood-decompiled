package com.robinhood.android.search.highlights.p249ui.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"SpacerRow", "", "height", "Landroidx/compose/ui/unit/Dp;", "SpacerRow-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "SpacerColumn", "width", "SpacerColumn-kHDZbjc", "SpacerAfterCarousel", "(Landroidx/compose/runtime/Composer;I)V", "HorizontalSpacerInRow", "backgroundForDayAndNight", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "dayNightColorOrDefault", "dayColor", "nightColor", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "dayNightColorOrDefault-SaiUicg", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;JLandroidx/compose/runtime/Composer;II)J", "fallbackColor", "dayNightFallbackColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "backgroundGradient", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class UtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalSpacerInRow$lambda$3(int i, Composer composer, int i2) {
        HorizontalSpacerInRow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacerAfterCarousel$lambda$2(int i, Composer composer, int i2) {
        SpacerAfterCarousel(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacerColumn_kHDZbjc$lambda$1(float f, int i, int i2, Composer composer, int i3) {
        m18632SpacerColumnkHDZbjc(f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacerRow_kHDZbjc$lambda$0(float f, int i, int i2, Composer composer, int i3) {
        m18633SpacerRowkHDZbjc(f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* renamed from: SpacerRow-kHDZbjc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18633SpacerRowkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(835282841);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(f)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    f = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(835282841, i3, -1, "com.robinhood.android.search.highlights.ui.common.SpacerRow (Utils.kt:16)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.UtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.SpacerRow_kHDZbjc$lambda$0(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: SpacerColumn-kHDZbjc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18632SpacerColumnkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2025471799);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(f)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    f = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2025471799, i3, -1, "com.robinhood.android.search.highlights.ui.common.SpacerColumn (Utils.kt:23)");
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.UtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.SpacerColumn_kHDZbjc$lambda$1(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SpacerAfterCarousel(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1612703673);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1612703673, i, -1, "com.robinhood.android.search.highlights.ui.common.SpacerAfterCarousel (Utils.kt:29)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.SpacerAfterCarousel$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void HorizontalSpacerInRow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680501284);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680501284, i, -1, "com.robinhood.android.search.highlights.ui.common.HorizontalSpacerInRow (Utils.kt:36)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.HorizontalSpacerInRow$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final long backgroundForDayAndNight(Composer composer, int i) {
        long jM21372getBg20d7_KjU;
        composer.startReplaceGroup(1956388050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956388050, i, -1, "com.robinhood.android.search.highlights.ui.common.backgroundForDayAndNight (Utils.kt:42)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        if (bentoTheme.getColors(composer, i2).getIsDay()) {
            composer.startReplaceGroup(50292140);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(50333835);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21372getBg20d7_KjU;
    }

    /* renamed from: dayNightColorOrDefault-SaiUicg, reason: not valid java name */
    public static final long m18634dayNightColorOrDefaultSaiUicg(Color color, Color color2, long j, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1874525256);
        if ((i2 & 4) != 0) {
            j = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1874525256, i, -1, "com.robinhood.android.search.highlights.ui.common.dayNightColorOrDefault (Utils.kt:55)");
        }
        if (color != null && color2 != null) {
            composer.startReplaceGroup(1827482061);
            boolean isDay = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
            composer.endReplaceGroup();
            j = isDay ? color.getValue() : color.getValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    public static final long fallbackColor(Composer composer, int i) {
        composer.startReplaceGroup(-1699873745);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1699873745, i, -1, "com.robinhood.android.search.highlights.ui.common.fallbackColor (Utils.kt:64)");
        }
        long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21426getFg20d7_KjU;
    }

    public static final DayNightColor dayNightFallbackColor() {
        return new DayNightColor(Color2.Color(android.graphics.Color.parseColor("0xFF6A7278")), Color2.Color(android.graphics.Color.parseColor("0xFF919FA6")), null);
    }

    public static final Brush backgroundGradient(Composer composer, int i) {
        composer.startReplaceGroup(-1200595155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1200595155, i, -1, "com.robinhood.android.search.highlights.ui.common.backgroundGradient (Utils.kt:76)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(bentoTheme.getColors(composer, i2).getIsDay() ? 16777215 : 16448509)), Color.m6701boximpl(Color2.Color(bentoTheme.getColors(composer, i2).getIsDay() ? 83886080 : 84873234))}), 0L, 0L, 0, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return brushM6678linearGradientmHitzGk$default;
    }
}
