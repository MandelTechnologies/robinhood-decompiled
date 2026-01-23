package com.robinhood.android.futures.assethome.microgram;

import com.robinhood.android.models.futures.p189db.FuturesIntervalPerformanceDataPoint;
import com.robinhood.android.models.futures.p189db.FuturesTradeDate;
import com.robinhood.android.models.futures.p189db.UiFuturesIntervalPerformance;
import com.robinhood.ceres.p284v1.SpanDto;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.rosetta.common.DateDto;
import futures_asset_home.proto.p462v1.DisplaySpanDto;
import futures_asset_home.proto.p462v1.FuturesIntervalDataPointDto;
import futures_asset_home.proto.p462v1.FuturesIntervalPerformanceDto;
import futures_asset_home.proto.p462v1.GetFuturesIntervalPerformanceResponseDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdlExtentions.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u000b0\tH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000¨\u0006\u0012"}, m3636d2 = {"toSpanDto", "Lcom/robinhood/ceres/v1/SpanDto;", "Lfutures_asset_home/proto/v1/DisplaySpanDto;", "toDisplaySpanDto", "Lcom/robinhood/models/ui/Historical$Span;", "toFuturesIntervalDto", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "Lcom/robinhood/models/ui/Historical$Interval;", "toFuturesIntervalDataPointDto", "", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "Lcom/robinhood/android/models/futures/db/FuturesIntervalPerformanceDataPoint;", "toDateDto", "Lcom/robinhood/rosetta/common/DateDto;", "Lcom/robinhood/android/models/futures/db/FuturesTradeDate;", "toGetFuturesIntervalPerformanceResponseDto", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/android/models/futures/db/UiFuturesIntervalPerformance;", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.microgram.IdlExtentionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class IdlExtentions {

    /* compiled from: IdlExtentions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.assethome.microgram.IdlExtentionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DisplaySpanDto.values().length];
            try {
                iArr[DisplaySpanDto.WEEK_SPAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpanDto.MONTH_SPAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpanDto.THREE_MONTH_SPAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpanDto.YTD_SPAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpanDto.YEAR_SPAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpanDto.ALL_SPAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpanDto.SPAN_UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Historical.Span.values().length];
            try {
                iArr2[Historical.Span.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Historical.Span.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Historical.Span.THREE_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Historical.Span.YTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Historical.Span.YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Historical.Span.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Historical.Span.HOUR.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Historical.Span.DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Historical.Span.FIVE_YEARS.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Historical.Interval.values().length];
            try {
                iArr3[Historical.Interval.ONE_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[Historical.Interval.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[Historical.Interval.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[Historical.Interval.ONE_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[Historical.Interval.THIRTY_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[Historical.Interval.TEN_MINUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[Historical.Interval.FIVE_MINUTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[Historical.Interval.FIFTEEN_SECONDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Historical.Interval.ALL_LOCAL_ONLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SpanDto toSpanDto(DisplaySpanDto displaySpanDto) {
        Intrinsics.checkNotNullParameter(displaySpanDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpanDto.ordinal()]) {
            case 1:
                return SpanDto.SPAN_1W;
            case 2:
                return SpanDto.SPAN_1M;
            case 3:
                return SpanDto.SPAN_3M;
            case 4:
                return SpanDto.SPAN_YTD;
            case 5:
                return SpanDto.SPAN_1Y;
            case 6:
                return SpanDto.SPAN_ALL;
            case 7:
                return SpanDto.SPAN_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final DisplaySpanDto toDisplaySpanDto(Historical.Span span) {
        Intrinsics.checkNotNullParameter(span, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[span.ordinal()]) {
            case 1:
                return DisplaySpanDto.WEEK_SPAN;
            case 2:
                return DisplaySpanDto.MONTH_SPAN;
            case 3:
                return DisplaySpanDto.THREE_MONTH_SPAN;
            case 4:
                return DisplaySpanDto.YTD_SPAN;
            case 5:
                return DisplaySpanDto.YEAR_SPAN;
            case 6:
                return DisplaySpanDto.ALL_SPAN;
            case 7:
            case 8:
            case 9:
                return DisplaySpanDto.SPAN_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto toFuturesIntervalDto(Historical.Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[interval.ordinal()]) {
            case 1:
                return FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.DAY_INTERVAL;
            case 2:
                return FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.WEEK_INTERVAL;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalArgumentException(interval + " is not a valid interval for futures performance");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<FuturesIntervalDataPointDto> toFuturesIntervalDataPointDto(List<FuturesIntervalPerformanceDataPoint> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<FuturesIntervalPerformanceDataPoint> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (FuturesIntervalPerformanceDataPoint futuresIntervalPerformanceDataPoint : list2) {
            long epochMilli = futuresIntervalPerformanceDataPoint.getStartTime().toEpochMilli();
            long epochMilli2 = futuresIntervalPerformanceDataPoint.getEndTime().toEpochMilli();
            double openPnl = futuresIntervalPerformanceDataPoint.getOpenPnl();
            FuturesTradeDate startTradeDate = futuresIntervalPerformanceDataPoint.getStartTradeDate();
            DateDto dateDto = null;
            DateDto dateDto2 = startTradeDate != null ? toDateDto(startTradeDate) : null;
            FuturesTradeDate endTradeDate = futuresIntervalPerformanceDataPoint.getEndTradeDate();
            if (endTradeDate != null) {
                dateDto = toDateDto(endTradeDate);
            }
            arrayList.add(new FuturesIntervalDataPointDto(epochMilli, epochMilli2, openPnl, dateDto2, dateDto));
        }
        return arrayList;
    }

    private static final DateDto toDateDto(FuturesTradeDate futuresTradeDate) {
        return new DateDto(futuresTradeDate.getYear(), futuresTradeDate.getMonth(), futuresTradeDate.getDay());
    }

    public static final GetFuturesIntervalPerformanceResponseDto toGetFuturesIntervalPerformanceResponseDto(UiFuturesIntervalPerformance uiFuturesIntervalPerformance) {
        Intrinsics.checkNotNullParameter(uiFuturesIntervalPerformance, "<this>");
        return new GetFuturesIntervalPerformanceResponseDto(new FuturesIntervalPerformanceDto(toFuturesIntervalDto(uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getInterval()), toDisplaySpanDto(uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getSpan()), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getOpenPnl(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getDayPnl(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getTotalPnl(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getNetReturn(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getCommission(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().getExchangeFees(), uiFuturesIntervalPerformance.getFuturesIntervalPerformance().isMarketOpen(), toFuturesIntervalDataPointDto(uiFuturesIntervalPerformance.getFuturesIntervalPerformanceDataPoints())));
    }
}
