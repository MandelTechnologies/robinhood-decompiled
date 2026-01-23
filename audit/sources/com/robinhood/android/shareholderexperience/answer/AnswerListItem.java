package com.robinhood.android.shareholderexperience.answer;

import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnswerListItem.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "", "viewType", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$ViewType;", "<init>", "(Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$ViewType;)V", "getViewType", "()Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$ViewType;", "ViewType", "Question", "Answer", "LastQuestionFooter", "NextQuestionFooter", "Unanswered", "Space", "DiffCallback", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$LastQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$NextQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Question;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Space;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Unanswered;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class AnswerListItem {
    public static final int $stable = 0;

    /* renamed from: DiffCallback, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ViewType viewType;

    public /* synthetic */ AnswerListItem(ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType);
    }

    private AnswerListItem(ViewType viewType) {
        this.viewType = viewType;
    }

    public final ViewType getViewType() {
        return this.viewType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "QUESTION", "ANSWER", "UNANSWERED", "SPACE", "NEXT_QUESTION_FOOTER", "LAST_QUESTION_FOOTER", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType QUESTION = new ViewType("QUESTION", 0);
        public static final ViewType ANSWER = new ViewType("ANSWER", 1);
        public static final ViewType UNANSWERED = new ViewType("UNANSWERED", 2);
        public static final ViewType SPACE = new ViewType("SPACE", 3);
        public static final ViewType NEXT_QUESTION_FOOTER = new ViewType("NEXT_QUESTION_FOOTER", 4);
        public static final ViewType LAST_QUESTION_FOOTER = new ViewType("LAST_QUESTION_FOOTER", 5);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{QUESTION, ANSWER, UNANSWERED, SPACE, NEXT_QUESTION_FOOTER, LAST_QUESTION_FOOTER};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Question;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", "getQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Question extends AnswerListItem {
        public static final int $stable = 8;
        private final ShareholderQuestion question;

        public static /* synthetic */ Question copy$default(Question question, ShareholderQuestion shareholderQuestion, int i, Object obj) {
            if ((i & 1) != 0) {
                shareholderQuestion = question.question;
            }
            return question.copy(shareholderQuestion);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        public final Question copy(ShareholderQuestion question) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new Question(question);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Question) && Intrinsics.areEqual(this.question, ((Question) other).question);
        }

        public int hashCode() {
            return this.question.hashCode();
        }

        public String toString() {
            return "Question(question=" + this.question + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Question(ShareholderQuestion question) {
            super(ViewType.QUESTION, null);
            Intrinsics.checkNotNullParameter(question, "question");
            this.question = question;
        }

        public final ShareholderQuestion getQuestion() {
            return this.question;
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "answer", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$Answer;", "position", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer$Position;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$Answer;Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer$Position;)V", "getAnswer", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$Answer;", "getPosition", "()Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer$Position;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Position", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Answer extends AnswerListItem {
        public static final int $stable = 8;
        private final ShareholderQuestion.Answer answer;
        private final Position position;

        public static /* synthetic */ Answer copy$default(Answer answer, ShareholderQuestion.Answer answer2, Position position, int i, Object obj) {
            if ((i & 1) != 0) {
                answer2 = answer.answer;
            }
            if ((i & 2) != 0) {
                position = answer.position;
            }
            return answer.copy(answer2, position);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestion.Answer getAnswer() {
            return this.answer;
        }

        /* renamed from: component2, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        public final Answer copy(ShareholderQuestion.Answer answer, Position position) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(position, "position");
            return new Answer(answer, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return Intrinsics.areEqual(this.answer, answer.answer) && this.position == answer.position;
        }

        public int hashCode() {
            return (this.answer.hashCode() * 31) + this.position.hashCode();
        }

        public String toString() {
            return "Answer(answer=" + this.answer + ", position=" + this.position + ")";
        }

        public final ShareholderQuestion.Answer getAnswer() {
            return this.answer;
        }

        public final Position getPosition() {
            return this.position;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Answer(ShareholderQuestion.Answer answer, Position position) {
            super(ViewType.ANSWER, null);
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(position, "position");
            this.answer = answer;
            this.position = position;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AnswerListItem.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer$Position;", "", "bgDrawableRes", "", "<init>", "(Ljava/lang/String;II)V", "getBgDrawableRes", "()I", "TOP", "BOTTOM", "MIDDLE", "SINGLE", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Position {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            private final int bgDrawableRes;
            public static final Position TOP = new Position("TOP", 0, C28477R.drawable.answer_card_round_top_background);
            public static final Position BOTTOM = new Position("BOTTOM", 1, C28477R.drawable.answer_card_round_bottom_background);
            public static final Position MIDDLE = new Position("MIDDLE", 2, C28477R.drawable.answer_card_straight_background);
            public static final Position SINGLE = new Position("SINGLE", 3, C28477R.drawable.answer_card_round_background);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{TOP, BOTTOM, MIDDLE, SINGLE};
            }

            public static EnumEntries<Position> getEntries() {
                return $ENTRIES;
            }

            private Position(String str, int i, int i2) {
                this.bgDrawableRes = i2;
            }

            public final int getBgDrawableRes() {
                return this.bgDrawableRes;
            }

            static {
                Position[] positionArr$values = $values();
                $VALUES = positionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$LastQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "showFooterMessage", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Z)V", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getShowFooterMessage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LastQuestionFooter extends AnswerListItem {
        public static final int $stable = 8;
        private final QaEventMetadata eventMetadata;
        private final boolean showFooterMessage;

        public static /* synthetic */ LastQuestionFooter copy$default(LastQuestionFooter lastQuestionFooter, QaEventMetadata qaEventMetadata, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = lastQuestionFooter.eventMetadata;
            }
            if ((i & 2) != 0) {
                z = lastQuestionFooter.showFooterMessage;
            }
            return lastQuestionFooter.copy(qaEventMetadata, z);
        }

        /* renamed from: component1, reason: from getter */
        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowFooterMessage() {
            return this.showFooterMessage;
        }

        public final LastQuestionFooter copy(QaEventMetadata eventMetadata, boolean showFooterMessage) {
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            return new LastQuestionFooter(eventMetadata, showFooterMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastQuestionFooter)) {
                return false;
            }
            LastQuestionFooter lastQuestionFooter = (LastQuestionFooter) other;
            return Intrinsics.areEqual(this.eventMetadata, lastQuestionFooter.eventMetadata) && this.showFooterMessage == lastQuestionFooter.showFooterMessage;
        }

        public int hashCode() {
            return (this.eventMetadata.hashCode() * 31) + Boolean.hashCode(this.showFooterMessage);
        }

        public String toString() {
            return "LastQuestionFooter(eventMetadata=" + this.eventMetadata + ", showFooterMessage=" + this.showFooterMessage + ")";
        }

        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }

        public final boolean getShowFooterMessage() {
            return this.showFooterMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LastQuestionFooter(QaEventMetadata eventMetadata, boolean z) {
            super(ViewType.LAST_QUESTION_FOOTER, null);
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            this.eventMetadata = eventMetadata;
            this.showFooterMessage = z;
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$NextQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NextQuestionFooter extends AnswerListItem {
        public static final int $stable = 0;
        public static final NextQuestionFooter INSTANCE = new NextQuestionFooter();

        private NextQuestionFooter() {
            super(ViewType.NEXT_QUESTION_FOOTER, null);
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Unanswered;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Unanswered extends AnswerListItem {
        public static final int $stable = 0;
        public static final Unanswered INSTANCE = new Unanswered();

        private Unanswered() {
            super(ViewType.UNANSWERED, null);
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Space;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Space extends AnswerListItem {
        public static final int $stable = 0;
        public static final Space INSTANCE = new Space();

        private Space() {
            super(ViewType.SPACE, null);
        }
    }

    /* compiled from: AnswerListItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$DiffCallback;", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.answer.AnswerListItem$DiffCallback, reason: from kotlin metadata */
    public static final class Companion extends DiffCallbacks3<AnswerListItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(AnswerListItem oldItem, AnswerListItem newItem) {
            QaEventMetadata eventMetadata;
            ShareholderQuestion question;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof Question) {
                UUID id = ((Question) oldItem).getQuestion().getId();
                Question question2 = newItem instanceof Question ? (Question) newItem : null;
                if (question2 != null && (question = question2.getQuestion()) != null) {
                    instrumentId = question.getId();
                }
                return Intrinsics.areEqual(id, instrumentId);
            }
            if (oldItem instanceof Answer) {
                ShareholderQuestion.Answer answer = ((Answer) oldItem).getAnswer();
                Answer answer2 = newItem instanceof Answer ? (Answer) newItem : null;
                return Intrinsics.areEqual(answer, answer2 != null ? answer2.getAnswer() : null);
            }
            if (oldItem instanceof LastQuestionFooter) {
                UUID instrumentId = ((LastQuestionFooter) oldItem).getEventMetadata().getInstrumentId();
                LastQuestionFooter lastQuestionFooter = newItem instanceof LastQuestionFooter ? (LastQuestionFooter) newItem : null;
                if (lastQuestionFooter != null && (eventMetadata = lastQuestionFooter.getEventMetadata()) != null) {
                    instrumentId = eventMetadata.getInstrumentId();
                }
                return Intrinsics.areEqual(instrumentId, instrumentId);
            }
            if (!(oldItem instanceof Space) && !(oldItem instanceof Unanswered) && !(oldItem instanceof NextQuestionFooter)) {
                throw new NoWhenBranchMatchedException();
            }
            return Intrinsics.areEqual(newItem, oldItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(AnswerListItem oldItem, AnswerListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
