package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.p219db.QuestionGraphResponse;
import com.squareup.moshi.JsonClass;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ApiQuestionGraphResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionGraphResponse;", "", "context", "", "question_graph", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "root_question", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getQuestion_graph", "()Ljava/util/Map;", "getRoot_question", "toUiModel", "Lcom/robinhood/android/questionnaire/db/QuestionGraphResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionGraphResponse {
    private final String context;
    private final Map<String, ApiQuestionnaireQuestion> question_graph;
    private final String root_question;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiQuestionGraphResponse copy$default(ApiQuestionGraphResponse apiQuestionGraphResponse, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiQuestionGraphResponse.context;
        }
        if ((i & 2) != 0) {
            map = apiQuestionGraphResponse.question_graph;
        }
        if ((i & 4) != 0) {
            str2 = apiQuestionGraphResponse.root_question;
        }
        return apiQuestionGraphResponse.copy(str, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, ApiQuestionnaireQuestion> component2() {
        return this.question_graph;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRoot_question() {
        return this.root_question;
    }

    public final ApiQuestionGraphResponse copy(String context, Map<String, ApiQuestionnaireQuestion> question_graph, String root_question) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question_graph, "question_graph");
        Intrinsics.checkNotNullParameter(root_question, "root_question");
        return new ApiQuestionGraphResponse(context, question_graph, root_question);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionGraphResponse)) {
            return false;
        }
        ApiQuestionGraphResponse apiQuestionGraphResponse = (ApiQuestionGraphResponse) other;
        return Intrinsics.areEqual(this.context, apiQuestionGraphResponse.context) && Intrinsics.areEqual(this.question_graph, apiQuestionGraphResponse.question_graph) && Intrinsics.areEqual(this.root_question, apiQuestionGraphResponse.root_question);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.question_graph.hashCode()) * 31) + this.root_question.hashCode();
    }

    public String toString() {
        return "ApiQuestionGraphResponse(context=" + this.context + ", question_graph=" + this.question_graph + ", root_question=" + this.root_question + ")";
    }

    public ApiQuestionGraphResponse(String context, Map<String, ApiQuestionnaireQuestion> question_graph, String root_question) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question_graph, "question_graph");
        Intrinsics.checkNotNullParameter(root_question, "root_question");
        this.context = context;
        this.question_graph = question_graph;
        this.root_question = root_question;
    }

    public final String getContext() {
        return this.context;
    }

    public final Map<String, ApiQuestionnaireQuestion> getQuestion_graph() {
        return this.question_graph;
    }

    public final String getRoot_question() {
        return this.root_question;
    }

    public final QuestionGraphResponse toUiModel() {
        String str = this.context;
        Set<Map.Entry<String, ApiQuestionnaireQuestion>> setEntrySet = this.question_graph.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((ApiQuestionnaireQuestion) entry.getValue()).toUiModel());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new QuestionGraphResponse(str, linkedHashMap, this.root_question);
    }
}
