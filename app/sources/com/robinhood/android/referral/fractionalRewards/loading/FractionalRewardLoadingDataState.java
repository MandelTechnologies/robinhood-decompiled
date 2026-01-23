package com.robinhood.android.referral.fractionalRewards.loading;

import com.robinhood.models.p355ui.FractionalRewardInfo;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardLoadingViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDataState;", "", "error", "Lcom/robinhood/udf/UiEvent;", "", "response", "Lcom/robinhood/models/ui/FractionalRewardInfo;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/ui/FractionalRewardInfo;)V", "getError", "()Lcom/robinhood/udf/UiEvent;", "getResponse", "()Lcom/robinhood/models/ui/FractionalRewardInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FractionalRewardLoadingDataState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final FractionalRewardInfo response;

    /* JADX WARN: Multi-variable type inference failed */
    public FractionalRewardLoadingDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionalRewardLoadingDataState copy$default(FractionalRewardLoadingDataState fractionalRewardLoadingDataState, UiEvent uiEvent, FractionalRewardInfo fractionalRewardInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = fractionalRewardLoadingDataState.error;
        }
        if ((i & 2) != 0) {
            fractionalRewardInfo = fractionalRewardLoadingDataState.response;
        }
        return fractionalRewardLoadingDataState.copy(uiEvent, fractionalRewardInfo);
    }

    public final UiEvent<Throwable> component1() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final FractionalRewardInfo getResponse() {
        return this.response;
    }

    public final FractionalRewardLoadingDataState copy(UiEvent<Throwable> error, FractionalRewardInfo response) {
        return new FractionalRewardLoadingDataState(error, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionalRewardLoadingDataState)) {
            return false;
        }
        FractionalRewardLoadingDataState fractionalRewardLoadingDataState = (FractionalRewardLoadingDataState) other;
        return Intrinsics.areEqual(this.error, fractionalRewardLoadingDataState.error) && Intrinsics.areEqual(this.response, fractionalRewardLoadingDataState.response);
    }

    public int hashCode() {
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        FractionalRewardInfo fractionalRewardInfo = this.response;
        return iHashCode + (fractionalRewardInfo != null ? fractionalRewardInfo.hashCode() : 0);
    }

    public String toString() {
        return "FractionalRewardLoadingDataState(error=" + this.error + ", response=" + this.response + ")";
    }

    public FractionalRewardLoadingDataState(UiEvent<Throwable> uiEvent, FractionalRewardInfo fractionalRewardInfo) {
        this.error = uiEvent;
        this.response = fractionalRewardInfo;
    }

    public /* synthetic */ FractionalRewardLoadingDataState(UiEvent uiEvent, FractionalRewardInfo fractionalRewardInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : fractionalRewardInfo);
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final FractionalRewardInfo getResponse() {
        return this.response;
    }
}
