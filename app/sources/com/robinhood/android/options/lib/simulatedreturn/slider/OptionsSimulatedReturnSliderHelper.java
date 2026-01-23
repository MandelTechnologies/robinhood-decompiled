package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionsSimulatedReturnSliderHelper.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001ai\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010 \u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"", "draggedPercentage", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "dragState", "", "pointerPosition", "rangeLength", "maxPointerPosition", "minPointerPosition", "snapDistance", "quotePosition", "Lkotlin/Pair;", "getPointerPositionPairBeforeAndAfterDrag", "(FLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lkotlin/Pair;", "", "frameIndex", "numOfFrames", "getPointerPositionInQuotePillAnimationProgress", "(IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;", "fineIncrementEnum", "j$/time/LocalDateTime", "currentSliderStart", "j$/time/LocalDate", "sliderInitialDate", "getTimeSliderSmallTickDateTimeBeforeCurrentSliderStart", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;Lj$/time/LocalDateTime;Lj$/time/LocalDate;)Lj$/time/LocalDateTime;", "j$/time/ZoneId", "zoneId", "currentSmallTickTime", "", "currentSmallTickTimeEpochSecond", "getTimeSliderSecondsUntilNextTick", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;Lj$/time/ZoneId;Lj$/time/LocalDateTime;J)J", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderHelperKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnSliderHelper {

    /* compiled from: OptionsSimulatedReturnSliderHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderHelperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedReturnTimeSliderDataState3.values().length];
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState3.FIVE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState3.ONE_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState3.THREE_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState3.ONE_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState3.SEVEN_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Tuples2<Double, Double> getPointerPositionPairBeforeAndAfterDrag(float f, OptionsSimulatedReturnSliderViewState2 dragState, Double d, Double d2, Double d3, Double d4, Double d5, Double d6) {
        Double dValueOf;
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        if (d == null || d2 == null || d3 == null || d4 == null || d5 == null || d6 == null) {
            dValueOf = d;
        } else {
            double dCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(d.doubleValue() - (f * d2.doubleValue()), d3.doubleValue()), d4.doubleValue());
            if (RangesKt.rangeTo(Math.min(d.doubleValue(), dCoerceAtLeast) - d5.doubleValue(), Math.max(d.doubleValue(), dCoerceAtLeast) + d5.doubleValue()).contains(d6) && dragState == OptionsSimulatedReturnSliderViewState2.FLINGING) {
                dCoerceAtLeast = d6.doubleValue();
            }
            dValueOf = Double.valueOf(dCoerceAtLeast);
        }
        return Tuples4.m3642to(d, dValueOf);
    }

    public static final Double getPointerPositionInQuotePillAnimationProgress(int i, int i2, Double d, Double d2, Double d3, Double d4) {
        if (d == null || d4 == null || d2 == null || d3 == null) {
            return null;
        }
        if (i != i2 - 1) {
            float f = i2;
            float f2 = i / f;
            float f3 = 1 / f;
            if (Math.abs(f2 - r0) >= 1.0E-5d) {
                return Double.valueOf(RangesKt.coerceAtLeast(RangesKt.coerceAtMost(d.doubleValue() + (((d4.doubleValue() - d.doubleValue()) / (r0 - f2)) * f3), d2.doubleValue()), d3.doubleValue()));
            }
        }
        return d4;
    }

    public static final LocalDateTime getTimeSliderSmallTickDateTimeBeforeCurrentSliderStart(OptionsSimulatedReturnTimeSliderDataState3 fineIncrementEnum, LocalDateTime currentSliderStart, LocalDate sliderInitialDate) {
        LocalDateTime localDateTimeWithMinute;
        Intrinsics.checkNotNullParameter(fineIncrementEnum, "fineIncrementEnum");
        Intrinsics.checkNotNullParameter(currentSliderStart, "currentSliderStart");
        Intrinsics.checkNotNullParameter(sliderInitialDate, "sliderInitialDate");
        int i = WhenMappings.$EnumSwitchMapping$0[fineIncrementEnum.ordinal()];
        if (i == 1) {
            localDateTimeWithMinute = currentSliderStart.withMinute(currentSliderStart.getMinute() - (currentSliderStart.getMinute() % 5));
        } else if (i == 2) {
            localDateTimeWithMinute = currentSliderStart.withMinute(0);
        } else if (i == 3) {
            localDateTimeWithMinute = currentSliderStart.withHour(currentSliderStart.getHour() - (currentSliderStart.getHour() % 3)).withMinute(0);
        } else if (i == 4) {
            localDateTimeWithMinute = currentSliderStart.withHour(0).withMinute(0);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDate localDateMo3394a = currentSliderStart.mo3394a();
            Intrinsics.checkNotNullExpressionValue(localDateMo3394a, "toLocalDate(...)");
            localDateTimeWithMinute = currentSliderStart.minusDays(sliderInitialDate.until(localDateMo3394a, ChronoUnit.DAYS) % 7).withHour(0).withMinute(0);
        }
        LocalDateTime localDateTimeWithNano = localDateTimeWithMinute.withSecond(0).withNano(0);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWithNano, "withNano(...)");
        return localDateTimeWithNano;
    }

    public static final long getTimeSliderSecondsUntilNextTick(OptionsSimulatedReturnTimeSliderDataState3 fineIncrementEnum, ZoneId zoneId, LocalDateTime currentSmallTickTime, long j) {
        long epochSecond;
        Intrinsics.checkNotNullParameter(fineIncrementEnum, "fineIncrementEnum");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(currentSmallTickTime, "currentSmallTickTime");
        int i = WhenMappings.$EnumSwitchMapping$0[fineIncrementEnum.ordinal()];
        if (i == 1) {
            return 300L;
        }
        if (i == 2) {
            return 3600L;
        }
        if (i != 3) {
            if (i == 4) {
                epochSecond = currentSmallTickTime.withHour(0).plusDays(1L).mo3396g(zoneId).toEpochSecond();
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                epochSecond = currentSmallTickTime.withHour(0).plusDays(7L).mo3396g(zoneId).toEpochSecond();
            }
        } else {
            if (currentSmallTickTime.plusHours(3L).getDayOfYear() == currentSmallTickTime.getDayOfYear()) {
                return 10800L;
            }
            epochSecond = currentSmallTickTime.withHour(0).plusDays(1L).mo3396g(zoneId).toEpochSecond();
        }
        return epochSecond - j;
    }
}
