package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.models.futures.api.arsenal.FuturesContractTradability;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState3;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003JU\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "account", "Lcom/robinhood/models/db/Account;", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "orderInstrument", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "orderTradeAmount", "Lcom/robinhood/shared/trading/orderstate/Quantity;", "orderBuyingPower", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "costBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "orderPosition", "Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;Lcom/robinhood/shared/trading/orderstate/Quantity;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getOrderInstrument", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "getOrderTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/Quantity;", "getOrderBuyingPower", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "getOrderPosition", "()Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "routeToOnboarding", "", "getRouteToOnboarding", "()Z", "buyEnabled", "getBuyEnabled", "sellEnabled", "getSellEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesOrderState implements InstrumentOrderState {
    private final Account account;
    private final FuturesCostBasis costBasis;
    private final FuturesAccount futuresAccount;
    private final FuturesInstrumentBuyingPower orderBuyingPower;
    private final FuturesInstrument orderInstrument;
    private final InstrumentOrderState3 orderPosition;
    private final Quantity orderTradeAmount;
    private final boolean routeToOnboarding;

    /* renamed from: component2, reason: from getter */
    private final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    /* renamed from: component6, reason: from getter */
    private final FuturesCostBasis getCostBasis() {
        return this.costBasis;
    }

    public static /* synthetic */ FuturesOrderState copy$default(FuturesOrderState futuresOrderState, Account account, FuturesAccount futuresAccount, FuturesInstrument futuresInstrument, Quantity quantity, FuturesInstrumentBuyingPower futuresInstrumentBuyingPower, FuturesCostBasis futuresCostBasis, InstrumentOrderState3 instrumentOrderState3, int i, Object obj) {
        if ((i & 1) != 0) {
            account = futuresOrderState.account;
        }
        if ((i & 2) != 0) {
            futuresAccount = futuresOrderState.futuresAccount;
        }
        if ((i & 4) != 0) {
            futuresInstrument = futuresOrderState.orderInstrument;
        }
        if ((i & 8) != 0) {
            quantity = futuresOrderState.orderTradeAmount;
        }
        if ((i & 16) != 0) {
            futuresInstrumentBuyingPower = futuresOrderState.orderBuyingPower;
        }
        if ((i & 32) != 0) {
            futuresCostBasis = futuresOrderState.costBasis;
        }
        if ((i & 64) != 0) {
            instrumentOrderState3 = futuresOrderState.orderPosition;
        }
        FuturesCostBasis futuresCostBasis2 = futuresCostBasis;
        InstrumentOrderState3 instrumentOrderState32 = instrumentOrderState3;
        FuturesInstrumentBuyingPower futuresInstrumentBuyingPower2 = futuresInstrumentBuyingPower;
        FuturesInstrument futuresInstrument2 = futuresInstrument;
        return futuresOrderState.copy(account, futuresAccount, futuresInstrument2, quantity, futuresInstrumentBuyingPower2, futuresCostBasis2, instrumentOrderState32);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesInstrument getOrderInstrument() {
        return this.orderInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesInstrumentBuyingPower getOrderBuyingPower() {
        return this.orderBuyingPower;
    }

    /* renamed from: component7, reason: from getter */
    public final InstrumentOrderState3 getOrderPosition() {
        return this.orderPosition;
    }

    public final FuturesOrderState copy(Account account, FuturesAccount futuresAccount, FuturesInstrument orderInstrument, Quantity orderTradeAmount, FuturesInstrumentBuyingPower orderBuyingPower, FuturesCostBasis costBasis, InstrumentOrderState3 orderPosition) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(orderInstrument, "orderInstrument");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(orderBuyingPower, "orderBuyingPower");
        return new FuturesOrderState(account, futuresAccount, orderInstrument, orderTradeAmount, orderBuyingPower, costBasis, orderPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrderState)) {
            return false;
        }
        FuturesOrderState futuresOrderState = (FuturesOrderState) other;
        return Intrinsics.areEqual(this.account, futuresOrderState.account) && Intrinsics.areEqual(this.futuresAccount, futuresOrderState.futuresAccount) && Intrinsics.areEqual(this.orderInstrument, futuresOrderState.orderInstrument) && Intrinsics.areEqual(this.orderTradeAmount, futuresOrderState.orderTradeAmount) && Intrinsics.areEqual(this.orderBuyingPower, futuresOrderState.orderBuyingPower) && Intrinsics.areEqual(this.costBasis, futuresOrderState.costBasis) && Intrinsics.areEqual(this.orderPosition, futuresOrderState.orderPosition);
    }

    public int hashCode() {
        int iHashCode = this.account.hashCode() * 31;
        FuturesAccount futuresAccount = this.futuresAccount;
        int iHashCode2 = (((((((iHashCode + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31) + this.orderInstrument.hashCode()) * 31) + this.orderTradeAmount.hashCode()) * 31) + this.orderBuyingPower.hashCode()) * 31;
        FuturesCostBasis futuresCostBasis = this.costBasis;
        int iHashCode3 = (iHashCode2 + (futuresCostBasis == null ? 0 : futuresCostBasis.hashCode())) * 31;
        InstrumentOrderState3 instrumentOrderState3 = this.orderPosition;
        return iHashCode3 + (instrumentOrderState3 != null ? instrumentOrderState3.hashCode() : 0);
    }

    public String toString() {
        return "FuturesOrderState(account=" + this.account + ", futuresAccount=" + this.futuresAccount + ", orderInstrument=" + this.orderInstrument + ", orderTradeAmount=" + this.orderTradeAmount + ", orderBuyingPower=" + this.orderBuyingPower + ", costBasis=" + this.costBasis + ", orderPosition=" + this.orderPosition + ")";
    }

    public FuturesOrderState(Account account, FuturesAccount futuresAccount, FuturesInstrument orderInstrument, Quantity orderTradeAmount, FuturesInstrumentBuyingPower orderBuyingPower, FuturesCostBasis futuresCostBasis, InstrumentOrderState3 instrumentOrderState3) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(orderInstrument, "orderInstrument");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(orderBuyingPower, "orderBuyingPower");
        this.account = account;
        this.futuresAccount = futuresAccount;
        this.orderInstrument = orderInstrument;
        this.orderTradeAmount = orderTradeAmount;
        this.orderBuyingPower = orderBuyingPower;
        this.costBasis = futuresCostBasis;
        this.orderPosition = instrumentOrderState3;
        this.routeToOnboarding = futuresAccount == null;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public Account getAccount() {
        return this.account;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public FuturesInstrument getOrderInstrument() {
        return this.orderInstrument;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public FuturesInstrumentBuyingPower getOrderBuyingPower() {
        return this.orderBuyingPower;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public InstrumentOrderState3 getOrderPosition() {
        return this.orderPosition;
    }

    public final boolean getRouteToOnboarding() {
        return this.routeToOnboarding;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public boolean getBuyEnabled() {
        BigDecimal signedQuantity;
        if (getOrderInstrument().getContract().getTradability() == FuturesContractTradability.UNTRADABLE) {
            return false;
        }
        FuturesAccount futuresAccount = this.futuresAccount;
        if ((futuresAccount == null || !futuresAccount.getPcoRestricted()) && getOrderInstrument().getContract().getTradability() != FuturesContractTradability.PCO) {
            return true;
        }
        FuturesCostBasis futuresCostBasis = this.costBasis;
        if (futuresCostBasis == null || (signedQuantity = futuresCostBasis.getSignedQuantity()) == null) {
            return false;
        }
        return BigDecimals7.isNegative(signedQuantity);
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public boolean getSellEnabled() {
        BigDecimal signedQuantity;
        if (getOrderInstrument().getContract().getTradability() == FuturesContractTradability.UNTRADABLE) {
            return false;
        }
        FuturesAccount futuresAccount = this.futuresAccount;
        if ((futuresAccount == null || !futuresAccount.getPcoRestricted()) && getOrderInstrument().getContract().getTradability() != FuturesContractTradability.PCO) {
            return true;
        }
        FuturesCostBasis futuresCostBasis = this.costBasis;
        if (futuresCostBasis == null || (signedQuantity = futuresCostBasis.getSignedQuantity()) == null) {
            return false;
        }
        return BigDecimals7.isPositive(signedQuantity);
    }
}
