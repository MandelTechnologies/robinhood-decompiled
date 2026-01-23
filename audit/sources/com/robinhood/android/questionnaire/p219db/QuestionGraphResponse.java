package com.robinhood.android.questionnaire.p219db;

import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionGraphResponse.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/db/QuestionGraphResponse;", "", "context", "", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "rootQuestion", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getQuestionGraph", "()Ljava/util/Map;", "getRootQuestion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class QuestionGraphResponse {
    private final String context;
    private final Map<String, UiQuestionnaireQuestion> questionGraph;
    private final String rootQuestion;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionGraphResponse copy$default(QuestionGraphResponse questionGraphResponse, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionGraphResponse.context;
        }
        if ((i & 2) != 0) {
            map = questionGraphResponse.questionGraph;
        }
        if ((i & 4) != 0) {
            str2 = questionGraphResponse.rootQuestion;
        }
        return questionGraphResponse.copy(str, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, UiQuestionnaireQuestion> component2() {
        return this.questionGraph;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRootQuestion() {
        return this.rootQuestion;
    }

    public final QuestionGraphResponse copy(String context, Map<String, ? extends UiQuestionnaireQuestion> questionGraph, String rootQuestion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(questionGraph, "questionGraph");
        Intrinsics.checkNotNullParameter(rootQuestion, "rootQuestion");
        return new QuestionGraphResponse(context, questionGraph, rootQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionGraphResponse)) {
            return false;
        }
        QuestionGraphResponse questionGraphResponse = (QuestionGraphResponse) other;
        return Intrinsics.areEqual(this.context, questionGraphResponse.context) && Intrinsics.areEqual(this.questionGraph, questionGraphResponse.questionGraph) && Intrinsics.areEqual(this.rootQuestion, questionGraphResponse.rootQuestion);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.questionGraph.hashCode()) * 31) + this.rootQuestion.hashCode();
    }

    public String toString() {
        return "QuestionGraphResponse(context=" + this.context + ", questionGraph=" + this.questionGraph + ", rootQuestion=" + this.rootQuestion + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionGraphResponse(String context, Map<String, ? extends UiQuestionnaireQuestion> questionGraph, String rootQuestion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(questionGraph, "questionGraph");
        Intrinsics.checkNotNullParameter(rootQuestion, "rootQuestion");
        this.context = context;
        this.questionGraph = questionGraph;
        this.rootQuestion = rootQuestion;
    }

    public final String getContext() {
        return this.context;
    }

    public final Map<String, UiQuestionnaireQuestion> getQuestionGraph() {
        return this.questionGraph;
    }

    public final String getRootQuestion() {
        return this.rootQuestion;
    }
}
