package com.robinhood.android.cortex.digest.portfolio.detail;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PortfolioDigestDetailComposableKt {
    public static final ComposableSingletons$PortfolioDigestDetailComposableKt INSTANCE = new ComposableSingletons$PortfolioDigestDetailComposableKt();

    /* renamed from: lambda$-2094687080, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f8752lambda$2094687080 = ComposableLambda3.composableLambdaInstance(-2094687080, false, C12118x83cebac9.INSTANCE);
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$413312594 = ComposableLambda3.composableLambdaInstance(413312594, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.ComposableSingletons$PortfolioDigestDetailComposableKt$lambda$413312594$1
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
                ComposerKt.traceEventStart(413312594, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.ComposableSingletons$PortfolioDigestDetailComposableKt.lambda$413312594.<anonymous> (PortfolioDigestDetailComposable.kt:155)");
            }
            PortfolioDigestDetailComposableKt.PortfolioDigestAnimation(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2093779586, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8751lambda$2093779586 = ComposableLambda3.composableLambdaInstance(-2093779586, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.ComposableSingletons$PortfolioDigestDetailComposableKt$lambda$-2093779586$1
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
                ComposerKt.traceEventStart(-2093779586, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.ComposableSingletons$PortfolioDigestDetailComposableKt.lambda$-2093779586.<anonymous> (PortfolioDigestDetailComposable.kt:240)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2093779586$feature_cortex_digest_portfolio_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1869x3b74985f() {
        return f8751lambda$2093779586;
    }

    /* renamed from: getLambda$-2094687080$feature_cortex_digest_portfolio_externalDebug */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m1870x3c819979() {
        return f8752lambda$2094687080;
    }

    /* renamed from: getLambda$413312594$feature_cortex_digest_portfolio_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1871xdbfa4472() {
        return lambda$413312594;
    }
}
