package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderConfiguration.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"overrideMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getOverrideMarketHours", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;)Lcom/robinhood/models/db/OrderMarketHours;", "limitPrice", "Ljava/math/BigDecimal;", "getLimitPrice", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;)Ljava/math/BigDecimal;", "trailAmount", "getTrailAmount", "trailPercentage", "", "getTrailPercentage", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;)Ljava/lang/Integer;", "presetPercentLimit", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getPresetPercentLimit", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;)Ljava/math/BigDecimal;", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.EquityOrderConfigurationKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class EquityOrderConfiguration3 {
    public static final OrderMarketHours getOverrideMarketHours(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
        Intrinsics.checkNotNullParameter(shareBasedOrderConfiguration, "<this>");
        if (shareBasedOrderConfiguration instanceof DirectOrder2) {
            return ((DirectOrder3) shareBasedOrderConfiguration).getMarketHours();
        }
        if ((shareBasedOrderConfiguration instanceof AdvancedOrder) || (shareBasedOrderConfiguration instanceof ShareMarket) || (shareBasedOrderConfiguration instanceof ShareSimpleLimit) || (shareBasedOrderConfiguration instanceof ShareStopLimit) || (shareBasedOrderConfiguration instanceof ShareStopLoss) || (shareBasedOrderConfiguration instanceof ShareTrailingStop)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BigDecimal getLimitPrice(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
        Intrinsics.checkNotNullParameter(shareBasedOrderConfiguration, "<this>");
        if (!(shareBasedOrderConfiguration instanceof DirectOrder2) && !(shareBasedOrderConfiguration instanceof DirectOrder7)) {
            if ((shareBasedOrderConfiguration instanceof AdvancedOrder) || (shareBasedOrderConfiguration instanceof ShareMarket) || (shareBasedOrderConfiguration instanceof ShareSimpleLimit) || (shareBasedOrderConfiguration instanceof ShareStopLoss) || (shareBasedOrderConfiguration instanceof ShareTrailingStop)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return ((DirectOrder3) shareBasedOrderConfiguration).getLimitPrice();
    }

    public static final BigDecimal getTrailAmount(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
        Money price;
        Intrinsics.checkNotNullParameter(shareBasedOrderConfiguration, "<this>");
        if (shareBasedOrderConfiguration instanceof ShareTrailingStop) {
            OrderTrailingPeg trailingPeg = ((ShareTrailingStop) shareBasedOrderConfiguration).getTrailingPeg();
            if (trailingPeg == null || (price = trailingPeg.getPrice()) == null) {
                return null;
            }
            return price.getDecimalValue();
        }
        if ((shareBasedOrderConfiguration instanceof AdvancedOrder) || (shareBasedOrderConfiguration instanceof ShareStopLimit) || (shareBasedOrderConfiguration instanceof ShareStopLoss) || (shareBasedOrderConfiguration instanceof ShareLimit) || (shareBasedOrderConfiguration instanceof ShareMarket) || (shareBasedOrderConfiguration instanceof ShareSimpleLimit)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Integer getTrailPercentage(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
        Intrinsics.checkNotNullParameter(shareBasedOrderConfiguration, "<this>");
        if (shareBasedOrderConfiguration instanceof ShareTrailingStop) {
            OrderTrailingPeg trailingPeg = ((ShareTrailingStop) shareBasedOrderConfiguration).getTrailingPeg();
            if (trailingPeg != null) {
                return trailingPeg.getPercentage();
            }
            return null;
        }
        if ((shareBasedOrderConfiguration instanceof AdvancedOrder) || (shareBasedOrderConfiguration instanceof ShareStopLimit) || (shareBasedOrderConfiguration instanceof ShareStopLoss) || (shareBasedOrderConfiguration instanceof ShareLimit) || (shareBasedOrderConfiguration instanceof ShareMarket) || (shareBasedOrderConfiguration instanceof ShareSimpleLimit)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BigDecimal getPresetPercentLimit(DirectOrder directOrder) {
        Intrinsics.checkNotNullParameter(directOrder, "<this>");
        if (directOrder instanceof ShareSimpleLimit) {
            return ((ShareSimpleLimit) directOrder).getPresetPercentLimit();
        }
        if (directOrder instanceof DollarBased5) {
            return ((DollarBased5) directOrder).getPresetPercentLimit();
        }
        if ((directOrder instanceof AdvancedOrder) || (directOrder instanceof ShareLimit) || (directOrder instanceof DollarBased3) || (directOrder instanceof ShareMarket) || (directOrder instanceof ShareStopLimit) || (directOrder instanceof ShareStopLoss) || (directOrder instanceof ShareTrailingStop)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
