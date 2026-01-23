package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetViewState;", "", "contributionApiResponse", "Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetResponse;)V", "getContributionApiResponse", "()Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateRetirementContributionBottomSheetViewState {
    public static final int $stable = 8;
    private final ApiIraContributionBottomSheetResponse contributionApiResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateRetirementContributionBottomSheetViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreateRetirementContributionBottomSheetViewState copy$default(CreateRetirementContributionBottomSheetViewState createRetirementContributionBottomSheetViewState, ApiIraContributionBottomSheetResponse apiIraContributionBottomSheetResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            apiIraContributionBottomSheetResponse = createRetirementContributionBottomSheetViewState.contributionApiResponse;
        }
        return createRetirementContributionBottomSheetViewState.copy(apiIraContributionBottomSheetResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiIraContributionBottomSheetResponse getContributionApiResponse() {
        return this.contributionApiResponse;
    }

    public final CreateRetirementContributionBottomSheetViewState copy(ApiIraContributionBottomSheetResponse contributionApiResponse) {
        return new CreateRetirementContributionBottomSheetViewState(contributionApiResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateRetirementContributionBottomSheetViewState) && Intrinsics.areEqual(this.contributionApiResponse, ((CreateRetirementContributionBottomSheetViewState) other).contributionApiResponse);
    }

    public int hashCode() {
        ApiIraContributionBottomSheetResponse apiIraContributionBottomSheetResponse = this.contributionApiResponse;
        if (apiIraContributionBottomSheetResponse == null) {
            return 0;
        }
        return apiIraContributionBottomSheetResponse.hashCode();
    }

    public String toString() {
        return "CreateRetirementContributionBottomSheetViewState(contributionApiResponse=" + this.contributionApiResponse + ")";
    }

    public CreateRetirementContributionBottomSheetViewState(ApiIraContributionBottomSheetResponse apiIraContributionBottomSheetResponse) {
        this.contributionApiResponse = apiIraContributionBottomSheetResponse;
    }

    public /* synthetic */ CreateRetirementContributionBottomSheetViewState(ApiIraContributionBottomSheetResponse apiIraContributionBottomSheetResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiIraContributionBottomSheetResponse);
    }

    public final ApiIraContributionBottomSheetResponse getContributionApiResponse() {
        return this.contributionApiResponse;
    }
}
