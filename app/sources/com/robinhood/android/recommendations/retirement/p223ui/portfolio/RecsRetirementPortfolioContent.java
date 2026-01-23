package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementPortfolioContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.portfolio.ComposableSingletons$RecsRetirementPortfolioContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementPortfolioContent {
    public static final RecsRetirementPortfolioContent INSTANCE = new RecsRetirementPortfolioContent();

    /* renamed from: lambda$-1617369696, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9188lambda$1617369696 = ComposableLambda3.composableLambdaInstance(-1617369696, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.ComposableSingletons$RecsRetirementPortfolioContentKt$lambda$-1617369696$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617369696, i, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.ComposableSingletons$RecsRetirementPortfolioContentKt.lambda$-1617369696.<anonymous> (RecsRetirementPortfolioContent.kt:197)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1617369696$feature_recommendations_for_retirement_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2392x3fb54edc() {
        return f9188lambda$1617369696;
    }
}
