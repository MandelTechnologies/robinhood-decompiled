package com.robinhood.android.indexes.detail;

import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageStates.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;", "", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "tradeBarHeight", "", "pnlUpdatesEnabled", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "symbol", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;IZLjava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getPageDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getTradeBarHeight", "()I", "getPnlUpdatesEnabled", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID instrumentId;
    private final Direction pageDirection;
    private final boolean pnlUpdatesEnabled;
    private final String symbol;
    private final int tradeBarHeight;

    public IndexDetailPageDataState() {
        this(null, 0, false, null, null, null, 63, null);
    }

    public static /* synthetic */ IndexDetailPageDataState copy$default(IndexDetailPageDataState indexDetailPageDataState, Direction direction, int i, boolean z, String str, UUID uuid, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            direction = indexDetailPageDataState.pageDirection;
        }
        if ((i2 & 2) != 0) {
            i = indexDetailPageDataState.tradeBarHeight;
        }
        if ((i2 & 4) != 0) {
            z = indexDetailPageDataState.pnlUpdatesEnabled;
        }
        if ((i2 & 8) != 0) {
            str = indexDetailPageDataState.accountNumber;
        }
        if ((i2 & 16) != 0) {
            uuid = indexDetailPageDataState.instrumentId;
        }
        if ((i2 & 32) != 0) {
            str2 = indexDetailPageDataState.symbol;
        }
        UUID uuid2 = uuid;
        String str3 = str2;
        return indexDetailPageDataState.copy(direction, i, z, str, uuid2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Direction getPageDirection() {
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

    public final IndexDetailPageDataState copy(Direction pageDirection, int tradeBarHeight, boolean pnlUpdatesEnabled, String accountNumber, UUID instrumentId, String symbol) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        return new IndexDetailPageDataState(pageDirection, tradeBarHeight, pnlUpdatesEnabled, accountNumber, instrumentId, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageDataState)) {
            return false;
        }
        IndexDetailPageDataState indexDetailPageDataState = (IndexDetailPageDataState) other;
        return this.pageDirection == indexDetailPageDataState.pageDirection && this.tradeBarHeight == indexDetailPageDataState.tradeBarHeight && this.pnlUpdatesEnabled == indexDetailPageDataState.pnlUpdatesEnabled && Intrinsics.areEqual(this.accountNumber, indexDetailPageDataState.accountNumber) && Intrinsics.areEqual(this.instrumentId, indexDetailPageDataState.instrumentId) && Intrinsics.areEqual(this.symbol, indexDetailPageDataState.symbol);
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
        return "IndexDetailPageDataState(pageDirection=" + this.pageDirection + ", tradeBarHeight=" + this.tradeBarHeight + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ")";
    }

    public IndexDetailPageDataState(Direction pageDirection, int i, boolean z, String str, UUID uuid, String str2) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        this.pageDirection = pageDirection;
        this.tradeBarHeight = i;
        this.pnlUpdatesEnabled = z;
        this.accountNumber = str;
        this.instrumentId = uuid;
        this.symbol = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IndexDetailPageDataState(com.robinhood.models.serverdriven.experimental.api.Direction r2, int r3, boolean r4, java.lang.String r5, java.util.UUID r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.robinhood.models.serverdriven.experimental.api.Direction r2 = com.robinhood.models.serverdriven.experimental.api.Direction.f5855UP
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L17
            r5 = r0
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1c
            r6 = r0
        L1c:
            r8 = r8 & 32
            if (r8 == 0) goto L28
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2f
        L28:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.indexes.detail.IndexDetailPageDataState.<init>(com.robinhood.models.serverdriven.experimental.api.Direction, int, boolean, java.lang.String, java.util.UUID, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Direction getPageDirection() {
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
