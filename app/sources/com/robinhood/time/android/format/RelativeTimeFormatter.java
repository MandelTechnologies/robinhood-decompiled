package com.robinhood.time.android.format;

import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.TimeUnit;
import com.robinhood.time.android.C41649R;
import com.robinhood.utils.datetime.PeriodDurations2;
import com.robinhood.utils.datetime.format.DayOfWeekFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.threeten.extra.PeriodDuration;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: RelativeTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/time/android/format/RelativeTimeFormatter;", "", "<init>", "()V", "", "duration", "j$/time/temporal/ChronoUnit", "timeUnit", "j$/time/LocalDate", "startDate", "Landroid/icu/text/MeasureFormat$FormatWidth;", "width", "", "format", "(JLj$/time/temporal/ChronoUnit;Lj$/time/LocalDate;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;", "Landroid/content/res/Resources;", "resources", "Lorg/threeten/extra/PeriodDuration;", "Lkotlin/Function2;", "formatter", "withBestTimeUnit", "(Landroid/content/res/Resources;Lorg/threeten/extra/PeriodDuration;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "formatNarrow", "(Landroid/content/res/Resources;Lorg/threeten/extra/PeriodDuration;Lj$/time/LocalDate;)Ljava/lang/String;", "formatShort", "formatWide", "Landroid/icu/util/MeasureUnit;", "getMeasureUnit", "(Lj$/time/temporal/ChronoUnit;)Landroid/icu/util/MeasureUnit;", "measureUnit", "Formatter", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RelativeTimeFormatter {
    public static final RelativeTimeFormatter INSTANCE = new RelativeTimeFormatter();

    /* compiled from: RelativeTimeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChronoUnit.WEEKS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MeasureFormat.FormatWidth.values().length];
            try {
                iArr2[MeasureFormat.FormatWidth.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MeasureFormat.FormatWidth.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MeasureFormat.FormatWidth.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MeasureFormat.FormatWidth.NUMERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private RelativeTimeFormatter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasureUnit getMeasureUnit(ChronoUnit chronoUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[chronoUnit.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                TimeUnit SECOND = MeasureUnit.SECOND;
                Intrinsics.checkNotNullExpressionValue(SECOND, "SECOND");
                return SECOND;
            case 5:
                TimeUnit MINUTE = MeasureUnit.MINUTE;
                Intrinsics.checkNotNullExpressionValue(MINUTE, "MINUTE");
                return MINUTE;
            case 6:
                TimeUnit HOUR = MeasureUnit.HOUR;
                Intrinsics.checkNotNullExpressionValue(HOUR, "HOUR");
                return HOUR;
            case 7:
                TimeUnit DAY = MeasureUnit.DAY;
                Intrinsics.checkNotNullExpressionValue(DAY, "DAY");
                return DAY;
            case 8:
                TimeUnit WEEK = MeasureUnit.WEEK;
                Intrinsics.checkNotNullExpressionValue(WEEK, "WEEK");
                return WEEK;
            case 9:
                TimeUnit MONTH = MeasureUnit.MONTH;
                Intrinsics.checkNotNullExpressionValue(MONTH, "MONTH");
                return MONTH;
            case 10:
                TimeUnit YEAR = MeasureUnit.YEAR;
                Intrinsics.checkNotNullExpressionValue(YEAR, "YEAR");
                return YEAR;
            default:
                throw new IllegalArgumentException(chronoUnit.name() + " is not a supported ChronoUnit");
        }
    }

    private final String format(long duration, ChronoUnit timeUnit, LocalDate startDate, MeasureFormat.FormatWidth width) {
        Formatter formatter;
        int i = WhenMappings.$EnumSwitchMapping$1[width.ordinal()];
        if (i == 1) {
            formatter = Formatter.WideFormatter.INSTANCE;
        } else if (i == 2) {
            formatter = Formatter.ShortFormatter.INSTANCE;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Unsupported width");
            }
            formatter = Formatter.NarrowFormatter.INSTANCE;
        }
        if (timeUnit == ChronoUnit.DAYS) {
            DayOfWeekFormatter dayOfWeekFormatter = formatter.getDayOfWeekFormatter();
            DayOfWeek dayOfWeek = startDate.getDayOfWeek();
            Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
            return dayOfWeekFormatter.format(dayOfWeek);
        }
        if (timeUnit == ChronoUnit.MONTHS || (timeUnit == ChronoUnit.WEEKS && duration >= 4)) {
            return formatter.getMonthFormatter().format(startDate);
        }
        return timeUnit == ChronoUnit.YEARS ? formatter.getYearFormatter().format(startDate) : formatter.format(duration, timeUnit);
    }

    private final String withBestTimeUnit(Resources resources, PeriodDuration duration, Function2<? super Long, ? super ChronoUnit, String> formatter) throws Resources.NotFoundException {
        PeriodDuration periodDurationNormalizedYears = duration.normalizedStandardDays().normalizedYears();
        Ref.LongRef longRef = new Ref.LongRef();
        ChronoUnit chronoUnit = ChronoUnit.YEARS;
        if (withBestTimeUnit$toTemp(periodDurationNormalizedYears.get(chronoUnit), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), chronoUnit);
        }
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (withBestTimeUnit$toTemp(periodDurationNormalizedYears.get(chronoUnit2), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), chronoUnit2);
        }
        Intrinsics.checkNotNull(periodDurationNormalizedYears);
        if (withBestTimeUnit$toTemp(PeriodDurations2.getWeeks(periodDurationNormalizedYears), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), ChronoUnit.WEEKS);
        }
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        if (withBestTimeUnit$toTemp(periodDurationNormalizedYears.get(chronoUnit3), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), chronoUnit3);
        }
        if (withBestTimeUnit$toTemp(PeriodDurations2.getHours(periodDurationNormalizedYears), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), ChronoUnit.HOURS);
        }
        if (withBestTimeUnit$toTemp(PeriodDurations2.getMinutes(periodDurationNormalizedYears), longRef) >= 1) {
            return formatter.invoke(Long.valueOf(longRef.element), ChronoUnit.MINUTES);
        }
        String string2 = resources.getString(C41649R.string.time_just_now_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final long withBestTimeUnit$toTemp(long j, Ref.LongRef longRef) {
        longRef.element = j;
        return j;
    }

    @JvmStatic
    public static final String formatNarrow(Resources resources, PeriodDuration duration, final LocalDate startDate) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return INSTANCE.withBestTimeUnit(resources, duration, new Function2() { // from class: com.robinhood.time.android.format.RelativeTimeFormatter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RelativeTimeFormatter.formatNarrow$lambda$0(startDate, ((Long) obj).longValue(), (ChronoUnit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatNarrow$lambda$0(LocalDate localDate, long j, ChronoUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return INSTANCE.format(j, timeUnit, localDate, MeasureFormat.FormatWidth.NARROW);
    }

    @JvmStatic
    public static final String formatShort(Resources resources, PeriodDuration duration, final LocalDate startDate) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return INSTANCE.withBestTimeUnit(resources, duration, new Function2() { // from class: com.robinhood.time.android.format.RelativeTimeFormatter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RelativeTimeFormatter.formatShort$lambda$1(startDate, ((Long) obj).longValue(), (ChronoUnit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatShort$lambda$1(LocalDate localDate, long j, ChronoUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return INSTANCE.format(j, timeUnit, localDate, MeasureFormat.FormatWidth.SHORT);
    }

    @JvmStatic
    public static final String formatWide(Resources resources, PeriodDuration duration, final LocalDate startDate) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return INSTANCE.withBestTimeUnit(resources, duration, new Function2() { // from class: com.robinhood.time.android.format.RelativeTimeFormatter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RelativeTimeFormatter.formatWide$lambda$2(startDate, ((Long) obj).longValue(), (ChronoUnit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatWide$lambda$2(LocalDate localDate, long j, ChronoUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return INSTANCE.format(j, timeUnit, localDate, MeasureFormat.FormatWidth.WIDE);
    }

    /* compiled from: RelativeTimeFormatter.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter;", "", "<init>", "()V", "", "duration", "j$/time/temporal/ChronoUnit", "timeUnit", "", "format", "(JLj$/time/temporal/ChronoUnit;)Ljava/lang/String;", "Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "getDayOfWeekFormatter", "()Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "dayOfWeekFormatter", "Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "getMonthFormatter", "()Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "monthFormatter", "getYearFormatter", "yearFormatter", "Landroid/icu/text/MeasureFormat$FormatWidth;", "getWidth", "()Landroid/icu/text/MeasureFormat$FormatWidth;", "width", "NarrowFormatter", "ShortFormatter", "WideFormatter", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$NarrowFormatter;", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$ShortFormatter;", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$WideFormatter;", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static abstract class Formatter {
        public /* synthetic */ Formatter(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract DayOfWeekFormatter getDayOfWeekFormatter();

        public abstract LocalDateFormatter getMonthFormatter();

        public abstract MeasureFormat.FormatWidth getWidth();

        public abstract LocalDateFormatter getYearFormatter();

        private Formatter() {
        }

        public final String format(long duration, ChronoUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            return DurationFormatter2.formatMeasure(new Measure(Long.valueOf(duration), RelativeTimeFormatter.INSTANCE.getMeasureUnit(timeUnit)), getWidth());
        }

        /* compiled from: RelativeTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$NarrowFormatter;", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter;", "<init>", "()V", "dayOfWeekFormatter", "Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "getDayOfWeekFormatter", "()Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "monthFormatter", "Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "getMonthFormatter", "()Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "yearFormatter", "getYearFormatter", "width", "Landroid/icu/text/MeasureFormat$FormatWidth;", "getWidth", "()Landroid/icu/text/MeasureFormat$FormatWidth;", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NarrowFormatter extends Formatter {
            public static final NarrowFormatter INSTANCE = new NarrowFormatter();
            private static final DayOfWeekFormatter dayOfWeekFormatter = DayOfWeekFormatter.MEDIUM;
            private static final LocalDateFormatter monthFormatter = LocalDateFormatter.MEDIUM_NO_YEAR;
            private static final LocalDateFormatter yearFormatter = LocalDateFormatter.MEDIUM;
            private static final MeasureFormat.FormatWidth width = MeasureFormat.FormatWidth.NARROW;

            private NarrowFormatter() {
                super(null);
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public DayOfWeekFormatter getDayOfWeekFormatter() {
                return dayOfWeekFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getMonthFormatter() {
                return monthFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getYearFormatter() {
                return yearFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public MeasureFormat.FormatWidth getWidth() {
                return width;
            }
        }

        /* compiled from: RelativeTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$ShortFormatter;", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter;", "<init>", "()V", "dayOfWeekFormatter", "Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "getDayOfWeekFormatter", "()Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "monthFormatter", "Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "getMonthFormatter", "()Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "yearFormatter", "getYearFormatter", "width", "Landroid/icu/text/MeasureFormat$FormatWidth;", "getWidth", "()Landroid/icu/text/MeasureFormat$FormatWidth;", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShortFormatter extends Formatter {
            public static final ShortFormatter INSTANCE = new ShortFormatter();
            private static final DayOfWeekFormatter dayOfWeekFormatter = DayOfWeekFormatter.LONG;
            private static final LocalDateFormatter monthFormatter = LocalDateFormatter.LONG_WITH_OPTIONAL_YEAR;
            private static final LocalDateFormatter yearFormatter = LocalDateFormatter.LONG;
            private static final MeasureFormat.FormatWidth width = MeasureFormat.FormatWidth.SHORT;

            private ShortFormatter() {
                super(null);
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public DayOfWeekFormatter getDayOfWeekFormatter() {
                return dayOfWeekFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getMonthFormatter() {
                return monthFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getYearFormatter() {
                return yearFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public MeasureFormat.FormatWidth getWidth() {
                return width;
            }
        }

        /* compiled from: RelativeTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter$WideFormatter;", "Lcom/robinhood/time/android/format/RelativeTimeFormatter$Formatter;", "<init>", "()V", "dayOfWeekFormatter", "Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "getDayOfWeekFormatter", "()Lcom/robinhood/utils/datetime/format/DayOfWeekFormatter;", "monthFormatter", "Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "getMonthFormatter", "()Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "yearFormatter", "getYearFormatter", "width", "Landroid/icu/text/MeasureFormat$FormatWidth;", "getWidth", "()Landroid/icu/text/MeasureFormat$FormatWidth;", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class WideFormatter extends Formatter {
            public static final WideFormatter INSTANCE = new WideFormatter();
            private static final DayOfWeekFormatter dayOfWeekFormatter = DayOfWeekFormatter.LONG;
            private static final LocalDateFormatter monthFormatter = LocalDateFormatter.LONG_WITH_OPTIONAL_YEAR;
            private static final LocalDateFormatter yearFormatter = LocalDateFormatter.LONG;
            private static final MeasureFormat.FormatWidth width = MeasureFormat.FormatWidth.WIDE;

            private WideFormatter() {
                super(null);
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public DayOfWeekFormatter getDayOfWeekFormatter() {
                return dayOfWeekFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getMonthFormatter() {
                return monthFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public LocalDateFormatter getYearFormatter() {
                return yearFormatter;
            }

            @Override // com.robinhood.time.android.format.RelativeTimeFormatter.Formatter
            public MeasureFormat.FormatWidth getWidth() {
                return width;
            }
        }
    }
}
