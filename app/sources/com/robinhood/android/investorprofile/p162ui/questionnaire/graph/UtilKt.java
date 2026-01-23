package com.robinhood.android.investorprofile.p162ui.questionnaire.graph;

import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001aN\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001a\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u0014"}, m3636d2 = {"getNextQuestion", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "graph", "", "", "pendingRedirects", "", "Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireRedirect;", "processedRedirects", "answer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "shouldAnswerEntireQuestionnaire", "", "getRedirectDestinations", "", "currentAnswerRedirectIds", "deletePendingRedirectsOriginatingFrom", "", "originatingQuestionId", "Ljava/util/UUID;", "feature-investor-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UtilKt {
    public static final UiQuestionnaireQuestion.Supported getNextQuestion(Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, List<QuestionnaireRedirect> pendingRedirects, List<QuestionnaireRedirect> processedRedirects, QuestionnaireAnswer answer, boolean z) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(pendingRedirects, "pendingRedirects");
        Intrinsics.checkNotNullParameter(processedRedirects, "processedRedirects");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return getNextQuestion(graph, answer, pendingRedirects, processedRedirects, getRedirectDestinations(answer, z));
    }

    public static final List<String> getRedirectDestinations(QuestionnaireAnswer answer, boolean z) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        return (z || answer.getRedirectRequired()) ? answer.getRedirectDestinations() : CollectionsKt.emptyList();
    }

    public static final UiQuestionnaireQuestion.Supported getNextQuestion(Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, QuestionnaireAnswer answer, List<QuestionnaireRedirect> pendingRedirects, List<QuestionnaireRedirect> processedRedirects, List<String> currentAnswerRedirectIds) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(pendingRedirects, "pendingRedirects");
        Intrinsics.checkNotNullParameter(processedRedirects, "processedRedirects");
        Intrinsics.checkNotNullParameter(currentAnswerRedirectIds, "currentAnswerRedirectIds");
        deletePendingRedirectsOriginatingFrom(answer.getQuestion().getId(), pendingRedirects);
        int size = currentAnswerRedirectIds.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                pendingRedirects.add(0, new QuestionnaireRedirect(answer.getQuestion().getId(), currentAnswerRedirectIds.get(size)));
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        QuestionnaireRedirect questionnaireRedirect = (QuestionnaireRedirect) CollectionsKt.removeFirstOrNull(pendingRedirects);
        if (questionnaireRedirect != null) {
            processedRedirects.add(0, questionnaireRedirect);
        }
        return graph.get(questionnaireRedirect != null ? questionnaireRedirect.getRedirect() : null);
    }

    private static final void deletePendingRedirectsOriginatingFrom(UUID uuid, List<QuestionnaireRedirect> list) {
        final List listMutableListOf = CollectionsKt.mutableListOf(uuid);
        while (!listMutableListOf.isEmpty()) {
            final UUID uuid2 = (UUID) listMutableListOf.remove(0);
            list.removeIf(new Predicate() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.graph.UtilKt.deletePendingRedirectsOriginatingFrom.1
                @Override // java.util.function.Predicate
                public final boolean test(QuestionnaireRedirect candidate) {
                    UUID uuid3;
                    Intrinsics.checkNotNullParameter(candidate, "candidate");
                    boolean zAreEqual = Intrinsics.areEqual(candidate.getOriginatingQuestionId(), uuid2);
                    if (zAreEqual) {
                        try {
                            uuid3 = StringsKt.toUuid(candidate.getRedirect());
                        } catch (IllegalArgumentException unused) {
                            uuid3 = null;
                        }
                        if (uuid3 != null) {
                            List<UUID> list2 = listMutableListOf;
                            if (!list2.contains(uuid3)) {
                                list2.add(uuid3);
                            }
                        }
                    }
                    return zAreEqual;
                }
            });
        }
    }
}
