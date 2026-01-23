package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubComposable {
    public static final PnlHubComposable INSTANCE = new PnlHubComposable();
    private static Function2<Composer, Integer, Unit> lambda$2106606761 = ComposableLambda3.composableLambdaInstance(2106606761, false, PnlHubComposable4.INSTANCE);
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$174145342 = ComposableLambda3.composableLambdaInstance(174145342, false, PnlHubComposable3.INSTANCE);

    /* renamed from: lambda$-1754267411, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9183lambda$1754267411 = ComposableLambda3.composableLambdaInstance(-1754267411, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$-1754267411$1
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
                ComposerKt.traceEventStart(-1754267411, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt.lambda$-1754267411.<anonymous> (PnlHubComposable.kt:362)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            PnlHubComposable pnlHubComposable = PnlHubComposable.INSTANCE;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, pnlHubComposable.getLambda$2106606761$feature_profit_and_loss_hub_externalDebug(), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, pnlHubComposable.getLambda$174145342$feature_profit_and_loss_hub_externalDebug(), composer, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1754267411$feature_profit_and_loss_hub_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17697getLambda$1754267411$feature_profit_and_loss_hub_externalDebug() {
        return f9183lambda$1754267411;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$174145342$feature_profit_and_loss_hub_externalDebug() {
        return lambda$174145342;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2106606761$feature_profit_and_loss_hub_externalDebug() {
        return lambda$2106606761;
    }
}
