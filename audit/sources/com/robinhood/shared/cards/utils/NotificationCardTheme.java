package com.robinhood.shared.cards.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationCardTheme.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a;\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m3636d2 = {"", "isGold", "isGoldSplash", "isCreditCard", "Lkotlin/Function0;", "", "content", "NotificationCardTheme", "(ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CreditCardTheme", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "GoldSplashCardTheme", "GoldCardTheme", "lib-cards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.utils.NotificationCardThemeKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class NotificationCardTheme {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditCardTheme$lambda$2(Function2 function2, int i, Composer composer, int i2) {
        CreditCardTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldCardTheme$lambda$4(Function2 function2, int i, Composer composer, int i2) {
        GoldCardTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSplashCardTheme$lambda$3(Function2 function2, int i, Composer composer, int i2) {
        GoldSplashCardTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCardTheme$lambda$0(boolean z, boolean z2, boolean z3, Function2 function2, int i, int i2, Composer composer, int i3) {
        NotificationCardTheme(z, z2, z3, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void NotificationCardTheme(boolean z, boolean z2, boolean z3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1491670519);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = false;
            }
            if (i5 != 0) {
                z2 = false;
            }
            if (i6 != 0) {
                z3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1491670519, i3, -1, "com.robinhood.shared.cards.utils.NotificationCardTheme (NotificationCardTheme.kt:14)");
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1023701229);
                GoldSplashCardTheme(content, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceGroup(-1023699731);
                GoldCardTheme(content, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1023698225);
                CreditCardTheme(content, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1023696928);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z4 = z;
        final boolean z5 = z2;
        final boolean z6 = z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.utils.NotificationCardThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationCardTheme.NotificationCardTheme$lambda$0(z4, z5, z6, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CreditCardTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(727720213);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(727720213, i2, -1, "com.robinhood.shared.cards.utils.CreditCardTheme (NotificationCardTheme.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = BentoColors2.creditCardGoldColors();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BentoColors bentoColors = (BentoColors) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColors.m21368getAccent0d7_KjU(), bentoColors.m21425getFg0d7_KjU(), bentoColors.m21426getFg20d7_KjU(), 0L, bentoColors.m21371getBg0d7_KjU(), bentoColors.m21372getBg20d7_KjU(), 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
            content = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.utils.NotificationCardThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationCardTheme.CreditCardTheme$lambda$2(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldSplashCardTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long jM21372getBg20d7_KjU;
        long solLight;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2048741607);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2048741607, i2, -1, "com.robinhood.shared.cards.utils.GoldSplashCardTheme (NotificationCardTheme.kt:41)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay();
            if (isDay) {
                composerStartRestartGroup.startReplaceGroup(1745668271);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).getSolLight();
            } else {
                composerStartRestartGroup.startReplaceGroup(1745669290);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            long j = jM21372getBg20d7_KjU;
            if (isDay) {
                composerStartRestartGroup.startReplaceGroup(1745671113);
                solLight = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(1745671951);
                solLight = bentoTheme.getColors(composerStartRestartGroup, i3).getSolLight();
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(solLight, 0L, solLight, 0L, j, 0L, 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, 490);
            content = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.utils.NotificationCardThemeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationCardTheme.GoldSplashCardTheme$lambda$3(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldCardTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long solLight;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1690033010);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690033010, i2, -1, "com.robinhood.shared.cards.utils.GoldCardTheme (NotificationCardTheme.kt:56)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            if (bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay()) {
                composerStartRestartGroup.startReplaceGroup(-624079600);
                solLight = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-624078762);
                solLight = bentoTheme.getColors(composerStartRestartGroup, i3).getSolLight();
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(solLight, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, 510);
            content = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.utils.NotificationCardThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationCardTheme.GoldCardTheme$lambda$4(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
