package com.robinhood.android.cash.disputes.p070ui.question;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: DisputeQuestionCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "", "onQuestionAnswered", "", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "getPreviousQuestionResponse", "questionId", "Ljava/util/UUID;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DisputeQuestionCallbacks {
    DisputeQuestionResponse getPreviousQuestionResponse(UUID questionId);

    void onQuestionAnswered(DisputeQuestionResponse response);
}
