package com.robinhood.android.support.call.survey;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyFreeFormQuestionContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyFreeFormQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyFreeFormQuestionViewState;", "", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyFreeFormQuestion;", "charLimitText", "", "isLoading", "", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;Ljava/lang/String;ZLcom/robinhood/udf/UiEvent;)V", "getCharLimitText", "()Ljava/lang/String;", "()Z", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "content", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyFreeFormQuestionContext;", "getContent", "()Lcom/robinhood/models/ui/pathfinder/contexts/SurveyFreeFormQuestionContext;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SurveyFreeFormQuestionViewState {
    public static final int $stable = 8;
    private final String charLimitText;
    private final SurveyFreeFormQuestionContext content;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> userViewState;

    public SurveyFreeFormQuestionViewState() {
        this(null, null, false, null, 15, null);
    }

    private final UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> component1() {
        return this.userViewState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyFreeFormQuestionViewState copy$default(SurveyFreeFormQuestionViewState surveyFreeFormQuestionViewState, UserViewState.Page page, String str, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            page = surveyFreeFormQuestionViewState.userViewState;
        }
        if ((i & 2) != 0) {
            str = surveyFreeFormQuestionViewState.charLimitText;
        }
        if ((i & 4) != 0) {
            z = surveyFreeFormQuestionViewState.isLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = surveyFreeFormQuestionViewState.errorEvent;
        }
        return surveyFreeFormQuestionViewState.copy(page, str, z, uiEvent);
    }

    /* renamed from: component2, reason: from getter */
    public final String getCharLimitText() {
        return this.charLimitText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component4() {
        return this.errorEvent;
    }

    public final SurveyFreeFormQuestionViewState copy(UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> userViewState, String charLimitText, boolean isLoading, UiEvent<Throwable> errorEvent) {
        Intrinsics.checkNotNullParameter(charLimitText, "charLimitText");
        return new SurveyFreeFormQuestionViewState(userViewState, charLimitText, isLoading, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyFreeFormQuestionViewState)) {
            return false;
        }
        SurveyFreeFormQuestionViewState surveyFreeFormQuestionViewState = (SurveyFreeFormQuestionViewState) other;
        return Intrinsics.areEqual(this.userViewState, surveyFreeFormQuestionViewState.userViewState) && Intrinsics.areEqual(this.charLimitText, surveyFreeFormQuestionViewState.charLimitText) && this.isLoading == surveyFreeFormQuestionViewState.isLoading && Intrinsics.areEqual(this.errorEvent, surveyFreeFormQuestionViewState.errorEvent);
    }

    public int hashCode() {
        UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> page = this.userViewState;
        int iHashCode = (((((page == null ? 0 : page.hashCode()) * 31) + this.charLimitText.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "SurveyFreeFormQuestionViewState(userViewState=" + this.userViewState + ", charLimitText=" + this.charLimitText + ", isLoading=" + this.isLoading + ", errorEvent=" + this.errorEvent + ")";
    }

    public SurveyFreeFormQuestionViewState(UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> page, String charLimitText, boolean z, UiEvent<Throwable> uiEvent) {
        UserViewStatePageContext.SurveyFreeFormQuestion surveyFreeFormQuestion;
        Intrinsics.checkNotNullParameter(charLimitText, "charLimitText");
        this.userViewState = page;
        this.charLimitText = charLimitText;
        this.isLoading = z;
        this.errorEvent = uiEvent;
        this.content = (page == null || (surveyFreeFormQuestion = (UserViewStatePageContext.SurveyFreeFormQuestion) page.getTypeContext()) == null) ? null : surveyFreeFormQuestion.getContext();
    }

    public /* synthetic */ SurveyFreeFormQuestionViewState(UserViewState.Page page, String str, boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : page, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent);
    }

    public final String getCharLimitText() {
        return this.charLimitText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final SurveyFreeFormQuestionContext getContent() {
        return this.content;
    }
}
