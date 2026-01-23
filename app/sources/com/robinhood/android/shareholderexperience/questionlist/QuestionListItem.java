package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListItem.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "", "viewType", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$ViewType;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$ViewType;)V", "getViewType", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$ViewType;", "ViewType", "Header", "Question", "TotalQuestions", "EmptyState", "YourQuestionsDivider", "DiffCallback", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Header;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Question;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$TotalQuestions;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$YourQuestionsDivider;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class QuestionListItem {
    public static final int $stable = 0;

    /* renamed from: DiffCallback, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ViewType viewType;

    public /* synthetic */ QuestionListItem(ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType);
    }

    private QuestionListItem(ViewType viewType) {
        this.viewType = viewType;
    }

    public final ViewType getViewType() {
        return this.viewType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "QUESTION", "TOTAL_QUESTIONS", "YOUR_QUESTIONS_DIVIDER", "EMPTY_STATE", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType HEADER = new ViewType("HEADER", 0);
        public static final ViewType QUESTION = new ViewType("QUESTION", 1);
        public static final ViewType TOTAL_QUESTIONS = new ViewType("TOTAL_QUESTIONS", 2);
        public static final ViewType YOUR_QUESTIONS_DIVIDER = new ViewType("YOUR_QUESTIONS_DIVIDER", 3);
        public static final ViewType EMPTY_STATE = new ViewType("EMPTY_STATE", 4);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{HEADER, QUESTION, TOTAL_QUESTIONS, YOUR_QUESTIONS_DIVIDER, EMPTY_STATE};
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

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Header;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "activeFilter", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "activeSort", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Lcom/robinhood/shareholderx/models/db/DropdownItem;Lcom/robinhood/shareholderx/models/db/DropdownItem;)V", "getMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getActiveFilter", "()Lcom/robinhood/shareholderx/models/db/DropdownItem;", "getActiveSort", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Header extends QuestionListItem {
        public static final int $stable = 8;
        private final DropdownItem activeFilter;
        private final DropdownItem activeSort;
        private final QaEventMetadata metadata;

        public static /* synthetic */ Header copy$default(Header header, QaEventMetadata qaEventMetadata, DropdownItem dropdownItem, DropdownItem dropdownItem2, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = header.metadata;
            }
            if ((i & 2) != 0) {
                dropdownItem = header.activeFilter;
            }
            if ((i & 4) != 0) {
                dropdownItem2 = header.activeSort;
            }
            return header.copy(qaEventMetadata, dropdownItem, dropdownItem2);
        }

        /* renamed from: component1, reason: from getter */
        public final QaEventMetadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: component2, reason: from getter */
        public final DropdownItem getActiveFilter() {
            return this.activeFilter;
        }

        /* renamed from: component3, reason: from getter */
        public final DropdownItem getActiveSort() {
            return this.activeSort;
        }

        public final Header copy(QaEventMetadata metadata, DropdownItem activeFilter, DropdownItem activeSort) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return new Header(metadata, activeFilter, activeSort);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.metadata, header.metadata) && Intrinsics.areEqual(this.activeFilter, header.activeFilter) && Intrinsics.areEqual(this.activeSort, header.activeSort);
        }

        public int hashCode() {
            int iHashCode = this.metadata.hashCode() * 31;
            DropdownItem dropdownItem = this.activeFilter;
            int iHashCode2 = (iHashCode + (dropdownItem == null ? 0 : dropdownItem.hashCode())) * 31;
            DropdownItem dropdownItem2 = this.activeSort;
            return iHashCode2 + (dropdownItem2 != null ? dropdownItem2.hashCode() : 0);
        }

        public String toString() {
            return "Header(metadata=" + this.metadata + ", activeFilter=" + this.activeFilter + ", activeSort=" + this.activeSort + ")";
        }

        public final QaEventMetadata getMetadata() {
            return this.metadata;
        }

        public final DropdownItem getActiveFilter() {
            return this.activeFilter;
        }

        public final DropdownItem getActiveSort() {
            return this.activeSort;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(QaEventMetadata metadata, DropdownItem dropdownItem, DropdownItem dropdownItem2) {
            super(ViewType.HEADER, null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
            this.activeFilter = dropdownItem;
            this.activeSort = dropdownItem2;
        }
    }

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Question;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "cardClickEnabled", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;Z)V", "getQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "getCardClickEnabled", "()Z", "showCornerButton", "getShowCornerButton", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Question extends QuestionListItem {
        public static final int $stable = 8;
        private final boolean cardClickEnabled;
        private final ShareholderQuestion question;

        public static /* synthetic */ Question copy$default(Question question, ShareholderQuestion shareholderQuestion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                shareholderQuestion = question.question;
            }
            if ((i & 2) != 0) {
                z = question.cardClickEnabled;
            }
            return question.copy(shareholderQuestion, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCardClickEnabled() {
            return this.cardClickEnabled;
        }

        public final Question copy(ShareholderQuestion question, boolean cardClickEnabled) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new Question(question, cardClickEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Question)) {
                return false;
            }
            Question question = (Question) other;
            return Intrinsics.areEqual(this.question, question.question) && this.cardClickEnabled == question.cardClickEnabled;
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + Boolean.hashCode(this.cardClickEnabled);
        }

        public String toString() {
            return "Question(question=" + this.question + ", cardClickEnabled=" + this.cardClickEnabled + ")";
        }

        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        public final boolean getCardClickEnabled() {
            return this.cardClickEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Question(ShareholderQuestion question, boolean z) {
            super(ViewType.QUESTION, null);
            Intrinsics.checkNotNullParameter(question, "question");
            this.question = question;
            this.cardClickEnabled = z;
        }

        public final boolean getShowCornerButton() {
            return this.question.getShareCopy() != null || this.question.getCanDelete();
        }
    }

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$TotalQuestions;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TotalQuestions extends QuestionListItem {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ TotalQuestions copy$default(TotalQuestions totalQuestions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = totalQuestions.text;
            }
            return totalQuestions.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final TotalQuestions copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TotalQuestions(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TotalQuestions) && Intrinsics.areEqual(this.text, ((TotalQuestions) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "TotalQuestions(text=" + this.text + ")";
        }

        public final String getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TotalQuestions(String text) {
            super(ViewType.TOTAL_QUESTIONS, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }
    }

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "<init>", "()V", "Default", "Fallback", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState$Default;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState$Fallback;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class EmptyState extends QuestionListItem {
        public static final int $stable = 0;

        public /* synthetic */ EmptyState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EmptyState() {
            super(ViewType.EMPTY_STATE, null);
        }

        /* compiled from: QuestionListItem.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState$Default;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState;", "emptyState", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$EmptyState;", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$EmptyState;Lcom/robinhood/shareholderx/models/db/QaEventMetadata;)V", "getEmptyState", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$EmptyState;", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "showActionButton", "", "getShowActionButton", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default extends EmptyState {
            public static final int $stable = 8;
            private final ShareholderQuestionsResponse.EmptyState emptyState;
            private final QaEventMetadata eventMetadata;

            public static /* synthetic */ Default copy$default(Default r0, ShareholderQuestionsResponse.EmptyState emptyState, QaEventMetadata qaEventMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    emptyState = r0.emptyState;
                }
                if ((i & 2) != 0) {
                    qaEventMetadata = r0.eventMetadata;
                }
                return r0.copy(emptyState, qaEventMetadata);
            }

            /* renamed from: component1, reason: from getter */
            public final ShareholderQuestionsResponse.EmptyState getEmptyState() {
                return this.emptyState;
            }

            /* renamed from: component2, reason: from getter */
            public final QaEventMetadata getEventMetadata() {
                return this.eventMetadata;
            }

            public final Default copy(ShareholderQuestionsResponse.EmptyState emptyState, QaEventMetadata eventMetadata) {
                Intrinsics.checkNotNullParameter(emptyState, "emptyState");
                Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
                return new Default(emptyState, eventMetadata);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) other;
                return Intrinsics.areEqual(this.emptyState, r5.emptyState) && Intrinsics.areEqual(this.eventMetadata, r5.eventMetadata);
            }

            public int hashCode() {
                return (this.emptyState.hashCode() * 31) + this.eventMetadata.hashCode();
            }

            public String toString() {
                return "Default(emptyState=" + this.emptyState + ", eventMetadata=" + this.eventMetadata + ")";
            }

            public final ShareholderQuestionsResponse.EmptyState getEmptyState() {
                return this.emptyState;
            }

            public final QaEventMetadata getEventMetadata() {
                return this.eventMetadata;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(ShareholderQuestionsResponse.EmptyState emptyState, QaEventMetadata eventMetadata) {
                super(null);
                Intrinsics.checkNotNullParameter(emptyState, "emptyState");
                Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
                this.emptyState = emptyState;
                this.eventMetadata = eventMetadata;
            }

            public final boolean getShowActionButton() {
                return (this.emptyState.getActionText() == null || this.emptyState.getActionType() == null) ? false : true;
            }
        }

        /* compiled from: QuestionListItem.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState$Fallback;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Fallback extends EmptyState {
            public static final int $stable = 0;
            public static final Fallback INSTANCE = new Fallback();

            private Fallback() {
                super(null);
            }
        }
    }

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$YourQuestionsDivider;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class YourQuestionsDivider extends QuestionListItem {
        public static final int $stable = 0;
        public static final YourQuestionsDivider INSTANCE = new YourQuestionsDivider();

        private YourQuestionsDivider() {
            super(ViewType.YOUR_QUESTIONS_DIVIDER, null);
        }
    }

    /* compiled from: QuestionListItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$DiffCallback;", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListItem$DiffCallback, reason: from kotlin metadata */
    public static final class Companion extends DiffCallbacks3<QuestionListItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(QuestionListItem oldItem, QuestionListItem newItem) {
            ShareholderQuestion question;
            QaEventMetadata metadata;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof Header) {
                Header header = newItem instanceof Header ? (Header) newItem : null;
                if (header != null && (metadata = header.getMetadata()) != null) {
                    id = metadata.getInstrumentId();
                }
                return Intrinsics.areEqual(id, ((Header) oldItem).getMetadata().getInstrumentId());
            }
            if (oldItem instanceof Question) {
                Question question2 = newItem instanceof Question ? (Question) newItem : null;
                if (question2 != null && (question = question2.getQuestion()) != null) {
                    id = question.getId();
                }
                return Intrinsics.areEqual(id, ((Question) oldItem).getQuestion().getId());
            }
            if (oldItem instanceof TotalQuestions) {
                TotalQuestions totalQuestions = newItem instanceof TotalQuestions ? (TotalQuestions) newItem : null;
                return Intrinsics.areEqual(totalQuestions != null ? totalQuestions.getText() : null, ((TotalQuestions) oldItem).getText());
            }
            if (oldItem instanceof YourQuestionsDivider) {
                return newItem instanceof YourQuestionsDivider;
            }
            if (oldItem instanceof EmptyState) {
                return newItem instanceof EmptyState;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(QuestionListItem oldItem, QuestionListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
