package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireStringQuestionFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionFragment;
import com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionFragment;
import com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenFragment;
import com.robinhood.android.investorprofile.question.OptionalIntegerQuestionFragment;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.OptionalIntegerQuestionAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010¨\u0006\u0012"}, m3636d2 = {"createFragmentForQuestion", "Landroidx/fragment/app/Fragment;", "accountNumber", "", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "questionnaireContext", "contextualQuestionInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "selectedQuestion", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "showExistingAnswer", "", "useInfoGatherFlow", "feature-investor-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UtilKt {
    public static /* synthetic */ Fragment createFragmentForQuestion$default(String str, StringResource stringResource, String str2, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.Supported supported, QuestionnaireLoggingInfo questionnaireLoggingInfo, QuestionnaireQuestion questionnaireQuestion, boolean z, boolean z2, int i, Object obj) {
        if ((i & 128) != 0) {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = false;
        }
        return createFragmentForQuestion(str, stringResource, str2, contextualQuestionInfo, supported, questionnaireLoggingInfo, questionnaireQuestion, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Fragment createFragmentForQuestion(String str, StringResource stringResource, String questionnaireContext, ContextualQuestionInfo contextualQuestionInfo, UiQuestionnaireQuestion.Supported question, QuestionnaireLoggingInfo loggingInfo, QuestionnaireQuestion questionnaireQuestion, boolean z, boolean z2) {
        OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswerFrom;
        Fragment fragmentNewInstance;
        String existingAnswer;
        Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
        Intrinsics.checkNotNullParameter(contextualQuestionInfo, "contextualQuestionInfo");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        if (question instanceof UiQuestionnaireQuestion.MultipleChoiceQuestion) {
            if (z2) {
                fragmentNewInstance = ConfirmMultipleChoiceQuestionFragment.INSTANCE.newInstance((Parcelable) new ConfirmMultipleChoiceQuestionFragment.Args(stringResource, str, questionnaireContext, contextualQuestionInfo, z, (UiQuestionnaireQuestion.MultipleChoiceQuestion) question, loggingInfo));
            } else {
                fragmentNewInstance = QuestionnaireMultipleChoiceQuestionFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireMultipleChoiceQuestionFragment.Args(stringResource, contextualQuestionInfo, (UiQuestionnaireQuestion.MultipleChoiceQuestion) question, loggingInfo));
            }
        } else if (question instanceof UiQuestionnaireQuestion.HybridQuestion) {
            fragmentNewInstance = QuestionnaireHybridStringQuestionFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireHybridStringQuestionFragment.Args(stringResource, contextualQuestionInfo, (UiQuestionnaireQuestion.HybridQuestion) question, loggingInfo));
        } else if (question instanceof UiQuestionnaireQuestion.MultipleResponseQuestion) {
            fragmentNewInstance = QuestionnaireMultipleResponseQuestionFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireMultipleResponseQuestionFragment.Args(stringResource, contextualQuestionInfo, (UiQuestionnaireQuestion.MultipleResponseQuestion) question, loggingInfo));
        } else if (question instanceof UiQuestionnaireQuestion.IntegerQuestion) {
            QuestionnaireIntegerQuestionFragment.Companion companion = QuestionnaireIntegerQuestionFragment.INSTANCE;
            String existingAnswer2 = null;
            UiQuestionnaireQuestion.IntegerQuestion integerQuestion = (UiQuestionnaireQuestion.IntegerQuestion) question;
            if (Intrinsics.areEqual(questionnaireQuestion != null ? questionnaireQuestion.getQuestionKey() : null, integerQuestion.getKey())) {
                existingAnswer2 = questionnaireQuestion.getExistingAnswer();
            }
            fragmentNewInstance = companion.newInstance((Parcelable) new QuestionnaireIntegerQuestionFragment.Args(stringResource, contextualQuestionInfo, integerQuestion, existingAnswer2, loggingInfo));
        } else if (question instanceof UiQuestionnaireQuestion.StringQuestion) {
            if (z2 || Intrinsics.areEqual(questionnaireContext, QuestionnaireContexts.CRYPTO_SCAM)) {
                fragmentNewInstance = FreeFormTextQuestionScreenFragment.INSTANCE.newInstance((Parcelable) new FreeFormTextQuestionScreenFragment.Args(stringResource, contextualQuestionInfo, (UiQuestionnaireQuestion.StringQuestion) question, loggingInfo));
            } else {
                fragmentNewInstance = QuestionnaireStringQuestionFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireStringQuestionFragment.Args(stringResource, contextualQuestionInfo, (UiQuestionnaireQuestion.StringQuestion) question, loggingInfo));
            }
        } else {
            if (!(question instanceof UiQuestionnaireQuestion.OptionalIntegerQuestion)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionalIntegerQuestionFragment.Companion companion2 = OptionalIntegerQuestionFragment.INSTANCE;
            UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion = (UiQuestionnaireQuestion.OptionalIntegerQuestion) question;
            if (questionnaireQuestion == null) {
                optionalIntegerQuestionAnswerFrom = null;
                fragmentNewInstance = companion2.newInstance((Parcelable) new OptionalIntegerQuestionFragment.Args(stringResource, contextualQuestionInfo, optionalIntegerQuestion, loggingInfo, optionalIntegerQuestionAnswerFrom));
            } else {
                if (!Intrinsics.areEqual(questionnaireQuestion.getQuestionKey(), optionalIntegerQuestion.getKey())) {
                    questionnaireQuestion = null;
                }
                if (questionnaireQuestion != null && (existingAnswer = questionnaireQuestion.getExistingAnswer()) != null) {
                    optionalIntegerQuestionAnswerFrom = OptionalIntegerQuestionAnswer.INSTANCE.from(existingAnswer);
                }
                fragmentNewInstance = companion2.newInstance((Parcelable) new OptionalIntegerQuestionFragment.Args(stringResource, contextualQuestionInfo, optionalIntegerQuestion, loggingInfo, optionalIntegerQuestionAnswerFrom));
            }
        }
        if (!BuildFlavors.INSTANCE.isDebugOrInternal() || (fragmentNewInstance instanceof QuestionableFragment)) {
            return fragmentNewInstance;
        }
        throw new IllegalStateException(("Fragment " + fragmentNewInstance + " doesn't implement QuestionableFragment").toString());
    }
}
