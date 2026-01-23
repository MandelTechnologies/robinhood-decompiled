package com.robinhood.android.gold.switchplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldThemeOverlay.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlin/Function0;", "", "content", "GoldThemeOverlay", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-gold-switch-plans_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.switchplans.GoldThemeOverlayKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldThemeOverlay2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldThemeOverlay$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        GoldThemeOverlay(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GoldThemeOverlay(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2101616119);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2101616119, i2, -1, "com.robinhood.android.gold.switchplans.GoldThemeOverlay (GoldThemeOverlay.kt:9)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            if (bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay()) {
                composerStartRestartGroup.startReplaceGroup(1507629298);
                BentoThemeOverlays.AchromaticThemeOverlay(content, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1507693902);
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composerStartRestartGroup, i3).getSolLight(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, 510);
                content = function2;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldThemeOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldThemeOverlay2.GoldThemeOverlay$lambda$0(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
