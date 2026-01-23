package com.robinhood.android.acats.plaid.transfer.partial;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003JS\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "", "cashAssets", "", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "equityAssets", "optionsAssets", "sortData", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortData;", "unsupportedCount", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getCashAssets", "()Ljava/util/List;", "getEquityAssets", "getOptionsAssets", "getSortData", "getUnsupportedCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferUiState {
    public static final int $stable = 0;
    private final List<AcatsPlaidPartialTransferAssetRowData> cashAssets;
    private final List<AcatsPlaidPartialTransferAssetRowData> equityAssets;
    private final List<AcatsPlaidPartialTransferAssetRowData> optionsAssets;
    private final List<AcatsPlaidPartialTransferSortData> sortData;
    private final int unsupportedCount;

    public static /* synthetic */ AcatsPlaidPartialTransferUiState copy$default(AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState, List list, List list2, List list3, List list4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = acatsPlaidPartialTransferUiState.cashAssets;
        }
        if ((i2 & 2) != 0) {
            list2 = acatsPlaidPartialTransferUiState.equityAssets;
        }
        if ((i2 & 4) != 0) {
            list3 = acatsPlaidPartialTransferUiState.optionsAssets;
        }
        if ((i2 & 8) != 0) {
            list4 = acatsPlaidPartialTransferUiState.sortData;
        }
        if ((i2 & 16) != 0) {
            i = acatsPlaidPartialTransferUiState.unsupportedCount;
        }
        int i3 = i;
        List list5 = list3;
        return acatsPlaidPartialTransferUiState.copy(list, list2, list5, list4, i3);
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> component1() {
        return this.cashAssets;
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> component2() {
        return this.equityAssets;
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> component3() {
        return this.optionsAssets;
    }

    public final List<AcatsPlaidPartialTransferSortData> component4() {
        return this.sortData;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUnsupportedCount() {
        return this.unsupportedCount;
    }

    public final AcatsPlaidPartialTransferUiState copy(List<AcatsPlaidPartialTransferAssetRowData> cashAssets, List<AcatsPlaidPartialTransferAssetRowData> equityAssets, List<AcatsPlaidPartialTransferAssetRowData> optionsAssets, List<AcatsPlaidPartialTransferSortData> sortData, int unsupportedCount) {
        Intrinsics.checkNotNullParameter(cashAssets, "cashAssets");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionsAssets, "optionsAssets");
        Intrinsics.checkNotNullParameter(sortData, "sortData");
        return new AcatsPlaidPartialTransferUiState(cashAssets, equityAssets, optionsAssets, sortData, unsupportedCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferUiState)) {
            return false;
        }
        AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState = (AcatsPlaidPartialTransferUiState) other;
        return Intrinsics.areEqual(this.cashAssets, acatsPlaidPartialTransferUiState.cashAssets) && Intrinsics.areEqual(this.equityAssets, acatsPlaidPartialTransferUiState.equityAssets) && Intrinsics.areEqual(this.optionsAssets, acatsPlaidPartialTransferUiState.optionsAssets) && Intrinsics.areEqual(this.sortData, acatsPlaidPartialTransferUiState.sortData) && this.unsupportedCount == acatsPlaidPartialTransferUiState.unsupportedCount;
    }

    public int hashCode() {
        return (((((((this.cashAssets.hashCode() * 31) + this.equityAssets.hashCode()) * 31) + this.optionsAssets.hashCode()) * 31) + this.sortData.hashCode()) * 31) + Integer.hashCode(this.unsupportedCount);
    }

    public String toString() {
        return "AcatsPlaidPartialTransferUiState(cashAssets=" + this.cashAssets + ", equityAssets=" + this.equityAssets + ", optionsAssets=" + this.optionsAssets + ", sortData=" + this.sortData + ", unsupportedCount=" + this.unsupportedCount + ")";
    }

    public AcatsPlaidPartialTransferUiState(List<AcatsPlaidPartialTransferAssetRowData> cashAssets, List<AcatsPlaidPartialTransferAssetRowData> equityAssets, List<AcatsPlaidPartialTransferAssetRowData> optionsAssets, List<AcatsPlaidPartialTransferSortData> sortData, int i) {
        Intrinsics.checkNotNullParameter(cashAssets, "cashAssets");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionsAssets, "optionsAssets");
        Intrinsics.checkNotNullParameter(sortData, "sortData");
        this.cashAssets = cashAssets;
        this.equityAssets = equityAssets;
        this.optionsAssets = optionsAssets;
        this.sortData = sortData;
        this.unsupportedCount = i;
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> getCashAssets() {
        return this.cashAssets;
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> getEquityAssets() {
        return this.equityAssets;
    }

    public final List<AcatsPlaidPartialTransferAssetRowData> getOptionsAssets() {
        return this.optionsAssets;
    }

    public final List<AcatsPlaidPartialTransferSortData> getSortData() {
        return this.sortData;
    }

    public final int getUnsupportedCount() {
        return this.unsupportedCount;
    }
}
