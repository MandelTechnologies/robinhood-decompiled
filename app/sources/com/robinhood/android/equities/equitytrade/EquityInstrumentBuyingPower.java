package com.robinhood.android.equities.equitytrade;

import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.util.Money;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityInstrumentBuyingPower;", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderBuyingPower;", "buyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "<init>", "(Lcom/robinhood/models/db/InstrumentBuyingPower;)V", "getBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "buyingPowerAmount", "Lcom/robinhood/models/util/Money;", "getBuyingPowerAmount", "()Lcom/robinhood/models/util/Money;", "shortBuyingPower", "getShortBuyingPower", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityInstrumentBuyingPower implements InstrumentOrderState2 {
    private final InstrumentBuyingPower buyingPower;

    public static /* synthetic */ EquityInstrumentBuyingPower copy$default(EquityInstrumentBuyingPower equityInstrumentBuyingPower, InstrumentBuyingPower instrumentBuyingPower, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentBuyingPower = equityInstrumentBuyingPower.buyingPower;
        }
        return equityInstrumentBuyingPower.copy(instrumentBuyingPower);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public final EquityInstrumentBuyingPower copy(InstrumentBuyingPower buyingPower) {
        return new EquityInstrumentBuyingPower(buyingPower);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EquityInstrumentBuyingPower) && Intrinsics.areEqual(this.buyingPower, ((EquityInstrumentBuyingPower) other).buyingPower);
    }

    public int hashCode() {
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        if (instrumentBuyingPower == null) {
            return 0;
        }
        return instrumentBuyingPower.hashCode();
    }

    public String toString() {
        return "EquityInstrumentBuyingPower(buyingPower=" + this.buyingPower + ")";
    }

    public EquityInstrumentBuyingPower(InstrumentBuyingPower instrumentBuyingPower) {
        this.buyingPower = instrumentBuyingPower;
    }

    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState2
    public Money getBuyingPowerAmount() {
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        if (instrumentBuyingPower != null) {
            return instrumentBuyingPower.getBuyingPowerAmount();
        }
        return null;
    }

    public final Money getShortBuyingPower() {
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        if (instrumentBuyingPower != null) {
            return instrumentBuyingPower.getShortSellingPower();
        }
        return null;
    }
}
