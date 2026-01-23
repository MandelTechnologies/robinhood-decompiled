package com.robinhood.android.acats.plaid.transfer.unsupported;

import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPlaidUnsupportedAssetsDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDataState;", "", "isOptionsInvestingEnabled", "", "isMarginInvestingEnabled", "plaidBrokerAssets", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "<init>", "(ZZLcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;)V", "()Z", "getPlaidBrokerAssets", "()Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPlaidUnsupportedAssetsDataState {
    public static final int $stable = 8;
    private final boolean isMarginInvestingEnabled;
    private final boolean isOptionsInvestingEnabled;
    private final PlaidBrokerAssets plaidBrokerAssets;

    public static /* synthetic */ AcatsInPlaidUnsupportedAssetsDataState copy$default(AcatsInPlaidUnsupportedAssetsDataState acatsInPlaidUnsupportedAssetsDataState, boolean z, boolean z2, PlaidBrokerAssets plaidBrokerAssets, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInPlaidUnsupportedAssetsDataState.isOptionsInvestingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = acatsInPlaidUnsupportedAssetsDataState.isMarginInvestingEnabled;
        }
        if ((i & 4) != 0) {
            plaidBrokerAssets = acatsInPlaidUnsupportedAssetsDataState.plaidBrokerAssets;
        }
        return acatsInPlaidUnsupportedAssetsDataState.copy(z, z2, plaidBrokerAssets);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOptionsInvestingEnabled() {
        return this.isOptionsInvestingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final PlaidBrokerAssets getPlaidBrokerAssets() {
        return this.plaidBrokerAssets;
    }

    public final AcatsInPlaidUnsupportedAssetsDataState copy(boolean isOptionsInvestingEnabled, boolean isMarginInvestingEnabled, PlaidBrokerAssets plaidBrokerAssets) {
        return new AcatsInPlaidUnsupportedAssetsDataState(isOptionsInvestingEnabled, isMarginInvestingEnabled, plaidBrokerAssets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPlaidUnsupportedAssetsDataState)) {
            return false;
        }
        AcatsInPlaidUnsupportedAssetsDataState acatsInPlaidUnsupportedAssetsDataState = (AcatsInPlaidUnsupportedAssetsDataState) other;
        return this.isOptionsInvestingEnabled == acatsInPlaidUnsupportedAssetsDataState.isOptionsInvestingEnabled && this.isMarginInvestingEnabled == acatsInPlaidUnsupportedAssetsDataState.isMarginInvestingEnabled && Intrinsics.areEqual(this.plaidBrokerAssets, acatsInPlaidUnsupportedAssetsDataState.plaidBrokerAssets);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isOptionsInvestingEnabled) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31;
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        return iHashCode + (plaidBrokerAssets == null ? 0 : plaidBrokerAssets.hashCode());
    }

    public String toString() {
        return "AcatsInPlaidUnsupportedAssetsDataState(isOptionsInvestingEnabled=" + this.isOptionsInvestingEnabled + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", plaidBrokerAssets=" + this.plaidBrokerAssets + ")";
    }

    public AcatsInPlaidUnsupportedAssetsDataState(boolean z, boolean z2, PlaidBrokerAssets plaidBrokerAssets) {
        this.isOptionsInvestingEnabled = z;
        this.isMarginInvestingEnabled = z2;
        this.plaidBrokerAssets = plaidBrokerAssets;
    }

    public /* synthetic */ AcatsInPlaidUnsupportedAssetsDataState(boolean z, boolean z2, PlaidBrokerAssets plaidBrokerAssets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : plaidBrokerAssets);
    }

    public final boolean isOptionsInvestingEnabled() {
        return this.isOptionsInvestingEnabled;
    }

    public final boolean isMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    public final PlaidBrokerAssets getPlaidBrokerAssets() {
        return this.plaidBrokerAssets;
    }
}
