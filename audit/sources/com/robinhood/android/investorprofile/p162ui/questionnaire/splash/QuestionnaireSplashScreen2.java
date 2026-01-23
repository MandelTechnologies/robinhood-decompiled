package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

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

/* compiled from: QuestionnaireSplashScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireSplashScreen2 {
    public static final QuestionnaireSplashScreen2 INSTANCE = new QuestionnaireSplashScreen2();

    /* renamed from: lambda$-176413335, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9082lambda$176413335 = ComposableLambda3.composableLambdaInstance(-176413335, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt$lambda$-176413335$1
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
                ComposerKt.traceEventStart(-176413335, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt.lambda$-176413335.<anonymous> (QuestionnaireSplashScreen.kt:77)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-132715515, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9080lambda$132715515 = ComposableLambda3.composableLambdaInstance(-132715515, false, QuestionnaireSplashScreen3.INSTANCE);

    /* renamed from: lambda$-1446398139, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9081lambda$1446398139 = ComposableLambda3.composableLambdaInstance(-1446398139, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt$lambda$-1446398139$1
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
                ComposerKt.traceEventStart(-1446398139, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt.lambda$-1446398139.<anonymous> (QuestionnaireSplashScreen.kt:211)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), QuestionnaireSplashScreen2.INSTANCE.m15700getLambda$132715515$feature_investor_profile_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-132715515$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15700getLambda$132715515$feature_investor_profile_externalDebug() {
        return f9080lambda$132715515;
    }

    /* renamed from: getLambda$-1446398139$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15701getLambda$1446398139$feature_investor_profile_externalDebug() {
        return f9081lambda$1446398139;
    }

    /* renamed from: getLambda$-176413335$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15702getLambda$176413335$feature_investor_profile_externalDebug() {
        return f9082lambda$176413335;
    }
}
