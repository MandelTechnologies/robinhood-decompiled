package com.robinhood.android.indexes.detail;

import com.robinhood.compose.bento.theme.BentoTheme4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageStates.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageViewState;", "", "pageDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "tradeBarHeight", "", "pnlUpdatesEnabled", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "symbol", "<init>", "(Lcom/robinhood/compose/bento/theme/Direction;IZLjava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getPageDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getTradeBarHeight", "()I", "getPnlUpdatesEnabled", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID instrumentId;
    private final BentoTheme4 pageDirection;
    private final boolean pnlUpdatesEnabled;
    private final String symbol;
    private final int tradeBarHeight;

    public static /* synthetic */ IndexDetailPageViewState copy$default(IndexDetailPageViewState indexDetailPageViewState, BentoTheme4 bentoTheme4, int i, boolean z, String str, UUID uuid, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bentoTheme4 = indexDetailPageViewState.pageDirection;
        }
        if ((i2 & 2) != 0) {
            i = indexDetailPageViewState.tradeBarHeight;
        }
        if ((i2 & 4) != 0) {
            z = indexDetailPageViewState.pnlUpdatesEnabled;
        }
        if ((i2 & 8) != 0) {
            str = indexDetailPageViewState.accountNumber;
        }
        if ((i2 & 16) != 0) {
            uuid = indexDetailPageViewState.instrumentId;
        }
        if ((i2 & 32) != 0) {
            str2 = indexDetailPageViewState.symbol;
        }
        UUID uuid2 = uuid;
        String str3 = str2;
        return indexDetailPageViewState.copy(bentoTheme4, i, z, str, uuid2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoTheme4 getPageDirection() {
        return this.pageDirection;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTradeBarHeight() {
        return this.tradeBarHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final IndexDetailPageViewState copy(BentoTheme4 pageDirection, int tradeBarHeight, boolean pnlUpdatesEnabled, String accountNumber, UUID instrumentId, String symbol) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        return new IndexDetailPageViewState(pageDirection, tradeBarHeight, pnlUpdatesEnabled, accountNumber, instrumentId, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageViewState)) {
            return false;
        }
        IndexDetailPageViewState indexDetailPageViewState = (IndexDetailPageViewState) other;
        return this.pageDirection == indexDetailPageViewState.pageDirection && this.tradeBarHeight == indexDetailPageViewState.tradeBarHeight && this.pnlUpdatesEnabled == indexDetailPageViewState.pnlUpdatesEnabled && Intrinsics.areEqual(this.accountNumber, indexDetailPageViewState.accountNumber) && Intrinsics.areEqual(this.instrumentId, indexDetailPageViewState.instrumentId) && Intrinsics.areEqual(this.symbol, indexDetailPageViewState.symbol);
    }

    public int hashCode() {
        int iHashCode = ((((this.pageDirection.hashCode() * 31) + Integer.hashCode(this.tradeBarHeight)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.instrumentId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str2 = this.symbol;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IndexDetailPageViewState(pageDirection=" + this.pageDirection + ", tradeBarHeight=" + this.tradeBarHeight + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ")";
    }

    public IndexDetailPageViewState(BentoTheme4 pageDirection, int i, boolean z, String str, UUID uuid, String str2) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        this.pageDirection = pageDirection;
        this.tradeBarHeight = i;
        this.pnlUpdatesEnabled = z;
        this.accountNumber = str;
        this.instrumentId = uuid;
        this.symbol = str2;
    }

    public final BentoTheme4 getPageDirection() {
        return this.pageDirection;
    }

    public final int getTradeBarHeight() {
        return this.tradeBarHeight;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSymbol() {
        return this.symbol;
    }
}
