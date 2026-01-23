package com.robinhood.android.cash.disputes.extensions;

import com.robinhood.models.p355ui.DisputeQuestionnaire;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisputeQuestionnaires.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m3636d2 = {"firstQuestion", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "getFirstQuestion", "(Lcom/robinhood/models/ui/DisputeQuestionnaire;)Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestion", "nextQuestionId", "Ljava/util/UUID;", "feature-cash-disputes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.disputes.extensions.DisputeQuestionnairesKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DisputeQuestionnaires {
    public static final DisputeQuestionnaire.Question getFirstQuestion(DisputeQuestionnaire disputeQuestionnaire) {
        Intrinsics.checkNotNullParameter(disputeQuestionnaire, "<this>");
        for (DisputeQuestionnaire.Question question : disputeQuestionnaire.getQuestions()) {
            if (question.getIndex() == 0) {
                return question;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final DisputeQuestionnaire.Question getNextQuestion(DisputeQuestionnaire disputeQuestionnaire, UUID nextQuestionId) {
        Intrinsics.checkNotNullParameter(disputeQuestionnaire, "<this>");
        Intrinsics.checkNotNullParameter(nextQuestionId, "nextQuestionId");
        for (DisputeQuestionnaire.Question question : disputeQuestionnaire.getQuestions()) {
            if (Intrinsics.areEqual(question.getId(), nextQuestionId)) {
                return question;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
