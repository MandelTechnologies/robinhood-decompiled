package com.robinhood.android.futures.charts.extensions;

import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.futures.charts.contracts.models.FuturesClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesPrevClosePrice;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesClosePrices.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0003*\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toMicrogramClosePrice", "Lcom/robinhood/futures/charts/contracts/models/FuturesClosePrice;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "lib-futures-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.charts.extensions.FuturesClosePricesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesClosePrices2 {
    public static final FuturesClosePrice toMicrogramClosePrice(FuturesClosesRange futuresClosesRange) {
        Intrinsics.checkNotNullParameter(futuresClosesRange, "<this>");
        BigDecimal closePrice = futuresClosesRange.getClosePrice();
        if (closePrice == null) {
            return null;
        }
        String string2 = futuresClosesRange.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new FuturesClosePrice(string2, closePrice.doubleValue(), futuresClosesRange.getSessionStartTime().toEpochMilli(), futuresClosesRange.getSessionEndTime().toEpochMilli());
    }

    public static final FuturesPrevClosePrice toMicrogramClosePrice(FuturesClosePrices futuresClosePrices) {
        Intrinsics.checkNotNullParameter(futuresClosePrices, "<this>");
        BigDecimal previousClosePrice = futuresClosePrices.getPreviousClosePrice();
        if (previousClosePrice != null) {
            return new FuturesPrevClosePrice(previousClosePrice.doubleValue());
        }
        return null;
    }
}
