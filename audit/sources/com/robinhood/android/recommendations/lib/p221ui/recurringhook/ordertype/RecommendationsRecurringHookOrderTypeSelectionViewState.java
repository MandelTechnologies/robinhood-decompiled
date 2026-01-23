package com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype;

import com.robinhood.recommendations.models.api.allocationweights.ApiRecommendationsAllocationWeightsResponse;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRecurringHookOrderTypeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/RecommendationsRecurringHookOrderTypeSelectionViewState;", "", "applyRecommendationsSplitToRecurringOrderEvent", "Lcom/robinhood/udf/UiEvent;", "", "Lcom/robinhood/recommendations/models/api/allocationweights/ApiRecommendationsAllocationWeightsResponse$Weight;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/ordertype/Weight;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getApplyRecommendationsSplitToRecurringOrderEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsRecurringHookOrderTypeSelectionViewState {
    public static final int $stable = 8;
    private final UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> applyRecommendationsSplitToRecurringOrderEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsRecurringHookOrderTypeSelectionViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationsRecurringHookOrderTypeSelectionViewState copy$default(RecommendationsRecurringHookOrderTypeSelectionViewState recommendationsRecurringHookOrderTypeSelectionViewState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = recommendationsRecurringHookOrderTypeSelectionViewState.applyRecommendationsSplitToRecurringOrderEvent;
        }
        return recommendationsRecurringHookOrderTypeSelectionViewState.copy(uiEvent);
    }

    public final UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> component1() {
        return this.applyRecommendationsSplitToRecurringOrderEvent;
    }

    public final RecommendationsRecurringHookOrderTypeSelectionViewState copy(UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> applyRecommendationsSplitToRecurringOrderEvent) {
        return new RecommendationsRecurringHookOrderTypeSelectionViewState(applyRecommendationsSplitToRecurringOrderEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecommendationsRecurringHookOrderTypeSelectionViewState) && Intrinsics.areEqual(this.applyRecommendationsSplitToRecurringOrderEvent, ((RecommendationsRecurringHookOrderTypeSelectionViewState) other).applyRecommendationsSplitToRecurringOrderEvent);
    }

    public int hashCode() {
        UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> uiEvent = this.applyRecommendationsSplitToRecurringOrderEvent;
        if (uiEvent == null) {
            return 0;
        }
        return uiEvent.hashCode();
    }

    public String toString() {
        return "RecommendationsRecurringHookOrderTypeSelectionViewState(applyRecommendationsSplitToRecurringOrderEvent=" + this.applyRecommendationsSplitToRecurringOrderEvent + ")";
    }

    public RecommendationsRecurringHookOrderTypeSelectionViewState(UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> uiEvent) {
        this.applyRecommendationsSplitToRecurringOrderEvent = uiEvent;
    }

    public /* synthetic */ RecommendationsRecurringHookOrderTypeSelectionViewState(UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent);
    }

    public final UiEvent<List<ApiRecommendationsAllocationWeightsResponse.Weight>> getApplyRecommendationsSplitToRecurringOrderEvent() {
        return this.applyRecommendationsSplitToRecurringOrderEvent;
    }
}
