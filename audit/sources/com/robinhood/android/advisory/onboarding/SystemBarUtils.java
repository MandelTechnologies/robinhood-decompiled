package com.robinhood.android.advisory.onboarding;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SystemBarUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"SetStatusBarEffect", "", "statusBarColor", "Landroidx/compose/ui/graphics/Color;", "SetStatusBarEffect-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)V", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.SystemBarUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SystemBarUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetStatusBarEffect_ek8zF_U$lambda$3(long j, int i, Composer composer, int i2) {
        m11057SetStatusBarEffectek8zF_U(j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: SetStatusBarEffect-ek8zF_U, reason: not valid java name */
    public static final void m11057SetStatusBarEffectek8zF_U(long j, Composer composer, final int i) {
        int i2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-896201016);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            j2 = j;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896201016, i2, -1, "com.robinhood.android.advisory.onboarding.SetStatusBarEffect (SystemBarUtils.kt:11)");
            }
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            Color colorM6701boximpl = Color.m6701boximpl(j);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i3 = i2 & 14;
            boolean zChanged = (i3 == 4) | composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                j2 = j;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.SystemBarUtilsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SystemBarUtils.SetStatusBarEffect_ek8zF_U$lambda$2$lambda$1(systemUiControllerRememberSystemUiController, j2, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                j2 = j;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.SystemBarUtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SystemBarUtils.SetStatusBarEffect_ek8zF_U$lambda$3(j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SetStatusBarEffect_ek8zF_U$lambda$2$lambda$1(final SystemUiController systemUiController, long j, final long j2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.onboarding.SystemBarUtilsKt$SetStatusBarEffect_ek8zF_U$lambda$2$lambda$1$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j2, false, null, 6, null);
            }
        };
    }
}
