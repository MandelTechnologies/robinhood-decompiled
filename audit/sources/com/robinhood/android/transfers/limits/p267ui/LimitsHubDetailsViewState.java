package com.robinhood.android.transfers.limits.p267ui;

import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LimitsHubDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;", "", "isLoading", "", "response", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsResponse;", "<init>", "(ZLcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsResponse;)V", "()Z", "getResponse", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsResponse;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-limits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LimitsHubDetailsViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final ApiLimitsHubDetailsResponse response;

    /* JADX WARN: Multi-variable type inference failed */
    public LimitsHubDetailsViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LimitsHubDetailsViewState copy$default(LimitsHubDetailsViewState limitsHubDetailsViewState, boolean z, ApiLimitsHubDetailsResponse apiLimitsHubDetailsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = limitsHubDetailsViewState.isLoading;
        }
        if ((i & 2) != 0) {
            apiLimitsHubDetailsResponse = limitsHubDetailsViewState.response;
        }
        return limitsHubDetailsViewState.copy(z, apiLimitsHubDetailsResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiLimitsHubDetailsResponse getResponse() {
        return this.response;
    }

    public final LimitsHubDetailsViewState copy(boolean isLoading, ApiLimitsHubDetailsResponse response) {
        return new LimitsHubDetailsViewState(isLoading, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitsHubDetailsViewState)) {
            return false;
        }
        LimitsHubDetailsViewState limitsHubDetailsViewState = (LimitsHubDetailsViewState) other;
        return this.isLoading == limitsHubDetailsViewState.isLoading && Intrinsics.areEqual(this.response, limitsHubDetailsViewState.response);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        ApiLimitsHubDetailsResponse apiLimitsHubDetailsResponse = this.response;
        return iHashCode + (apiLimitsHubDetailsResponse == null ? 0 : apiLimitsHubDetailsResponse.hashCode());
    }

    public String toString() {
        return "LimitsHubDetailsViewState(isLoading=" + this.isLoading + ", response=" + this.response + ")";
    }

    public LimitsHubDetailsViewState(boolean z, ApiLimitsHubDetailsResponse apiLimitsHubDetailsResponse) {
        this.isLoading = z;
        this.response = apiLimitsHubDetailsResponse;
    }

    public /* synthetic */ LimitsHubDetailsViewState(boolean z, ApiLimitsHubDetailsResponse apiLimitsHubDetailsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : apiLimitsHubDetailsResponse);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ApiLimitsHubDetailsResponse getResponse() {
        return this.response;
    }
}
