package com.robinhood.android.support.call.survey;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyRatingQuestionContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SurveyRatingQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState;", "", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyRatingQuestion;", "selectedRating", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;Lcom/robinhood/udf/UiEvent;)V", "getSelectedRating", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "content", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext;", "getContent", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext;", "ratingEntries", "", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState$RatingEntry;", "getRatingEntries", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RatingEntry", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class SurveyRatingQuestionViewState {
    public static final int $stable = 8;
    private final SurveyRatingQuestionContext content;
    private final UiEvent<Throwable> errorEvent;
    private final List<RatingEntry> ratingEntries;
    private final SurveyRatingQuestionContext.RatingValue selectedRating;
    private final UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> userViewState;

    public SurveyRatingQuestionViewState() {
        this(null, null, null, 7, null);
    }

    private final UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> component1() {
        return this.userViewState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyRatingQuestionViewState copy$default(SurveyRatingQuestionViewState surveyRatingQuestionViewState, UserViewState.Page page, SurveyRatingQuestionContext.RatingValue ratingValue, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            page = surveyRatingQuestionViewState.userViewState;
        }
        if ((i & 2) != 0) {
            ratingValue = surveyRatingQuestionViewState.selectedRating;
        }
        if ((i & 4) != 0) {
            uiEvent = surveyRatingQuestionViewState.errorEvent;
        }
        return surveyRatingQuestionViewState.copy(page, ratingValue, uiEvent);
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyRatingQuestionContext.RatingValue getSelectedRating() {
        return this.selectedRating;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final SurveyRatingQuestionViewState copy(UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> userViewState, SurveyRatingQuestionContext.RatingValue selectedRating, UiEvent<Throwable> errorEvent) {
        return new SurveyRatingQuestionViewState(userViewState, selectedRating, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyRatingQuestionViewState)) {
            return false;
        }
        SurveyRatingQuestionViewState surveyRatingQuestionViewState = (SurveyRatingQuestionViewState) other;
        return Intrinsics.areEqual(this.userViewState, surveyRatingQuestionViewState.userViewState) && Intrinsics.areEqual(this.selectedRating, surveyRatingQuestionViewState.selectedRating) && Intrinsics.areEqual(this.errorEvent, surveyRatingQuestionViewState.errorEvent);
    }

    public int hashCode() {
        UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> page = this.userViewState;
        int iHashCode = (page == null ? 0 : page.hashCode()) * 31;
        SurveyRatingQuestionContext.RatingValue ratingValue = this.selectedRating;
        int iHashCode2 = (iHashCode + (ratingValue == null ? 0 : ratingValue.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "SurveyRatingQuestionViewState(userViewState=" + this.userViewState + ", selectedRating=" + this.selectedRating + ", errorEvent=" + this.errorEvent + ")";
    }

    public SurveyRatingQuestionViewState(UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> page, SurveyRatingQuestionContext.RatingValue ratingValue, UiEvent<Throwable> uiEvent) {
        List<SurveyRatingQuestionContext.RatingValue> ratingValues;
        UserViewStatePageContext.SurveyRatingQuestion surveyRatingQuestion;
        this.userViewState = page;
        this.selectedRating = ratingValue;
        this.errorEvent = uiEvent;
        ArrayList arrayList = null;
        SurveyRatingQuestionContext context = (page == null || (surveyRatingQuestion = (UserViewStatePageContext.SurveyRatingQuestion) page.getTypeContext()) == null) ? null : surveyRatingQuestion.getContext();
        this.content = context;
        if (context != null && (ratingValues = context.getRatingValues()) != null) {
            List<SurveyRatingQuestionContext.RatingValue> list = ratingValues;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SurveyRatingQuestionContext.RatingValue ratingValue2 : list) {
                String id = ratingValue2.getId();
                SurveyRatingQuestionContext.RatingValue ratingValue3 = this.selectedRating;
                arrayList2.add(new RatingEntry(ratingValue2, Intrinsics.areEqual(id, ratingValue3 != null ? ratingValue3.getId() : null)));
            }
            arrayList = arrayList2;
        }
        this.ratingEntries = arrayList;
    }

    public /* synthetic */ SurveyRatingQuestionViewState(UserViewState.Page page, SurveyRatingQuestionContext.RatingValue ratingValue, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : page, (i & 2) != 0 ? null : ratingValue, (i & 4) != 0 ? null : uiEvent);
    }

    public final SurveyRatingQuestionContext.RatingValue getSelectedRating() {
        return this.selectedRating;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final SurveyRatingQuestionContext getContent() {
        return this.content;
    }

    public final List<RatingEntry> getRatingEntries() {
        return this.ratingEntries;
    }

    /* compiled from: SurveyRatingQuestionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState$RatingEntry;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;", "isSelected", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;Z)V", "getData", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RatingEntry {
        public static final int $stable = 8;
        private final SurveyRatingQuestionContext.RatingValue data;
        private final boolean isSelected;

        public static /* synthetic */ RatingEntry copy$default(RatingEntry ratingEntry, SurveyRatingQuestionContext.RatingValue ratingValue, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                ratingValue = ratingEntry.data;
            }
            if ((i & 2) != 0) {
                z = ratingEntry.isSelected;
            }
            return ratingEntry.copy(ratingValue, z);
        }

        /* renamed from: component1, reason: from getter */
        public final SurveyRatingQuestionContext.RatingValue getData() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final RatingEntry copy(SurveyRatingQuestionContext.RatingValue data, boolean isSelected) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new RatingEntry(data, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingEntry)) {
                return false;
            }
            RatingEntry ratingEntry = (RatingEntry) other;
            return Intrinsics.areEqual(this.data, ratingEntry.data) && this.isSelected == ratingEntry.isSelected;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "RatingEntry(data=" + this.data + ", isSelected=" + this.isSelected + ")";
        }

        public RatingEntry(SurveyRatingQuestionContext.RatingValue data, boolean z) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.isSelected = z;
        }

        public final SurveyRatingQuestionContext.RatingValue getData() {
            return this.data;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }
    }
}
