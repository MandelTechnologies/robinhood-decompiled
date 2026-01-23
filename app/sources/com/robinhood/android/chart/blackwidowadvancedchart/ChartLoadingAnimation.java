package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartLoadingAnimation.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003²\u0006\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002"}, m3636d2 = {"ChartLoadingAnimation", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.ChartLoadingAnimationKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartLoadingAnimation {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartLoadingAnimation$lambda$1(int i, Composer composer, int i2) {
        ChartLoadingAnimation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChartLoadingAnimation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1353181347);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1353181347, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.ChartLoadingAnimation (ChartLoadingAnimation.kt:16)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C10614R.raw.lottie_legend_chart_loading)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieAnimation2.LottieAnimation(ChartLoadingAnimation$lambda$0(lottieCompositionResultRememberLottieComposition), ZIndexModifier2.zIndex(SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 999.0f), false, false, null, 0.0f, Integer.MAX_VALUE, false, true, false, null, false, false, null, null, ContentScale.INSTANCE.getFillBounds(), false, false, null, false, null, composerStartRestartGroup, 102236160, 196608, 0, 2064060);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.ChartLoadingAnimationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartLoadingAnimation.ChartLoadingAnimation$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LottieComposition ChartLoadingAnimation$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
