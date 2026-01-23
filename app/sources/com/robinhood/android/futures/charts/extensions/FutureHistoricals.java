package com.robinhood.android.futures.charts.extensions;

import com.robinhood.android.models.futures.marketdata.p191db.FuturesHistoricalDataPoint;
import com.robinhood.android.models.futures.marketdata.p191db.UiFuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import com.robinhood.models.p355ui.Historical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FutureHistoricals.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007¨\u0006\n"}, m3636d2 = {"toMicrogramHistorical", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "Lcom/robinhood/android/models/futures/marketdata/db/UiFuturesHistorical;", "toMicrogramDataPoint", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalDataPoint;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesHistoricalDataPoint;", "toFuturesInterval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "Lcom/robinhood/models/ui/Historical$Interval;", "toInterval", "lib-futures-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.extensions.FutureHistoricalsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FutureHistoricals {

    /* compiled from: FutureHistoricals.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.charts.extensions.FutureHistoricalsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Historical.Interval.values().length];
            try {
                iArr[Historical.Interval.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Historical.Interval.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Historical.Interval.ONE_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Historical.Interval.THIRTY_MINUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Historical.Interval.TEN_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Historical.Interval.FIVE_MINUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Historical.Interval.FIFTEEN_SECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Historical.Interval.MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Historical.Interval.ALL_LOCAL_ONLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesHistorical7.values().length];
            try {
                iArr2[FuturesHistorical7.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FuturesHistorical7.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FuturesHistorical7.ONE_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FuturesHistorical7.ONE_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FuturesHistorical7.THIRTY_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[FuturesHistorical7.TEN_MINUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FuturesHistorical7.FIVE_MINUTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FuturesHistorical7.FIFTEEN_SECONDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final FuturesHistorical toMicrogramHistorical(UiFuturesHistorical uiFuturesHistorical) {
        Intrinsics.checkNotNullParameter(uiFuturesHistorical, "<this>");
        String string2 = uiFuturesHistorical.getHistorical().getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        long epochMilli = uiFuturesHistorical.getHistorical().getStartTime().toEpochMilli();
        long epochMilli2 = uiFuturesHistorical.getHistorical().getEndTime().toEpochMilli();
        FuturesHistorical7 futuresInterval = toFuturesInterval(uiFuturesHistorical.getHistorical().getInterval());
        List<FuturesHistoricalDataPoint> futuresDataPoints = uiFuturesHistorical.getFuturesDataPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futuresDataPoints, 10));
        Iterator<T> it = futuresDataPoints.iterator();
        while (it.hasNext()) {
            arrayList.add(toMicrogramDataPoint((FuturesHistoricalDataPoint) it.next()));
        }
        return new FuturesHistorical(string2, epochMilli, epochMilli2, futuresInterval, arrayList);
    }

    private static final com.robinhood.futures.charts.contracts.models.FuturesHistoricalDataPoint toMicrogramDataPoint(FuturesHistoricalDataPoint futuresHistoricalDataPoint) {
        long epochMilli = futuresHistoricalDataPoint.getBeginsAt().toEpochMilli();
        double dDoubleValue = futuresHistoricalDataPoint.getOpenPrice().doubleValue();
        double dDoubleValue2 = futuresHistoricalDataPoint.getClosePrice().doubleValue();
        double dDoubleValue3 = futuresHistoricalDataPoint.getHighPrice().doubleValue();
        double dDoubleValue4 = futuresHistoricalDataPoint.getLowPrice().doubleValue();
        long volume = futuresHistoricalDataPoint.getVolume();
        boolean interpolated = futuresHistoricalDataPoint.getInterpolated();
        Boolean boolIsMarketOpen = futuresHistoricalDataPoint.isMarketOpen();
        UUID contractId = futuresHistoricalDataPoint.getContractId();
        return new com.robinhood.futures.charts.contracts.models.FuturesHistoricalDataPoint(epochMilli, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, volume, interpolated, boolIsMarketOpen, contractId != null ? contractId.toString() : null, null);
    }

    public static final FuturesHistorical7 toFuturesInterval(Historical.Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[interval.ordinal()]) {
            case 1:
                return FuturesHistorical7.WEEK;
            case 2:
                return FuturesHistorical7.ONE_DAY;
            case 3:
                return FuturesHistorical7.ONE_HOUR;
            case 4:
                return FuturesHistorical7.THIRTY_MINUTES;
            case 5:
                return FuturesHistorical7.TEN_MINUTES;
            case 6:
                return FuturesHistorical7.FIVE_MINUTES;
            case 7:
                return FuturesHistorical7.FIFTEEN_SECONDS;
            case 8:
                return FuturesHistorical7.MONTH;
            case 9:
                throw new IllegalStateException(("Unsupported interval for futures historical: " + interval).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Historical.Interval toInterval(FuturesHistorical7 futuresHistorical7) {
        Intrinsics.checkNotNullParameter(futuresHistorical7, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[futuresHistorical7.ordinal()]) {
            case 1:
                return Historical.Interval.MONTH;
            case 2:
                return Historical.Interval.WEEK;
            case 3:
                return Historical.Interval.ONE_DAY;
            case 4:
                return Historical.Interval.ONE_HOUR;
            case 5:
                return Historical.Interval.THIRTY_MINUTES;
            case 6:
                return Historical.Interval.TEN_MINUTES;
            case 7:
                return Historical.Interval.FIVE_MINUTES;
            case 8:
                return Historical.Interval.FIFTEEN_SECONDS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
