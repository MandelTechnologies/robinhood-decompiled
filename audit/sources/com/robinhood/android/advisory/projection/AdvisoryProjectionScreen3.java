package com.robinhood.android.advisory.projection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryProjectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.ComposableSingletons$AdvisoryProjectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryProjectionScreen3 {
    public static final AdvisoryProjectionScreen3 INSTANCE = new AdvisoryProjectionScreen3();

    /* renamed from: lambda$-896990363, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8650lambda$896990363 = ComposableLambda3.composableLambdaInstance(-896990363, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.ComposableSingletons$AdvisoryProjectionScreenKt$lambda$-896990363$1
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
                ComposerKt.traceEventStart(-896990363, i, -1, "com.robinhood.android.advisory.projection.ComposableSingletons$AdvisoryProjectionScreenKt.lambda$-896990363.<anonymous> (AdvisoryProjectionScreen.kt:202)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-896990363$feature_projected_returns_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11193getLambda$896990363$feature_projected_returns_externalDebug() {
        return f8650lambda$896990363;
    }
}
