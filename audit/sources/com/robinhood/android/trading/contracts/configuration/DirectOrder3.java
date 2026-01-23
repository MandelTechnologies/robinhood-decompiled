package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.models.p320db.OrderMarketHours;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/LimitPriceHolder;", "", "limitPrice", "Ljava/math/BigDecimal;", "getLimitPrice", "()Ljava/math/BigDecimal;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.LimitPriceHolder, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder3 {
    BigDecimal getLimitPrice();

    OrderMarketHours getMarketHours();
}
