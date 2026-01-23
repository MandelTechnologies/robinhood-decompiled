package com.robinhood.android.futures.charts.extensions;

import com.robinhood.android.models.event.p186db.marketdata.EventHistoricalDataPoint;
import com.robinhood.android.models.event.p186db.marketdata.UiEventHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import com.robinhood.futures.charts.contracts.models.FuturesHistoricalDataPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventHistoricals.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"toMicrogramHistorical", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "Lcom/robinhood/android/models/event/db/marketdata/UiEventHistorical;", "toMicrogramDataPoint", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalDataPoint;", "Lcom/robinhood/android/models/event/db/marketdata/EventHistoricalDataPoint;", "lib-futures-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.extensions.EventHistoricalsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventHistoricals {
    public static final FuturesHistorical toMicrogramHistorical(UiEventHistorical uiEventHistorical) {
        Intrinsics.checkNotNullParameter(uiEventHistorical, "<this>");
        String string2 = uiEventHistorical.getHistorical().getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        long epochMilli = uiEventHistorical.getHistorical().getStartTime().toEpochMilli();
        long epochMilli2 = uiEventHistorical.getHistorical().getEndTime().toEpochMilli();
        FuturesHistorical7 futuresInterval = FutureHistoricals.toFuturesInterval(uiEventHistorical.getHistorical().getInterval());
        List<EventHistoricalDataPoint> eventDataPoints = uiEventHistorical.getEventDataPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eventDataPoints, 10));
        Iterator<T> it = eventDataPoints.iterator();
        while (it.hasNext()) {
            arrayList.add(toMicrogramDataPoint((EventHistoricalDataPoint) it.next()));
        }
        return new FuturesHistorical(string2, epochMilli, epochMilli2, futuresInterval, arrayList);
    }

    private static final FuturesHistoricalDataPoint toMicrogramDataPoint(EventHistoricalDataPoint eventHistoricalDataPoint) {
        long epochMilli = eventHistoricalDataPoint.getBeginsAt().toEpochMilli();
        double dDoubleValue = eventHistoricalDataPoint.getOpenPrice().doubleValue();
        double dDoubleValue2 = eventHistoricalDataPoint.getClosePrice().doubleValue();
        double dDoubleValue3 = eventHistoricalDataPoint.getHighPrice().doubleValue();
        double dDoubleValue4 = eventHistoricalDataPoint.getLowPrice().doubleValue();
        long volume = eventHistoricalDataPoint.getVolume();
        boolean interpolated = eventHistoricalDataPoint.getInterpolated();
        Boolean boolIsMarketOpen = eventHistoricalDataPoint.isMarketOpen();
        UUID contractId = eventHistoricalDataPoint.getContractId();
        return new FuturesHistoricalDataPoint(epochMilli, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, volume, interpolated, boolIsMarketOpen, contractId != null ? contractId.toString() : null, null);
    }
}
