package com.robinhood.android.margin.upgrade.rates;

import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeRatesDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;", "", "isLoading", "", "marginTieredRates", "Lcom/robinhood/android/lib/margin/db/models/MarginTieredRates;", "<init>", "(ZLcom/robinhood/android/lib/margin/db/models/MarginTieredRates;)V", "()Z", "getMarginTieredRates", "()Lcom/robinhood/android/lib/margin/db/models/MarginTieredRates;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeRatesViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final MarginTieredRates marginTieredRates;

    /* JADX WARN: Multi-variable type inference failed */
    public MarginUpgradeRatesViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarginUpgradeRatesViewState copy$default(MarginUpgradeRatesViewState marginUpgradeRatesViewState, boolean z, MarginTieredRates marginTieredRates, int i, Object obj) {
        if ((i & 1) != 0) {
            z = marginUpgradeRatesViewState.isLoading;
        }
        if ((i & 2) != 0) {
            marginTieredRates = marginUpgradeRatesViewState.marginTieredRates;
        }
        return marginUpgradeRatesViewState.copy(z, marginTieredRates);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginTieredRates getMarginTieredRates() {
        return this.marginTieredRates;
    }

    public final MarginUpgradeRatesViewState copy(boolean isLoading, MarginTieredRates marginTieredRates) {
        return new MarginUpgradeRatesViewState(isLoading, marginTieredRates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeRatesViewState)) {
            return false;
        }
        MarginUpgradeRatesViewState marginUpgradeRatesViewState = (MarginUpgradeRatesViewState) other;
        return this.isLoading == marginUpgradeRatesViewState.isLoading && Intrinsics.areEqual(this.marginTieredRates, marginUpgradeRatesViewState.marginTieredRates);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        MarginTieredRates marginTieredRates = this.marginTieredRates;
        return iHashCode + (marginTieredRates == null ? 0 : marginTieredRates.hashCode());
    }

    public String toString() {
        return "MarginUpgradeRatesViewState(isLoading=" + this.isLoading + ", marginTieredRates=" + this.marginTieredRates + ")";
    }

    public MarginUpgradeRatesViewState(boolean z, MarginTieredRates marginTieredRates) {
        this.isLoading = z;
        this.marginTieredRates = marginTieredRates;
    }

    public /* synthetic */ MarginUpgradeRatesViewState(boolean z, MarginTieredRates marginTieredRates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : marginTieredRates);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final MarginTieredRates getMarginTieredRates() {
        return this.marginTieredRates;
    }
}
