package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoThemeOverlays.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a%\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001aw\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lkotlin/Function0;", "", "content", "ElevatedThemeOverlay", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AchromaticThemeOverlay", "Lcom/robinhood/compose/bento/theme/Direction;", "direction", "DirectionThemeOverlay", "(Lcom/robinhood/compose/bento/theme/Direction;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "accent", "fg", "fg2", "fg3", "bg", "bg2", "bg3", AccountNavigationViewState.LOG_OUT_TEXT_COLOR, "negative", "CustomThemeOverlay--wsPGbo", "(JJJJJJJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CustomThemeOverlay", "Lcom/robinhood/compose/bento/theme/BentoColors;", "colors", "CustomColorsOverlay", "(Lcom/robinhood/compose/bento/theme/BentoColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "isDay", "DayNightThemeOverlay", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoThemeOverlays {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchromaticThemeOverlay$lambda$3(Function2 function2, int i, Composer composer, int i2) {
        AchromaticThemeOverlay(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomColorsOverlay$lambda$7(BentoColors bentoColors, Function2 function2, int i, Composer composer, int i2) {
        CustomColorsOverlay(bentoColors, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomThemeOverlay__wsPGbo$lambda$6(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Function2 function2, int i, int i2, Composer composer, int i3) {
        m21607CustomThemeOverlaywsPGbo(j, j2, j3, j4, j5, j6, j7, j8, j9, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayNightThemeOverlay$lambda$8(boolean z, Function2 function2, int i, Composer composer, int i2) {
        DayNightThemeOverlay(z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DirectionThemeOverlay$lambda$5(BentoTheme4 bentoTheme4, Function2 function2, int i, Composer composer, int i2) {
        DirectionThemeOverlay(bentoTheme4, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedThemeOverlay$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        ElevatedThemeOverlay(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ElevatedThemeOverlay(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1957679076);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957679076, i2, -1, "com.robinhood.compose.bento.theme.ElevatedThemeOverlay (BentoThemeOverlays.kt:13)");
            }
            BentoColors bentoColorsM21357copy0oIltwM$default = BentoColors.m21357copy0oIltwM$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -1, -1, -1, 1048575, null);
            bentoColorsM21357copy0oIltwM$default.elevated$lib_compose_bento_externalRelease();
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(bentoColorsM21357copy0oIltwM$default), content, composerStartRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.ElevatedThemeOverlay$lambda$1(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AchromaticThemeOverlay(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020497391);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020497391, i2, -1, "com.robinhood.compose.bento.theme.AchromaticThemeOverlay (BentoThemeOverlays.kt:27)");
            }
            BentoColors bentoColorsM21357copy0oIltwM$default = BentoColors.m21357copy0oIltwM$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -1, -1, -1, 1048575, null);
            bentoColorsM21357copy0oIltwM$default.achromatic$lib_compose_bento_externalRelease();
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(bentoColorsM21357copy0oIltwM$default), content, composerStartRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.AchromaticThemeOverlay$lambda$3(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DirectionThemeOverlay(final BentoTheme4 direction, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1002547888);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(direction.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1002547888, i2, -1, "com.robinhood.compose.bento.theme.DirectionThemeOverlay (BentoThemeOverlays.kt:42)");
            }
            BentoColors bentoColorsM21357copy0oIltwM$default = BentoColors.m21357copy0oIltwM$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -1, -1, -1, 1048575, null);
            bentoColorsM21357copy0oIltwM$default.direction$lib_compose_bento_externalRelease(direction);
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(bentoColorsM21357copy0oIltwM$default), content, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.DirectionThemeOverlay$lambda$5(direction, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: CustomThemeOverlay--wsPGbo, reason: not valid java name */
    public static final void m21607CustomThemeOverlaywsPGbo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        long jM21425getFg0d7_KjU;
        long jM21426getFg20d7_KjU;
        long jM21427getFg30d7_KjU;
        long jM21371getBg0d7_KjU;
        long jM21368getAccent0d7_KjU;
        long jM21372getBg20d7_KjU;
        long jM21373getBg30d7_KjU;
        long jM21456getPositive0d7_KjU;
        long jM21452getNegative0d7_KjU;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        Composer composer2;
        final long j18;
        final long j19;
        final long j20;
        final long j21;
        final long j22;
        final long j23;
        final long j24;
        final long j25;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869280262);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM21425getFg0d7_KjU = j2;
                int i4 = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) ? 32 : 16;
                i3 |= i4;
            } else {
                jM21425getFg0d7_KjU = j2;
            }
            i3 |= i4;
        } else {
            jM21425getFg0d7_KjU = j2;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM21426getFg20d7_KjU = j3;
                int i5 = composerStartRestartGroup.changed(jM21426getFg20d7_KjU) ? 256 : 128;
                i3 |= i5;
            } else {
                jM21426getFg20d7_KjU = j3;
            }
            i3 |= i5;
        } else {
            jM21426getFg20d7_KjU = j3;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM21427getFg30d7_KjU = j4;
                int i6 = composerStartRestartGroup.changed(jM21427getFg30d7_KjU) ? 2048 : 1024;
                i3 |= i6;
            } else {
                jM21427getFg30d7_KjU = j4;
            }
            i3 |= i6;
        } else {
            jM21427getFg30d7_KjU = j4;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jM21371getBg0d7_KjU = j5;
                int i7 = composerStartRestartGroup.changed(jM21371getBg0d7_KjU) ? 16384 : 8192;
                i3 |= i7;
            } else {
                jM21371getBg0d7_KjU = j5;
            }
            i3 |= i7;
        } else {
            jM21371getBg0d7_KjU = j5;
        }
        if ((i & 196608) == 0) {
            i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(j6)) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(j7)) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j8)) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(j9)) ? 67108864 : 33554432;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU();
                    i3 &= -15;
                } else {
                    jM21368getAccent0d7_KjU = j;
                }
                if ((i2 & 2) != 0) {
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21426getFg20d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21427getFg30d7_KjU();
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21372getBg20d7_KjU();
                    i3 &= -458753;
                } else {
                    jM21372getBg20d7_KjU = j6;
                }
                if ((i2 & 64) != 0) {
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21373getBg30d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM21373getBg30d7_KjU = j7;
                }
                if ((i2 & 128) != 0) {
                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21456getPositive0d7_KjU();
                    i3 &= -29360129;
                } else {
                    jM21456getPositive0d7_KjU = j8;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    j10 = jM21425getFg0d7_KjU;
                    j11 = jM21426getFg20d7_KjU;
                    j12 = jM21427getFg30d7_KjU;
                    j13 = jM21371getBg0d7_KjU;
                    j14 = jM21373getBg30d7_KjU;
                    j15 = jM21368getAccent0d7_KjU;
                    j16 = jM21372getBg20d7_KjU;
                    j17 = jM21456getPositive0d7_KjU;
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21452getNegative0d7_KjU();
                } else {
                    jM21452getNegative0d7_KjU = j9;
                    j10 = jM21425getFg0d7_KjU;
                    j11 = jM21426getFg20d7_KjU;
                    j12 = jM21427getFg30d7_KjU;
                    j13 = jM21371getBg0d7_KjU;
                    j14 = jM21373getBg30d7_KjU;
                    j15 = jM21368getAccent0d7_KjU;
                    j16 = jM21372getBg20d7_KjU;
                    j17 = jM21456getPositive0d7_KjU;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                j15 = j;
                j16 = j6;
                j14 = j7;
                j17 = j8;
                jM21452getNegative0d7_KjU = j9;
                j10 = jM21425getFg0d7_KjU;
                j11 = jM21426getFg20d7_KjU;
                j12 = jM21427getFg30d7_KjU;
                j13 = jM21371getBg0d7_KjU;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1869280262, i3, -1, "com.robinhood.compose.bento.theme.CustomThemeOverlay (BentoThemeOverlays.kt:61)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(BentoColors.m21357copy0oIltwM$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6), j15, j17, jM21452getNegative0d7_KjU, j10, j11, j12, j14, j16, j13, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -512, -1, -1, 1048575, null)), content, composerStartRestartGroup, ProvidedValue.$stable | ((i3 >> 24) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            j18 = j17;
            j19 = jM21452getNegative0d7_KjU;
            j20 = j10;
            j21 = j11;
            j22 = j12;
            j23 = j14;
            j24 = j16;
            j25 = j13;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j15 = j;
            j19 = j9;
            composer2 = composerStartRestartGroup;
            j20 = jM21425getFg0d7_KjU;
            j21 = jM21426getFg20d7_KjU;
            j22 = jM21427getFg30d7_KjU;
            j25 = jM21371getBg0d7_KjU;
            j24 = j6;
            j23 = j7;
            j18 = j8;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j26 = j15;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.CustomThemeOverlay__wsPGbo$lambda$6(j26, j20, j21, j22, j25, j24, j23, j18, j19, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomColorsOverlay(final BentoColors colors, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1172605040);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(colors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1172605040, i2, -1, "com.robinhood.compose.bento.theme.CustomColorsOverlay (BentoThemeOverlays.kt:82)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(colors), content, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.CustomColorsOverlay$lambda$7(colors, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DayNightThemeOverlay(final boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        BentoColors bentoColorsNightColors;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(820403954);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820403954, i2, -1, "com.robinhood.compose.bento.theme.DayNightThemeOverlay (BentoThemeOverlays.kt:95)");
            }
            if (z) {
                bentoColorsNightColors = BentoColors2.dayColors();
            } else {
                bentoColorsNightColors = BentoColors2.nightColors();
            }
            CompositionLocal3.CompositionLocalProvider(BentoColors2.getLocalBentoColors().provides(bentoColorsNightColors), content, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeOverlaysKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoThemeOverlays.DayNightThemeOverlay$lambda$8(z, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
