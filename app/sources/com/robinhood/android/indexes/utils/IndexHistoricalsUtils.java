package com.robinhood.android.indexes.utils;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: IndexHistoricalsUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Lcom/robinhood/models/ui/Historical$Interval;", "getIndexHistoricalIntervalForOdp", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)Lcom/robinhood/models/ui/Historical$Interval;", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/Instant", "getIndexHistoricalStartTimeForOdp", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lj$/time/Clock;)Lj$/time/Instant;", "start", "getIndexHistoricalEndTimeForOdp", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lj$/time/Instant;)Lj$/time/Instant;", "lib-store-indexes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.utils.IndexHistoricalsUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexHistoricalsUtils {

    /* compiled from: IndexHistoricalsUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.indexes.utils.IndexHistoricalsUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Historical.Interval getIndexHistoricalIntervalForOdp(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                return Historical.Interval.FIVE_MINUTES;
            case 2:
                return Historical.Interval.TEN_MINUTES;
            case 3:
                return Historical.Interval.ONE_HOUR;
            case 4:
                return Historical.Interval.ONE_DAY;
            case 5:
                return Historical.Interval.ONE_DAY;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Instant getIndexHistoricalStartTimeForOdp(DisplaySpan displaySpan, Clock clock) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Instant instantNow = Instant.now(clock);
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                Intrinsics.checkNotNull(instantNow);
                Instant instantMinus = instantNow.minus((TemporalAmount) Days.m3991of(1));
                Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
                return instantMinus;
            case 2:
                Intrinsics.checkNotNull(instantNow);
                Instant instantMinus2 = instantNow.minus((TemporalAmount) Days.m3991of(7));
                Intrinsics.checkNotNullExpressionValue(instantMinus2, "minus(...)");
                return instantMinus2;
            case 3:
                Intrinsics.checkNotNull(instantNow);
                Instant instantMinus3 = instantNow.minus((TemporalAmount) Days.m3991of(30));
                Intrinsics.checkNotNullExpressionValue(instantMinus3, "minus(...)");
                return instantMinus3;
            case 4:
                Intrinsics.checkNotNull(instantNow);
                Instant instantMinus4 = instantNow.minus((TemporalAmount) Days.m3991of(90));
                Intrinsics.checkNotNullExpressionValue(instantMinus4, "minus(...)");
                return instantMinus4;
            case 5:
                Intrinsics.checkNotNull(instantNow);
                Instant instantMinus5 = instantNow.minus((TemporalAmount) Days.m3991of(365));
                Intrinsics.checkNotNullExpressionValue(instantMinus5, "minus(...)");
                return instantMinus5;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Instant getIndexHistoricalEndTimeForOdp(DisplaySpan displaySpan, Instant start) {
        Duration duration;
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Historical.Interval indexHistoricalIntervalForOdp = getIndexHistoricalIntervalForOdp(displaySpan);
        if (indexHistoricalIntervalForOdp == null || (duration = indexHistoricalIntervalForOdp.getDuration()) == null) {
            return null;
        }
        return start.plus((TemporalAmount) duration.multipliedBy(2L));
    }
}
