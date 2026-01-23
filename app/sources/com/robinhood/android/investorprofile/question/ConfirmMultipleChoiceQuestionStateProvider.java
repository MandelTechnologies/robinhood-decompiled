package com.robinhood.android.investorprofile.question;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse2;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileSummary;
import com.robinhood.android.questionnaire.api.QuestionnaireMultipleChoiceAnswerSummary;
import com.robinhood.android.udf.StateProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConfirmMultipleChoiceQuestionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDataState;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionViewState;", "<init>", "()V", "reduce", "dataState", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ConfirmMultipleChoiceQuestionStateProvider implements StateProvider<ConfirmMultipleChoiceQuestionDataState, ConfirmMultipleChoiceQuestionViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConfirmMultipleChoiceQuestionViewState reduce(ConfirmMultipleChoiceQuestionDataState dataState) {
        ApiQuestionnaireProfileResponse2 answer_content;
        QuestionnaireMultipleChoiceAnswerSummary data;
        List<ApiQuestionnaireProfileSummary> profile_summary;
        Object next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiQuestionnaireProfileResponse profile = dataState.getProfile();
        String answer_choice_key = null;
        if (profile == null || (profile_summary = profile.getProfile_summary()) == null) {
            answer_content = null;
        } else {
            Iterator<T> it = profile_summary.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ApiQuestionnaireProfileSummary) next).getQuestion_key(), dataState.getQuestion().getKey())) {
                    break;
                }
            }
            ApiQuestionnaireProfileSummary apiQuestionnaireProfileSummary = (ApiQuestionnaireProfileSummary) next;
            if (apiQuestionnaireProfileSummary != null) {
                answer_content = apiQuestionnaireProfileSummary.getAnswer_content();
            }
        }
        if ((answer_content instanceof ApiQuestionnaireProfileResponse2.MultipleChoiceAnswer) && (data = ((ApiQuestionnaireProfileResponse2.MultipleChoiceAnswer) answer_content).getData()) != null) {
            answer_choice_key = data.getAnswer_choice_key();
        }
        return new ConfirmMultipleChoiceQuestionViewState(answer_choice_key);
    }
}
