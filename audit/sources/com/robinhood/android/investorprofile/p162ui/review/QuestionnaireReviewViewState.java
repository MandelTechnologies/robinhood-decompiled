package com.robinhood.android.investorprofile.p162ui.review;

import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReviewViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;", "", "reviewPage", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "isCtaLoading", "", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;Z)V", "getReviewPage", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireReviewViewState {
    public static final int $stable = 8;
    private final boolean isCtaLoading;
    private final UiQuestionnaireReview reviewPage;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionnaireReviewViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QuestionnaireReviewViewState copy$default(QuestionnaireReviewViewState questionnaireReviewViewState, UiQuestionnaireReview uiQuestionnaireReview, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uiQuestionnaireReview = questionnaireReviewViewState.reviewPage;
        }
        if ((i & 2) != 0) {
            z = questionnaireReviewViewState.isCtaLoading;
        }
        return questionnaireReviewViewState.copy(uiQuestionnaireReview, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UiQuestionnaireReview getReviewPage() {
        return this.reviewPage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCtaLoading() {
        return this.isCtaLoading;
    }

    public final QuestionnaireReviewViewState copy(UiQuestionnaireReview reviewPage, boolean isCtaLoading) {
        return new QuestionnaireReviewViewState(reviewPage, isCtaLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireReviewViewState)) {
            return false;
        }
        QuestionnaireReviewViewState questionnaireReviewViewState = (QuestionnaireReviewViewState) other;
        return Intrinsics.areEqual(this.reviewPage, questionnaireReviewViewState.reviewPage) && this.isCtaLoading == questionnaireReviewViewState.isCtaLoading;
    }

    public int hashCode() {
        UiQuestionnaireReview uiQuestionnaireReview = this.reviewPage;
        return ((uiQuestionnaireReview == null ? 0 : uiQuestionnaireReview.hashCode()) * 31) + Boolean.hashCode(this.isCtaLoading);
    }

    public String toString() {
        return "QuestionnaireReviewViewState(reviewPage=" + this.reviewPage + ", isCtaLoading=" + this.isCtaLoading + ")";
    }

    public QuestionnaireReviewViewState(UiQuestionnaireReview uiQuestionnaireReview, boolean z) {
        this.reviewPage = uiQuestionnaireReview;
        this.isCtaLoading = z;
    }

    public /* synthetic */ QuestionnaireReviewViewState(UiQuestionnaireReview uiQuestionnaireReview, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiQuestionnaireReview, (i & 2) != 0 ? false : z);
    }

    public final UiQuestionnaireReview getReviewPage() {
        return this.reviewPage;
    }

    public final boolean isCtaLoading() {
        return this.isCtaLoading;
    }
}
