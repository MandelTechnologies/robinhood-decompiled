package com.robinhood.android.matcha.p177ui.reporting.submit;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportSubmitDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDataState;", "", "isRequestInFlight", "", "submitResult", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "", "<init>", "(ZLcom/robinhood/udf/UiEvent;)V", "()Z", "getSubmitResult", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ReportSubmitDataState {
    public static final int $stable = 8;
    private final boolean isRequestInFlight;
    private final UiEvent<Result<Unit>> submitResult;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportSubmitDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReportSubmitDataState copy$default(ReportSubmitDataState reportSubmitDataState, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reportSubmitDataState.isRequestInFlight;
        }
        if ((i & 2) != 0) {
            uiEvent = reportSubmitDataState.submitResult;
        }
        return reportSubmitDataState.copy(z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequestInFlight() {
        return this.isRequestInFlight;
    }

    public final UiEvent<Result<Unit>> component2() {
        return this.submitResult;
    }

    public final ReportSubmitDataState copy(boolean isRequestInFlight, UiEvent<Result<Unit>> submitResult) {
        return new ReportSubmitDataState(isRequestInFlight, submitResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportSubmitDataState)) {
            return false;
        }
        ReportSubmitDataState reportSubmitDataState = (ReportSubmitDataState) other;
        return this.isRequestInFlight == reportSubmitDataState.isRequestInFlight && Intrinsics.areEqual(this.submitResult, reportSubmitDataState.submitResult);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRequestInFlight) * 31;
        UiEvent<Result<Unit>> uiEvent = this.submitResult;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "ReportSubmitDataState(isRequestInFlight=" + this.isRequestInFlight + ", submitResult=" + this.submitResult + ")";
    }

    public ReportSubmitDataState(boolean z, UiEvent<Result<Unit>> uiEvent) {
        this.isRequestInFlight = z;
        this.submitResult = uiEvent;
    }

    public /* synthetic */ ReportSubmitDataState(boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent);
    }

    public final boolean isRequestInFlight() {
        return this.isRequestInFlight;
    }

    public final UiEvent<Result<Unit>> getSubmitResult() {
        return this.submitResult;
    }
}
