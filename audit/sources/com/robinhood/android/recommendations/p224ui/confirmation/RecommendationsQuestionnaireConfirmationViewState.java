package com.robinhood.android.recommendations.p224ui.confirmation;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsQuestionnaireConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationViewState;", "", "isLoading", "", "hasConfirmed", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(ZZLcom/robinhood/udf/UiEvent;)V", "()Z", "getHasConfirmed", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsQuestionnaireConfirmationViewState {
    private final UiEvent<Throwable> errorEvent;
    private final boolean hasConfirmed;
    private final boolean isLoading;

    public RecommendationsQuestionnaireConfirmationViewState() {
        this(false, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationsQuestionnaireConfirmationViewState copy$default(RecommendationsQuestionnaireConfirmationViewState recommendationsQuestionnaireConfirmationViewState, boolean z, boolean z2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recommendationsQuestionnaireConfirmationViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = recommendationsQuestionnaireConfirmationViewState.hasConfirmed;
        }
        if ((i & 4) != 0) {
            uiEvent = recommendationsQuestionnaireConfirmationViewState.errorEvent;
        }
        return recommendationsQuestionnaireConfirmationViewState.copy(z, z2, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasConfirmed() {
        return this.hasConfirmed;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final RecommendationsQuestionnaireConfirmationViewState copy(boolean isLoading, boolean hasConfirmed, UiEvent<Throwable> errorEvent) {
        return new RecommendationsQuestionnaireConfirmationViewState(isLoading, hasConfirmed, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsQuestionnaireConfirmationViewState)) {
            return false;
        }
        RecommendationsQuestionnaireConfirmationViewState recommendationsQuestionnaireConfirmationViewState = (RecommendationsQuestionnaireConfirmationViewState) other;
        return this.isLoading == recommendationsQuestionnaireConfirmationViewState.isLoading && this.hasConfirmed == recommendationsQuestionnaireConfirmationViewState.hasConfirmed && Intrinsics.areEqual(this.errorEvent, recommendationsQuestionnaireConfirmationViewState.errorEvent);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.hasConfirmed)) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "RecommendationsQuestionnaireConfirmationViewState(isLoading=" + this.isLoading + ", hasConfirmed=" + this.hasConfirmed + ", errorEvent=" + this.errorEvent + ")";
    }

    public RecommendationsQuestionnaireConfirmationViewState(boolean z, boolean z2, UiEvent<Throwable> uiEvent) {
        this.isLoading = z;
        this.hasConfirmed = z2;
        this.errorEvent = uiEvent;
    }

    public /* synthetic */ RecommendationsQuestionnaireConfirmationViewState(boolean z, boolean z2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiEvent);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getHasConfirmed() {
        return this.hasConfirmed;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
