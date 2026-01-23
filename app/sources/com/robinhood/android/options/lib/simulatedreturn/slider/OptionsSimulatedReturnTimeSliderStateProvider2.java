package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.datetime.Instants;
import io.jsonwebtoken.Claims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;

/* compiled from: OptionsSimulatedReturnTimeSliderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\f\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aE\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0011\u0010\u0015\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"", "", "", "expTimeSecSorted", "roundToNearestPositionPin", "(DLjava/util/List;)Ljava/lang/Long;", "", "dte", "j$/time/Instant", "now", Claims.EXPIRATION, "j$/time/ZoneId", "zoneId", "getDisplayedTimestamp", "(DLjava/lang/Integer;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/ZoneId;Ljava/util/List;)J", "j$/time/LocalDateTime", "roundToNearestMinute", "(Lj$/time/LocalDateTime;)Lj$/time/LocalDateTime;", "roundToNearestQuarterHour", "roundToNearestHour", "roundToNearestThreeHourMark", "roundToNearestDay", "TIME_SLIDER_TICK_LABEL_OVERLAP_THRESHOLD", "I", "TIME_SLIDER_PIN_SNAP_COEFFICIENT", "D", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderStateProvider2 {
    public static final double TIME_SLIDER_PIN_SNAP_COEFFICIENT = 1.2d;
    public static final int TIME_SLIDER_TICK_LABEL_OVERLAP_THRESHOLD = 4;

    public static final Long roundToNearestPositionPin(double d, List<Long> expTimeSecSorted) {
        Intrinsics.checkNotNullParameter(expTimeSecSorted, "expTimeSecSorted");
        if (expTimeSecSorted.isEmpty()) {
            return null;
        }
        final Double dValueOf = Double.valueOf(d);
        int iBinarySearch = CollectionsKt.binarySearch(expTimeSecSorted, 0, expTimeSecSorted.size(), new Function1<Long, Integer>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderStateProviderKt$roundToNearestPositionPin$$inlined$binarySearchBy$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(Long l) {
                return Integer.valueOf(ComparisonsKt.compareValues(Double.valueOf(l.longValue()), dValueOf));
            }
        });
        if (iBinarySearch >= 0) {
            return expTimeSecSorted.get(iBinarySearch);
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        if (i2 == 0) {
            return (Long) CollectionsKt.first((List) expTimeSecSorted);
        }
        if (i2 == expTimeSecSorted.size()) {
            return (Long) CollectionsKt.last((List) expTimeSecSorted);
        }
        long jLongValue = expTimeSecSorted.get(i - 2).longValue();
        long jLongValue2 = expTimeSecSorted.get(i2).longValue();
        if (d - jLongValue > jLongValue2 - d) {
            jLongValue = jLongValue2;
        }
        return Long.valueOf(jLongValue);
    }

    public static final long getDisplayedTimestamp(double d, Integer num, Instant instant, Instant instant2, ZoneId zoneId, List<Long> expTimeSecSorted) {
        LocalDateTime localDateTimeRoundToNearestThreeHourMark;
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(expTimeSecSorted, "expTimeSecSorted");
        long jRoundToLong = MathKt.roundToLong(d);
        if (instant != null && instant.getEpochSecond() == jRoundToLong) {
            return jRoundToLong;
        }
        if (instant2 != null && instant2.getEpochSecond() == jRoundToLong) {
            return jRoundToLong;
        }
        Long lRoundToNearestPositionPin = roundToNearestPositionPin(d, expTimeSecSorted);
        Instant instantOfEpochSecond = Instant.ofEpochSecond(jRoundToLong);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        LocalDateTime localDateTime = Instants.toLocalDateTime(instantOfEpochSecond, zoneId);
        if ((num != null && num.intValue() == 0) || num == null) {
            localDateTimeRoundToNearestThreeHourMark = roundToNearestMinute(localDateTime);
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS().contains(num.intValue())) {
            localDateTimeRoundToNearestThreeHourMark = roundToNearestQuarterHour(localDateTime);
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getTWELVE_TO_THIRTY_FIVE_DAYS().contains(num.intValue())) {
            localDateTimeRoundToNearestThreeHourMark = roundToNearestHour(localDateTime);
        } else {
            localDateTimeRoundToNearestThreeHourMark = OptionsSimulatedReturnTimeSliderDataState4.getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS().contains(num.intValue()) ? roundToNearestThreeHourMark(localDateTime) : roundToNearestDay(localDateTime);
        }
        long epochSecond = localDateTimeRoundToNearestThreeHourMark.mo3396g(zoneId).toInstant().getEpochSecond();
        if (instant != null && epochSecond < instant.getEpochSecond()) {
            epochSecond = instant.getEpochSecond();
        } else if (instant2 != null && epochSecond > instant2.getEpochSecond()) {
            epochSecond = instant2.getEpochSecond();
        }
        return (lRoundToNearestPositionPin != null && Math.abs(d - ((double) lRoundToNearestPositionPin.longValue())) <= Math.abs(d - ((double) epochSecond)) * 1.2d) ? lRoundToNearestPositionPin.longValue() : epochSecond;
    }

    public static final LocalDateTime roundToNearestMinute(LocalDateTime localDateTime) {
        int minute;
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        int second = localDateTime.getSecond();
        if (second >= 0 && second < 30) {
            minute = localDateTime.getMinute();
        } else {
            minute = localDateTime.getMinute() + 1;
        }
        LocalDateTime localDateTimePlusMinutes = localDateTime.withMinute(0).withSecond(0).withNano(0).plusMinutes(minute);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusMinutes, "plusMinutes(...)");
        return localDateTimePlusMinutes;
    }

    public static final LocalDateTime roundToNearestQuarterHour(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        int minute = localDateTime.getMinute();
        LocalDateTime localDateTimePlusMinutes = localDateTime.withMinute(0).withSecond(0).withNano(0).plusMinutes((minute < 0 || minute >= 8) ? (8 > minute || minute >= 23) ? (23 > minute || minute >= 38) ? (38 > minute || minute >= 53) ? 60 : 45 : 30 : 15 : 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusMinutes, "plusMinutes(...)");
        return localDateTimePlusMinutes;
    }

    public static final LocalDateTime roundToNearestHour(LocalDateTime localDateTime) {
        int hour;
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        int minute = localDateTime.getMinute();
        if (minute >= 0 && minute < 30) {
            hour = localDateTime.getHour();
        } else {
            hour = localDateTime.getHour() + 1;
        }
        LocalDateTime localDateTimePlusHours = localDateTime.withHour(0).withMinute(0).withSecond(0).withNano(0).plusHours(hour);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusHours, "plusHours(...)");
        return localDateTimePlusHours;
    }

    public static final LocalDateTime roundToNearestThreeHourMark(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        int hour = (localDateTime.getHour() * 60) + localDateTime.getMinute();
        LocalDateTime localDateTimePlusMinutes = localDateTime.withHour(0).withMinute(0).withSecond(0).withNano(0).plusMinutes((hour < 0 || hour >= 90) ? (90 > hour || hour >= 270) ? (270 > hour || hour >= 450) ? (450 > hour || hour >= 630) ? (630 > hour || hour >= 810) ? (810 > hour || hour >= 990) ? (990 > hour || hour >= 1170) ? (1170 > hour || hour >= 1350) ? 1440 : 1260 : 1080 : 900 : 720 : 540 : 360 : EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusMinutes, "plusMinutes(...)");
        return localDateTimePlusMinutes;
    }

    public static final LocalDateTime roundToNearestDay(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        int hour = (localDateTime.getHour() * 60) + localDateTime.getMinute();
        LocalDateTime localDateTimePlusMinutes = localDateTime.withHour(0).withMinute(0).withSecond(0).withNano(0).plusMinutes((hour < 0 || hour >= 720) ? 1440 : 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusMinutes, "plusMinutes(...)");
        return localDateTimePlusMinutes;
    }
}
