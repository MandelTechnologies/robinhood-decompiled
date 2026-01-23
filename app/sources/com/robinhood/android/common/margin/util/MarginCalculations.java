package com.robinhood.android.common.margin.util;

import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCalculations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001¨\u0006\n"}, m3636d2 = {"getGoldBuyingPower", "Ljava/math/BigDecimal;", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "plan", "Lcom/robinhood/models/subscription/db/MarginSubscriptionPlan;", "getMinimumDepositForAllowingGoldUpgrade", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "requiredAmount", "getSuggestedDepositForAllowingGoldUpgrade", "feature-lib-margin_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.util.MarginCalculationsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class MarginCalculations {
    public static final BigDecimal getGoldBuyingPower(UnifiedBalances unifiedBalances, MarginSubscription3 plan) {
        Intrinsics.checkNotNullParameter(unifiedBalances, "<this>");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Money subscriptionMarginLimit = plan.getSubscriptionMarginLimit();
        return unifiedBalances.getGoldBuyingPower(subscriptionMarginLimit != null ? Money3.getBigDecimalCompat(subscriptionMarginLimit) : null);
    }

    public static final BigDecimal getMinimumDepositForAllowingGoldUpgrade(BrokerageBalances brokerageBalances, MarginUpgradePlans2 plan, BigDecimal requiredAmount) {
        Intrinsics.checkNotNullParameter(brokerageBalances, "<this>");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
        BigDecimal bigDecimalAdd = brokerageBalances.getMinimumDepositForAllowingEnableMargin(requiredAmount).add(plan.isFirstChargeToday() ? plan.getFirst_fee() : BigDecimal.ZERO);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    public static final BigDecimal getSuggestedDepositForAllowingGoldUpgrade(BrokerageBalances brokerageBalances, MarginUpgradePlans2 plan, BigDecimal requiredAmount) {
        Intrinsics.checkNotNullParameter(brokerageBalances, "<this>");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
        BigDecimal first_fee = plan.isFirstChargeToday() ? plan.getFirst_fee() : BigDecimal.ZERO;
        BigDecimal suggestedDepositForAllowingEnableMargin = brokerageBalances.getSuggestedDepositForAllowingEnableMargin(requiredAmount);
        Intrinsics.checkNotNull(first_fee);
        BigDecimal bigDecimalAdd = suggestedDepositForAllowingEnableMargin.add(first_fee);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }
}
