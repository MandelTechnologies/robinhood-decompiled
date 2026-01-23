package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnairePage;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: RecommendationsQuestionnaireViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001EB\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0005J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0002J\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020\u0003H\u0002J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0013HÆ\u0003J\u0099\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010@\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0013\u0010.\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState;", "", "questionnaire", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire;", "currentPageIndex", "", "onTransitionEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "onBackEvent", "", "onNextFlowEvent", "onExitFlowEvent", "errorEvent", "", "answeredQuestions", "", "Ljava/util/UUID;", "onLandingPage", "", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire;ILcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/Map;Z)V", "getQuestionnaire", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire;", "getCurrentPageIndex", "()I", "getOnTransitionEvent", "()Lcom/robinhood/udf/UiEvent;", "getOnBackEvent", "getOnNextFlowEvent", "getOnExitFlowEvent", "getErrorEvent", "getAnsweredQuestions", "()Ljava/util/Map;", "getOnLandingPage", "()Z", "pages", "", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "getPages", "()Ljava/util/List;", "currentPage", "getCurrentPage", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "numberOfQuestions", "getNumberOfQuestions", "currentQuestionId", "getCurrentQuestionId", "()Ljava/util/UUID;", "questionnaireProgress", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "numberQuestionsAnswered", "getAllPages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "TransitionInfo", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsQuestionnaireViewState {
    private final Map<UUID, UUID> answeredQuestions;
    private final int currentPageIndex;
    private final UiEvent<Throwable> errorEvent;
    private final UiEvent<Unit> onBackEvent;
    private final UiEvent<Unit> onExitFlowEvent;
    private final boolean onLandingPage;
    private final UiEvent<Unit> onNextFlowEvent;
    private final UiEvent<TransitionInfo> onTransitionEvent;
    private final UiRecommendationsQuestionnaire questionnaire;

    public RecommendationsQuestionnaireViewState() {
        this(null, 0, null, null, null, null, null, null, false, 511, null);
    }

    public static /* synthetic */ RecommendationsQuestionnaireViewState copy$default(RecommendationsQuestionnaireViewState recommendationsQuestionnaireViewState, UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire, int i, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uiRecommendationsQuestionnaire = recommendationsQuestionnaireViewState.questionnaire;
        }
        if ((i2 & 2) != 0) {
            i = recommendationsQuestionnaireViewState.currentPageIndex;
        }
        if ((i2 & 4) != 0) {
            uiEvent = recommendationsQuestionnaireViewState.onTransitionEvent;
        }
        if ((i2 & 8) != 0) {
            uiEvent2 = recommendationsQuestionnaireViewState.onBackEvent;
        }
        if ((i2 & 16) != 0) {
            uiEvent3 = recommendationsQuestionnaireViewState.onNextFlowEvent;
        }
        if ((i2 & 32) != 0) {
            uiEvent4 = recommendationsQuestionnaireViewState.onExitFlowEvent;
        }
        if ((i2 & 64) != 0) {
            uiEvent5 = recommendationsQuestionnaireViewState.errorEvent;
        }
        if ((i2 & 128) != 0) {
            map = recommendationsQuestionnaireViewState.answeredQuestions;
        }
        if ((i2 & 256) != 0) {
            z = recommendationsQuestionnaireViewState.onLandingPage;
        }
        Map map2 = map;
        boolean z2 = z;
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent5;
        UiEvent uiEvent8 = uiEvent3;
        UiEvent uiEvent9 = uiEvent;
        return recommendationsQuestionnaireViewState.copy(uiRecommendationsQuestionnaire, i, uiEvent9, uiEvent2, uiEvent8, uiEvent6, uiEvent7, map2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiRecommendationsQuestionnaire getQuestionnaire() {
        return this.questionnaire;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public final UiEvent<TransitionInfo> component3() {
        return this.onTransitionEvent;
    }

    public final UiEvent<Unit> component4() {
        return this.onBackEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.onNextFlowEvent;
    }

    public final UiEvent<Unit> component6() {
        return this.onExitFlowEvent;
    }

    public final UiEvent<Throwable> component7() {
        return this.errorEvent;
    }

    public final Map<UUID, UUID> component8() {
        return this.answeredQuestions;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getOnLandingPage() {
        return this.onLandingPage;
    }

    public final RecommendationsQuestionnaireViewState copy(UiRecommendationsQuestionnaire questionnaire, int currentPageIndex, UiEvent<TransitionInfo> onTransitionEvent, UiEvent<Unit> onBackEvent, UiEvent<Unit> onNextFlowEvent, UiEvent<Unit> onExitFlowEvent, UiEvent<Throwable> errorEvent, Map<UUID, UUID> answeredQuestions, boolean onLandingPage) {
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        return new RecommendationsQuestionnaireViewState(questionnaire, currentPageIndex, onTransitionEvent, onBackEvent, onNextFlowEvent, onExitFlowEvent, errorEvent, answeredQuestions, onLandingPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsQuestionnaireViewState)) {
            return false;
        }
        RecommendationsQuestionnaireViewState recommendationsQuestionnaireViewState = (RecommendationsQuestionnaireViewState) other;
        return Intrinsics.areEqual(this.questionnaire, recommendationsQuestionnaireViewState.questionnaire) && this.currentPageIndex == recommendationsQuestionnaireViewState.currentPageIndex && Intrinsics.areEqual(this.onTransitionEvent, recommendationsQuestionnaireViewState.onTransitionEvent) && Intrinsics.areEqual(this.onBackEvent, recommendationsQuestionnaireViewState.onBackEvent) && Intrinsics.areEqual(this.onNextFlowEvent, recommendationsQuestionnaireViewState.onNextFlowEvent) && Intrinsics.areEqual(this.onExitFlowEvent, recommendationsQuestionnaireViewState.onExitFlowEvent) && Intrinsics.areEqual(this.errorEvent, recommendationsQuestionnaireViewState.errorEvent) && Intrinsics.areEqual(this.answeredQuestions, recommendationsQuestionnaireViewState.answeredQuestions) && this.onLandingPage == recommendationsQuestionnaireViewState.onLandingPage;
    }

    public int hashCode() {
        UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire = this.questionnaire;
        int iHashCode = (((uiRecommendationsQuestionnaire == null ? 0 : uiRecommendationsQuestionnaire.hashCode()) * 31) + Integer.hashCode(this.currentPageIndex)) * 31;
        UiEvent<TransitionInfo> uiEvent = this.onTransitionEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.onBackEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.onNextFlowEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.onExitFlowEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Throwable> uiEvent5 = this.errorEvent;
        return ((((iHashCode5 + (uiEvent5 != null ? uiEvent5.hashCode() : 0)) * 31) + this.answeredQuestions.hashCode()) * 31) + Boolean.hashCode(this.onLandingPage);
    }

    public String toString() {
        return "RecommendationsQuestionnaireViewState(questionnaire=" + this.questionnaire + ", currentPageIndex=" + this.currentPageIndex + ", onTransitionEvent=" + this.onTransitionEvent + ", onBackEvent=" + this.onBackEvent + ", onNextFlowEvent=" + this.onNextFlowEvent + ", onExitFlowEvent=" + this.onExitFlowEvent + ", errorEvent=" + this.errorEvent + ", answeredQuestions=" + this.answeredQuestions + ", onLandingPage=" + this.onLandingPage + ")";
    }

    public RecommendationsQuestionnaireViewState(UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire, int i, UiEvent<TransitionInfo> uiEvent, UiEvent<Unit> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, UiEvent<Throwable> uiEvent5, Map<UUID, UUID> answeredQuestions, boolean z) {
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        this.questionnaire = uiRecommendationsQuestionnaire;
        this.currentPageIndex = i;
        this.onTransitionEvent = uiEvent;
        this.onBackEvent = uiEvent2;
        this.onNextFlowEvent = uiEvent3;
        this.onExitFlowEvent = uiEvent4;
        this.errorEvent = uiEvent5;
        this.answeredQuestions = answeredQuestions;
        this.onLandingPage = z;
    }

    public final UiRecommendationsQuestionnaire getQuestionnaire() {
        return this.questionnaire;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public final UiEvent<TransitionInfo> getOnTransitionEvent() {
        return this.onTransitionEvent;
    }

    public final UiEvent<Unit> getOnBackEvent() {
        return this.onBackEvent;
    }

    public final UiEvent<Unit> getOnNextFlowEvent() {
        return this.onNextFlowEvent;
    }

    public final UiEvent<Unit> getOnExitFlowEvent() {
        return this.onExitFlowEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public /* synthetic */ RecommendationsQuestionnaireViewState(UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire, int i, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, Map map, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uiRecommendationsQuestionnaire, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : uiEvent, (i2 & 8) != 0 ? null : uiEvent2, (i2 & 16) != 0 ? null : uiEvent3, (i2 & 32) != 0 ? null : uiEvent4, (i2 & 64) != 0 ? null : uiEvent5, (i2 & 128) != 0 ? MapsKt.emptyMap() : map, (i2 & 256) != 0 ? true : z);
    }

    public final Map<UUID, UUID> getAnsweredQuestions() {
        return this.answeredQuestions;
    }

    public final boolean getOnLandingPage() {
        return this.onLandingPage;
    }

    public final List<RecommendationsQuestionnairePage> getPages() {
        List<RecommendationsQuestionnairePage> allPages;
        UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire = this.questionnaire;
        return (uiRecommendationsQuestionnaire == null || (allPages = getAllPages(uiRecommendationsQuestionnaire)) == null) ? CollectionsKt.emptyList() : allPages;
    }

    public final RecommendationsQuestionnairePage getCurrentPage() {
        return (RecommendationsQuestionnairePage) CollectionsKt.getOrNull(getPages(), this.currentPageIndex);
    }

    private final int getNumberOfQuestions() {
        List<RecommendationsQuestionnairePage> pages = getPages();
        int i = 0;
        if ((pages instanceof Collection) && pages.isEmpty()) {
            return 0;
        }
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            if ((((RecommendationsQuestionnairePage) it.next()) instanceof RecommendationsQuestionnairePage.QuestionPage) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final UUID getCurrentQuestionId() {
        RecommendationsQuestionnairePage currentPage = getCurrentPage();
        RecommendationsQuestionnairePage.QuestionPage questionPage = currentPage instanceof RecommendationsQuestionnairePage.QuestionPage ? (RecommendationsQuestionnairePage.QuestionPage) currentPage : null;
        if (questionPage != null) {
            return questionPage.getQuestionId();
        }
        return null;
    }

    public final float questionnaireProgress(int index) {
        return numberQuestionsAnswered(index) / getNumberOfQuestions();
    }

    private final int numberQuestionsAnswered(int index) {
        int i = 0;
        List<RecommendationsQuestionnairePage> listSubList = getPages().subList(0, index);
        if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
            return 0;
        }
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            if ((((RecommendationsQuestionnairePage) it.next()) instanceof RecommendationsQuestionnairePage.QuestionPage) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    private final List<RecommendationsQuestionnairePage> getAllPages(UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire) {
        ArrayList arrayList = new ArrayList();
        for (UiRecommendationsQuestionnaire.Section section : uiRecommendationsQuestionnaire.getSections()) {
            UiRecommendationsQuestionnaire.SectionCover cover = section.getCover();
            if (cover != null) {
                arrayList.add(RecommendationsQuestionnairePage.INSTANCE.from(cover, section.getLoggingIdentifier()));
            }
            List<UiRecommendationsQuestionnaire.Question> questions = section.getQuestions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, 10));
            Iterator<T> it = questions.iterator();
            while (it.hasNext()) {
                arrayList2.add(RecommendationsQuestionnairePage.INSTANCE.from((UiRecommendationsQuestionnaire.Question) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* compiled from: RecommendationsQuestionnaireViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo$TransitionType;", "minProgress", "", "maxProgress", "<init>", "(Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo$TransitionType;FF)V", "getType", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo$TransitionType;", "getMinProgress", "()F", "getMaxProgress", "maxProgressPercentageRounded", "", "getMaxProgressPercentageRounded", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TransitionType", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransitionInfo implements Parcelable {
        public static final Parcelable.Creator<TransitionInfo> CREATOR = new Creator();
        private final float maxProgress;
        private final float minProgress;
        private final TransitionType type;

        /* compiled from: RecommendationsQuestionnaireViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransitionInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransitionInfo(TransitionType.valueOf(parcel.readString()), parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionInfo[] newArray(int i) {
                return new TransitionInfo[i];
            }
        }

        public static /* synthetic */ TransitionInfo copy$default(TransitionInfo transitionInfo, TransitionType transitionType, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                transitionType = transitionInfo.type;
            }
            if ((i & 2) != 0) {
                f = transitionInfo.minProgress;
            }
            if ((i & 4) != 0) {
                f2 = transitionInfo.maxProgress;
            }
            return transitionInfo.copy(transitionType, f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final TransitionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final float getMinProgress() {
            return this.minProgress;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMaxProgress() {
            return this.maxProgress;
        }

        public final TransitionInfo copy(TransitionType type2, float minProgress, float maxProgress) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new TransitionInfo(type2, minProgress, maxProgress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransitionInfo)) {
                return false;
            }
            TransitionInfo transitionInfo = (TransitionInfo) other;
            return this.type == transitionInfo.type && Float.compare(this.minProgress, transitionInfo.minProgress) == 0 && Float.compare(this.maxProgress, transitionInfo.maxProgress) == 0;
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + Float.hashCode(this.minProgress)) * 31) + Float.hashCode(this.maxProgress);
        }

        public String toString() {
            return "TransitionInfo(type=" + this.type + ", minProgress=" + this.minProgress + ", maxProgress=" + this.maxProgress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeFloat(this.minProgress);
            dest.writeFloat(this.maxProgress);
        }

        public TransitionInfo(TransitionType type2, float f, float f2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.minProgress = f;
            this.maxProgress = f2;
        }

        public final TransitionType getType() {
            return this.type;
        }

        public final float getMinProgress() {
            return this.minProgress;
        }

        public final float getMaxProgress() {
            return this.maxProgress;
        }

        public final int getMaxProgressPercentageRounded() {
            return MathKt.roundToInt(this.maxProgress * 100);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RecommendationsQuestionnaireViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo$TransitionType;", "", "<init>", "(Ljava/lang/String;I)V", "FORWARD", "BACKWARDS_IN_FLOW", "RETURN_FROM_NEXT_FLOW", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TransitionType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TransitionType[] $VALUES;
            public static final TransitionType FORWARD = new TransitionType("FORWARD", 0);
            public static final TransitionType BACKWARDS_IN_FLOW = new TransitionType("BACKWARDS_IN_FLOW", 1);
            public static final TransitionType RETURN_FROM_NEXT_FLOW = new TransitionType("RETURN_FROM_NEXT_FLOW", 2);

            private static final /* synthetic */ TransitionType[] $values() {
                return new TransitionType[]{FORWARD, BACKWARDS_IN_FLOW, RETURN_FROM_NEXT_FLOW};
            }

            public static EnumEntries<TransitionType> getEntries() {
                return $ENTRIES;
            }

            private TransitionType(String str, int i) {
            }

            static {
                TransitionType[] transitionTypeArr$values = $values();
                $VALUES = transitionTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(transitionTypeArr$values);
            }

            public static TransitionType valueOf(String str) {
                return (TransitionType) Enum.valueOf(TransitionType.class, str);
            }

            public static TransitionType[] values() {
                return (TransitionType[]) $VALUES.clone();
            }
        }
    }
}
