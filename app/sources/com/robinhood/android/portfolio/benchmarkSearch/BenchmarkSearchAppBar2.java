package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BenchmarkSearchAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.ComposableSingletons$BenchmarkSearchAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarkSearchAppBar2 {
    public static final BenchmarkSearchAppBar2 INSTANCE = new BenchmarkSearchAppBar2();

    /* renamed from: lambda$-224373991, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9172lambda$224373991 = ComposableLambda3.composableLambdaInstance(-224373991, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.ComposableSingletons$BenchmarkSearchAppBarKt$lambda$-224373991$1
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
                ComposerKt.traceEventStart(-224373991, i, -1, "com.robinhood.android.portfolio.benchmarkSearch.ComposableSingletons$BenchmarkSearchAppBarKt.lambda$-224373991.<anonymous> (BenchmarkSearchAppBar.kt:37)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.pluralStringResource(C25550R.plurals.benchmark_search_title, 3, new Object[]{3}, composer, 48), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 48, 0, 16316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-224373991$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17637getLambda$224373991$feature_portfolio_externalDebug() {
        return f9172lambda$224373991;
    }
}
