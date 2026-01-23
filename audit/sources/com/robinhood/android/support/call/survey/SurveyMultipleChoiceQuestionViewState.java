package com.robinhood.android.support.call.survey;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyMultipleChoiceQuestionContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.udf.UiEvent;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SurveyMultipleChoiceQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JG\u0010#\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionViewState;", "", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyMultipleChoiceQuestion;", "selectedChoiceIds", "", "", "isLoading", "", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;Ljava/util/Set;ZLcom/robinhood/udf/UiEvent;)V", "()Z", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "content", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyMultipleChoiceQuestionContext;", "getContent", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyMultipleChoiceQuestionContext;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/support/call/survey/ChoiceEntry;", "getChoices", "()Ljava/util/List;", "copyWithUpdatedSelection", "id", "isSelected", "getSelectedChoiceIds", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class SurveyMultipleChoiceQuestionViewState {
    public static final int $stable = 8;
    private final List<ChoiceEntry> choices;
    private final SurveyMultipleChoiceQuestionContext content;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final Set<String> selectedChoiceIds;
    private final UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> userViewState;

    public SurveyMultipleChoiceQuestionViewState() {
        this(null, null, false, null, 15, null);
    }

    private final UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> component1() {
        return this.userViewState;
    }

    private final Set<String> component2() {
        return this.selectedChoiceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyMultipleChoiceQuestionViewState copy$default(SurveyMultipleChoiceQuestionViewState surveyMultipleChoiceQuestionViewState, UserViewState.Page page, Set set, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            page = surveyMultipleChoiceQuestionViewState.userViewState;
        }
        if ((i & 2) != 0) {
            set = surveyMultipleChoiceQuestionViewState.selectedChoiceIds;
        }
        if ((i & 4) != 0) {
            z = surveyMultipleChoiceQuestionViewState.isLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = surveyMultipleChoiceQuestionViewState.errorEvent;
        }
        return surveyMultipleChoiceQuestionViewState.copy(page, set, z, uiEvent);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component4() {
        return this.errorEvent;
    }

    public final SurveyMultipleChoiceQuestionViewState copy(UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> userViewState, Set<String> selectedChoiceIds, boolean isLoading, UiEvent<Throwable> errorEvent) {
        Intrinsics.checkNotNullParameter(selectedChoiceIds, "selectedChoiceIds");
        return new SurveyMultipleChoiceQuestionViewState(userViewState, selectedChoiceIds, isLoading, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyMultipleChoiceQuestionViewState)) {
            return false;
        }
        SurveyMultipleChoiceQuestionViewState surveyMultipleChoiceQuestionViewState = (SurveyMultipleChoiceQuestionViewState) other;
        return Intrinsics.areEqual(this.userViewState, surveyMultipleChoiceQuestionViewState.userViewState) && Intrinsics.areEqual(this.selectedChoiceIds, surveyMultipleChoiceQuestionViewState.selectedChoiceIds) && this.isLoading == surveyMultipleChoiceQuestionViewState.isLoading && Intrinsics.areEqual(this.errorEvent, surveyMultipleChoiceQuestionViewState.errorEvent);
    }

    public int hashCode() {
        UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> page = this.userViewState;
        int iHashCode = (((((page == null ? 0 : page.hashCode()) * 31) + this.selectedChoiceIds.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "SurveyMultipleChoiceQuestionViewState(userViewState=" + this.userViewState + ", selectedChoiceIds=" + this.selectedChoiceIds + ", isLoading=" + this.isLoading + ", errorEvent=" + this.errorEvent + ")";
    }

    public SurveyMultipleChoiceQuestionViewState(UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> page, Set<String> selectedChoiceIds, boolean z, UiEvent<Throwable> uiEvent) {
        List<ChoiceEntry> listEmptyList;
        List<SurveyMultipleChoiceQuestionContext.Choice> choices;
        UserViewStatePageContext.SurveyMultipleChoiceQuestion surveyMultipleChoiceQuestion;
        Intrinsics.checkNotNullParameter(selectedChoiceIds, "selectedChoiceIds");
        this.userViewState = page;
        this.selectedChoiceIds = selectedChoiceIds;
        this.isLoading = z;
        this.errorEvent = uiEvent;
        SurveyMultipleChoiceQuestionContext context = (page == null || (surveyMultipleChoiceQuestion = (UserViewStatePageContext.SurveyMultipleChoiceQuestion) page.getTypeContext()) == null) ? null : surveyMultipleChoiceQuestion.getContext();
        this.content = context;
        if (context != null && (choices = context.getChoices()) != null) {
            List<SurveyMultipleChoiceQuestionContext.Choice> list = choices;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SurveyMultipleChoiceQuestionContext.Choice choice : list) {
                listEmptyList.add(new ChoiceEntry(choice, this.selectedChoiceIds.contains(choice.getId())));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.choices = listEmptyList;
    }

    public /* synthetic */ SurveyMultipleChoiceQuestionViewState(UserViewState.Page page, Set set, boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : page, (i & 2) != 0 ? SetsKt.emptySet() : set, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final SurveyMultipleChoiceQuestionContext getContent() {
        return this.content;
    }

    public final List<ChoiceEntry> getChoices() {
        return this.choices;
    }

    public final SurveyMultipleChoiceQuestionViewState copyWithUpdatedSelection(String id, boolean isSelected) {
        Set<String> setMinus;
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.content == null) {
            return this;
        }
        boolean z = this.selectedChoiceIds.size() >= this.content.getSelectUpTo();
        if (isSelected && z) {
            setMinus = this.selectedChoiceIds;
        } else if (isSelected) {
            setMinus = SetsKt.plus(this.selectedChoiceIds, id);
        } else {
            setMinus = SetsKt.minus(this.selectedChoiceIds, id);
        }
        return copy$default(this, null, setMinus, false, null, 13, null);
    }

    public final List<String> getSelectedChoiceIds() {
        return CollectionsKt.toList(this.selectedChoiceIds);
    }
}
