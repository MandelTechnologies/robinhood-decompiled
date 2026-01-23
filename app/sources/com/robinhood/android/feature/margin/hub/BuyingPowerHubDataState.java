package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDataState;", "", "buyingPowerHubResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "exception", "", "isInMcwRegionGate", "", "<init>", "(Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;Ljava/lang/Throwable;Ljava/lang/Boolean;)V", "getBuyingPowerHubResponse", "()Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "getException", "()Ljava/lang/Throwable;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;Ljava/lang/Throwable;Ljava/lang/Boolean;)Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BuyingPowerHubDataState {
    public static final int $stable = 8;
    private final BuyingPowerHubView buyingPowerHubResponse;
    private final Throwable exception;
    private final Boolean isInMcwRegionGate;

    public BuyingPowerHubDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BuyingPowerHubDataState copy$default(BuyingPowerHubDataState buyingPowerHubDataState, BuyingPowerHubView buyingPowerHubView, Throwable th, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            buyingPowerHubView = buyingPowerHubDataState.buyingPowerHubResponse;
        }
        if ((i & 2) != 0) {
            th = buyingPowerHubDataState.exception;
        }
        if ((i & 4) != 0) {
            bool = buyingPowerHubDataState.isInMcwRegionGate;
        }
        return buyingPowerHubDataState.copy(buyingPowerHubView, th, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final BuyingPowerHubView getBuyingPowerHubResponse() {
        return this.buyingPowerHubResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    public final BuyingPowerHubDataState copy(BuyingPowerHubView buyingPowerHubResponse, Throwable exception, Boolean isInMcwRegionGate) {
        return new BuyingPowerHubDataState(buyingPowerHubResponse, exception, isInMcwRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyingPowerHubDataState)) {
            return false;
        }
        BuyingPowerHubDataState buyingPowerHubDataState = (BuyingPowerHubDataState) other;
        return Intrinsics.areEqual(this.buyingPowerHubResponse, buyingPowerHubDataState.buyingPowerHubResponse) && Intrinsics.areEqual(this.exception, buyingPowerHubDataState.exception) && Intrinsics.areEqual(this.isInMcwRegionGate, buyingPowerHubDataState.isInMcwRegionGate);
    }

    public int hashCode() {
        BuyingPowerHubView buyingPowerHubView = this.buyingPowerHubResponse;
        int iHashCode = (buyingPowerHubView == null ? 0 : buyingPowerHubView.hashCode()) * 31;
        Throwable th = this.exception;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        Boolean bool = this.isInMcwRegionGate;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BuyingPowerHubDataState(buyingPowerHubResponse=" + this.buyingPowerHubResponse + ", exception=" + this.exception + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ")";
    }

    public BuyingPowerHubDataState(BuyingPowerHubView buyingPowerHubView, Throwable th, Boolean bool) {
        this.buyingPowerHubResponse = buyingPowerHubView;
        this.exception = th;
        this.isInMcwRegionGate = bool;
    }

    public /* synthetic */ BuyingPowerHubDataState(BuyingPowerHubView buyingPowerHubView, Throwable th, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : buyingPowerHubView, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : bool);
    }

    public final BuyingPowerHubView getBuyingPowerHubResponse() {
        return this.buyingPowerHubResponse;
    }

    public final Throwable getException() {
        return this.exception;
    }

    public final Boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }
}
