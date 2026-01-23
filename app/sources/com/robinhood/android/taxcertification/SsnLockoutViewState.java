package com.robinhood.android.taxcertification;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SsnLockoutViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnLockoutViewState;", "", "loading", "", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/taxcertification/LockoutEvent;", "<init>", "(ZLcom/robinhood/udf/UiEvent;)V", "getLoading", "()Z", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SsnLockoutViewState {
    private final UiEvent<SsnLockoutViewState2> event;
    private final boolean loading;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SsnLockoutViewState copy$default(SsnLockoutViewState ssnLockoutViewState, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ssnLockoutViewState.loading;
        }
        if ((i & 2) != 0) {
            uiEvent = ssnLockoutViewState.event;
        }
        return ssnLockoutViewState.copy(z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final UiEvent<SsnLockoutViewState2> component2() {
        return this.event;
    }

    public final SsnLockoutViewState copy(boolean loading, UiEvent<SsnLockoutViewState2> event) {
        return new SsnLockoutViewState(loading, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SsnLockoutViewState)) {
            return false;
        }
        SsnLockoutViewState ssnLockoutViewState = (SsnLockoutViewState) other;
        return this.loading == ssnLockoutViewState.loading && Intrinsics.areEqual(this.event, ssnLockoutViewState.event);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        UiEvent<SsnLockoutViewState2> uiEvent = this.event;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "SsnLockoutViewState(loading=" + this.loading + ", event=" + this.event + ")";
    }

    public SsnLockoutViewState(boolean z, UiEvent<SsnLockoutViewState2> uiEvent) {
        this.loading = z;
        this.event = uiEvent;
    }

    public /* synthetic */ SsnLockoutViewState(boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : uiEvent);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final UiEvent<SsnLockoutViewState2> getEvent() {
        return this.event;
    }
}
