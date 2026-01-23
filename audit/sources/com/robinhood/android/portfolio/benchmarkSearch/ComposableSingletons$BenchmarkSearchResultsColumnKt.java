package com.robinhood.android.portfolio.benchmarkSearch;

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

/* compiled from: BenchmarkSearchResultsColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$BenchmarkSearchResultsColumnKt {
    public static final ComposableSingletons$BenchmarkSearchResultsColumnKt INSTANCE = new ComposableSingletons$BenchmarkSearchResultsColumnKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$63927243 = ComposableLambda3.composableLambdaInstance(63927243, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.ComposableSingletons$BenchmarkSearchResultsColumnKt$lambda$63927243$1
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
                ComposerKt.traceEventStart(63927243, i, -1, "com.robinhood.android.portfolio.benchmarkSearch.ComposableSingletons$BenchmarkSearchResultsColumnKt.lambda$63927243.<anonymous> (BenchmarkSearchResultsColumn.kt:137)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$63927243$feature_portfolio_externalDebug() {
        return lambda$63927243;
    }
}
