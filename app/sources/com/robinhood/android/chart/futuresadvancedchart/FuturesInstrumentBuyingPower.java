package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderBuyingPower;", "buyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "<init>", "(Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;)V", "getBuyingPower", "()Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "buyingPowerAmount", "Lcom/robinhood/models/util/Money;", "getBuyingPowerAmount", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesInstrumentBuyingPower implements InstrumentOrderState2 {
    private final ApiFuturesBuyingPower buyingPower;

    public static /* synthetic */ FuturesInstrumentBuyingPower copy$default(FuturesInstrumentBuyingPower futuresInstrumentBuyingPower, ApiFuturesBuyingPower apiFuturesBuyingPower, int i, Object obj) {
        if ((i & 1) != 0) {
            apiFuturesBuyingPower = futuresInstrumentBuyingPower.buyingPower;
        }
        return futuresInstrumentBuyingPower.copy(apiFuturesBuyingPower);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiFuturesBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public final FuturesInstrumentBuyingPower copy(ApiFuturesBuyingPower buyingPower) {
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        return new FuturesInstrumentBuyingPower(buyingPower);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesInstrumentBuyingPower) && Intrinsics.areEqual(this.buyingPower, ((FuturesInstrumentBuyingPower) other).buyingPower);
    }

    public int hashCode() {
        return this.buyingPower.hashCode();
    }

    public String toString() {
        return "FuturesInstrumentBuyingPower(buyingPower=" + this.buyingPower + ")";
    }

    public FuturesInstrumentBuyingPower(ApiFuturesBuyingPower buyingPower) {
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        this.buyingPower = buyingPower;
    }

    public final ApiFuturesBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState2
    public Money getBuyingPowerAmount() {
        return Money3.toMoney$default(this.buyingPower.getFutures_buying_power(), null, 1, null);
    }
}
