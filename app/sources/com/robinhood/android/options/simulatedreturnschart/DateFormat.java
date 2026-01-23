package com.robinhood.android.options.simulatedreturnschart;

import com.robinhood.android.gold.contracts.GoldFeature;
import io.jsonwebtoken.Claims;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Converters4;
import kotlinx.datetime.Instant;
import kotlinx.datetime.TimeZoneJvm2;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: DateFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a(\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a0\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u000e"}, m3636d2 = {"getTimeString", "", GoldFeature.INSTANT, "Lkotlinx/datetime/Instant;", "timezone", "Lkotlinx/datetime/TimeZone;", "isUkOrApac", "", "getDateString", "showYear", "getMonthString", "getTimestampString", "now", Claims.EXPIRATION, "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturnschart.DateFormatKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DateFormat {
    public static final String getTimeString(Instant instant, TimeZoneJvm2 timezone, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(instant, "instant");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        ZonedDateTime zonedDateTimeAtZone = Converters4.toJavaInstant(instant).atZone(Converters4.toJavaZoneId(timezone));
        if (z) {
            str = "HH";
        } else {
            str = "h a";
        }
        String str2 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern(str));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static final String getDateString(Instant instant, TimeZoneJvm2 timezone, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        ZonedDateTime zonedDateTimeAtZone = Converters4.toJavaInstant(instant).atZone(Converters4.toJavaZoneId(timezone));
        if (z && z2) {
            String str = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (z) {
            String str2 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("M/d/yy"));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (z2) {
            String str3 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("dd/MM"));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        String str4 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("M/d"));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        return str4;
    }

    public static final String getMonthString(Instant instant, TimeZoneJvm2 timezone) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        String str = Converters4.toJavaInstant(instant).atZone(Converters4.toJavaZoneId(timezone)).format(DateTimeFormatter.ofPattern("MMM ''yy"));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String getTimestampString(Instant instant, Instant now, Instant exp, TimeZoneJvm2 timezone, boolean z) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(instant, "instant");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(exp, "exp");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        ZonedDateTime zonedDateTimeAtZone = Converters4.toJavaInstant(instant).atZone(Converters4.toJavaZoneId(timezone));
        ZonedDateTime zonedDateTimeAtZone2 = Converters4.toJavaInstant(now).atZone(Converters4.toJavaZoneId(timezone));
        ZonedDateTime zonedDateTimeAtZone3 = Converters4.toJavaInstant(exp).atZone(Converters4.toJavaZoneId(timezone));
        long jM17020getIntervalLRDsOJo = Intervals.m17020getIntervalLRDsOJo(exp.m28850minus5sfh64U(now));
        Duration.Companion companion = Duration.INSTANCE;
        boolean z2 = Duration.m28727compareToLRDsOJo(jM17020getIntervalLRDsOJo, Duration3.toDuration(1, DurationUnitJvm.DAYS)) < 0;
        String str3 = "";
        if (z2 && z) {
            str = ", HH:mm";
        } else {
            str = z2 ? ", h:mm a" : "";
        }
        String str4 = zonedDateTimeAtZone2.getYear() != zonedDateTimeAtZone.getYear() ? " ''yy" : "";
        if (Intrinsics.areEqual(instant, now)) {
            str2 = "Now";
        } else if (z) {
            str2 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("d MMM" + str4 + str));
        } else {
            str2 = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("MMM d" + str4 + str));
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ZonedDateTime zonedDateTimeTruncatedTo = zonedDateTimeAtZone2.truncatedTo(chronoUnit);
        ZonedDateTime zonedDateTimeTruncatedTo2 = zonedDateTimeAtZone3.truncatedTo(chronoUnit);
        ZonedDateTime zonedDateTimeTruncatedTo3 = zonedDateTimeAtZone.truncatedTo(chronoUnit);
        String str5 = Intrinsics.areEqual(instant, exp) ? " (Exp)" : "";
        if (!Intrinsics.areEqual(zonedDateTimeTruncatedTo, zonedDateTimeTruncatedTo2) && str5.length() == 0) {
            str3 = " (" + chronoUnit.between(zonedDateTimeTruncatedTo3, zonedDateTimeTruncatedTo2) + " DTE)";
        }
        return str2 + str3 + str5;
    }
}
