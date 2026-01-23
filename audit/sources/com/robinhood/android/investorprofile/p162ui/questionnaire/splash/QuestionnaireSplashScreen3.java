package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireSplashScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt$lambda$-132715515$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuestionnaireSplashScreen3 implements Function2<Composer, Integer, Unit> {
    public static final QuestionnaireSplashScreen3 INSTANCE = new QuestionnaireSplashScreen3();

    QuestionnaireSplashScreen3() {
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
            ComposerKt.traceEventStart(-132715515, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt.lambda$-132715515.<anonymous> (QuestionnaireSplashScreen.kt:214)");
        }
        Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
        QuestionnaireSplashCallbacks questionnaireSplashCallbacks = new QuestionnaireSplashCallbacks() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt$lambda$-132715515$1.1
            @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashCallbacks
            public void onSplashScreenContinueClicked() {
            }
        };
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$QuestionnaireSplashScreenKt$lambda$-132715515$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        QuestionnaireSplashScreen6.QuestionnaireSplashScreen(context, questionnaireSplashCallbacks, modifierM4872backgroundbw27NRU$default, null, (Function0) objRememberedValue, composer, 24576, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
