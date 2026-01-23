package com.robinhood.android.advanced.alert;

import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertBottomSheetViewState;", "", "advancedAlert", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "isLoading", "", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;Lcom/robinhood/udf/UiEvent;Z)V", "getAdvancedAlert", "()Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AdvancedAlertBottomSheetViewState {
    public static final int $stable = 8;
    private final AdvancedAlert advancedAlert;
    private final UiEvent<Unit> errorEvent;
    private final boolean isLoading;

    public AdvancedAlertBottomSheetViewState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedAlertBottomSheetViewState copy$default(AdvancedAlertBottomSheetViewState advancedAlertBottomSheetViewState, AdvancedAlert advancedAlert, UiEvent uiEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedAlert = advancedAlertBottomSheetViewState.advancedAlert;
        }
        if ((i & 2) != 0) {
            uiEvent = advancedAlertBottomSheetViewState.errorEvent;
        }
        if ((i & 4) != 0) {
            z = advancedAlertBottomSheetViewState.isLoading;
        }
        return advancedAlertBottomSheetViewState.copy(advancedAlert, uiEvent, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    public final UiEvent<Unit> component2() {
        return this.errorEvent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final AdvancedAlertBottomSheetViewState copy(AdvancedAlert advancedAlert, UiEvent<Unit> errorEvent, boolean isLoading) {
        return new AdvancedAlertBottomSheetViewState(advancedAlert, errorEvent, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAlertBottomSheetViewState)) {
            return false;
        }
        AdvancedAlertBottomSheetViewState advancedAlertBottomSheetViewState = (AdvancedAlertBottomSheetViewState) other;
        return Intrinsics.areEqual(this.advancedAlert, advancedAlertBottomSheetViewState.advancedAlert) && Intrinsics.areEqual(this.errorEvent, advancedAlertBottomSheetViewState.errorEvent) && this.isLoading == advancedAlertBottomSheetViewState.isLoading;
    }

    public int hashCode() {
        AdvancedAlert advancedAlert = this.advancedAlert;
        int iHashCode = (advancedAlert == null ? 0 : advancedAlert.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.errorEvent;
        return ((iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "AdvancedAlertBottomSheetViewState(advancedAlert=" + this.advancedAlert + ", errorEvent=" + this.errorEvent + ", isLoading=" + this.isLoading + ")";
    }

    public AdvancedAlertBottomSheetViewState(AdvancedAlert advancedAlert, UiEvent<Unit> uiEvent, boolean z) {
        this.advancedAlert = advancedAlert;
        this.errorEvent = uiEvent;
        this.isLoading = z;
    }

    public /* synthetic */ AdvancedAlertBottomSheetViewState(AdvancedAlert advancedAlert, UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advancedAlert, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? false : z);
    }

    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    public final UiEvent<Unit> getErrorEvent() {
        return this.errorEvent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
