package com.robinhood.android.questionnaire.p220ui;

import com.robinhood.android.questionnaire.api.QuestionType;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiQuestionnaireReview.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002-.B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "", "titleMarkdown", "", "subtitleMarkdown", "questionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "disclosureMarkdown", "ctaText", "redFlagStatus", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "redirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;Ljava/lang/String;)V", "getTitleMarkdown", "()Ljava/lang/String;", "getSubtitleMarkdown", "getQuestionAnswers", "()Ljava/util/List;", "getQuestionGraph", "()Ljava/util/Map;", "getDisclosureMarkdown", "getCtaText", "getRedFlagStatus", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "getRedirectUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "QuestionAnswer", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiQuestionnaireReview {
    private final String ctaText;
    private final String disclosureMarkdown;
    private final List<QuestionAnswer> questionAnswers;
    private final Map<String, UiQuestionnaireQuestion.Supported> questionGraph;
    private final InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus;
    private final String redirectUrl;
    private final String subtitleMarkdown;
    private final String titleMarkdown;

    public static /* synthetic */ UiQuestionnaireReview copy$default(UiQuestionnaireReview uiQuestionnaireReview, String str, String str2, List list, Map map, String str3, String str4, InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiQuestionnaireReview.titleMarkdown;
        }
        if ((i & 2) != 0) {
            str2 = uiQuestionnaireReview.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            list = uiQuestionnaireReview.questionAnswers;
        }
        if ((i & 8) != 0) {
            map = uiQuestionnaireReview.questionGraph;
        }
        if ((i & 16) != 0) {
            str3 = uiQuestionnaireReview.disclosureMarkdown;
        }
        if ((i & 32) != 0) {
            str4 = uiQuestionnaireReview.ctaText;
        }
        if ((i & 64) != 0) {
            redFlagStatus = uiQuestionnaireReview.redFlagStatus;
        }
        if ((i & 128) != 0) {
            str5 = uiQuestionnaireReview.redirectUrl;
        }
        InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus2 = redFlagStatus;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return uiQuestionnaireReview.copy(str, str2, list, map, str7, str8, redFlagStatus2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleMarkdown() {
        return this.titleMarkdown;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<QuestionAnswer> component3() {
        return this.questionAnswers;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> component4() {
        return this.questionGraph;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component7, reason: from getter */
    public final InvestorProfileQuestionnaireContext.RedFlagStatus getRedFlagStatus() {
        return this.redFlagStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final UiQuestionnaireReview copy(String titleMarkdown, String subtitleMarkdown, List<QuestionAnswer> questionAnswers, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph, String disclosureMarkdown, String ctaText, InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus, String redirectUrl) {
        Intrinsics.checkNotNullParameter(titleMarkdown, "titleMarkdown");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(redFlagStatus, "redFlagStatus");
        return new UiQuestionnaireReview(titleMarkdown, subtitleMarkdown, questionAnswers, questionGraph, disclosureMarkdown, ctaText, redFlagStatus, redirectUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiQuestionnaireReview)) {
            return false;
        }
        UiQuestionnaireReview uiQuestionnaireReview = (UiQuestionnaireReview) other;
        return Intrinsics.areEqual(this.titleMarkdown, uiQuestionnaireReview.titleMarkdown) && Intrinsics.areEqual(this.subtitleMarkdown, uiQuestionnaireReview.subtitleMarkdown) && Intrinsics.areEqual(this.questionAnswers, uiQuestionnaireReview.questionAnswers) && Intrinsics.areEqual(this.questionGraph, uiQuestionnaireReview.questionGraph) && Intrinsics.areEqual(this.disclosureMarkdown, uiQuestionnaireReview.disclosureMarkdown) && Intrinsics.areEqual(this.ctaText, uiQuestionnaireReview.ctaText) && this.redFlagStatus == uiQuestionnaireReview.redFlagStatus && Intrinsics.areEqual(this.redirectUrl, uiQuestionnaireReview.redirectUrl);
    }

    public int hashCode() {
        int iHashCode = ((((this.titleMarkdown.hashCode() * 31) + this.subtitleMarkdown.hashCode()) * 31) + this.questionAnswers.hashCode()) * 31;
        Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
        int iHashCode2 = (((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.disclosureMarkdown.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.redFlagStatus.hashCode()) * 31;
        String str = this.redirectUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UiQuestionnaireReview(titleMarkdown=" + this.titleMarkdown + ", subtitleMarkdown=" + this.subtitleMarkdown + ", questionAnswers=" + this.questionAnswers + ", questionGraph=" + this.questionGraph + ", disclosureMarkdown=" + this.disclosureMarkdown + ", ctaText=" + this.ctaText + ", redFlagStatus=" + this.redFlagStatus + ", redirectUrl=" + this.redirectUrl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiQuestionnaireReview(String titleMarkdown, String subtitleMarkdown, List<QuestionAnswer> questionAnswers, Map<String, ? extends UiQuestionnaireQuestion.Supported> map, String disclosureMarkdown, String ctaText, InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus, String str) {
        Intrinsics.checkNotNullParameter(titleMarkdown, "titleMarkdown");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(redFlagStatus, "redFlagStatus");
        this.titleMarkdown = titleMarkdown;
        this.subtitleMarkdown = subtitleMarkdown;
        this.questionAnswers = questionAnswers;
        this.questionGraph = map;
        this.disclosureMarkdown = disclosureMarkdown;
        this.ctaText = ctaText;
        this.redFlagStatus = redFlagStatus;
        this.redirectUrl = str;
    }

    public /* synthetic */ UiQuestionnaireReview(String str, String str2, List list, Map map, String str3, String str4, InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : map, str3, str4, redFlagStatus, str5);
    }

    public final String getTitleMarkdown() {
        return this.titleMarkdown;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<QuestionAnswer> getQuestionAnswers() {
        return this.questionAnswers;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> getQuestionGraph() {
        return this.questionGraph;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final InvestorProfileQuestionnaireContext.RedFlagStatus getRedFlagStatus() {
        return this.redFlagStatus;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* compiled from: UiQuestionnaireReview.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "", "type", "Lcom/robinhood/android/questionnaire/api/QuestionType;", "title", "", "key", "answer", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$Answer;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$Answer;)V", "getType", "()Lcom/robinhood/android/questionnaire/api/QuestionType;", "getTitle", "()Ljava/lang/String;", "getKey", "getAnswer", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$Answer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
    }

    /* compiled from: UiQuestionnaireReview.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$Answer;", "", "id", "Ljava/util/UUID;", "value", "", "answerKey", "questionId", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getValue", "()Ljava/lang/String;", "getAnswerKey", "getQuestionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Answer {
        private final String answerKey;
        private final UUID id;
        private final String questionId;
        private final String value;

        public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = answer.id;
            }
            if ((i & 2) != 0) {
                str = answer.value;
            }
            if ((i & 4) != 0) {
                str2 = answer.answerKey;
            }
            if ((i & 8) != 0) {
                str3 = answer.questionId;
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
        public final String getAnswerKey() {
            return this.answerKey;
        }

        /* renamed from: component4, reason: from getter */
        public final String getQuestionId() {
            return this.questionId;
        }

        public final Answer copy(UUID id, String value, String answerKey, String questionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            return new Answer(id, value, answerKey, questionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.value, answer.value) && Intrinsics.areEqual(this.answerKey, answer.answerKey) && Intrinsics.areEqual(this.questionId, answer.questionId);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.value.hashCode()) * 31;
            String str = this.answerKey;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.questionId.hashCode();
        }

        public String toString() {
            return "Answer(id=" + this.id + ", value=" + this.value + ", answerKey=" + this.answerKey + ", questionId=" + this.questionId + ")";
        }

        public Answer(UUID id, String value, String str, String questionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            this.id = id;
            this.value = value;
            this.answerKey = str;
            this.questionId = questionId;
        }

        public final UUID getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getAnswerKey() {
            return this.answerKey;
        }

        public final String getQuestionId() {
            return this.questionId;
        }
    }
}
