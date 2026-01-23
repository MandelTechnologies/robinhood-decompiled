package com.robinhood.shared.education.p377ui.quiz;

import com.robinhood.contentful.markdown.MarkdownContent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationQuizViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÂ\u0003J\u0015\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003Jk\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00104\u001a\u00020&2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationLessonSectionQuizViewState;", "", "header", "", "title", "question", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "textColor", "", "linkTextColor", "currentQuestionAnswers", "", "Lcom/robinhood/shared/education/ui/quiz/QuizAnswerViewState;", "selectedAnswersMap", "", "hintViewState", "Lcom/robinhood/shared/education/ui/quiz/HintViewState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;IILjava/util/List;Ljava/util/Map;Lcom/robinhood/shared/education/ui/quiz/HintViewState;)V", "getHeader", "()Ljava/lang/String;", "getTitle", "getQuestion", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getTextColor", "()I", "getLinkTextColor", "getSelectedAnswersMap", "()Ljava/util/Map;", "getHintViewState", "()Lcom/robinhood/shared/education/ui/quiz/HintViewState;", "currentQuestionSelectedAnswer", "getCurrentQuestionSelectedAnswer", "()Lcom/robinhood/shared/education/ui/quiz/QuizAnswerViewState;", "displayedAnswers", "getDisplayedAnswers", "()Ljava/util/List;", "showFeedbackCard", "", "getShowFeedbackCard", "()Z", "shouldAnimate", "getShouldAnimate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EducationLessonSectionQuizViewState {
    public static final int $stable = 8;
    private final List<QuizAnswerViewState> currentQuestionAnswers;
    private final String header;
    private final EducationQuizViewState2 hintViewState;
    private final int linkTextColor;
    private final MarkdownContent question;
    private final Map<MarkdownContent, QuizAnswerViewState> selectedAnswersMap;
    private final boolean shouldAnimate;
    private final boolean showFeedbackCard;
    private final int textColor;
    private final String title;

    public EducationLessonSectionQuizViewState() {
        this(null, null, null, 0, 0, null, null, null, 255, null);
    }

    private final List<QuizAnswerViewState> component6() {
        return this.currentQuestionAnswers;
    }

    public static /* synthetic */ EducationLessonSectionQuizViewState copy$default(EducationLessonSectionQuizViewState educationLessonSectionQuizViewState, String str, String str2, MarkdownContent markdownContent, int i, int i2, List list, Map map, EducationQuizViewState2 educationQuizViewState2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = educationLessonSectionQuizViewState.header;
        }
        if ((i3 & 2) != 0) {
            str2 = educationLessonSectionQuizViewState.title;
        }
        if ((i3 & 4) != 0) {
            markdownContent = educationLessonSectionQuizViewState.question;
        }
        if ((i3 & 8) != 0) {
            i = educationLessonSectionQuizViewState.textColor;
        }
        if ((i3 & 16) != 0) {
            i2 = educationLessonSectionQuizViewState.linkTextColor;
        }
        if ((i3 & 32) != 0) {
            list = educationLessonSectionQuizViewState.currentQuestionAnswers;
        }
        if ((i3 & 64) != 0) {
            map = educationLessonSectionQuizViewState.selectedAnswersMap;
        }
        if ((i3 & 128) != 0) {
            educationQuizViewState2 = educationLessonSectionQuizViewState.hintViewState;
        }
        Map map2 = map;
        EducationQuizViewState2 educationQuizViewState22 = educationQuizViewState2;
        int i4 = i2;
        List list2 = list;
        return educationLessonSectionQuizViewState.copy(str, str2, markdownContent, i, i4, list2, map2, educationQuizViewState22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getQuestion() {
        return this.question;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLinkTextColor() {
        return this.linkTextColor;
    }

    public final Map<MarkdownContent, QuizAnswerViewState> component7() {
        return this.selectedAnswersMap;
    }

    /* renamed from: component8, reason: from getter */
    public final EducationQuizViewState2 getHintViewState() {
        return this.hintViewState;
    }

    public final EducationLessonSectionQuizViewState copy(String header, String title, MarkdownContent question, int textColor, int linkTextColor, List<QuizAnswerViewState> currentQuestionAnswers, Map<MarkdownContent, QuizAnswerViewState> selectedAnswersMap, EducationQuizViewState2 hintViewState) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(currentQuestionAnswers, "currentQuestionAnswers");
        Intrinsics.checkNotNullParameter(selectedAnswersMap, "selectedAnswersMap");
        Intrinsics.checkNotNullParameter(hintViewState, "hintViewState");
        return new EducationLessonSectionQuizViewState(header, title, question, textColor, linkTextColor, currentQuestionAnswers, selectedAnswersMap, hintViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationLessonSectionQuizViewState)) {
            return false;
        }
        EducationLessonSectionQuizViewState educationLessonSectionQuizViewState = (EducationLessonSectionQuizViewState) other;
        return Intrinsics.areEqual(this.header, educationLessonSectionQuizViewState.header) && Intrinsics.areEqual(this.title, educationLessonSectionQuizViewState.title) && Intrinsics.areEqual(this.question, educationLessonSectionQuizViewState.question) && this.textColor == educationLessonSectionQuizViewState.textColor && this.linkTextColor == educationLessonSectionQuizViewState.linkTextColor && Intrinsics.areEqual(this.currentQuestionAnswers, educationLessonSectionQuizViewState.currentQuestionAnswers) && Intrinsics.areEqual(this.selectedAnswersMap, educationLessonSectionQuizViewState.selectedAnswersMap) && this.hintViewState == educationLessonSectionQuizViewState.hintViewState;
    }

    public int hashCode() {
        return (((((((((((((this.header.hashCode() * 31) + this.title.hashCode()) * 31) + this.question.hashCode()) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.linkTextColor)) * 31) + this.currentQuestionAnswers.hashCode()) * 31) + this.selectedAnswersMap.hashCode()) * 31) + this.hintViewState.hashCode();
    }

    public String toString() {
        return "EducationLessonSectionQuizViewState(header=" + this.header + ", title=" + this.title + ", question=" + this.question + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", currentQuestionAnswers=" + this.currentQuestionAnswers + ", selectedAnswersMap=" + this.selectedAnswersMap + ", hintViewState=" + this.hintViewState + ")";
    }

    public EducationLessonSectionQuizViewState(String header, String title, MarkdownContent question, int i, int i2, List<QuizAnswerViewState> currentQuestionAnswers, Map<MarkdownContent, QuizAnswerViewState> selectedAnswersMap, EducationQuizViewState2 hintViewState) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(currentQuestionAnswers, "currentQuestionAnswers");
        Intrinsics.checkNotNullParameter(selectedAnswersMap, "selectedAnswersMap");
        Intrinsics.checkNotNullParameter(hintViewState, "hintViewState");
        this.header = header;
        this.title = title;
        this.question = question;
        this.textColor = i;
        this.linkTextColor = i2;
        this.currentQuestionAnswers = currentQuestionAnswers;
        this.selectedAnswersMap = selectedAnswersMap;
        this.hintViewState = hintViewState;
        this.showFeedbackCard = getCurrentQuestionSelectedAnswer() != null;
        this.shouldAnimate = getCurrentQuestionSelectedAnswer() != null;
    }

    public /* synthetic */ EducationLessonSectionQuizViewState(String str, String str2, MarkdownContent markdownContent, int i, int i2, List list, Map map, EducationQuizViewState2 educationQuizViewState2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? MarkdownContent.INSTANCE.getEMPTY() : markdownContent, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? MapsKt.emptyMap() : map, (i3 & 128) != 0 ? EducationQuizViewState2.GONE : educationQuizViewState2);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getQuestion() {
        return this.question;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getLinkTextColor() {
        return this.linkTextColor;
    }

    public final Map<MarkdownContent, QuizAnswerViewState> getSelectedAnswersMap() {
        return this.selectedAnswersMap;
    }

    public final EducationQuizViewState2 getHintViewState() {
        return this.hintViewState;
    }

    public final QuizAnswerViewState getCurrentQuestionSelectedAnswer() {
        return this.selectedAnswersMap.get(this.question);
    }

    public final List<QuizAnswerViewState> getDisplayedAnswers() {
        List<QuizAnswerViewState> listListOf;
        QuizAnswerViewState currentQuestionSelectedAnswer = getCurrentQuestionSelectedAnswer();
        return (currentQuestionSelectedAnswer == null || (listListOf = CollectionsKt.listOf(currentQuestionSelectedAnswer)) == null) ? this.currentQuestionAnswers : listListOf;
    }

    public final boolean getShowFeedbackCard() {
        return this.showFeedbackCard;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }
}
