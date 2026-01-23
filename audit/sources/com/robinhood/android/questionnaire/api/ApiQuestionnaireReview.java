package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ApiQuestionnaireReview.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview;", "", "title_markdown", "", "subtitle_markdown", "question_answers", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$QuestionAnswer;", "question_graph", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "disclosure_markdown", "cta_text", "red_flag_status", "", "redirect_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getTitle_markdown", "()Ljava/lang/String;", "getSubtitle_markdown", "getQuestion_answers", "()Ljava/util/List;", "getQuestion_graph", "()Ljava/util/Map;", "getDisclosure_markdown", "getCta_text", "getRed_flag_status", "()I", "getRedirect_url", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "QuestionAnswer", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireReview {
    private final String cta_text;
    private final String disclosure_markdown;
    private final List<QuestionAnswer> question_answers;
    private final Map<String, ApiQuestionnaireQuestion> question_graph;
    private final int red_flag_status;
    private final String redirect_url;
    private final String subtitle_markdown;
    private final String title_markdown;

    public static /* synthetic */ ApiQuestionnaireReview copy$default(ApiQuestionnaireReview apiQuestionnaireReview, String str, String str2, List list, Map map, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apiQuestionnaireReview.title_markdown;
        }
        if ((i2 & 2) != 0) {
            str2 = apiQuestionnaireReview.subtitle_markdown;
        }
        if ((i2 & 4) != 0) {
            list = apiQuestionnaireReview.question_answers;
        }
        if ((i2 & 8) != 0) {
            map = apiQuestionnaireReview.question_graph;
        }
        if ((i2 & 16) != 0) {
            str3 = apiQuestionnaireReview.disclosure_markdown;
        }
        if ((i2 & 32) != 0) {
            str4 = apiQuestionnaireReview.cta_text;
        }
        if ((i2 & 64) != 0) {
            i = apiQuestionnaireReview.red_flag_status;
        }
        if ((i2 & 128) != 0) {
            str5 = apiQuestionnaireReview.redirect_url;
        }
        int i3 = i;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return apiQuestionnaireReview.copy(str, str2, list, map, str7, str8, i3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle_markdown() {
        return this.title_markdown;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final List<QuestionAnswer> component3() {
        return this.question_answers;
    }

    public final Map<String, ApiQuestionnaireQuestion> component4() {
        return this.question_graph;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCta_text() {
        return this.cta_text;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRed_flag_status() {
        return this.red_flag_status;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRedirect_url() {
        return this.redirect_url;
    }

    public final ApiQuestionnaireReview copy(String title_markdown, String subtitle_markdown, List<QuestionAnswer> question_answers, Map<String, ApiQuestionnaireQuestion> question_graph, String disclosure_markdown, String cta_text, int red_flag_status, String redirect_url) {
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(question_answers, "question_answers");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        return new ApiQuestionnaireReview(title_markdown, subtitle_markdown, question_answers, question_graph, disclosure_markdown, cta_text, red_flag_status, redirect_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireReview)) {
            return false;
        }
        ApiQuestionnaireReview apiQuestionnaireReview = (ApiQuestionnaireReview) other;
        return Intrinsics.areEqual(this.title_markdown, apiQuestionnaireReview.title_markdown) && Intrinsics.areEqual(this.subtitle_markdown, apiQuestionnaireReview.subtitle_markdown) && Intrinsics.areEqual(this.question_answers, apiQuestionnaireReview.question_answers) && Intrinsics.areEqual(this.question_graph, apiQuestionnaireReview.question_graph) && Intrinsics.areEqual(this.disclosure_markdown, apiQuestionnaireReview.disclosure_markdown) && Intrinsics.areEqual(this.cta_text, apiQuestionnaireReview.cta_text) && this.red_flag_status == apiQuestionnaireReview.red_flag_status && Intrinsics.areEqual(this.redirect_url, apiQuestionnaireReview.redirect_url);
    }

    public int hashCode() {
        int iHashCode = ((((this.title_markdown.hashCode() * 31) + this.subtitle_markdown.hashCode()) * 31) + this.question_answers.hashCode()) * 31;
        Map<String, ApiQuestionnaireQuestion> map = this.question_graph;
        int iHashCode2 = (((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.disclosure_markdown.hashCode()) * 31) + this.cta_text.hashCode()) * 31) + Integer.hashCode(this.red_flag_status)) * 31;
        String str = this.redirect_url;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ApiQuestionnaireReview(title_markdown=" + this.title_markdown + ", subtitle_markdown=" + this.subtitle_markdown + ", question_answers=" + this.question_answers + ", question_graph=" + this.question_graph + ", disclosure_markdown=" + this.disclosure_markdown + ", cta_text=" + this.cta_text + ", red_flag_status=" + this.red_flag_status + ", redirect_url=" + this.redirect_url + ")";
    }

    public ApiQuestionnaireReview(String title_markdown, String subtitle_markdown, List<QuestionAnswer> question_answers, Map<String, ApiQuestionnaireQuestion> map, String disclosure_markdown, String cta_text, int i, String str) {
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(question_answers, "question_answers");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        this.title_markdown = title_markdown;
        this.subtitle_markdown = subtitle_markdown;
        this.question_answers = question_answers;
        this.question_graph = map;
        this.disclosure_markdown = disclosure_markdown;
        this.cta_text = cta_text;
        this.red_flag_status = i;
        this.redirect_url = str;
    }

    public final String getTitle_markdown() {
        return this.title_markdown;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final List<QuestionAnswer> getQuestion_answers() {
        return this.question_answers;
    }

    public final Map<String, ApiQuestionnaireQuestion> getQuestion_graph() {
        return this.question_graph;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final int getRed_flag_status() {
        return this.red_flag_status;
    }

    public final String getRedirect_url() {
        return this.redirect_url;
    }

    public final UiQuestionnaireReview toUiModel() {
        LinkedHashMap linkedHashMap;
        Set<Map.Entry<String, ApiQuestionnaireQuestion>> setEntrySet;
        String str = this.title_markdown;
        String str2 = this.subtitle_markdown;
        List<QuestionAnswer> list = this.question_answers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuestionAnswer) it.next()).toUiModel());
        }
        Map<String, ApiQuestionnaireQuestion> map = this.question_graph;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            linkedHashMap = null;
        } else {
            Set<Map.Entry<String, ApiQuestionnaireQuestion>> set = setEntrySet;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                arrayList2.add(Tuples4.m3642to((String) entry.getKey(), ((ApiQuestionnaireQuestion) entry.getValue()).toUiModel()));
            }
            ArrayList<Tuples2> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((UiQuestionnaireQuestion) ((Tuples2) obj).component2()) instanceof UiQuestionnaireQuestion.Supported) {
                    arrayList3.add(obj);
                }
            }
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList3, 10)), 16));
            for (Tuples2 tuples2 : arrayList3) {
                String str3 = (String) tuples2.component1();
                UiQuestionnaireQuestion uiQuestionnaireQuestion = (UiQuestionnaireQuestion) tuples2.component2();
                Intrinsics.checkNotNull(uiQuestionnaireQuestion, "null cannot be cast to non-null type com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported");
                Tuples2 tuples2M3642to = Tuples4.m3642to(str3, (UiQuestionnaireQuestion.Supported) uiQuestionnaireQuestion);
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        String str4 = this.disclosure_markdown;
        String str5 = this.cta_text;
        InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatusFromValue = InvestorProfileQuestionnaireContext.RedFlagStatus.INSTANCE.fromValue(this.red_flag_status);
        Intrinsics.checkNotNull(redFlagStatusFromValue);
        return new UiQuestionnaireReview(str, str2, arrayList, linkedHashMap2, str4, str5, redFlagStatusFromValue, this.redirect_url);
    }

    /* compiled from: ApiQuestionnaireReview.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$QuestionAnswer;", "", "type", "Lcom/robinhood/android/questionnaire/api/QuestionType;", "title", "", "key", "answer", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$Answer;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$Answer;)V", "getType", "()Lcom/robinhood/android/questionnaire/api/QuestionType;", "getTitle", "()Ljava/lang/String;", "getKey", "getAnswer", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$Answer;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionAnswer {
        private final Answer answer;
        private final String key;
        private final String title;
        private final QuestionType type;

        public static /* synthetic */ QuestionAnswer copy$default(QuestionAnswer questionAnswer, QuestionType questionType, String str, String str2, Answer answer, int i, Object obj) {
            if ((i & 1) != 0) {
                questionType = questionAnswer.type;
            }
            if ((i & 2) != 0) {
                str = questionAnswer.title;
            }
            if ((i & 4) != 0) {
                str2 = questionAnswer.key;
            }
            if ((i & 8) != 0) {
                answer = questionAnswer.answer;
            }
            return questionAnswer.copy(questionType, str, str2, answer);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component4, reason: from getter */
        public final Answer getAnswer() {
            return this.answer;
        }

        public final QuestionAnswer copy(QuestionType type2, String title, String key, Answer answer) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(key, "key");
            return new QuestionAnswer(type2, title, key, answer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionAnswer)) {
                return false;
            }
            QuestionAnswer questionAnswer = (QuestionAnswer) other;
            return this.type == questionAnswer.type && Intrinsics.areEqual(this.title, questionAnswer.title) && Intrinsics.areEqual(this.key, questionAnswer.key) && Intrinsics.areEqual(this.answer, questionAnswer.answer);
        }

        public int hashCode() {
            int iHashCode = ((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.key.hashCode()) * 31;
            Answer answer = this.answer;
            return iHashCode + (answer == null ? 0 : answer.hashCode());
        }

        public String toString() {
            return "QuestionAnswer(type=" + this.type + ", title=" + this.title + ", key=" + this.key + ", answer=" + this.answer + ")";
        }

        public QuestionAnswer(QuestionType type2, String title, String key, Answer answer) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(key, "key");
            this.type = type2;
            this.title = title;
            this.key = key;
            this.answer = answer;
        }

        public final QuestionType getType() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getKey() {
            return this.key;
        }

        public final Answer getAnswer() {
            return this.answer;
        }

        public final UiQuestionnaireReview.QuestionAnswer toUiModel() {
            QuestionType questionType = this.type;
            String str = this.title;
            String str2 = this.key;
            Answer answer = this.answer;
            return new UiQuestionnaireReview.QuestionAnswer(questionType, str, str2, answer != null ? answer.toUiModel() : null);
        }
    }

    /* compiled from: ApiQuestionnaireReview.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview$Answer;", "", "id", "Ljava/util/UUID;", "value", "", "answer_key", "question_id", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getValue", "()Ljava/lang/String;", "getAnswer_key", "getQuestion_id", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$Answer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Answer {
        private final String answer_key;
        private final UUID id;
        private final String question_id;
        private final String value;

        public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = answer.id;
            }
            if ((i & 2) != 0) {
                str = answer.value;
            }
            if ((i & 4) != 0) {
                str2 = answer.answer_key;
            }
            if ((i & 8) != 0) {
                str3 = answer.question_id;
            }
            return answer.copy(uuid, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnswer_key() {
            return this.answer_key;
        }

        /* renamed from: component4, reason: from getter */
        public final String getQuestion_id() {
            return this.question_id;
        }

        public final Answer copy(UUID id, String value, String answer_key, String question_id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(question_id, "question_id");
            return new Answer(id, value, answer_key, question_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.value, answer.value) && Intrinsics.areEqual(this.answer_key, answer.answer_key) && Intrinsics.areEqual(this.question_id, answer.question_id);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.value.hashCode()) * 31;
            String str = this.answer_key;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.question_id.hashCode();
        }

        public String toString() {
            return "Answer(id=" + this.id + ", value=" + this.value + ", answer_key=" + this.answer_key + ", question_id=" + this.question_id + ")";
        }

        public Answer(UUID id, String value, String str, String question_id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(question_id, "question_id");
            this.id = id;
            this.value = value;
            this.answer_key = str;
            this.question_id = question_id;
        }

        public final UUID getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getAnswer_key() {
            return this.answer_key;
        }

        public final String getQuestion_id() {
            return this.question_id;
        }

        public final UiQuestionnaireReview.Answer toUiModel() {
            return new UiQuestionnaireReview.Answer(this.id, this.value, this.answer_key, this.question_id);
        }
    }
}
