package com.robinhood.android.waitlist.spot;

import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpot;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitlistSpotViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotViewState;", "", "spot", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "justJoined", "", "isLoading", "", "error", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLjava/lang/Throwable;)V", "getSpot", "()Lcom/robinhood/udf/UiEvent;", "getJustJoined", "()Z", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WaitlistSpotViewState {
    public static final int $stable = 8;
    private final Throwable error;
    private final boolean isLoading;
    private final UiEvent<Unit> justJoined;
    private final UiEvent<WaitlistSpot> spot;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WaitlistSpotViewState copy$default(WaitlistSpotViewState waitlistSpotViewState, UiEvent uiEvent, UiEvent uiEvent2, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = waitlistSpotViewState.spot;
        }
        if ((i & 2) != 0) {
            uiEvent2 = waitlistSpotViewState.justJoined;
        }
        if ((i & 4) != 0) {
            z = waitlistSpotViewState.isLoading;
        }
        if ((i & 8) != 0) {
            th = waitlistSpotViewState.error;
        }
        return waitlistSpotViewState.copy(uiEvent, uiEvent2, z, th);
    }

    public final UiEvent<WaitlistSpot> component1() {
        return this.spot;
    }

    public final UiEvent<Unit> component2() {
        return this.justJoined;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final WaitlistSpotViewState copy(UiEvent<WaitlistSpot> spot, UiEvent<Unit> justJoined, boolean isLoading, Throwable error) {
        Intrinsics.checkNotNullParameter(spot, "spot");
        return new WaitlistSpotViewState(spot, justJoined, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitlistSpotViewState)) {
            return false;
        }
        WaitlistSpotViewState waitlistSpotViewState = (WaitlistSpotViewState) other;
        return Intrinsics.areEqual(this.spot, waitlistSpotViewState.spot) && Intrinsics.areEqual(this.justJoined, waitlistSpotViewState.justJoined) && this.isLoading == waitlistSpotViewState.isLoading && Intrinsics.areEqual(this.error, waitlistSpotViewState.error);
    }

    public int hashCode() {
        int iHashCode = this.spot.hashCode() * 31;
        UiEvent<Unit> uiEvent = this.justJoined;
        int iHashCode2 = (((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "WaitlistSpotViewState(spot=" + this.spot + ", justJoined=" + this.justJoined + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public WaitlistSpotViewState(UiEvent<WaitlistSpot> spot, UiEvent<Unit> uiEvent, boolean z, Throwable th) {
        Intrinsics.checkNotNullParameter(spot, "spot");
        this.spot = spot;
        this.justJoined = uiEvent;
        this.isLoading = z;
        this.error = th;
    }

    public /* synthetic */ WaitlistSpotViewState(UiEvent uiEvent, UiEvent uiEvent2, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiEvent, (i & 2) != 0 ? null : uiEvent2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th);
    }

    public final UiEvent<WaitlistSpot> getSpot() {
        return this.spot;
    }

    public final UiEvent<Unit> getJustJoined() {
        return this.justJoined;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Throwable getError() {
        return this.error;
    }
}
