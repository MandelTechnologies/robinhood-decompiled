package com.robinhood.android.recommendations.lib.p221ui.recurringhook.intro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsRecurringHookIntroContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.ComposableSingletons$RecommendationsRecurringHookIntroContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecommendationsRecurringHookIntroContent {
    public static final RecommendationsRecurringHookIntroContent INSTANCE = new RecommendationsRecurringHookIntroContent();
    private static Function2<Composer, Integer, Unit> lambda$934074724 = ComposableLambda3.composableLambdaInstance(934074724, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.ComposableSingletons$RecommendationsRecurringHookIntroContentKt$lambda$934074724$1
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
                ComposerKt.traceEventStart(934074724, i, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.ComposableSingletons$RecommendationsRecurringHookIntroContentKt.lambda$934074724.<anonymous> (RecommendationsRecurringHookIntroContent.kt:50)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$934074724$feature_lib_recommendations_externalDebug() {
        return lambda$934074724;
    }
}
