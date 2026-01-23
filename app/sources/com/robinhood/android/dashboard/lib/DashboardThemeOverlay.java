package com.robinhood.android.dashboard.lib;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardThemeOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/Direction;", "pageDirection", "Lkotlin/Function0;", "", "content", "DashboardThemeOverlay", "(Lcom/robinhood/compose/bento/theme/Direction;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.DashboardThemeOverlayKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardThemeOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardThemeOverlay$lambda$0(BentoTheme4 bentoTheme4, Function2 function2, int i, Composer composer, int i2) {
        DashboardThemeOverlay(bentoTheme4, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DashboardThemeOverlay(final BentoTheme4 bentoTheme4, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-983881233);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-983881233, i2, -1, "com.robinhood.android.dashboard.lib.DashboardThemeOverlay (DashboardThemeOverlay.kt:13)");
            }
            BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4 == null ? BentoTheme4.POSITIVE : bentoTheme4, content, composerStartRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.DashboardThemeOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardThemeOverlay.DashboardThemeOverlay$lambda$0(bentoTheme4, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
