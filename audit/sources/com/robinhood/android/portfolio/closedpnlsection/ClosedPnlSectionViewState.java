package com.robinhood.android.portfolio.closedpnlsection;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ClosedPnlSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;", "", "closedPnl", "Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "supportedAssetTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "isStale", "", "isVisible", "<init>", "(Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;Lkotlinx/collections/immutable/ImmutableList;ZZ)V", "getClosedPnl", "()Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "getSupportedAssetTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-closed-pnl-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ClosedPnlSectionViewState {
    public static final int $stable = 8;
    private final InstrumentProfitAndLossRealized closedPnl;
    private final boolean isStale;
    private final boolean isVisible;
    private final ImmutableList<AssetClass> supportedAssetTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClosedPnlSectionViewState copy$default(ClosedPnlSectionViewState closedPnlSectionViewState, InstrumentProfitAndLossRealized instrumentProfitAndLossRealized, ImmutableList immutableList, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentProfitAndLossRealized = closedPnlSectionViewState.closedPnl;
        }
        if ((i & 2) != 0) {
            immutableList = closedPnlSectionViewState.supportedAssetTypes;
        }
        if ((i & 4) != 0) {
            z = closedPnlSectionViewState.isStale;
        }
        if ((i & 8) != 0) {
            z2 = closedPnlSectionViewState.isVisible;
        }
        return closedPnlSectionViewState.copy(instrumentProfitAndLossRealized, immutableList, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentProfitAndLossRealized getClosedPnl() {
        return this.closedPnl;
    }

    public final ImmutableList<AssetClass> component2() {
        return this.supportedAssetTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsStale() {
        return this.isStale;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final ClosedPnlSectionViewState copy(InstrumentProfitAndLossRealized closedPnl, ImmutableList<? extends AssetClass> supportedAssetTypes, boolean isStale, boolean isVisible) {
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        return new ClosedPnlSectionViewState(closedPnl, supportedAssetTypes, isStale, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosedPnlSectionViewState)) {
            return false;
        }
        ClosedPnlSectionViewState closedPnlSectionViewState = (ClosedPnlSectionViewState) other;
        return Intrinsics.areEqual(this.closedPnl, closedPnlSectionViewState.closedPnl) && Intrinsics.areEqual(this.supportedAssetTypes, closedPnlSectionViewState.supportedAssetTypes) && this.isStale == closedPnlSectionViewState.isStale && this.isVisible == closedPnlSectionViewState.isVisible;
    }

    public int hashCode() {
        InstrumentProfitAndLossRealized instrumentProfitAndLossRealized = this.closedPnl;
        return ((((((instrumentProfitAndLossRealized == null ? 0 : instrumentProfitAndLossRealized.hashCode()) * 31) + this.supportedAssetTypes.hashCode()) * 31) + Boolean.hashCode(this.isStale)) * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "ClosedPnlSectionViewState(closedPnl=" + this.closedPnl + ", supportedAssetTypes=" + this.supportedAssetTypes + ", isStale=" + this.isStale + ", isVisible=" + this.isVisible + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClosedPnlSectionViewState(InstrumentProfitAndLossRealized instrumentProfitAndLossRealized, ImmutableList<? extends AssetClass> supportedAssetTypes, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        this.closedPnl = instrumentProfitAndLossRealized;
        this.supportedAssetTypes = supportedAssetTypes;
        this.isStale = z;
        this.isVisible = z2;
    }

    public final InstrumentProfitAndLossRealized getClosedPnl() {
        return this.closedPnl;
    }

    public final ImmutableList<AssetClass> getSupportedAssetTypes() {
        return this.supportedAssetTypes;
    }

    public final boolean isStale() {
        return this.isStale;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
