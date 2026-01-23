package com.robinhood.android.investorprofile.p162ui.questionnaire.completed;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireCompletedScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.completed.ComposableSingletons$QuestionnaireCompletedScreenKt$lambda$772974193$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuestionnaireCompletedScreen2 implements Function2<Composer, Integer, Unit> {
    public static final QuestionnaireCompletedScreen2 INSTANCE = new QuestionnaireCompletedScreen2();

    QuestionnaireCompletedScreen2() {
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
            ComposerKt.traceEventStart(772974193, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.completed.ComposableSingletons$QuestionnaireCompletedScreenKt.lambda$772974193.<anonymous> (QuestionnaireCompletedScreen.kt:81)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.completed.ComposableSingletons$QuestionnaireCompletedScreenKt$lambda$772974193$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        QuestionnaireCompletedScreen3.QuestionnaireCompletedScreen(modifierFillMaxSize$default, (Function0) objRememberedValue, composer, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
