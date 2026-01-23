package com.robinhood.android.retirement.lib;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementUpsellTheme.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"", "isRebrandExperimentEnabled", "Lkotlin/Function0;", "", "content", "RetirementUpsellTheme", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.RetirementUpsellThemeKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementUpsellTheme {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementUpsellTheme$lambda$0(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        RetirementUpsellTheme(z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RetirementUpsellTheme(boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-893525199);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            boolean z3 = i4 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893525199, i3, -1, "com.robinhood.android.retirement.lib.RetirementUpsellTheme (RetirementUpsellTheme.kt:12)");
            }
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(1198262338);
                BentoThemeOverlays.AchromaticThemeOverlay(content, composerStartRestartGroup, (i3 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1198331623);
                final long jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade();
                BentoColor bentoColor = BentoColor.INSTANCE;
                final long jM21255getDayXrayLight0d7_KjU = bentoColor.m21255getDayXrayLight0d7_KjU();
                final long jM21169getDayBiome0d7_KjU = bentoColor.m21169getDayBiome0d7_KjU();
                final long jM21170getDayBiomeDark0d7_KjU = bentoColor.m21170getDayBiomeDark0d7_KjU();
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1917362803, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementUpsellThemeKt.RetirementUpsellTheme.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1917362803, i5, -1, "com.robinhood.android.retirement.lib.RetirementUpsellTheme.<anonymous> (RetirementUpsellTheme.kt:22)");
                        }
                        long j = jM21255getDayXrayLight0d7_KjU;
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(j, j, 0L, 0L, jade, jM21170getDayBiomeDark0d7_KjU, jM21169getDayBiome0d7_KjU, 0L, 0L, content, composer3, 0, WaitlistAnimationConstants.LEFT_YAW_START);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.RetirementUpsellThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementUpsellTheme.RetirementUpsellTheme$lambda$0(z2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
