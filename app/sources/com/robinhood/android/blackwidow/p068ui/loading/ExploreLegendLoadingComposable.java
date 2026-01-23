package com.robinhood.android.blackwidow.p068ui.loading;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ExploreLegendLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.blackwidow.ui.loading.ComposableSingletons$ExploreLegendLoadingComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ExploreLegendLoadingComposable {
    public static final ExploreLegendLoadingComposable INSTANCE = new ExploreLegendLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1055235532 = ComposableLambda3.composableLambdaInstance(1055235532, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.loading.ComposableSingletons$ExploreLegendLoadingComposableKt$lambda$1055235532$1
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
                ComposerKt.traceEventStart(1055235532, i, -1, "com.robinhood.android.blackwidow.ui.loading.ComposableSingletons$ExploreLegendLoadingComposableKt.lambda$1055235532.<anonymous> (ExploreLegendLoadingComposable.kt:49)");
            }
            ExploreLegendLoadingComposable3.LoadingAnimation(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1055235532$feature_black_widow_upsell_externalDebug() {
        return lambda$1055235532;
    }
}
