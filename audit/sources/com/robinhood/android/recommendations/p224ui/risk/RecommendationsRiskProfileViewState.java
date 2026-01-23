package com.robinhood.android.recommendations.p224ui.risk;

import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileViewState;", "", "isLoading", "", "startWalkthroughEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "errorEvent", "", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getStartWalkthroughEvent", "()Lcom/robinhood/udf/UiEvent;", "getErrorEvent", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsRiskProfileViewState {
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final UiEvent<UiRecommendationsPortfolio> startWalkthroughEvent;

    public RecommendationsRiskProfileViewState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationsRiskProfileViewState copy$default(RecommendationsRiskProfileViewState recommendationsRiskProfileViewState, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recommendationsRiskProfileViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = recommendationsRiskProfileViewState.startWalkthroughEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = recommendationsRiskProfileViewState.errorEvent;
        }
        return recommendationsRiskProfileViewState.copy(z, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<UiRecommendationsPortfolio> component2() {
        return this.startWalkthroughEvent;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final RecommendationsRiskProfileViewState copy(boolean isLoading, UiEvent<UiRecommendationsPortfolio> startWalkthroughEvent, UiEvent<Throwable> errorEvent) {
        return new RecommendationsRiskProfileViewState(isLoading, startWalkthroughEvent, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsRiskProfileViewState)) {
            return false;
        }
        RecommendationsRiskProfileViewState recommendationsRiskProfileViewState = (RecommendationsRiskProfileViewState) other;
        return this.isLoading == recommendationsRiskProfileViewState.isLoading && Intrinsics.areEqual(this.startWalkthroughEvent, recommendationsRiskProfileViewState.startWalkthroughEvent) && Intrinsics.areEqual(this.errorEvent, recommendationsRiskProfileViewState.errorEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiEvent<UiRecommendationsPortfolio> uiEvent = this.startWalkthroughEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorEvent;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationsRiskProfileViewState(isLoading=" + this.isLoading + ", startWalkthroughEvent=" + this.startWalkthroughEvent + ", errorEvent=" + this.errorEvent + ")";
    }

    public RecommendationsRiskProfileViewState(boolean z, UiEvent<UiRecommendationsPortfolio> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.isLoading = z;
        this.startWalkthroughEvent = uiEvent;
        this.errorEvent = uiEvent2;
    }

    public /* synthetic */ RecommendationsRiskProfileViewState(boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<UiRecommendationsPortfolio> getStartWalkthroughEvent() {
        return this.startWalkthroughEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
