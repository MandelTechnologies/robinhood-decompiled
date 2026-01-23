package com.robinhood.librobinhood.data.store;

import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoSduiChartParams;", "", "currencyPairId", "Ljava/util/UUID;", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "sparklineColor", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "showCandlesticks", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/serverdriven/experimental/api/Color;Z)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getSparklineColor", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getShowCandlesticks", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CryptoSduiChartParams {
    private final UUID currencyPairId;
    private final DisplaySpan displaySpan;
    private final boolean showCandlesticks;
    private final Color sparklineColor;

    public static /* synthetic */ CryptoSduiChartParams copy$default(CryptoSduiChartParams cryptoSduiChartParams, UUID uuid, DisplaySpan displaySpan, Color color, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoSduiChartParams.currencyPairId;
        }
        if ((i & 2) != 0) {
            displaySpan = cryptoSduiChartParams.displaySpan;
        }
        if ((i & 4) != 0) {
            color = cryptoSduiChartParams.sparklineColor;
        }
        if ((i & 8) != 0) {
            z = cryptoSduiChartParams.showCandlesticks;
        }
        return cryptoSduiChartParams.copy(uuid, displaySpan, color, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplaySpan getDisplaySpan() {
        return this.displaySpan;
    }

    /* renamed from: component3, reason: from getter */
    public final Color getSparklineColor() {
        return this.sparklineColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    public final CryptoSduiChartParams copy(UUID currencyPairId, DisplaySpan displaySpan, Color sparklineColor, boolean showCandlesticks) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        return new CryptoSduiChartParams(currencyPairId, displaySpan, sparklineColor, showCandlesticks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSduiChartParams)) {
            return false;
        }
        CryptoSduiChartParams cryptoSduiChartParams = (CryptoSduiChartParams) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoSduiChartParams.currencyPairId) && this.displaySpan == cryptoSduiChartParams.displaySpan && this.sparklineColor == cryptoSduiChartParams.sparklineColor && this.showCandlesticks == cryptoSduiChartParams.showCandlesticks;
    }

    public int hashCode() {
        int iHashCode = ((this.currencyPairId.hashCode() * 31) + this.displaySpan.hashCode()) * 31;
        Color color = this.sparklineColor;
        return ((iHashCode + (color == null ? 0 : color.hashCode())) * 31) + Boolean.hashCode(this.showCandlesticks);
    }

    public String toString() {
        return "CryptoSduiChartParams(currencyPairId=" + this.currencyPairId + ", displaySpan=" + this.displaySpan + ", sparklineColor=" + this.sparklineColor + ", showCandlesticks=" + this.showCandlesticks + ")";
    }

    public CryptoSduiChartParams(UUID currencyPairId, DisplaySpan displaySpan, Color color, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        this.currencyPairId = currencyPairId;
        this.displaySpan = displaySpan;
        this.sparklineColor = color;
        this.showCandlesticks = z;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final DisplaySpan getDisplaySpan() {
        return this.displaySpan;
    }

    public final Color getSparklineColor() {
        return this.sparklineColor;
    }

    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }
}
