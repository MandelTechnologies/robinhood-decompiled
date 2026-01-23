package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.android.shareholderexperience.questionlist.QuestionListEvent;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import com.robinhood.librobinhood.data.store.bonfire.QuestionsResponseState;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: QuestionListViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003JS\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"*\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010/R\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020,0\"*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListViewState;", "", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "activeFilter", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "activeSort", "questionsResponseState", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEvent;", "hasShownLinkedQuestion", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Lcom/robinhood/shareholderx/models/db/DropdownItem;Lcom/robinhood/shareholderx/models/db/DropdownItem;Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;Lcom/robinhood/udf/UiEvent;Z)V", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getActiveFilter", "()Lcom/robinhood/shareholderx/models/db/DropdownItem;", "getActiveSort", "getQuestionsResponseState", "()Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getHasShownLinkedQuestion", "()Z", "showCtaLoading", "getShowCtaLoading", "eventIsShareable", "getEventIsShareable", "showNavBarLoading", "getShowNavBarLoading", "questionsResponseItems", "", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "getQuestionsResponseItems", "()Ljava/util/List;", "listItems", "getListItems", "setMetadata", "metadata", "reduceQuestionClicked", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "reduceShowLinkedQuestionEvent", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;)Ljava/util/List;", "answeredQuestions", "getAnsweredQuestions", "(Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;)Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class QuestionListViewState {
    public static final int $stable = 8;
    private final DropdownItem activeFilter;
    private final DropdownItem activeSort;
    private final UiEvent<QuestionListEvent> event;
    private final QaEventMetadata eventMetadata;
    private final boolean hasShownLinkedQuestion;
    private final QuestionsResponseState questionsResponseState;

    public QuestionListViewState() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ QuestionListViewState copy$default(QuestionListViewState questionListViewState, QaEventMetadata qaEventMetadata, DropdownItem dropdownItem, DropdownItem dropdownItem2, QuestionsResponseState questionsResponseState, UiEvent uiEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            qaEventMetadata = questionListViewState.eventMetadata;
        }
        if ((i & 2) != 0) {
            dropdownItem = questionListViewState.activeFilter;
        }
        if ((i & 4) != 0) {
            dropdownItem2 = questionListViewState.activeSort;
        }
        if ((i & 8) != 0) {
            questionsResponseState = questionListViewState.questionsResponseState;
        }
        if ((i & 16) != 0) {
            uiEvent = questionListViewState.event;
        }
        if ((i & 32) != 0) {
            z = questionListViewState.hasShownLinkedQuestion;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        return questionListViewState.copy(qaEventMetadata, dropdownItem, dropdownItem2, questionsResponseState, uiEvent2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final QaEventMetadata getEventMetadata() {
        return this.eventMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final DropdownItem getActiveFilter() {
        return this.activeFilter;
    }

    /* renamed from: component3, reason: from getter */
    public final DropdownItem getActiveSort() {
        return this.activeSort;
    }

    /* renamed from: component4, reason: from getter */
    public final QuestionsResponseState getQuestionsResponseState() {
        return this.questionsResponseState;
    }

    public final UiEvent<QuestionListEvent> component5() {
        return this.event;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasShownLinkedQuestion() {
        return this.hasShownLinkedQuestion;
    }

    public final QuestionListViewState copy(QaEventMetadata eventMetadata, DropdownItem activeFilter, DropdownItem activeSort, QuestionsResponseState questionsResponseState, UiEvent<QuestionListEvent> event, boolean hasShownLinkedQuestion) {
        Intrinsics.checkNotNullParameter(questionsResponseState, "questionsResponseState");
        return new QuestionListViewState(eventMetadata, activeFilter, activeSort, questionsResponseState, event, hasShownLinkedQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionListViewState)) {
            return false;
        }
        QuestionListViewState questionListViewState = (QuestionListViewState) other;
        return Intrinsics.areEqual(this.eventMetadata, questionListViewState.eventMetadata) && Intrinsics.areEqual(this.activeFilter, questionListViewState.activeFilter) && Intrinsics.areEqual(this.activeSort, questionListViewState.activeSort) && Intrinsics.areEqual(this.questionsResponseState, questionListViewState.questionsResponseState) && Intrinsics.areEqual(this.event, questionListViewState.event) && this.hasShownLinkedQuestion == questionListViewState.hasShownLinkedQuestion;
    }

    public int hashCode() {
        QaEventMetadata qaEventMetadata = this.eventMetadata;
        int iHashCode = (qaEventMetadata == null ? 0 : qaEventMetadata.hashCode()) * 31;
        DropdownItem dropdownItem = this.activeFilter;
        int iHashCode2 = (iHashCode + (dropdownItem == null ? 0 : dropdownItem.hashCode())) * 31;
        DropdownItem dropdownItem2 = this.activeSort;
        int iHashCode3 = (((iHashCode2 + (dropdownItem2 == null ? 0 : dropdownItem2.hashCode())) * 31) + this.questionsResponseState.hashCode()) * 31;
        UiEvent<QuestionListEvent> uiEvent = this.event;
        return ((iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasShownLinkedQuestion);
    }

    public String toString() {
        return "QuestionListViewState(eventMetadata=" + this.eventMetadata + ", activeFilter=" + this.activeFilter + ", activeSort=" + this.activeSort + ", questionsResponseState=" + this.questionsResponseState + ", event=" + this.event + ", hasShownLinkedQuestion=" + this.hasShownLinkedQuestion + ")";
    }

    public QuestionListViewState(QaEventMetadata qaEventMetadata, DropdownItem dropdownItem, DropdownItem dropdownItem2, QuestionsResponseState questionsResponseState, UiEvent<QuestionListEvent> uiEvent, boolean z) {
        Intrinsics.checkNotNullParameter(questionsResponseState, "questionsResponseState");
        this.eventMetadata = qaEventMetadata;
        this.activeFilter = dropdownItem;
        this.activeSort = dropdownItem2;
        this.questionsResponseState = questionsResponseState;
        this.event = uiEvent;
        this.hasShownLinkedQuestion = z;
    }

    public final QaEventMetadata getEventMetadata() {
        return this.eventMetadata;
    }

    public final DropdownItem getActiveFilter() {
        return this.activeFilter;
    }

    public final DropdownItem getActiveSort() {
        return this.activeSort;
    }

    public /* synthetic */ QuestionListViewState(QaEventMetadata qaEventMetadata, DropdownItem dropdownItem, DropdownItem dropdownItem2, QuestionsResponseState questionsResponseState, UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qaEventMetadata, (i & 2) != 0 ? null : dropdownItem, (i & 4) != 0 ? null : dropdownItem2, (i & 8) != 0 ? QuestionsResponseState.Loading.INSTANCE : questionsResponseState, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? false : z);
    }

    public final QuestionsResponseState getQuestionsResponseState() {
        return this.questionsResponseState;
    }

    public final UiEvent<QuestionListEvent> getEvent() {
        return this.event;
    }

    public final boolean getHasShownLinkedQuestion() {
        return this.hasShownLinkedQuestion;
    }

    public final boolean getShowCtaLoading() {
        return this.eventMetadata == null && (this.questionsResponseState instanceof QuestionsResponseState.Loading);
    }

    public final boolean getEventIsShareable() {
        QaEventMetadata qaEventMetadata = this.eventMetadata;
        return (qaEventMetadata != null ? qaEventMetadata.getShareCopy() : null) != null;
    }

    public final boolean getShowNavBarLoading() {
        return this.questionsResponseState instanceof QuestionsResponseState.Loading;
    }

    private final List<QuestionListItem> getQuestionsResponseItems() {
        QuestionsResponseState questionsResponseState = this.questionsResponseState;
        if (questionsResponseState instanceof QuestionsResponseState.Success) {
            return getListItems(((QuestionsResponseState.Success) questionsResponseState).getResponse());
        }
        if (questionsResponseState instanceof QuestionsResponseState.Loading) {
            return CollectionsKt.emptyList();
        }
        if (questionsResponseState instanceof QuestionsResponseState.Error) {
            return CollectionsKt.listOf(QuestionListItem.EmptyState.Fallback.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<QuestionListItem> getListItems() {
        QaEventMetadata qaEventMetadata = this.eventMetadata;
        if (qaEventMetadata != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(new QuestionListItem.Header(qaEventMetadata, this.activeFilter, this.activeSort));
            spreadBuilder.addSpread(getQuestionsResponseItems().toArray(new QuestionListItem[0]));
            List<QuestionListItem> listListOf = CollectionsKt.listOf(spreadBuilder.toArray(new QuestionListItem[spreadBuilder.size()]));
            if (listListOf != null) {
                return listListOf;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final QuestionListViewState setMetadata(QaEventMetadata metadata) {
        UiEvent<QuestionListEvent> uiEvent;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        DropdownItem dropdownItem = (DropdownItem) CollectionsKt.firstOrNull((List) metadata.getSorters());
        DropdownItem dropdownItem2 = (DropdownItem) CollectionsKt.firstOrNull((List) metadata.getFilters());
        DropdownItem dropdownItem3 = this.activeSort;
        DropdownItem dropdownItem4 = dropdownItem3 == null ? dropdownItem : dropdownItem3;
        DropdownItem dropdownItem5 = this.activeFilter;
        DropdownItem dropdownItem6 = dropdownItem5 == null ? dropdownItem2 : dropdownItem5;
        QaEventMetadata qaEventMetadata = metadata.getShowFirstTimeIntro() ? metadata : null;
        if (qaEventMetadata != null) {
            uiEvent = new UiEvent<>(new QuestionListEvent.ShowFirstTimeExperience(qaEventMetadata));
        } else {
            uiEvent = this.event;
        }
        return copy$default(this, metadata, dropdownItem6, dropdownItem4, null, uiEvent, false, 40, null);
    }

    public final QuestionListViewState reduceQuestionClicked(ShareholderQuestion question) {
        List<ShareholderQuestion> answeredQuestions;
        Intrinsics.checkNotNullParameter(question, "question");
        QaEventMetadata qaEventMetadata = this.eventMetadata;
        if (qaEventMetadata != null) {
            QuestionsResponseState questionsResponseState = this.questionsResponseState;
            QuestionsResponseState.Success success = questionsResponseState instanceof QuestionsResponseState.Success ? (QuestionsResponseState.Success) questionsResponseState : null;
            if (success != null && (answeredQuestions = getAnsweredQuestions(success)) != null) {
                return copy$default(this, null, null, null, null, new UiEvent(new QuestionListEvent.ShowAnswersBottomSheet(qaEventMetadata, answeredQuestions, question)), false, 47, null);
            }
        }
        return this;
    }

    public final QuestionListViewState reduceShowLinkedQuestionEvent(ShareholderQuestion question, QaEventMetadata metadata) {
        Object showQuestionModal;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (this.hasShownLinkedQuestion) {
            return this;
        }
        if (!question.getAnswers().isEmpty()) {
            showQuestionModal = new QuestionListEvent.ShowAnswersBottomSheet(metadata, CollectionsKt.listOf(question), question);
        } else {
            showQuestionModal = new QuestionListEvent.ShowQuestionModal(question, metadata);
        }
        return copy$default(this, null, null, null, null, new UiEvent(showQuestionModal), true, 15, null);
    }

    private final List<QuestionListItem> getListItems(ShareholderQuestionsResponse shareholderQuestionsResponse) {
        if (shareholderQuestionsResponse instanceof ShareholderQuestionsResponse.Answered) {
            ShareholderQuestionsResponse.Answered answered = (ShareholderQuestionsResponse.Answered) shareholderQuestionsResponse;
            List<ShareholderQuestion> questions = answered.getQuestions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, 10));
            Iterator<T> it = questions.iterator();
            while (it.hasNext()) {
                arrayList.add(new QuestionListItem.Question((ShareholderQuestion) it.next(), true));
            }
            List<ShareholderQuestion> userUnansweredQuestions = answered.getUserUnansweredQuestions();
            List arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(userUnansweredQuestions, 10));
            Iterator<T> it2 = userUnansweredQuestions.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new QuestionListItem.Question((ShareholderQuestion) it2.next(), true));
            }
            if (!arrayList2.isEmpty()) {
                arrayList2 = CollectionsKt.plus((Collection) CollectionsKt.listOf(QuestionListItem.YourQuestionsDivider.INSTANCE), (Iterable) arrayList2);
            }
            return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        }
        if (!(shareholderQuestionsResponse instanceof ShareholderQuestionsResponse.OnlyQuestions)) {
            throw new NoWhenBranchMatchedException();
        }
        ShareholderQuestionsResponse.OnlyQuestions onlyQuestions = (ShareholderQuestionsResponse.OnlyQuestions) shareholderQuestionsResponse;
        ShareholderQuestionsResponse.EmptyState emptyState = onlyQuestions.getEmptyState();
        if (emptyState != null) {
            QaEventMetadata qaEventMetadata = this.eventMetadata;
            if (qaEventMetadata == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List<QuestionListItem> listListOf = CollectionsKt.listOf(new QuestionListItem.EmptyState.Default(emptyState, qaEventMetadata));
            if (listListOf != null) {
                return listListOf;
            }
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(new QuestionListItem.TotalQuestions(onlyQuestions.getTotalQuestions()));
        List<ShareholderQuestion> questions2 = onlyQuestions.getQuestions();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions2, 10));
        Iterator<T> it3 = questions2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new QuestionListItem.Question((ShareholderQuestion) it3.next(), false));
        }
        spreadBuilder.addSpread(arrayList3.toArray(new QuestionListItem.Question[0]));
        return CollectionsKt.listOf(spreadBuilder.toArray(new QuestionListItem[spreadBuilder.size()]));
    }

    private final List<ShareholderQuestion> getAnsweredQuestions(QuestionsResponseState questionsResponseState) {
        if (!(questionsResponseState instanceof QuestionsResponseState.Success)) {
            if (!Intrinsics.areEqual(questionsResponseState, QuestionsResponseState.Error.INSTANCE) && !Intrinsics.areEqual(questionsResponseState, QuestionsResponseState.Loading.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt.emptyList();
        }
        List<ShareholderQuestion> questions = ((QuestionsResponseState.Success) questionsResponseState).getResponse().getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questions) {
            if (!((ShareholderQuestion) obj).getAnswers().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
