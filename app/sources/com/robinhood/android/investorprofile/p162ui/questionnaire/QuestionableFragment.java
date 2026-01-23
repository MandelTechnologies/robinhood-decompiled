package com.robinhood.android.investorprofile.p162ui.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import kotlin.Metadata;

/* compiled from: QuestionableFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionableFragment;", "", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "isAccountBasedQuestion", "", "()Z", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface QuestionableFragment {
    UiQuestionnaireQuestion.Supported getQuestion();

    boolean isAccountBasedQuestion();

    /* compiled from: QuestionableFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean isAccountBasedQuestion(QuestionableFragment questionableFragment) {
            return questionableFragment.getQuestion().getContext() == ApiQuestionnaireQuestion.Context.ACCOUNT;
        }
    }
}
