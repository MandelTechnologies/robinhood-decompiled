package com.robinhood.android.common.gold;

import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.CryptoPortfolio;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldWithdrawableCashBreakdown.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldWithdrawableCashBreakdown;", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "<init>", "(Lcom/robinhood/models/crypto/db/UnifiedBalances;)V", "marginLimit", "Ljava/math/BigDecimal;", "getMarginLimit", "()Ljava/math/BigDecimal;", "leveredAmount", "getLeveredAmount", "unusedGold", "getUnusedGold", "totalEquity", "getTotalEquity", "forexMarketValue", "getForexMarketValue", "excess", "getExcess", "goldMinimum", "getGoldMinimum", "distanceFromMin", "getDistanceFromMin", "aml", "getAml", "outstandingInterest", "getOutstandingInterest", "pendingOrders", "getPendingOrders", "instantDeposit", "getInstantDeposit", "buyingPower", "useUnusedGold", "", "useExcess", "useDistanceFromMin", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class GoldWithdrawableCashBreakdown {
    public static final int $stable = 8;
    private final BigDecimal aml;
    private final BigDecimal buyingPower;
    private final BigDecimal distanceFromMin;
    private final BigDecimal excess;
    private final BigDecimal forexMarketValue;
    private final BigDecimal goldMinimum;
    private final BigDecimal instantDeposit;
    private final BigDecimal leveredAmount;
    private final BigDecimal marginLimit;
    private final BigDecimal outstandingInterest;
    private final BigDecimal pendingOrders;
    private final BigDecimal totalEquity;
    private final BigDecimal unusedGold;

    public GoldWithdrawableCashBreakdown(UnifiedBalances unifiedBalances) {
        BigDecimal ZERO;
        Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
        BrokerageBalances brokerageBalances = unifiedBalances.getBrokerageBalances();
        CryptoPortfolio portfolio = unifiedBalances.getCryptoBalances().getPortfolio();
        BigDecimal equity = brokerageBalances.getPortfolio().getEquity();
        BigDecimal marginLimit = brokerageBalances.getMarginLimit();
        this.marginLimit = marginLimit;
        BigDecimal goldUsed = unifiedBalances.getGoldUsed();
        this.leveredAmount = goldUsed;
        this.unusedGold = BigDecimals7.safeSubtract(marginLimit, goldUsed);
        this.totalEquity = unifiedBalances.getUsdEquity().getDecimalValue();
        if (portfolio == null || (ZERO = portfolio.getMarketValue()) == null) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        this.forexMarketValue = ZERO;
        this.excess = brokerageBalances.getExcessMargin();
        BigDecimal goldEquityRequirement = brokerageBalances.getGoldEquityRequirement();
        this.goldMinimum = goldEquityRequirement;
        this.distanceFromMin = BigDecimals7.safeSubtract(equity, goldEquityRequirement);
        this.aml = brokerageBalances.getUnwithdrawableDeposits();
        this.outstandingInterest = brokerageBalances.getOutstandingInterest();
        this.pendingOrders = unifiedBalances.getCashHeldForOrders();
        this.instantDeposit = brokerageBalances.getAmountAvailableFromInstantDeposits();
        this.buyingPower = brokerageBalances.getBuyingPowerForGoldWithdrawableCash();
    }

    public final BigDecimal getMarginLimit() {
        return this.marginLimit;
    }

    public final BigDecimal getLeveredAmount() {
        return this.leveredAmount;
    }

    public final BigDecimal getUnusedGold() {
        return this.unusedGold;
    }

    public final BigDecimal getTotalEquity() {
        return this.totalEquity;
    }

    public final BigDecimal getForexMarketValue() {
        return this.forexMarketValue;
    }

    public final BigDecimal getExcess() {
        return this.excess;
    }

    public final BigDecimal getGoldMinimum() {
        return this.goldMinimum;
    }

    public final BigDecimal getDistanceFromMin() {
        return this.distanceFromMin;
    }

    public final BigDecimal getAml() {
        return this.aml;
    }

    public final BigDecimal getOutstandingInterest() {
        return this.outstandingInterest;
    }

    public final BigDecimal getPendingOrders() {
        return this.pendingOrders;
    }

    public final BigDecimal getInstantDeposit() {
        return this.instantDeposit;
    }

    public final boolean useUnusedGold() {
        return BigDecimals7.m2978gt(this.leveredAmount, BigDecimal.ZERO) && this.marginLimit != null && BigDecimals7.m2979lt(this.unusedGold, this.excess) && BigDecimals7.m2979lt(this.unusedGold, this.distanceFromMin) && BigDecimals7.m2979lt(this.unusedGold, this.buyingPower);
    }

    public final boolean useExcess() {
        return (this.marginLimit == null || BigDecimals7.m2979lt(this.excess, this.unusedGold)) && BigDecimals7.m2979lt(this.excess, this.distanceFromMin) && BigDecimals7.m2979lt(this.excess, this.buyingPower);
    }

    public final boolean useDistanceFromMin() {
        return (this.marginLimit == null || BigDecimals7.m2979lt(this.distanceFromMin, this.unusedGold)) && BigDecimals7.m2979lt(this.distanceFromMin, this.excess) && BigDecimals7.m2979lt(this.distanceFromMin, this.buyingPower);
    }
}
