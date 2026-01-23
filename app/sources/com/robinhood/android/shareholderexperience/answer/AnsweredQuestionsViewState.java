package com.robinhood.android.shareholderexperience.answer;

import com.robinhood.android.shareholderexperience.answer.AnswerListItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: AnsweredQuestionsViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J-\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsViewState;", "", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "questions", "", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "activeQuestion", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Ljava/util/List;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", "getMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getQuestions", "()Ljava/util/List;", "getActiveQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "title", "", "getTitle", "()Ljava/lang/String;", "items", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "getItems", "questionFooter", "getQuestionFooter", "()Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "mappedAnswers", "getMappedAnswers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class AnsweredQuestionsViewState {
    public static final int $stable = 8;
    private final ShareholderQuestion activeQuestion;
    private final QaEventMetadata metadata;
    private final List<ShareholderQuestion> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnsweredQuestionsViewState copy$default(AnsweredQuestionsViewState answeredQuestionsViewState, QaEventMetadata qaEventMetadata, List list, ShareholderQuestion shareholderQuestion, int i, Object obj) {
        if ((i & 1) != 0) {
            qaEventMetadata = answeredQuestionsViewState.metadata;
        }
        if ((i & 2) != 0) {
            list = answeredQuestionsViewState.questions;
        }
        if ((i & 4) != 0) {
            shareholderQuestion = answeredQuestionsViewState.activeQuestion;
        }
        return answeredQuestionsViewState.copy(qaEventMetadata, list, shareholderQuestion);
    }

    /* renamed from: component1, reason: from getter */
    public final QaEventMetadata getMetadata() {
        return this.metadata;
    }

    public final List<ShareholderQuestion> component2() {
        return this.questions;
    }

    /* renamed from: component3, reason: from getter */
    public final ShareholderQuestion getActiveQuestion() {
        return this.activeQuestion;
    }

    public final AnsweredQuestionsViewState copy(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(activeQuestion, "activeQuestion");
        return new AnsweredQuestionsViewState(metadata, questions, activeQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnsweredQuestionsViewState)) {
            return false;
        }
        AnsweredQuestionsViewState answeredQuestionsViewState = (AnsweredQuestionsViewState) other;
        return Intrinsics.areEqual(this.metadata, answeredQuestionsViewState.metadata) && Intrinsics.areEqual(this.questions, answeredQuestionsViewState.questions) && Intrinsics.areEqual(this.activeQuestion, answeredQuestionsViewState.activeQuestion);
    }

    public int hashCode() {
        return (((this.metadata.hashCode() * 31) + this.questions.hashCode()) * 31) + this.activeQuestion.hashCode();
    }

    public String toString() {
        return "AnsweredQuestionsViewState(metadata=" + this.metadata + ", questions=" + this.questions + ", activeQuestion=" + this.activeQuestion + ")";
    }

    public AnsweredQuestionsViewState(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(activeQuestion, "activeQuestion");
        this.metadata = metadata;
        this.questions = questions;
        this.activeQuestion = activeQuestion;
    }

    public final QaEventMetadata getMetadata() {
        return this.metadata;
    }

    public final List<ShareholderQuestion> getQuestions() {
        return this.questions;
    }

    public final ShareholderQuestion getActiveQuestion() {
        return this.activeQuestion;
    }

    public final String getTitle() {
        return this.metadata.getHeader().getTitle();
    }

    public final List<AnswerListItem> getItems() {
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(new AnswerListItem.Question(this.activeQuestion));
        spreadBuilder.addSpread(getMappedAnswers().toArray(new AnswerListItem[0]));
        return CollectionsKt.listOf(spreadBuilder.toArray(new AnswerListItem[spreadBuilder.size()]));
    }

    private final AnswerListItem getQuestionFooter() {
        ShareholderQuestion shareholderQuestion = (ShareholderQuestion) CollectionsKt.lastOrNull((List) this.questions);
        if (shareholderQuestion == null) {
            return new AnswerListItem.LastQuestionFooter(this.metadata, false);
        }
        if (Intrinsics.areEqual(shareholderQuestion, this.activeQuestion)) {
            return new AnswerListItem.LastQuestionFooter(this.metadata, true);
        }
        if (!this.questions.isEmpty()) {
            return AnswerListItem.NextQuestionFooter.INSTANCE;
        }
        return new AnswerListItem.LastQuestionFooter(this.metadata, false);
    }

    private final List<AnswerListItem> getMappedAnswers() {
        AnswerListItem.Answer.Position position;
        int size = this.activeQuestion.getAnswers().size();
        if (size == 0) {
            return CollectionsKt.listOf(AnswerListItem.Unanswered.INSTANCE);
        }
        if (size == 1) {
            return CollectionsKt.listOf((Object[]) new AnswerListItem[]{AnswerListItem.Space.INSTANCE, new AnswerListItem.Answer((ShareholderQuestion.Answer) CollectionsKt.first((List) this.activeQuestion.getAnswers()), AnswerListItem.Answer.Position.SINGLE), getQuestionFooter()});
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(AnswerListItem.Space.INSTANCE);
        List<ShareholderQuestion.Answer> answers = this.activeQuestion.getAnswers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(answers, 10));
        int i = 0;
        for (Object obj : answers) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ShareholderQuestion.Answer answer = (ShareholderQuestion.Answer) obj;
            if (i == 0) {
                position = AnswerListItem.Answer.Position.TOP;
            } else {
                position = i == this.activeQuestion.getAnswers().size() - 1 ? AnswerListItem.Answer.Position.BOTTOM : AnswerListItem.Answer.Position.MIDDLE;
            }
            arrayList.add(new AnswerListItem.Answer(answer, position));
            i = i2;
        }
        spreadBuilder.addSpread(arrayList.toArray(new AnswerListItem.Answer[0]));
        spreadBuilder.add(getQuestionFooter());
        return CollectionsKt.listOf(spreadBuilder.toArray(new AnswerListItem[spreadBuilder.size()]));
    }
}
