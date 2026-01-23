package com.robinhood.android.rollover401k.steps.verifyinfo;

import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kVerifyInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;", "", "viewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "isSubmitting", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;Z)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Rollover401kVerifyInfoViewState {
    public static final int $stable = 8;
    private final boolean isSubmitting;
    private final ApiRetirement401kRolloverUserInfoResponse viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public Rollover401kVerifyInfoViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Rollover401kVerifyInfoViewState copy$default(Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirement401kRolloverUserInfoResponse = rollover401kVerifyInfoViewState.viewModel;
        }
        if ((i & 2) != 0) {
            z = rollover401kVerifyInfoViewState.isSubmitting;
        }
        return rollover401kVerifyInfoViewState.copy(apiRetirement401kRolloverUserInfoResponse, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirement401kRolloverUserInfoResponse getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    public final Rollover401kVerifyInfoViewState copy(ApiRetirement401kRolloverUserInfoResponse viewModel, boolean isSubmitting) {
        return new Rollover401kVerifyInfoViewState(viewModel, isSubmitting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rollover401kVerifyInfoViewState)) {
            return false;
        }
        Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState = (Rollover401kVerifyInfoViewState) other;
        return Intrinsics.areEqual(this.viewModel, rollover401kVerifyInfoViewState.viewModel) && this.isSubmitting == rollover401kVerifyInfoViewState.isSubmitting;
    }

    public int hashCode() {
        ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse = this.viewModel;
        return ((apiRetirement401kRolloverUserInfoResponse == null ? 0 : apiRetirement401kRolloverUserInfoResponse.hashCode()) * 31) + Boolean.hashCode(this.isSubmitting);
    }

    public String toString() {
        return "Rollover401kVerifyInfoViewState(viewModel=" + this.viewModel + ", isSubmitting=" + this.isSubmitting + ")";
    }

    public Rollover401kVerifyInfoViewState(ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, boolean z) {
        this.viewModel = apiRetirement401kRolloverUserInfoResponse;
        this.isSubmitting = z;
    }

    public /* synthetic */ Rollover401kVerifyInfoViewState(ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRetirement401kRolloverUserInfoResponse, (i & 2) != 0 ? false : z);
    }

    public final ApiRetirement401kRolloverUserInfoResponse getViewModel() {
        return this.viewModel;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }
}
