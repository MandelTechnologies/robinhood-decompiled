package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.p219db.QuestionGraphResponse;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireQuestionsResult.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "", "HasUnknownQuestionType", "HasNoQuestions", "QuestionList", "QuestionGraph", "Companion", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$HasNoQuestions;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$HasUnknownQuestionType;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$QuestionGraph;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$QuestionList;", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface QuestionnaireQuestionsResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: QuestionnaireQuestionsResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$HasUnknownQuestionType;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HasUnknownQuestionType implements QuestionnaireQuestionsResult {
        public static final HasUnknownQuestionType INSTANCE = new HasUnknownQuestionType();

        public boolean equals(Object other) {
            return this == other || (other instanceof HasUnknownQuestionType);
        }

        public int hashCode() {
            return -336046870;
        }

        public String toString() {
            return "HasUnknownQuestionType";
        }

        private HasUnknownQuestionType() {
        }
    }

    /* compiled from: QuestionnaireQuestionsResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$HasNoQuestions;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HasNoQuestions implements QuestionnaireQuestionsResult {
        public static final HasNoQuestions INSTANCE = new HasNoQuestions();

        public boolean equals(Object other) {
            return this == other || (other instanceof HasNoQuestions);
        }

        public int hashCode() {
            return -2119494708;
        }

        public String toString() {
            return "HasNoQuestions";
        }

        private HasNoQuestions() {
        }
    }

    /* compiled from: QuestionnaireQuestionsResult.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$QuestionList;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "questions", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Account;)V", "getQuestions", "()Ljava/util/List;", "getAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionList implements QuestionnaireQuestionsResult {
        private final Account account;
        private final List<UiQuestionnaireQuestion.Supported> questions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuestionList copy$default(QuestionList questionList, List list, Account account, int i, Object obj) {
            if ((i & 1) != 0) {
                list = questionList.questions;
            }
            if ((i & 2) != 0) {
                account = questionList.account;
            }
            return questionList.copy(list, account);
        }

        public final List<UiQuestionnaireQuestion.Supported> component1() {
            return this.questions;
        }

        /* renamed from: component2, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        public final QuestionList copy(List<? extends UiQuestionnaireQuestion.Supported> questions, Account account) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            return new QuestionList(questions, account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionList)) {
                return false;
            }
            QuestionList questionList = (QuestionList) other;
            return Intrinsics.areEqual(this.questions, questionList.questions) && Intrinsics.areEqual(this.account, questionList.account);
        }

        public int hashCode() {
            int iHashCode = this.questions.hashCode() * 31;
            Account account = this.account;
            return iHashCode + (account == null ? 0 : account.hashCode());
        }

        public String toString() {
            return "QuestionList(questions=" + this.questions + ", account=" + this.account + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QuestionList(List<? extends UiQuestionnaireQuestion.Supported> questions, Account account) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            this.questions = questions;
            this.account = account;
        }

        public final List<UiQuestionnaireQuestion.Supported> getQuestions() {
            return this.questions;
        }

        public final Account getAccount() {
            return this.account;
        }
    }

    /* compiled from: QuestionnaireQuestionsResult.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$QuestionGraph;", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "graph", "", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "rootQuestion", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getGraph", "()Ljava/util/Map;", "getRootQuestion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionGraph implements QuestionnaireQuestionsResult {
        private final Map<String, UiQuestionnaireQuestion.Supported> graph;
        private final String rootQuestion;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuestionGraph copy$default(QuestionGraph questionGraph, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = questionGraph.graph;
            }
            if ((i & 2) != 0) {
                str = questionGraph.rootQuestion;
            }
            return questionGraph.copy(map, str);
        }

        public final Map<String, UiQuestionnaireQuestion.Supported> component1() {
            return this.graph;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRootQuestion() {
            return this.rootQuestion;
        }

        public final QuestionGraph copy(Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, String rootQuestion) {
            Intrinsics.checkNotNullParameter(graph, "graph");
            Intrinsics.checkNotNullParameter(rootQuestion, "rootQuestion");
            return new QuestionGraph(graph, rootQuestion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionGraph)) {
                return false;
            }
            QuestionGraph questionGraph = (QuestionGraph) other;
            return Intrinsics.areEqual(this.graph, questionGraph.graph) && Intrinsics.areEqual(this.rootQuestion, questionGraph.rootQuestion);
        }

        public int hashCode() {
            return (this.graph.hashCode() * 31) + this.rootQuestion.hashCode();
        }

        public String toString() {
            return "QuestionGraph(graph=" + this.graph + ", rootQuestion=" + this.rootQuestion + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QuestionGraph(Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, String rootQuestion) {
            Intrinsics.checkNotNullParameter(graph, "graph");
            Intrinsics.checkNotNullParameter(rootQuestion, "rootQuestion");
            this.graph = graph;
            this.rootQuestion = rootQuestion;
        }

        public final Map<String, UiQuestionnaireQuestion.Supported> getGraph() {
            return this.graph;
        }

        public final String getRootQuestion() {
            return this.rootQuestion;
        }
    }

    /* compiled from: QuestionnaireQuestionsResult.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "questions", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "account", "Lcom/robinhood/models/db/Account;", "response", "Lcom/robinhood/android/questionnaire/db/QuestionGraphResponse;", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final QuestionnaireQuestionsResult from(List<? extends UiQuestionnaireQuestion> questions, Account account) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            ArrayList arrayList = new ArrayList();
            for (Object obj : questions) {
                if (obj instanceof UiQuestionnaireQuestion.Supported) {
                    arrayList.add(obj);
                }
            }
            return !Intrinsics.areEqual(questions, arrayList) ? HasUnknownQuestionType.INSTANCE : questions.isEmpty() ? HasNoQuestions.INSTANCE : new QuestionList(arrayList, account);
        }

        public final QuestionnaireQuestionsResult from(QuestionGraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Collection<UiQuestionnaireQuestion> collectionValues = response.getQuestionGraph().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof UiQuestionnaireQuestion.Supported) {
                    arrayList.add(obj);
                }
            }
            if (collectionValues.isEmpty()) {
                return HasNoQuestions.INSTANCE;
            }
            if (arrayList.size() != collectionValues.size()) {
                return HasUnknownQuestionType.INSTANCE;
            }
            String rootQuestion = response.getRootQuestion();
            Map<String, UiQuestionnaireQuestion> questionGraph = response.getQuestionGraph();
            ArrayList arrayList2 = new ArrayList(questionGraph.size());
            for (Map.Entry<String, UiQuestionnaireQuestion> entry : questionGraph.entrySet()) {
                String key = entry.getKey();
                UiQuestionnaireQuestion value = entry.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported");
                arrayList2.add(Tuples4.m3642to(key, (UiQuestionnaireQuestion.Supported) value));
            }
            return new QuestionGraph(MapsKt.toMap(arrayList2), rootQuestion);
        }
    }
}
