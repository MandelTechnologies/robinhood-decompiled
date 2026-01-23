package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import android.view.KeyEvent;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireIntegerQuestionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt$lambda$2145727007$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuestionnaireIntegerQuestionScreen2 implements Function2<Composer, Integer, Unit> {
    public static final QuestionnaireIntegerQuestionScreen2 INSTANCE = new QuestionnaireIntegerQuestionScreen2();

    QuestionnaireIntegerQuestionScreen2() {
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
            ComposerKt.traceEventStart(2145727007, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt.lambda$2145727007.<anonymous> (QuestionnaireIntegerQuestionScreen.kt:208)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getNova(), null, 2, null), 0.0f, 1, null);
        QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState = new QuestionnaireIntegerQuestionViewState("65", true, false, "When do you plan to retire?", "It's okay if this is an estimate. The average retirement age in the US is 65.", "Enter an your retirement age", "Lorem ipsum dolor amet", new GenericAlertContent("Enter 35 or greater", "Our system won't accept any number less than 35 here", null, CollectionsKt.emptyList(), null, null, null, null, false, 500, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt$lambda$2145727007$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuestionnaireIntegerQuestionScreen2.invoke$lambda$1$lambda$0((KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt$lambda$2145727007$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt$lambda$2145727007$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function02 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.ComposableSingletons$QuestionnaireIntegerQuestionScreenKt$lambda$2145727007$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        QuestionnaireIntegerQuestionScreen3.IntegerQuestionInput(questionnaireIntegerQuestionViewState, function1, function0, function02, modifierFillMaxSize$default, (Function0) objRememberedValue4, composer, 200112, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
