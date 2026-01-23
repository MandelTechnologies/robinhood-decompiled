package com.robinhood.android.graph;

import com.robinhood.android.common.view.CandlestickChartView;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDateTimes;
import com.robinhood.utils.datetime.LocalDates4;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: CandlestickMappers.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\t\u001a%\u0010\u000b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001aD\u0010\u0011\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001a\u001a\u00020\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphData;", "graphData", "Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "deriveCandlestickData", "(Lcom/robinhood/android/graph/spark/GraphData;)Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "dataPoints", "groupDataPointsByDay", "(Ljava/util/List;Lcom/robinhood/android/graph/spark/GraphData;)Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "groupDataPointsByWeek", "groupDataPointsByMonth", "Lkotlin/Function2;", "j$/time/LocalDate", "", "Lkotlin/ExtensionFunctionType;", "keySelector", "groupDataPoints", "(Ljava/util/List;Lcom/robinhood/android/graph/spark/GraphData;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "Lcom/robinhood/models/ui/DataPoint;", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "j$/time/Duration", "getDuration", "(Ljava/util/List;Lcom/robinhood/models/ui/Historical$Interval;)Lj$/time/Duration;", "Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", "combineDataPoints", "(Ljava/util/List;Lcom/robinhood/models/ui/Historical$Interval;)Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", "lib-graph_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.graph.CandlestickMappersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CandlestickMappers {

    /* compiled from: CandlestickMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.graph.CandlestickMappersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraphSelection.values().length];
            try {
                iArr[GraphSelection.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphSelection.ALL_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphSelection.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GraphSelection.YEAR_TO_DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GraphSelection.YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GraphSelection.YEAR_CRYPTO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GraphSelection.MONTH_HOURLY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GraphSelection.MONTH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CandlestickChartView.ChartData deriveCandlestickData(GraphData graphData) {
        long j;
        long minutes;
        int size;
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        List<DataPoint.Asset> assetDataPoints = graphData.getAssetDataPoints();
        Duration duration = getDuration(assetDataPoints, graphData.getInterval());
        GraphSelection selection = graphData.getSelection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[selection.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i = iArr[graphData.getSelection().ordinal()];
                if (i == 1) {
                    j = 10;
                } else {
                    if (i != 2 && i != 3) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(graphData.getSelection());
                        throw new ExceptionsH();
                    }
                    j = 30;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : assetDataPoints) {
                    Instant time = ((DataPoint.Asset) obj).getTime(graphData.getInterval());
                    Instant EPOCH = Instant.EPOCH;
                    Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                    Duration durationBetween = Duration.between(EPOCH, time);
                    Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                    Long lValueOf = Long.valueOf(durationBetween.toMinutes() / j);
                    Object arrayList = linkedHashMap.get(lValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(lValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList2.add(combineDataPoints((List) it.next(), graphData.getInterval()));
                }
                int range = graphData.getRange();
                if (range == 78) {
                    minutes = Duration.ofHours(6L).plusMinutes(30L).toMinutes() / j;
                } else if (range == 156) {
                    minutes = Duration.ofHours(13L).toMinutes() / j;
                } else if (range == 192) {
                    minutes = Duration.ofHours(16L).toMinutes() / j;
                } else {
                    if (range != 288) {
                        size = arrayList2.size();
                        return new CandlestickChartView.ChartData(arrayList2, size, graphData.getFromPrice());
                    }
                    minutes = Duration.ofDays(1L).toMinutes() / j;
                }
                size = (int) minutes;
                return new CandlestickChartView.ChartData(arrayList2, size, graphData.getFromPrice());
            case 4:
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : assetDataPoints) {
                    Instant time2 = ((DataPoint.Asset) obj2).getTime(graphData.getInterval());
                    ZoneOffset UTC = ZoneOffset.UTC;
                    Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                    LocalDateTime localDateTime = Instants.toLocalDateTime(time2, UTC);
                    Intrinsics.checkNotNull(localDateTimeOfEpochSecond);
                    Long lValueOf2 = Long.valueOf(LocalDateTimes.until(localDateTimeOfEpochSecond, localDateTime).toMinutes());
                    Object arrayList3 = linkedHashMap2.get(lValueOf2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(lValueOf2, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                Collection collectionValues2 = linkedHashMap2.values();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues2, 10));
                Iterator it2 = collectionValues2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(combineDataPoints((List) it2.next(), graphData.getInterval()));
                }
                return new CandlestickChartView.ChartData(arrayList4, arrayList4.size(), null, 4, null);
            case 5:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : assetDataPoints) {
                    Instant time3 = ((DataPoint.Asset) obj3).getTime(graphData.getInterval());
                    Instant EPOCH2 = Instant.EPOCH;
                    Intrinsics.checkNotNullExpressionValue(EPOCH2, "EPOCH");
                    Duration durationBetween2 = Duration.between(EPOCH2, time3);
                    Intrinsics.checkNotNullExpressionValue(durationBetween2, "between(...)");
                    Long lValueOf3 = Long.valueOf(durationBetween2.toHours());
                    Object arrayList5 = linkedHashMap3.get(lValueOf3);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap3.put(lValueOf3, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                Collection collectionValues3 = linkedHashMap3.values();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues3, 10));
                Iterator it3 = collectionValues3.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(combineDataPoints((List) it3.next(), graphData.getInterval()));
                }
                return new CandlestickChartView.ChartData(arrayList6, arrayList6.size(), null, 4, null);
            case 6:
                LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj4 : assetDataPoints) {
                    Instant time4 = ((DataPoint.Asset) obj4).getTime(graphData.getInterval());
                    ZoneOffset UTC2 = ZoneOffset.UTC;
                    Intrinsics.checkNotNullExpressionValue(UTC2, "UTC");
                    LocalDateTime localDateTime2 = Instants.toLocalDateTime(time4, UTC2);
                    Intrinsics.checkNotNull(localDateTimeOfEpochSecond2);
                    Long lValueOf4 = Long.valueOf(LocalDateTimes.until(localDateTimeOfEpochSecond2, localDateTime2).toHours() / 4);
                    Object arrayList7 = linkedHashMap4.get(lValueOf4);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap4.put(lValueOf4, arrayList7);
                    }
                    ((List) arrayList7).add(obj4);
                }
                Collection collectionValues4 = linkedHashMap4.values();
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues4, 10));
                Iterator it4 = collectionValues4.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(combineDataPoints((List) it4.next(), graphData.getInterval()));
                }
                return new CandlestickChartView.ChartData(arrayList8, arrayList8.size(), null, 4, null);
            case 7:
            case 8:
            case 9:
                return groupDataPointsByWeek(assetDataPoints, graphData);
            case 10:
            case 11:
                return groupDataPointsByMonth(assetDataPoints, graphData);
            case 12:
            case 13:
                return groupDataPointsByDay(assetDataPoints, graphData);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                if (graphData.getSelection() == GraphSelection.ALL && assetDataPoints.size() > 90 && Intrinsics.areEqual(duration, Durations.INSTANCE.getONE_DAY())) {
                    return groupDataPointsByWeek(assetDataPoints, graphData);
                }
                List<DataPoint.Asset> list = assetDataPoints;
                ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (DataPoint.Asset asset : list) {
                    Instant time5 = asset.getTime(graphData.getInterval());
                    Instant instantPlusSeconds = time5.plusSeconds(duration != null ? duration.getSeconds() : 0L);
                    BigDecimal bigDecimalCompat = Money3.getBigDecimalCompat(asset.getOpenPrice());
                    BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(asset.getClosePrice());
                    Money highPrice = asset.getHighPrice();
                    BigDecimal bigDecimalCompat3 = null;
                    BigDecimal bigDecimalCompat4 = highPrice != null ? Money3.getBigDecimalCompat(highPrice) : null;
                    Money lowPrice = asset.getLowPrice();
                    if (lowPrice != null) {
                        bigDecimalCompat3 = Money3.getBigDecimalCompat(lowPrice);
                    }
                    BigDecimal volume = asset.getVolume();
                    Intrinsics.checkNotNull(instantPlusSeconds);
                    arrayList9.add(new CandlestickChartView.DataPoint(bigDecimalCompat, bigDecimalCompat2, bigDecimalCompat4, bigDecimalCompat3, volume, time5, instantPlusSeconds));
                }
                return new CandlestickChartView.ChartData(arrayList9, graphData.getRange(), null, 4, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CandlestickMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.graph.CandlestickMappersKt$groupDataPointsByDay$1 */
    /* synthetic */ class C183311 extends FunctionReferenceImpl implements Function2<LocalDate, LocalDate, Long> {
        public static final C183311 INSTANCE = new C183311();

        C183311() {
            super(2, LocalDates4.class, "daysUntil", "daysUntil(Ljava/time/LocalDate;Ljava/time/LocalDate;)J", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(LocalDate p0, LocalDate p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Long.valueOf(p0.until(p1, ChronoUnit.DAYS));
        }
    }

    /* compiled from: CandlestickMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.graph.CandlestickMappersKt$groupDataPointsByWeek$1 */
    /* synthetic */ class C183331 extends FunctionReferenceImpl implements Function2<LocalDate, LocalDate, Long> {
        public static final C183331 INSTANCE = new C183331();

        C183331() {
            super(2, LocalDates4.class, "weeksUntil", "weeksUntil(Ljava/time/LocalDate;Ljava/time/LocalDate;)J", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(LocalDate p0, LocalDate p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Long.valueOf(p0.until(p1, ChronoUnit.WEEKS));
        }
    }

    /* compiled from: CandlestickMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.graph.CandlestickMappersKt$groupDataPointsByMonth$1 */
    /* synthetic */ class C183321 extends FunctionReferenceImpl implements Function2<LocalDate, LocalDate, Long> {
        public static final C183321 INSTANCE = new C183321();

        C183321() {
            super(2, LocalDates4.class, "monthsUntil", "monthsUntil(Ljava/time/LocalDate;Ljava/time/LocalDate;)J", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(LocalDate p0, LocalDate p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Long.valueOf(p0.until(p1, ChronoUnit.MONTHS));
        }
    }

    private static final CandlestickChartView.ChartData groupDataPointsByDay(List<? extends DataPoint.Asset> list, GraphData graphData) {
        return groupDataPoints(list, graphData, C183311.INSTANCE);
    }

    private static final CandlestickChartView.ChartData groupDataPointsByWeek(List<? extends DataPoint.Asset> list, GraphData graphData) {
        return groupDataPoints(list, graphData, C183331.INSTANCE);
    }

    private static final CandlestickChartView.ChartData groupDataPointsByMonth(List<? extends DataPoint.Asset> list, GraphData graphData) {
        return groupDataPoints(list, graphData, C183321.INSTANCE);
    }

    private static final CandlestickChartView.ChartData groupDataPoints(List<? extends DataPoint.Asset> list, GraphData graphData, Function2<? super LocalDate, ? super LocalDate, Long> function2) {
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(0L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Instant time = ((DataPoint.Asset) obj).getTime(graphData.getInterval());
            ZoneOffset UTC = ZoneOffset.UTC;
            Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
            LocalDate localDate = Instants.toLocalDate(time, UTC);
            Intrinsics.checkNotNull(localDateOfEpochDay);
            Long lValueOf = Long.valueOf(function2.invoke(localDateOfEpochDay, localDate).longValue());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(combineDataPoints((List) it.next(), graphData.getInterval()));
        }
        return new CandlestickChartView.ChartData(arrayList2, arrayList2.size(), null, 4, null);
    }

    private static final Duration getDuration(List<? extends DataPoint> list, Historical.Interval interval) {
        if (interval.getDuration() != null) {
            return interval.getDuration();
        }
        if (list.size() < 2) {
            return null;
        }
        Duration durationBetween = Duration.between(list.get(0).getTime(interval), list.get(1).getTime(interval));
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween;
    }

    private static final CandlestickChartView.DataPoint combineDataPoints(List<? extends DataPoint.Asset> list, Historical.Interval interval) {
        Object next;
        Object next2;
        BigDecimal bigDecimal;
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Duration duration = getDuration(list, interval);
        Money openPrice = ((DataPoint.Asset) CollectionsKt.first((List) list)).getOpenPrice();
        Money closePrice = ((DataPoint.Asset) CollectionsKt.last((List) list)).getClosePrice();
        List<? extends DataPoint.Asset> list2 = list;
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Money moneySafeLowPrice = ((DataPoint.Asset) next).safeLowPrice();
                do {
                    Object next3 = it.next();
                    Money moneySafeLowPrice2 = ((DataPoint.Asset) next3).safeLowPrice();
                    if (moneySafeLowPrice.compareTo(moneySafeLowPrice2) > 0) {
                        next = next3;
                        moneySafeLowPrice = moneySafeLowPrice2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Money moneySafeLowPrice3 = next != null ? ((DataPoint.Asset) next).safeLowPrice() : null;
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                Money moneySafeHighPrice = ((DataPoint.Asset) next2).safeHighPrice();
                do {
                    Object next4 = it2.next();
                    Money moneySafeHighPrice2 = ((DataPoint.Asset) next4).safeHighPrice();
                    if (moneySafeHighPrice.compareTo(moneySafeHighPrice2) < 0) {
                        next2 = next4;
                        moneySafeHighPrice = moneySafeHighPrice2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        Money moneySafeHighPrice3 = next2 != null ? ((DataPoint.Asset) next2).safeHighPrice() : null;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            bigDecimal = null;
        } else {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((DataPoint.Asset) it3.next()).getVolume() != null) {
                    BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                    for (Object obj : list2) {
                        Intrinsics.checkNotNull(bigDecimalAdd);
                        BigDecimal ZERO = ((DataPoint.Asset) obj).getVolume();
                        if (ZERO == null) {
                            ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        }
                        bigDecimalAdd = bigDecimalAdd.add(ZERO);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    }
                    Intrinsics.checkNotNull(bigDecimalAdd);
                    bigDecimal = bigDecimalAdd;
                }
            }
            bigDecimal = null;
        }
        Instant time = ((DataPoint.Asset) CollectionsKt.first((List) list)).getTime(interval);
        Instant instantPlusSeconds = ((DataPoint.Asset) CollectionsKt.last((List) list)).getTime(interval).plusSeconds(duration != null ? duration.getSeconds() : 0L);
        BigDecimal bigDecimalCompat = Money3.getBigDecimalCompat(openPrice);
        BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(closePrice);
        BigDecimal bigDecimalCompat3 = moneySafeHighPrice3 != null ? Money3.getBigDecimalCompat(moneySafeHighPrice3) : null;
        BigDecimal bigDecimalCompat4 = moneySafeLowPrice3 != null ? Money3.getBigDecimalCompat(moneySafeLowPrice3) : null;
        Intrinsics.checkNotNull(instantPlusSeconds);
        return new CandlestickChartView.DataPoint(bigDecimalCompat, bigDecimalCompat2, bigDecimalCompat3, bigDecimalCompat4, bigDecimal, time, instantPlusSeconds);
    }
}
