package androidx.core.i18n;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.retirement.contributions.ContributionReviewModeKt;
import com.singular.sdk.internal.Constants;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: DateTimeFormatterSkeletonOptions.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 (2\u00020\u0001:\r)(*+,-./01234Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u00065"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;", "era", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;", "year", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;", "day", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;", "weekDay", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;", "period", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;", "hour", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;", "minute", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;", "second", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;", "fractionalSecond", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;", "timezone", "<init>", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;", "Companion", "Builder", "Day", "Era", "FractionalSecond", "Hour", "Minute", "Month", "Period", "Second", "Timezone", "WeekDay", ContributionReviewModeKt.YearTestTag, "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DateTimeFormatterSkeletonOptions {
    private static final String TAG;
    private static final Pattern pattern;
    private final Day day;
    private final Era era;
    private final FractionalSecond fractionalSecond;
    private final Hour hour;
    private final Minute minute;
    private final Month month;
    private final Period period;
    private final Second second;
    private final Timezone timezone;
    private final WeekDay weekDay;
    private final Year year;

    public DateTimeFormatterSkeletonOptions(Era era, Year year, Month month, Day day, WeekDay weekDay, Period period, Hour hour, Minute minute, Second second, FractionalSecond fractionalSecond, Timezone timezone) {
        Intrinsics.checkNotNullParameter(era, "era");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(weekDay, "weekDay");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(hour, "hour");
        Intrinsics.checkNotNullParameter(minute, "minute");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(fractionalSecond, "fractionalSecond");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.era = era;
        this.year = year;
        this.month = month;
        this.day = day;
        this.weekDay = weekDay;
        this.period = period;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.fractionalSecond = fractionalSecond;
        this.timezone = timezone;
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Era {
        private final String value;

        @JvmField
        public static final Era WIDE = new Era("GGGG");

        @JvmField
        public static final Era ABBREVIATED = new Era("G");

        @JvmField
        public static final Era NARROW = new Era("GGGGG");

        @JvmField
        public static final Era NONE = new Era("");

        private Era(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Year {
        private final String value;

        @JvmField
        public static final Year NUMERIC = new Year("y");

        @JvmField
        public static final Year TWO_DIGITS = new Year("yy");

        @JvmField
        public static final Year NONE = new Year("");

        private Year(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Month {
        private final String value;

        @JvmField
        public static final Month WIDE = new Month("MMMM");

        @JvmField
        public static final Month ABBREVIATED = new Month("MMM");

        @JvmField
        public static final Month NARROW = new Month("MMMMM");

        @JvmField
        public static final Month NUMERIC = new Month("M");

        @JvmField
        public static final Month TWO_DIGITS = new Month("MM");

        @JvmField
        public static final Month NONE = new Month("");

        private Month(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Day {
        private final String value;

        @JvmField
        public static final Day NUMERIC = new Day("d");

        @JvmField
        public static final Day TWO_DIGITS = new Day("dd");

        @JvmField
        public static final Day NONE = new Day("");

        private Day(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class WeekDay {
        private final String value;

        @JvmField
        public static final WeekDay WIDE = new WeekDay("EEEE");

        @JvmField
        public static final WeekDay ABBREVIATED = new WeekDay("E");

        @JvmField
        public static final WeekDay SHORT = new WeekDay("EEEEEE");

        @JvmField
        public static final WeekDay NARROW = new WeekDay("EEEEE");

        @JvmField
        public static final WeekDay NONE = new WeekDay("");

        private WeekDay(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Period {
        private final String value;

        @JvmField
        public static final Period WIDE = new Period("aaaa");

        @JvmField
        public static final Period ABBREVIATED = new Period(Constants.RequestParamsKeys.DEVELOPER_API_KEY);

        @JvmField
        public static final Period NARROW = new Period("aaaaa");

        @JvmField
        public static final Period FLEXIBLE = new Period("B");

        @JvmField
        public static final Period NONE = new Period("");

        private Period(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Hour {
        private final String value;

        @JvmField
        public static final Hour NUMERIC = new Hour("j");

        @JvmField
        public static final Hour TWO_DIGITS = new Hour("jj");

        @JvmField
        public static final Hour FORCE_12H_NUMERIC = new Hour("h");

        @JvmField
        public static final Hour FORCE_12H_TWO_DIGITS = new Hour("hh");

        @JvmField
        public static final Hour FORCE_24H_NUMERIC = new Hour("H");

        @JvmField
        public static final Hour FORCE_24H_TWO_DIGITS = new Hour("HH");

        @JvmField
        public static final Hour NONE = new Hour("");

        private Hour(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Minute {
        private final String value;

        @JvmField
        public static final Minute NUMERIC = new Minute("m");

        @JvmField
        public static final Minute TWO_DIGITS = new Minute("mm");

        @JvmField
        public static final Minute NONE = new Minute("");

        private Minute(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Second {
        private final String value;

        @JvmField
        public static final Second NUMERIC = new Second(Constants.RequestParamsKeys.SESSION_ID_KEY);

        @JvmField
        public static final Second TWO_DIGITS = new Second("ss");

        @JvmField
        public static final Second NONE = new Second("");

        private Second(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class FractionalSecond {
        private final String value;

        @JvmField
        public static final FractionalSecond NUMERIC_3_DIGITS = new FractionalSecond("SSS");

        @JvmField
        public static final FractionalSecond NUMERIC_2_DIGITS = new FractionalSecond("SS");

        @JvmField
        public static final FractionalSecond NUMERIC_1_DIGIT = new FractionalSecond("S");

        @JvmField
        public static final FractionalSecond NONE = new FractionalSecond("");

        private FractionalSecond(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Timezone {
        private final String value;

        @JvmField
        public static final Timezone SHORT = new Timezone("z");

        @JvmField
        public static final Timezone LONG = new Timezone("zzzz");

        @JvmField
        public static final Timezone SHORT_OFFSET = new Timezone("O");

        @JvmField
        public static final Timezone LONG_OFFSET = new Timezone("OOOO");

        @JvmField
        public static final Timezone SHORT_GENERIC = new Timezone("v");

        @JvmField
        public static final Timezone LONG_GENERIC = new Timezone("vvvv");

        @JvmField
        public static final Timezone NONE = new Timezone("");

        private Timezone(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public String toString() {
        return this.era.getValue() + this.year.getValue() + this.month.getValue() + this.weekDay.getValue() + this.day.getValue() + this.period.getValue() + this.hour.getValue() + this.minute.getValue() + this.second.getValue() + this.fractionalSecond.getValue() + this.timezone.getValue();
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        pattern = Pattern.compile("(G+)|(y+)|(M+)|(d+)|(E+)|(a+)|(B+)|(j+)|(h+)|(H+)|(m+)|(s+)|(S+)|(z+)|(O+)|(v+)");
        TAG = Reflection.getOrCreateKotlinClass(companion.getClass()).getQualifiedName();
    }

    /* compiled from: DateTimeFormatterSkeletonOptions.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00103¨\u00064"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;", "era", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;", "year", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;", "day", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;", "weekDay", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;", "period", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;", "hour", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;", "minute", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;", "second", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;", "fractionalSecond", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;", "timezone", "<init>", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;)V", "setYear", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "setMonth", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "setDay", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "setPeriod", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "setHour", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "setMinute", "(Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Builder;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "build", "()Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Era;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Year;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Month;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Day;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$WeekDay;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Period;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Hour;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Minute;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Second;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$FractionalSecond;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions$Timezone;", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Builder {
        private Day day;
        private Era era;
        private FractionalSecond fractionalSecond;
        private Hour hour;
        private Minute minute;
        private Month month;
        private Period period;
        private Second second;
        private Timezone timezone;
        private WeekDay weekDay;
        private Year year;

        public Builder(Era era, Year year, Month month, Day day, WeekDay weekDay, Period period, Hour hour, Minute minute, Second second, FractionalSecond fractionalSecond, Timezone timezone) {
            Intrinsics.checkNotNullParameter(era, "era");
            Intrinsics.checkNotNullParameter(year, "year");
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(day, "day");
            Intrinsics.checkNotNullParameter(weekDay, "weekDay");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(hour, "hour");
            Intrinsics.checkNotNullParameter(minute, "minute");
            Intrinsics.checkNotNullParameter(second, "second");
            Intrinsics.checkNotNullParameter(fractionalSecond, "fractionalSecond");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            this.era = era;
            this.year = year;
            this.month = month;
            this.day = day;
            this.weekDay = weekDay;
            this.period = period;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.fractionalSecond = fractionalSecond;
            this.timezone = timezone;
        }

        public /* synthetic */ Builder(Era era, Year year, Month month, Day day, WeekDay weekDay, Period period, Hour hour, Minute minute, Second second, FractionalSecond fractionalSecond, Timezone timezone, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Era.NONE : era, (i & 2) != 0 ? Year.NONE : year, (i & 4) != 0 ? Month.NONE : month, (i & 8) != 0 ? Day.NONE : day, (i & 16) != 0 ? WeekDay.NONE : weekDay, (i & 32) != 0 ? Period.NONE : period, (i & 64) != 0 ? Hour.NONE : hour, (i & 128) != 0 ? Minute.NONE : minute, (i & 256) != 0 ? Second.NONE : second, (i & 512) != 0 ? FractionalSecond.NONE : fractionalSecond, (i & 1024) != 0 ? Timezone.NONE : timezone);
        }

        public final Builder setYear(Year year) {
            Intrinsics.checkNotNullParameter(year, "year");
            this.year = year;
            return this;
        }

        public final Builder setMonth(Month month) {
            Intrinsics.checkNotNullParameter(month, "month");
            this.month = month;
            return this;
        }

        public final Builder setDay(Day day) {
            Intrinsics.checkNotNullParameter(day, "day");
            this.day = day;
            return this;
        }

        public final Builder setPeriod(Period period) {
            Intrinsics.checkNotNullParameter(period, "period");
            this.period = period;
            return this;
        }

        public final Builder setHour(Hour hour) {
            Intrinsics.checkNotNullParameter(hour, "hour");
            this.hour = hour;
            return this;
        }

        public final Builder setMinute(Minute minute) {
            Intrinsics.checkNotNullParameter(minute, "minute");
            this.minute = minute;
            return this;
        }

        public final DateTimeFormatterSkeletonOptions build() {
            return new DateTimeFormatterSkeletonOptions(this.era, this.year, this.month, this.day, this.weekDay, this.period, this.hour, this.minute, this.second, this.fractionalSecond, this.timezone);
        }
    }
}
