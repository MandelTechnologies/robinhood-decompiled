package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.robinhood.utils.text.Capitalization;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.threeten.extra.Temporals;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.MonthDay;
import p479j$.time.Year;
import p479j$.time.YearMonth;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.format.TextStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;

/* compiled from: LocalDates.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a$\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001c\u0010\u0013\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0019\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001f\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000!*\u00020\u0000H\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u0014\u0010%\u001a\u00020\u0000*\u00020$H\u0086\b¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u0004\u0018\u00010\u0000*\u00020$¢\u0006\u0004\b'\u0010&\u001a\u001b\u0010)\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*\u001ai\u00107\u001a\u000206*\u00020\u00002\u0006\u0010,\u001a\u00020+2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000-2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u0002002\b\b\u0002\u00105\u001a\u000200H\u0007¢\u0006\u0004\b7\u00108\u001ao\u00107\u001a\u000206*\u00020\u00002\u0006\u0010,\u001a\u00020+2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000-2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u0002002\b\b\u0002\u00105\u001a\u0002002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b7\u0010;\"\u0015\u0010?\u001a\u00020<*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0015\u0010C\u001a\u00020@*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0015\u0010G\u001a\u00020D*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m3636d2 = {"j$/time/LocalDate", "j$/time/temporal/TemporalAccessor", "withoutYearIfCurrentYear", "(Lj$/time/LocalDate;)Lj$/time/temporal/TemporalAccessor;", "j$/time/LocalTime", "time", "j$/time/ZoneId", "zone", "j$/time/ZonedDateTime", "atTime", "(Lj$/time/LocalDate;Lj$/time/LocalTime;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;", "endDate", "", "daysUntil", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)J", "j$/time/Duration", "durationUntil", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)Lj$/time/Duration;", "weeksUntil", "monthsUntil", "previousWorkingDay", "(Lj$/time/LocalDate;)Lj$/time/LocalDate;", "nextWorkingDay", "endOfTheYear", "Lkotlin/sequences/Sequence;", "precedingWorkingDays", "(Lj$/time/LocalDate;)Lkotlin/sequences/Sequence;", "subsequentWorkingDays", "", "count", "minusWorkingDays", "(Lj$/time/LocalDate;I)Lj$/time/LocalDate;", "plusWorkingDays", "Lkotlin/ranges/ClosedRange;", "toClosedRange", "(Lj$/time/LocalDate;)Lkotlin/ranges/ClosedRange;", "", "toLocalDate", "(Ljava/lang/CharSequence;)Lj$/time/LocalDate;", "toLocalDateOrNull", "zoneId", "toEpochMillis", "(Lj$/time/LocalDate;Lj$/time/ZoneId;)J", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "formatter", "dateStringRes", "", "capitalize", "formatToday", "formatTomorrow", "formatYesterday", "formatThisWeek", "", "formatRecent", "(Lj$/time/LocalDate;Landroid/content/res/Resources;Lcom/robinhood/utils/datetime/format/TemporalFormatter;Ljava/lang/Integer;ZZZZZ)Ljava/lang/String;", "j$/time/Clock", Card.Icon.CLOCK, "(Lj$/time/LocalDate;Landroid/content/res/Resources;Lcom/robinhood/utils/datetime/format/TemporalFormatter;Ljava/lang/Integer;ZZZZZLj$/time/Clock;)Ljava/lang/String;", "j$/time/Year", "getTemporalYear", "(Lj$/time/LocalDate;)Lj$/time/Year;", "temporalYear", "j$/time/MonthDay", "getMonthDay", "(Lj$/time/LocalDate;)Lj$/time/MonthDay;", "monthDay", "j$/time/YearMonth", "getYearMonth", "(Lj$/time/LocalDate;)Lj$/time/YearMonth;", "yearMonth", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.datetime.LocalDatesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LocalDates4 {
    public static final Year getTemporalYear(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Year yearFrom = Year.from(localDate);
        Intrinsics.checkNotNullExpressionValue(yearFrom, "from(...)");
        return yearFrom;
    }

    public static final MonthDay getMonthDay(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        MonthDay monthDayFrom = MonthDay.from(localDate);
        Intrinsics.checkNotNullExpressionValue(monthDayFrom, "from(...)");
        return monthDayFrom;
    }

    public static final YearMonth getYearMonth(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        YearMonth yearMonthFrom = YearMonth.from(localDate);
        Intrinsics.checkNotNullExpressionValue(yearMonthFrom, "from(...)");
        return yearMonthFrom;
    }

    public static final TemporalAccessor withoutYearIfCurrentYear(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return Intrinsics.areEqual(getTemporalYear(localDate), Year.now()) ? getMonthDay(localDate) : localDate;
    }

    public static final ZonedDateTime atTime(LocalDate localDate, LocalTime time, ZoneId zone) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ZonedDateTime zonedDateTimeM3458of = ZonedDateTime.m3458of(localDate, time, zone);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeM3458of, "of(...)");
        return zonedDateTimeM3458of;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final long daysUntil(LocalDate localDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return localDate.until(endDate, ChronoUnit.DAYS);
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Duration durationUntil(LocalDate localDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Duration durationOfDays = Duration.ofDays(localDate.until(endDate, ChronoUnit.DAYS));
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        return durationOfDays;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final long weeksUntil(LocalDate localDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return localDate.until(endDate, ChronoUnit.WEEKS);
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final long monthsUntil(LocalDate localDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return localDate.until(endDate, ChronoUnit.MONTHS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate precedingWorkingDays$lambda$0(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWith = date.with(Temporals.previousWorkingDay());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        return localDateWith;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final LocalDate previousWorkingDay(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateWith = localDate.with(Temporals.previousWorkingDay());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        return localDateWith;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final LocalDate nextWorkingDay(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateWith = localDate.with(Temporals.nextWorkingDay());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        return localDateWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate subsequentWorkingDays$lambda$1(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWith = date.with(Temporals.nextWorkingDay());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        return localDateWith;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final LocalDate endOfTheYear(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        LocalDate localDateWith = localDate.with((TemporalField) chronoField, localDate.range(chronoField).getMaximum());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        return localDateWith;
    }

    public static final Sequence<LocalDate> precedingWorkingDays(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return SequencesKt.drop(SequencesKt.generateSequence(localDate, (Function1<? super LocalDate, ? extends LocalDate>) new Function1() { // from class: com.robinhood.utils.datetime.LocalDatesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalDates4.precedingWorkingDays$lambda$0((LocalDate) obj);
            }
        }), 1);
    }

    public static final Sequence<LocalDate> subsequentWorkingDays(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return SequencesKt.drop(SequencesKt.generateSequence(localDate, (Function1<? super LocalDate, ? extends LocalDate>) new Function1() { // from class: com.robinhood.utils.datetime.LocalDatesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalDates4.subsequentWorkingDays$lambda$1((LocalDate) obj);
            }
        }), 1);
    }

    public static final LocalDate minusWorkingDays(LocalDate localDate, int i) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        if (i < 0) {
            return plusWorkingDays(localDate, Math.abs(i));
        }
        return i > 0 ? (LocalDate) SequencesKt.first(SequencesKt.drop(precedingWorkingDays(localDate), i - 1)) : localDate;
    }

    public static final LocalDate plusWorkingDays(LocalDate localDate, int i) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        if (i < 0) {
            return minusWorkingDays(localDate, Math.abs(i));
        }
        return i > 0 ? (LocalDate) SequencesKt.first(SequencesKt.drop(subsequentWorkingDays(localDate), i - 1)) : localDate;
    }

    public static final Range2<LocalDate> toClosedRange(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return RangesKt.rangeTo(localDate, localDate);
    }

    public static final LocalDate toLocalDate(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        LocalDate localDate = LocalDate.parse(charSequence);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    public static final LocalDate toLocalDateOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        try {
            LocalDate localDate = LocalDate.parse(charSequence);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            return localDate;
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public static /* synthetic */ long toEpochMillis$default(LocalDate localDate, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toEpochMillis(localDate, zoneId);
    }

    public static final long toEpochMillis(LocalDate localDate, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return localDate.atStartOfDay(zoneId).toInstant().toEpochMilli();
    }

    @Deprecated
    @SuppressLint({"DefaultLocale"})
    public static final String formatRecent(LocalDate localDate, Resources resources, TemporalFormatter<? super LocalDate> formatter, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusDays = localDateNow.plusDays(-1L);
        LocalDate localDatePlusDays2 = localDateNow.plusDays(1L);
        ChronoLocalDate chronoLocalDatePlusDays = localDateNow.plusDays(7L);
        if (z4 && Intrinsics.areEqual(localDate, localDatePlusDays)) {
            string2 = resources.getString(C41827R.string.localdate_format_yesterday);
        } else if (z2 && Intrinsics.areEqual(localDate, localDateNow)) {
            string2 = resources.getString(C41827R.string.localdate_format_today);
        } else if (z3 && Intrinsics.areEqual(localDate, localDatePlusDays2)) {
            string2 = resources.getString(C41827R.string.localdate_format_tomorrow);
        } else {
            if (z5 && localDate.isBefore(chronoLocalDatePlusDays) && localDate.isAfter(localDateNow)) {
                String displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.DISPLAY));
                Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
                return displayName;
            }
            string2 = null;
        }
        if (string2 != null) {
            if (z) {
                return Capitalization.capitalizeFirstChar(string2, Locale.getDefault(Locale.Category.DISPLAY));
            }
            return Capitalization.decapitalizeFirstChar(string2, Locale.getDefault(Locale.Category.DISPLAY));
        }
        String str = formatter.format(localDate);
        if (num == null) {
            return str;
        }
        String string3 = resources.getString(num.intValue(), str);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static /* synthetic */ String formatRecent$default(LocalDate localDate, Resources resources, TemporalFormatter temporalFormatter, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Clock clock, int i, Object obj) {
        if ((i & 2) != 0) {
            temporalFormatter = LocalDateFormatter.MEDIUM;
        }
        TemporalFormatter temporalFormatter2 = temporalFormatter;
        if ((i & 4) != 0) {
            num = null;
        }
        return formatRecent(localDate, resources, temporalFormatter2, num, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? true : z4, (i & 128) != 0 ? false : z5, clock);
    }

    public static final String formatRecent(LocalDate localDate, Resources resources, TemporalFormatter<? super LocalDate> formatter, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Clock clock) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = LocalDate.now(clock);
        LocalDate localDatePlusDays = localDateNow.plusDays(-1L);
        LocalDate localDatePlusDays2 = localDateNow.plusDays(1L);
        ChronoLocalDate chronoLocalDatePlusDays = localDateNow.plusDays(7L);
        if (z4 && Intrinsics.areEqual(localDate, localDatePlusDays)) {
            string2 = resources.getString(C41827R.string.localdate_format_yesterday);
        } else if (z2 && Intrinsics.areEqual(localDate, localDateNow)) {
            string2 = resources.getString(C41827R.string.localdate_format_today);
        } else if (z3 && Intrinsics.areEqual(localDate, localDatePlusDays2)) {
            string2 = resources.getString(C41827R.string.localdate_format_tomorrow);
        } else {
            if (z5 && localDate.isBefore(chronoLocalDatePlusDays) && localDate.isAfter(localDateNow)) {
                String displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.DISPLAY));
                Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
                return displayName;
            }
            string2 = null;
        }
        if (string2 != null) {
            if (z) {
                return Capitalization.capitalizeFirstChar(string2, Locale.getDefault(Locale.Category.DISPLAY));
            }
            return Capitalization.decapitalizeFirstChar(string2, Locale.getDefault(Locale.Category.DISPLAY));
        }
        String str = formatter.format(localDate);
        if (num == null) {
            return str;
        }
        String string3 = resources.getString(num.intValue(), str);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
