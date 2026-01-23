package com.robinhood.android.rollover401k.steps.interstitial;

import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverInterstitialResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kInterstitialViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialViewState;", "", "viewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Rollover401kInterstitialViewState {
    public static final int $stable = 8;
    private final ApiRetirement401kRolloverInterstitialResponse viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public Rollover401kInterstitialViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Rollover401kInterstitialViewState copy$default(Rollover401kInterstitialViewState rollover401kInterstitialViewState, ApiRetirement401kRolloverInterstitialResponse apiRetirement401kRolloverInterstitialResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirement401kRolloverInterstitialResponse = rollover401kInterstitialViewState.viewModel;
        }
        return rollover401kInterstitialViewState.copy(apiRetirement401kRolloverInterstitialResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirement401kRolloverInterstitialResponse getViewModel() {
        return this.viewModel;
    }

    public final Rollover401kInterstitialViewState copy(ApiRetirement401kRolloverInterstitialResponse viewModel) {
        return new Rollover401kInterstitialViewState(viewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Rollover401kInterstitialViewState) && Intrinsics.areEqual(this.viewModel, ((Rollover401kInterstitialViewState) other).viewModel);
    }

    public int hashCode() {
        ApiRetirement401kRolloverInterstitialResponse apiRetirement401kRolloverInterstitialResponse = this.viewModel;
        if (apiRetirement401kRolloverInterstitialResponse == null) {
            return 0;
        }
        return apiRetirement401kRolloverInterstitialResponse.hashCode();
    }

    public String toString() {
        return "Rollover401kInterstitialViewState(viewModel=" + this.viewModel + ")";
    }

    public Rollover401kInterstitialViewState(ApiRetirement401kRolloverInterstitialResponse apiRetirement401kRolloverInterstitialResponse) {
        this.viewModel = apiRetirement401kRolloverInterstitialResponse;
    }

    public /* synthetic */ Rollover401kInterstitialViewState(ApiRetirement401kRolloverInterstitialResponse apiRetirement401kRolloverInterstitialResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRetirement401kRolloverInterstitialResponse);
    }

    public final ApiRetirement401kRolloverInterstitialResponse getViewModel() {
        return this.viewModel;
    }
}
