package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: CryptoHistoricalChartCompatDataState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoHistorical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;Lcom/robinhood/models/ui/GraphSelection;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "getCryptoHistorical", "()Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "getGraphSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "dataPoints", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/DataPoint$Asset;", "getDataPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHistoricalChartCompatDataState {
    public static final int $stable = 8;
    private final UiCryptoHistorical cryptoHistorical;
    private final CryptoQuote cryptoQuote;
    private final GraphSelection graphSelection;
    private final UiCurrencyPair uiCurrencyPair;

    public CryptoHistoricalChartCompatDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CryptoHistoricalChartCompatDataState copy$default(CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, UiCryptoHistorical uiCryptoHistorical, GraphSelection graphSelection, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoHistoricalChartCompatDataState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            cryptoQuote = cryptoHistoricalChartCompatDataState.cryptoQuote;
        }
        if ((i & 4) != 0) {
            uiCryptoHistorical = cryptoHistoricalChartCompatDataState.cryptoHistorical;
        }
        if ((i & 8) != 0) {
            graphSelection = cryptoHistoricalChartCompatDataState.graphSelection;
        }
        return cryptoHistoricalChartCompatDataState.copy(uiCurrencyPair, cryptoQuote, uiCryptoHistorical, graphSelection);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    /* renamed from: component4, reason: from getter */
    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    public final CryptoHistoricalChartCompatDataState copy(UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, UiCryptoHistorical cryptoHistorical, GraphSelection graphSelection) {
        return new CryptoHistoricalChartCompatDataState(uiCurrencyPair, cryptoQuote, cryptoHistorical, graphSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHistoricalChartCompatDataState)) {
            return false;
        }
        CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState = (CryptoHistoricalChartCompatDataState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, cryptoHistoricalChartCompatDataState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoQuote, cryptoHistoricalChartCompatDataState.cryptoQuote) && Intrinsics.areEqual(this.cryptoHistorical, cryptoHistoricalChartCompatDataState.cryptoHistorical) && this.graphSelection == cryptoHistoricalChartCompatDataState.graphSelection;
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode2 = (iHashCode + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        UiCryptoHistorical uiCryptoHistorical = this.cryptoHistorical;
        int iHashCode3 = (iHashCode2 + (uiCryptoHistorical == null ? 0 : uiCryptoHistorical.hashCode())) * 31;
        GraphSelection graphSelection = this.graphSelection;
        return iHashCode3 + (graphSelection != null ? graphSelection.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHistoricalChartCompatDataState(uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoQuote=" + this.cryptoQuote + ", cryptoHistorical=" + this.cryptoHistorical + ", graphSelection=" + this.graphSelection + ")";
    }

    public CryptoHistoricalChartCompatDataState(UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, UiCryptoHistorical uiCryptoHistorical, GraphSelection graphSelection) {
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoQuote = cryptoQuote;
        this.cryptoHistorical = uiCryptoHistorical;
        this.graphSelection = graphSelection;
    }

    public /* synthetic */ CryptoHistoricalChartCompatDataState(UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, UiCryptoHistorical uiCryptoHistorical, GraphSelection graphSelection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : cryptoQuote, (i & 4) != 0 ? null : uiCryptoHistorical, (i & 8) != 0 ? null : graphSelection);
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    public final ImmutableList<DataPoint.Asset> getDataPoints() {
        Instant receivedAt;
        UiCryptoHistorical uiCryptoHistorical = this.cryptoHistorical;
        if (uiCryptoHistorical == null || this.graphSelection == null) {
            return null;
        }
        CryptoQuote cryptoQuote = this.cryptoQuote;
        Money markPrice = cryptoQuote != null ? cryptoQuote.getMarkPrice() : null;
        CryptoQuote cryptoQuote2 = this.cryptoQuote;
        if (cryptoQuote2 == null || (receivedAt = cryptoQuote2.getReceivedAt()) == null) {
            receivedAt = Instant.EPOCH;
        }
        Intrinsics.checkNotNull(receivedAt);
        return extensions2.toPersistentList(Historical.DefaultImpls.getDataPointsForDisplay$default(uiCryptoHistorical, markPrice, receivedAt, this.graphSelection, null, null, 24, null));
    }
}
