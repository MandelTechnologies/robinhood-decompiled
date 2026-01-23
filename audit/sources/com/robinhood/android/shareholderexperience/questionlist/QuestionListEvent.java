package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "", "FetchMetadataFailed", "QuestionDeletionSucceeded", "QuestionDeletionFailed", "ShowAnswersBottomSheet", "ShowFirstTimeExperience", "ShowQuestionModal", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$FetchMetadataFailed;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$QuestionDeletionFailed;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$QuestionDeletionSucceeded;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowAnswersBottomSheet;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowFirstTimeExperience;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowQuestionModal;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface QuestionListEvent {

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$FetchMetadataFailed;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FetchMetadataFailed implements QuestionListEvent {
        public static final int $stable = 0;
        public static final FetchMetadataFailed INSTANCE = new FetchMetadataFailed();

        private FetchMetadataFailed() {
        }
    }

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$QuestionDeletionSucceeded;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class QuestionDeletionSucceeded implements QuestionListEvent {
        public static final int $stable = 0;
        public static final QuestionDeletionSucceeded INSTANCE = new QuestionDeletionSucceeded();

        private QuestionDeletionSucceeded() {
        }
    }

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$QuestionDeletionFailed;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class QuestionDeletionFailed implements QuestionListEvent {
        public static final int $stable = 0;
        public static final QuestionDeletionFailed INSTANCE = new QuestionDeletionFailed();

        private QuestionDeletionFailed() {
        }
    }

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowAnswersBottomSheet;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "questions", "", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "activeQuestion", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Ljava/util/List;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", "getMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getQuestions", "()Ljava/util/List;", "getActiveQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAnswersBottomSheet implements QuestionListEvent {
        public static final int $stable = 8;
        private final ShareholderQuestion activeQuestion;
        private final QaEventMetadata metadata;
        private final List<ShareholderQuestion> questions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowAnswersBottomSheet copy$default(ShowAnswersBottomSheet showAnswersBottomSheet, QaEventMetadata qaEventMetadata, List list, ShareholderQuestion shareholderQuestion, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = showAnswersBottomSheet.metadata;
            }
            if ((i & 2) != 0) {
                list = showAnswersBottomSheet.questions;
            }
            if ((i & 4) != 0) {
                shareholderQuestion = showAnswersBottomSheet.activeQuestion;
            }
            return showAnswersBottomSheet.copy(qaEventMetadata, list, shareholderQuestion);
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

        public final ShowAnswersBottomSheet copy(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(activeQuestion, "activeQuestion");
            return new ShowAnswersBottomSheet(metadata, questions, activeQuestion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAnswersBottomSheet)) {
                return false;
            }
            ShowAnswersBottomSheet showAnswersBottomSheet = (ShowAnswersBottomSheet) other;
            return Intrinsics.areEqual(this.metadata, showAnswersBottomSheet.metadata) && Intrinsics.areEqual(this.questions, showAnswersBottomSheet.questions) && Intrinsics.areEqual(this.activeQuestion, showAnswersBottomSheet.activeQuestion);
        }

        public int hashCode() {
            return (((this.metadata.hashCode() * 31) + this.questions.hashCode()) * 31) + this.activeQuestion.hashCode();
        }

        public String toString() {
            return "ShowAnswersBottomSheet(metadata=" + this.metadata + ", questions=" + this.questions + ", activeQuestion=" + this.activeQuestion + ")";
        }

        public ShowAnswersBottomSheet(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
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
    }

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowFirstTimeExperience;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;)V", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFirstTimeExperience implements QuestionListEvent {
        public static final int $stable = 8;
        private final QaEventMetadata eventMetadata;

        public static /* synthetic */ ShowFirstTimeExperience copy$default(ShowFirstTimeExperience showFirstTimeExperience, QaEventMetadata qaEventMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = showFirstTimeExperience.eventMetadata;
            }
            return showFirstTimeExperience.copy(qaEventMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }

        public final ShowFirstTimeExperience copy(QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            return new ShowFirstTimeExperience(eventMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFirstTimeExperience) && Intrinsics.areEqual(this.eventMetadata, ((ShowFirstTimeExperience) other).eventMetadata);
        }

        public int hashCode() {
            return this.eventMetadata.hashCode();
        }

        public String toString() {
            return "ShowFirstTimeExperience(eventMetadata=" + this.eventMetadata + ")";
        }

        public ShowFirstTimeExperience(QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            this.eventMetadata = eventMetadata;
        }

        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }
    }

    /* compiled from: QuestionListEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent$ShowQuestionModal;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;Lcom/robinhood/shareholderx/models/db/QaEventMetadata;)V", "getQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowQuestionModal implements QuestionListEvent {
        public static final int $stable = 8;
        private final QaEventMetadata eventMetadata;
        private final ShareholderQuestion question;

        public static /* synthetic */ ShowQuestionModal copy$default(ShowQuestionModal showQuestionModal, ShareholderQuestion shareholderQuestion, QaEventMetadata qaEventMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                shareholderQuestion = showQuestionModal.question;
            }
            if ((i & 2) != 0) {
                qaEventMetadata = showQuestionModal.eventMetadata;
            }
            return showQuestionModal.copy(shareholderQuestion, qaEventMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }

        public final ShowQuestionModal copy(ShareholderQuestion question, QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            return new ShowQuestionModal(question, eventMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowQuestionModal)) {
                return false;
            }
            ShowQuestionModal showQuestionModal = (ShowQuestionModal) other;
            return Intrinsics.areEqual(this.question, showQuestionModal.question) && Intrinsics.areEqual(this.eventMetadata, showQuestionModal.eventMetadata);
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.eventMetadata.hashCode();
        }

        public String toString() {
            return "ShowQuestionModal(question=" + this.question + ", eventMetadata=" + this.eventMetadata + ")";
        }

        public ShowQuestionModal(ShareholderQuestion question, QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            this.question = question;
            this.eventMetadata = eventMetadata;
        }

        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }
    }
}
