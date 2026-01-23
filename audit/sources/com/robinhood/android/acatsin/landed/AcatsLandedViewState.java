package com.robinhood.android.acatsin.landed;

import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsLandedViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedViewState;", "", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "transitionToLoadedScreen", "Lcom/robinhood/udf/UiEvent;", "networkError", "", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getTransitionToLoadedScreen", "()Lcom/robinhood/udf/UiEvent;", "getNetworkError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsLandedViewState {
    public static final int $stable = 8;
    private final AcatsTransfer acatsTransfer;
    private final UiEvent<Throwable> networkError;
    private final UiEvent<AcatsTransfer> transitionToLoadedScreen;

    public AcatsLandedViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsLandedViewState copy$default(AcatsLandedViewState acatsLandedViewState, AcatsTransfer acatsTransfer, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsTransfer = acatsLandedViewState.acatsTransfer;
        }
        if ((i & 2) != 0) {
            uiEvent = acatsLandedViewState.transitionToLoadedScreen;
        }
        if ((i & 4) != 0) {
            uiEvent2 = acatsLandedViewState.networkError;
        }
        return acatsLandedViewState.copy(acatsTransfer, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final UiEvent<AcatsTransfer> component2() {
        return this.transitionToLoadedScreen;
    }

    public final UiEvent<Throwable> component3() {
        return this.networkError;
    }

    public final AcatsLandedViewState copy(AcatsTransfer acatsTransfer, UiEvent<AcatsTransfer> transitionToLoadedScreen, UiEvent<Throwable> networkError) {
        return new AcatsLandedViewState(acatsTransfer, transitionToLoadedScreen, networkError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsLandedViewState)) {
            return false;
        }
        AcatsLandedViewState acatsLandedViewState = (AcatsLandedViewState) other;
        return Intrinsics.areEqual(this.acatsTransfer, acatsLandedViewState.acatsTransfer) && Intrinsics.areEqual(this.transitionToLoadedScreen, acatsLandedViewState.transitionToLoadedScreen) && Intrinsics.areEqual(this.networkError, acatsLandedViewState.networkError);
    }

    public int hashCode() {
        AcatsTransfer acatsTransfer = this.acatsTransfer;
        int iHashCode = (acatsTransfer == null ? 0 : acatsTransfer.hashCode()) * 31;
        UiEvent<AcatsTransfer> uiEvent = this.transitionToLoadedScreen;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.networkError;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "AcatsLandedViewState(acatsTransfer=" + this.acatsTransfer + ", transitionToLoadedScreen=" + this.transitionToLoadedScreen + ", networkError=" + this.networkError + ")";
    }

    public AcatsLandedViewState(AcatsTransfer acatsTransfer, UiEvent<AcatsTransfer> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.acatsTransfer = acatsTransfer;
        this.transitionToLoadedScreen = uiEvent;
        this.networkError = uiEvent2;
    }

    public /* synthetic */ AcatsLandedViewState(AcatsTransfer acatsTransfer, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsTransfer, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2);
    }

    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final UiEvent<AcatsTransfer> getTransitionToLoadedScreen() {
        return this.transitionToLoadedScreen;
    }

    public final UiEvent<Throwable> getNetworkError() {
        return this.networkError;
    }
}
