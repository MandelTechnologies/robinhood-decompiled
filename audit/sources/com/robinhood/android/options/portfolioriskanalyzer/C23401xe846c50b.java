package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$2010283012$1 */
/* loaded from: classes11.dex */
final class C23401xe846c50b implements Function2<Composer, Integer, Unit> {
    public static final C23401xe846c50b INSTANCE = new C23401xe846c50b();

    C23401xe846c50b() {
    }

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
            ComposerKt.traceEventStart(2010283012, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$2010283012.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:411)");
        }
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$2010283012$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C23401xe846c50b.invoke$lambda$2$lambda$1((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt = ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2244x9e1978f8(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2246xaf1531ed(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2243x24a3fa2f(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2242xa8f4fbe1(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2252xda0ea65(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2239x3f0e0334(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2250xb75ddf85(), 3, null);
        for (int i = 0; i < 3; i++) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2253xece04cd(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
