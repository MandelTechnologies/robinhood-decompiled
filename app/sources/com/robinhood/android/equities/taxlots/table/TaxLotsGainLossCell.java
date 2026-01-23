package com.robinhood.android.equities.taxlots.table;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsGainLossCell.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0016HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsGainLossCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "lotId", "isSelectable", "", "maxGainAndLoss", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;ZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getLotId", "()Z", "getMaxGainAndLoss", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsGainLossCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID instrumentId;
    private final boolean isSelectable;
    private final String lotId;
    private final String maxGainAndLoss;
    private final UUID orderId;
    private final int relativeWidth;

    public static /* synthetic */ TaxLotsGainLossCell copy$default(TaxLotsGainLossCell taxLotsGainLossCell, String str, UUID uuid, UUID uuid2, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsGainLossCell.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = taxLotsGainLossCell.orderId;
        }
        if ((i & 4) != 0) {
            uuid2 = taxLotsGainLossCell.instrumentId;
        }
        if ((i & 8) != 0) {
            str2 = taxLotsGainLossCell.lotId;
        }
        if ((i & 16) != 0) {
            z = taxLotsGainLossCell.isSelectable;
        }
        if ((i & 32) != 0) {
            str3 = taxLotsGainLossCell.maxGainAndLoss;
        }
        boolean z2 = z;
        String str4 = str3;
        return taxLotsGainLossCell.copy(str, uuid, uuid2, str2, z2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLotId() {
        return this.lotId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    public final TaxLotsGainLossCell copy(String accountNumber, UUID orderId, UUID instrumentId, String lotId, boolean isSelectable, String maxGainAndLoss) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        return new TaxLotsGainLossCell(accountNumber, orderId, instrumentId, lotId, isSelectable, maxGainAndLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsGainLossCell)) {
            return false;
        }
        TaxLotsGainLossCell taxLotsGainLossCell = (TaxLotsGainLossCell) other;
        return Intrinsics.areEqual(this.accountNumber, taxLotsGainLossCell.accountNumber) && Intrinsics.areEqual(this.orderId, taxLotsGainLossCell.orderId) && Intrinsics.areEqual(this.instrumentId, taxLotsGainLossCell.instrumentId) && Intrinsics.areEqual(this.lotId, taxLotsGainLossCell.lotId) && this.isSelectable == taxLotsGainLossCell.isSelectable && Intrinsics.areEqual(this.maxGainAndLoss, taxLotsGainLossCell.maxGainAndLoss);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.accountNumber.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.lotId.hashCode()) * 31) + Boolean.hashCode(this.isSelectable)) * 31;
        String str = this.maxGainAndLoss;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TaxLotsGainLossCell(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", lotId=" + this.lotId + ", isSelectable=" + this.isSelectable + ", maxGainAndLoss=" + this.maxGainAndLoss + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getLotId() {
        return this.lotId;
    }

    public final boolean isSelectable() {
        return this.isSelectable;
    }

    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    public TaxLotsGainLossCell(String accountNumber, UUID orderId, UUID instrumentId, String lotId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        this.accountNumber = accountNumber;
        this.orderId = orderId;
        this.instrumentId = instrumentId;
        this.lotId = lotId;
        this.isSelectable = z;
        this.maxGainAndLoss = str;
        this.relativeWidth = str != null ? str.length() : 11;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
