package com.robinhood.android.questionnaire.p219db;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireCompletedResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireCompleted.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/android/questionnaire/db/QuestionnaireCompleted;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireCompletedResponse;", "lib-models-questionnaire_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.questionnaire.db.QuestionnaireCompletedKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class QuestionnaireCompleted2 {
    public static final QuestionnaireCompleted toDbModel(ApiQuestionnaireCompletedResponse apiQuestionnaireCompletedResponse) {
        Intrinsics.checkNotNullParameter(apiQuestionnaireCompletedResponse, "<this>");
        return new QuestionnaireCompleted(apiQuestionnaireCompletedResponse.getCompleted(), apiQuestionnaireCompletedResponse.getContext(), apiQuestionnaireCompletedResponse.getAccount_number());
    }
}
