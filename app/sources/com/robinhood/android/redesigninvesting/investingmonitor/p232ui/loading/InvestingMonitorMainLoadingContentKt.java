package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.loading;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestingMonitorMainLoadingContent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"InvestingMonitorMainLoadingContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorMainLoadingContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorMainLoadingContent$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingMonitorMainLoadingContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void InvestingMonitorMainLoadingContent(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763351738);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1763351738, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.InvestingMonitorMainLoadingContent (InvestingMonitorMainLoadingContent.kt:28)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            WindowInsets windowInsetsM5185WindowInsetsa9UjIt4$default = WindowInsetsKt.m5185WindowInsetsa9UjIt4$default(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
            ComposableSingletons$InvestingMonitorMainLoadingContentKt composableSingletons$InvestingMonitorMainLoadingContentKt = ComposableSingletons$InvestingMonitorMainLoadingContentKt.INSTANCE;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableSingletons$InvestingMonitorMainLoadingContentKt.getLambda$476972298$feature_investing_monitor_externalDebug(), null, null, null, 0, 0L, jM21371getBg0d7_KjU, windowInsetsM5185WindowInsetsa9UjIt4$default, composableSingletons$InvestingMonitorMainLoadingContentKt.m18000getLambda$1549372523$feature_investing_monitor_externalDebug(), composerStartRestartGroup, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.InvestingMonitorMainLoadingContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorMainLoadingContentKt.InvestingMonitorMainLoadingContent$lambda$0(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
