package com.robinhood.android.recommendations.retirement.lib.p222ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementUnavailableContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.lib.ui.ComposableSingletons$RecsRetirementUnavailableContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementUnavailableContent {
    public static final RecsRetirementUnavailableContent INSTANCE = new RecsRetirementUnavailableContent();

    /* renamed from: lambda$-1515861908, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9187lambda$1515861908 = ComposableLambda3.composableLambdaInstance(-1515861908, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.ComposableSingletons$RecsRetirementUnavailableContentKt$lambda$-1515861908$1
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
                ComposerKt.traceEventStart(-1515861908, i, -1, "com.robinhood.android.recommendations.retirement.lib.ui.ComposableSingletons$RecsRetirementUnavailableContentKt.lambda$-1515861908.<anonymous> (RecsRetirementUnavailableContent.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1515861908$feature_lib_recommendations_for_retirement_externalDebug */
    public final Function2<Composer, Integer, Unit> m2391x4bf7c5c8() {
        return f9187lambda$1515861908;
    }
}
