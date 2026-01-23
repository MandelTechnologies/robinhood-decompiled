package com.robinhood.android.investFlow.frequency;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestFlowFrequencyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.frequency.ComposableSingletons$InvestFlowFrequencyComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowFrequencyComposable {
    public static final InvestFlowFrequencyComposable INSTANCE = new InvestFlowFrequencyComposable();

    /* renamed from: lambda$-351765982, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9057lambda$351765982 = ComposableLambda3.composableLambdaInstance(-351765982, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.frequency.ComposableSingletons$InvestFlowFrequencyComposableKt$lambda$-351765982$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-351765982, i, -1, "com.robinhood.android.investFlow.frequency.ComposableSingletons$InvestFlowFrequencyComposableKt.lambda$-351765982.<anonymous> (InvestFlowFrequencyComposable.kt:71)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19349R.string.invest_flow_frequency_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-351765982$feature_invest_flow_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15482getLambda$351765982$feature_invest_flow_externalDebug() {
        return f9057lambda$351765982;
    }
}
