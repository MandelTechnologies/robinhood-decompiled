package com.robinhood.android.investorprofile.p162ui.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.questionnaire.api.QuestionType;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt$lambda$-1418081542$1, reason: use source file name */
/* loaded from: classes10.dex */
final class QuestionnaireReviewScreen2 implements Function2<Composer, Integer, Unit> {
    public static final QuestionnaireReviewScreen2 INSTANCE = new QuestionnaireReviewScreen2();

    QuestionnaireReviewScreen2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1418081542, i, -1, "com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt.lambda$-1418081542.<anonymous> (QuestionnaireReviewScreen.kt:182)");
        }
        QuestionnaireLoggingInfo questionnaireLoggingInfo = new QuestionnaireLoggingInfo(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        QuestionType questionType = QuestionType.STRING_QUESTION;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UiQuestionnaireReview uiQuestionnaireReview = new UiQuestionnaireReview("Title", "Subtitle", CollectionsKt.listOf(new UiQuestionnaireReview.QuestionAnswer(questionType, "Question 1", "q1", new UiQuestionnaireReview.Answer(uuidRandomUUID, "Answer 1", null, "q1"))), MapsKt.emptyMap(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Confirm", InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt$lambda$-1418081542$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireReviewScreen2.invoke$lambda$1$lambda$0((UiQuestionnaireReview.QuestionAnswer) obj, (Map) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.ComposableSingletons$QuestionnaireReviewScreenKt$lambda$-1418081542$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuestionnaireReviewScreen2.invoke$lambda$3$lambda$2((List) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        QuestionnaireReviewScreen4.QuestionnaireReview(uiQuestionnaireReview, false, questionnaireLoggingInfo, function2, (Function1) objRememberedValue2, null, composer, 27696, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UiQuestionnaireReview.QuestionAnswer questionAnswer, Map map) {
        Intrinsics.checkNotNullParameter(questionAnswer, "<unused var>");
        return Unit.INSTANCE;
    }
}
