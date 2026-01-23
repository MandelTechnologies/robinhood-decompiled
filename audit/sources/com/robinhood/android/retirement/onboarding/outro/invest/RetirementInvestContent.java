package com.robinhood.android.retirement.onboarding.outro.invest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementInvestContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.outro.invest.ComposableSingletons$RetirementInvestContentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementInvestContent {
    public static final RetirementInvestContent INSTANCE = new RetirementInvestContent();

    /* renamed from: lambda$-1886892716, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9218lambda$1886892716 = ComposableLambda3.composableLambdaInstance(-1886892716, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.outro.invest.ComposableSingletons$RetirementInvestContentKt$lambda$-1886892716$1
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
                ComposerKt.traceEventStart(-1886892716, i, -1, "com.robinhood.android.retirement.onboarding.outro.invest.ComposableSingletons$RetirementInvestContentKt.lambda$-1886892716.<anonymous> (RetirementInvestContent.kt:51)");
            }
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.PIE_CHART;
            BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper3, null, null, 6, null);
            int i2 = BentoBaseRowState.Start.PictogramPog.$stable;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, pictogramPog, "Pick stocks and ETFs", "Build your own mix of stocks and ETFs", null, null, null, false, false, false, 0L, null, composer, (i2 << 3) | 3456, 0, 4081);
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper3, null, null, 6, null), "Pick stocks and ETFs", "Build your own mix of stocks and ETFs", null, null, null, false, false, false, 0L, null, composer, (i2 << 3) | 3456, 0, 4081);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1886892716$feature_retirement_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m2435xa8653d13() {
        return f9218lambda$1886892716;
    }
}
