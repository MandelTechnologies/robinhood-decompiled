package com.robinhood.android.investorprofile.p162ui.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: QuestionnaireReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireReviewScreen {
    public static final QuestionnaireReviewScreen INSTANCE = new QuestionnaireReviewScreen();

    /* renamed from: lambda$-1418081542, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9083lambda$1418081542 = ComposableLambda3.composableLambdaInstance(-1418081542, false, QuestionnaireReviewScreen2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1770341946 = ComposableLambda3.composableLambdaInstance(1770341946, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt$lambda$1770341946$1
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
                ComposerKt.traceEventStart(1770341946, i, -1, "com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt.lambda$1770341946.<anonymous> (QuestionnaireReviewScreen.kt:181)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), QuestionnaireReviewScreen.INSTANCE.m15709getLambda$1418081542$feature_investor_profile_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1418081542$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15709getLambda$1418081542$feature_investor_profile_externalDebug() {
        return f9083lambda$1418081542;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1770341946$feature_investor_profile_externalDebug() {
        return lambda$1770341946;
    }
}
