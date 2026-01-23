package com.robinhood.android.options.lib.simulatedreturn.slider;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.datetime.Instants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionsSimulatedReturnTimeSliderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001c\u0010'\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010(\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001c\u0010)\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u001c\u0010*\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u001c\u0010+\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u001c\u0010,\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010%¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "ds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "getTicks", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "anchor", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "getQuotePillState", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "dataState", "reduce", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "", "timeEpochSecond", "", "formatBigTick", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;D)Ljava/lang/String;", "j$/time/LocalDateTime", "time", "formatSliderTooltipTime", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;Lj$/time/LocalDateTime;)Ljava/lang/String;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "getSliderTooltip", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "Landroid/content/res/Resources;", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "hourFormatter", "Lj$/time/format/DateTimeFormatter;", "shortDateShortYearFormatter", "shortDateFormatter", "dateTimeShortYearFormatter", "dateTimeFormatter", "dateShortTimeFormatter", "dateShortTimeShortYearFormatter", "dateShortYearFormatter", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderStateProvider implements StateProvider<OptionsSimulatedReturnTimeSliderDataState, OptionsSimulatedReturnSliderViewState> {
    public static final int $stable = 8;
    private final DateTimeFormatter dateShortTimeFormatter;
    private final DateTimeFormatter dateShortTimeShortYearFormatter;
    private final DateTimeFormatter dateShortYearFormatter;
    private final DateTimeFormatter dateTimeFormatter;
    private final DateTimeFormatter dateTimeShortYearFormatter;
    private final DateTimeFormatter hourFormatter;
    private final Resources resources;
    private final DateTimeFormatter shortDateFormatter;
    private final DateTimeFormatter shortDateShortYearFormatter;

    /* compiled from: OptionsSimulatedReturnTimeSliderStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionsSimulatedReturnTimeSliderDataState2.values().length];
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState2.ONE_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState2.TWELVE_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState2.ONE_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState2.SEVEN_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsSimulatedReturnTimeSliderDataState2.EIGHTY_FOUR_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionsSimulatedReturnSliderViewState3.values().length];
            try {
                iArr2[OptionsSimulatedReturnSliderViewState3.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionsSimulatedReturnSliderViewState3.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OptionsSimulatedReturnTimeSliderStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
        this.hourFormatter = DateTimeFormatter.ofPattern("h a");
        this.shortDateShortYearFormatter = DateTimeFormatter.ofPattern("M/d/yy");
        this.shortDateFormatter = DateTimeFormatter.ofPattern("M/d");
        this.dateTimeShortYearFormatter = DateTimeFormatter.ofPattern("MMM d ''yy, h:mm a");
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("MMM d, h:mm a");
        this.dateShortTimeFormatter = DateTimeFormatter.ofPattern("MMM d, h a");
        this.dateShortTimeShortYearFormatter = DateTimeFormatter.ofPattern("MMM d ''yy, h a");
        this.dateShortYearFormatter = DateTimeFormatter.ofPattern("MMM d ''yy");
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsSimulatedReturnSliderViewState reduce(OptionsSimulatedReturnTimeSliderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new OptionsSimulatedReturnSliderViewState(dataState.getShowEmptySlider(), dataState.getDragState(), dataState.getLaunchMode(), getQuotePillState(dataState, OptionsSimulatedReturnSliderViewState3.START), getQuotePillState(dataState, OptionsSimulatedReturnSliderViewState3.END), getTicks(dataState), getSliderTooltip(dataState), dataState.getSnappedPointerPosition(), dataState.getLoggingState());
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImmutableList<OptionsSimulatedReturnSliderViewState5> getTicks(OptionsSimulatedReturnTimeSliderDataState ds) throws Resources.NotFoundException {
        Double d;
        Double d2;
        double d3;
        OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState;
        if (ds.getSnappedPointerPosition() == null || ds.getRangeLength() == null || ds.getMinPointerPosition() == null || ds.getMaxPointerPosition() == null || ds.getFineIncrementEnum() == null || ds.getCoarseIncrementEnum() == null) {
            return extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList();
        Double snappedPointerPosition = ds.getSnappedPointerPosition();
        Double rangeLength = ds.getRangeLength();
        double d4 = 2;
        double dDoubleValue = snappedPointerPosition.doubleValue() - (rangeLength.doubleValue() / d4);
        double dDoubleValue2 = snappedPointerPosition.doubleValue() + (rangeLength.doubleValue() / d4);
        Instant instantOfEpochSecond = Instant.ofEpochSecond(MathKt.roundToLong(dDoubleValue));
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        LocalDateTime localDateTime = Instants.toLocalDateTime(instantOfEpochSecond, ds.getZoneId());
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(MathKt.roundToLong(ds.getMinPointerPosition().doubleValue()));
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        LocalDate localDate = Instants.toLocalDate(instantOfEpochSecond2, ds.getZoneId());
        LocalDateTime timeSliderSmallTickDateTimeBeforeCurrentSliderStart = OptionsSimulatedReturnSliderHelper.getTimeSliderSmallTickDateTimeBeforeCurrentSliderStart(ds.getFineIncrementEnum(), localDateTime, localDate);
        long epochSecond = timeSliderSmallTickDateTimeBeforeCurrentSliderStart.mo3396g(ds.getZoneId()).toInstant().getEpochSecond();
        while (true) {
            double d5 = epochSecond;
            if (d5 > dDoubleValue2) {
                Double d6 = snappedPointerPosition;
                Double d7 = rangeLength;
                double d8 = dDoubleValue;
                if (ds.getMinPointerPosition().doubleValue() >= d8) {
                    arrayList.add(new OptionsSimulatedReturnSliderViewState5.CurrentPriceTick((float) ((ds.getMinPointerPosition().doubleValue() - d8) / d7.doubleValue())));
                }
                if (ds.getMaxPointerPosition().doubleValue() <= dDoubleValue2) {
                    float fDoubleValue = (float) ((ds.getMaxPointerPosition().doubleValue() - d8) / d7.doubleValue());
                    String string2 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_pill_text_exp);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(new OptionsSimulatedReturnSliderViewState5.BigTick(fDoubleValue, string2));
                }
                Iterator<Long> it = ds.getExpTimeSecSorted().iterator();
                while (it.hasNext()) {
                    double dLongValue = it.next().longValue();
                    if (dLongValue >= d8 && dLongValue <= dDoubleValue2) {
                        arrayList.add(new OptionsSimulatedReturnSliderViewState5.PositionPin((float) ((dLongValue - d8) / d7.doubleValue()), dLongValue < d6.doubleValue()));
                    }
                }
                return extensions2.toImmutableList(arrayList);
            }
            if (d5 < dDoubleValue || d5 < ds.getMinPointerPosition().doubleValue() || d5 > ds.getMaxPointerPosition().doubleValue()) {
                d = snappedPointerPosition;
                d2 = rangeLength;
                d3 = dDoubleValue;
                optionsSimulatedReturnTimeSliderDataState = ds;
            } else {
                OptionsSimulatedReturnTimeSliderDataState2 coarseIncrementEnum = ds.getCoarseIncrementEnum();
                d = snappedPointerPosition;
                int i = coarseIncrementEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[coarseIncrementEnum.ordinal()];
                d2 = rangeLength;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                LocalDate localDateMo3394a = timeSliderSmallTickDateTimeBeforeCurrentSliderStart.mo3394a();
                                Intrinsics.checkNotNullExpressionValue(localDateMo3394a, "toLocalDate(...)");
                                if (localDate.until(localDateMo3394a, ChronoUnit.DAYS) % 7 != 0 || timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getHour() != 0) {
                                }
                            } else {
                                if (i != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                LocalDate localDateMo3394a2 = timeSliderSmallTickDateTimeBeforeCurrentSliderStart.mo3394a();
                                Intrinsics.checkNotNullExpressionValue(localDateMo3394a2, "toLocalDate(...)");
                                if (localDate.until(localDateMo3394a2, ChronoUnit.DAYS) % 84 != 0 || timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getHour() != 0) {
                                    d3 = dDoubleValue;
                                    optionsSimulatedReturnTimeSliderDataState = ds;
                                    arrayList.add(new OptionsSimulatedReturnSliderViewState5.SmallTick((float) ((d5 - d3) / d2.doubleValue())));
                                } else if (Math.abs(ds.getMaxPointerPosition().doubleValue() - d5) > ds.getFineIncrementEnum().getNumOfSec() * 4) {
                                    d3 = dDoubleValue;
                                    float fDoubleValue2 = (float) ((d5 - dDoubleValue) / d2.doubleValue());
                                    optionsSimulatedReturnTimeSliderDataState = ds;
                                    arrayList.add(new OptionsSimulatedReturnSliderViewState5.BigTick(fDoubleValue2, formatBigTick(optionsSimulatedReturnTimeSliderDataState, d5)));
                                }
                            }
                        } else if (timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getHour() == 0) {
                        }
                    } else if (timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getHour() == 0 || timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getHour() == 12) {
                    }
                } else if (timeSliderSmallTickDateTimeBeforeCurrentSliderStart.getMinute() == 0) {
                }
            }
            epochSecond += OptionsSimulatedReturnSliderHelper.getTimeSliderSecondsUntilNextTick(optionsSimulatedReturnTimeSliderDataState.getFineIncrementEnum(), optionsSimulatedReturnTimeSliderDataState.getZoneId(), timeSliderSmallTickDateTimeBeforeCurrentSliderStart, epochSecond);
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(epochSecond);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            timeSliderSmallTickDateTimeBeforeCurrentSliderStart = Instants.toLocalDateTime(instantOfEpochSecond3, optionsSimulatedReturnTimeSliderDataState.getZoneId());
            rangeLength = d2;
            snappedPointerPosition = d;
            dDoubleValue = d3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SliderQuotePillState getQuotePillState(OptionsSimulatedReturnTimeSliderDataState ds, OptionsSimulatedReturnSliderViewState3 anchor) throws Resources.NotFoundException {
        Double dValueOf;
        String str;
        if (ds.getSnappedPointerPosition() != null && ds.getRangeLength() != null && !ds.getShowEmptySlider()) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i = iArr[anchor.ordinal()];
            if (i == 1) {
                if (ds.getNow() != null) {
                    dValueOf = Double.valueOf(r2.getEpochSecond());
                }
                if (dValueOf != null) {
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dValueOf = ds.getExp() != null ? Double.valueOf(r2.getEpochSecond()) : null;
                if (dValueOf != null) {
                    double dDoubleValue = dValueOf.doubleValue();
                    if (ds.getNow() != null && ds.getExp() != null && ds.getNow().compareTo(ds.getExp()) > 0) {
                        return null;
                    }
                    double dDoubleValue2 = ds.getSnappedPointerPosition().doubleValue() - dDoubleValue;
                    int i2 = iArr[anchor.ordinal()];
                    if (i2 == 1) {
                        str = "< " + this.resources.getString(C23151R.string.options_simulated_return_time_slider_pill_text_now);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OptionsSimulatedReturnSliderLaunchMode.Time launchMode = ds.getLaunchMode();
                        if (launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) {
                            str = this.resources.getString(C23151R.string.options_simulated_return_time_slider_pill_text_last_exp) + " >";
                        } else {
                            if (!(launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.Default) && launchMode != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = this.resources.getString(C23151R.string.options_simulated_return_time_slider_pill_text_exp) + " >";
                        }
                    }
                    return new SliderQuotePillState(anchor, str, Math.abs(dDoubleValue2) > ds.getRangeLength().doubleValue() / ((double) 2));
                }
            }
        }
        return null;
    }

    public final String formatBigTick(OptionsSimulatedReturnTimeSliderDataState ds, double timeEpochSecond) {
        String str;
        LocalDateTime localDateTime;
        String str2;
        LocalDateTime localDateTime2;
        Intrinsics.checkNotNullParameter(ds, "ds");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(MathKt.roundToLong(timeEpochSecond));
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        LocalDateTime localDateTime3 = Instants.toLocalDateTime(instantOfEpochSecond, ds.getZoneId());
        Integer dte = ds.getDte();
        if (dte == null) {
            return "";
        }
        int iIntValue = dte.intValue();
        if (iIntValue == 0) {
            String str3 = this.hourFormatter.format(localDateTime3);
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        PrimitiveRanges2 one_to_eleven_days = OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS();
        int first = one_to_eleven_days.getFirst();
        if (iIntValue <= one_to_eleven_days.getLast() && first <= iIntValue) {
            if (localDateTime3.getHour() >= 12) {
                str2 = this.hourFormatter.format(localDateTime3);
            } else {
                Instant now = ds.getNow();
                str2 = (now == null || (localDateTime2 = Instants.toLocalDateTime(now, ds.getZoneId())) == null || localDateTime2.getYear() != localDateTime3.getYear()) ? this.shortDateShortYearFormatter.format(localDateTime3) : this.shortDateFormatter.format(localDateTime3);
            }
            Intrinsics.checkNotNull(str2);
            return str2;
        }
        Instant now2 = ds.getNow();
        if (now2 != null && (localDateTime = Instants.toLocalDateTime(now2, ds.getZoneId())) != null && localDateTime.getYear() == localDateTime3.getYear()) {
            str = this.shortDateFormatter.format(localDateTime3);
        } else {
            str = this.shortDateShortYearFormatter.format(localDateTime3);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final String formatSliderTooltipTime(OptionsSimulatedReturnTimeSliderDataState ds, LocalDateTime time) {
        Instant exp;
        Integer num;
        String str;
        String str2;
        LocalDateTime localDateTime;
        Intrinsics.checkNotNullParameter(ds, "ds");
        Intrinsics.checkNotNullParameter(time, "time");
        Instant now = ds.getNow();
        boolean z = true;
        boolean z2 = (now == null || (localDateTime = Instants.toLocalDateTime(now, ds.getZoneId())) == null || localDateTime.getYear() != time.getYear()) ? false : true;
        long epochSecond = time.mo3396g(ds.getZoneId()).toInstant().getEpochSecond();
        Instant now2 = ds.getNow();
        if ((now2 == null || now2.getEpochSecond() != epochSecond) && (((exp = ds.getExp()) == null || exp.getEpochSecond() != epochSecond) && (ds.getExpTimeSecToNumOfPositionsMap().get(Long.valueOf(epochSecond)) == null || ((num = ds.getExpTimeSecToNumOfPositionsMap().get(Long.valueOf(epochSecond))) != null && num.intValue() == 0)))) {
            z = false;
        }
        if (z2) {
            if (z) {
                String str3 = this.dateTimeFormatter.format(time);
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            }
            Integer dte = ds.getDte();
            if ((dte != null && dte.intValue() == 0) || dte == null || OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS().contains(dte.intValue())) {
                str2 = this.dateTimeFormatter.format(time);
            } else {
                str2 = (OptionsSimulatedReturnTimeSliderDataState4.getTWELVE_TO_THIRTY_FIVE_DAYS().contains(dte.intValue()) || OptionsSimulatedReturnTimeSliderDataState4.getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS().contains(dte.intValue())) ? this.dateShortTimeFormatter.format(time) : this.dateShortYearFormatter.format(time);
            }
            Intrinsics.checkNotNull(str2);
            return str2;
        }
        if (z) {
            String str4 = this.dateTimeShortYearFormatter.format(time);
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return str4;
        }
        Integer dte2 = ds.getDte();
        if ((dte2 != null && dte2.intValue() == 0) || dte2 == null || OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS().contains(dte2.intValue())) {
            str = this.dateTimeShortYearFormatter.format(time);
        } else {
            str = (OptionsSimulatedReturnTimeSliderDataState4.getTWELVE_TO_THIRTY_FIVE_DAYS().contains(dte2.intValue()) || OptionsSimulatedReturnTimeSliderDataState4.getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS().contains(dte2.intValue())) ? this.dateShortTimeShortYearFormatter.format(time) : this.dateShortYearFormatter.format(time);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final SliderTooltip getSliderTooltip(OptionsSimulatedReturnTimeSliderDataState ds) throws Resources.NotFoundException {
        Integer numValueOf;
        String string2;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getSnappedPointerPosition() == null) {
            return new SliderTooltip("-", "-", "-", "", "");
        }
        long displayedTimestamp = OptionsSimulatedReturnTimeSliderStateProvider2.getDisplayedTimestamp(ds.getSnappedPointerPosition().doubleValue(), ds.getDte(), ds.getNow(), ds.getExp(), ds.getZoneId(), ds.getExpTimeSecSorted());
        Instant instantOfEpochSecond = Instant.ofEpochSecond(displayedTimestamp);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        LocalDateTime localDateTime = Instants.toLocalDateTime(instantOfEpochSecond, ds.getZoneId());
        Instant exp = ds.getExp();
        if (exp != null) {
            LocalDate localDateMo3394a = localDateTime.mo3394a();
            Intrinsics.checkNotNullExpressionValue(localDateMo3394a, "toLocalDate(...)");
            numValueOf = Integer.valueOf((int) localDateMo3394a.until(Instants.toLocalDate(exp, ds.getZoneId()), ChronoUnit.DAYS));
        } else {
            numValueOf = null;
        }
        if (ds.getShowEmptySlider()) {
            string2 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_empty_primary_text);
        } else {
            string2 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_primary_text, formatSliderTooltipTime(ds, localDateTime), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), numValueOf, null, 2, null));
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        Integer num = ds.getExpTimeSecToNumOfPositionsMap().get(Long.valueOf(displayedTimestamp));
        String string3 = "";
        if (!ds.getShowEmptySlider()) {
            Instant now = ds.getNow();
            if (now != null && now.getEpochSecond() == displayedTimestamp) {
                string3 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_secondary_text_current_time);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            } else if ((ds.getLaunchMode() instanceof OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) && num != null && num.intValue() > 0) {
                string3 = this.resources.getQuantityString(C23151R.plurals.f4729xe0c4f9ec, num.intValue(), num);
                Intrinsics.checkNotNullExpressionValue(string3, "getQuantityString(...)");
            } else {
                Instant exp2 = ds.getExp();
                if (exp2 != null && exp2.getEpochSecond() == displayedTimestamp) {
                    string3 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_secondary_text_expiration);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                } else {
                    OptionsSimulatedReturnSliderLaunchMode.Time launchMode = ds.getLaunchMode();
                    if (!(launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer)) {
                        if (!(launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.Default) && launchMode != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string3 = this.resources.getString(C23151R.string.options_simulated_return_time_slider_secondary_text_time);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    }
                }
            }
        }
        String str2 = string3;
        return new SliderTooltip(str, str, str, str2, str2);
    }
}
