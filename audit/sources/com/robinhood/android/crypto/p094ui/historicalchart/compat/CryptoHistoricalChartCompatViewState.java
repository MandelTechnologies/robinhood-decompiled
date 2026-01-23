package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p355ui.DataPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHistoricalChartCompatViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatViewState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoHistorical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "dataPoints", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/DataPoint$Asset;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/crypto/db/CryptoQuote;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoHistorical", "()Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "getDataPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHistoricalChartCompatViewState {
    public static final int $stable = 8;
    private final UiCryptoHistorical cryptoHistorical;
    private final CryptoQuote cryptoQuote;
    private final ImmutableList<DataPoint.Asset> dataPoints;
    private final UiCurrencyPair uiCurrencyPair;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHistoricalChartCompatViewState copy$default(CryptoHistoricalChartCompatViewState cryptoHistoricalChartCompatViewState, UiCurrencyPair uiCurrencyPair, UiCryptoHistorical uiCryptoHistorical, ImmutableList immutableList, CryptoQuote cryptoQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoHistoricalChartCompatViewState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            uiCryptoHistorical = cryptoHistoricalChartCompatViewState.cryptoHistorical;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoHistoricalChartCompatViewState.dataPoints;
        }
        if ((i & 8) != 0) {
            cryptoQuote = cryptoHistoricalChartCompatViewState.cryptoQuote;
        }
        return cryptoHistoricalChartCompatViewState.copy(uiCurrencyPair, uiCryptoHistorical, immutableList, cryptoQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    public final ImmutableList<DataPoint.Asset> component3() {
        return this.dataPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final CryptoHistoricalChartCompatViewState copy(UiCurrencyPair uiCurrencyPair, UiCryptoHistorical cryptoHistorical, ImmutableList<? extends DataPoint.Asset> dataPoints, CryptoQuote cryptoQuote) {
        return new CryptoHistoricalChartCompatViewState(uiCurrencyPair, cryptoHistorical, dataPoints, cryptoQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHistoricalChartCompatViewState)) {
            return false;
        }
        CryptoHistoricalChartCompatViewState cryptoHistoricalChartCompatViewState = (CryptoHistoricalChartCompatViewState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, cryptoHistoricalChartCompatViewState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoHistorical, cryptoHistoricalChartCompatViewState.cryptoHistorical) && Intrinsics.areEqual(this.dataPoints, cryptoHistoricalChartCompatViewState.dataPoints) && Intrinsics.areEqual(this.cryptoQuote, cryptoHistoricalChartCompatViewState.cryptoQuote);
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        UiCryptoHistorical uiCryptoHistorical = this.cryptoHistorical;
        int iHashCode2 = (iHashCode + (uiCryptoHistorical == null ? 0 : uiCryptoHistorical.hashCode())) * 31;
        ImmutableList<DataPoint.Asset> immutableList = this.dataPoints;
        int iHashCode3 = (iHashCode2 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        return iHashCode3 + (cryptoQuote != null ? cryptoQuote.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHistoricalChartCompatViewState(uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoHistorical=" + this.cryptoHistorical + ", dataPoints=" + this.dataPoints + ", cryptoQuote=" + this.cryptoQuote + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHistoricalChartCompatViewState(UiCurrencyPair uiCurrencyPair, UiCryptoHistorical uiCryptoHistorical, ImmutableList<? extends DataPoint.Asset> immutableList, CryptoQuote cryptoQuote) {
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoHistorical = uiCryptoHistorical;
        this.dataPoints = immutableList;
        this.cryptoQuote = cryptoQuote;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    public final ImmutableList<DataPoint.Asset> getDataPoints() {
        return this.dataPoints;
    }

    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }
}
