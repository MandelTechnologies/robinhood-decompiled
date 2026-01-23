package com.robinhood.android.iav.p154ui;

import com.robinhood.android.iav.p154ui.PlaidLoadingViewState3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidLoadingViewState;", "", "status", "Lcom/robinhood/android/iav/ui/Status;", "<init>", "(Lcom/robinhood/android/iav/ui/Status;)V", "getStatus", "()Lcom/robinhood/android/iav/ui/Status;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PlaidLoadingViewState {
    public static final int $stable = 0;
    private final PlaidLoadingViewState3 status;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaidLoadingViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlaidLoadingViewState copy$default(PlaidLoadingViewState plaidLoadingViewState, PlaidLoadingViewState3 plaidLoadingViewState3, int i, Object obj) {
        if ((i & 1) != 0) {
            plaidLoadingViewState3 = plaidLoadingViewState.status;
        }
        return plaidLoadingViewState.copy(plaidLoadingViewState3);
    }

    /* renamed from: component1, reason: from getter */
    public final PlaidLoadingViewState3 getStatus() {
        return this.status;
    }

    public final PlaidLoadingViewState copy(PlaidLoadingViewState3 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new PlaidLoadingViewState(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaidLoadingViewState) && Intrinsics.areEqual(this.status, ((PlaidLoadingViewState) other).status);
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "PlaidLoadingViewState(status=" + this.status + ")";
    }

    public PlaidLoadingViewState(PlaidLoadingViewState3 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public /* synthetic */ PlaidLoadingViewState(PlaidLoadingViewState3 plaidLoadingViewState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PlaidLoadingViewState3.Loading.INSTANCE : plaidLoadingViewState3);
    }

    public final PlaidLoadingViewState3 getStatus() {
        return this.status;
    }
}
