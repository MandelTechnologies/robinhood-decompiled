package com.robinhood.android.investorprofile.p162ui.questionnaire;

import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import kotlin.Metadata;

/* compiled from: QuestionFragmentCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "T", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "", "onQuestionAnswered", "", "contextualInfo", "answer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "(Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;)V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface QuestionFragmentCallbacks<T extends ContextualQuestionInfo> {
    void onQuestionAnswered(T contextualInfo, QuestionnaireAnswer answer);
}
