package com.robinhood.android.advisory.insights.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryInsightDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.ComposableSingletons$AdvisoryInsightDetailScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailScreen8 {
    public static final AdvisoryInsightDetailScreen8 INSTANCE = new AdvisoryInsightDetailScreen8();

    /* renamed from: lambda$-321209951, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8628lambda$321209951 = ComposableLambda3.composableLambdaInstance(-321209951, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.ComposableSingletons$AdvisoryInsightDetailScreenKt$lambda$-321209951$1
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
                ComposerKt.traceEventStart(-321209951, i, -1, "com.robinhood.android.advisory.insights.detail.ComposableSingletons$AdvisoryInsightDetailScreenKt.lambda$-321209951.<anonymous> (AdvisoryInsightDetailScreen.kt:182)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-321209951$feature_advisory_insights_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11054getLambda$321209951$feature_advisory_insights_externalDebug() {
        return f8628lambda$321209951;
    }
}
