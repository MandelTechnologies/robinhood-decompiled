package com.robinhood.android.matcha.p177ui.reporting.submit;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportSubmitViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitViewState;", "", "showLoading", "", "submitResult", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "", "<init>", "(ZLcom/robinhood/udf/UiEvent;)V", "getShowLoading", "()Z", "getSubmitResult", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ReportSubmitViewState {
    public static final int $stable = 8;
    private final boolean showLoading;
    private final UiEvent<Result<Unit>> submitResult;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReportSubmitViewState copy$default(ReportSubmitViewState reportSubmitViewState, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reportSubmitViewState.showLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = reportSubmitViewState.submitResult;
        }
        return reportSubmitViewState.copy(z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UiEvent<Result<Unit>> component2() {
        return this.submitResult;
    }

    public final ReportSubmitViewState copy(boolean showLoading, UiEvent<Result<Unit>> submitResult) {
        return new ReportSubmitViewState(showLoading, submitResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportSubmitViewState)) {
            return false;
        }
        ReportSubmitViewState reportSubmitViewState = (ReportSubmitViewState) other;
        return this.showLoading == reportSubmitViewState.showLoading && Intrinsics.areEqual(this.submitResult, reportSubmitViewState.submitResult);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showLoading) * 31;
        UiEvent<Result<Unit>> uiEvent = this.submitResult;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "ReportSubmitViewState(showLoading=" + this.showLoading + ", submitResult=" + this.submitResult + ")";
    }

    public ReportSubmitViewState(boolean z, UiEvent<Result<Unit>> uiEvent) {
        this.showLoading = z;
        this.submitResult = uiEvent;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UiEvent<Result<Unit>> getSubmitResult() {
        return this.submitResult;
    }
}
