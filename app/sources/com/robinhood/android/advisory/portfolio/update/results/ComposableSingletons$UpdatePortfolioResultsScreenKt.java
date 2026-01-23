package com.robinhood.android.advisory.portfolio.update.results;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdatePortfolioResultsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$UpdatePortfolioResultsScreenKt {
    public static final ComposableSingletons$UpdatePortfolioResultsScreenKt INSTANCE = new ComposableSingletons$UpdatePortfolioResultsScreenKt();

    /* renamed from: lambda$-385350529, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8649lambda$385350529 = ComposableLambda3.composableLambdaInstance(-385350529, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.ComposableSingletons$UpdatePortfolioResultsScreenKt$lambda$-385350529$1
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
                ComposerKt.traceEventStart(-385350529, i, -1, "com.robinhood.android.advisory.portfolio.update.results.ComposableSingletons$UpdatePortfolioResultsScreenKt.lambda$-385350529.<anonymous> (UpdatePortfolioResultsScreen.kt:320)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-385350529$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11188getLambda$385350529$feature_advisory_portfolio_externalDebug() {
        return f8649lambda$385350529;
    }
}
