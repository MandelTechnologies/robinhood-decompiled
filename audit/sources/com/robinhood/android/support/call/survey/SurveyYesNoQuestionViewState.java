package com.robinhood.android.support.call.survey;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyYesNoQuestionContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyYesNoQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState;", "", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyYesNoQuestion;", "dismissButtonText", "", "loadingState", "Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState$LoadingState;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;Ljava/lang/String;Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState$LoadingState;Lcom/robinhood/udf/UiEvent;)V", "getDismissButtonText", "()Ljava/lang/String;", "getLoadingState", "()Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState$LoadingState;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "content", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyYesNoQuestionContext;", "getContent", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyYesNoQuestionContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LoadingState", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SurveyYesNoQuestionViewState {
    public static final int $stable = 8;
    private final SurveyYesNoQuestionContext content;
    private final String dismissButtonText;
    private final UiEvent<Throwable> errorEvent;
    private final LoadingState loadingState;
    private final UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> userViewState;

    public SurveyYesNoQuestionViewState() {
        this(null, null, null, null, 15, null);
    }

    private final UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> component1() {
        return this.userViewState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyYesNoQuestionViewState copy$default(SurveyYesNoQuestionViewState surveyYesNoQuestionViewState, UserViewState.Page page, String str, LoadingState loadingState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            page = surveyYesNoQuestionViewState.userViewState;
        }
        if ((i & 2) != 0) {
            str = surveyYesNoQuestionViewState.dismissButtonText;
        }
        if ((i & 4) != 0) {
            loadingState = surveyYesNoQuestionViewState.loadingState;
        }
        if ((i & 8) != 0) {
            uiEvent = surveyYesNoQuestionViewState.errorEvent;
        }
        return surveyYesNoQuestionViewState.copy(page, str, loadingState, uiEvent);
    }

    /* renamed from: component2, reason: from getter */
    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final UiEvent<Throwable> component4() {
        return this.errorEvent;
    }

    public final SurveyYesNoQuestionViewState copy(UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> userViewState, String dismissButtonText, LoadingState loadingState, UiEvent<Throwable> errorEvent) {
        Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        return new SurveyYesNoQuestionViewState(userViewState, dismissButtonText, loadingState, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyYesNoQuestionViewState)) {
            return false;
        }
        SurveyYesNoQuestionViewState surveyYesNoQuestionViewState = (SurveyYesNoQuestionViewState) other;
        return Intrinsics.areEqual(this.userViewState, surveyYesNoQuestionViewState.userViewState) && Intrinsics.areEqual(this.dismissButtonText, surveyYesNoQuestionViewState.dismissButtonText) && this.loadingState == surveyYesNoQuestionViewState.loadingState && Intrinsics.areEqual(this.errorEvent, surveyYesNoQuestionViewState.errorEvent);
    }

    public int hashCode() {
        UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> page = this.userViewState;
        int iHashCode = (((((page == null ? 0 : page.hashCode()) * 31) + this.dismissButtonText.hashCode()) * 31) + this.loadingState.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "SurveyYesNoQuestionViewState(userViewState=" + this.userViewState + ", dismissButtonText=" + this.dismissButtonText + ", loadingState=" + this.loadingState + ", errorEvent=" + this.errorEvent + ")";
    }

    public SurveyYesNoQuestionViewState(UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> page, String dismissButtonText, LoadingState loadingState, UiEvent<Throwable> uiEvent) {
        UserViewStatePageContext.SurveyYesNoQuestion surveyYesNoQuestion;
        Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.userViewState = page;
        this.dismissButtonText = dismissButtonText;
        this.loadingState = loadingState;
        this.errorEvent = uiEvent;
        this.content = (page == null || (surveyYesNoQuestion = (UserViewStatePageContext.SurveyYesNoQuestion) page.getTypeContext()) == null) ? null : surveyYesNoQuestion.getContext();
    }

    public /* synthetic */ SurveyYesNoQuestionViewState(UserViewState.Page page, String str, LoadingState loadingState, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : page, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? LoadingState.NOT_LOADING : loadingState, (i & 8) != 0 ? null : uiEvent);
    }

    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final SurveyYesNoQuestionContext getContent() {
        return this.content;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SurveyYesNoQuestionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState$LoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_LOADING", "LOADING_SELECTED_YES", "LOADING_SELECTED_NO", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState NOT_LOADING = new LoadingState("NOT_LOADING", 0);
        public static final LoadingState LOADING_SELECTED_YES = new LoadingState("LOADING_SELECTED_YES", 1);
        public static final LoadingState LOADING_SELECTED_NO = new LoadingState("LOADING_SELECTED_NO", 2);

        private static final /* synthetic */ LoadingState[] $values() {
            return new LoadingState[]{NOT_LOADING, LOADING_SELECTED_YES, LOADING_SELECTED_NO};
        }

        public static EnumEntries<LoadingState> getEntries() {
            return $ENTRIES;
        }

        private LoadingState(String str, int i) {
        }

        static {
            LoadingState[] loadingStateArr$values = $values();
            $VALUES = loadingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(loadingStateArr$values);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }
}
