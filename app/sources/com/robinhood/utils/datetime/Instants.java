package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import org.threeten.extra.Minutes;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: Instants.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001c\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0019H\u0087\b¢\u0006\u0004\b\u001f\u0010\u001c\u001a\u0014\u0010 \u001a\u00020\u0019*\u00020\u0000H\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010#\u001a\u00020\"*\u00020\u0000H\u0086\b¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010\u0016\u001a\u00020\u0019*\u00020\u00002\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010&\u001a\"\u0010(\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0000H\u0086\b¢\u0006\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"j$/time/Instant", "j$/time/ZoneId", "zone", "j$/time/ZonedDateTime", "toZonedDateTime", "(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;", "j$/time/LocalDateTime", "toLocalDateTime", "(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/LocalDateTime;", "j$/time/LocalDate", "toLocalDate", "(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/LocalDate;", "j$/time/LocalTime", "toLocalTime", "(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/LocalTime;", "endInstant", "j$/time/Duration", "until", "(Lj$/time/Instant;Lj$/time/Instant;)Lj$/time/Duration;", "untilNow", "(Lj$/time/Instant;)Lj$/time/Duration;", "", "daysUntil", "(Lj$/time/Instant;Lj$/time/Instant;)J", "hoursUntil", "", "days", "plusDays", "(Lj$/time/Instant;I)Lj$/time/Instant;", "minusDays", "minutes", "minusMinutes", "daysUntilNow", "(Lj$/time/Instant;)I", "", "weeksUntilNow", "(Lj$/time/Instant;)D", "endDate", "(Lj$/time/Instant;Lj$/time/LocalDate;)I", "other", AnalyticsStrings.MAX_WELCOME_TAG, "(Lj$/time/Instant;Lj$/time/Instant;)Lj$/time/Instant;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class Instants {
    public static final ZonedDateTime toZonedDateTime(Instant instant, ZoneId zone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, zone);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant, "ofInstant(...)");
        return zonedDateTimeOfInstant;
    }

    public static /* synthetic */ ZonedDateTime toZonedDateTime$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toZonedDateTime(instant, zoneId);
    }

    public static final LocalDateTime toLocalDateTime(Instant instant, ZoneId zone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, zone);
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(...)");
        return localDateTimeOfInstant;
    }

    public static /* synthetic */ LocalDateTime toLocalDateTime$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toLocalDateTime(instant, zoneId);
    }

    public static final LocalDate toLocalDate(Instant instant, ZoneId zone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        LocalDate localDate = toLocalDateTime(instant, zone).mo3394a();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    public static /* synthetic */ LocalDate toLocalDate$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toLocalDate(instant, zoneId);
    }

    public static final LocalTime toLocalTime(Instant instant, ZoneId zone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        LocalTime localTime = toLocalDateTime(instant, zone).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        return localTime;
    }

    public static /* synthetic */ LocalTime toLocalTime$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toLocalTime(instant, zoneId);
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Duration until(Instant instant, Instant endInstant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(endInstant, "endInstant");
        Duration durationBetween = Duration.between(instant, endInstant);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Duration untilNow(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        Duration durationBetween = Duration.between(instant, instantNow);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final long daysUntil(Instant instant, Instant endInstant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(endInstant, "endInstant");
        return instant.until(endInstant, ChronoUnit.DAYS);
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final long hoursUntil(Instant instant, Instant endInstant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(endInstant, "endInstant");
        return instant.until(endInstant, ChronoUnit.HOURS);
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Instant plusDays(Instant instant, int i) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant instantPlus = instant.plus((TemporalAmount) Days.m3991of(i));
        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        return instantPlus;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Instant minusDays(Instant instant, int i) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant instantMinus = instant.minus((TemporalAmount) Days.m3991of(i));
        Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
        return instantMinus;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Instant minusMinutes(Instant instant, int i) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant instantMinus = instant.minus((TemporalAmount) Minutes.m3992of(i));
        Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
        return instantMinus;
    }

    public static final int daysUntilNow(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return daysUntil(instant, localDateNow);
    }

    public static final double weeksUntilNow(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullExpressionValue(Instant.now(), "now(...)");
        return instant.until(r0, ChronoUnit.DAYS) / 7.0d;
    }

    public static final int daysUntil(Instant instant, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).mo3459a();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return (int) localDate.until(endDate, ChronoUnit.DAYS);
    }

    public static final Instant max(Instant instant, Instant instant2) {
        if (instant == null && instant2 == null) {
            return null;
        }
        return (instant != null || instant2 == null) ? ((instant == null || instant2 != null) && (instant == null || instant2 == null || instant.compareTo(instant2) < 0)) ? instant2 : instant : instant2;
    }
}
